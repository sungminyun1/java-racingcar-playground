public class Utility {
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }
}
