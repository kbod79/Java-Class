package DarsoVahed;

public class DarsoVahed implements Riazi2,Fizik2,Zaban,Programming {

    @Override
    public void fizik() {
        System.out.println("tedade vahed: 3 " + "pishniaz: fizik1");
        System.out.println("hamniaz: azmayeshgah2");
    }

    @Override
    public void programming() {
        System.out.println("tedade vahed: 3 " + "pishniaz: mabani programming");
        System.out.println("hamniaz: kargah");
    }

    @Override
    public void riazi() {
        System.out.println("tedade vahed: 3 " + "pishniaz:riazi 1");
    }

    @Override
    public void zaban() {
        System.out.println("tedade vahed: 2");
    }
}
