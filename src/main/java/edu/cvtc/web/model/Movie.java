/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author hstockdill
 *
 * This class represents a Movie object in our system.
 * 
 */
public class Movie implements Serializable {

  private static final long serialVersionUID = -924777929505524179L;
  
  private String title;
  private String director;
  private Integer lengthInMinutes;
  private String imageURL;
  private String playURL;
  
  public Movie() {
    
  }
  
  public Movie(String movieName, String directorName, Integer playTime, String imageURL, String playURL) {
    super();
    this.title = movieName;
    this.director = directorName;
    this.lengthInMinutes = playTime;
    this.imageURL = imageURL;
    this.playURL = playURL;
  }
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }

  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getPlayURL() {
    return playURL;
  }

  public void setPlayURL(String playURL) {
    this.playURL = playURL;
  }


  @Override
  public String toString() {
    return "Movie [title=" + title + ", director=" + director + ", lengthInMinutes=" + lengthInMinutes + ", imageURL="
        + imageURL + ", playURL=" + playURL + "]";
  }

  
}
