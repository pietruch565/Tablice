public class Tablica {
        public static void main(String[] args) {
            int[] tablica = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            System.out.println("Przed pętlą: " + java.util.Arrays.toString(tablica));

            for (int i = 0; i < tablica.length - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }
            }
            System.out.println("Po przejściu pętli: " + java.util.Arrays.toString(tablica));

        }
}
