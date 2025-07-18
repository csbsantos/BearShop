import java.util.Random;

public class DrunkBear extends Bear{
    private int sleep;


    public DrunkBear(String typeOfBear, int battery) {
        super(typeOfBear, battery);
    }

    @Override
    public void talk (){
        Random random= new Random();
        int sleep= random.nextInt(100);
        System.out.println("I love you");
        battery--;
        if (sleep==20){
            System.out.println("Snooring.");

        }
    }
}
