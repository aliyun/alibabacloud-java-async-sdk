// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushNotificationsRequest} extends {@link RequestModel}
 *
 * <p>PushNotificationsRequest</p>
 */
public class PushNotificationsRequest extends Request {
    @Body
    @NameInMap("NotificationUnicastRequest")
    @Validation(required = true)
    private NotificationUnicastRequest notificationUnicastRequest;

    @Body
    @NameInMap("TenantInfo")
    private TenantInfo tenantInfo;

    private PushNotificationsRequest(Builder builder) {
        super(builder);
        this.notificationUnicastRequest = builder.notificationUnicastRequest;
        this.tenantInfo = builder.tenantInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushNotificationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PushNotificationsRequest, Builder> {
        private NotificationUnicastRequest notificationUnicastRequest; 
        private TenantInfo tenantInfo; 

        private Builder() {
            super();
        } 

        private Builder(PushNotificationsRequest request) {
            super(request);
            this.notificationUnicastRequest = request.notificationUnicastRequest;
            this.tenantInfo = request.tenantInfo;
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

        @Override
        public PushNotificationsRequest build() {
            return new PushNotificationsRequest(this);
        } 

    } 

    public static class SendTarget extends TeaModel {
        @NameInMap("TargetIdentity")
        private String targetIdentity;

        @NameInMap("TargetType")
        private String targetType;

        private SendTarget(Builder builder) {
            this.targetIdentity = builder.targetIdentity;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendTarget create() {
            return builder().build();
        }

        /**
         * @return targetIdentity
         */
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String targetIdentity; 
            private String targetType; 

            /**
             * TargetIdentity.
             */
            public Builder targetIdentity(String targetIdentity) {
                this.targetIdentity = targetIdentity;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public SendTarget build() {
                return new SendTarget(this);
            } 

        } 

    }
    public static class NotificationUnicastRequest extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("IsDebug")
        private Boolean isDebug;

        @NameInMap("MessageTemplateId")
        @Validation(required = true)
        private String messageTemplateId;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("PlaceHolder")
        private java.util.Map < String, String > placeHolder;

        @NameInMap("SendTarget")
        @Validation(required = true)
        private SendTarget sendTarget;

        private NotificationUnicastRequest(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.isDebug = builder.isDebug;
            this.messageTemplateId = builder.messageTemplateId;
            this.organizationId = builder.organizationId;
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
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
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
            private String encodeKey; 
            private String encodeType; 
            private Boolean isDebug; 
            private String messageTemplateId; 
            private String organizationId; 
            private java.util.Map < String, String > placeHolder; 
            private SendTarget sendTarget; 

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
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
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
}
