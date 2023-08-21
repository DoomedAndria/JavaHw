public class NumbersAsWords {
    public static void main(String[] args) {
        System.out.println(int_to_word(60));
    }

    static String int_to_word(int a) {
        if (a <= 20) {
            return ocamde(a);
        } else if (a < 100) {
            return oceuli(a) + ocamde(a % 20);
        }
        return null;
    }

    static String ocamde(int a) {
        return switch (a) {
            case 1 -> "ერთი";
            case 2 -> "ორი";
            case 3 -> "სამი";
            case 4 -> "ოთხი";
            case 5 -> "ხუთი";
            case 6 -> "ექვსი";
            case 7 -> "შვიდი";
            case 8 -> "რვა";
            case 9 -> "ცხრა";
            case 10 -> "ათი";
            case 11 -> "თერთმეტი";
            case 12 -> "თორმეტი";
            case 13 -> "ცამეტი";
            case 14 -> "თოთხმეტი";
            case 15 -> "თხუთმეტი";
            case 16 -> "თექვსმეტი";
            case 17 -> "ჩვიდმეტი";
            case 18 -> "თვრამეტი";
            case 19 -> "ცხრამეტი";
            case 20 -> "ოცი";
            default -> "";
        };
    }

    static String oceuli(int a) {
        String oc = switch (a / 20) {
            case 1 -> "ოცდა";
            case 2 -> "ორმოცდა";
            case 3 -> "სამოცდა";
            case 4 -> "ოთხმოცდა";
            default -> throw new IllegalStateException("Unexpected value: " + a / 20);
        };
        if (a % 20 == 0) {
            oc = oc.replace("და", "ი");
        }
        return oc;
    }
}
