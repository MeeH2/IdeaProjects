public class PaintJob {
    // write your code here
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(6.26,2.2));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaPaint = width * height;
        int bucketsNeeded = (int) Math.ceil(areaPaint / areaPerBucket);
        int totalBuckets = Math.round(bucketsNeeded - extraBuckets);

        if (totalBuckets < 0) {
            totalBuckets = 0;
        }
        return totalBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double areaPaint = width * height;
        int bucketsNeeded = (int) Math.ceil(areaPaint / areaPerBucket);

        if (bucketsNeeded < 0) {
            bucketsNeeded = 0;
        }
        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int areaPaint = (int) Math.ceil(area / areaPerBucket);

        if (areaPaint < 0) {
            areaPaint = 0;
        }
        return areaPaint;
    }
}