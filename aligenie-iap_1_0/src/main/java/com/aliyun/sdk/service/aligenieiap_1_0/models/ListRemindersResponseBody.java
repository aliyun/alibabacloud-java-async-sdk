// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

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
 * {@link ListRemindersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemindersResponseBody</p>
 */
public class ListRemindersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRemindersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemindersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMsg; 
        private Model model; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRemindersResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.model = model.model;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRemindersResponseBody build() {
            return new ListRemindersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemindersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemindersResponseBody</p>
     */
    public static class RecurrenceRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("DaysOfMonth")
        private java.util.List<Integer> daysOfMonth;

        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("EndDateTime")
        private String endDateTime;

        @com.aliyun.core.annotation.NameInMap("Freq")
        private String freq;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        @com.aliyun.core.annotation.NameInMap("StartDateTime")
        private String startDateTime;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private RecurrenceRule(Builder builder) {
            this.day = builder.day;
            this.daysOfMonth = builder.daysOfMonth;
            this.daysOfWeek = builder.daysOfWeek;
            this.endDateTime = builder.endDateTime;
            this.freq = builder.freq;
            this.hour = builder.hour;
            this.minute = builder.minute;
            this.month = builder.month;
            this.second = builder.second;
            this.startDateTime = builder.startDateTime;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceRule create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
            return this.day;
        }

        /**
         * @return daysOfMonth
         */
        public java.util.List<Integer> getDaysOfMonth() {
            return this.daysOfMonth;
        }

        /**
         * @return daysOfWeek
         */
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return endDateTime
         */
        public String getEndDateTime() {
            return this.endDateTime;
        }

        /**
         * @return freq
         */
        public String getFreq() {
            return this.freq;
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return second
         */
        public Integer getSecond() {
            return this.second;
        }

        /**
         * @return startDateTime
         */
        public String getStartDateTime() {
            return this.startDateTime;
        }

        /**
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private java.util.List<Integer> daysOfMonth; 
            private java.util.List<Integer> daysOfWeek; 
            private String endDateTime; 
            private String freq; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer second; 
            private String startDateTime; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(RecurrenceRule model) {
                this.day = model.day;
                this.daysOfMonth = model.daysOfMonth;
                this.daysOfWeek = model.daysOfWeek;
                this.endDateTime = model.endDateTime;
                this.freq = model.freq;
                this.hour = model.hour;
                this.minute = model.minute;
                this.month = model.month;
                this.second = model.second;
                this.startDateTime = model.startDateTime;
                this.year = model.year;
            } 

            /**
             * Day.
             */
            public Builder day(Integer day) {
                this.day = day;
                return this;
            }

            /**
             * DaysOfMonth.
             */
            public Builder daysOfMonth(java.util.List<Integer> daysOfMonth) {
                this.daysOfMonth = daysOfMonth;
                return this;
            }

            /**
             * DaysOfWeek.
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * EndDateTime.
             */
            public Builder endDateTime(String endDateTime) {
                this.endDateTime = endDateTime;
                return this;
            }

            /**
             * Freq.
             */
            public Builder freq(String freq) {
                this.freq = freq;
                return this;
            }

            /**
             * Hour.
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Second.
             */
            public Builder second(Integer second) {
                this.second = second;
                return this;
            }

            /**
             * StartDateTime.
             */
            public Builder startDateTime(String startDateTime) {
                this.startDateTime = startDateTime;
                return this;
            }

            /**
             * Year.
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public RecurrenceRule build() {
                return new RecurrenceRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRemindersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemindersResponseBody</p>
     */
    public static class RemindResponses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionTopic")
        private String actionTopic;

        @com.aliyun.core.annotation.NameInMap("DayDesc")
        private String dayDesc;

        @com.aliyun.core.annotation.NameInMap("RecurrenceRule")
        private RecurrenceRule recurrenceRule;

        @com.aliyun.core.annotation.NameInMap("RemindId")
        private Long remindId;

        @com.aliyun.core.annotation.NameInMap("RemindTime")
        private String remindTime;

        @com.aliyun.core.annotation.NameInMap("RepeatCount")
        private Integer repeatCount;

        @com.aliyun.core.annotation.NameInMap("Week")
        private String week;

        private RemindResponses(Builder builder) {
            this.actionTopic = builder.actionTopic;
            this.dayDesc = builder.dayDesc;
            this.recurrenceRule = builder.recurrenceRule;
            this.remindId = builder.remindId;
            this.remindTime = builder.remindTime;
            this.repeatCount = builder.repeatCount;
            this.week = builder.week;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemindResponses create() {
            return builder().build();
        }

        /**
         * @return actionTopic
         */
        public String getActionTopic() {
            return this.actionTopic;
        }

        /**
         * @return dayDesc
         */
        public String getDayDesc() {
            return this.dayDesc;
        }

        /**
         * @return recurrenceRule
         */
        public RecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

        /**
         * @return remindId
         */
        public Long getRemindId() {
            return this.remindId;
        }

        /**
         * @return remindTime
         */
        public String getRemindTime() {
            return this.remindTime;
        }

        /**
         * @return repeatCount
         */
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        /**
         * @return week
         */
        public String getWeek() {
            return this.week;
        }

        public static final class Builder {
            private String actionTopic; 
            private String dayDesc; 
            private RecurrenceRule recurrenceRule; 
            private Long remindId; 
            private String remindTime; 
            private Integer repeatCount; 
            private String week; 

            private Builder() {
            } 

            private Builder(RemindResponses model) {
                this.actionTopic = model.actionTopic;
                this.dayDesc = model.dayDesc;
                this.recurrenceRule = model.recurrenceRule;
                this.remindId = model.remindId;
                this.remindTime = model.remindTime;
                this.repeatCount = model.repeatCount;
                this.week = model.week;
            } 

            /**
             * ActionTopic.
             */
            public Builder actionTopic(String actionTopic) {
                this.actionTopic = actionTopic;
                return this;
            }

            /**
             * DayDesc.
             */
            public Builder dayDesc(String dayDesc) {
                this.dayDesc = dayDesc;
                return this;
            }

            /**
             * RecurrenceRule.
             */
            public Builder recurrenceRule(RecurrenceRule recurrenceRule) {
                this.recurrenceRule = recurrenceRule;
                return this;
            }

            /**
             * RemindId.
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * RemindTime.
             */
            public Builder remindTime(String remindTime) {
                this.remindTime = remindTime;
                return this;
            }

            /**
             * RepeatCount.
             */
            public Builder repeatCount(Integer repeatCount) {
                this.repeatCount = repeatCount;
                return this;
            }

            /**
             * Week.
             */
            public Builder week(String week) {
                this.week = week;
                return this;
            }

            public RemindResponses build() {
                return new RemindResponses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRemindersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemindersResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemindResponses")
        private java.util.List<RemindResponses> remindResponses;

        private Model(Builder builder) {
            this.remindResponses = builder.remindResponses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return remindResponses
         */
        public java.util.List<RemindResponses> getRemindResponses() {
            return this.remindResponses;
        }

        public static final class Builder {
            private java.util.List<RemindResponses> remindResponses; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.remindResponses = model.remindResponses;
            } 

            /**
             * RemindResponses.
             */
            public Builder remindResponses(java.util.List<RemindResponses> remindResponses) {
                this.remindResponses = remindResponses;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
