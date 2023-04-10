public class Burung extends enemy{
    public Burung(String name, int hp, int attackDamage){
        super(name, hp, attackDamage);
    }
    public String fly(){
        return "fly";
    }
    public String walk(){
        return "walk";
    }
}
