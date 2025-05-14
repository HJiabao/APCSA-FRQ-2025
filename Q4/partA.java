public SumOrSameGame(int numRows, int numCols){
  puzzle = new int[numRows][numCols];
  for(int i=0;i<puzzle.length;i++){
    for(int j=0;j<puzzle[i].length;j++{
      puzzle[i][j]=(int) (Math.random() * 9) + 1;
    }
  }
}
