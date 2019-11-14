public class Game{

    public static void main(String args[]){

        Character crono = new Character("Crono", 100, 20);
        Character magus = new Character("Magus", 100, 50);
       
       // This is just an inelegant way of displaying character aspects
       // System.out.println(crono.getName() + "\n " + crono.getEnergy() + "\n " + crono.getAttackPoints());
       // System.out.println(marle.getName() + "\n " + marle.getEnergy() + "\n " + marle.getAttackPoints());
       // System.out.println(lucca.getName() + "\n " + lucca.getEnergy() + "\n " + lucca.getAttackPoints());
        
       crono.display();
       magus.display();
        
       crono.attack(magus);                          
       magus.attack(crono);
       magus.attack(crono);
       crono.attack(magus);
       magus.attack(crono);
       magus.attack(crono);
       crono.attack(magus);                          
       magus.attack(crono);
       magus.attack(crono);
     
       
     
    }

}