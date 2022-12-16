import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumName;
    private String artistName;

    ArrayList <Song> songsList;              // song class type song list

    public Album(String albumName, String artistName) {  // constructor
        this.albumName = albumName;
        this.artistName = artistName;
        this.songsList = new ArrayList<>();
        // initialize songs list here because when we create album then only crete playlist
    }
    public boolean findSong(String title)
    {
       for (Song song : songsList) {        // iterate and find in song list
           if (song.getTitle().equals(title)) {
               return true;
           }
       }
        return false;
    }
    public void addSongToAlbum(String title, double duration)
    {
        // making sure that song already exist in album or not
        if(findSong(title)) // if present --> dont add...
        {
            System.out.println("This song is already exist in album");
        }
        else {  // if not present --> add in album

            Song newSong = new Song(title,duration);   // object on song class and add
            songsList.add(newSong);                    // adding in album
            System.out.println("New song succesfully added");
        }
    }

    public void addToPlayListFromAlbum(int trackNo, LinkedList<Song> playList)  // adding by track number
    {
        int index = trackNo - 1;                   // because of 0 base indexing

        if (index >=0 && index < songsList.size()) {
            Song song = this.songsList.get(index);

            playList.add(song);
        }
    }
    public void addToPlayListFromAlbum(String title, LinkedList<Song> playList)  // adding by song title
    {
       for(Song song : this.songsList)   // itterating over songsList
       {
           if(song.getTitle().equals(title))  // if song tital is prasent --> add to playList
           {
               playList.add(song);
           }
       }
    }

}
