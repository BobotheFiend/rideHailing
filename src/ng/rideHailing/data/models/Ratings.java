package ng.rideHailing.data.models;

public enum Ratings {
    ONE_STAR(1),
    TWO_STAR(2),
    THREE_STAR(3),
    FOUR_STAR(4),
    FIVE_STAR(5);

    private int value;
    Ratings(int value) {
        this.value = value;
    }

}
