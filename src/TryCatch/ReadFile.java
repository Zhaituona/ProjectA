package TryCatch;
import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "C:\\Users\\Elzat\\IdeaProjects\\ProjectA\\new.txt";

    try {
        fr = new FileReader(path);
    }
        catch(Exception e){
        System.out.println("file is not found");

        }
        try{
            br = new BufferedReader(fr);
            String line = " ";
            while((line = br.readLine()) != null) {
    System.out.println(line);
            }
        }
            catch(Exception e){
            System.out.println("not able to read file ");

            }
        }
    }


