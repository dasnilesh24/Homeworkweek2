public class NonStaticMethod {

    int ans;

    public void addition (int a,int b) {
        ans = a + b;
        System.out.println(ans);
    }

    public static void main(String[] args) {

        NonStaticMethod x =new NonStaticMethod();

        x.addition(10,20);
        x.addition(50,60);

    }
}
