package pacote;

import java.util.Date;
import java.util.Locale;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Date clock = new Date();
        System.out.println(clock);

        Locale local = Locale.getDefault();
        String idioma = local.getLanguage();
        String pais = local.getCountry();
        String nome = local.getDisplayCountry();

        if(idioma.equals("pt")) {
            idioma = "Português";
        }

        System.out.println("Você e do: "+nome+" e o idioma do sistema é: "+idioma);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        int width = d.width;
        int height = d.height;

        System.out.println("Sua tela tem: "+width+"x"+height+"px");
    }
}