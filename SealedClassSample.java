//sealed class
sealed class A permits B,C{}
final class B extends A{}
sealed class C extends A permits D{}
final class D extends C{}

sealed interface S permits T{}
non-sealed interface T extends S{}

public class SealedClassSample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}