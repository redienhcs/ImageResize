package classes;

import forms.FrmPrincipal;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Anderson Felipe Schneider <hactar@universo.univates.br>
 */
public class ImageResize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new FrmPrincipal().setVisible(true);
    }

    /**
     * Se a altura não for informada ela será calculada
     */
    public static void resizeImage(File imagem, int IMG_WIDTH, String newImage) {
        try {
            BufferedImage originalImage = ImageIO.read(imagem);
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

            //Cálculo das dimensões da imagem
            float calc = 1;
            calc = ((float) originalImage.getHeight() / originalImage.getWidth()) * IMG_WIDTH;

            BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, (int) calc, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, IMG_WIDTH, (int) calc, null);
            g.dispose();
                
            ImageIO.write(resizedImage, newImage.substring( newImage.length()-3)  , new File(newImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /**
     * Se a altura não for informada ela será calculada
     */
    public static BufferedImage resizeImage(BufferedImage originalImage, int type, int IMG_WIDTH) {
        System.out.println(originalImage.getHeight());
        System.out.println(originalImage.getWidth());
        System.out.println(IMG_WIDTH);
        float calc = 1;
        System.out.println(calc);
        calc = ((float) originalImage.getHeight() / originalImage.getWidth()) * IMG_WIDTH;
        System.out.println(calc);

        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, (int) calc, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, (int) calc, null);
        g.dispose();

        return resizedImage;
    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int type, int IMG_WIDTH, int IMG_HEIGHT) {
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }

}
