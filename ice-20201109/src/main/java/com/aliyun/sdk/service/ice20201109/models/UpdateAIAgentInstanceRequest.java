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
 * {@link UpdateAIAgentInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAIAgentInstanceRequest</p>
 */
public class UpdateAIAgentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentConfig")
    private AIAgentConfig agentConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @Deprecated
    private AIAgentTemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UpdateAIAgentInstanceRequest(Builder builder) {
        super(builder);
        this.agentConfig = builder.agentConfig;
        this.instanceId = builder.instanceId;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
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
     * @return agentConfig
     */
    public AIAgentConfig getAgentConfig() {
        return this.agentConfig;
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

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UpdateAIAgentInstanceRequest, Builder> {
        private AIAgentConfig agentConfig; 
        private String instanceId; 
        private AIAgentTemplateConfig templateConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAIAgentInstanceRequest request) {
            super(request);
            this.agentConfig = request.agentConfig;
            this.instanceId = request.instanceId;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
        } 

        /**
         * <p>The agent configuration to be updated. This configuration is merged with the configuration used when the instance was started. For more information, see the AIAgentConfig definition. The following parameters in AIAgentTemplateConfig can be updated:</p>
         * <ul>
         * <li><p>VoiceId</p>
         * </li>
         * <li><p>EnableVoiceInterrupt</p>
         * </li>
         * <li><p>Greeting</p>
         * </li>
         * <li><p>Volume</p>
         * </li>
         * <li><p>EnablePushToTalk</p>
         * </li>
         * <li><p>UseVoiceprint</p>
         * </li>
         * <li><p>BailianAppParams</p>
         * </li>
         * </ul>
         */
        public Builder agentConfig(AIAgentConfig agentConfig) {
            String agentConfigShrink = shrink(agentConfig, "AgentConfig", "json");
            this.putQueryParameter("AgentConfig", agentConfigShrink);
            this.agentConfig = agentConfig;
            return this;
        }

        /**
         * <p>The agent instance ID.</p>
         * <blockquote>
         * <p>The InstanceId is the unique ID returned after the agent instance is successfully started. For more information about the API operations used to start an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <blockquote>
         * <p>The agent template configuration. <strong>[Deprecated]</strong> Use the AgentConfig parameter instead.</p>
         * </blockquote>
         * <p>The agent configuration to be updated. This configuration is merged with the configuration used when the instance was started. For more information, see the <a href="https://help.aliyun.com/document_detail/2846193.html">AIAgentTemplateConfig</a> definition.
         * The following parameters in AIAgentTemplateConfig can be updated:</p>
         * <ul>
         * <li><p>VoiceId (voice ID)</p>
         * </li>
         * <li><p>EnableVoiceInterrupt (enable voice interruption)</p>
         * </li>
         * <li><p>Greeting (greeting)</p>
         * </li>
         * <li><p>Volume (volume)</p>
         * </li>
         * <li><p>EnablePushToTalk (enable push-to-talk)</p>
         * </li>
         * <li><p>UseVoiceprint (use voiceprint)</p>
         * </li>
         * <li><p>AsrMaxSilence (maximum ASR silence duration)</p>
         * </li>
         * </ul>
         */
        public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The custom user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VoiceId&quot;:&quot;xiaoxia&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UpdateAIAgentInstanceRequest build() {
            return new UpdateAIAgentInstanceRequest(this);
        } 

    } 

}
