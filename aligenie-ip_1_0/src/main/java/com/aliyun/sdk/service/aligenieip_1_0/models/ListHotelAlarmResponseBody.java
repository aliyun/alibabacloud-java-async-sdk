// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListHotelAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelAlarmResponseBody</p>
 */
public class ListHotelAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extentions")
    private java.util.Map<String, ?> extentions;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private ListHotelAlarmResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extentions
     */
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map<String, ?> extentions; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(ListHotelAlarmResponseBody model) {
            this.extentions = model.extentions;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map<String, ?> extentions) {
            this.extentions = extentions;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ListHotelAlarmResponseBody build() {
            return new ListHotelAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelAlarmResponseBody</p>
     */
    public static class Once extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private Once(Builder builder) {
            this.day = builder.day;
            this.hour = builder.hour;
            this.minute = builder.minute;
            this.month = builder.month;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Once create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
            return this.day;
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
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(Once model) {
                this.day = model.day;
                this.hour = model.hour;
                this.minute = model.minute;
                this.month = model.month;
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
             * Year.
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public Once build() {
                return new Once(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelAlarmResponseBody</p>
     */
    public static class Weekly extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        private Weekly(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.hour = builder.hour;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Weekly create() {
            return builder().build();
        }

        /**
         * @return daysOfWeek
         */
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
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

        public static final class Builder {
            private java.util.List<Integer> daysOfWeek; 
            private Integer hour; 
            private Integer minute; 

            private Builder() {
            } 

            private Builder(Weekly model) {
                this.daysOfWeek = model.daysOfWeek;
                this.hour = model.hour;
                this.minute = model.minute;
            } 

            /**
             * DaysOfWeek.
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
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

            public Weekly build() {
                return new Weekly(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelAlarmResponseBody</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Once")
        private Once once;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weekly")
        private Weekly weekly;

        private ScheduleInfo(Builder builder) {
            this.once = builder.once;
            this.type = builder.type;
            this.weekly = builder.weekly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return once
         */
        public Once getOnce() {
            return this.once;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weekly
         */
        public Weekly getWeekly() {
            return this.weekly;
        }

        public static final class Builder {
            private Once once; 
            private String type; 
            private Weekly weekly; 

            private Builder() {
            } 

            private Builder(ScheduleInfo model) {
                this.once = model.once;
                this.type = model.type;
                this.weekly = model.weekly;
            } 

            /**
             * Once.
             */
            public Builder once(Once once) {
                this.once = once;
                return this;
            }

            /**
             * <p>ONCE, WEEKLY</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weekly.
             */
            public Builder weekly(Weekly weekly) {
                this.weekly = weekly;
                return this;
            }

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelAlarmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        private String userOpenId;

        private Result(Builder builder) {
            this.alarmId = builder.alarmId;
            this.deviceOpenId = builder.deviceOpenId;
            this.scheduleInfo = builder.scheduleInfo;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private Long alarmId; 
            private String deviceOpenId; 
            private ScheduleInfo scheduleInfo; 
            private String userOpenId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.alarmId = model.alarmId;
                this.deviceOpenId = model.deviceOpenId;
                this.scheduleInfo = model.scheduleInfo;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * AlarmId.
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * DeviceOpenId.
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * ScheduleInfo.
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * UserOpenId.
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
