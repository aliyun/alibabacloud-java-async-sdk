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
 * {@link CreateAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlarmRequest</p>
 */
public class CreateAlarmRequest extends Request {
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

    private CreateAlarmRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlarmRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAlarmRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlarmRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.payload = request.payload;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device identity information</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putBodyParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>Input parameters for the service request</p>
         * <p>This parameter is required.</p>
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putBodyParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * <p>User Identifier information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public CreateAlarmRequest build() {
            return new CreateAlarmRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the Skill ID of the application; when the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the device identity for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used in the Android application customer link; SKILL_ID: skill ID, used in the cloud link.</p>
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
             * <p>Device ID (deviceOpenId or deviceUnionId)</p>
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
             * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-dimension device ID, available only after applying for an organization on the Maojing Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
     */
    public static class MusicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MusicId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long musicId;

        @com.aliyun.core.annotation.NameInMap("MusicName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String musicName;

        @com.aliyun.core.annotation.NameInMap("MusicType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long musicType;

        @com.aliyun.core.annotation.NameInMap("MusicTypeName")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicId(Long musicId) {
                this.musicId = musicId;
                return this;
            }

            /**
             * <p>Ringtone name</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xx铃声</p>
             */
            public Builder musicName(String musicName) {
                this.musicName = musicName;
                return this;
            }

            /**
             * <p>Ringtone category ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicType(Long musicType) {
                this.musicType = musicType;
                return this;
            }

            /**
             * <p>Ringtone category name</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>Trigger Time: Day</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>Trigger time: Minute</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * <p>Trigger time: Month</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Trigger time: Year</p>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>Trigger time: hour</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>Trigger time: minute</p>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>Collection of Days of the Week to Trigger</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>Trigger time: hour</p>
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

            public Weekly build() {
                return new Weekly(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Once")
        private Once once;

        @com.aliyun.core.annotation.NameInMap("StatutoryWorkingDay")
        private StatutoryWorkingDay statutoryWorkingDay;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Statutory working day: This property is active when the loop Type is STATUTORY_WORKING_DAY.</p>
             */
            public Builder statutoryWorkingDay(StatutoryWorkingDay statutoryWorkingDay) {
                this.statutoryWorkingDay = statutoryWorkingDay;
                return this;
            }

            /**
             * <p>Schedule Type / Loop Type:<br>ONCE -&gt; One-time, WEEKLY -&gt; Weekly loop, STATUTORY_WORKING_DAY -&gt; Statutory working day</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Weekly Loop: This property is active when the loop Type is WEEKLY.</p>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MusicInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private MusicInfo musicInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private Payload(Builder builder) {
            this.musicInfo = builder.musicInfo;
            this.scheduleInfo = builder.scheduleInfo;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
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
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private MusicInfo musicInfo; 
            private ScheduleInfo scheduleInfo; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.musicInfo = model.musicInfo;
                this.scheduleInfo = model.scheduleInfo;
                this.volume = model.volume;
            } 

            /**
             * <p>Ringtone information</p>
             * <p>This parameter is required.</p>
             */
            public Builder musicInfo(MusicInfo musicInfo) {
                this.musicInfo = musicInfo;
                return this;
            }

            /**
             * <p>Schedule information</p>
             * <p>This parameter is required.</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
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

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application&quot;s Skill ID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding Type. There are multiple ways to obtain the User Identifier for Maojing, and each way corresponds to a different encoding Type: PACKAGE_NAME: APK package name, used for the Android application Customer link; SKILL_ID: Skill ID, used for the cloud link.</p>
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
             * <p>User Identifier (userOpenId or userUnionId)</p>
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
             * <p>Type of User ID: OPEN_ID: default User ID identifier; UNION_ID: organization-dimension User ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required when IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
