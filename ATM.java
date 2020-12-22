public class ATM {

    public int countBanknotes(int n) {
       
        String notesStr = "";
        int[] notes = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int counter = 0;
       
        while (i < notes.length) {
            if ((n / notes[i] >= 1) && (n % notes[i] == 0)) {
                counter += n / notes[i];
                break;
            }

            if (n / notes[i] >= 1) {
                counter += n / notes[i];
                n = n % notes[i];
            }

            i++;
        }
       
        return counter;
    }


    public static void main(String[] args) {
        ATM cash = new ATM();

        System.out.println(cash.countBanknotes(500));
        System.out.println(cash.countBanknotes(578));
        System.out.println(cash.countBanknotes(1400));

    }
}
