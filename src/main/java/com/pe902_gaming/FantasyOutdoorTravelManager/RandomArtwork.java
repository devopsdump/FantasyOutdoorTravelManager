package com.pe902_gaming.FantasyOutdoorTravelManager;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArtwork
{
  private String ArtistName;
  private String Filename;
  private String TextAltTag;

  public RandomArtwork()
  {
    ArtistName = "unknown";
    Filename = "NewFile.jpg";
    TextAltTag = "Image of nothing";

    ArrayList<String[]> AvailableFileData = new ArrayList<String[]>();
    AvailableFileData.add(new String[]{"unknown", "FantasyWeatherElemental.jpg", "Storm-Weather elemental"});
    AvailableFileData.add(new String[]{"unknown", "Girl-Flowers-Storm.jpg", "Girl throwing flowers in gathering storm"});
    AvailableFileData.add(new String[]{"unknown", "GreatTreeNature.jpg", "Pilgrims approaching a massive tree"});
    AvailableFileData.add(new String[]{"unknown", "SnowStormWalker.jpg", "Traveler marching through a heavy snowfall"});
    AvailableFileData.add(new String[]{"unknown", "SuperCellMacroBurst.jpg", "Brutal beauty of a violent summer storm"});

    int ImageIndex = ThreadLocalRandom.current().nextInt(1, AvailableFileData.size()) -1;
    ArtistName = AvailableFileData[ImageIndex][0];
    Filename = AvailableFileData[ImageIndex][1];
    TextAltTag = AvailableFileData[ImageIndex][2];
  } // constructor RandomArtwork

  public String getArtistName() {return ArtistName; }
  public void setArtistName(String artistName) { ArtistName = artistName; }

  public String getFilename() {return Filename;}
  public void setFilename(String filename) {Filename = filename;}

  public String getTextAltTag() {return TextAltTag;}
  public void setTextAltTag(String textAltTag) {TextAltTag = textAltTag;}
} // end class RandomArtwork
