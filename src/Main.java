public class Main {
    public static void main(String[] args) {

        Assassins hero = new Assassins("Hero", 1, 10.0);
        hero.displayStat();
//        FireRing fireRing = new FireRingImpl();
//        BunnyShoes bunnyShoes = new BunnyShoesImpl();
//        DiamondCloak diamondCloak = new DiamondCloakImpl();
//
//        hero.equipAccessories(fireRing);
//        hero.equipAccessories(bunnyShoes);
//        hero.equipAccessories(diamondCloak);
        hero.displayStat();

        Tanks hero2 = new Tanks("Gear", 2, 10.0);
        hero2.displayStat();
        hero.shadowDanceATK(hero2);
        hero2.displayStat();
    }
}