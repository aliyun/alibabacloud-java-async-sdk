// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceGroupRequest</p>
 */
public class UpdateServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableWebhook")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableWebhook;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("monitorSourceTemplates")
    private java.util.List < MonitorSourceTemplates> monitorSourceTemplates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupDescription")
    private String serviceGroupDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > userIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("webhookLink")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhookLink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("webhookType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhookType;

    private UpdateServiceGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enableWebhook = builder.enableWebhook;
        this.monitorSourceTemplates = builder.monitorSourceTemplates;
        this.serviceGroupDescription = builder.serviceGroupDescription;
        this.serviceGroupId = builder.serviceGroupId;
        this.serviceGroupName = builder.serviceGroupName;
        this.userIds = builder.userIds;
        this.webhookLink = builder.webhookLink;
        this.webhookType = builder.webhookType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableWebhook
     */
    public String getEnableWebhook() {
        return this.enableWebhook;
    }

    /**
     * @return monitorSourceTemplates
     */
    public java.util.List < MonitorSourceTemplates> getMonitorSourceTemplates() {
        return this.monitorSourceTemplates;
    }

    /**
     * @return serviceGroupDescription
     */
    public String getServiceGroupDescription() {
        return this.serviceGroupDescription;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return serviceGroupName
     */
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    /**
     * @return userIds
     */
    public java.util.List < Long > getUserIds() {
        return this.userIds;
    }

    /**
     * @return webhookLink
     */
    public String getWebhookLink() {
        return this.webhookLink;
    }

    /**
     * @return webhookType
     */
    public String getWebhookType() {
        return this.webhookType;
    }

    public static final class Builder extends Request.Builder<UpdateServiceGroupRequest, Builder> {
        private String clientToken; 
        private String enableWebhook; 
        private java.util.List < MonitorSourceTemplates> monitorSourceTemplates; 
        private String serviceGroupDescription; 
        private Long serviceGroupId; 
        private String serviceGroupName; 
        private java.util.List < Long > userIds; 
        private String webhookLink; 
        private String webhookType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enableWebhook = request.enableWebhook;
            this.monitorSourceTemplates = request.monitorSourceTemplates;
            this.serviceGroupDescription = request.serviceGroupDescription;
            this.serviceGroupId = request.serviceGroupId;
            this.serviceGroupName = request.serviceGroupName;
            this.userIds = request.userIds;
            this.webhookLink = request.webhookLink;
            this.webhookType = request.webhookType;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * enableWebhook.
         */
        public Builder enableWebhook(String enableWebhook) {
            this.putBodyParameter("enableWebhook", enableWebhook);
            this.enableWebhook = enableWebhook;
            return this;
        }

        /**
         * monitorSourceTemplates.
         */
        public Builder monitorSourceTemplates(java.util.List < MonitorSourceTemplates> monitorSourceTemplates) {
            this.putBodyParameter("monitorSourceTemplates", monitorSourceTemplates);
            this.monitorSourceTemplates = monitorSourceTemplates;
            return this;
        }

        /**
         * serviceGroupDescription.
         */
        public Builder serviceGroupDescription(String serviceGroupDescription) {
            this.putBodyParameter("serviceGroupDescription", serviceGroupDescription);
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * serviceGroupName.
         */
        public Builder serviceGroupName(String serviceGroupName) {
            this.putBodyParameter("serviceGroupName", serviceGroupName);
            this.serviceGroupName = serviceGroupName;
            return this;
        }

        /**
         * userIds.
         */
        public Builder userIds(java.util.List < Long > userIds) {
            this.putBodyParameter("userIds", userIds);
            this.userIds = userIds;
            return this;
        }

        /**
         * webhookLink.
         */
        public Builder webhookLink(String webhookLink) {
            this.putBodyParameter("webhookLink", webhookLink);
            this.webhookLink = webhookLink;
            return this;
        }

        /**
         * webhookType.
         */
        public Builder webhookType(String webhookType) {
            this.putBodyParameter("webhookType", webhookType);
            this.webhookType = webhookType;
            return this;
        }

        @Override
        public UpdateServiceGroupRequest build() {
            return new UpdateServiceGroupRequest(this);
        } 

    } 

    public static class MonitorSourceTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @com.aliyun.core.annotation.NameInMap("monitorSourceName")
        private String monitorSourceName;

        @com.aliyun.core.annotation.NameInMap("templateContent")
        private String templateContent;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        private MonitorSourceTemplates(Builder builder) {
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
            this.templateContent = builder.templateContent;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorSourceTemplates create() {
            return builder().build();
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Long monitorSourceId; 
            private String monitorSourceName; 
            private String templateContent; 
            private Long templateId; 

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            /**
             * templateContent.
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public MonitorSourceTemplates build() {
                return new MonitorSourceTemplates(this);
            } 

        } 

    }
}
