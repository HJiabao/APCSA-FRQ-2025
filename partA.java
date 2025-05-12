public int walkDogs(int hour){
        int amount=this.numAvailableDogs(hour);
        if(amount>=maxDogs){
            amount=maxDogs;
        }
        updateDogs(hour,amount);
        return amount;
    }
