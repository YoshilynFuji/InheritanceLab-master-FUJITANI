public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){

        System.out.println("The Battle will begin shortly...");

        //Current Class stats may also be displayed with this constructor

    }
    Character(String Name, int LVL, int HP, int MP){
        characterName = Name;
        level = LVL;
        healthPoints = HP;
        manaPoints = MP;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(Character Character){
        System.out.println("------------------------");
        System.out.println("Character Initialized : " + Character.characterName);
        System.out.println("------------------------");
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, Character Character, int manaCost){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        /**
         * Deduct Mana points from current character
         */
        Character.manaPoints -= manaCost;

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

        if(enemyCharacter.healthPoints == 0){
            System.out.println("Character " +  enemyCharacter.characterName + " is defeated!");

        }
    }

    /**
     *Level up method for the winning wizard/warlock
     */
    public void LvlUp(Character Character){
        System.out.println("Congratulations " + Character.characterName + " you leveled up by 10!");
        Character.level += 10;

    }


}