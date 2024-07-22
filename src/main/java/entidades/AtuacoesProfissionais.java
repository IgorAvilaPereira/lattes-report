package entidades;

import java.util.ArrayList;

import org.w3c.dom.Document;

public class AtuacoesProfissionais {
    private ArrayList<AtuacaoProfissional> vetAtuacaoProfissional;

    // TODO: fazer o carregando...
    public AtuacoesProfissionais(Document doc) {
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

    

}
