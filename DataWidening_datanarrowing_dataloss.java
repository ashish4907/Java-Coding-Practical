class test4{
    public static void main(String[] args){
        byte b = 12;
        int i = b;
        System.out.println(i);  //!DataWidening


        long l= 10l;
        short s = (short)l;   //!DataNarrowing
        System.out.println(s);   

        float f = 20.4f;       //!DataLoss decimal to non-decimal
        int x = (int)f;
        System.out.println(x);

        int y = 128;        //!Dataloss non-decimal to non-decimal
        byte z = (byte)y;
        System.out.println(z);
    }
}