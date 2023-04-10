public class subject{
    private int beban;
    private String nama;

    public subject(int beban, String nama){
        this.beban = beban;
        this.nama = nama;

    }
    public int getBeban() {
        return beban;
    }

    public void setBeban(int beban) {
        this.beban = beban;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
