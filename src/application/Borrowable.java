package application;

public interface Borrowable {
    void borrowResource();
    void returnResource();
    boolean isBorrowing();
}