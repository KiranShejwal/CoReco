public class RadioactiveDecay {
    public static void main(String[] args) {
        double mass = 500;
        double years = 5.0;
        double halfLives = 5;

        remainingMass(mass,halfLives);
        totalYears(years,halfLives);
    }

    public static void remainingMass(double mass,double halfLives)
    {
        double rem=mass*Math.pow(0.5, halfLives);
        System.out.println("The remaining mass is: "+ rem);
    }

    public static void totalYears(double years ,double halfLives)
    {
        double toYears=halfLives*years;
        System.out.println("The number of years required to decay the material is: "+ toYears);
    }

}
