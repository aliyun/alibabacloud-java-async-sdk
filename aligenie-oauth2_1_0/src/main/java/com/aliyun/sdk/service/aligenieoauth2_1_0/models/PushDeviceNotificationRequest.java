// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link PushDeviceNotificationRequest} extends {@link RequestModel}
 *
 * <p>PushDeviceNotificationRequest</p>
 */
public class PushDeviceNotificationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantInfo")
    private TenantInfo tenantInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PushDeviceNotificationRequestBody body;

    private PushDeviceNotificationRequest(Builder builder) {
        super(builder);
        this.tenantInfo = builder.tenantInfo;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDeviceNotificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantInfo
     */
    public TenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    /**
     * @return body
     */
    public PushDeviceNotificationRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PushDeviceNotificationRequest, Builder> {
        private TenantInfo tenantInfo; 
        private PushDeviceNotificationRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(PushDeviceNotificationRequest request) {
            super(request);
            this.tenantInfo = request.tenantInfo;
            this.body = request.body;
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
         * body.
         */
        public Builder body(PushDeviceNotificationRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public PushDeviceNotificationRequest build() {
            return new PushDeviceNotificationRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushDeviceNotificationRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceNotificationRequest</p>
     */
    public static class TenantInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubjectId")
        private String subjectId;

        private TenantInfo(Builder builder) {
            this.subjectId = builder.subjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantInfo create() {
            return builder().build();
        }

        /**
         * @return subjectId
         */
        public String getSubjectId() {
            return this.subjectId;
        }

        public static final class Builder {
            private String subjectId; 

            private Builder() {
            } 

            private Builder(TenantInfo model) {
                this.subjectId = model.subjectId;
            } 

            /**
             * SubjectId.
             */
            public Builder subjectId(String subjectId) {
                this.subjectId = subjectId;
                return this;
            }

            public TenantInfo build() {
                return new TenantInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushDeviceNotificationRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceNotificationRequest</p>
     */
    public static class SendTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetIdentity")
        private String targetIdentity;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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

            private Builder() {
            } 

            private Builder(SendTarget model) {
                this.targetIdentity = model.targetIdentity;
                this.targetType = model.targetType;
            } 

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
    /**
     * 
     * {@link PushDeviceNotificationRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceNotificationRequest</p>
     */
    public static class PushDeviceNotificationRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("IsDebug")
        private Boolean isDebug;

        @com.aliyun.core.annotation.NameInMap("MessageTemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String messageTemplateId;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("PlaceHolder")
        private java.util.Map<String, String> placeHolder;

        @com.aliyun.core.annotation.NameInMap("SendTarget")
        @com.aliyun.core.annotation.Validation(required = true)
        private SendTarget sendTarget;

        private PushDeviceNotificationRequestBody(Builder builder) {
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

        public static PushDeviceNotificationRequestBody create() {
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
            private String encodeKey; 
            private String encodeType; 
            private Boolean isDebug; 
            private String messageTemplateId; 
            private String organizationId; 
            private java.util.Map<String, String> placeHolder; 
            private SendTarget sendTarget; 

            private Builder() {
            } 

            private Builder(PushDeviceNotificationRequestBody model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.isDebug = model.isDebug;
                this.messageTemplateId = model.messageTemplateId;
                this.organizationId = model.organizationId;
                this.placeHolder = model.placeHolder;
                this.sendTarget = model.sendTarget;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1923792******8R7392</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
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
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
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

            public PushDeviceNotificationRequestBody build() {
                return new PushDeviceNotificationRequestBody(this);
            } 

        } 

    }
}
