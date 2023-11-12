package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(5);
    }
    public static void printHourglassOfGivenSize(int height) {
        for (int i = 0; i<height; i++){
            for (int j = 0; j<height; j++){
                if (i==0 || i==height-1 || (j>=i && j<height-i)){
                    System.out.print(8);
                } else if (i>height/2 && j>0) {
                    System.out.print(8);
                } else System.out.print(" ");

            }
            System.out.println("");
        }
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < height; j++) {
//                if (i == 0 || i == height - 1 || j >= i && j < height - i - 1 || i >= height / 2 && j <= height + height / 2 - i - 1) {
//                    System.out.print("8");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }


}
