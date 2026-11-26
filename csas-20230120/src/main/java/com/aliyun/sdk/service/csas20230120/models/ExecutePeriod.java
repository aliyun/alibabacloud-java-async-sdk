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
         * <p>The effective days of the week configuration. This parameter is used when ValidType is set to Weekly.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Monday&quot;:true,&quot;Tuesday&quot;:true,&quot;Wednesday&quot;:true,&quot;Thursday&quot;:true,&quot;Friday&quot;:true,&quot;Saturday&quot;:false,&quot;Sunday&quot;:false}</p>
         */
        public Builder effectDay(EffectDay effectDay) {
            this.effectDay = effectDay;
            return this;
        }

        /**
         * <p>The daily effective time range. Both Start and End use the 24-hour HH:mm format and are interpreted based on the current system time zone of the server. The time range cannot span across days.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Start&quot;:&quot;00:00&quot;,&quot;End&quot;:&quot;23:59&quot;}</p>
         */
        public Builder effectTime(EffectTime effectTime) {
            this.effectTime = effectTime;
            return this;
        }

        /**
         * <p>The frequency and interval configuration for periodic execution. Frequency and Interval together specify the execution cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Frequency&quot;:&quot;day&quot;,&quot;Interval&quot;:1}</p>
         */
        public Builder scheduleEffect(ScheduleEffect scheduleEffect) {
            this.scheduleEffect = scheduleEffect;
            return this;
        }

        /**
         * <p>The execution cycle mode. Valid values:</p>
         * <ul>
         * <li><strong>Once</strong>: Single execution mode. Used in combination with ExecuteMode=Once.</li>
         * <li><strong>Interval</strong>: Periodic execution at a specified frequency. Used in combination with ExecuteMode=Schedule.</li>
         * <li><strong>Weekly</strong>: Execution on selected days of the week. Used in combination with ExecuteMode=Schedule and EffectDay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Interval</p>
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
             * <p>Specifies whether the policy takes effect on Friday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder friday(Boolean friday) {
                this.friday = friday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Monday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder monday(Boolean monday) {
                this.monday = monday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Saturday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder saturday(Boolean saturday) {
                this.saturday = saturday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Sunday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sunday(Boolean sunday) {
                this.sunday = sunday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Thursday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder thursday(Boolean thursday) {
                this.thursday = thursday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Tuesday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tuesday(Boolean tuesday) {
                this.tuesday = tuesday;
                return this;
            }

            /**
             * <p>Specifies whether the policy takes effect on Wednesday when ValidType is set to Weekly. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The end time of the daily effective time range. It uses the 24-hour HH:mm format and is interpreted based on the current system time zone of the server. The value cannot be earlier than Start.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The start time of the daily effective time range. It uses the 24-hour HH:mm format and is interpreted based on the current system time zone of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
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
             * <p>The frequency unit for periodic execution. This parameter is used together with Interval to specify the execution cycle. For example, a value of day indicates daily execution.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The periodic execution interval. When Frequency is set, valid values are 1 to 10000. The unit is determined by Frequency. For example, if Frequency is set to day and Interval is set to 1, the execution interval is one day.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
