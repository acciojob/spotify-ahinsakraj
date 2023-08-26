package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class SpotifyRepository {
    public HashMap<Artist, List<Album>> artistAlbumMap;
    public HashMap<Album, List<Song>> albumSongMap;
    public HashMap<Playlist, List<Song>> playlistSongMap;
    public HashMap<Playlist, List<User>> playlistListenerMap;
    public HashMap<User, Playlist> creatorPlaylistMap;
    public HashMap<User, List<Playlist>> userPlaylistMap;
    public HashMap<Song, List<User>> songLikeMap;

    public List<User> users;
    public List<Song> songs;
    public List<Playlist> playlists;
    public List<Album> albums;
    public List<Artist> artists;

    public SpotifyRepository(){
        //To avoid hitting apis multiple times, initialize all the hashmaps here with some dummy data
        artistAlbumMap = new HashMap<>();
        albumSongMap = new HashMap<>();
        playlistSongMap = new HashMap<>();
        playlistListenerMap = new HashMap<>();
        creatorPlaylistMap = new HashMap<>();
        userPlaylistMap = new HashMap<>();
        songLikeMap = new HashMap<>();

        users = new ArrayList<>();
        songs = new ArrayList<>();
        playlists = new ArrayList<>();
        albums = new ArrayList<>();
        artists = new ArrayList<>();
    }

    public boolean albumExists(String albumName) {
        for(Album album : albums) {
            if(album.getTitle().equals(albumName)) {
                return true;
            }
        }
        return false;
    }

    public boolean artistExists(String artistName) {
        for(Artist artist : artists) {
            if(artist.getName().equals(artistName)) {
                return true;
            }
        }
        return false;
    }

    public User createUser(String name, String mobile) {
        User user = new User(name, mobile);
        users.add(user);
        return  user;
    }

    public Artist createArtist(String name) {
        Artist artist = new Artist(name);
        artists.add(artist);
        return artist;
    }

    public Album createAlbum(String title, String artistName) {
        Album album = new Album(title);
        albums.add(album);
        return album;
    }

    public Song createSong(String title, String albumName, int length) throws Exception{

        return new Song();
    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        return new Playlist();
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {

        return new Playlist();
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {

        return new Playlist();
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {

        return new Song();
    }

    public String mostPopularArtist() {
        return "volcano";
    }

    public String mostPopularSong() {
        return "Seven Rings";
    }


}
