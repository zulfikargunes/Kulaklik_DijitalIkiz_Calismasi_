package Kulaklık.HeadPhone1;

public class Main {
    public static void main(String[] args) {

        // Kulaklıkları oluştur
        HeadPhone leftHeadphone = new HeadPhone();
        HeadPhone rightHeadphone = new HeadPhone();

        // Kabloyu oluştur ve kulaklıkları bağla
        Cable cable = new Cable(leftHeadphone, rightHeadphone);
        cable.connect();

        // Kontrol mekanizmasını oluştur
        ControlMechanism control = new ControlMechanism();

        // Durumları yazdır
        System.out.println(leftHeadphone);
        System.out.println(rightHeadphone);
        System.out.println(control);

        // Ses seviyesini artır ve azalt
        control.increaseVolume();
        control.decreaseVolume();
        System.out.println(control);

        // Şarkıyı durdur
        control.togglePlayPause();
        System.out.println(control);

        // Kabloyu çıkar ve kulaklıkları devre dışı bırak
        cable.disconnect();
        System.out.println(leftHeadphone);
        System.out.println(rightHeadphone);
    }
}
