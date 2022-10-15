public class Main {
    public static void main(String[] args) {


        System.out.println(findDiscriminant(13, 5, 21));

        String[] strArray = new String[]{"what", "is", "the ", "shortest", "word"};
        System.out.println(findShortestString(strArray));

        Fraction obj = new Fraction(4,7);

        System.out.println(obj.getDenominator());
        System.out.println(obj.getNumerator());

        obj.reduced(14);
        obj.sum(68,204);
        obj.multiply(3, 12);

    }
    //First
    public static int findDiscriminant(int a, int b, int c){
        int dis = (b * b) - (4 * a * c);
        return dis;

    }
    //Second
    public static String findShortestString(String[] array) {

        String shortestString = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i].length() <= shortestString.length()){
                shortestString = array[i];
            }
        }
        return shortestString;
    }




}