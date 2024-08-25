package Kulaklık.HeadPhone1;

public class HeadPhone {

    private boolean isActive;


    public HeadPhone() {
        this.isActive = false;
    }

    public void activate() {
        this.isActive = true;
    }

    public void deactivate() {
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public String toString() {
        return isActive ? "Kulaklık Aktif" : "Kulaklık Devre Dışı";
    }
}
