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
 * {@link ModifyScriptRequest} extends {@link RequestModel}
 *
 * <p>ModifyScriptRequest</p>
 */
public class ModifyScriptRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ChatConfig")
    private String chatConfig;

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
    @com.aliyun.core.annotation.NameInMap("LabelConfig")
    private String labelConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LongWaitEnable")
    private Boolean longWaitEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MiniPlaybackConfigListJsonString")
    private String miniPlaybackConfigListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MiniPlaybackEnable")
    private Boolean miniPlaybackEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewBargeInEnable")
    private Boolean newBargeInEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsConfig")
    private String nlsConfig;

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
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

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

    private ModifyScriptRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentKey = builder.agentKey;
        this.agentLlm = builder.agentLlm;
        this.asrConfig = builder.asrConfig;
        this.chatConfig = builder.chatConfig;
        this.chatbotId = builder.chatbotId;
        this.emotionEnable = builder.emotionEnable;
        this.industry = builder.industry;
        this.instanceId = builder.instanceId;
        this.labelConfig = builder.labelConfig;
        this.longWaitEnable = builder.longWaitEnable;
        this.miniPlaybackConfigListJsonString = builder.miniPlaybackConfigListJsonString;
        this.miniPlaybackEnable = builder.miniPlaybackEnable;
        this.newBargeInEnable = builder.newBargeInEnable;
        this.nlsConfig = builder.nlsConfig;
        this.nluAccessType = builder.nluAccessType;
        this.nluEngine = builder.nluEngine;
        this.scene = builder.scene;
        this.scriptContent = builder.scriptContent;
        this.scriptDescription = builder.scriptDescription;
        this.scriptId = builder.scriptId;
        this.scriptName = builder.scriptName;
        this.scriptWaveform = builder.scriptWaveform;
        this.ttsConfig = builder.ttsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScriptRequest create() {
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
     * @return chatConfig
     */
    public String getChatConfig() {
        return this.chatConfig;
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
     * @return labelConfig
     */
    public String getLabelConfig() {
        return this.labelConfig;
    }

    /**
     * @return longWaitEnable
     */
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    /**
     * @return miniPlaybackConfigListJsonString
     */
    public String getMiniPlaybackConfigListJsonString() {
        return this.miniPlaybackConfigListJsonString;
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
     * @return nlsConfig
     */
    public String getNlsConfig() {
        return this.nlsConfig;
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
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

    public static final class Builder extends Request.Builder<ModifyScriptRequest, Builder> {
        private Long agentId; 
        private String agentKey; 
        private Boolean agentLlm; 
        private String asrConfig; 
        private String chatConfig; 
        private String chatbotId; 
        private Boolean emotionEnable; 
        private String industry; 
        private String instanceId; 
        private String labelConfig; 
        private Boolean longWaitEnable; 
        private String miniPlaybackConfigListJsonString; 
        private Boolean miniPlaybackEnable; 
        private Boolean newBargeInEnable; 
        private String nlsConfig; 
        private String nluAccessType; 
        private String nluEngine; 
        private String scene; 
        private java.util.List<String> scriptContent; 
        private String scriptDescription; 
        private String scriptId; 
        private String scriptName; 
        private java.util.List<String> scriptWaveform; 
        private String ttsConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScriptRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentKey = request.agentKey;
            this.agentLlm = request.agentLlm;
            this.asrConfig = request.asrConfig;
            this.chatConfig = request.chatConfig;
            this.chatbotId = request.chatbotId;
            this.emotionEnable = request.emotionEnable;
            this.industry = request.industry;
            this.instanceId = request.instanceId;
            this.labelConfig = request.labelConfig;
            this.longWaitEnable = request.longWaitEnable;
            this.miniPlaybackConfigListJsonString = request.miniPlaybackConfigListJsonString;
            this.miniPlaybackEnable = request.miniPlaybackEnable;
            this.newBargeInEnable = request.newBargeInEnable;
            this.nlsConfig = request.nlsConfig;
            this.nluAccessType = request.nluAccessType;
            this.nluEngine = request.nluEngine;
            this.scene = request.scene;
            this.scriptContent = request.scriptContent;
            this.scriptDescription = request.scriptDescription;
            this.scriptId = request.scriptId;
            this.scriptName = request.scriptName;
            this.scriptWaveform = request.scriptWaveform;
            this.ttsConfig = request.ttsConfig;
        } 

        /**
         * <p>The ID of the robot workspace.</p>
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
         * <p>The access key for the robot workspace.</p>
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
         * <p>Indicates whether the robot workspace is a Large Language Model (LLM) workspace.</p>
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
         * <p>The ASR configuration. Parameter definitions:</p>
         * <ul>
         * <li><p><strong>appKey</strong>: The Alibaba Cloud account appKey.</p>
         * </li>
         * <li><p><strong>maxEndSilence</strong>: The duration for voice endpoint detection.</p>
         * </li>
         * <li><p><strong>silenceTimeout</strong>: The silence timeout. Unit: seconds. The system times out after the user is silent for N seconds.</p>
         * </li>
         * <li><p><strong>engine</strong>: The service to invoke. Valid values: ali, xunfei.</p>
         * </li>
         * <li><p><strong>nlsServiceType</strong>: The type of the invoked service.</p>
         * <ul>
         * <li><p>Managed: Public cloud NLS service.</p>
         * </li>
         * <li><p>Authorized: Authorized NLS service.</p>
         * </li>
         * <li><p>Provided: NLS service provided by the customer through AS/SK.</p>
         * </li>
         * <li><p>Apes: Private cloud service.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>engineXunfei</strong>: If the caller is xunfei, fill in the corresponding configuration.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If engine is set to ali and nlsServiceType is set to Authorized, a custom service is used, and the service provider is ali. If engine is set to ali and nlsServiceType is set to Managed, the default service is used. If engine is set to xunfei and nlsServiceType is set to Authorized, the service provider is xunfei. You must fill in the xunfei configuration, such as {&quot;uuid&quot;:&quot;ed2xxxxxxxxx&quot;,&quot;globalMaxEndSilence&quot;:700,&quot;globalMaxEndSilenceEnable&quot;:true}.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>globalMaxEndSilence</strong>: Silence detection. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>globalMaxEndSilenceEnable</strong>: The switch for silence detection. Default value: enabled.</p>
         * </li>
         * <li><p><strong>speechNoiseThreshold</strong>: The noise filtering threshold.</p>
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
         * <p>The call configuration.</p>
         * <ul>
         * <li><p>silenceConfig: Silence configuration.</p>
         * <ul>
         * <li><p>silenceReplyTimeout: The timeout period for silence replies, in milliseconds.</p>
         * </li>
         * <li><p>silenceTimeoutMaxCount: Hang up after several rounds of silence timeout.</p>
         * </li>
         * <li><p>silenceTimeoutMaxCountEnable: Indicates whether to hang up on silence.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>hangupConfig: Hang-up configuration.</p>
         * <ul>
         * <li><p>aiHangupEnable: AI hang-up. Valid values: true, false.</p>
         * </li>
         * <li><p>delayHangup: Delayed hang-up. Maximum value: 10.</p>
         * </li>
         * <li><p>hangupMaxRounds: Interaction rounds. Maximum value: 100.</p>
         * </li>
         * <li><p>hangupMaxRoundsBroadcast: The script for hang-up broadcast.</p>
         * </li>
         * <li><p>hangupMaxRoundsEnable: Determine the maximum number of interaction rounds. Valid values: true, false.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>securityInterceptConfig: Security block configuration.</p>
         * <ul>
         * <li>broadcast: The script for block broadcast.</li>
         * </ul>
         * </li>
         * <li><p>specialInterceptConfig: Special case block.</p>
         * <ul>
         * <li><p>specialInterceptEnable: The switch for special case block.</p>
         * </li>
         * <li><p>specialIntercepts: Special cases.</p>
         * <ul>
         * <li><p>voiceAssistant: Voice assistant.</p>
         * </li>
         * <li><p>extensionNumberTransfer: Extension number transfer.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>transitionConfig: Transition phrase model configuration.</p>
         * <ul>
         * <li>transitionSwitch: The switch for the transition phrase model.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;silenceConfig&quot;:{&quot;silenceReplyTimeout&quot;:499,&quot;silenceTimeoutMaxCount&quot;:10,&quot;silenceTimeoutMaxCountEnable&quot;:true},&quot;hangupConfig&quot;:{&quot;aiHangupEnable&quot;:false,&quot;delayHangup&quot;:0,&quot;hangupMaxRounds&quot;:20,&quot;hangupMaxRoundsBroadcast&quot;:&quot;感谢您的接听，祝您生活愉快，再见!&quot;,&quot;hangupMaxRoundsEnable&quot;:false},&quot;securityInterceptConfig&quot;:{&quot;broadcast&quot;:&quot;您说的这个问题我不能回答您，您可以尝试询问其他问题。&quot;},&quot;specialInterceptConfig&quot;:{&quot;specialInterceptEnable&quot;:false,&quot;specialIntercepts&quot;:[{&quot;code&quot;:&quot;voiceAssistant&quot;},{&quot;code&quot;:&quot;extensionNumberTransfer&quot;}]},&quot;transitionConfig&quot;:{&quot;transitionSwitch&quot;:false}}</p>
         */
        public Builder chatConfig(String chatConfig) {
            this.putQueryParameter("ChatConfig", chatConfig);
            this.chatConfig = chatConfig;
            return this;
        }

        /**
         * <p>The ID of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-iFZfi7eq6e</p>
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * <p>The switch for emotion detection configuration.</p>
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
         * <p>The industry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>电商</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LabelConfig.
         */
        public Builder labelConfig(String labelConfig) {
            this.putQueryParameter("LabelConfig", labelConfig);
            this.labelConfig = labelConfig;
            return this;
        }

        /**
         * <p>The switch for intelligent sentence segmentation configuration (small model).</p>
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
         * <p>The configuration for transition phrases. Customization is not supported temporarily. Do not pass this parameter by default. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder miniPlaybackConfigListJsonString(String miniPlaybackConfigListJsonString) {
            this.putQueryParameter("MiniPlaybackConfigListJsonString", miniPlaybackConfigListJsonString);
            this.miniPlaybackConfigListJsonString = miniPlaybackConfigListJsonString;
            return this;
        }

        /**
         * <p>The switch for transition phrase configuration (small model).</p>
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
         * <p>The switch for graceful barge-in configuration (small model).</p>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder nlsConfig(String nlsConfig) {
            this.putQueryParameter("NlsConfig", nlsConfig);
            this.nlsConfig = nlsConfig;
            return this;
        }

        /**
         * <p>The NLU access method (applicable only to Large Language Model (LLM) scenarios).</p>
         * <p>Enumeration:</p>
         * <ul>
         * <li><p>Managed: Access using an Alibaba Cloud public account.</p>
         * </li>
         * <li><p>This parameter is empty for non-LLM scenarios.</p>
         * </li>
         * </ul>
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
         * <p>The NLU engine (applicable only to Large Language Model (LLM) scenarios).</p>
         * <blockquote>
         * <p>After a scenario is created, you cannot modify the scenario mode.</p>
         * </blockquote>
         * <p>Enumeration:</p>
         * <ul>
         * <li><p>Prompts: Text filling mode.</p>
         * </li>
         * <li><p>SSE_FUNCTION: Function Compute mode.</p>
         * </li>
         * <li><p>This parameter is empty for non-LLM scenarios.</p>
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
         * <p>The scenario information.</p>
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
         * <p>For notification instances, pass in the script list. This parameter is deprecated.</p>
         */
        public Builder scriptContent(java.util.List<String> scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
            return this;
        }

        /**
         * <p>The description of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>返工回访话术</p>
         */
        public Builder scriptDescription(String scriptDescription) {
            this.putQueryParameter("ScriptDescription", scriptDescription);
            this.scriptDescription = scriptDescription;
            return this;
        }

        /**
         * <p>The ID of the script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c153d0d8-ba04-41c0-8632-453944c9dd0b</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The name of the script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>续费提醒</p>
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * <p>For notification instances, pass in the script voice list. This parameter is deprecated.</p>
         */
        public Builder scriptWaveform(java.util.List<String> scriptWaveform) {
            this.putQueryParameter("ScriptWaveform", scriptWaveform);
            this.scriptWaveform = scriptWaveform;
            return this;
        }

        /**
         * <p>The TTS configuration. Parameter definitions:</p>
         * <ul>
         * <li><p><strong>voice</strong>: The voice actor.</p>
         * </li>
         * <li><p><strong>volume</strong>: The volume. Valid values: 0 to 100. Default value: 50.</p>
         * </li>
         * <li><p><strong>speechRate</strong>: The speech rate. Valid values: -500 to 500. Default value: 0.</p>
         * </li>
         * <li><p><strong>pitchRate</strong>: The pitch rate. Valid values: -500 to 500. Default value: 0.</p>
         * </li>
         * <li><p><strong>globalInterruptible</strong>: The voice interruption configuration.</p>
         * </li>
         * <li><p><strong>engine</strong></p>
         * <p><strong>nlsServiceType</strong>: The type of the invoked service.</p>
         * <ul>
         * <li><p>Managed: Public cloud NLS service.</p>
         * </li>
         * <li><p>Authorized: Authorized NLS service.</p>
         * </li>
         * <li><p>Provided: NLS service provided by the customer through AS/SK.</p>
         * </li>
         * <li><p>Apes: Private cloud service.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>engineXunfei</strong>: The configuration when the service provider is xunfei.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>1\. If engine is set to ali and nlsServiceType is set to Authorized, a custom service is used. 2. If the service provider is ali, and engine is set to ali and nlsServiceType is set to Managed, the default service is used. 3. If engine is set to xunfei (applicable to small model scenarios) and nlsServiceType is set to Authorized, the service provider is xunfei. You must fill in the engineXunfei configuration, such as {&quot;pitchRate&quot;:50,&quot;speechRate&quot;:50,&quot;voice&quot;:&quot;aisjiuxu&quot;,&quot;volume&quot;:50}. 4. If engine is set to volc and nlsServiceType is set to Authorized, it indicates that Doubao is applicable.</p>
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
        public ModifyScriptRequest build() {
            return new ModifyScriptRequest(this);
        } 

    } 

}
