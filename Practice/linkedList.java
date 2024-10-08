package Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {

    public record  Place(String name, int dist){

        @Override
        public String toString() {
            return "{ name = '" + name + '\'' +
                    ", dist = " + dist + " } ";
        }
    }

    public static void main(String[] args) {
        LinkedList<Place> list = new LinkedList<>();
        testCase(list);

        printMenu();
        var iterator = list.listIterator();
        boolean quitLoop = false;
        Scanner sc = new Scanner(System.in);

        while(!quitLoop){
            System.out.println("Enter value ");
            String option = sc.nextLine().toLowerCase().substring(0,1);

            switch(option){
                case "f" :
                    if(iterator.hasNext()){
                        System.out.println("Forward Movement " + iterator.next());
                    } else {
                        System.out.println("Cannot go forward since this is the ending point");
                    }
                    break;
                case "b" :
                    if(iterator.hasPrevious()){
                        System.out.println("Backward Movement " + iterator.previous());
                    }else {
                        System.out.println("cannot go backward since this is the starting point");
                    }
                    break;
                case "l" :
                    for(var l : list){
                        System.out.println(l);
                    }
                    break;
                case "m" :
                    printMenu();
                    break;
                case "q" :
                    System.out.println("quiting");
                    quitLoop = true;
                    break;
                default:
                    quitLoop = true;
            }
        }
    }

    public static void testCase(LinkedList<Place> list){
        Place bangalore = new Place("Bangalore", 244);
        Place mysore = new Place("Mysore", 24);
        addPlace(list, bangalore);
        addPlace(list, mysore);
        addPlace(list, new Place("Bangalore", 244));
        addPlace(list, new Place("mysore", 24));
        addPlace(list, new Place("hubli", 254));
        addPlace(list, new Place("agra", 4255));
        list.addFirst(new Place("kashmir", 0));
        list.addLast(new Place("kanyakumari", 23435));
        System.out.println(list);
    }

    public static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

    public static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("List contains the duplicate element \n");
            return;
        }
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name)){
                System.out.println("Got duplicate place in case sensitive\n");
                return;
            }
        }
        int index = 0;
        for(var p : list){
            if(place.dist() < p.dist()){
                list.add(index, place);
                return;
            }
            index++;
        }
        list.add(place);
    }
}
