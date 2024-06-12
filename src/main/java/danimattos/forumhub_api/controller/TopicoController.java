package danimattos.forumhub_api.controller;

import danimattos.forumhub_api.domain.topico.DadosCriaTopico;
import danimattos.forumhub_api.domain.topico.DadosDetalhaTopico;
import danimattos.forumhub_api.domain.topico.Topico;
import danimattos.forumhub_api.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
        repository.save(new Topico(dados));
    }

    @GetMapping
    public Page<DadosDetalhaTopico> listar(@PageableDefault Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosDetalhaTopico::new);
    }
}
