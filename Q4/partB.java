public boolean clearPair(int row, int col){
  for(int i=row;puzzle.length;i++){
    for(int j=0;puzzle[i].length;j++){
      if(puzzle[i][j]==puzzle[row][col] || puzzle[i][j+puzzle[row][col]==10){
        puzzle[i][j]=0;
        puzzle[row][col]=0;
        return true;
      }
    }
  }
  return false;
}
