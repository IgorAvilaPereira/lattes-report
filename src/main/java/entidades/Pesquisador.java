package entidades;

import java.util.ArrayList;

public class Pesquisador {
    private final String nome;
    private String paisDeNascimento;  
    private String resumoCV;    
    private String outrasInformacoesRelevantes;
    private EnderecoProfissional enderecoProfissional;
    private FormacaoAcademica formacaoAcademica;
  
    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public EnderecoProfissional getEnderecoProfissional() {
        return enderecoProfissional;
    }

    public void setEnderecoProfissional(EnderecoProfissional enderecoProfissional) {
        this.enderecoProfissional = enderecoProfissional;
    }

    public String getOutrasInformacoesRelevantes() {
        return outrasInformacoesRelevantes;
    }

    public void setOutrasInformacoesRelevantes(String outrasInformacoesRelevantes) {
        this.outrasInformacoesRelevantes = outrasInformacoesRelevantes;
    }

    private final ArrayList<ProducaoBibliografica> producoesBibliograficas;

    public Pesquisador(String nome){
        this.producoesBibliograficas = new ArrayList<>();
        this.nome = nome;
    }

    public void addProducao(ProducaoBibliografica producaoBibliografica){
        this.producoesBibliograficas.add(producaoBibliografica);
    }

    public ArrayList<ProducaoBibliografica> getProducoesBibliograficas() {
        return producoesBibliograficas;
    }

    public String getNome(){
        return this.nome;
    }

    public String getPaisDeNascimento() {
        return paisDeNascimento;
    }

    public void setPaisDeNascimento(String paisDeNascimento) {
        this.paisDeNascimento = paisDeNascimento;
    }

    public String getResumoCV() {
        return resumoCV;
    }

    public void setResumoCV(String resumoCV) {
        this.resumoCV = resumoCV;
    }

    @Override
    public String toString() {
        return "Pesquisador [nome=" + nome + ", paisDeNascimento=" + paisDeNascimento + ", resumoCV=" + resumoCV
                + ", outrasInformacoesRelevantes=" + outrasInformacoesRelevantes + ", enderecoProfissional="
                + enderecoProfissional + ", formacaoAcademica=" + formacaoAcademica + ", producoesBibliograficas="
                + producoesBibliograficas + "]";
    }

    



}
