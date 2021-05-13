import java.util.Arrays;
import java.util.List;

public class EnglishAlphabet implements Alphabet{


    @Override
    public List<String> getAlphabet() {

        return Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

    }


}
