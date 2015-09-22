/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {

    private final String name;
    private final String surname;
    private final Date birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdyy() {
        return birthday;
    }

    public Person(String name, String surname, Date birthdyy) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthdyy;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {

        Date today = new Date();
        return (int) miMetodo(today.getTime() - birthday.getTime());

    }

    private long miMetodo(long millis) {

        return millis / MILLISECONDS_PER_YEAR;

    }
}
