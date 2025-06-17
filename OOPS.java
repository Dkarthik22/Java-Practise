package src;

public class OOPS {
    public static void main(String[] args) {
        car tata = new car();
        System.out.println(tata.carname);
        tata.carname = "Ferari";
        System.out.println(tata.carname);
        car Speed = new car(tata);
        System.out.println(Speed.price);
    }
}
class car{
    String carname;
    int price;
    float speed;

    car() {
        this.carname = "Maruthi";
        this.price = 900000;
        this.speed = 220.6f;

    }
    car(String newcar){
        this.carname ="BMW";
    }
    car(car first){
        this.speed = first.speed;
    }


}
