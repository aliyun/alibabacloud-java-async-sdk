// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptRequest</p>
 */
public class CreateScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentLlm")
    private Boolean agentLlm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrConfig")
    private String asrConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatbotId")
    private String chatbotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmotionEnable")
    private Boolean emotionEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Industry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LongWaitEnable")
    private Boolean longWaitEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MiniPlaybackEnable")
    private Boolean miniPlaybackEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewBargeInEnable")
    private Boolean newBargeInEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluAccessType")
    private String nluAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluEngine")
    private String nluEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptContent")
    private java.util.List<String> scriptContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptDescription")
    private String scriptDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptWaveform")
    private java.util.List<String> scriptWaveform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private String ttsConfig;

    private CreateScriptRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentKey = builder.agentKey;
        this.agentLlm = builder.agentLlm;
        this.asrConfig = builder.asrConfig;
        this.chatbotId = builder.chatbotId;
        this.emotionEnable = builder.emotionEnable;
        this.industry = builder.industry;
        this.instanceId = builder.instanceId;
        this.longWaitEnable = builder.longWaitEnable;
        this.miniPlaybackEnable = builder.miniPlaybackEnable;
        this.newBargeInEnable = builder.newBargeInEnable;
        this.nluAccessType = builder.nluAccessType;
        this.nluEngine = builder.nluEngine;
        this.scene = builder.scene;
        this.scriptContent = builder.scriptContent;
        this.scriptDescription = builder.scriptDescription;
        this.scriptName = builder.scriptName;
        this.scriptWaveform = builder.scriptWaveform;
        this.ttsConfig = builder.ttsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return agentLlm
     */
    public Boolean getAgentLlm() {
        return this.agentLlm;
    }

    /**
     * @return asrConfig
     */
    public String getAsrConfig() {
        return this.asrConfig;
    }

    /**
     * @return chatbotId
     */
    public String getChatbotId() {
        return this.chatbotId;
    }

    /**
     * @return emotionEnable
     */
    public Boolean getEmotionEnable() {
        return this.emotionEnable;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return longWaitEnable
     */
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    /**
     * @return miniPlaybackEnable
     */
    public Boolean getMiniPlaybackEnable() {
        return this.miniPlaybackEnable;
    }

    /**
     * @return newBargeInEnable
     */
    public Boolean getNewBargeInEnable() {
        return this.newBargeInEnable;
    }

    /**
     * @return nluAccessType
     */
    public String getNluAccessType() {
        return this.nluAccessType;
    }

    /**
     * @return nluEngine
     */
    public String getNluEngine() {
        return this.nluEngine;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return scriptContent
     */
    public java.util.List<String> getScriptContent() {
        return this.scriptContent;
    }

    /**
     * @return scriptDescription
     */
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return scriptWaveform
     */
    public java.util.List<String> getScriptWaveform() {
        return this.scriptWaveform;
    }

    /**
     * @return ttsConfig
     */
    public String getTtsConfig() {
        return this.ttsConfig;
    }

    public static final class Builder extends Request.Builder<CreateScriptRequest, Builder> {
        private Long agentId; 
        private String agentKey; 
        private Boolean agentLlm; 
        private String asrConfig; 
        private String chatbotId; 
        private Boolean emotionEnable; 
        private String industry; 
        private String instanceId; 
        private Boolean longWaitEnable; 
        private Boolean miniPlaybackEnable; 
        private Boolean newBargeInEnable; 
        private String nluAccessType; 
        private String nluEngine; 
        private String scene; 
        private java.util.List<String> scriptContent; 
        private String scriptDescription; 
        private String scriptName; 
        private java.util.List<String> scriptWaveform; 
        private String ttsConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentKey = request.agentKey;
            this.agentLlm = request.agentLlm;
            this.asrConfig = request.asrConfig;
            this.chatbotId = request.chatbotId;
            this.emotionEnable = request.emotionEnable;
            this.industry = request.industry;
            this.instanceId = request.instanceId;
            this.longWaitEnable = request.longWaitEnable;
            this.miniPlaybackEnable = request.miniPlaybackEnable;
            this.newBargeInEnable = request.newBargeInEnable;
            this.nluAccessType = request.nluAccessType;
            this.nluEngine = request.nluEngine;
            this.scene = request.scene;
            this.scriptContent = request.scriptContent;
            this.scriptDescription = request.scriptDescription;
            this.scriptName = request.scriptName;
            this.scriptWaveform = request.scriptWaveform;
            this.ttsConfig = request.ttsConfig;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * AgentLlm.
         */
        public Builder agentLlm(Boolean agentLlm) {
            this.putQueryParameter("AgentLlm", agentLlm);
            this.agentLlm = agentLlm;
            return this;
        }

        /**
         * AsrConfig.
         */
        public Builder asrConfig(String asrConfig) {
            this.putQueryParameter("AsrConfig", asrConfig);
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * ChatbotId.
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * EmotionEnable.
         */
        public Builder emotionEnable(Boolean emotionEnable) {
            this.putQueryParameter("EmotionEnable", emotionEnable);
            this.emotionEnable = emotionEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LongWaitEnable.
         */
        public Builder longWaitEnable(Boolean longWaitEnable) {
            this.putQueryParameter("LongWaitEnable", longWaitEnable);
            this.longWaitEnable = longWaitEnable;
            return this;
        }

        /**
         * MiniPlaybackEnable.
         */
        public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
            this.putQueryParameter("MiniPlaybackEnable", miniPlaybackEnable);
            this.miniPlaybackEnable = miniPlaybackEnable;
            return this;
        }

        /**
         * NewBargeInEnable.
         */
        public Builder newBargeInEnable(Boolean newBargeInEnable) {
            this.putQueryParameter("NewBargeInEnable", newBargeInEnable);
            this.newBargeInEnable = newBargeInEnable;
            return this;
        }

        /**
         * NluAccessType.
         */
        public Builder nluAccessType(String nluAccessType) {
            this.putQueryParameter("NluAccessType", nluAccessType);
            this.nluAccessType = nluAccessType;
            return this;
        }

        /**
         * NluEngine.
         */
        public Builder nluEngine(String nluEngine) {
            this.putQueryParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * ScriptContent.
         */
        public Builder scriptContent(java.util.List<String> scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * ScriptDescription.
         */
        public Builder scriptDescription(String scriptDescription) {
            this.putQueryParameter("ScriptDescription", scriptDescription);
            this.scriptDescription = scriptDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * ScriptWaveform.
         */
        public Builder scriptWaveform(java.util.List<String> scriptWaveform) {
            this.putQueryParameter("ScriptWaveform", scriptWaveform);
            this.scriptWaveform = scriptWaveform;
            return this;
        }

        /**
         * TtsConfig.
         */
        public Builder ttsConfig(String ttsConfig) {
            this.putQueryParameter("TtsConfig", ttsConfig);
            this.ttsConfig = ttsConfig;
            return this;
        }

        @Override
        public CreateScriptRequest build() {
            return new CreateScriptRequest(this);
        } 

    } 

}
