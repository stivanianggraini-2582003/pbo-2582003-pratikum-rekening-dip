public class EmailNotifikasi implements Notifikasi {
    @Override
    public void kirim(String nomor, String pesan) {
        System.out.println("[EMAIL " + nomor + "] " + pesan);
    }
}