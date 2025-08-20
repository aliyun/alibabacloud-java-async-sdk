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
 * {@link SendNotificationsRequest} extends {@link RequestModel}
 *
 * <p>SendNotificationsRequest</p>
 */
public class SendNotificationsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotificationUnicastRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private NotificationUnicastRequest notificationUnicastRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantInfo")
    private TenantInfo tenantInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link SendNotificationsRequest} extends {@link TeaModel}
     *
     * <p>SendNotificationsRequest</p>
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
     * {@link SendNotificationsRequest} extends {@link TeaModel}
     *
     * <p>SendNotificationsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SendTarget model) {
            } 

            public SendTarget build() {
                return new SendTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNotificationsRequest} extends {@link TeaModel}
     *
     * <p>SendNotificationsRequest</p>
     */
    public static class NotificationUnicastRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDebug")
        private Boolean isDebug;

        @com.aliyun.core.annotation.NameInMap("MessageTemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String messageTemplateId;

        @com.aliyun.core.annotation.NameInMap("PlaceHolder")
        private java.util.Map<String, String> placeHolder;

        @com.aliyun.core.annotation.NameInMap("SendTarget")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public java.util.Map<String, String> getPlaceHolder() {
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
            private java.util.Map<String, String> placeHolder; 
            private SendTarget sendTarget; 

            private Builder() {
            } 

            private Builder(NotificationUnicastRequest model) {
                this.isDebug = model.isDebug;
                this.messageTemplateId = model.messageTemplateId;
                this.placeHolder = model.placeHolder;
                this.sendTarget = model.sendTarget;
            } 

            /**
             * IsDebug.
             */
            public Builder isDebug(Boolean isDebug) {
                this.isDebug = isDebug;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2iU81*****G9elJ</p>
             */
            public Builder messageTemplateId(String messageTemplateId) {
                this.messageTemplateId = messageTemplateId;
                return this;
            }

            /**
             * PlaceHolder.
             */
            public Builder placeHolder(java.util.Map<String, String> placeHolder) {
                this.placeHolder = placeHolder;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link SendNotificationsRequest} extends {@link TeaModel}
     *
     * <p>SendNotificationsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(TenantInfo model) {
            } 

            public TenantInfo build() {
                return new TenantInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendNotificationsRequest} extends {@link TeaModel}
     *
     * <p>SendNotificationsRequest</p>
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
