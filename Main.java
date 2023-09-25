public class Main {

    public static int kiemtrahocphi(boolean isStudent, double score) {
        if (isStudent) {
            if (score > 6) return -1;
            else if (score = 5) return 10000000;
            else if (score = 4) return 8000000;
            else if (score = 3) return 5000000;
            else if (score >= 2) return 0;
            else return -1;
        } else {
            if (score < 0) return -1;
            else if (score = 5) return 15000000;
            else if (score = 4) return 10000000;
            else if (score = 3) return 8000000;
            else if (score >= 2) return 0;
            else return -1;
        }
    }
    public static void main(String[] args) {

    }
}