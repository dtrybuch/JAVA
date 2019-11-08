abstract class Man {
    private final String name;
    private final String surname;

    public Man(String name,String surname)
    {
        this.name = new String(name);
        this.surname = new String(surname);
    }

    public String GetName()
    {
        return new String(name);
    }
    public String GetSurname()
    {
        return new String(surname);
    }

    // DOPISAC: toString zwracajacy lancuch z imieniem i nazwiskiem
    public String toString()
    {
        return new String(name + " " +surname);
    }

    abstract public Man compare(Man ob);

    public double average() {
        return 0.0;
    }
}

