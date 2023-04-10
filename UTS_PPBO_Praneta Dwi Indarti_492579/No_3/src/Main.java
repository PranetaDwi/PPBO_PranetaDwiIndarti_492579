public class Main {
    public static void main(String[] args) {
        Zombie a = new Zombie("hozi",89,9);
        Pocong b = new Pocong("be", 78, 8);
        Burung c = new Burung("ca",908, 4);

        System.out.println("method a sebagai zombie ");
        System.out.println(a.walk());
        System.out.println();
        System.out.println("method b sebagai pocong  ");
        System.out.println(b.jump());
        System.out.println();
        System.out.println("method c sebagai burung ");
        System.out.println(c.fly());
        System.out.println(c.walk());
    }
}