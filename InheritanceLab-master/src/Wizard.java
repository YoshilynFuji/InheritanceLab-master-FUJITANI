public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name, lvl , hp , mp);
    }

    public void HolyLight(Character enemyCharacter, Character Character){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Holy Light (Damage - 25)(-30MP)");
        int damagePoints = 25;
        int manaCost = 30;
        damageTarget(enemyCharacter, damagePoints,Character,manaCost);
    };
    public void divineJudgement(Character enemyCharacter,Character Character){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Divine Judgement (Damage - 50)(-50MP)");
        int damagePoints = 50;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints,Character,manaCost);
    };

    public void HolyBaptism(){
        super.healthPoints += 25;
        super.manaPoints += 50;
        System.out.println(super.characterName + " Used Holy Baptism! Gains +25HP +50MP!");
    }
    public void display(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Wizard: " +super.characterName);
        System.out.println("HP: " +super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }


    
}
