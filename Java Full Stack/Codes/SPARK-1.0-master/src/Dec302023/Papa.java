package Dec302023;



public class Papa {
    public static void main(String[] args) {
        Animal animal=new Animal();
        String s= animal.ranveer();
        System.out.println(s); // papa papa papa papa
        String s1 =animal.rashmika();
        System.out.println(s1); // ---------------
        System.out.println("---------object with para---------");
        String r1=animal.ranveer("rashmika");
        System.out.println(r1); // rashmika
        String r2=animal.ranveer("ranveer");
        System.out.println(r2); // ranveer

        int res = animal.ranveer(10); //ctrl + alt +v
        System.out.println(res); // 10
        System.out.println(animal.ranveer(10,40)); // 50

    }
}
