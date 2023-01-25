public class Pairing {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    public static int friendPairing(int var0) {
        if (var0 != 1 && var0 != 2) {
            int var1 = friendPairing(var0 - 1);
            int var2 = friendPairing(var0 - 2);
            int var3 = (var0 - 1) * var2;
            int var4 = var1 + var3;
            return var4;
        } else {
            return var0;
        }
    }

    public static void main(String[] var0) {
        System.out.println(friendPairing(3));
    }
}

    

