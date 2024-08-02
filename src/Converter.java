public class Converter {
    public static void main(String[] args) {

        long firstSpeed = toMilesPerHour(15);
        long secondSpeed = toMilesPerHour(-5);
        long thirdSpeed = toMilesPerHour(285);
    }
    public static long toMilesPerHour(double kilometersPerHour){ // 1 mph = 1.609 kph


        //Ternary operator for finding the conversion quickly:
        //return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour / 1.609);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            return milesPerHour;
        }
    }
}
