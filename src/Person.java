/**
 * Represents a Person with a name, surname, and tax code.
 * This class helps developers manage data of type "Person".
 * 
 * @author Foglia Mattia
 * @version 1.0
 * @since 21/01/2025
 */
public class Person {
    private String name;
    private String surname;
    private String taxCode;

    /**
     * Constructs an Person object with the given name, surname, and tax code.
     * The tax code is automatically converted to uppercase.
     *
     * tax code Validation:
     * <ul>
     *   <li>It must contain 16 alphanumeric characters.</li>
     *   <li>It must not contain spaces.</li>
     *   <li>The first 6 characters must be consonants.</li>
     *   <li>The 7th and 8th characters must be numbers.</li>
     * </ul>
     * 
     * Using the following code: 
     * {@code (taxCode == null || !taxCode.matches("[A-Z]{6}[0-9]{2}[A-Z0-9]{8}")}
     * @param name the name of the person
     * @param surname the surname of the person
     * @param taxCode the tax code of the person
     * @throws IllegalArgumentException if the tax code is invalid
     */
    public Person(String name, String surname, String taxCode) {
        this.name = name;
        this.surname = surname;
        this.taxCode = validateTaxCode(taxCode);
    }

    /**
     * Validates the tax code.
     * 
     * @param taxCode the tax code to validate
     * @return the validated tax code in uppercase
     * @throws IllegalArgumentException if the tax code is invalid
     */
    private String validateTaxCode(String taxCode) {
        if (taxCode == null || !taxCode.matches("^[A-Z]{6}[0-9]{2}[A-Z0-9]{8}$")) {
            throw new IllegalArgumentException("Codice fiscale non valido");
        }
        return taxCode.toUpperCase();
    }
    
    /**
     * Gets the name of the person.
     *
     * @return the name of the person
     */
    public String getname() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * Gets the surname of the person.
     *
     * @return the surname of the person
     */
    public String getsurname() {
        return surname;
    }

    /**
     * Sets the surname of the person.
     *
     * @param surname the new surname of the person
     */
    public void setsurname(String surname) {
        this.surname = surname;
    }

    /**
     * Checks if this person has the same name as another person.
     * The comparison is case-insensitive.
     *
     * @param p the person to compare
     * @return true if both Persons have the same name; false otherwise
     */
    public boolean hasSamename(Person p) {
        return this.name.equalsIgnoreCase(p.name);
    }

    /**
     * Returns a string representation of the person in the format:
     * "name: xx surname: xx tax code: xx".
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "NAME: " + name + " SURNAME: " + surname + " TAX CODE: " + taxCode;
    }
}
