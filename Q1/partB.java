public int dogWalkShift(int startHour, int endHour){
        int amount=0;
        for(int i=startHour;i<=endHour;i++){
            if(walkDogs(i) == maxDogs || (i>=9 && i<=17)){
                amount+=3;
            }
            amount+= walkDogs(i)*5;
        }
        return amount;
    }
