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
 * {@link AddSubRequest} extends {@link RequestModel}
 *
 * <p>AddSubRequest</p>
 */
public class AddSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddSubscriptionInfoRequest")
    private AddSubscriptionInfoRequest addSubscriptionInfoRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private AddSubRequest(Builder builder) {
        super(builder);
        this.addSubscriptionInfoRequest = builder.addSubscriptionInfoRequest;
        this.deviceInfo = builder.deviceInfo;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSubRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addSubscriptionInfoRequest
     */
    public AddSubscriptionInfoRequest getAddSubscriptionInfoRequest() {
        return this.addSubscriptionInfoRequest;
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<AddSubRequest, Builder> {
        private AddSubscriptionInfoRequest addSubscriptionInfoRequest; 
        private DeviceInfo deviceInfo; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(AddSubRequest request) {
            super(request);
            this.addSubscriptionInfoRequest = request.addSubscriptionInfoRequest;
            this.deviceInfo = request.deviceInfo;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Subscribe to album request</p>
         */
        public Builder addSubscriptionInfoRequest(AddSubscriptionInfoRequest addSubscriptionInfoRequest) {
            String addSubscriptionInfoRequestShrink = shrink(addSubscriptionInfoRequest, "AddSubscriptionInfoRequest", "json");
            this.putQueryParameter("AddSubscriptionInfoRequest", addSubscriptionInfoRequestShrink);
            this.addSubscriptionInfoRequest = addSubscriptionInfoRequest;
            return this;
        }

        /**
         * <p>Device Information</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>User Information</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public AddSubRequest build() {
            return new AddSubRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddSubRequest} extends {@link TeaModel}
     *
     * <p>AddSubRequest</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Hour")
        @com.aliyun.core.annotation.Validation(maximum = 23)
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        @com.aliyun.core.annotation.Validation(maximum = 59)
        private Integer minute;

        private ScheduleInfo(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.hour = builder.hour;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInfo create() {
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

            private Builder(ScheduleInfo model) {
                this.daysOfWeek = model.daysOfWeek;
                this.hour = model.hour;
                this.minute = model.minute;
            } 

            /**
             * <p>The specific days of the week for weekly reminders. Valid values are 1 to 7.</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>The hour of the clock when the reminder is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>The minute of the hour when the reminder is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddSubRequest} extends {@link TeaModel}
     *
     * <p>AddSubRequest</p>
     */
    public static class AddSubscriptionInfoRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("DailyStudyCnt")
        private Integer dailyStudyCnt;

        @com.aliyun.core.annotation.NameInMap("PlayMode")
        private String playMode;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        private ScheduleInfo scheduleInfo;

        private AddSubscriptionInfoRequest(Builder builder) {
            this.albumId = builder.albumId;
            this.dailyStudyCnt = builder.dailyStudyCnt;
            this.playMode = builder.playMode;
            this.scheduleInfo = builder.scheduleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddSubscriptionInfoRequest create() {
            return builder().build();
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return dailyStudyCnt
         */
        public Integer getDailyStudyCnt() {
            return this.dailyStudyCnt;
        }

        /**
         * @return playMode
         */
        public String getPlayMode() {
            return this.playMode;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public static final class Builder {
            private String albumId; 
            private Integer dailyStudyCnt; 
            private String playMode; 
            private ScheduleInfo scheduleInfo; 

            private Builder() {
            } 

            private Builder(AddSubscriptionInfoRequest model) {
                this.albumId = model.albumId;
                this.dailyStudyCnt = model.dailyStudyCnt;
                this.playMode = model.playMode;
                this.scheduleInfo = model.scheduleInfo;
            } 

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>51999575</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Daily study quantity</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dailyStudyCnt(Integer dailyStudyCnt) {
                this.dailyStudyCnt = dailyStudyCnt;
                return this;
            }

            /**
             * <p>Playback pattern (currently only supports sequence)</p>
             * 
             * <strong>example:</strong>
             * <p>sequence</p>
             */
            public Builder playMode(String playMode) {
                this.playMode = playMode;
                return this;
            }

            /**
             * <p>Schedule information</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            public AddSubscriptionInfoRequest build() {
                return new AddSubscriptionInfoRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddSubRequest} extends {@link TeaModel}
     *
     * <p>AddSubRequest</p>
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
    /**
     * 
     * {@link AddSubRequest} extends {@link TeaModel}
     *
     * <p>AddSubRequest</p>
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
