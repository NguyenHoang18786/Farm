package Farm;

public class Goat extends Animals {

    double milk;

    public Goat() {
    }

    public Goat(String ID, double weight, int age) {
        this.ID = ID;
        this.Weight = weight;
        this.Age = age;
    }

    public double milkPerDay() {
        if (Age >= 1 && Age <= 2 )
        {
            milk = Weight / 10;
        }
        else if (Age > 2 && Age <= 4 )
        {
            milk = Weight / 15;
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
