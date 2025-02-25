// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoAppReportRequest} extends {@link RequestModel}
 *
 * <p>VideoAppReportRequest</p>
 */
public class VideoAppReportRequest extends Request {
    @Body
    @NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @Body
    @NameInMap("Payload")
    private Payload payload;

    @Body
    @NameInMap("UserInfo")
    @Validation(required = true)
    private UserInfo userInfo;

    private VideoAppReportRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoAppReportRequest create() {
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

    public static final class Builder extends Request.Builder<VideoAppReportRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(VideoAppReportRequest request) {
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
        public VideoAppReportRequest build() {
            return new VideoAppReportRequest(this);
        } 

    } 

    public static class DeviceInfo extends TeaModel {
        @NameInMap("EncodeKey")
        private String encodeKey;

        @NameInMap("EncodeType")
        private String encodeType;

        @NameInMap("Id")
        private String id;

        @NameInMap("IdType")
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
    public static class Payload extends TeaModel {
        @NameInMap("endTime")
        @Validation(required = true)
        private Long endTime;

        @NameInMap("isLogin")
        @Validation(required = true)
        private Boolean isLogin;

        @NameInMap("isVip")
        @Validation(required = true)
        private Boolean isVip;

        @NameInMap("loginNick")
        private String loginNick;

        @NameInMap("originUuid")
        private String originUuid;

        @NameInMap("phone")
        private String phone;

        @NameInMap("pkgName")
        @Validation(required = true)
        private String pkgName;

        @NameInMap("startTime")
        @Validation(required = true)
        private Long startTime;

        private Payload(Builder builder) {
            this.endTime = builder.endTime;
            this.isLogin = builder.isLogin;
            this.isVip = builder.isVip;
            this.loginNick = builder.loginNick;
            this.originUuid = builder.originUuid;
            this.phone = builder.phone;
            this.pkgName = builder.pkgName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return isLogin
         */
        public Boolean getIsLogin() {
            return this.isLogin;
        }

        /**
         * @return isVip
         */
        public Boolean getIsVip() {
            return this.isVip;
        }

        /**
         * @return loginNick
         */
        public String getLoginNick() {
            return this.loginNick;
        }

        /**
         * @return originUuid
         */
        public String getOriginUuid() {
            return this.originUuid;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return pkgName
         */
        public String getPkgName() {
            return this.pkgName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Boolean isLogin; 
            private Boolean isVip; 
            private String loginNick; 
            private String originUuid; 
            private String phone; 
            private String pkgName; 
            private Long startTime; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * isLogin.
             */
            public Builder isLogin(Boolean isLogin) {
                this.isLogin = isLogin;
                return this;
            }

            /**
             * isVip.
             */
            public Builder isVip(Boolean isVip) {
                this.isVip = isVip;
                return this;
            }

            /**
             * loginNick.
             */
            public Builder loginNick(String loginNick) {
                this.loginNick = loginNick;
                return this;
            }

            /**
             * originUuid.
             */
            public Builder originUuid(String originUuid) {
                this.originUuid = originUuid;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * pkgName.
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
