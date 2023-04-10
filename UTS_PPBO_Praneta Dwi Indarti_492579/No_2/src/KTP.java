import java.util.Arrays;

public class KTP {
    private String nama;
    private String Telefon = "085877573513";
    private String[] Tgl_lhr = new String[]{"23", "03", "2003"};

    public KTP(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String Telefon) {
        if (Telefon.substring(0,1).equals("0") && (Telefon.length() == 12 || Telefon.length() == 13)) {
            System.out.println("Nomor Telepon Valid");
            this.Telefon = Telefon;
        } else{
            System.out.println("Nomor Telepon tidak Valid");
        }

    }

    public String[] getTgl_lhr() {
        return Tgl_lhr;
    }

    public void setTgl_lhr(String[] tgl_lhr) {
        // gatau ngubah string ke int maaf....
        System.out.println("Pergantian Tanggal Lahir Berhasil");
        this.Tgl_lhr = tgl_lhr;
    }

    @Override
    public String toString() {
        return "KTP{" +
                "nama='" + nama + '\'' +
                ", Telefon='" + Telefon + '\'' +
                ", Tgl_lhr=" + Arrays.toString(Tgl_lhr) +
                '}';
    }
}
