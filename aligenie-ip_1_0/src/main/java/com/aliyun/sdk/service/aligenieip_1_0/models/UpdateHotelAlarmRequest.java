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
 * {@link UpdateHotelAlarmRequest} extends {@link RequestModel}
 *
 * <p>UpdateHotelAlarmRequest</p>
 */
public class UpdateHotelAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alarms")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Alarms> alarms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
    private ScheduleInfo scheduleInfo;

    private UpdateHotelAlarmRequest(Builder builder) {
        super(builder);
        this.alarms = builder.alarms;
        this.hotelId = builder.hotelId;
        this.scheduleInfo = builder.scheduleInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHotelAlarmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarms
     */
    public java.util.List<Alarms> getAlarms() {
        return this.alarms;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return scheduleInfo
     */
    public ScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    public static final class Builder extends Request.Builder<UpdateHotelAlarmRequest, Builder> {
        private java.util.List<Alarms> alarms; 
        private String hotelId; 
        private ScheduleInfo scheduleInfo; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHotelAlarmRequest request) {
            super(request);
            this.alarms = request.alarms;
            this.hotelId = request.hotelId;
            this.scheduleInfo = request.scheduleInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alarms(java.util.List<Alarms> alarms) {
            String alarmsShrink = shrink(alarms, "Alarms", "json");
            this.putBodyParameter("Alarms", alarmsShrink);
            this.alarms = alarms;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7a381a668bc485980bed3876a75e013</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * ScheduleInfo.
         */
        public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
            String scheduleInfoShrink = shrink(scheduleInfo, "ScheduleInfo", "json");
            this.putBodyParameter("ScheduleInfo", scheduleInfoShrink);
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        @Override
        public UpdateHotelAlarmRequest build() {
            return new UpdateHotelAlarmRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateHotelAlarmRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelAlarmRequest</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userOpenId;

        private Alarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.deviceOpenId = builder.deviceOpenId;
            this.roomNo = builder.roomNo;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
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
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
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
            private String roomNo; 
            private String userOpenId; 

            private Builder() {
            } 

            private Builder(Alarms model) {
                this.alarmId = model.alarmId;
                this.deviceOpenId = model.deviceOpenId;
                this.roomNo = model.roomNo;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Pvk***VTA==</p>
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mgw/***dHQd</p>
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHotelAlarmRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelAlarmRequest</p>
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
     * {@link UpdateHotelAlarmRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelAlarmRequest</p>
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
     * {@link UpdateHotelAlarmRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelAlarmRequest</p>
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
}
