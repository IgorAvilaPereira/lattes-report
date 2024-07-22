package entidades;

public class AtuacaoProfissional {
    private String nomeInstituicao;
    private String vinculo;

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
    public String getVinculo() {
        return vinculo;
    }
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    @Override
    public String toString() {
        return "AtuacaoProfissional [nomeInstituicao=" + nomeInstituicao + ", vinculo=" + vinculo + "]";
    }

    
    
}
