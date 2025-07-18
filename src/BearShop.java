public class BearShop {
    private int counterBears=0;
    private Bear bear;

    public BearShop(int counterBears) {
        this.counterBears = counterBears;
    }

    public void createBears(){
        for (int i = 0; i < 25; i++) {

        }
        if (counterBears%5==0){
            Bear bear1= new Bear("Crunky Bear", 100);
            counterBears++;
        }
        if (counterBears %2==0) {
            Bear bear2 = new Bear("Simple Bear", 100);
            counterBears++;
        }else{
            Bear bear3= new Bear("Drunk Bear", 100);
            counterBears++;
        }
    }
    public int getNumberOfBearsCreated (){
        return counterBears;
    }

    public void compareShops (BearShop temp){
        if (this.counterBears== temp.counterBears){
            System.out.println("It's a tie!");
        return;}
        if (this.counterBears> temp.counterBears){
            System.out.println("First store wins, with a total of " + counterBears + "bears created");}
        if (this.counterBears<temp.counterBears){
            System.out.println("Second store wins, with a total of " + temp.counterBears+ "bears created");}
        else{
            System.out.println("Something went wrong. Nobody won");

        }
    }

}
