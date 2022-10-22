public class Medic extends Hero {
    double healPoints;

    public void increaseExperience() {
        healPoints= healPoints +0.1*healPoints;
        System.out.println("healed!");

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied super ability HEALING");
    }
}
