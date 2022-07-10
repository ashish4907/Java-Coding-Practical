class A{

}
class B extends A{

}
class C extends B{

}

class test{
    public static void main(String[] args){
        A a = new B();  //! Upcasting
        System.out.println(a.getClass());

        B b = (B)a;   //! Downcasting
        System.out.println(b.getClass());

        A a1 = new A();
        C c =(C)a1;   //! ClassCastException
    }
}