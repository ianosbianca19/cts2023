import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        double y=0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Introduceti valoarea pentru X: ");
                x = Double.parseDouble(reader.readLine());

                System.out.println("Introduceti valoarea pentru Y: ");
                y = Double.parseDouble(reader.readLine());
                validInput = true;
            } catch (NumberFormatException e) {
                throw new IOException("Valoare invalida. Introduceti o valoare valida.", e);

            }
        }

        double x5 = power(x, 5);
        double y7 = power(y, 7);
        result = x5 + y7;
        return result;
    }

    /**
     * This method calculates the power of a number.
     * @param base The base value.
     * @param exponent The exponent value.
     * @return Returns the result of the power calculation.
     */
    public double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
