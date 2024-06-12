package danimattos.forumhub_api.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosCriaTopico(@NotBlank String titulo,
                              @NotBlank String mensagem,
                              @NotBlank LocalDate data,
                              @NotBlank String autor,
                              @NotBlank Curso curso) {
}
