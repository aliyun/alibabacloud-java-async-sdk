// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlarmResponseBody</p>
 */
public class GetAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetAlarmResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetAlarmResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the alarm service</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>id为空</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Alarm details</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAlarmResponseBody build() {
            return new GetAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
     */
    public static class MusicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MusicId")
        private Long musicId;

        @com.aliyun.core.annotation.NameInMap("MusicName")
        private String musicName;

        @com.aliyun.core.annotation.NameInMap("MusicType")
        private Long musicType;

        @com.aliyun.core.annotation.NameInMap("MusicTypeName")
        private String musicTypeName;

        @com.aliyun.core.annotation.NameInMap("MusicUrl")
        private String musicUrl;

        private MusicInfo(Builder builder) {
            this.musicId = builder.musicId;
            this.musicName = builder.musicName;
            this.musicType = builder.musicType;
            this.musicTypeName = builder.musicTypeName;
            this.musicUrl = builder.musicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MusicInfo create() {
            return builder().build();
        }

        /**
         * @return musicId
         */
        public Long getMusicId() {
            return this.musicId;
        }

        /**
         * @return musicName
         */
        public String getMusicName() {
            return this.musicName;
        }

        /**
         * @return musicType
         */
        public Long getMusicType() {
            return this.musicType;
        }

        /**
         * @return musicTypeName
         */
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        /**
         * @return musicUrl
         */
        public String getMusicUrl() {
            return this.musicUrl;
        }

        public static final class Builder {
            private Long musicId; 
            private String musicName; 
            private Long musicType; 
            private String musicTypeName; 
            private String musicUrl; 

            private Builder() {
            } 

            private Builder(MusicInfo model) {
                this.musicId = model.musicId;
                this.musicName = model.musicName;
                this.musicType = model.musicType;
                this.musicTypeName = model.musicTypeName;
                this.musicUrl = model.musicUrl;
            } 

            /**
             * <p>Ringtone ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicId(Long musicId) {
                this.musicId = musicId;
                return this;
            }

            /**
             * <p>Ringtone Name</p>
             * 
             * <strong>example:</strong>
             * <p>xx铃声</p>
             */
            public Builder musicName(String musicName) {
                this.musicName = musicName;
                return this;
            }

            /**
             * <p>Ringtone Category ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicType(Long musicType) {
                this.musicType = musicType;
                return this;
            }

            /**
             * <p>Ringtone Category Name</p>
             * 
             * <strong>example:</strong>
             * <p>xx音乐</p>
             */
            public Builder musicTypeName(String musicTypeName) {
                this.musicTypeName = musicTypeName;
                return this;
            }

            /**
             * <p>Ringtone URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx">http://xx</a></p>
             */
            public Builder musicUrl(String musicUrl) {
                this.musicUrl = musicUrl;
                return this;
            }

            public MusicInfo build() {
                return new MusicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
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
             * <p>Trigger time: Day</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder day(Integer day) {
                this.day = day;
                return this;
            }

            /**
             * <p>Trigger Time: Hour</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>Trigger Time: Minute</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * <p>Trigger Time: Month</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Trigger Time: Year</p>
             * 
             * <strong>example:</strong>
             * <p>2022</p>
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
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
     */
    public static class StatutoryWorkingDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        private StatutoryWorkingDay(Builder builder) {
            this.hour = builder.hour;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatutoryWorkingDay create() {
            return builder().build();
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
            private Integer hour; 
            private Integer minute; 

            private Builder() {
            } 

            private Builder(StatutoryWorkingDay model) {
                this.hour = model.hour;
                this.minute = model.minute;
            } 

            /**
             * <p>Trigger Time: Hour</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>Trigger Time: Minute</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            public StatutoryWorkingDay build() {
                return new StatutoryWorkingDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
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
             * <p>Collection of days of the week to trigger: Numeric values between 1 and 7, where each number corresponds to a specific day of the week. If triggered every day, include all numbers.</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>Trigger time: Hour</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>Trigger time: Minute</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Once")
        private Once once;

        @com.aliyun.core.annotation.NameInMap("StatutoryWorkingDay")
        private StatutoryWorkingDay statutoryWorkingDay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weekly")
        private Weekly weekly;

        private ScheduleInfo(Builder builder) {
            this.once = builder.once;
            this.statutoryWorkingDay = builder.statutoryWorkingDay;
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
         * @return statutoryWorkingDay
         */
        public StatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
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
            private StatutoryWorkingDay statutoryWorkingDay; 
            private String type; 
            private Weekly weekly; 

            private Builder() {
            } 

            private Builder(ScheduleInfo model) {
                this.once = model.once;
                this.statutoryWorkingDay = model.statutoryWorkingDay;
                this.type = model.type;
                this.weekly = model.weekly;
            } 

            /**
             * <p>One-time: This property is active when the loop type is ONCE.</p>
             */
            public Builder once(Once once) {
                this.once = once;
                return this;
            }

            /**
             * <p>Statutory working day: This property is active when the loop Type is STATUTORYWORKINGDAY.</p>
             */
            public Builder statutoryWorkingDay(StatutoryWorkingDay statutoryWorkingDay) {
                this.statutoryWorkingDay = statutoryWorkingDay;
                return this;
            }

            /**
             * <p>Schedule Type / Loop Type: ONCE -&gt; One-time, WEEKLY -&gt; Weekly loop, STATUTORYWORKINGDAY -&gt; Statutory working day</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Weekly loop: This property is active when the loop Type is WEEKLY.</p>
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
     * {@link GetAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("MusicInfo")
        private MusicInfo musicInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduleTypeDesc")
        private String scheduleTypeDesc;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TriggerDateDesc")
        private String triggerDateDesc;

        @com.aliyun.core.annotation.NameInMap("TriggerTimeDesc")
        private String triggerTimeDesc;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private Result(Builder builder) {
            this.alarmId = builder.alarmId;
            this.musicInfo = builder.musicInfo;
            this.scheduleInfo = builder.scheduleInfo;
            this.scheduleTypeDesc = builder.scheduleTypeDesc;
            this.status = builder.status;
            this.triggerDateDesc = builder.triggerDateDesc;
            this.triggerTimeDesc = builder.triggerTimeDesc;
            this.volume = builder.volume;
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
         * @return musicInfo
         */
        public MusicInfo getMusicInfo() {
            return this.musicInfo;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return scheduleTypeDesc
         */
        public String getScheduleTypeDesc() {
            return this.scheduleTypeDesc;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return triggerDateDesc
         */
        public String getTriggerDateDesc() {
            return this.triggerDateDesc;
        }

        /**
         * @return triggerTimeDesc
         */
        public String getTriggerTimeDesc() {
            return this.triggerTimeDesc;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Long alarmId; 
            private MusicInfo musicInfo; 
            private ScheduleInfo scheduleInfo; 
            private String scheduleTypeDesc; 
            private Integer status; 
            private String triggerDateDesc; 
            private String triggerTimeDesc; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.alarmId = model.alarmId;
                this.musicInfo = model.musicInfo;
                this.scheduleInfo = model.scheduleInfo;
                this.scheduleTypeDesc = model.scheduleTypeDesc;
                this.status = model.status;
                this.triggerDateDesc = model.triggerDateDesc;
                this.triggerTimeDesc = model.triggerTimeDesc;
                this.volume = model.volume;
            } 

            /**
             * <p>Alarm ID</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>Ringtone Information</p>
             */
            public Builder musicInfo(MusicInfo musicInfo) {
                this.musicInfo = musicInfo;
                return this;
            }

            /**
             * <p>Schedule Information</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>Chinese description of the loop type</p>
             * 
             * <strong>example:</strong>
             * <p>单次</p>
             */
            public Builder scheduleTypeDesc(String scheduleTypeDesc) {
                this.scheduleTypeDesc = scheduleTypeDesc;
                return this;
            }

            /**
             * <p>status: 0 Normal, 1 deleted, 2 shutdown</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Trigger date description (one-time)</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-29</p>
             */
            public Builder triggerDateDesc(String triggerDateDesc) {
                this.triggerDateDesc = triggerDateDesc;
                return this;
            }

            /**
             * <p>Trigger time description</p>
             * 
             * <strong>example:</strong>
             * <p>10:00</p>
             */
            public Builder triggerTimeDesc(String triggerTimeDesc) {
                this.triggerTimeDesc = triggerTimeDesc;
                return this;
            }

            /**
             * <p>Ringtone volume</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
