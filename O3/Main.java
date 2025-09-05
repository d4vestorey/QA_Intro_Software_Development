package Labs.O3;

public class Main {
    public static void main(String[] args) {
        //Game game = new Game();
        //LAB4
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Bruce Springsteen ");

        String name = "David";
        System.out.println(name.charAt(3)); //prints the 4th character (index starts at 0)
        System.out.println(name.toUpperCase()); //prints the name in upper case
        System.out.println(name.toLowerCase()); //prints the name in lower case

        for(char c : name.toCharArray()) {
            sb.append(c + "\t");
        }
        System.out.println(sb.toString());

        name.startsWith("D"); //true
        boolean t = name.endsWith("p"); //false
        System.out.println(t);

        name.indexOf("D"); //0
        name.indexOf("f"); //-1

        String fullname = name + " Storey";
        System.out.println(fullname);

        sb2.append("is the artist ever");
        
        System.out.println(sb2.toString());

        int indexof = sb2.indexOf("artist");
        System.out.println(indexof);
        sb2.insert(25,"greatest ");
        System.out.println(sb2.toString());
        int indexof2 = sb2.indexOf("artist");
        System.out.println(indexof2);
        sb2.replace(34,40,"rocker");
        System.out.println(sb2.toString());


    }
}
