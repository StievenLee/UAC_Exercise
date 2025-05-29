package Main;

//S (Single Responsibility): Setiap kelas hanya punya satu tugas: autentikasi (BasicLogin, OAuthLogin) dan pengiriman pesan (EmailMessage, SMSMessage).
//O (Open/Closed): Mudah menambah tipe login atau pesan tanpa mengubah kode yang ada.
//L (Liskov Substitution): EmailMessage dan SMSMessage bisa menggantikan Message dengan aman.
//I (Interface Segregation): ILogin kecil dan spesifik.
//D (Dependency Inversion): Message tidak tergantung pada implementasi login spesifik, tapi pada interface ILogin.

public class App {
    public static void main(String[] args) {
        ILogin emailLogin = new BasicLogin("alice", "password123");
        ILogin smsLogin = new OAuthLogin("token-abc-123");

        Message email = new EmailMessage(emailLogin, "alice@example.com", "bob@example.com", "Hello Bob!");
        Message sms = new SMSMessage(smsLogin, "Alice", "Bob", "Hi Bob, this is Alice.");

        email.send("alice", "password123");
        sms.send("anyuser", "token-abc-123");

        email.send("alice", "wrongpass");
        sms.send("anyuser", "wrongtoken");
    }
}