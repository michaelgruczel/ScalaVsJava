package java;

public class JavaTimeSheetEntry {

    private String name;
    private int minutes;

    public JavaTimeSheetEntry() {
        this.name = "unknown";
        this.minutes = 0;
    }

    public JavaTimeSheetEntry(String name) {
        this.name = name;
        this.minutes = 0;
    }

    public JavaTimeSheetEntry(int minutes) {
        this.name = "unknown";
        this.minutes = minutes;
    }

    public JavaTimeSheetEntry(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaTimeSheetEntry add(JavaTimeSheetEntry that) {
        return new JavaTimeSheetEntry(this.getName(), this.getMinutes() + that.getMinutes());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        JavaTimeSheetEntry that = (JavaTimeSheetEntry) object;

        if (minutes != that.minutes) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + minutes;
        return result;
    }

    @Override
    public String toString() {
        return "JavaTimeSheetEntry{" +
                "name='" + name + '\'' +
                ", minutes=" + minutes +
                '}';
    }

}

