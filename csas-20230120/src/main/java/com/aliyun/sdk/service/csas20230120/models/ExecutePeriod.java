// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ExecutePeriod} extends {@link TeaModel}
 *
 * <p>ExecutePeriod</p>
 */
public class ExecutePeriod extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EffectDay")
    private EffectDay effectDay;

    @com.aliyun.core.annotation.NameInMap("EffectTime")
    private EffectTime effectTime;

    @com.aliyun.core.annotation.NameInMap("ScheduleEffect")
    private ScheduleEffect scheduleEffect;

    @com.aliyun.core.annotation.NameInMap("ValidType")
    private String validType;

    private ExecutePeriod(Builder builder) {
        this.effectDay = builder.effectDay;
        this.effectTime = builder.effectTime;
        this.scheduleEffect = builder.scheduleEffect;
        this.validType = builder.validType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecutePeriod create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectDay
     */
    public EffectDay getEffectDay() {
        return this.effectDay;
    }

    /**
     * @return effectTime
     */
    public EffectTime getEffectTime() {
        return this.effectTime;
    }

    /**
     * @return scheduleEffect
     */
    public ScheduleEffect getScheduleEffect() {
        return this.scheduleEffect;
    }

    /**
     * @return validType
     */
    public String getValidType() {
        return this.validType;
    }

    public static final class Builder {
        private EffectDay effectDay; 
        private EffectTime effectTime; 
        private ScheduleEffect scheduleEffect; 
        private String validType; 

        private Builder() {
        } 

        private Builder(ExecutePeriod model) {
            this.effectDay = model.effectDay;
            this.effectTime = model.effectTime;
            this.scheduleEffect = model.scheduleEffect;
            this.validType = model.validType;
        } 

        /**
         * EffectDay.
         */
        public Builder effectDay(EffectDay effectDay) {
            this.effectDay = effectDay;
            return this;
        }

        /**
         * EffectTime.
         */
        public Builder effectTime(EffectTime effectTime) {
            this.effectTime = effectTime;
            return this;
        }

        /**
         * ScheduleEffect.
         */
        public Builder scheduleEffect(ScheduleEffect scheduleEffect) {
            this.scheduleEffect = scheduleEffect;
            return this;
        }

        /**
         * ValidType.
         */
        public Builder validType(String validType) {
            this.validType = validType;
            return this;
        }

        public ExecutePeriod build() {
            return new ExecutePeriod(this);
        } 

    } 

    /**
     * 
     * {@link ExecutePeriod} extends {@link TeaModel}
     *
     * <p>ExecutePeriod</p>
     */
    public static class EffectDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Friday")
        private Boolean friday;

        @com.aliyun.core.annotation.NameInMap("Monday")
        private Boolean monday;

        @com.aliyun.core.annotation.NameInMap("Saturday")
        private Boolean saturday;

        @com.aliyun.core.annotation.NameInMap("Sunday")
        private Boolean sunday;

        @com.aliyun.core.annotation.NameInMap("Thursday")
        private Boolean thursday;

        @com.aliyun.core.annotation.NameInMap("Tuesday")
        private Boolean tuesday;

        @com.aliyun.core.annotation.NameInMap("Wednesday")
        private Boolean wednesday;

        private EffectDay(Builder builder) {
            this.friday = builder.friday;
            this.monday = builder.monday;
            this.saturday = builder.saturday;
            this.sunday = builder.sunday;
            this.thursday = builder.thursday;
            this.tuesday = builder.tuesday;
            this.wednesday = builder.wednesday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectDay create() {
            return builder().build();
        }

        /**
         * @return friday
         */
        public Boolean getFriday() {
            return this.friday;
        }

        /**
         * @return monday
         */
        public Boolean getMonday() {
            return this.monday;
        }

        /**
         * @return saturday
         */
        public Boolean getSaturday() {
            return this.saturday;
        }

        /**
         * @return sunday
         */
        public Boolean getSunday() {
            return this.sunday;
        }

        /**
         * @return thursday
         */
        public Boolean getThursday() {
            return this.thursday;
        }

        /**
         * @return tuesday
         */
        public Boolean getTuesday() {
            return this.tuesday;
        }

        /**
         * @return wednesday
         */
        public Boolean getWednesday() {
            return this.wednesday;
        }

        public static final class Builder {
            private Boolean friday; 
            private Boolean monday; 
            private Boolean saturday; 
            private Boolean sunday; 
            private Boolean thursday; 
            private Boolean tuesday; 
            private Boolean wednesday; 

            private Builder() {
            } 

            private Builder(EffectDay model) {
                this.friday = model.friday;
                this.monday = model.monday;
                this.saturday = model.saturday;
                this.sunday = model.sunday;
                this.thursday = model.thursday;
                this.tuesday = model.tuesday;
                this.wednesday = model.wednesday;
            } 

            /**
             * Friday.
             */
            public Builder friday(Boolean friday) {
                this.friday = friday;
                return this;
            }

            /**
             * Monday.
             */
            public Builder monday(Boolean monday) {
                this.monday = monday;
                return this;
            }

            /**
             * Saturday.
             */
            public Builder saturday(Boolean saturday) {
                this.saturday = saturday;
                return this;
            }

            /**
             * Sunday.
             */
            public Builder sunday(Boolean sunday) {
                this.sunday = sunday;
                return this;
            }

            /**
             * Thursday.
             */
            public Builder thursday(Boolean thursday) {
                this.thursday = thursday;
                return this;
            }

            /**
             * Tuesday.
             */
            public Builder tuesday(Boolean tuesday) {
                this.tuesday = tuesday;
                return this;
            }

            /**
             * Wednesday.
             */
            public Builder wednesday(Boolean wednesday) {
                this.wednesday = wednesday;
                return this;
            }

            public EffectDay build() {
                return new EffectDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecutePeriod} extends {@link TeaModel}
     *
     * <p>ExecutePeriod</p>
     */
    public static class EffectTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private EffectTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectTime create() {
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

            private Builder() {
            } 

            private Builder(EffectTime model) {
                this.end = model.end;
                this.start = model.start;
            } 

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

            public EffectTime build() {
                return new EffectTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecutePeriod} extends {@link TeaModel}
     *
     * <p>ExecutePeriod</p>
     */
    public static class ScheduleEffect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Frequency")
        private String frequency;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        private ScheduleEffect(Builder builder) {
            this.frequency = builder.frequency;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleEffect create() {
            return builder().build();
        }

        /**
         * @return frequency
         */
        public String getFrequency() {
            return this.frequency;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private String frequency; 
            private Long interval; 

            private Builder() {
            } 

            private Builder(ScheduleEffect model) {
                this.frequency = model.frequency;
                this.interval = model.interval;
            } 

            /**
             * Frequency.
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            public ScheduleEffect build() {
                return new ScheduleEffect(this);
            } 

        } 

    }
}
