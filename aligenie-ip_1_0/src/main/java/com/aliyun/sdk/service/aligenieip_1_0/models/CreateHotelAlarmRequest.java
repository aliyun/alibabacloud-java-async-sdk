// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotelAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateHotelAlarmRequest</p>
 */
public class CreateHotelAlarmRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("MusicType")
    private String musicType;

    @Body
    @NameInMap("Rooms")
    @Validation(required = true)
    private java.util.List < String > rooms;

    @Body
    @NameInMap("ScheduleInfo")
    @Validation(required = true)
    private ScheduleInfo scheduleInfo;

    private CreateHotelAlarmRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.musicType = builder.musicType;
        this.rooms = builder.rooms;
        this.scheduleInfo = builder.scheduleInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotelAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return musicType
     */
    public String getMusicType() {
        return this.musicType;
    }

    /**
     * @return rooms
     */
    public java.util.List < String > getRooms() {
        return this.rooms;
    }

    /**
     * @return scheduleInfo
     */
    public ScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    public static final class Builder extends Request.Builder<CreateHotelAlarmRequest, Builder> {
        private String hotelId; 
        private String musicType; 
        private java.util.List < String > rooms; 
        private ScheduleInfo scheduleInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateHotelAlarmRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.musicType = request.musicType;
            this.rooms = request.rooms;
            this.scheduleInfo = request.scheduleInfo;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * MusicType.
         */
        public Builder musicType(String musicType) {
            this.putBodyParameter("MusicType", musicType);
            this.musicType = musicType;
            return this;
        }

        /**
         * Rooms.
         */
        public Builder rooms(java.util.List < String > rooms) {
            String roomsShrink = shrink(rooms, "Rooms", "json");
            this.putBodyParameter("Rooms", roomsShrink);
            this.rooms = rooms;
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
        public CreateHotelAlarmRequest build() {
            return new CreateHotelAlarmRequest(this);
        } 

    } 

    public static class Once extends TeaModel {
        @NameInMap("Day")
        private Integer day;

        @NameInMap("Hour")
        private Integer hour;

        @NameInMap("Minute")
        private Integer minute;

        @NameInMap("Month")
        private Integer month;

        @NameInMap("Year")
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
    public static class Weekly extends TeaModel {
        @NameInMap("DaysOfWeek")
        private java.util.List < Integer > daysOfWeek;

        @NameInMap("Hour")
        private Integer hour;

        @NameInMap("Minute")
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
        public java.util.List < Integer > getDaysOfWeek() {
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
            private java.util.List < Integer > daysOfWeek; 
            private Integer hour; 
            private Integer minute; 

            /**
             * DaysOfWeek.
             */
            public Builder daysOfWeek(java.util.List < Integer > daysOfWeek) {
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
    public static class ScheduleInfo extends TeaModel {
        @NameInMap("Once")
        private Once once;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Weekly")
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

            /**
             * Once.
             */
            public Builder once(Once once) {
                this.once = once;
                return this;
            }

            /**
             * ONCE, WEEKLY
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
