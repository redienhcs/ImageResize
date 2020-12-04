package classes;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Anderson Felipe Schneider <hactar@universo.univates.br>
 */
public class Watermark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File sourceImageFile = new File("/home/anderson/Desktop/fundo_imagem_site.jpg");
        File watermarkImageFile = new File("/home/anderson/Desktop/CodeJavaLogo.png");
        File destImageFile = new File("/home/anderson/Desktop/text_watermarked.jpg");

        addImageWatermark(watermarkImageFile, sourceImageFile, destImageFile);
    }

    /**
     * Embeds an image watermark over a source image to produce a watermarked
     * one.
     *
     * @param watermarkImageFile The image file used as the watermark.
     * @param sourceImageFile The source image file.
     * @param destImageFile The output image file.
     */
    public static void addImageWatermark(File watermarkImageFile, File sourceImageFile, File destImageFile) {
        try {
            BufferedImage sourceImage = ImageIO.read(sourceImageFile);
            BufferedImage watermarkImage = ImageIO.read(watermarkImageFile);

            // initializes necessary graphic properties
            Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();
            AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
            g2d.setComposite(alphaChannel);

            // calculates the coordinate where the image is painted
            int topLeftX = (sourceImage.getWidth() - watermarkImage.getWidth()) / 2;
            int topLeftY = (sourceImage.getHeight() - watermarkImage.getHeight()) / 2;

            // paints the image watermark
            g2d.drawImage(watermarkImage, topLeftX, topLeftY, null);

            ImageIO.write(sourceImage, "jpg", destImageFile);
            g2d.dispose();

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
