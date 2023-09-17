public class RewardValue {
 private int milesValue;
 private double cashValue;
 //miles constructor
 public RewardValue(int milesValue){
  this.milesValue = milesValue;
 }
 //cash constructor
 public RewardValue(double cashValue){
   this.cashValue = cashValue;
 }

 public double getCashValue(){
  return milesValue/0.0035;
 }
 public double getMilesValue(){
  return 0.0035*cashValue;
 }
}
