public interface Accessories {
    String getName();
    String getDescription();
}

interface Ring extends Accessories {
    void increaseATK(RPGCharacter character);
}

interface Cloak extends Accessories {
    void increaseDEF(RPGCharacter character);
    void increaseSpeed(RPGCharacter character);
}

interface FireRing extends Ring {
    void increaseATKSpeed(RPGCharacter character);
}

interface BunnyShoes extends Ring, Cloak {
    void increaseSpeed(RPGCharacter character);
}

interface DiamondCloak extends Cloak {
    void increaseHP(RPGCharacter character);
    void decreaseSpeed(RPGCharacter character);
}

class FireRingImpl implements FireRing {
    @Override
    public void increaseATK(RPGCharacter character) {
        System.out.println("Fire Ring equipped: Increased Attack!");
        character.attackPower += 5;
    }

    //precondition:The Fire Ring object must be instantiated. The RPGCharacter object must be instantiated and associated with the Fire Ring.
    //post condition: None
    //Side Effects:Increases the attack power of the associated character by 5.Prints a message to the console indicating the increase in attack power.
    @Override
    public void increaseATKSpeed(RPGCharacter character) {
        System.out.println("Fire Ring equipped: Increased Attack Speed!");
        character.ATKSpeed += 3;
    }

    //precondition:The Fire Ring object must be instantiated. The RPGCharacter object must be instantiated and associated with the Fire Ring.
    //post condition: None
    //Side Effects:Increases the attack speed of the associated character by 3.Prints a message to the console indicating the increase in attack speed.
    @Override
    public String getName() {
        return "Fire Ring";
    }

    //precondition:The Fire Ring object must be instantiated.
    //post condition: Return name of accessories.
    //Side Effects: None
    @Override
    public String getDescription() {
        return "A ring imbued with the power of fire.";
    }
    //precondition:The Fire Ring object must be instantiated.
    //post condition: Return description of accessories;
    //Side Effects: None
}


class BunnyShoesImpl implements BunnyShoes {
    @Override
    public void increaseSpeed(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Speed!");
        character.Speed += 5;
    }
    //precondition:The BunnyShoes object must be instantiated. The RPGCharacter object must be instantiated and associated with the BunnyShoes.
    //post condition: None
    //Side Effects:Increases the speed of the associated character by 5.Prints a message to the console indicating the increase in speed.

    @Override
    public void increaseATK(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Attack!");
        character.attackPower += 3;
    }
    //precondition:The BunnyShoes object must be instantiated. The RPGCharacter object must be instantiated and associated with the BunnyShoes.
    //post condition: None
    //Side Effects:Increases the attack power of the associated character by 3.Prints a message to the console indicating the increase in attack power.


    @Override
    public void increaseDEF(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Defense!");
        character.defense += 2;
    }
    //precondition:The BunnyShoes object must be instantiated. The RPGCharacter object must be instantiated and associated with the BunnyShoes.
    //post condition: None
    //Side Effects:Increases the defense of the associated character by 2.Prints a message to the console indicating the increase in defense.


    @Override
    public String getName() {
        return "Bunny Shoes";
    }
    //precondition:The Bunny Shoes object must be instantiated.
    //post condition:Return name of accessories.
    //Side Effects: None

    @Override
    public String getDescription() {
        return "Magical shoes that enhance speed and defense.";
    }
    //precondition:The Bunny Shoes object must be instantiated.
    //post condition:Return description of accessories;
    //Side Effects: None
}

class DiamondCloakImpl implements DiamondCloak {
    @Override
    public void increaseHP(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased HP!");
        character.hp += 30;
    }
    //precondition:The DiamondCloak object must be instantiated. The RPGCharacter object must be instantiated and associated with the DiamondCloak.
    //post condition: None
    //Side Effects:Increases the hp of the associated character by 30.Prints a message to the console indicating the increase in hp.


    @Override
    public void decreaseSpeed(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Decreased Speed!");
        character.Speed -= 3;
    }
    //precondition:The DiamondCloak object must be instantiated. The RPGCharacter object must be instantiated and associated with the DiamondCloak.
    //post condition: None
    //Side Effects:Decreases the Speed of the associated character by 3.Prints a message to the console indicating the decrease in Speed.


    @Override
    public void increaseDEF(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased Defense!");
        character.defense += 5;
    }
    //precondition:The DiamondCloak object must be instantiated. The RPGCharacter object must be instantiated and associated with the DiamondCloak.
    //post condition: None
    //Side Effects:Increases the defense of the associated character by 5.Prints a message to the console indicating the increase in defense.


    @Override
    public void increaseSpeed(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased Speed!");
        character.Speed += 2;
    }
    //precondition:The DiamondCloak object must be instantiated. The RPGCharacter object must be instantiated and associated with the DiamondCloak.
    //post condition: None
    //Side Effects:Increases the Speed of the associated character by 2.Prints a message to the console indicating the increase in Speed.


    @Override
    public String getName() {
        return "Diamond Cloak";
    }
    //precondition:The DiamondCloak object must be instantiated.
    //post condition:Return name of accessories.
    //Side Effects: None


    @Override
    public String getDescription() {
        return "A cloak made of enchanted diamonds.";
    }
    //precondition:The DiamondCloak object must be instantiated.
    //post condition:Return description of accessories;
    //Side Effects: None
}
