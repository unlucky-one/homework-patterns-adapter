import com.raiden.homework.pattern.adapter.Adapter;
import com.raiden.homework.pattern.adapter.Display;

public class Main {

    public static void main(String[] args) {

        Display display = new Adapter(true);
        display.play();
    }
}
