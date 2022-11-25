public class Billing {
    private static final float TAX = 1.08F;

    public static void main(String[] args) {
        System.out.println(computeBill(10));
        System.out.println(computeBill(10, 2));
        System.out.println(computeBill(10, 2, 4));
    }
    public static float computeBill(float singlePrice) {
        return  singlePrice * TAX;
    }
    public static float computeBill(float bookPrice, int bookQty) {
        return (bookPrice * bookQty) * TAX;
    }
    public static float computeBill(float bookPrice, int bookQty, int couponValue) {
        return (bookPrice * bookQty - couponValue) * TAX;
    }
}
