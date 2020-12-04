package classes;

import forms.FrmAvancado;

import forms.FrmProgresso;
import java.io.File;
import javax.swing.JList;
import javax.swing.JProgressBar;

/**
 *
 * @author Anderson Felipe Schneider <hactar@universo.univates.br>
 */
public class TResizeImages implements Runnable {

    private boolean state = true;
    private FrmProgresso objFrmProgresso;
    private FrmAvancado objFrmAvancado;

    File[] arquivos;

    public TResizeImages(FrmAvancado frmAvancado, File[] imagens) {
        this.objFrmAvancado = frmAvancado;
        this.arquivos = imagens;
    }

    @Override
    public void run() {
        //Prepara a janela que mostrará o progresso do processamento
        this.objFrmProgresso = new FrmProgresso();
        objFrmProgresso.setTResizeImages(this);

        objFrmProgresso.setVisible(true);

        JProgressBar objProgressBar = this.objFrmProgresso.getProgressBar();
        objProgressBar.setMinimum(0);

        if (arquivos != null) {
            //Seta O total de registros na barra de progresso
            objProgressBar.setMaximum(arquivos.length);

            for (int i = 0; i < arquivos.length && this.state; i++) {
                File imagem = arquivos[i];

                //Pega o nome da imagem com extensão
                String imageName = imagem.getName();
                //Pega a extensão da imagem
                String imageExtension = imageName.substring(imageName.length() - 4);
                //Remove a extensão da imagem e salva em imageName
                imageName = imageName.substring(0, imageName.length() - 4);

                ImageResize.resizeImage(imagem, 800, imagem.getParent() + File.separator + imageName + "_800" + imageExtension);

                objProgressBar.setValue(i);

                if (!objFrmAvancado.getTfMarca().isEmpty()) {
                    imagem = new File(imagem.getParent() + File.separator + imageName + "_800" + imageExtension);
                    Watermark.addImageWatermark(new File(objFrmAvancado.getTfMarca()), imagem, imagem);
                }

                JList listaTamanhos = objFrmAvancado.getListaDeIndices();
                int teste[] = listaTamanhos.getSelectedIndices();

                for (int j = 0; j < teste.length; j++) {
                    ImageResize.resizeImage(imagem, Integer.parseInt( (String)listaTamanhos.getModel().getElementAt(teste[j])), imagem.getParent() + File.separator + imageName + "_"+listaTamanhos.getModel().getElementAt(teste[j]) + imageExtension);
                }

            }
        }

        objFrmProgresso.setVisible(false);

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return this.state;
    }

    public void setObjectFrmProgresso(FrmProgresso objFrmProgresso) {
        this.objFrmProgresso = objFrmProgresso;
    }

    public void setArquivos(File[] imagens) {
        this.arquivos = imagens;
    }

}
