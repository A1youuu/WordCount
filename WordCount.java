import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] args) throws Exception{
        String choose = args[0];
        String FileName = args[1];
        int count = 0;
        int temp = 0;
        BufferedReader bufferedReader = new BufferedReader( new FileReader(FileName));
        if(choose.equals("-c"))
        {
            for (;;) {
                temp = bufferedReader.read();
                if (temp == -1)
                    break;
                count++;
            }
            System.out.printf("共有" + count + "个字符");
        } else if (choose.equals("-w")) {
            for (;;) {
                temp = bufferedReader.read();
                if (temp == -1){
                    break;
                }
                else if (Character.isWhitespace(temp)) {
                    count++;
                }
            }
            System.out.printf("共有" + ++count + "个单词");
        }
    }
}