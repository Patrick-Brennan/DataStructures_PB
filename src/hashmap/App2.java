package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class Person extends Object{
    String name;
    String age;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Account{
    String accNo;
    double balance;

    public Account(String accNo) {
        this.accNo = accNo;
    }
}

public class App2 {

    //HashSet, Tree, Stack and Queue
    //SORT
    //Design patterns : Singleton and factory and mvc and decorator

    public static void main(String[] args) {
        HashMap<Person, List<Account>> personAccounts = new HashMap<>();
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("11111"));
        accounts.add(new Account("22222"));

        personAccounts.put(new Person("A"), accounts);

        //hashcollision
        // whenever 2 objects are equals their hashcode needs to be equals
        //whenever 2 objects have the same hashcode, they can be equal or not
    }
}
