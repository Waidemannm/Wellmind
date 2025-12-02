package br.com.fiap.to;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FeedbackTO {
    private Long idFeedback;
    @NotNull
    private Long idUsuario;
    @NotBlank
    private String mensagem;

    public FeedbackTO(){

    }

    public FeedbackTO(Long idFeedback, Long idUsuario, String mensagem) {
        this.idFeedback = idFeedback;
        this.idUsuario = idUsuario;
        this.mensagem = mensagem;
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
