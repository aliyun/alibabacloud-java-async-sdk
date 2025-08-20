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
 * {@link UpdateReminderRequest} extends {@link RequestModel}
 *
 * <p>UpdateReminderRequest</p>
 */
public class UpdateReminderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Payload")
    @com.aliyun.core.annotation.Validation(required = true)
    private Payload payload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private UpdateReminderRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateReminderRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateReminderRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(UpdateReminderRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.payload = request.payload;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putBodyParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putBodyParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public UpdateReminderRequest build() {
            return new UpdateReminderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateReminderRequest} extends {@link TeaModel}
     *
     * <p>UpdateReminderRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
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

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DAFE****ce3ej=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
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
    /**
     * 
     * {@link UpdateReminderRequest} extends {@link TeaModel}
     *
     * <p>UpdateReminderRequest</p>
     */
    public static class RecurrenceRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("DaysOfMonth")
        private java.util.List<Integer> daysOfMonth;

        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("EndDateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long endDateTime;

        @com.aliyun.core.annotation.NameInMap("Freq")
        @com.aliyun.core.annotation.Validation(required = true)
        private String freq;

        @com.aliyun.core.annotation.NameInMap("Hour")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        @com.aliyun.core.annotation.NameInMap("StartDateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long startDateTime;

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
            private java.util.List<Integer> daysOfMonth; 
            private java.util.List<Integer> daysOfWeek; 
            private Long endDateTime; 
            private String freq; 
            private Integer hour; 
            private Integer minute; 
            private Integer month; 
            private Integer second; 
            private Long startDateTime; 
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1635134700000</p>
             */
            public Builder endDateTime(Long endDateTime) {
                this.endDateTime = endDateTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder freq(String freq) {
                this.freq = freq;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1635134400000</p>
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
    /**
     * 
     * {@link UpdateReminderRequest} extends {@link TeaModel}
     *
     * <p>UpdateReminderRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDebug")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isDebug;

        @com.aliyun.core.annotation.NameInMap("RecurrenceRule")
        @com.aliyun.core.annotation.Validation(required = true)
        private RecurrenceRule recurrenceRule;

        private Payload(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private Long id; 
            private Boolean isDebug; 
            private RecurrenceRule recurrenceRule; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.content = model.content;
                this.id = model.id;
                this.isDebug = model.isDebug;
                this.recurrenceRule = model.recurrenceRule;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>更新提醒内容</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20***34</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDebug(Boolean isDebug) {
                this.isDebug = isDebug;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link UpdateReminderRequest} extends {@link TeaModel}
     *
     * <p>UpdateReminderRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
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

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HOFF****my7Iw=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
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
