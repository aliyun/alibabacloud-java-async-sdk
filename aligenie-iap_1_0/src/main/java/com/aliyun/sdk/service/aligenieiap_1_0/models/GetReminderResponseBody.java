// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReminderResponseBody} extends {@link TeaModel}
 *
 * <p>GetReminderResponseBody</p>
 */
public class GetReminderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Model")
    private Model model;

    @NameInMap("Success")
    private Boolean success;

    private GetReminderResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReminderResponseBody create() {
        return builder().build();
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

        public GetReminderResponseBody build() {
            return new GetReminderResponseBody(this);
        } 

    } 

    public static class RecurrenceRule extends TeaModel {
        @NameInMap("Day")
        private Integer day;

        @NameInMap("DaysOfMonth")
        private java.util.List < Integer > daysOfMonth;

        @NameInMap("DaysOfWeek")
        private java.util.List < Integer > daysOfWeek;

        @NameInMap("EndDateTime")
        private String endDateTime;

        @NameInMap("Freq")
        private String freq;

        @NameInMap("Hour")
        private Integer hour;

        @NameInMap("Minute")
        private Integer minute;

        @NameInMap("Month")
        private Integer month;

        @NameInMap("Second")
        private Integer second;

        @NameInMap("StartDateTime")
        private String startDateTime;

        @NameInMap("Year")
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
        public java.util.List < Integer > getDaysOfMonth() {
            return this.daysOfMonth;
        }

        /**
         * @return daysOfWeek
         */
        public java.util.List < Integer > getDaysOfWeek() {
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
            private java.util.List < Integer > daysOfMonth; 
            private java.util.List < Integer > daysOfWeek; 
            private String endDateTime; 
            private String freq; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer second; 
            private String startDateTime; 
            private Integer year; 

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
            public Builder daysOfMonth(java.util.List < Integer > daysOfMonth) {
                this.daysOfMonth = daysOfMonth;
                return this;
            }

            /**
             * DaysOfWeek.
             */
            public Builder daysOfWeek(java.util.List < Integer > daysOfWeek) {
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
    public static class RemindResponses extends TeaModel {
        @NameInMap("ActionTopic")
        private String actionTopic;

        @NameInMap("DayDesc")
        private String dayDesc;

        @NameInMap("RecurrenceRule")
        private RecurrenceRule recurrenceRule;

        @NameInMap("RemindId")
        private Long remindId;

        @NameInMap("RemindTime")
        private String remindTime;

        @NameInMap("RepeatCount")
        private Integer repeatCount;

        @NameInMap("Week")
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
    public static class Model extends TeaModel {
        @NameInMap("RemindResponses")
        private java.util.List < RemindResponses> remindResponses;

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
        public java.util.List < RemindResponses> getRemindResponses() {
            return this.remindResponses;
        }

        public static final class Builder {
            private java.util.List < RemindResponses> remindResponses; 

            /**
             * RemindResponses.
             */
            public Builder remindResponses(java.util.List < RemindResponses> remindResponses) {
                this.remindResponses = remindResponses;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
