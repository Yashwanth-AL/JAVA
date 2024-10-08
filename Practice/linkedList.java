package Practice;

import java.util.LinkedList;

public class linkedList {
    record  Place(String name, int dist){

        @Override
        public String toString() {
            return "{ name = '" + name + '\'' +
                    ", dist = " + dist + " } ";
        }
    }
    public static void main(String[] args) {
        LinkedList<Place> list = new LinkedList<>();
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
