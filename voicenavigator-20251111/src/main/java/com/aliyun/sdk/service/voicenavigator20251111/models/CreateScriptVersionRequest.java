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
 * {@link CreateScriptVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptVersionRequest</p>
 */
public class CreateScriptVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InteractionConfig")
    private InteractionConfig interactionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelConfig")
    private java.util.List<LabelConfig> labelConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptProfile")
    private ScriptProfile scriptProfile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceVersionId")
    private String sourceVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SynthesizerConfig")
    private SynthesizerConfig synthesizerConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TranscriberConfig")
    private TranscriberConfig transcriberConfig;

    private CreateScriptVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.interactionConfig = builder.interactionConfig;
        this.labelConfig = builder.labelConfig;
        this.scriptId = builder.scriptId;
        this.scriptProfile = builder.scriptProfile;
        this.sourceVersionId = builder.sourceVersionId;
        this.synthesizerConfig = builder.synthesizerConfig;
        this.transcriberConfig = builder.transcriberConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptVersionRequest create() {
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptProfile
     */
    public ScriptProfile getScriptProfile() {
        return this.scriptProfile;
    }

    /**
     * @return sourceVersionId
     */
    public String getSourceVersionId() {
        return this.sourceVersionId;
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

    public static final class Builder extends Request.Builder<CreateScriptVersionRequest, Builder> {
        private String instanceId; 
        private InteractionConfig interactionConfig; 
        private java.util.List<LabelConfig> labelConfig; 
        private String scriptId; 
        private ScriptProfile scriptProfile; 
        private String sourceVersionId; 
        private SynthesizerConfig synthesizerConfig; 
        private TranscriberConfig transcriberConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.interactionConfig = request.interactionConfig;
            this.labelConfig = request.labelConfig;
            this.scriptId = request.scriptId;
            this.scriptProfile = request.scriptProfile;
            this.sourceVersionId = request.sourceVersionId;
            this.synthesizerConfig = request.synthesizerConfig;
            this.transcriberConfig = request.transcriberConfig;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InteractionConfig.
         */
        public Builder interactionConfig(InteractionConfig interactionConfig) {
            String interactionConfigShrink = shrink(interactionConfig, "InteractionConfig", "json");
            this.putBodyParameter("InteractionConfig", interactionConfigShrink);
            this.interactionConfig = interactionConfig;
            return this;
        }

        /**
         * LabelConfig.
         */
        public Builder labelConfig(java.util.List<LabelConfig> labelConfig) {
            String labelConfigShrink = shrink(labelConfig, "LabelConfig", "json");
            this.putBodyParameter("LabelConfig", labelConfigShrink);
            this.labelConfig = labelConfig;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * ScriptProfile.
         */
        public Builder scriptProfile(ScriptProfile scriptProfile) {
            String scriptProfileShrink = shrink(scriptProfile, "ScriptProfile", "json");
            this.putBodyParameter("ScriptProfile", scriptProfileShrink);
            this.scriptProfile = scriptProfile;
            return this;
        }

        /**
         * SourceVersionId.
         */
        public Builder sourceVersionId(String sourceVersionId) {
            this.putBodyParameter("SourceVersionId", sourceVersionId);
            this.sourceVersionId = sourceVersionId;
            return this;
        }

        /**
         * SynthesizerConfig.
         */
        public Builder synthesizerConfig(SynthesizerConfig synthesizerConfig) {
            String synthesizerConfigShrink = shrink(synthesizerConfig, "SynthesizerConfig", "json");
            this.putBodyParameter("SynthesizerConfig", synthesizerConfigShrink);
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }

        /**
         * TranscriberConfig.
         */
        public Builder transcriberConfig(TranscriberConfig transcriberConfig) {
            String transcriberConfigShrink = shrink(transcriberConfig, "TranscriberConfig", "json");
            this.putBodyParameter("TranscriberConfig", transcriberConfigShrink);
            this.transcriberConfig = transcriberConfig;
            return this;
        }

        @Override
        public CreateScriptVersionRequest build() {
            return new CreateScriptVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * ClosingStatement.
             */
            public Builder closingStatement(String closingStatement) {
                this.closingStatement = closingStatement;
                return this;
            }

            /**
             * KeyWords.
             */
            public Builder keyWords(java.util.List<String> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * TurnLimit.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * Delay.
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Triggers.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * MaxRepeats.
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * Timeout.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * BackgroundMusicId.
             */
            public Builder backgroundMusicId(String backgroundMusicId) {
                this.backgroundMusicId = backgroundMusicId;
                return this;
            }

            /**
             * EndConversationConfig.
             */
            public Builder endConversationConfig(EndConversationConfig endConversationConfig) {
                this.endConversationConfig = endConversationConfig;
                return this;
            }

            /**
             * InitialGreetingDelayMilliseconds.
             */
            public Builder initialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
                this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
                return this;
            }

            /**
             * SilenceDetectionConfig.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * CandidateValues.
             */
            public Builder candidateValues(java.util.List<String> candidateValues) {
                this.candidateValues = candidateValues;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * PromptsJson.
             */
            public Builder promptsJson(String promptsJson) {
                this.promptsJson = promptsJson;
                return this;
            }

            /**
             * ScriptProfileTemplateId.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * FunctionId.
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * HttpTriggerName.
             */
            public Builder httpTriggerName(String httpTriggerName) {
                this.httpTriggerName = httpTriggerName;
                return this;
            }

            /**
             * HttpTriggerUrl.
             */
            public Builder httpTriggerUrl(String httpTriggerUrl) {
                this.httpTriggerUrl = httpTriggerUrl;
                return this;
            }

            /**
             * RegionId.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * AccessProfileId.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
                this.omniModel = model.omniModel;
            } 

            /**
             * AgentKey.
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * AgentProfile.
             */
            public Builder agentProfile(AgentProfile agentProfile) {
                this.agentProfile = agentProfile;
                return this;
            }

            /**
             * ChatbotId.
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * FunctionMeta.
             */
            public Builder functionMeta(FunctionMeta functionMeta) {
                this.functionMeta = functionMeta;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * NluAccessProfile.
             */
            public Builder nluAccessProfile(NluAccessProfile nluAccessProfile) {
                this.nluAccessProfile = nluAccessProfile;
                return this;
            }

            /**
             * NluAccessType.
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * OmniModel.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * AccessProfileId.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * Replacement.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * NlsAccessProfile.
             */
            public Builder nlsAccessProfile(NlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * NlsAccessType.
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * PitchRate.
             */
            public Builder pitchRate(Integer pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * PronRules.
             */
            public Builder pronRules(java.util.List<PronRules> pronRules) {
                this.pronRules = pronRules;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * Replacement.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
             * AccessProfileId.
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
     * {@link CreateScriptVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateScriptVersionRequest</p>
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
        private Integer speechNoiseThreshold;

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
        public Integer getSpeechNoiseThreshold() {
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
            private Integer speechNoiseThreshold; 
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
             * CustomizationId.
             */
            public Builder customizationId(String customizationId) {
                this.customizationId = customizationId;
                return this;
            }

            /**
             * EndSilenceTimeout.
             */
            public Builder endSilenceTimeout(Integer endSilenceTimeout) {
                this.endSilenceTimeout = endSilenceTimeout;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * NlsAccessProfile.
             */
            public Builder nlsAccessProfile(TranscriberConfigNlsAccessProfile nlsAccessProfile) {
                this.nlsAccessProfile = nlsAccessProfile;
                return this;
            }

            /**
             * NlsAccessType.
             */
            public Builder nlsAccessType(String nlsAccessType) {
                this.nlsAccessType = nlsAccessType;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * SpeechNoiseThreshold.
             */
            public Builder speechNoiseThreshold(Integer speechNoiseThreshold) {
                this.speechNoiseThreshold = speechNoiseThreshold;
                return this;
            }

            /**
             * VocabularyId.
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
}
