import java.io.File;
import java.util.Scanner;

public class Main {

    static String path = "C:/Users/vhuta/Desktop";

    static int count = 0;
    static File file = new File(path);
    private static File[] current_Directory = null;

    public static void main(String[] args) {





        current_Directory = file.listFiles();

        boolean run = true; //runs while loop if true

        while(run) {

            for (int i = 0; i < current_Directory.length; i++) {

                System.out.println(i + "." + current_Directory[i].getName());

            }
            System.out.printf("\nPlease input a number from 0 to %s, or the letter 'Q' to quit:\t", current_Directory.length);
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if(input.equals("q") || input.equals("Q")) {

                run = false;

            }if(input.equals("b") || input.equals("B")){

                back();

            }else{

                chosen(input, current_Directory);

                System.out.println("something is off ");

            }
        }
    }

    public static void chosen(String s, File[] cD){ //gets current directory and the file number chosen then opens if it is a file using madeDir()

        int num = Integer.parseInt(s);

        System.out.println("\n" + num);

        if(cD[num].isDirectory()) {

            madeDir(cD[num]);

        }else{

            System.out.println("\nThis is not a directory and cannot be opened, try a different file without an extension.\n");

        }
    }

    public static void madeDir(File f){

        path = f.getPath();

        current_Directory = f.listFiles();

    }

    public static void back(){

        if(count > 0){

            String parent = file.getParent();
            count--;
            file = new File(parent);

        }else{

            System.out.println("\nCannot go back since this is the root directory.\n");

        }

    }


}