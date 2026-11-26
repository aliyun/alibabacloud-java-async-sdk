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
 * {@link CreateScheduleTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduleTaskRequest</p>
 */
public class CreateScheduleTaskRequest extends Request {
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

    private CreateScheduleTaskRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduleTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateScheduleTaskRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduleTaskRequest request) {
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
         * <p>User Identifier Information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public CreateScheduleTaskRequest build() {
            return new CreateScheduleTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
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
             * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the SkillID of the application. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client application.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the device identity for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer linkage; SKILL_ID: skill ID, used for cloud linkage.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID (deviceOpenId or deviceUnionId)</p>
             * 
             * <strong>example:</strong>
             * <p>DAFE****ce3ej=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-level device ID, available only after applying for an organization in the Maojing Skill Application Open Platform.</p>
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
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class ActionDTOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customAction")
        private java.util.Map<String, ?> customAction;

        private ActionDTOs(Builder builder) {
            this.customAction = builder.customAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionDTOs create() {
            return builder().build();
        }

        /**
         * @return customAction
         */
        public java.util.Map<String, ?> getCustomAction() {
            return this.customAction;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customAction; 

            private Builder() {
            } 

            private Builder(ActionDTOs model) {
                this.customAction = model.customAction;
            } 

            /**
             * <p>Vendor-defined command</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:{&quot;key&quot;:1}}</p>
             */
            public Builder customAction(java.util.Map<String, ?> customAction) {
                this.customAction = customAction;
                return this;
            }

            public ActionDTOs build() {
                return new ActionDTOs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
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
             * <p>Trigger day</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder day(Integer day) {
                this.day = day;
                return this;
            }

            /**
             * <p>Trigger Hour</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>Trigger Minute</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * <p>Trigger Month</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Trigger Year</p>
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
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class StatutoryWorkingDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hours")
        private java.util.List<Integer> hours;

        @com.aliyun.core.annotation.NameInMap("Minutes")
        private java.util.List<Integer> minutes;

        private StatutoryWorkingDay(Builder builder) {
            this.hours = builder.hours;
            this.minutes = builder.minutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatutoryWorkingDay create() {
            return builder().build();
        }

        /**
         * @return hours
         */
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

        /**
         * @return minutes
         */
        public java.util.List<Integer> getMinutes() {
            return this.minutes;
        }

        public static final class Builder {
            private java.util.List<Integer> hours; 
            private java.util.List<Integer> minutes; 

            private Builder() {
            } 

            private Builder(StatutoryWorkingDay model) {
                this.hours = model.hours;
                this.minutes = model.minutes;
            } 

            /**
             * <p>Trigger hour; Multiple Choice</p>
             */
            public Builder hours(java.util.List<Integer> hours) {
                this.hours = hours;
                return this;
            }

            /**
             * <p>Trigger minute; Multiple Choice</p>
             */
            public Builder minutes(java.util.List<Integer> minutes) {
                this.minutes = minutes;
                return this;
            }

            public StatutoryWorkingDay build() {
                return new StatutoryWorkingDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class Weekly extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Hours")
        private java.util.List<Integer> hours;

        @com.aliyun.core.annotation.NameInMap("Minutes")
        private java.util.List<Integer> minutes;

        private Weekly(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.hours = builder.hours;
            this.minutes = builder.minutes;
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
         * @return hours
         */
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

        /**
         * @return minutes
         */
        public java.util.List<Integer> getMinutes() {
            return this.minutes;
        }

        public static final class Builder {
            private java.util.List<Integer> daysOfWeek; 
            private java.util.List<Integer> hours; 
            private java.util.List<Integer> minutes; 

            private Builder() {
            } 

            private Builder(Weekly model) {
                this.daysOfWeek = model.daysOfWeek;
                this.hours = model.hours;
                this.minutes = model.minutes;
            } 

            /**
             * <p>Trigger days of the week, where 1–7 represent Monday through Sunday, respectively</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>Trigger hour</p>
             */
            public Builder hours(java.util.List<Integer> hours) {
                this.hours = hours;
                return this;
            }

            /**
             * <p>Trigger minute</p>
             */
            public Builder minutes(java.util.List<Integer> minutes) {
                this.minutes = minutes;
                return this;
            }

            public Weekly build() {
                return new Weekly(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class ScheduleDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Once")
        private Once once;

        @com.aliyun.core.annotation.NameInMap("ScheduleEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long scheduleEndTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long scheduleStartTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("StatutoryWorkingDay")
        private StatutoryWorkingDay statutoryWorkingDay;

        @com.aliyun.core.annotation.NameInMap("Weekly")
        private Weekly weekly;

        private ScheduleDTO(Builder builder) {
            this.once = builder.once;
            this.scheduleEndTime = builder.scheduleEndTime;
            this.scheduleStartTime = builder.scheduleStartTime;
            this.scheduleType = builder.scheduleType;
            this.statutoryWorkingDay = builder.statutoryWorkingDay;
            this.weekly = builder.weekly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleDTO create() {
            return builder().build();
        }

        /**
         * @return once
         */
        public Once getOnce() {
            return this.once;
        }

        /**
         * @return scheduleEndTime
         */
        public Long getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        /**
         * @return scheduleStartTime
         */
        public Long getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return statutoryWorkingDay
         */
        public StatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        /**
         * @return weekly
         */
        public Weekly getWeekly() {
            return this.weekly;
        }

        public static final class Builder {
            private Once once; 
            private Long scheduleEndTime; 
            private Long scheduleStartTime; 
            private String scheduleType; 
            private StatutoryWorkingDay statutoryWorkingDay; 
            private Weekly weekly; 

            private Builder() {
            } 

            private Builder(ScheduleDTO model) {
                this.once = model.once;
                this.scheduleEndTime = model.scheduleEndTime;
                this.scheduleStartTime = model.scheduleStartTime;
                this.scheduleType = model.scheduleType;
                this.statutoryWorkingDay = model.statutoryWorkingDay;
                this.weekly = model.weekly;
            } 

            /**
             * <p>One-time Scan Configuration</p>
             */
            public Builder once(Once once) {
                this.once = once;
                return this;
            }

            /**
             * <p>Schedule end time</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1661589255000</p>
             */
            public Builder scheduleEndTime(Long scheduleEndTime) {
                this.scheduleEndTime = scheduleEndTime;
                return this;
            }

            /**
             * <p>Schedule Start Time</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1656318855000</p>
             */
            public Builder scheduleStartTime(Long scheduleStartTime) {
                this.scheduleStartTime = scheduleStartTime;
                return this;
            }

            /**
             * <p>Schedule Type</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>Statutory working day schedule configuration</p>
             */
            public Builder statutoryWorkingDay(StatutoryWorkingDay statutoryWorkingDay) {
                this.statutoryWorkingDay = statutoryWorkingDay;
                return this;
            }

            /**
             * <p>Loop schedule configuration</p>
             */
            public Builder weekly(Weekly weekly) {
                this.weekly = weekly;
                return this;
            }

            public ScheduleDTO build() {
                return new ScheduleDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionDTOs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ActionDTOs> actionDTOs;

        @com.aliyun.core.annotation.NameInMap("IdempotentId")
        private String idempotentId;

        @com.aliyun.core.annotation.NameInMap("ScheduleDTO")
        @com.aliyun.core.annotation.Validation(required = true)
        private ScheduleDTO scheduleDTO;

        private Payload(Builder builder) {
            this.actionDTOs = builder.actionDTOs;
            this.idempotentId = builder.idempotentId;
            this.scheduleDTO = builder.scheduleDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return actionDTOs
         */
        public java.util.List<ActionDTOs> getActionDTOs() {
            return this.actionDTOs;
        }

        /**
         * @return idempotentId
         */
        public String getIdempotentId() {
            return this.idempotentId;
        }

        /**
         * @return scheduleDTO
         */
        public ScheduleDTO getScheduleDTO() {
            return this.scheduleDTO;
        }

        public static final class Builder {
            private java.util.List<ActionDTOs> actionDTOs; 
            private String idempotentId; 
            private ScheduleDTO scheduleDTO; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.actionDTOs = model.actionDTOs;
                this.idempotentId = model.idempotentId;
                this.scheduleDTO = model.scheduleDTO;
            } 

            /**
             * <p>Scheduling action parameters</p>
             * <p>This parameter is required.</p>
             */
            public Builder actionDTOs(java.util.List<ActionDTOs> actionDTOs) {
                this.actionDTOs = actionDTOs;
                return this;
            }

            /**
             * <p>Idempotent ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder idempotentId(String idempotentId) {
                this.idempotentId = idempotentId;
                return this;
            }

            /**
             * <p>Scheduling information</p>
             * <p>This parameter is required.</p>
             */
            public Builder scheduleDTO(ScheduleDTO scheduleDTO) {
                this.scheduleDTO = scheduleDTO;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduleTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduleTaskRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
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
             * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding Type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer links; SKILL_ID: Skill ID, used for cloud-based links.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User Identifier (userOpenId or userUnionId)</p>
             * 
             * <strong>example:</strong>
             * <p>HOFF****my7Iw=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of User ID:  </p>
             * <ul>
             * <li>OPEN_ID: The default User ID identity.  </li>
             * <li>UNION_ID: The User ID identity at the organization dimension. This is available only after an organization has been requested on the Maojing Skill Application Open Platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID; Required if IdType is UNION_ID</p>
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
