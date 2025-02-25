// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WafTimer} extends {@link TeaModel}
 *
 * <p>WafTimer</p>
 */
public class WafTimer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Periods")
    private java.util.List<Periods> periods;

    @com.aliyun.core.annotation.NameInMap("Scopes")
    private String scopes;

    @com.aliyun.core.annotation.NameInMap("WeeklyPeriods")
    private java.util.List<WeeklyPeriods> weeklyPeriods;

    @com.aliyun.core.annotation.NameInMap("Zone")
    private Integer zone;

    private WafTimer(Builder builder) {
        this.periods = builder.periods;
        this.scopes = builder.scopes;
        this.weeklyPeriods = builder.weeklyPeriods;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafTimer create() {
        return builder().build();
    }

    /**
     * @return periods
     */
    public java.util.List<Periods> getPeriods() {
        return this.periods;
    }

    /**
     * @return scopes
     */
    public String getScopes() {
        return this.scopes;
    }

    /**
     * @return weeklyPeriods
     */
    public java.util.List<WeeklyPeriods> getWeeklyPeriods() {
        return this.weeklyPeriods;
    }

    /**
     * @return zone
     */
    public Integer getZone() {
        return this.zone;
    }

    public static final class Builder {
        private java.util.List<Periods> periods; 
        private String scopes; 
        private java.util.List<WeeklyPeriods> weeklyPeriods; 
        private Integer zone; 

        /**
         * Periods.
         */
        public Builder periods(java.util.List<Periods> periods) {
            this.periods = periods;
            return this;
        }

        /**
         * Scopes.
         */
        public Builder scopes(String scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * WeeklyPeriods.
         */
        public Builder weeklyPeriods(java.util.List<WeeklyPeriods> weeklyPeriods) {
            this.weeklyPeriods = weeklyPeriods;
            return this;
        }

        /**
         * Zone.
         */
        public Builder zone(Integer zone) {
            this.zone = zone;
            return this;
        }

        public WafTimer build() {
            return new WafTimer(this);
        } 

    } 

    /**
     * 
     * {@link WafTimer} extends {@link TeaModel}
     *
     * <p>WafTimer</p>
     */
    public static class Periods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Periods(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Periods create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Periods build() {
                return new Periods(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafTimer} extends {@link TeaModel}
     *
     * <p>WafTimer</p>
     */
    public static class DailyPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private DailyPeriods(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyPeriods create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public DailyPeriods build() {
                return new DailyPeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafTimer} extends {@link TeaModel}
     *
     * <p>WafTimer</p>
     */
    public static class WeeklyPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyPeriods")
        private java.util.List<DailyPeriods> dailyPeriods;

        @com.aliyun.core.annotation.NameInMap("Days")
        private String days;

        private WeeklyPeriods(Builder builder) {
            this.dailyPeriods = builder.dailyPeriods;
            this.days = builder.days;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeeklyPeriods create() {
            return builder().build();
        }

        /**
         * @return dailyPeriods
         */
        public java.util.List<DailyPeriods> getDailyPeriods() {
            return this.dailyPeriods;
        }

        /**
         * @return days
         */
        public String getDays() {
            return this.days;
        }

        public static final class Builder {
            private java.util.List<DailyPeriods> dailyPeriods; 
            private String days; 

            /**
             * DailyPeriods.
             */
            public Builder dailyPeriods(java.util.List<DailyPeriods> dailyPeriods) {
                this.dailyPeriods = dailyPeriods;
                return this;
            }

            /**
             * Days.
             */
            public Builder days(String days) {
                this.days = days;
                return this;
            }

            public WeeklyPeriods build() {
                return new WeeklyPeriods(this);
            } 

        } 

    }
}
