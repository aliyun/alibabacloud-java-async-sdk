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
 * {@link DescribeScriptResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScriptResponseBody</p>
 */
public class DescribeScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NlsConfig")
    private String nlsConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Script")
    private Script script;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nlsConfig = builder.nlsConfig;
        this.requestId = builder.requestId;
        this.script = builder.script;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nlsConfig
     */
    public String getNlsConfig() {
        return this.nlsConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return script
     */
    public Script getScript() {
        return this.script;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String nlsConfig; 
        private String requestId; 
        private Script script; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeScriptResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.nlsConfig = model.nlsConfig;
            this.requestId = model.requestId;
            this.script = model.script;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The API message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder nlsConfig(String nlsConfig) {
            this.nlsConfig = nlsConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The script.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder script(Script script) {
            this.script = script;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScriptResponseBody build() {
            return new DescribeScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScriptResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScriptResponseBody</p>
     */
    public static class NluProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcFunction")
        private String fcFunction;

        @com.aliyun.core.annotation.NameInMap("FcHttpTriggerUrl")
        private String fcHttpTriggerUrl;

        @com.aliyun.core.annotation.NameInMap("FcRegion")
        private String fcRegion;

        @com.aliyun.core.annotation.NameInMap("SupportBeebotPrompts")
        private Boolean supportBeebotPrompts;

        private NluProfile(Builder builder) {
            this.fcFunction = builder.fcFunction;
            this.fcHttpTriggerUrl = builder.fcHttpTriggerUrl;
            this.fcRegion = builder.fcRegion;
            this.supportBeebotPrompts = builder.supportBeebotPrompts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NluProfile create() {
            return builder().build();
        }

        /**
         * @return fcFunction
         */
        public String getFcFunction() {
            return this.fcFunction;
        }

        /**
         * @return fcHttpTriggerUrl
         */
        public String getFcHttpTriggerUrl() {
            return this.fcHttpTriggerUrl;
        }

        /**
         * @return fcRegion
         */
        public String getFcRegion() {
            return this.fcRegion;
        }

        /**
         * @return supportBeebotPrompts
         */
        public Boolean getSupportBeebotPrompts() {
            return this.supportBeebotPrompts;
        }

        public static final class Builder {
            private String fcFunction; 
            private String fcHttpTriggerUrl; 
            private String fcRegion; 
            private Boolean supportBeebotPrompts; 

            private Builder() {
            } 

            private Builder(NluProfile model) {
                this.fcFunction = model.fcFunction;
                this.fcHttpTriggerUrl = model.fcHttpTriggerUrl;
                this.fcRegion = model.fcRegion;
                this.supportBeebotPrompts = model.supportBeebotPrompts;
            } 

            /**
             * <p>The function service name.</p>
             * 
             * <strong>example:</strong>
             * <p>sanfang_test</p>
             */
            public Builder fcFunction(String fcFunction) {
                this.fcFunction = fcFunction;
                return this;
            }

            /**
             * <p>The HTTP trigger URL of the function.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run">http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run</a></p>
             */
            public Builder fcHttpTriggerUrl(String fcHttpTriggerUrl) {
                this.fcHttpTriggerUrl = fcHttpTriggerUrl;
                return this;
            }

            /**
             * <p>The region of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder fcRegion(String fcRegion) {
                this.fcRegion = fcRegion;
                return this;
            }

            /**
             * <p>Indicates whether Chatbot prompts are supported. Valid values:</p>
             * <ul>
             * <li>true: Supported.</li>
             * <li>false: Not supported.</li>
             * </ul>
             */
            public Builder supportBeebotPrompts(Boolean supportBeebotPrompts) {
                this.supportBeebotPrompts = supportBeebotPrompts;
                return this;
            }

            public NluProfile build() {
                return new NluProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScriptResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScriptResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentKey")
        private String agentKey;

        @com.aliyun.core.annotation.NameInMap("AgentLlm")
        private Boolean agentLlm;

        @com.aliyun.core.annotation.NameInMap("AsrConfig")
        private String asrConfig;

        @com.aliyun.core.annotation.NameInMap("ChatConfig")
        private String chatConfig;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("DebugStatus")
        private String debugStatus;

        @com.aliyun.core.annotation.NameInMap("EmotionEnable")
        private Boolean emotionEnable;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @com.aliyun.core.annotation.NameInMap("IsDrafted")
        private Boolean isDrafted;

        @com.aliyun.core.annotation.NameInMap("LabelConfig")
        private String labelConfig;

        @com.aliyun.core.annotation.NameInMap("LongWaitEnable")
        private Boolean longWaitEnable;

        @com.aliyun.core.annotation.NameInMap("MiniPlaybackEnable")
        private Boolean miniPlaybackEnable;

        @com.aliyun.core.annotation.NameInMap("NewBargeInEnable")
        private Boolean newBargeInEnable;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("NluProfile")
        private NluProfile nluProfile;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ScriptDescription")
        private String scriptDescription;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private String ttsConfig;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Script(Builder builder) {
            this.agentId = builder.agentId;
            this.agentKey = builder.agentKey;
            this.agentLlm = builder.agentLlm;
            this.asrConfig = builder.asrConfig;
            this.chatConfig = builder.chatConfig;
            this.chatbotId = builder.chatbotId;
            this.debugStatus = builder.debugStatus;
            this.emotionEnable = builder.emotionEnable;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.labelConfig = builder.labelConfig;
            this.longWaitEnable = builder.longWaitEnable;
            this.miniPlaybackEnable = builder.miniPlaybackEnable;
            this.newBargeInEnable = builder.newBargeInEnable;
            this.nluEngine = builder.nluEngine;
            this.nluProfile = builder.nluProfile;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.status = builder.status;
            this.ttsConfig = builder.ttsConfig;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
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
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
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
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
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
         * @return nluEngine
         */
        public String getNluEngine() {
            return this.nluEngine;
        }

        /**
         * @return nluProfile
         */
        public NluProfile getNluProfile() {
            return this.nluProfile;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttsConfig
         */
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long agentId; 
            private String agentKey; 
            private Boolean agentLlm; 
            private String asrConfig; 
            private String chatConfig; 
            private String chatbotId; 
            private String debugStatus; 
            private Boolean emotionEnable; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private String labelConfig; 
            private Boolean longWaitEnable; 
            private Boolean miniPlaybackEnable; 
            private Boolean newBargeInEnable; 
            private String nluEngine; 
            private NluProfile nluProfile; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String scriptName; 
            private String status; 
            private String ttsConfig; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Script model) {
                this.agentId = model.agentId;
                this.agentKey = model.agentKey;
                this.agentLlm = model.agentLlm;
                this.asrConfig = model.asrConfig;
                this.chatConfig = model.chatConfig;
                this.chatbotId = model.chatbotId;
                this.debugStatus = model.debugStatus;
                this.emotionEnable = model.emotionEnable;
                this.industry = model.industry;
                this.isDebugDrafted = model.isDebugDrafted;
                this.isDrafted = model.isDrafted;
                this.labelConfig = model.labelConfig;
                this.longWaitEnable = model.longWaitEnable;
                this.miniPlaybackEnable = model.miniPlaybackEnable;
                this.newBargeInEnable = model.newBargeInEnable;
                this.nluEngine = model.nluEngine;
                this.nluProfile = model.nluProfile;
                this.scene = model.scene;
                this.scriptDescription = model.scriptDescription;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.status = model.status;
                this.ttsConfig = model.ttsConfig;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The access key of the chatbot workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1218333</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The access key of the chatbot workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>14791f5f226b4878b3d9b676a0291234</p>
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * <p>Indicates whether the chatbot workspace is a large language model (LLM) workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agentLlm(Boolean agentLlm) {
                this.agentLlm = agentLlm;
                return this;
            }

            /**
             * <p>The automatic speech recognition (ASR) configuration.</p>
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
                this.asrConfig = asrConfig;
                return this;
            }

            /**
             * <p>The call configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;silenceConfig&quot;:{&quot;silenceReplyTimeout&quot;:499,&quot;silenceTimeoutMaxCount&quot;:10,&quot;silenceTimeoutMaxCountEnable&quot;:true},&quot;hangupConfig&quot;:{&quot;aiHangupEnable&quot;:false,&quot;delayHangup&quot;:0,&quot;hangupMaxRounds&quot;:20,&quot;hangupMaxRoundsBroadcast&quot;:&quot;Thank you for taking the call. Have a great day. Goodbye!&quot;,&quot;hangupMaxRoundsEnable&quot;:false},&quot;securityInterceptConfig&quot;:{&quot;broadcast&quot;:&quot;I cannot answer this question. Please try asking something else.&quot;},&quot;specialInterceptConfig&quot;:{&quot;specialInterceptEnable&quot;:false,&quot;specialIntercepts&quot;:[{&quot;code&quot;:&quot;voiceAssistant&quot;},{&quot;code&quot;:&quot;extensionNumberTransfer&quot;}]},&quot;transitionConfig&quot;:{&quot;transitionSwitch&quot;:false}}</p>
             */
            public Builder chatConfig(String chatConfig) {
                this.chatConfig = chatConfig;
                return this;
            }

            /**
             * <p>The chatbot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d31794e2a51f47d2901b4094d88311d7</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>The debug status of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>Specifies whether the emotion recognition feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emotionEnable(Boolean emotionEnable) {
                this.emotionEnable = emotionEnable;
                return this;
            }

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>Finance</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>Indicates whether the debug version is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * <p>Indicates whether the script is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * <p>The custom label configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;labels\&quot;:[{\&quot;description\&quot;:\&quot;\&quot;,\&quot;name\&quot;:\&quot;Availability\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;Available\\\&quot;,\\\&quot;Unavailable\\\&quot;]\&quot;}]}</p>
             */
            public Builder labelConfig(String labelConfig) {
                this.labelConfig = labelConfig;
                return this;
            }

            /**
             * <p>Specifies whether the intelligent sentence segmentation feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder longWaitEnable(Boolean longWaitEnable) {
                this.longWaitEnable = longWaitEnable;
                return this;
            }

            /**
             * <p>Specifies whether the mini playback feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
                this.miniPlaybackEnable = miniPlaybackEnable;
                return this;
            }

            /**
             * <p>Specifies whether the graceful barge-in feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder newBargeInEnable(Boolean newBargeInEnable) {
                this.newBargeInEnable = newBargeInEnable;
                return this;
            }

            /**
             * <p>The natural language understanding (NLU) engine. This parameter applies only to large language model (LLM) scenarios. Valid values:</p>
             * <ul>
             * <li>Prompts: text input mode. </li>
             * <li>SSE_FUNCTION: Function Compute service mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prompts</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * <p>The configuration of the Function Compute service mode.</p>
             */
            public Builder nluProfile(NluProfile nluProfile) {
                this.nluProfile = nluProfile;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The description of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection script</p>
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>810b5872-57f0-4b27-80ab-7b3f4d8a6374</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The name of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection script</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The status of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The text-to-speech (TTS) configuration of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;appKey&quot;: &quot;oQDVNlE6fZ5mg46X&quot;,
             *     &quot;engine&quot;: &quot;ali&quot;,
             *     &quot;engineXunfei&quot;: &quot;&quot;,
             *     &quot;globalInterruptible&quot;: true,
             *         &quot;closingStatementInterruptible&quot;: false, &quot;openingPromptInterruptible&quot;: false,
             *     &quot;nlsServiceType&quot;: &quot;Managed&quot;,
             *     &quot;pitchRate&quot;: &quot;0&quot;,
             *     &quot;speechRate&quot;: &quot;0&quot;,
             *     &quot;voice&quot;: &quot;zhiyuan&quot;,
             *     &quot;volume&quot;: &quot;50&quot;
             * }</p>
             */
            public Builder ttsConfig(String ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
}
