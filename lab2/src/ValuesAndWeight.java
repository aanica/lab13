public class ValuesAndWeight {
    private static int[] values;
    private static int[] weights;

    public ValuesAndWeight(int[] values, int[] weights) { //конструктор
        this.values = values;
        this.weights = weights;
    }

    public static int getRandomElement() {
        int totalWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            totalWeight += weights[i];
        }
        int randomWeight = (int) (Math.random() * totalWeight); //случайное значение от 1 до totalWeight
        for (int i = 0; i < values.length; i++) {
            randomWeight -= weights[i];
            if (randomWeight < 0) {
                return values[i];
            }
        }
        return values[values.length - 1];
    }
}
