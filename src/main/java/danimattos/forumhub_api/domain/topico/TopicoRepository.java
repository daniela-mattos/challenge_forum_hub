package danimattos.forumhub_api.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    @Query("""
            SELECT t FROM Topico t
            WHERE t.titulo = :titulo
    """
    )
    Optional<Topico> buscaTopico(String titulo);

    @Query("""
            SELECT t FROM Topico t
            WHERE t.mensagem = :mensagem
    """
    )
    Optional<Topico> buscaMensagem(String mensagem);
}
