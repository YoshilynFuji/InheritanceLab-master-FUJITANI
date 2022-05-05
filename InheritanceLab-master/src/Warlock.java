public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name, lvl , hp , mp);


    }
    public void AbyssalStrike(Character enemyCharacter,Character Character){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with AbyssalStrike (Damage - 50)(-50MP)");
        int damagePoints = 50;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints,Character,manaCost);
    };
    public void Hunt(Character enemyCharacter,Character Character){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Hunt (Damage - 25)(-30MP)");
        int damagePoints = 25;
        int manaCost = 30;
        damageTarget(enemyCharacter, damagePoints,Character,manaCost);

    };
    public void Devour(){
        super.healthPoints += 25;
        super.manaPoints += 50;
        System.out.println(super.characterName + " Used Devour! Gains +25HP +50MP!");
    }
    public void display(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Warlock: " +super.characterName);
        System.out.println("HP: " +super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

}
