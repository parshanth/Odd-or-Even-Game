import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args) {
        int ch=r.nextInt(2);
        System.out.println("Enter 0 Or 1:");
        int ph=s.nextInt();
        int toss=0;
        if (ch!=ph){
            System.out.println("You Won the Toss");
            toss=1;
        }else{
            System.out.println("You Lose");
        }
        String choice_of;
        int do1=1;
        if (toss==1){
            do{
            System.out.println("Choose to bat or bowl ");
            choice_of=s.next();
            if (choice_of.equals("bat")){
                System.out.println("You Chose to Bat");
                do1=0;
                FirstBatting();
            }else if(choice_of.equals("bowl")){
                System.out.println("You Chose to Bowl");
                do1=0;
                FirstBowling();
            }else{
                System.out.println("Enter Correctly Bat Or Bowl");
            }

        }while(do1!=0);
        }else{
            int computer_choice=r.nextInt(10)+1;
            if (computer_choice==2 || computer_choice==4 || computer_choice==6 || computer_choice==8){
                System.out.println("Computer Chose to Bat");
                FirstBowling();
            }else{
                System.out.println("Computer Chose to Bowl");
                FirstBatting();
            }

        }
    }
    public static void FirstBatting(){
        int total=0;
        int win=0;
        int score;
        int noc=0;
        int noc1;
        int nop;
        System.out.println("You are going to bat now");
        while(true){
            System.out.print("Enter between 1 to 6 : ");
            score=s.nextInt();
            if(score<=6){
            noc=r.nextInt(6)+1;
            if (score==noc){
                System.out.println("\n****You Are out****\n");
                System.out.println("Computer played: "+noc+" ");
                System.out.println("You Scored Totally "+total+" Runs");
                break;
            }else{
                System.out.println("Computer Played: "+noc);
                total+=score;
                System.out.println("Your Score = "+total);
            }
            }else{
                System.out.println("Enter Correctly");
            }
        }
        System.out.println("Ready to Bowl");
        System.out.println("Computer Has to Chase "+total+" Runs");
        int ctotal=0;
        while(true){
            System.out.println("Enter between 1 to 6 :");
            nop=s.nextInt();
            noc1=r.nextInt(6)+1;
            ctotal+=noc1;
            if(nop==noc1 && ctotal<total){
                System.out.println("Computer Played "+noc1);
                System.out.println("Computer loose and You Win");
                System.out.println("You Won by "+(total-ctotal)+" Runs");
                break;
            }else if(ctotal==total || ctotal>total){
                System.out.println("Computer Played "+noc1);
                System.out.println("Computer Won the game");
                System.out.println("Computer Chased Successfully and Scored "+(ctotal)+" Runs");
                break;
            }
            else{

                System.out.println("Computer Played "+noc1);
                System.out.println("Total Score = "+ctotal+" Runs and remaining = "+(total-ctotal)+" Runs");
            }
        }
    }
    public static void FirstBowling(){
        int total=0;
        int win=0;
        int score;
        int noc=0;
        int nop1;
        int nop;
        System.out.println("Ready to Bowl");
        System.out.println("Computer is Going to Bat");
        while(true){
            noc=r.nextInt(6)+1;
            System.out.println("Enter Between 1 to 6 : ");
            nop=s.nextInt();
            if (nop==noc){
                System.out.println("\nYou took the wicket\n");
                System.out.println("Computer Played "+noc);
                System.out.println("Computer Scored "+total+" Runs");
                break;
            }else{
                System.out.println("Computer Played: "+noc);
                total+=noc;
                System.out.println("Computer Score = "+total);
            }

        }
        System.out.println("\n\n******Ready To Chase******\n\n");
        System.out.println("You Are Going to Bat");
        System.out.println("You Have to Chase "+total+" Runs");
        int ctotal=0;
        while(true){
            System.out.println("Enter between 1 to 6 :");
            nop1=s.nextInt();
            noc=r.nextInt(6)+1;
            ctotal+=nop1;
            if(noc==nop1 && ctotal<total){
                System.out.println("You Lose the Game");
                System.out.println("You Played "+nop1);
                System.out.println("Computer Won by "+(total-ctotal)+" Runs");
                break;
            }else if(ctotal==total || ctotal>total){
                System.out.println("****Congratulations****");
                System.out.println("You Won the Game");
                System.out.println("Computer Played "+noc);
                System.out.println("You Chased Successfully and Scored "+(ctotal)+" Runs");
                break;
            }
            else{

                System.out.println("You Played "+nop1);
                System.out.println("Computer Score = "+ctotal+" Runs and remaining = "+(total-ctotal)+" Runs");
            }
        }
    }
}
