import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class ConsultarLivro{
    public static void main(String[] args) {
        Path arq_livros = Paths.get("livros.txt");
        try{
        String livros[]= Files.readAllLines(arq_livros).toArray(new String[0]);
        for(String livro :livros){
            System.out.print(livro);
        }
        } catch( IOException ioex1){
            ioex1.printStackTrace();
        }
    }
}