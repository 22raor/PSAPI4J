package psapi.util;

public class Assignment {

  private double pointsReceived;
  private double totalPoints;
  private double percentGrade;
  private String letterGrade;
  private String name;
  private String[] flags;

  public Assignment(String name, double pointsReceived, double totalPoints, String letterGrade, String[] flags) {
    this.name = name;
    this.totalPoints = totalPoints;
    this.flags = flags;

    if (letterGrade != null && totalPoints > 0) {
      this.pointsReceived = pointsReceived;
      percentGrade = 100* pointsReceived / totalPoints;
      this.letterGrade = letterGrade;
    } else if (totalPoints == 0) {
      this.pointsReceived = pointsReceived;
      percentGrade = Double.NaN;
      this.letterGrade = "--";
    } else{
      this.letterGrade = "--";
    }
  }

    
}
