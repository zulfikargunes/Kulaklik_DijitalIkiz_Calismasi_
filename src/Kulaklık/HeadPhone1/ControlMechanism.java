package Kulaklık.HeadPhone1;

public class ControlMechanism {

    private int volume;
    private boolean isPlaying;

    public ControlMechanism() {
        this.volume = 50; // Varsayılan ses seviyesi
        this.isPlaying = true;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void togglePlayPause() {
        isPlaying = !isPlaying;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public String toString() {
        return "Ses Seviyesi: " + volume + ", Çalıyor: " + isPlaying;
    }
}