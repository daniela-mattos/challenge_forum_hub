package danimattos.forumhub_api.domain.topico;

import java.time.LocalDate;

public record DadosDetalhaTopico(Long id,
                                 String titulo,
                                 String mensagem,
                                 LocalDate data,
                                 String autor,
                                 Curso curso,
                                 boolean respondido
) {
    public DadosDetalhaTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData(),
                topico.getAutor(),
                topico.getCurso(),
                topico.isRespondido());
    }
}
