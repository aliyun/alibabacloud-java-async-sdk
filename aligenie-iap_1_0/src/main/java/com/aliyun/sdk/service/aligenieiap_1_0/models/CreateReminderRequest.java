// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReminderRequest} extends {@link RequestModel}
 *
 * <p>CreateReminderRequest</p>
 */
public class CreateReminderRequest extends Request {
    @Body
    @NameInMap("DeviceInfo")
    @Validation(required = true)
    private DeviceInfo deviceInfo;

    @Body
    @NameInMap("Payload")
    @Validation(required = true)
    private Payload payload;

    @Body
    @NameInMap("UserInfo")
    @Validation(required = true)
    private UserInfo userInfo;

    private CreateReminderRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReminderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<CreateReminderRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateReminderRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.payload = request.payload;
            this.userInfo = request.userInfo;
        } 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putBodyParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putBodyParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public CreateReminderRequest build() {
            return new CreateReminderRequest(this);
        } 

    } 

    public static class DeviceInfo extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("IdType")
        @Validation(required = true)
        private String idType;

        @NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

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
        @Validation(required = true)
        private Long endDateTime;

        @NameInMap("Freq")
        @Validation(required = true)
        private String freq;

        @NameInMap("Hour")
        @Validation(required = true)
        private Integer hour;

        @NameInMap("Minute")
        private Integer minute;

        @NameInMap("Month")
        private Integer month;

        @NameInMap("Second")
        private Integer second;

        @NameInMap("StartDateTime")
        @Validation(required = true)
        private Long startDateTime;

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
        public Long getEndDateTime() {
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
        public Long getStartDateTime() {
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
            private Long endDateTime; 
            private String freq; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer second; 
            private Long startDateTime; 
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
            public Builder endDateTime(Long endDateTime) {
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
            public Builder startDateTime(Long startDateTime) {
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
    public static class Payload extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("IsDebug")
        @Validation(required = true)
        private Boolean isDebug;

        @NameInMap("RecurrenceRule")
        @Validation(required = true)
        private RecurrenceRule recurrenceRule;

        private Payload(Builder builder) {
            this.content = builder.content;
            this.isDebug = builder.isDebug;
            this.recurrenceRule = builder.recurrenceRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return isDebug
         */
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        /**
         * @return recurrenceRule
         */
        public RecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

        public static final class Builder {
            private String content; 
            private Boolean isDebug; 
            private RecurrenceRule recurrenceRule; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * IsDebug.
             */
            public Builder isDebug(Boolean isDebug) {
                this.isDebug = isDebug;
                return this;
            }

            /**
             * RecurrenceRule.
             */
            public Builder recurrenceRule(RecurrenceRule recurrenceRule) {
                this.recurrenceRule = recurrenceRule;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    public static class UserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("IdType")
        @Validation(required = true)
        private String idType;

        @NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
