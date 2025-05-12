public int walkDogs(int hour){
        int amount=this.numAvailableDogs(hours);
        if(amount>=maxDogs){
            amount=maxDogs;
        }
        this.updateDogs(hour,amount);
        return amount;
    }
