// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetScriptResponseBody</p>
 */
public class GetScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetScriptResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Internal error code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Scenario object information</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
         *  does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>List of dynamic error parameters</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51E08AA9-8D1F-55F8-84A3-40635E2F0806</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetScriptResponseBody build() {
            return new GetScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClosingStatement")
        private String closingStatement;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private java.util.List<String> keyWords;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TurnLimit")
        private Integer turnLimit;

        private Triggers(Builder builder) {
            this.closingStatement = builder.closingStatement;
            this.keyWords = builder.keyWords;
            this.triggerType = builder.triggerType;
            this.turnLimit = builder.turnLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return closingStatement
         */
        public String getClosingStatement() {
            return this.closingStatement;
        }

        /**
         * @return keyWords
         */
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return turnLimit
         */
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

        public static final class Builder {
            private String closingStatement; 
            private java.util.List<String> keyWords; 
            private String triggerType; 
            private Integer turnLimit; 

            private Builder() {
            } 

            private Builder(Triggers model) {
                this.closingStatement = model.closingStatement;
                this.keyWords = model.keyWords;
                this.triggerType = model.triggerType;
                this.turnLimit = model.turnLimit;
            } 

            /**
             * <p>The message to play when hanging up after reaching the maximum number of rounds.</p>
             * 
             * <strong>example:</strong>
             * <p>感谢您的接听，祝您生活愉快，再见!</p>
             */
            public Builder closingStatement(String closingStatement) {
                this.closingStatement = closingStatement;
                return this;
            }

            /**
             * <p>List of custom interception keywords</p>
             */
            public Builder keyWords(java.util.List<String> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>TurnLimit: Maximum interaction rounds check. IntelligentVoiceAssistant: Voice assistant. InteractiveVoiceResponse: Extension transfer. KeyWords: Custom interception</p>
             * 
             * <strong>example:</strong>
             * <p>TurnLimit</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>Hangs up when the number of interaction rounds exceeds x. The range is 0 to 100. A value of 0 indicates that the hang-up feature for exceeding the round limit is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder turnLimit(Integer turnLimit) {
                this.turnLimit = turnLimit;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class EndConversationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<Triggers> triggers;

        private EndConversationConfig(Builder builder) {
            this.delay = builder.delay;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndConversationConfig create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return triggers
         */
        public java.util.List<Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer delay; 
            private java.util.List<Triggers> triggers; 

            private Builder() {
            } 

            private Builder(EndConversationConfig model) {
                this.delay = model.delay;
                this.triggers = model.triggers;
            } 

            /**
             * <p>The hang-up action is executed x seconds after the hang-up message is played. The range is 0 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>List of special case interceptions</p>
             */
            public Builder triggers(java.util.List<Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public EndConversationConfig build() {
                return new EndConversationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class SilenceDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRepeats")
        private Integer maxRepeats;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private SilenceDetectionConfig(Builder builder) {
            this.maxRepeats = builder.maxRepeats;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilenceDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return maxRepeats
         */
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer maxRepeats; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(SilenceDetectionConfig model) {
                this.maxRepeats = model.maxRepeats;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Hang up after consecutive rounds of silence. This takes effect when NluEngine is set to PROMPTS for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * <p>Silence timeout period in milliseconds. If the user remains silent for longer than the specified value, a silence timeout message is played. The range is 2000 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public SilenceDetectionConfig build() {
                return new SilenceDetectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class InteractionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundMusicId")
        private String backgroundMusicId;

        @com.aliyun.core.annotation.NameInMap("EndConversationConfig")
        private EndConversationConfig endConversationConfig;

        @com.aliyun.core.annotation.NameInMap("InitialGreetingDelayMilliseconds")
        private Integer initialGreetingDelayMilliseconds;

        @com.aliyun.core.annotation.NameInMap("SilenceDetectionConfig")
        private SilenceDetectionConfig silenceDetectionConfig;

        private InteractionConfig(Builder builder) {
            this.backgroundMusicId = builder.backgroundMusicId;
            this.endConversationConfig = builder.endConversationConfig;
            this.initialGreetingDelayMilliseconds = builder.initialGreetingDelayMilliseconds;
            this.silenceDetectionConfig = builder.silenceDetectionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InteractionConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundMusicId
         */
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        /**
         * @return endConversationConfig
         */
        public EndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        /**
         * @return initialGreetingDelayMilliseconds
         */
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        /**
         * @return silenceDetectionConfig
         */
        public SilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public static final class Builder {
            private String backgroundMusicId; 
            private EndConversationConfig endConversationConfig; 
            private Integer initialGreetingDelayMilliseconds; 
            private SilenceDetectionConfig silenceDetectionConfig; 

            private Builder() {
            } 

            private Builder(InteractionConfig model) {
                this.backgroundMusicId = model.backgroundMusicId;
                this.endConversationConfig = model.endConversationConfig;
                this.initialGreetingDelayMilliseconds = model.initialGreetingDelayMilliseconds;
                this.silenceDetectionConfig = model.silenceDetectionConfig;
            } 

            /**
             * <p>Background music ID</p>
             * 
             * <strong>example:</strong>
             * <p>office-ambience</p>
             */
            public Builder backgroundMusicId(String backgroundMusicId) {
                this.backgroundMusicId = backgroundMusicId;
                return this;
            }

            /**
             * <p>Hang-up configuration</p>
             */
            public Builder endConversationConfig(EndConversationConfig endConversationConfig) {
                this.endConversationConfig = endConversationConfig;
                return this;
            }

            /**
             * <p>The delay before playing audio after the call is connected, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder initialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
                this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
                return this;
            }

            /**
             * <p>Silence detection configuration</p>
             */
            public Builder silenceDetectionConfig(SilenceDetectionConfig silenceDetectionConfig) {
                this.silenceDetectionConfig = silenceDetectionConfig;
                return this;
            }

            public InteractionConfig build() {
                return new InteractionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class LabelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateValues")
        private java.util.List<String> candidateValues;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LabelConfig(Builder builder) {
            this.candidateValues = builder.candidateValues;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelConfig create() {
            return builder().build();
        }

        /**
         * @return candidateValues
         */
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> candidateValues; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(LabelConfig model) {
                this.candidateValues = model.candidateValues;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>List of candidate values for the label</p>
             */
            public Builder candidateValues(java.util.List<String> candidateValues) {
                this.candidateValues = candidateValues;
                return this;
            }

            /**
             * <p>Label description</p>
             * 
             * <strong>example:</strong>
             * <p>用户是否同意于还款截止日期前还款</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Label name</p>
             * 
             * <strong>example:</strong>
             * <p>是否同意还款</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public LabelConfig build() {
                return new LabelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class AgentProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromptsJson")
        private String promptsJson;

        @com.aliyun.core.annotation.NameInMap("ScriptProfileTemplateId")
        private String scriptProfileTemplateId;

        private AgentProfile(Builder builder) {
            this.promptsJson = builder.promptsJson;
            this.scriptProfileTemplateId = builder.scriptProfileTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentProfile create() {
            return builder().build();
        }

        /**
         * @return promptsJson
         */
        public String getPromptsJson() {
            return this.promptsJson;
        }

        /**
         * @return scriptProfileTemplateId
         */
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

        public static final class Builder {
            private String promptsJson; 
            private String scriptProfileTemplateId; 

            private Builder() {
            } 

            private Builder(AgentProfile model) {
                this.promptsJson = model.promptsJson;
                this.scriptProfileTemplateId = model.scriptProfileTemplateId;
            } 

            /**
             * <p>Prompt JSON</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;prompts\&quot;:\&quot;我是一个聊天机器人。\&quot;}</p>
             */
            public Builder promptsJson(String promptsJson) {
                this.promptsJson = promptsJson;
                return this;
            }

            /**
             * <p>Scenario template ID</p>
             * 
             * <strong>example:</strong>
             * <p>CCC_PROMPTS_DEFAULT</p>
             */
            public Builder scriptProfileTemplateId(String scriptProfileTemplateId) {
                this.scriptProfileTemplateId = scriptProfileTemplateId;
                return this;
            }

            public AgentProfile build() {
                return new AgentProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class FunctionMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionId")
        private String functionId;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("HttpTriggerName")
        private String httpTriggerName;

        @com.aliyun.core.annotation.NameInMap("HttpTriggerUrl")
        private String httpTriggerUrl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private FunctionMeta(Builder builder) {
            this.functionId = builder.functionId;
            this.functionName = builder.functionName;
            this.httpTriggerName = builder.httpTriggerName;
            this.httpTriggerUrl = builder.httpTriggerUrl;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionMeta create() {
            return builder().build();
        }

        /**
         * @return functionId
         */
        public String getFunctionId() {
            return this.functionId;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return httpTriggerName
         */
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        /**
         * @return httpTriggerUrl
         */
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String functionId; 
            private String functionName; 
            private String httpTriggerName; 
            private String httpTriggerUrl; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(FunctionMeta model) {
                this.functionId = model.functionId;
                this.functionName = model.functionName;
                this.httpTriggerName = model.httpTriggerName;
                this.httpTriggerUrl = model.httpTriggerUrl;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Function service ID</p>
             * 
             * <strong>example:</strong>
             * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * <p>Function service name</p>
             * 
             * <strong>example:</strong>
             * <p>my_funciton</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>Function trigger name</p>
             * 
             * <strong>example:</strong>
             * <p>defaultTrigger</p>
             */
            public Builder httpTriggerName(String httpTriggerName) {
                this.httpTriggerName = httpTriggerName;
                return this;
            }

            /**
             * <p>Function trigger URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
             */
            public Builder httpTriggerUrl(String httpTriggerUrl) {
                this.httpTriggerUrl = httpTriggerUrl;
                return this;
            }

            /**
             * <p>Region where the function service is located</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public FunctionMeta build() {
                return new FunctionMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class NluAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private NluAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NluAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(NluAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party dialogue model configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public NluAccessProfile build() {
                return new NluAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class ScriptProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentKey")
        private String agentKey;

        @com.aliyun.core.annotation.NameInMap("AgentProfile")
        private AgentProfile agentProfile;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("FunctionMeta")
        private FunctionMeta functionMeta;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NluAccessProfile")
        private NluAccessProfile nluAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NluAccessType")
        private String nluAccessType;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("OmniModel")
        private Boolean omniModel;

        private ScriptProfile(Builder builder) {
            this.agentKey = builder.agentKey;
            this.agentProfile = builder.agentProfile;
            this.chatbotId = builder.chatbotId;
            this.functionMeta = builder.functionMeta;
            this.model = builder.model;
            this.nluAccessProfile = builder.nluAccessProfile;
            this.nluAccessType = builder.nluAccessType;
            this.nluEngine = builder.nluEngine;
            this.omniModel = builder.omniModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptProfile create() {
            return builder().build();
        }

        /**
         * @return agentKey
         */
        public String getAgentKey() {
            return this.agentKey;
        }

        /**
         * @return agentProfile
         */
        public AgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return functionMeta
         */
        public FunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nluAccessProfile
         */
        public NluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
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
         * @return omniModel
         */
        public Boolean getOmniModel() {
            return this.omniModel;
        }

        public static final class Builder {
            private String agentKey; 
            private AgentProfile agentProfile; 
            private String chatbotId; 
            private FunctionMeta functionMeta; 
            private String model; 
            private NluAccessProfile nluAccessProfile; 
            private String nluAccessType; 
            private String nluEngine; 
            private Boolean omniModel; 

            private Builder() {
            } 

            private Builder(ScriptProfile model) {
                this.agentKey = model.agentKey;
                this.agentProfile = model.agentProfile;
                this.chatbotId = model.chatbotId;
                this.functionMeta = model.functionMeta;
                this.model = model.model;
                this.nluAccessProfile = model.nluAccessProfile;
                this.nluAccessType = model.nluAccessType;
                this.nluEngine = model.nluEngine;
                this.omniModel = model.omniModel;
            } 

            /**
             * <p>Chatbot AgentKey</p>
             * 
             * <strong>example:</strong>
             * <p>1309723684579735_p_beebot_public</p>
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * <p>Dialogue agent configuration</p>
             */
            public Builder agentProfile(AgentProfile agentProfile) {
                this.agentProfile = agentProfile;
                return this;
            }

            /**
             * <p>Chatbot ID</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-MQuyjjb666</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>Function Compute configuration</p>
             */
            public Builder functionMeta(FunctionMeta functionMeta) {
                this.functionMeta = functionMeta;
                return this;
            }

            /**
             * <p>Dialogue model</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Associated configuration</p>
             */
            public Builder nluAccessProfile(NluAccessProfile nluAccessProfile) {
                this.nluAccessProfile = nluAccessProfile;
                return this;
            }

            /**
             * <p>Dialogue model call method</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * <p>NLU engine</p>
             * 
             * <strong>example:</strong>
             * <p>BEEBOT</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * <p>Indicates whether the model is an Omni model.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder omniModel(Boolean omniModel) {
                this.omniModel = omniModel;
                return this;
            }

            public ScriptProfile build() {
                return new ScriptProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class NlsAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private NlsAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NlsAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(NlsAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party voice configuration</p>
             * 
             * <strong>example:</strong>
             * <p>0c4f978a-73bb-4841-bd84-75c0398edd4f</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public NlsAccessProfile build() {
                return new NlsAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PronRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        private PronRules(Builder builder) {
            this.pattern = builder.pattern;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PronRules create() {
            return builder().build();
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String pattern; 
            private String replacement; 

            private Builder() {
            } 

            private Builder(PronRules model) {
                this.pattern = model.pattern;
                this.replacement = model.replacement;
            } 

            /**
             * <p>Word prone to errors</p>
             * 
             * <strong>example:</strong>
             * <p>还钱</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>Replacement word</p>
             * 
             * <strong>example:</strong>
             * <p>环钱</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public PronRules build() {
                return new PronRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class SynthesizerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NlsAccessProfile")
        private NlsAccessProfile nlsAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("PitchRate")
        private Integer pitchRate;

        @com.aliyun.core.annotation.NameInMap("PronRules")
        private java.util.List<PronRules> pronRules;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private SynthesizerConfig(Builder builder) {
            this.model = builder.model;
            this.nlsAccessProfile = builder.nlsAccessProfile;
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
            this.pitchRate = builder.pitchRate;
            this.pronRules = builder.pronRules;
            this.speechRate = builder.speechRate;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynthesizerConfig create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nlsAccessProfile
         */
        public NlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        /**
         * @return nlsAccessType
         */
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return pitchRate
         */
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return pronRules
         */
        public java.util.List<PronRules> getPronRules() {
            return this.pronRules;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String model; 
            private NlsAccessProfile nlsAccessProfile; 
            private String nlsAccessType; 
            private String nlsEngine; 
            private Integer pitchRate; 
            private java.util.List<PronRules> pronRules; 
            private Integer speechRate; 
            private String voice; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(SynthesizerConfig model) {
                this.model = model.model;
                this.nlsAccessProfile = model.nlsAccessProfile;
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
                this.pitchRate = model.pitchRate;
                this.pronRules = model.pronRules;
                this.speechRate = model.speechRate;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * <p>TTS model</p>
             * 
             * <strong>example:</strong>
             * <p>CosyVoice</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Access account configuration</p>
             */
            public Builder nlsAccessProfile(NlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * <p>TTS call method</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * <p>TTS engine</p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>The speech pitch.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pitchRate(Integer pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * <p>List of TTS intervention dictionaries</p>
             */
            public Builder pronRules(java.util.List<PronRules> pronRules) {
                this.pronRules = pronRules;
                return this;
            }

            /**
             * <p>Speech rate</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>Voice</p>
             * 
             * <strong>example:</strong>
             * <p>longanyang</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>Volume</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public SynthesizerConfig build() {
                return new SynthesizerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class CorrectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        private CorrectionRules(Builder builder) {
            this.pattern = builder.pattern;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorrectionRules create() {
            return builder().build();
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String pattern; 
            private String replacement; 

            private Builder() {
            } 

            private Builder(CorrectionRules model) {
                this.pattern = model.pattern;
                this.replacement = model.replacement;
            } 

            /**
             * <p>Word prone to errors</p>
             * 
             * <strong>example:</strong>
             * <p>还钱</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>Replacement word</p>
             * 
             * <strong>example:</strong>
             * <p>环钱</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public CorrectionRules build() {
                return new CorrectionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class TranscriberConfigNlsAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private TranscriberConfigNlsAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscriberConfigNlsAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(TranscriberConfigNlsAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party voice configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>0c4f978a-73bb-4841-bd84-75c0398edd4f</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public TranscriberConfigNlsAccessProfile build() {
                return new TranscriberConfigNlsAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class TranscriberConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorrectionRules")
        private java.util.List<CorrectionRules> correctionRules;

        @com.aliyun.core.annotation.NameInMap("CustomizationId")
        private String customizationId;

        @com.aliyun.core.annotation.NameInMap("EndSilenceTimeout")
        private Integer endSilenceTimeout;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NlsAccessProfile")
        private TranscriberConfigNlsAccessProfile nlsAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("SpeechNoiseThreshold")
        private String speechNoiseThreshold;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        private TranscriberConfig(Builder builder) {
            this.correctionRules = builder.correctionRules;
            this.customizationId = builder.customizationId;
            this.endSilenceTimeout = builder.endSilenceTimeout;
            this.model = builder.model;
            this.nlsAccessProfile = builder.nlsAccessProfile;
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
            this.speechNoiseThreshold = builder.speechNoiseThreshold;
            this.vocabularyId = builder.vocabularyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscriberConfig create() {
            return builder().build();
        }

        /**
         * @return correctionRules
         */
        public java.util.List<CorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        /**
         * @return customizationId
         */
        public String getCustomizationId() {
            return this.customizationId;
        }

        /**
         * @return endSilenceTimeout
         */
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nlsAccessProfile
         */
        public TranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        /**
         * @return nlsAccessType
         */
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return speechNoiseThreshold
         */
        public String getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public static final class Builder {
            private java.util.List<CorrectionRules> correctionRules; 
            private String customizationId; 
            private Integer endSilenceTimeout; 
            private String model; 
            private TranscriberConfigNlsAccessProfile nlsAccessProfile; 
            private String nlsAccessType; 
            private String nlsEngine; 
            private String speechNoiseThreshold; 
            private String vocabularyId; 

            private Builder() {
            } 

            private Builder(TranscriberConfig model) {
                this.correctionRules = model.correctionRules;
                this.customizationId = model.customizationId;
                this.endSilenceTimeout = model.endSilenceTimeout;
                this.model = model.model;
                this.nlsAccessProfile = model.nlsAccessProfile;
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
                this.speechNoiseThreshold = model.speechNoiseThreshold;
                this.vocabularyId = model.vocabularyId;
            } 

            /**
             * CorrectionRules.
             */
            public Builder correctionRules(java.util.List<CorrectionRules> correctionRules) {
                this.correctionRules = correctionRules;
                return this;
            }

            /**
             * <p>Self-learning language model ID (not currently supported)</p>
             * 
             * <strong>example:</strong>
             * <p>0c4f978a-73bb-4841-bd84-75c0398edd6f</p>
             */
            public Builder customizationId(String customizationId) {
                this.customizationId = customizationId;
                return this;
            }

            /**
             * <p>Voice Activity Detection (VAD) sentence segmentation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder endSilenceTimeout(Integer endSilenceTimeout) {
                this.endSilenceTimeout = endSilenceTimeout;
                return this;
            }

            /**
             * <p>ASR model</p>
             * 
             * <strong>example:</strong>
             * <p>Paraformer</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Access account configuration</p>
             */
            public Builder nlsAccessProfile(TranscriberConfigNlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * <p>ASR call method</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * <p>ASR engine</p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>Noise threshold</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder speechNoiseThreshold(String speechNoiseThreshold) {
                this.speechNoiseThreshold = speechNoiseThreshold;
                return this;
            }

            /**
             * <p>Hotword ID</p>
             * 
             * <strong>example:</strong>
             * <p>0c4f978a-73bb-4841-bd84-75c0398edd5f</p>
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            public TranscriberConfig build() {
                return new TranscriberConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class DraftVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InteractionConfig")
        private InteractionConfig interactionConfig;

        @com.aliyun.core.annotation.NameInMap("LabelConfig")
        private java.util.List<LabelConfig> labelConfig;

        @com.aliyun.core.annotation.NameInMap("ScriptProfile")
        private ScriptProfile scriptProfile;

        @com.aliyun.core.annotation.NameInMap("SynthesizerConfig")
        private SynthesizerConfig synthesizerConfig;

        @com.aliyun.core.annotation.NameInMap("TranscriberConfig")
        private TranscriberConfig transcriberConfig;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private DraftVersion(Builder builder) {
            this.interactionConfig = builder.interactionConfig;
            this.labelConfig = builder.labelConfig;
            this.scriptProfile = builder.scriptProfile;
            this.synthesizerConfig = builder.synthesizerConfig;
            this.transcriberConfig = builder.transcriberConfig;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DraftVersion create() {
            return builder().build();
        }

        /**
         * @return interactionConfig
         */
        public InteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        /**
         * @return labelConfig
         */
        public java.util.List<LabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        /**
         * @return scriptProfile
         */
        public ScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        /**
         * @return synthesizerConfig
         */
        public SynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        /**
         * @return transcriberConfig
         */
        public TranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private InteractionConfig interactionConfig; 
            private java.util.List<LabelConfig> labelConfig; 
            private ScriptProfile scriptProfile; 
            private SynthesizerConfig synthesizerConfig; 
            private TranscriberConfig transcriberConfig; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(DraftVersion model) {
                this.interactionConfig = model.interactionConfig;
                this.labelConfig = model.labelConfig;
                this.scriptProfile = model.scriptProfile;
                this.synthesizerConfig = model.synthesizerConfig;
                this.transcriberConfig = model.transcriberConfig;
                this.versionId = model.versionId;
            } 

            /**
             * <p>Interaction configuration</p>
             */
            public Builder interactionConfig(InteractionConfig interactionConfig) {
                this.interactionConfig = interactionConfig;
                return this;
            }

            /**
             * <p>List of label objects</p>
             */
            public Builder labelConfig(java.util.List<LabelConfig> labelConfig) {
                this.labelConfig = labelConfig;
                return this;
            }

            /**
             * <p>Dialogue capability configuration</p>
             */
            public Builder scriptProfile(ScriptProfile scriptProfile) {
                this.scriptProfile = scriptProfile;
                return this;
            }

            /**
             * <p>TTS configuration</p>
             */
            public Builder synthesizerConfig(SynthesizerConfig synthesizerConfig) {
                this.synthesizerConfig = synthesizerConfig;
                return this;
            }

            /**
             * <p>ASR configuration</p>
             */
            public Builder transcriberConfig(TranscriberConfig transcriberConfig) {
                this.transcriberConfig = transcriberConfig;
                return this;
            }

            /**
             * <p>Version ID</p>
             * 
             * <strong>example:</strong>
             * <p>0c4f978a-73bb-4841-bd84-75c0398edd4e</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public DraftVersion build() {
                return new DraftVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class EndConversationConfigTriggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClosingStatement")
        private String closingStatement;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private java.util.List<String> keyWords;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TurnLimit")
        private Integer turnLimit;

        private EndConversationConfigTriggers(Builder builder) {
            this.closingStatement = builder.closingStatement;
            this.keyWords = builder.keyWords;
            this.triggerType = builder.triggerType;
            this.turnLimit = builder.turnLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndConversationConfigTriggers create() {
            return builder().build();
        }

        /**
         * @return closingStatement
         */
        public String getClosingStatement() {
            return this.closingStatement;
        }

        /**
         * @return keyWords
         */
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return turnLimit
         */
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

        public static final class Builder {
            private String closingStatement; 
            private java.util.List<String> keyWords; 
            private String triggerType; 
            private Integer turnLimit; 

            private Builder() {
            } 

            private Builder(EndConversationConfigTriggers model) {
                this.closingStatement = model.closingStatement;
                this.keyWords = model.keyWords;
                this.triggerType = model.triggerType;
                this.turnLimit = model.turnLimit;
            } 

            /**
             * <ul>
             * <li>The message to play when hanging up after reaching the maximum number of rounds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>感谢您的接听，祝您生活愉快，再见!</p>
             */
            public Builder closingStatement(String closingStatement) {
                this.closingStatement = closingStatement;
                return this;
            }

            /**
             * <ul>
             * <li>List of custom interception keywords</li>
             * </ul>
             */
            public Builder keyWords(java.util.List<String> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <ul>
             * <li><p><strong>TurnLimit</strong>: Maximum interaction rounds check.</p>
             * </li>
             * <li><p><strong>IntelligentVoiceAssistant</strong>: Voice assistant.</p>
             * </li>
             * <li><p><strong>InteractiveVoiceResponse</strong>: Extension transfer.</p>
             * </li>
             * <li><p><strong>KeyWords</strong>: Custom interception.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TurnLimit</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <ul>
             * <li><p>Hangs up when the number of interaction rounds exceeds x.</p>
             * </li>
             * <li><p>The range is 0 to 100.</p>
             * </li>
             * <li><p>A value of 0 indicates that the hang-up feature for exceeding the round limit is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder turnLimit(Integer turnLimit) {
                this.turnLimit = turnLimit;
                return this;
            }

            public EndConversationConfigTriggers build() {
                return new EndConversationConfigTriggers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class InteractionConfigEndConversationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<EndConversationConfigTriggers> triggers;

        private InteractionConfigEndConversationConfig(Builder builder) {
            this.delay = builder.delay;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InteractionConfigEndConversationConfig create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return triggers
         */
        public java.util.List<EndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer delay; 
            private java.util.List<EndConversationConfigTriggers> triggers; 

            private Builder() {
            } 

            private Builder(InteractionConfigEndConversationConfig model) {
                this.delay = model.delay;
                this.triggers = model.triggers;
            } 

            /**
             * <p>The hang-up action is executed x seconds after the hang-up message is played. The range is 0 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>Special case interception</p>
             */
            public Builder triggers(java.util.List<EndConversationConfigTriggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public InteractionConfigEndConversationConfig build() {
                return new InteractionConfigEndConversationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class InteractionConfigSilenceDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRepeats")
        private Integer maxRepeats;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private InteractionConfigSilenceDetectionConfig(Builder builder) {
            this.maxRepeats = builder.maxRepeats;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InteractionConfigSilenceDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return maxRepeats
         */
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer maxRepeats; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(InteractionConfigSilenceDetectionConfig model) {
                this.maxRepeats = model.maxRepeats;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Hang up after consecutive rounds of silence.<br>
             * This takes effect when NluEngine is set to PROMPTS for the current scenario.<br></p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * <p>Silence timeout period in milliseconds.<br>
             * If the user remains silent for longer than the specified value, a silence timeout message is played.<br>
             * The range is 2000 to 10000.<br><br></p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public InteractionConfigSilenceDetectionConfig build() {
                return new InteractionConfigSilenceDetectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionInteractionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundMusicId")
        private String backgroundMusicId;

        @com.aliyun.core.annotation.NameInMap("EndConversationConfig")
        private InteractionConfigEndConversationConfig endConversationConfig;

        @com.aliyun.core.annotation.NameInMap("InitialGreetingDelayMilliseconds")
        private Integer initialGreetingDelayMilliseconds;

        @com.aliyun.core.annotation.NameInMap("SilenceDetectionConfig")
        private InteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        private PublishedVersionInteractionConfig(Builder builder) {
            this.backgroundMusicId = builder.backgroundMusicId;
            this.endConversationConfig = builder.endConversationConfig;
            this.initialGreetingDelayMilliseconds = builder.initialGreetingDelayMilliseconds;
            this.silenceDetectionConfig = builder.silenceDetectionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionInteractionConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundMusicId
         */
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        /**
         * @return endConversationConfig
         */
        public InteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        /**
         * @return initialGreetingDelayMilliseconds
         */
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        /**
         * @return silenceDetectionConfig
         */
        public InteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public static final class Builder {
            private String backgroundMusicId; 
            private InteractionConfigEndConversationConfig endConversationConfig; 
            private Integer initialGreetingDelayMilliseconds; 
            private InteractionConfigSilenceDetectionConfig silenceDetectionConfig; 

            private Builder() {
            } 

            private Builder(PublishedVersionInteractionConfig model) {
                this.backgroundMusicId = model.backgroundMusicId;
                this.endConversationConfig = model.endConversationConfig;
                this.initialGreetingDelayMilliseconds = model.initialGreetingDelayMilliseconds;
                this.silenceDetectionConfig = model.silenceDetectionConfig;
            } 

            /**
             * <p>Background music ID</p>
             * 
             * <strong>example:</strong>
             * <p>office-ambience</p>
             */
            public Builder backgroundMusicId(String backgroundMusicId) {
                this.backgroundMusicId = backgroundMusicId;
                return this;
            }

            /**
             * <p>Hang-up configuration</p>
             */
            public Builder endConversationConfig(InteractionConfigEndConversationConfig endConversationConfig) {
                this.endConversationConfig = endConversationConfig;
                return this;
            }

            /**
             * <ul>
             * <li><p>The delay before playing audio after the call is connected.</p>
             * </li>
             * <li><p>Unit: milliseconds.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder initialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
                this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
                return this;
            }

            /**
             * <p>Silence detection configuration</p>
             */
            public Builder silenceDetectionConfig(InteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
                this.silenceDetectionConfig = silenceDetectionConfig;
                return this;
            }

            public PublishedVersionInteractionConfig build() {
                return new PublishedVersionInteractionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionLabelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateValues")
        private java.util.List<String> candidateValues;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PublishedVersionLabelConfig(Builder builder) {
            this.candidateValues = builder.candidateValues;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionLabelConfig create() {
            return builder().build();
        }

        /**
         * @return candidateValues
         */
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> candidateValues; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(PublishedVersionLabelConfig model) {
                this.candidateValues = model.candidateValues;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>List of candidate values for the label</p>
             */
            public Builder candidateValues(java.util.List<String> candidateValues) {
                this.candidateValues = candidateValues;
                return this;
            }

            /**
             * <p>Label description</p>
             * 
             * <strong>example:</strong>
             * <p>用户是否同意于还款截止日期前还款</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Label name</p>
             * 
             * <strong>example:</strong>
             * <p>是否同意还款</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PublishedVersionLabelConfig build() {
                return new PublishedVersionLabelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class ScriptProfileAgentProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PromptsJson")
        private String promptsJson;

        @com.aliyun.core.annotation.NameInMap("ScriptProfileTemplateId")
        private String scriptProfileTemplateId;

        private ScriptProfileAgentProfile(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.promptsJson = builder.promptsJson;
            this.scriptProfileTemplateId = builder.scriptProfileTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptProfileAgentProfile create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return promptsJson
         */
        public String getPromptsJson() {
            return this.promptsJson;
        }

        /**
         * @return scriptProfileTemplateId
         */
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String promptsJson; 
            private String scriptProfileTemplateId; 

            private Builder() {
            } 

            private Builder(ScriptProfileAgentProfile model) {
                this.description = model.description;
                this.name = model.name;
                this.promptsJson = model.promptsJson;
                this.scriptProfileTemplateId = model.scriptProfileTemplateId;
            } 

            /**
             * <p>Dialogue agent description</p>
             * 
             * <strong>example:</strong>
             * <p>用于测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Dialogue agent name</p>
             * 
             * <strong>example:</strong>
             * <p>test agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p><strong>Prompt JSON</strong></p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;prompts\&quot;:\&quot;我是一个聊天机器人。\&quot;}</p>
             */
            public Builder promptsJson(String promptsJson) {
                this.promptsJson = promptsJson;
                return this;
            }

            /**
             * <p><strong>Scenario template ID</strong></p>
             * 
             * <strong>example:</strong>
             * <p>CCC_PROMPTS_DEFAULT</p>
             */
            public Builder scriptProfileTemplateId(String scriptProfileTemplateId) {
                this.scriptProfileTemplateId = scriptProfileTemplateId;
                return this;
            }

            public ScriptProfileAgentProfile build() {
                return new ScriptProfileAgentProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class ScriptProfileFunctionMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionId")
        private String functionId;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("HttpTriggerName")
        private String httpTriggerName;

        @com.aliyun.core.annotation.NameInMap("HttpTriggerUrl")
        private String httpTriggerUrl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private ScriptProfileFunctionMeta(Builder builder) {
            this.functionId = builder.functionId;
            this.functionName = builder.functionName;
            this.httpTriggerName = builder.httpTriggerName;
            this.httpTriggerUrl = builder.httpTriggerUrl;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptProfileFunctionMeta create() {
            return builder().build();
        }

        /**
         * @return functionId
         */
        public String getFunctionId() {
            return this.functionId;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return httpTriggerName
         */
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        /**
         * @return httpTriggerUrl
         */
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String functionId; 
            private String functionName; 
            private String httpTriggerName; 
            private String httpTriggerUrl; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(ScriptProfileFunctionMeta model) {
                this.functionId = model.functionId;
                this.functionName = model.functionName;
                this.httpTriggerName = model.httpTriggerName;
                this.httpTriggerUrl = model.httpTriggerUrl;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Function service ID. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * <p>Function service name. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>my_function</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>Function trigger name. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>defaultTrigger</p>
             */
            public Builder httpTriggerName(String httpTriggerName) {
                this.httpTriggerName = httpTriggerName;
                return this;
            }

            /**
             * <p>Function trigger URL. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
             */
            public Builder httpTriggerUrl(String httpTriggerUrl) {
                this.httpTriggerUrl = httpTriggerUrl;
                return this;
            }

            /**
             * <p>Region where the function service is located. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ScriptProfileFunctionMeta build() {
                return new ScriptProfileFunctionMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class ScriptProfileNluAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private ScriptProfileNluAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptProfileNluAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(ScriptProfileNluAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party dialogue model configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public ScriptProfileNluAccessProfile build() {
                return new ScriptProfileNluAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionScriptProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentKey")
        private String agentKey;

        @com.aliyun.core.annotation.NameInMap("AgentProfile")
        private ScriptProfileAgentProfile agentProfile;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("FunctionMeta")
        private ScriptProfileFunctionMeta functionMeta;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NluAccessProfile")
        private ScriptProfileNluAccessProfile nluAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NluAccessType")
        private String nluAccessType;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("OmniModel")
        private Boolean omniModel;

        private PublishedVersionScriptProfile(Builder builder) {
            this.agentKey = builder.agentKey;
            this.agentProfile = builder.agentProfile;
            this.chatbotId = builder.chatbotId;
            this.functionMeta = builder.functionMeta;
            this.model = builder.model;
            this.nluAccessProfile = builder.nluAccessProfile;
            this.nluAccessType = builder.nluAccessType;
            this.nluEngine = builder.nluEngine;
            this.omniModel = builder.omniModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionScriptProfile create() {
            return builder().build();
        }

        /**
         * @return agentKey
         */
        public String getAgentKey() {
            return this.agentKey;
        }

        /**
         * @return agentProfile
         */
        public ScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return functionMeta
         */
        public ScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nluAccessProfile
         */
        public ScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
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
         * @return omniModel
         */
        public Boolean getOmniModel() {
            return this.omniModel;
        }

        public static final class Builder {
            private String agentKey; 
            private ScriptProfileAgentProfile agentProfile; 
            private String chatbotId; 
            private ScriptProfileFunctionMeta functionMeta; 
            private String model; 
            private ScriptProfileNluAccessProfile nluAccessProfile; 
            private String nluAccessType; 
            private String nluEngine; 
            private Boolean omniModel; 

            private Builder() {
            } 

            private Builder(PublishedVersionScriptProfile model) {
                this.agentKey = model.agentKey;
                this.agentProfile = model.agentProfile;
                this.chatbotId = model.chatbotId;
                this.functionMeta = model.functionMeta;
                this.model = model.model;
                this.nluAccessProfile = model.nluAccessProfile;
                this.nluAccessType = model.nluAccessType;
                this.nluEngine = model.nluEngine;
                this.omniModel = model.omniModel;
            } 

            /**
             * <p>Chatbot AgentKey. This is required when NluEngine is set to BEEBOT for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1309723684579735_p_beebot_public</p>
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * <p>Dialogue agent configuration</p>
             */
            public Builder agentProfile(ScriptProfileAgentProfile agentProfile) {
                this.agentProfile = agentProfile;
                return this;
            }

            /**
             * <p>Chatbot ID. This is required when NluEngine is set to BEEBOT for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-MQuyjjb666</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>Function Compute configuration</p>
             */
            public Builder functionMeta(ScriptProfileFunctionMeta functionMeta) {
                this.functionMeta = functionMeta;
                return this;
            }

            /**
             * <p>Dialogue model. This is required when NluEngine is set to PROMPTS for the current scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p><strong>Associated configuration</strong></p>
             */
            public Builder nluAccessProfile(ScriptProfileNluAccessProfile nluAccessProfile) {
                this.nluAccessProfile = nluAccessProfile;
                return this;
            }

            /**
             * <p>Dialogue model call method</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * <p>NLU engine</p>
             * 
             * <strong>example:</strong>
             * <p>BEEBOT</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * <p>Indicates whether the model is an Omni model.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder omniModel(Boolean omniModel) {
                this.omniModel = omniModel;
                return this;
            }

            public PublishedVersionScriptProfile build() {
                return new PublishedVersionScriptProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class SynthesizerConfigNlsAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private SynthesizerConfigNlsAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynthesizerConfigNlsAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(SynthesizerConfigNlsAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party voice configuration ID (required when using third-party ASR services such as Doubao or iFLYTEK).</p>
             * 
             * <strong>example:</strong>
             * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public SynthesizerConfigNlsAccessProfile build() {
                return new SynthesizerConfigNlsAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class SynthesizerConfigPronRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        private SynthesizerConfigPronRules(Builder builder) {
            this.pattern = builder.pattern;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynthesizerConfigPronRules create() {
            return builder().build();
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String pattern; 
            private String replacement; 

            private Builder() {
            } 

            private Builder(SynthesizerConfigPronRules model) {
                this.pattern = model.pattern;
                this.replacement = model.replacement;
            } 

            /**
             * <p>Word prone to errors</p>
             * 
             * <strong>example:</strong>
             * <p>还钱</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>Homophone</p>
             * 
             * <strong>example:</strong>
             * <p>环钱</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public SynthesizerConfigPronRules build() {
                return new SynthesizerConfigPronRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionSynthesizerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NlsAccessProfile")
        private SynthesizerConfigNlsAccessProfile nlsAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("PitchRate")
        private Integer pitchRate;

        @com.aliyun.core.annotation.NameInMap("PronRules")
        private java.util.List<SynthesizerConfigPronRules> pronRules;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private PublishedVersionSynthesizerConfig(Builder builder) {
            this.model = builder.model;
            this.nlsAccessProfile = builder.nlsAccessProfile;
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
            this.pitchRate = builder.pitchRate;
            this.pronRules = builder.pronRules;
            this.speechRate = builder.speechRate;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionSynthesizerConfig create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nlsAccessProfile
         */
        public SynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        /**
         * @return nlsAccessType
         */
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return pitchRate
         */
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return pronRules
         */
        public java.util.List<SynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String model; 
            private SynthesizerConfigNlsAccessProfile nlsAccessProfile; 
            private String nlsAccessType; 
            private String nlsEngine; 
            private Integer pitchRate; 
            private java.util.List<SynthesizerConfigPronRules> pronRules; 
            private Integer speechRate; 
            private String voice; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(PublishedVersionSynthesizerConfig model) {
                this.model = model.model;
                this.nlsAccessProfile = model.nlsAccessProfile;
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
                this.pitchRate = model.pitchRate;
                this.pronRules = model.pronRules;
                this.speechRate = model.speechRate;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * <p><strong>TTS model</strong></p>
             * 
             * <strong>example:</strong>
             * <p>CosyVoice</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Associated configuration</p>
             */
            public Builder nlsAccessProfile(SynthesizerConfigNlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * <p><strong>TTS call method</strong></p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * <p><strong>TTS engine</strong></p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>Pitch rate
             * The range is -500 to 500.
             * The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pitchRate(Integer pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * <p>List of TTS intervention entries</p>
             */
            public Builder pronRules(java.util.List<SynthesizerConfigPronRules> pronRules) {
                this.pronRules = pronRules;
                return this;
            }

            /**
             * <p><strong>Speech rate</strong>
             * The range is -500 to 500.
             * The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p><strong>Voice</strong></p>
             * 
             * <strong>example:</strong>
             * <p>longanyang</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>Volume
             * The range is 0 to 100.
             * The default value is 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public PublishedVersionSynthesizerConfig build() {
                return new PublishedVersionSynthesizerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class TranscriberConfigCorrectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        private TranscriberConfigCorrectionRules(Builder builder) {
            this.pattern = builder.pattern;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscriberConfigCorrectionRules create() {
            return builder().build();
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String pattern; 
            private String replacement; 

            private Builder() {
            } 

            private Builder(TranscriberConfigCorrectionRules model) {
                this.pattern = model.pattern;
                this.replacement = model.replacement;
            } 

            /**
             * <p>Word prone to errors</p>
             * 
             * <strong>example:</strong>
             * <p>还钱</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>Homophone</p>
             * 
             * <strong>example:</strong>
             * <p>环钱</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public TranscriberConfigCorrectionRules build() {
                return new TranscriberConfigCorrectionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionTranscriberConfigNlsAccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        private PublishedVersionTranscriberConfigNlsAccessProfile(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionTranscriberConfigNlsAccessProfile create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public static final class Builder {
            private String accessProfileId; 

            private Builder() {
            } 

            private Builder(PublishedVersionTranscriberConfigNlsAccessProfile model) {
                this.accessProfileId = model.accessProfileId;
            } 

            /**
             * <p>Third-party voice configuration ID (required when using third-party ASR services such as Doubao or iFLYTEK).</p>
             * 
             * <strong>example:</strong>
             * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            public PublishedVersionTranscriberConfigNlsAccessProfile build() {
                return new PublishedVersionTranscriberConfigNlsAccessProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersionTranscriberConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorrectionRules")
        private java.util.List<TranscriberConfigCorrectionRules> correctionRules;

        @com.aliyun.core.annotation.NameInMap("CustomizationId")
        private String customizationId;

        @com.aliyun.core.annotation.NameInMap("EndSilenceTimeout")
        private Integer endSilenceTimeout;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NlsAccessProfile")
        private PublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile;

        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("SpeechNoiseThreshold")
        private String speechNoiseThreshold;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        private PublishedVersionTranscriberConfig(Builder builder) {
            this.correctionRules = builder.correctionRules;
            this.customizationId = builder.customizationId;
            this.endSilenceTimeout = builder.endSilenceTimeout;
            this.model = builder.model;
            this.nlsAccessProfile = builder.nlsAccessProfile;
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
            this.speechNoiseThreshold = builder.speechNoiseThreshold;
            this.vocabularyId = builder.vocabularyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionTranscriberConfig create() {
            return builder().build();
        }

        /**
         * @return correctionRules
         */
        public java.util.List<TranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        /**
         * @return customizationId
         */
        public String getCustomizationId() {
            return this.customizationId;
        }

        /**
         * @return endSilenceTimeout
         */
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nlsAccessProfile
         */
        public PublishedVersionTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        /**
         * @return nlsAccessType
         */
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return speechNoiseThreshold
         */
        public String getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public static final class Builder {
            private java.util.List<TranscriberConfigCorrectionRules> correctionRules; 
            private String customizationId; 
            private Integer endSilenceTimeout; 
            private String model; 
            private PublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile; 
            private String nlsAccessType; 
            private String nlsEngine; 
            private String speechNoiseThreshold; 
            private String vocabularyId; 

            private Builder() {
            } 

            private Builder(PublishedVersionTranscriberConfig model) {
                this.correctionRules = model.correctionRules;
                this.customizationId = model.customizationId;
                this.endSilenceTimeout = model.endSilenceTimeout;
                this.model = model.model;
                this.nlsAccessProfile = model.nlsAccessProfile;
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
                this.speechNoiseThreshold = model.speechNoiseThreshold;
                this.vocabularyId = model.vocabularyId;
            } 

            /**
             * CorrectionRules.
             */
            public Builder correctionRules(java.util.List<TranscriberConfigCorrectionRules> correctionRules) {
                this.correctionRules = correctionRules;
                return this;
            }

            /**
             * <p>Custom language model ID for ASR</p>
             * 
             * <strong>example:</strong>
             * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe4</p>
             */
            public Builder customizationId(String customizationId) {
                this.customizationId = customizationId;
                return this;
            }

            /**
             * <p>Silence detection (sentence segmentation is triggered when the speaking interval exceeds x milliseconds, which is Voice Activity Detection (VAD)).</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder endSilenceTimeout(Integer endSilenceTimeout) {
                this.endSilenceTimeout = endSilenceTimeout;
                return this;
            }

            /**
             * <p>ASR model</p>
             * 
             * <strong>example:</strong>
             * <p>Paraformer</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p><strong>Associated configuration</strong></p>
             */
            public Builder nlsAccessProfile(PublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * <p><strong>ASR call method</strong></p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * <p><strong>ASR engine</strong></p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>Noise parameter threshold. The range is -100 to 100. The following describes the values:</p>
             * <p>The closer the value is to -100, the more likely noise is identified as speech.</p>
             * <p>The closer the value is to 100, the more likely speech is identified as noise.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder speechNoiseThreshold(String speechNoiseThreshold) {
                this.speechNoiseThreshold = speechNoiseThreshold;
                return this;
            }

            /**
             * <p>Hotword table ID (obtained from the hotword management page).</p>
             * 
             * <strong>example:</strong>
             * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe3</p>
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            public PublishedVersionTranscriberConfig build() {
                return new PublishedVersionTranscriberConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class PublishedVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InteractionConfig")
        private PublishedVersionInteractionConfig interactionConfig;

        @com.aliyun.core.annotation.NameInMap("LabelConfig")
        private java.util.List<PublishedVersionLabelConfig> labelConfig;

        @com.aliyun.core.annotation.NameInMap("ScriptProfile")
        private PublishedVersionScriptProfile scriptProfile;

        @com.aliyun.core.annotation.NameInMap("SynthesizerConfig")
        private PublishedVersionSynthesizerConfig synthesizerConfig;

        @com.aliyun.core.annotation.NameInMap("TranscriberConfig")
        private PublishedVersionTranscriberConfig transcriberConfig;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private PublishedVersion(Builder builder) {
            this.interactionConfig = builder.interactionConfig;
            this.labelConfig = builder.labelConfig;
            this.scriptProfile = builder.scriptProfile;
            this.synthesizerConfig = builder.synthesizerConfig;
            this.transcriberConfig = builder.transcriberConfig;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersion create() {
            return builder().build();
        }

        /**
         * @return interactionConfig
         */
        public PublishedVersionInteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        /**
         * @return labelConfig
         */
        public java.util.List<PublishedVersionLabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        /**
         * @return scriptProfile
         */
        public PublishedVersionScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        /**
         * @return synthesizerConfig
         */
        public PublishedVersionSynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        /**
         * @return transcriberConfig
         */
        public PublishedVersionTranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private PublishedVersionInteractionConfig interactionConfig; 
            private java.util.List<PublishedVersionLabelConfig> labelConfig; 
            private PublishedVersionScriptProfile scriptProfile; 
            private PublishedVersionSynthesizerConfig synthesizerConfig; 
            private PublishedVersionTranscriberConfig transcriberConfig; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(PublishedVersion model) {
                this.interactionConfig = model.interactionConfig;
                this.labelConfig = model.labelConfig;
                this.scriptProfile = model.scriptProfile;
                this.synthesizerConfig = model.synthesizerConfig;
                this.transcriberConfig = model.transcriberConfig;
                this.versionId = model.versionId;
            } 

            /**
             * <p>Interaction configuration</p>
             */
            public Builder interactionConfig(PublishedVersionInteractionConfig interactionConfig) {
                this.interactionConfig = interactionConfig;
                return this;
            }

            /**
             * <p>Custom tag configuration</p>
             */
            public Builder labelConfig(java.util.List<PublishedVersionLabelConfig> labelConfig) {
                this.labelConfig = labelConfig;
                return this;
            }

            /**
             * <p>Dialogue capability configuration</p>
             */
            public Builder scriptProfile(PublishedVersionScriptProfile scriptProfile) {
                this.scriptProfile = scriptProfile;
                return this;
            }

            /**
             * <p>TTS configuration</p>
             */
            public Builder synthesizerConfig(PublishedVersionSynthesizerConfig synthesizerConfig) {
                this.synthesizerConfig = synthesizerConfig;
                return this;
            }

            /**
             * <p>ASR configuration</p>
             */
            public Builder transcriberConfig(PublishedVersionTranscriberConfig transcriberConfig) {
                this.transcriberConfig = transcriberConfig;
                return this;
            }

            /**
             * <p>Version ID</p>
             * 
             * <strong>example:</strong>
             * <p>8b77ff09-6a90-4784-8560-fdc2b860dc68</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public PublishedVersion build() {
                return new PublishedVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DraftVersion")
        private DraftVersion draftVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("PublishedVersion")
        private PublishedVersion publishedVersion;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Data(Builder builder) {
            this.concurrency = builder.concurrency;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.draftVersion = builder.draftVersion;
            this.name = builder.name;
            this.nluEngine = builder.nluEngine;
            this.publishedVersion = builder.publishedVersion;
            this.scriptId = builder.scriptId;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return draftVersion
         */
        public DraftVersion getDraftVersion() {
            return this.draftVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nluEngine
         */
        public String getNluEngine() {
            return this.nluEngine;
        }

        /**
         * @return publishedVersion
         */
        public PublishedVersion getPublishedVersion() {
            return this.publishedVersion;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Integer concurrency; 
            private Long createdTime; 
            private String description; 
            private DraftVersion draftVersion; 
            private String name; 
            private String nluEngine; 
            private PublishedVersion publishedVersion; 
            private String scriptId; 
            private String status; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.concurrency = model.concurrency;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.draftVersion = model.draftVersion;
                this.name = model.name;
                this.nluEngine = model.nluEngine;
                this.publishedVersion = model.publishedVersion;
                this.scriptId = model.scriptId;
                this.status = model.status;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>Concurrency</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1773228988000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test script</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Draft version information</p>
             */
            public Builder draftVersion(DraftVersion draftVersion) {
                this.draftVersion = draftVersion;
                return this;
            }

            /**
             * <p>Scenario name</p>
             * 
             * <strong>example:</strong>
             * <p>测试场景</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Natural Language Understanding (NLU) engine</p>
             * 
             * <strong>example:</strong>
             * <p>BEEBOT</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * <p>Published version information</p>
             */
            public Builder publishedVersion(PublishedVersion publishedVersion) {
                this.publishedVersion = publishedVersion;
                return this;
            }

            /**
             * <p>Scenario ID</p>
             * 
             * <strong>example:</strong>
             * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>1773228988000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
