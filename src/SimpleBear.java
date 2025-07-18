public class SimpleBear extends Bear {

    public SimpleBear(String typeOfBear, int battery) {
        super(typeOfBear, battery);
    }

    @Override
    public void talk() {
        if (battery>0) {
            System.out.println("I love you");
            battery--;
        }
        if (battery==0) {
            System.out.println("I can't talk anymore");
        }
    }
}
