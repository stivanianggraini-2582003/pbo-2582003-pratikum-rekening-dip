public class SmsNotifikasi implements Notifikasi {
    @Override
    public void kirim(String nomor, String pesan) {
        System.out.println("[SMS   " + nomor + "] " + pesan);
    }
}