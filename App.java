public class App {

    public static void main(String[] args) {
        // Polymorphisme
        CanGetDiskon member = new Member();
        CanGetDiskon memberGold = new MemberGold();
        CanGetDiskon memberSilver = new MemberSilver();

        // Memanggil hitungTotalBayar untuk setiap member
        Integer totalBayarMember = member.hitungTotalBayar(800000);
        Integer totalBayarMemberGold = memberGold.hitungTotalBayar(1200000);
        Integer totalBayarMemberSilver = memberSilver.hitungTotalBayar(6000000);

        System.out.println("Total pembayaran Member setelah diskon: " + totalBayarMember);
        System.out.println("Total pembayaran MemberGold setelah diskon: " + totalBayarMemberGold);
        System.out.println("Total pembayaran MemberSilver setelah diskon: " + totalBayarMemberSilver);

        System.out.println(" ");
        System.out.println("----------------------------------------------------- ");
        System.out.println(" ");

        // hitungOngkir untuk MemberGold
        MemberGold memberGoldObj = new MemberGold();
        Integer ongkirGold = memberGoldObj.hitungOngkir(8.0);
        System.out.println("Biaya pengiriman untuk MemberGold: " + ongkirGold);

        // hitungOngkir untuk MemberSilver
        MemberSilver memberSilverObj = new MemberSilver();
        Integer ongkirSilver = memberSilverObj.hitungOngkir(6.0);
        System.out.println("Biaya pengiriman untuk MemberSilver: " + ongkirSilver);
    }
}
