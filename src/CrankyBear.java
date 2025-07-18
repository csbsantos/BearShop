public class CrankyBear extends Bear{
    private int counterSadSong=0;

    public CrankyBear(String typeOfBear, int battery) {
        super(typeOfBear, battery);
    }
    @Override
    public void talk (){
        System.out.println("I love you");
        battery--;
        if (battery <50 && counterSadSong==0) {
            System.out.println(" Singing a sad song");
            counterSadSong++;
        }else{
            System.out.println("I can't talk anymore");
        }
    }
}
