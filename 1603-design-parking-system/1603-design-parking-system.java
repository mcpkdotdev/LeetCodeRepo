class ParkingSystem {
    
    private int bigLeft;
    private int mediumLeft;
    private int smallLeft;

    public ParkingSystem(int big, int medium, int small) {
        this.bigLeft = big;
        this.mediumLeft = medium;
        this.smallLeft = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if(bigLeft == 0){
                    return false;
                } else{
                    bigLeft -= 1;
                }
                break;
            case 2:
                if(mediumLeft == 0){
                    return false;
                } else{
                    mediumLeft -= 1;
                }
                break;
            case 3:
                if(smallLeft == 0){
                    return false;
                } else{
                    smallLeft -= 1;
                }
                
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */