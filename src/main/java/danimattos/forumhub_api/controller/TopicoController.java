package danimattos.forumhub_api.controller;

import danimattos.forumhub_api.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void criar(@RequestBody DadosCriaTopico dados) {
        validaEntradas(dados.titulo(), dados.mensagem());
        repository.save(new Topico(dados));
    }

    @GetMapping
    public Page<DadosDetalhaTopico> listar(@PageableDefault Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosDetalhaTopico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaTopico dados) {
        validaId(dados.id());
        var topico = repository.getReferenceById(dados.id());
        validaEntradas(dados.titulo(), dados.mensagem());
        topico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        validaId(id);
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        validaId(id);
        var topico = repository.getReferenceById(id);

        return ResponseEntity.ok(new DadosDetalhaTopico(topico));
    }

    private void validaEntradas(String titulo, String mensagem) {
        var topicoExiste = repository.buscaTopico(titulo);
        var mensagemExiste = repository.buscaMensagem(mensagem);
        if (topicoExiste.isPresent()) {
            throw new ValidacaoException("Tópico já existe!");
        }
        if (mensagemExiste.isPresent()) {
            throw new ValidacaoException("Dúvida já exposta em tópico existente!");
        }
    }

    private void validaId(Long id) {
        if(!repository.existsById(id)) {
            throw new ValidacaoException("Id de tópico não existe!");
        }
    }

}
