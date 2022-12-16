public class Song {

    private String title;       // song title
    private double duration;    // length of song

    //song type
    //singer

    public Song(String title, double duration) {     // constructor
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


//  in order to print object in form of string we use toString in-build method.
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}



