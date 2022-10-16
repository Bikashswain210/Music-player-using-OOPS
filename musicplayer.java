package bikash;

import java.util.*;

public class musicplayer{
    private static ArrayList<Album>albums=new ArrayList<>();

    public static void main(String[] args) {

        Album album=new Album(name "Album1",artist:"ac/dc");

        album.addsong(title:"TNT",duration:4.5);
        album.addsong(title:"highway",duration:3.5);
        album.addsong(title:"thunder",duration:5.5);

        album= new Album(name: "Album2",artist:"emienm");

        album.addsong(title:"red god",duration:4.5);
        album.addsong(title:"bad lier",duration:4.0);
        album.addsong(title:"bones",duration:3.5);

        albums.add(album)
     LinkedList<song>playList_1 = new LinkedList<>();
        albums.get(0).addToplayList(title:"TNT",playList_1);
        albums.get(0).addToplayList(title:"highway",playList_1);
        albums.get(0).addToplayList(title:"red god",playList_1);
        albums.get(0).addToplayList(title:"bad lier",playList_1);

       play(playList_1);

    }
    private static void play(LinkedList<song>playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<song> listIterator = playList.listIterator();
        if(playList.size() == 0){
         System.out.println("this playlist have no song");

        }else{
            System.out.println("now playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = sc.nextint();
            sc.nextline();

            switch (action) {
                case 0
                    ;
                    System.out.println("playlist is complete");
                    quite = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();

                        }
                        forward = true;

                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now playing" + listIterator.next().toString());

                    } else {
                        System.out.println("no song available , reached to the end of the list");
                        forward = false;

                    }
                case 2:
                    if (!forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();

                        }
                        forward = false;

                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now playing" + listIterator.previous().toString());

                    } else {
                        System.out.println("we are the first song");
                        forward = false;
                    }
                    break;
                case 2:
                    if (!forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();

                        }
                        forward = false;

                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now playing" + listIterator.previous().toString());

                    } else {
                        System.out.println("we are the first song");
                        forward = false;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                                  System.out.println("now playing"+listIterator.previous().toString());
                                  forward=false;
                        }else{
                        System.out.println("we are at the start of the list");

                    }else{
                    if (listIterator.hasNext()) {
                        System.out.println("now playing" + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("we have end of the list ");
                    }
            }
           break;
                        case 4:
                            printList(playList);
                            break;
                        case 5:
                            printMenu();
                            break;
                        case 6:
                            if(playList.size() >0){
                            listIterator.remove();
                            if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                            forward=true;
                            }
                            else {
                                if (listIterator.hasPrevious())
                                    System.out.println("now playing " + listIterator.hasPrevious().toStrin());
                            }
                            }
                            }
                    }
        }
    }
   private static void printMenu(){
        System.out.println("available option");

       System.out.println("0.. to quite\n"+"1--play next song\n"+"2--play previous song\n"+"3-- to replay the current song\n"
       +"4-- list of all song\n"+"5--print the all song\n"+"6--delete current song");

   }
   private static void printList(LinkedList<songs>playList){
       Iterator<song> iterator = playList.iterator();
       System.out.println("--------------------");

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
       System.out.println("--------------------");
   }
}
