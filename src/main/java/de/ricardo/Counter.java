package de.ricardo;

public class Counter {

    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount = totalCount + 1;
    }

    public void incrementInstanceCount() {
        instanceCount = instanceCount + 1;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "totalCount=" + totalCount +
                ", instanceCount=" + instanceCount +
                '}';
    }
}
