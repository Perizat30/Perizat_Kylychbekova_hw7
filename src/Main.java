import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Hero Magic =new Magic() ;
        Hero Medic =new Medic() ;
        Hero Warrior =new Warrior();



        Hero [] heroes={Magic,Medic,Warrior};



        for (int i=0;i< heroes.length;i++){
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                ((Medic) heroes[i]).increaseExperience();
            }

        }
    }
}