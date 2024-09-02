// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAIAgentInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAIAgentInstanceRequest</p>
 */
public class UpdateAIAgentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private AIAgentTemplateConfig templateConfig;

    private UpdateAIAgentInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateConfig = builder.templateConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAIAgentInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return templateConfig
     */
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public static final class Builder extends Request.Builder<UpdateAIAgentInstanceRequest, Builder> {
        private String instanceId; 
        private AIAgentTemplateConfig templateConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAIAgentInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateConfig = request.templateConfig;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        @Override
        public UpdateAIAgentInstanceRequest build() {
            return new UpdateAIAgentInstanceRequest(this);
        } 

    } 

}
