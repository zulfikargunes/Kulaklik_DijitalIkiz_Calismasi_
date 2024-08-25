package Kulaklık.HeadPhone1;

public class Cable {

    private HeadPhone leftHeadphone;
    private HeadPhone rightHeadphone;

    public Cable(HeadPhone left, HeadPhone right) {
        this.leftHeadphone = left;
        this.rightHeadphone = right;
    }

    public void connect() {
        leftHeadphone.activate();
        rightHeadphone.activate();
    }

    public void disconnect() {
        leftHeadphone.deactivate();
        rightHeadphone.deactivate();
    }
}
