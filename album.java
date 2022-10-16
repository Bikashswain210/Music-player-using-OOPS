package bikash;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<song>();
}
public Album(String name,String artist){
    this.name=name;
    this.artist=artist;
    this.songs =new ArrayList<songs>();

}
public Album() {
}
public song findsong(String title) {
    for (song checkedsong : songs) {
        if (checkedsong.getTitle().equals(title)) return checkedsong;

    }
    return null;
}
public boolean addsong(String title,double duration) {
    if (findsong(title) == null) {
        songs.add(new song(title, duration));
        System.out.println(title + "successfully added to the list");
        return true;
    } else {
        System.out.println("song with name " + title + "already exist in the list");
        return false;
    }
}
public boolean addToplaylist(int trackNumber, LinkedList<song> playList) {
int index = trackNumber-1;
if(index>0 && index <=this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
}
System.out.println("this album does not have song with tracknumber"+trackNumber);
return false;
}
public boolean addToplayList(String title,LinkedList<song>playList) {
    for(song checkedsong : this.songs) {
     if(checkedsong.getTitle().equals(title)) {
      playList.add(checkedsong);
      return true;
     }
    }
System.out.println(title +"there is no such in album");
    return false;
}
}