public non-sealed class Salesman extends Employee {

   // public final class Salesman extends Employee {

    // non-sealed foi declaracao pois as classes que fazem parte das sealed devem ser final, sealed ou non-sealed

    //Class final não pode ser extendida


    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
