public class testmahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("nurul dwi ariyanti",20);
        mhs.tampilkanbiodata();

        System.out.println();

        mhs.setOld (25);
        mhs.tampilkanbiodata();
    }
}