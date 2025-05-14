public Arraylist<Match> buildMatches(){
  int i=0;
  int j=competitorList.size()-1;
  ArrayList<Match> matches = new ArrayList<Match>();
  if(j+1 % 2 == 1){
    i++;
  }
  while(i != (j+1)/2){
    Match temp= new Match(competitorList.get(i),competitorList.get(j));
    matches.add(temp);
    i++;
    j--:
  }
  return matches;
}
