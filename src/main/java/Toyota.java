public class Toyota implements Drivable, Tradable{
    private int price = 200;
    private int maxSpeed = 2;
    public Toyota(){
        super();
    }

    public void setPrice(int pPrice){
        this.price = pPrice;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    @Override
    public void upgradeSpeed(){
        this.maxSpeed ++;
    }

    @Override
    public void downgradeSpeed(){
        this.maxSpeed --;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

    public static void main(String[] args) {
        Toyota t = new Toyota();
        System.out.println(t);
    }

}
