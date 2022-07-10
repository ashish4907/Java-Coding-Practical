class test3{
  
    public static void main(String[] args){
        byte b = 10;
        short s =56;
        int i = 126;
        float f = 10.6f;

        double[] d = {b,s,i,f};       //!DataWidening
        for(int z=0;z<d.length;z++){
            System.out.println(d[z]);
        }


        byte[] l ={b,(byte)s,(byte)i,(byte)f};  //!DataNarrowing

        for(int j=0;j<l.length;j++){
            System.out.println(l[j]);
        }
    }

}