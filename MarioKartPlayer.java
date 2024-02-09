// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

class MarioKartPlayer {
    String name;
    String character;
    int speed; //Create variables
    public MarioKartPlayer (String name, String character, int speed){
        this.name = name;
        this.character = character;
        this.speed = speed;
    } //Create class for MarioKart Player
    public int boost() {
        speed *= 2;
        return speed;
    }//Create class to boost speed
    public void stats() {
        System.out.println("Name: " + name + "\n Character: " + character + "\n Speed: "
                + speed);

    }//Create class to output stats

    public static void main(String[] args){
        MarioKartPlayer playerone = new MarioKartPlayer("Lebron", "Mario", 30);

        MarioKartPlayer playertwo = new MarioKartPlayer("James", "Luigi", 40); //Create objects

        playerone.stats();
        playertwo.stats(); //Output stats

        System.out.println("BOOST! Both of your stats have increased! Take a look: ");

        playerone.boost();
        playertwo.boost();
        playerone.stats();
        playertwo.stats(); //Boost and output stats again



    }

}


