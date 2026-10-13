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
    @com.aliyun.core.annotation.NameInMap("ScriptNluProfileJsonString")
    private String scriptNluProfileJsonString;

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
        this.scriptNluProfileJsonString = builder.scriptNluProfileJsonString;
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
     * @return scriptNluProfileJsonString
     */
    public String getScriptNluProfileJsonString() {
        return this.scriptNluProfileJsonString;
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
        private String scriptNluProfileJsonString; 
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
            this.scriptNluProfileJsonString = request.scriptNluProfileJsonString;
            this.scriptWaveform = request.scriptWaveform;
            this.ttsConfig = request.ttsConfig;
        } 

        /**
         * <p>Robot workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>1198938</p>
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>Robot workspace access Key</p>
         * 
         * <strong>example:</strong>
         * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>Is the robot workspace a Large Language Model (LLM) workspace?</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder agentLlm(Boolean agentLlm) {
            this.putQueryParameter("AgentLlm", agentLlm);
            this.agentLlm = agentLlm;
            return this;
        }

        /**
         * <p>ASR configuration. Parameter definitions:</p>
         * <ul>
         * <li><p><strong>appKey</strong>: Alibaba Cloud account appKey.</p>
         * </li>
         * <li><p><strong>maxEndSilence</strong>: Voice endpoint detection duration.</p>
         * </li>
         * <li><p><strong>silenceTimeout</strong>: Silence timeout. Unit: seconds. The user times out after N seconds of silence.</p>
         * </li>
         * <li><p><strong>engine</strong>: Invoke service; [ali, xunfei]</p>
         * </li>
         * <li><p><strong>nlsServiceType</strong>: Invoke service type [Managed, Authorized]</p>
         * </li>
         * <li><p><strong>engineXunfei</strong>: If the caller is xunfei, enter the corresponding configuration.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you select ali as the engine and Authorized as the nlsServiceType, a custom service is used, and the service provider is ali. If you select ali as the engine and Managed as the nlsServiceType, the default service is used. If you select xunfei as the engine and Authorized as the nlsServiceType, xunfei is the service provider. You must enter the xunfei configuration: {&quot;uuid&quot;:&quot;ed2xxxxxxxxx&quot;,&quot;globalMaxEndSilence&quot;:700,&quot;globalMaxEndSilenceEnable&quot;:true}</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>globalMaxEndSilence</strong>: Silence detection. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>globalMaxEndSilenceEnable</strong>: Silence detection switch. Enabled by default.</p>
         * </li>
         * <li><p><strong>speechNoiseThreshold</strong>: Noise filtering threshold</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;appKey&quot;: &quot;oQDVNlE6fZ5mg46X&quot;,
         *     &quot;engine&quot;: &quot;ali&quot;,
         *     &quot;engineXunfei&quot;: &quot;&quot;,
         *     &quot;globalMaxEndSilence&quot;: 700,
         *     &quot;globalMaxEndSilenceEnable&quot;: true,
         *     &quot;maxEndSilence&quot;: &quot;500&quot;,
         *     &quot;nlsServiceType&quot;: &quot;Managed&quot;,
         *     &quot;silenceTimeout&quot;: &quot;5000&quot;,
         *     &quot;speechNoiseThreshold&quot;: &quot;0&quot;
         * }</p>
         */
        public Builder asrConfig(String asrConfig) {
            this.putQueryParameter("AsrConfig", asrConfig);
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * <p>If the NluServiceType of the instance is Authorized or Provided, specify the ID of the chatbot instance to which the script needs to be attached using this field.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-IfaUfqaUnb</p>
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * <p>Emotion detection configuration switch (applicable to small models)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder emotionEnable(Boolean emotionEnable) {
            this.putQueryParameter("EmotionEnable", emotionEnable);
            this.emotionEnable = emotionEnable;
            return this;
        }

        /**
         * <p>Industry</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>教育</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * <p>Instance ID</p>
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
         * <p>Intelligent sentence segmentation configuration switch (applicable to small models)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder longWaitEnable(Boolean longWaitEnable) {
            this.putQueryParameter("LongWaitEnable", longWaitEnable);
            this.longWaitEnable = longWaitEnable;
            return this;
        }

        /**
         * <p>Connective phrase configuration switch (applicable to small models)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
            this.putQueryParameter("MiniPlaybackEnable", miniPlaybackEnable);
            this.miniPlaybackEnable = miniPlaybackEnable;
            return this;
        }

        /**
         * <p>Graceful interruption configuration switch (applicable to small models)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newBargeInEnable(Boolean newBargeInEnable) {
            this.putQueryParameter("NewBargeInEnable", newBargeInEnable);
            this.newBargeInEnable = newBargeInEnable;
            return this;
        }

        /**
         * <p>NLU access method (applicable only to Large Language Model (LLM) scenarios). Enumeration: Managed - Access using an Alibaba public account. This field is empty for non-LLM scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        public Builder nluAccessType(String nluAccessType) {
            this.putQueryParameter("NluAccessType", nluAccessType);
            this.nluAccessType = nluAccessType;
            return this;
        }

        /**
         * <p>NLU engine (applicable only to Large Language Model (LLM) scenarios). This field is empty for non-LLM scenarios.</p>
         * <ul>
         * <li><p>Prompts - Large Language Model (LLM) scenario,</p>
         * </li>
         * <li><p>SSE_FUNCTION - Function Compute pattern.</p>
         * </li>
         * <li><p>BeeBot - Workflow pattern.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prompts</p>
         */
        public Builder nluEngine(String nluEngine) {
            this.putQueryParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        /**
         * <p>Scenario</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>回访</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>For notification instances, pass in the script list. Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder scriptContent(java.util.List<String> scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * <p>Script description</p>
         * 
         * <strong>example:</strong>
         * <p>课程回复话术</p>
         */
        public Builder scriptDescription(String scriptDescription) {
            this.putQueryParameter("ScriptDescription", scriptDescription);
            this.scriptDescription = scriptDescription;
            return this;
        }

        /**
         * <p>Script name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>课程满意度回访</p>
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * <blockquote>
         * <p>If nluEngine is SSE_FUNCTION, you must pass in the corresponding configuration.</p>
         * </blockquote>
         * <p>Function Compute service pattern configuration</p>
         * <ul>
         * <li><p>fcRegion: Function service region</p>
         * </li>
         * <li><p>fcFunction: Function service name</p>
         * </li>
         * <li><p>fcHttpTriggerUrl Function service trigger</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fcRegion&quot;:&quot;cn-shanghai&quot;,&quot;fcFunction&quot;:&quot;waihu_test&quot;,&quot;fcHttpTriggerUrl&quot;:&quot;<a href="https://waihu-test.xxxxxxxxxxx.cn-shanghai-vpc.fcapp.run%22%7D">https://waihu-test.xxxxxxxxxxx.cn-shanghai-vpc.fcapp.run&quot;}</a></p>
         */
        public Builder scriptNluProfileJsonString(String scriptNluProfileJsonString) {
            this.putQueryParameter("ScriptNluProfileJsonString", scriptNluProfileJsonString);
            this.scriptNluProfileJsonString = scriptNluProfileJsonString;
            return this;
        }

        /**
         * <p>For notification instances, pass in the script voice list. Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder scriptWaveform(java.util.List<String> scriptWaveform) {
            this.putQueryParameter("ScriptWaveform", scriptWaveform);
            this.scriptWaveform = scriptWaveform;
            return this;
        }

        /**
         * <p>TTS configuration. Parameter definitions:</p>
         * <ul>
         * <li><p><strong>voice</strong>: Speaker.</p>
         * </li>
         * <li><p><strong>volume</strong>: Volume. Value range: 0 to 100. Default value: 50.</p>
         * </li>
         * <li><p><strong>speechRate</strong>: Speech rate. Value range: -500 to 500. Default value: 0.</p>
         * </li>
         * <li><p><strong>pitchRate</strong>: Pitch rate. Value range: -500 to 500. Default value: 0.</p>
         * </li>
         * <li><p><strong>globalInterruptible</strong>: Voice interruption configuration.
         * -<strong>engine</strong>: Invoke service; [ali, volc, xunfei]. Large Language Model (LLM) scenarios do not support xunfei.</p>
         * </li>
         * <li><p><strong>nlsServiceType</strong>: Service type. [Managed, Authorized]</p>
         * </li>
         * <li><p><strong>engineXunfei</strong>: Configuration when the service provider is xunfei.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>1\. If you select ali as the engine and Authorized as the nlsServiceType, a custom service is used. 2. If the service provider is ali, and you select ali as the engine and Managed as the nlsServiceType, the default service is used. 3. If you select xunfei as the engine (applicable to small model scenarios) and Authorized as the nlsServiceType, xunfei is the service provider. You must enter the engineXunfei configuration: {&quot;pitchRate&quot;:50,&quot;speechRate&quot;:50,&quot;voice&quot;:&quot;aisjiuxu&quot;,&quot;volume&quot;:50}. 4. If you select volc as the engine and Authorized as the nlsServiceType, it applies to doubao.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;appKey&quot;: &quot;oQDVNlE6fZ5mg46X&quot;,
         *     &quot;engine&quot;: &quot;ali&quot;,
         *     &quot;engineXunfei&quot;: &quot;&quot;,
         *     &quot;globalInterruptible&quot;: true,
         *     &quot;nlsServiceType&quot;: &quot;Managed&quot;,
         *     &quot;pitchRate&quot;: &quot;0&quot;,
         *     &quot;speechRate&quot;: &quot;0&quot;,
         *     &quot;voice&quot;: &quot;zhiyuan&quot;,
         *     &quot;volume&quot;: &quot;50&quot;
         * }</p>
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
