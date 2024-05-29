import java.io.File;

public class Main {

    public static void main(String[] args) {

        String path = "C:/Users/vhuta/Desktop";

        File file = new File(path);

        File[] current_Directory = file.listFiles();

        for(int i = 0; i < current_Directory.length; i++){

            System.out.println(i + "." + current_Directory[i].getName());

        }

    }


}