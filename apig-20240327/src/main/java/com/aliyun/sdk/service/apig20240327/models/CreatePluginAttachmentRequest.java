// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreatePluginAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginAttachmentRequest</p>
 */
public class CreatePluginAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceIds")
    private java.util.List<String> attachResourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginConfig")
    private String pluginConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    private CreatePluginAttachmentRequest(Builder builder) {
        super(builder);
        this.attachResourceIds = builder.attachResourceIds;
        this.attachResourceType = builder.attachResourceType;
        this.enable = builder.enable;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.pluginConfig = builder.pluginConfig;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceIds
     */
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return pluginConfig
     */
    public String getPluginConfig() {
        return this.pluginConfig;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<CreatePluginAttachmentRequest, Builder> {
        private java.util.List<String> attachResourceIds; 
        private String attachResourceType; 
        private Boolean enable; 
        private String environmentId; 
        private String gatewayId; 
        private String pluginConfig; 
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePluginAttachmentRequest request) {
            super(request);
            this.attachResourceIds = request.attachResourceIds;
            this.attachResourceType = request.attachResourceType;
            this.enable = request.enable;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.pluginConfig = request.pluginConfig;
            this.pluginId = request.pluginId;
        } 

        /**
         * attachResourceIds.
         */
        public Builder attachResourceIds(java.util.List<String> attachResourceIds) {
            this.putBodyParameter("attachResourceIds", attachResourceIds);
            this.attachResourceIds = attachResourceIds;
            return this;
        }

        /**
         * attachResourceType.
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putBodyParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * pluginConfig.
         */
        public Builder pluginConfig(String pluginConfig) {
            this.putBodyParameter("pluginConfig", pluginConfig);
            this.pluginConfig = pluginConfig;
            return this;
        }

        /**
         * pluginId.
         */
        public Builder pluginId(String pluginId) {
            this.putBodyParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public CreatePluginAttachmentRequest build() {
            return new CreatePluginAttachmentRequest(this);
        } 

    } 

}
