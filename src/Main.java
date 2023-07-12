import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ResizeImageExample {
    public static void main(String[] args) throws IOException {

        new ResizeImageExample();
    }

    public ResizeImageExample() throws IOException {

        //Класс BufferedImage расширяет класс Image, представляющий графические изображения в виде массива прямоугольных пикселей.
        BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\chand\\IdeaProjects\\Pol\\Practica\\Муравей.jpg"));
        //Создает масштабируемую версию изображения
        Image image = bufferedImage.getScaledInstance(60, 40, Image.SCALE_DEFAULT);
        //Создаём значок из изображения
        ImageIcon icon1 = new ImageIcon(image);

        //Создаем фрейм куда будем добавлять все наши компоненты
        JFrame frame = new JFrame();
        //Задаём раскладывание компонентов в один ряд друг за другом - FlowLayout()
        frame.setLayout(new BorderLayout());
        //Задаём размер фрейма
        frame.setSize(1920, 1080);

        //JLabel используется для отображения короткой строки или значка изображения. JLabel может отображать текст, изображение или и то, и другое.
        // JLabel - это только отображение текста или изображения, и он не может получить фокус.
        JLabel jLabel1 = new JLabel();
        jLabel1.setIcon(icon1);
        /*JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(icon1);
        JLabel jLabel3 = new JLabel();
        jLabel3.setIcon(icon1);
        JLabel jLabel4 = new JLabel();
        jLabel4.setIcon(icon1);
        JLabel jLabel5 = new JLabel();
        jLabel5.setIcon(icon1);
        JLabel jLabel6 = new JLabel();
        jLabel6.setIcon(icon1);*/

        //Создаём личный виджет
        MyDrawPanel panel1 = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,panel1);

        //Добавляем картинки на фрейм
        frame.getContentPane().add(BorderLayout.NORTH,jLabel1);
        //frame.add(jLabel1);
        //frame.add(jLabel2);
        //frame.add(jLabel3);
        //frame.add(jLabel4);
        //frame.add(jLabel5);
        //frame.add(jLabel6);

        //Задаём раскладывание компонентов в пять областей верхнюю,нижнюю,левую,правую,центарльную
        //frame.setLayout(new BorderLayout());

        //Создаём еще парочку картинок
        JLabel jLabel7 = new JLabel();
        jLabel7.setIcon(icon1);
        JLabel jLabel8 = new JLabel();
        jLabel8.setIcon(icon1);

        //Добавляем картинки на фрейм
        //frame.getContentPane().add(BorderLayout.SOUTH, jLabel7);
        //frame.getContentPane().add(BorderLayout.NORTH, jLabel8);

        //Делаем фрейм видимым и  завершаем работу программы при закрытии окна
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g){
            //Создаю объект отвечающий за коричневый цвет прямоугольника
            Color MyColor = new Color(152,118,84);
            //Устанавливаю созданный мной цвет как используемый
            g.setColor(MyColor);
            //Рисуем прямоуголбник с координатами верхнего левого угла x,y и размер указывают следующие параметры
            g.fillRect(0,0,this.getWidth(), this.getHeight());

        }
    }
}