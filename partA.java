public int walkDogs(int hour){
        int amount=company.numAvailableDogs(hour);
        if(amount>=maxDogs){
            amount=maxDogs;
        }
        company.updateDogs(hour,amount);
        return amount;
    }
