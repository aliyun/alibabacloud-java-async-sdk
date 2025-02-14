// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link StartAIAgentInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartAIAgentInstanceRequest</p>
 */
public class StartAIAgentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private AIAgentRuntimeConfig runtimeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private AIAgentTemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private StartAIAgentInstanceRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.runtimeConfig = builder.runtimeConfig;
        this.sessionId = builder.sessionId;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIAgentInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return runtimeConfig
     */
    public AIAgentRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return templateConfig
     */
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<StartAIAgentInstanceRequest, Builder> {
        private String AIAgentId; 
        private AIAgentRuntimeConfig runtimeConfig; 
        private String sessionId; 
        private AIAgentTemplateConfig templateConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(StartAIAgentInstanceRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.runtimeConfig = request.runtimeConfig;
            this.sessionId = request.sessionId;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder runtimeConfig(AIAgentRuntimeConfig runtimeConfig) {
            String runtimeConfigShrink = shrink(runtimeConfig, "RuntimeConfig", "json");
            this.putQueryParameter("RuntimeConfig", runtimeConfigShrink);
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
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

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public StartAIAgentInstanceRequest build() {
            return new StartAIAgentInstanceRequest(this);
        } 

    } 

}
