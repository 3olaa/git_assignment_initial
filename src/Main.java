import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers [] = {
            new SimpleSubscriber(),
            new ReallySimpleSubscriber(),
            new SummationSeries(),
            new SphereCircumference(),
            new LucasSeries(),
            new Spherearea(),
            new SphereVolume(),
            new CircleCircumference(),
            new multiplicationSeries()
	

    };
    public static void main(String[] args) {
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }


}
