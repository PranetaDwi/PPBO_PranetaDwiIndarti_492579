public class Zombie extends enemy{
    public Zombie(String name, int hp, int attackDamage){
        super(name, hp, attackDamage);
    }
    public String  walk(){
        return "walk";
    }
}
