package Superpowers;

public class SuperHuman extends Human {

    private boolean good;
    private boolean bad;
    private String heroName;
    private String superAbility;






    public SuperHuman(String name, int age, String gender, String occupation, String address, String heroName, String superAbility, boolean good, boolean bad ) {

        super(name, age, gender, occupation, address);
        this.good = good;
        this.bad = bad;
        this.heroName = heroName;
        this.superAbility = superAbility;


    }

    public boolean getGood() {
        return good;
    }

    public boolean getBad(){
        return bad;
    }

    public String getheroName(){
        return heroName;
    }
    public String getsuperAbility(){
        return superAbility;
    }
}

