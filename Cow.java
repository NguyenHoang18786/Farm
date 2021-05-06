package Farm;

public class Cow extends Animals {

    double milk;

    public Cow() {
    }

    public Cow(String ID, double weight, int age) {
        this.ID = ID;
        this.Weight = weight;
        this.Age = age;
    }

    public double milkPerDay() {
        if (Age >= 2 && Age <= 5 )
        {
            milk = (Weight - Age) / 10;
        }
        else
        {
            milk = 0;
        }
        return milk;
    }

    public void display() {
        System.out.println("ID: " + this.ID + " Age: " + this.Age);
        System.out.println("Amount of milk per day: " + milkPerDay());
    }

    @Override
    public String toString() {
        return "Cow " + ID + " ,Weight: " + Weight + " ,Age:" + Age + " ||";
    }
}
