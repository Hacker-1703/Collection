public class Date {
    private int days;
    private int months;
    private int years;

    public int getDays() {
        return this.days;
    }

    public int getMonths() {
        return this.months;
    }

    public int getYears() {
        return this.years;
    }

    public void setDays(String type, int count) throws Exception {
        if (type.equals("add")) {
            this.days += count;
        } else if (type.equals("remove")) {
            this.days -= count;
        } else if (type.equals("assign")) {
            this.days = count;

        } else {
            throw new Exception("Неправильно выбран тип изменения переменной!");
        }
    }

    public void setMonths(String type, int count) throws Exception {
        if (type.equals("add")) {
            this.months += count;
        } else if (type.equals("remove")) {
            this.months -= count;
        } else if (type.equals("assign")) {
            this.months = count;

        } else {
            throw new Exception("Неправильно выбран тип изменения переменной!");
        }
    }

    public void setYears(String type, int count) throws Exception {
        if (type.equals("add")) {
            this.years += count;
        } else if (type.equals("remove")) {
            this.years -= count;
        } else if (type.equals("assign")) {
            this.years = count;

        } else {
            throw new Exception("Неправильно выбран тип изменения переменной!");
        }
    }

    public Date(int days, int months, int years) throws Exception {
        setDays("add", days);
        setMonths("add", months);
        setYears("add", years);
        showDate();
    }

    public Date() throws Exception {
        setDays("add", 1);
        setMonths("add", 1);
        setYears("add", 1);
        showDate();
    }

    public void addDays(int count) throws Exception {
        setDays("add", count);
        while (true) {
            if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12) {
                if (days <= 31) {
                    break;
                }
                setDays("remove", 31);
                addMonths(1);
            }
            if (months == 4 || months == 6 || months == 9 || months == 11) {
                if (days <= 30) {
                    break;
                }
                setDays("remove", 30);
                addMonths(1);
            }
            if (months == 2) {
                if (years % 4 == 0 && (years % 100 == 0 ? years % 400 == 0 : true)) {
                    if (days <= 29) {
                        break;
                    }
                    setDays("remove", 29);
                    addMonths(1);
                } else {
                    if (days <= 28) {
                        break;
                    }
                    setDays("remove", 28);
                    addMonths(1);
                }
            }
        }
    }

    public void addMonths(int count) throws Exception {
        setMonths("add", count);

        while (true) {
            if (months <= 12) {
                break;
            }
            setMonths("remove", 12);
            addYears(1);
        }
    }

    public void addYears(int count) throws Exception {
        setYears("add", count);
    }

    public void removeDays(int count) throws Exception {
        setDays("remove", count);
        while (true) {
            if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12) {
                if (days > 0) {
                    break;
                }
                setDays("add", 31);
                removeMonths(1);
            }

            if (months == 4 || months == 6 || months == 9 || months == 11) {
                if (days > 0) {
                    break;
                }
                setDays("add", 30);
                removeMonths(1);
            }
            if (months == 2) {
                if (years % 4 == 0 && (years % 100 == 0 ? years % 400 == 0 : true)) {
                    if (days > 29) {
                        break;
                    }
                    setDays("add", 29);
                    removeMonths(1);
                } else {
                    if (days > 28) {
                        break;
                    }
                    setDays("add", 28);
                    removeMonths(1);
                }
            }
        }
    }

    public void removeMonths(int count) throws Exception {
        setMonths("remove", count);
        if (months < 1) {
            setMonths("add", 12);
            removeYears(1);
        }
    }

    public void removeYears(int count) throws Exception {
        setYears("remove", count);
    }

    public void showDate() {
        System.out.println(getDays() + "." + getMonths() + "." + getYears());
    }

    public void setDate(int days, int months, int years) throws Exception {
        setDays("assign", days);
        setMonths("assign", months);
        setYears("assign", years);
    }

}