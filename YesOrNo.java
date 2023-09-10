class YesOrNo {
  // Creates a boolean called YON(returns true or false)
  public boolean YON(String input){
    // if the input has yea or capital Yas the boolean returns true.
    if (input.contains("Ya") || input.contains("ya") || input.contains("si") || input.contains("Si") || input.contains("fr") || input.contains("Fr")|| input.contains("mhm") || input.contains("MHM") || input.contains("Mhm") || input.contains("mHm") || input.contains("Ye") || input.contains("ye")){
      return true;
    // if input doesn't then it returns false
    }else
      return false;
  }
}
