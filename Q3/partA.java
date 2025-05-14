public Round(String[] name){
  competitorlist = new Arraylist<Competitor>();
  for(int i=0;i<name.length;i++){
    Competitor temp = new Competitor(name[i],i+1);
    competitorlist.add(temp);
  }
}
