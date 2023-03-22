import java.awt.*;

class GFG {
    public static void main(String[] args)
    {
        Dimension size
                = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int)size.getWidth();

        int height = (int)size.getHeight();

        System.out.println("A resolução do sistema é: "
                + "Largura: " + width
                + " , Altura: " + height);
    }
}