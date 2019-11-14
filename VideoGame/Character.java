public class Character{

    private String name;
    private int energy;
    private int lives;
    private int attackPoints;

    // Constructor

    public Character(String name, int energy, int attackPoints){

        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lives=3;

    }
    
    // Getters

    public String getName(){
        return this.name;
    }
    
    public int getenergy(){
        return this.energy;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }
        // Methods

    public void display(){
        System.out.println("----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println(" <3 " + this.lives);
        System.out.println("Energy: " + this.energy);
        System.out.println("Attack Points: " + this.attackPoints);
    }

    public void attack(Character opponent){
        System.out.println(this.name + " is attacking " + opponent.name + " and hits for " + this.attackPoints);


        int newLP = opponent.energy-this.attackPoints;
        
        opponent.energy=newLP;
        opponent.display();

        if(opponent.energy <= 0){
            opponent.lives = opponent.lives-1;
            opponent.energy = 100;                
            opponent.display();
        }

        if(opponent.lives <= 0){
            System.out.println("------------------------------------");
            System.out.println(opponent.name + " is dead!");
            System.out.println("Game Over");
        }



    }



}