public class HexMultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                System.out.printf("%s * %s = %s\n",intToHex(i),intToHex(j),intToHex(i*j));
            }
            System.out.println();
        }
    }

    static String intToHex(int a ){
        String hex = "";
        int hex_power = (int)(Math.log(a)/Math.log(16));
        for (int i = hex_power; i >=0 ; i--) {
            int pow = (int)Math.pow(16,i);
            int num = a/pow;
            if(num<10)
                hex+=num;
            else
                hex+= hexTable(num);
            a%= pow;
        }
        return hex;
    }
    static String hexTable(int a){
        return switch (a){
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> " ";
        };
    }
}
