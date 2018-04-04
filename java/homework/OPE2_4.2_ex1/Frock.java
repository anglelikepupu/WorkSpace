public class Frock
{
    public final static int INCREMENT = 10;

    private int serialNumber;
    int size;
    String color;
    int price;
    private static int currentNum = 100000;

    Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += INCREMENT;
        return currentNum;
    }

    int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return ("序列号：" + serialNumber + "，尺寸：" + size +
                        "，颜色：" + color + "，价格：" + price);
    }
}
