package Farm;

public abstract class Animals {
    String ID;
    double Weight;
    int Age;

    //define abstract method to calculate amount of milk
    public abstract double milkPerDay();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        this.Weight = weight;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }
}
