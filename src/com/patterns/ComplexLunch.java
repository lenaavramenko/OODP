package com.patterns;

import com.patterns.menu.Desert;
import com.patterns.menu.MainCourse;
import com.patterns.menu.Soup;

public class ComplexLunch {

    private final MainCourse mainCourse;
    private final Soup soup;
    private final Desert desert;

    public ComplexLunch(MainCourse mainCourse, Soup soup, Desert desert) {
        this.mainCourse = mainCourse;
        this.soup = soup;
        this.desert = desert;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public Soup getSoup() {
        return soup;
    }

    public Desert getDesert() {
        return desert;
    }

    public void print() {
        System.out.println("Printing Complex Lunch information:");
        mainCourse.showDetails();
        soup.showDetails();
        desert.showDetails();
        System.out.println("------------------------------------");
    }

    /**
     * Builder for ComplexLunch. Builders can (and often are) be implemented as nested classes as well.
     */
    public static final class ComplexLunchBuilder {

        private MainCourse mainCourse;
        private Soup soup;
        private Desert desert;

        ComplexLunchBuilder() {
        }

        public static ComplexLunchBuilder aComplexLunch() {
            return new ComplexLunchBuilder();
        }

        public ComplexLunchBuilder withSoup(Soup soup) {
            this.soup = soup;
            return this;
        }

        public ComplexLunchBuilder withMainCourse(MainCourse mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public ComplexLunchBuilder withDesert(Desert desert) {
            this.desert = desert;
            return this;
        }

        public ComplexLunch build() {
            return new ComplexLunch(mainCourse, soup, desert);
        }

    }
}
