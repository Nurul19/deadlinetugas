public class mahasiswa {
    private String name;
    private int old;

    public mahasiswa(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public void tampilkanbiodata(){
        System.out.println("-----biodata mahasiswa-----");
        System.out.println("name mahasiswa="+name);
        System.out.println("old mahasiswa="+old);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

}