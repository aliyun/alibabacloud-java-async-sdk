// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendNotificationsRequest} extends {@link RequestModel}
 *
 * <p>SendNotificationsRequest</p>
 */
public class SendNotificationsRequest extends Request {
    @Body
    @NameInMap("DeviceInfo")
    @Validation(required = true)
    private DeviceInfo deviceInfo;

    @Body
    @NameInMap("NotificationUnicastRequest")
    @Validation(required = true)
    private NotificationUnicastRequest notificationUnicastRequest;

    @Body
    @NameInMap("TenantInfo")
    private TenantInfo tenantInfo;

    @Body
    @NameInMap("UserInfo")
    @Validation(required = true)
    private UserInfo userInfo;

    private SendNotificationsRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.notificationUnicastRequest = builder.notificationUnicastRequest;
        this.tenantInfo = builder.tenantInfo;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNotificationsRequest create() {
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
     * @return notificationUnicastRequest
     */
    public NotificationUnicastRequest getNotificationUnicastRequest() {
        return this.notificationUnicastRequest;
    }

    /**
     * @return tenantInfo
     */
    public TenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<SendNotificationsRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private NotificationUnicastRequest notificationUnicastRequest; 
        private TenantInfo tenantInfo; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(SendNotificationsRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.notificationUnicastRequest = request.notificationUnicastRequest;
            this.tenantInfo = request.tenantInfo;
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
         * NotificationUnicastRequest.
         */
        public Builder notificationUnicastRequest(NotificationUnicastRequest notificationUnicastRequest) {
            String notificationUnicastRequestShrink = shrink(notificationUnicastRequest, "NotificationUnicastRequest", "json");
            this.putBodyParameter("NotificationUnicastRequest", notificationUnicastRequestShrink);
            this.notificationUnicastRequest = notificationUnicastRequest;
            return this;
        }

        /**
         * TenantInfo.
         */
        public Builder tenantInfo(TenantInfo tenantInfo) {
            String tenantInfoShrink = shrink(tenantInfo, "TenantInfo", "json");
            this.putBodyParameter("TenantInfo", tenantInfoShrink);
            this.tenantInfo = tenantInfo;
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
        public SendNotificationsRequest build() {
            return new SendNotificationsRequest(this);
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
    public static class SendTarget extends TeaModel {
        private SendTarget(Builder builder) {
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendTarget create() {
            return builder().build();
        }

        public static final class Builder {

            public SendTarget build() {
                return new SendTarget(this);
            } 

        } 

    }
    public static class NotificationUnicastRequest extends TeaModel {
        @NameInMap("IsDebug")
        private Boolean isDebug;

        @NameInMap("MessageTemplateId")
        @Validation(required = true)
        private String messageTemplateId;

        @NameInMap("PlaceHolder")
        private java.util.Map < String, String > placeHolder;

        @NameInMap("SendTarget")
        @Validation(required = true)
        private SendTarget sendTarget;

        private NotificationUnicastRequest(Builder builder) {
            this.isDebug = builder.isDebug;
            this.messageTemplateId = builder.messageTemplateId;
            this.placeHolder = builder.placeHolder;
            this.sendTarget = builder.sendTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationUnicastRequest create() {
            return builder().build();
        }

        /**
         * @return isDebug
         */
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        /**
         * @return messageTemplateId
         */
        public String getMessageTemplateId() {
            return this.messageTemplateId;
        }

        /**
         * @return placeHolder
         */
        public java.util.Map < String, String > getPlaceHolder() {
            return this.placeHolder;
        }

        /**
         * @return sendTarget
         */
        public SendTarget getSendTarget() {
            return this.sendTarget;
        }

        public static final class Builder {
            private Boolean isDebug; 
            private String messageTemplateId; 
            private java.util.Map < String, String > placeHolder; 
            private SendTarget sendTarget; 

            /**
             * IsDebug.
             */
            public Builder isDebug(Boolean isDebug) {
                this.isDebug = isDebug;
                return this;
            }

            /**
             * MessageTemplateId.
             */
            public Builder messageTemplateId(String messageTemplateId) {
                this.messageTemplateId = messageTemplateId;
                return this;
            }

            /**
             * PlaceHolder.
             */
            public Builder placeHolder(java.util.Map < String, String > placeHolder) {
                this.placeHolder = placeHolder;
                return this;
            }

            /**
             * SendTarget.
             */
            public Builder sendTarget(SendTarget sendTarget) {
                this.sendTarget = sendTarget;
                return this;
            }

            public NotificationUnicastRequest build() {
                return new NotificationUnicastRequest(this);
            } 

        } 

    }
    public static class TenantInfo extends TeaModel {
        private TenantInfo(Builder builder) {
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantInfo create() {
            return builder().build();
        }

        public static final class Builder {

            public TenantInfo build() {
                return new TenantInfo(this);
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
