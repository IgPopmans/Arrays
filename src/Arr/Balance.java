package Arr;

public class Balance {


    int r;
    int l;

    public Balance(int r, int l) {
        this.r = r;
        this.l = l;
    }

    void addRight(int n) {
        r += n;
    }

    void addLeft(int n) {
        l += n;
    }

    String getSituation() {
        if (l == r) return "=";
        else if (r > l) return "r";
        else return "l";




    }
    String getSound(){
        System.out.println(" ding dong");

        return "";
    }

    public static class Bell {
        Boolean ding = true;

        void sound() {
            if (ding) {
                System.out.println("ding");
            } else {
                System.out.println("dong");
            }
            ding = !ding;
        }
    }

    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
    }
}

