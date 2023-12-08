public interface Characters {
    void displayStat();
    void levelUp();
    void equipAccessories(Accessories ac);
}

interface Attacker extends Characters {
    void attack(RPGCharacter target);
}

interface Defender extends Characters {
    void defense();
}

interface Assassin extends Attacker {
    void shadowDanceATK(RPGCharacter target);
}

interface Fighter extends Attacker, Defender {
    void iceBreakerATK(RPGCharacter target);
    void starlightATK(RPGCharacter target);
}

interface Tank extends Defender {
    void absorbDMG(RPGCharacter target);
}

class RPGCharacter implements Characters {
    protected String name;
    protected int level;
    protected double hp;
    protected double defense;
    protected double ATKSpeed;
    protected double Speed;
    protected String classJob;
    protected double attackPower;

    public RPGCharacter(String name, int level, double Speed) {
        this.name = name;
        this.level = level;
        this.Speed = Speed;
        this.hp = 100 + (10 * level);
        this.defense = 100 + (2 * level);
        this.ATKSpeed = 20 + (level);
        this.classJob = "Jobless";
        this.attackPower = 120 + (level * 2);
    }

    @Override
    public void displayStat() {
        if(this.hp<0) this.hp=0;
        System.out.println(name + "- Level: " + level + ", Job: " + classJob +
                ", HP: " + hp + ", ATKSpeed: " + ATKSpeed + ", Attack Power: " + attackPower +
                ", Defense: " + defense + ", Speed: " + Speed);
    }
    //precondition: None
    //post condition: None
    //Side Effects:Prints a message to the console indicating all Character value.


    @Override
    public void levelUp() {
        level++;
        hp += 20;
        defense += 10;
        ATKSpeed += 2;
        attackPower += 3;
        Speed += 5;
        System.out.println(name + " leveled up to level " + level + "!");
    }
    //precondition: None
    //post condition: None
    //Side Effects:Increases the stat of the RPGCharacter. Prints a message to the console indicating the increase in level.


    @Override
    public void equipAccessories(Accessories ac) {
        System.out.println(name + " equipped with " + ac.getName() + ": " + ac.getDescription());
        if (ac instanceof Ring) {
            ((Ring) ac).increaseATK(this);
        } else if (ac instanceof Cloak) {
            ((Cloak) ac).increaseDEF(this);
            ((Cloak) ac).increaseSpeed(this);
        }
    }
    //precondition:The Accessories and Characters objects must be instantiated.
    //post condition: Character modified base on Accessories.
    //Side Effects:Prints a message to the console indicating the increase in speed, DEF, ATK,  if applicable.


}

class Attack extends RPGCharacter implements Attacker {
    public Attack(String name, int level, double Speed) {
        super(name,level,Speed);
    }
    @Override
    public void attack(RPGCharacter target) {
        target.hp -= Math.max(0,this.attackPower-this.defense);
        System.out.println("AttackDamage: "+Math.max(0,this.attackPower-this.defense));
    }
    //precondition:Two RPGCharacter objects must be instantiated.
    //post condition: None
    //Side Effects:Prints a message to the console indicating the AttackDamage.Decrease RPGCharacter target's hp.

}

class Defend extends RPGCharacter implements Defender{
    public Defend(String name, int level, double Speed) {
        super(name,level,Speed);
    }

    @Override
    public void defense() {
        this.defense += 100;
    }
    //precondition: None
    //post condition: None
    //Side Effects:Increases the Defense of the character by 100.

}

class Assassins extends Attack implements Assassin{
    public Assassins(String name, int level, double Speed) {
        super(name,level,Speed);
    }

    @Override
    public void shadowDanceATK(RPGCharacter target) {
        target.hp -= Math.max(0,this.attackPower*2-this.defense);
        System.out.println("AttackDamage: "+Math.max(0,this.attackPower*2-this.defense));
    }
    //precondition:Two RPGCharacter objects must be instantiated.
    //post condition: None
    //Side Effects:Decreases hp of the target character by damage they got.Prints a message to the console indicating the AttackDamage.

}

class Fighters extends Attack implements Fighter{
    public Fighters(String name, int level, double Speed) {
        super(name,level,Speed);
    }

    @Override
    public void iceBreakerATK(RPGCharacter target) {
        target.hp -= Math.max(0,this.attackPower*1.5-this.defense);
        System.out.println("AttackDamage: "+Math.max(0,this.attackPower*1.5-this.defense));
    }
    //precondition:Two RPGCharacter objects must be instantiated.
    //post condition: None
    //Side Effects:Decreases hp of the target character by damage they got.Prints a message to the console indicating the AttackDamage.


    @Override
    public void starlightATK(RPGCharacter target) {
        target.hp -= Math.max(0,this.attackPower*2.5-this.defense);
        System.out.println("AttackDamage: "+Math.max(0,this.attackPower*2.5-this.defense));
    }
    //precondition:Two RPGCharacter objects must be instantiated.
    //post condition: None
    //Side Effects:Decreases hp of the target character by damage they got.Prints a message to the console indicating the AttackDamage.

    @Override
    public void defense() {
        this.defense += 100;
    }
    //precondition: None
    //post condition: None
    //Side Effects:Increases the Defense of the character by 100.

}

class Tanks extends Defend implements Tank{
    public Tanks(String name, int level, double Speed) {
        super(name,level,Speed);
    }

    @Override
    public void absorbDMG(RPGCharacter target) {
        this.hp += target.attackPower;
    }
    //precondition:Two RPGCharacter objects must be instantiated.
    //post condition: None
    //Side Effects:Increases hp of the character by target's attack power.

}