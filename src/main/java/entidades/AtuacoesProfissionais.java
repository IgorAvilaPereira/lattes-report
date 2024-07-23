package entidades;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class AtuacoesProfissionais {
    private ArrayList<AtuacaoProfissional> vetAtuacaoProfissional;

    public AtuacoesProfissionais(){
        this.vetAtuacaoProfissional = new ArrayList<>();
    }

    // TODO: fazer o carregando...
    public AtuacoesProfissionais(Document doc) {
        this();
        // NodeList nodeListAtuacao = doc.getElementsByTagName("ATUACAO-PROFISSIONAL");        
        // for
            NodeList nodeList = doc.getElementsByTagName("VINCULOS");        
            for (int i = 0; i < nodeList.getLength(); i++) {
                try {
                    AtuacaoProfissional atuacaoProfissional = new AtuacaoProfissional();
                    atuacaoProfissional.setNomeInstituicao(null);
                    atuacaoProfissional.setVinculo(nodeList.item(i).getAttributes().getNamedItem("OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO").getTextContent() + ". "+nodeList.item(i).getAttributes().getNamedItem("OUTRAS-INFORMACOES").getTextContent());                
                    this.vetAtuacaoProfissional.add(atuacaoProfissional);
                    // System.out.println("1"+nodeList.item(i).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent());
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        // NodeList nodeList =
        // doc.getElementsByTagName("ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU");
        // try {
        // this.ensinoFundamental =
        // nodeList.item(0).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
        // } catch (Exception e) {
        // }

        // nodeList = doc.getElementsByTagName("ENSINO-MEDIO-SEGUNDO-GRAU");
        // try {
        // this.ensinoMedio =
        // nodeList.item(0).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
        // } catch (Exception e) {
        // }

        // nodeList = doc.getElementsByTagName("CURSO-TECNICO-PROFISSIONALIZANTE");
        // for (int i = 0; i < nodeList.getLength(); i++) {
        // try {
        // vetTecnico.add(((nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent()
        // == null ||
        // nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent().isBlank()
        // ||
        // nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent().isEmpty())
        // ?
        // nodeList.item(i).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent()
        // :
        // nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent()));
        // } catch (Exception e) {
        // }
        // }
        // nodeList = doc.getElementsByTagName("GRADUACAO");
        // for (int i = 0; i < nodeList.getLength(); i++) {
        // try {
        // vetGraduacao.add(nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent());
        // } catch (Exception e) {
        // }
        // }
        // nodeList = doc.getElementsByTagName("MESTRADO");
        // for (int i = 0; i < nodeList.getLength(); i++) {
        // try {
        // vetMestrado.add(nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent());
        // } catch (Exception e) {
        // }
        // }
        // nodeList = doc.getElementsByTagName("DOUTORADO");
        // for (int i = 0; i < nodeList.getLength(); i++) {
        // try {
        // vetDoutorado.add(nodeList.item(i).getAttributes().getNamedItem("NOME-CURSO").getTextContent());
        // } catch (Exception e) {
        // }
        // }
    }

    public ArrayList<AtuacaoProfissional> getVetAtuacaoProfissional() {
        return vetAtuacaoProfissional;
    }

    public void setVetAtuacaoProfissional(ArrayList<AtuacaoProfissional> vetAtuacaoProfissional) {
        this.vetAtuacaoProfissional = vetAtuacaoProfissional;
    }

    @Override
    public String toString() {
        return "AtuacoesProfissionais [vetAtuacaoProfissional=" + vetAtuacaoProfissional + "]";
    }

    
    

}
