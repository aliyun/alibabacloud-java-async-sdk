// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppUseTimeReportRequest} extends {@link RequestModel}
 *
 * <p>AppUseTimeReportRequest</p>
 */
public class AppUseTimeReportRequest extends Request {
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

    private AppUseTimeReportRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppUseTimeReportRequest create() {
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

    public static final class Builder extends Request.Builder<AppUseTimeReportRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(AppUseTimeReportRequest request) {
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
        public AppUseTimeReportRequest build() {
            return new AppUseTimeReportRequest(this);
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
        @NameInMap("Action")
        @Validation(required = true)
        private String action;

        @NameInMap("IsPrivilege")
        @Validation(required = true)
        private Integer isPrivilege;

        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        private Integer resourceType;

        @NameInMap("StepCode")
        @Validation(required = true)
        private String stepCode;

        @NameInMap("VipType")
        @Validation(required = true)
        private Integer vipType;

        @NameInMap("originUuid")
        private String originUuid;

        private Payload(Builder builder) {
            this.action = builder.action;
            this.isPrivilege = builder.isPrivilege;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.stepCode = builder.stepCode;
            this.vipType = builder.vipType;
            this.originUuid = builder.originUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return isPrivilege
         */
        public Integer getIsPrivilege() {
            return this.isPrivilege;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public Integer getResourceType() {
            return this.resourceType;
        }

        /**
         * @return stepCode
         */
        public String getStepCode() {
            return this.stepCode;
        }

        /**
         * @return vipType
         */
        public Integer getVipType() {
            return this.vipType;
        }

        /**
         * @return originUuid
         */
        public String getOriginUuid() {
            return this.originUuid;
        }

        public static final class Builder {
            private String action; 
            private Integer isPrivilege; 
            private String resourceId; 
            private Integer resourceType; 
            private String stepCode; 
            private Integer vipType; 
            private String originUuid; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * IsPrivilege.
             */
            public Builder isPrivilege(Integer isPrivilege) {
                this.isPrivilege = isPrivilege;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(Integer resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * StepCode.
             */
            public Builder stepCode(String stepCode) {
                this.stepCode = stepCode;
                return this;
            }

            /**
             * VipType.
             */
            public Builder vipType(Integer vipType) {
                this.vipType = vipType;
                return this;
            }

            /**
             * originUuid.
             */
            public Builder originUuid(String originUuid) {
                this.originUuid = originUuid;
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
