package Lab2.task3;

import java.util.Objects;

public class Mark {
    private int mark;

    public Mark() {

    }

    public Mark(final int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Mark mark1 = (Mark) o;
        return getMark() == mark1.getMark();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark());
    }

    @Override
    public String toString() {
        return "Mark: " + getMark();
    }
}
