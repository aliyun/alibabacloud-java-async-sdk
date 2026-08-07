// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
    @com.aliyun.core.annotation.NameInMap("LabelConfigs")
    private java.util.List<LabelConfigs> labelConfigs;

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
        this.labelConfigs = builder.labelConfigs;
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
     * @return labelConfigs
     */
    public java.util.List<LabelConfigs> getLabelConfigs() {
        return this.labelConfigs;
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
        private java.util.List<LabelConfigs> labelConfigs; 
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
            this.labelConfigs = request.labelConfigs;
            this.scriptId = request.scriptId;
            this.scriptProfile = request.scriptProfile;
            this.sourceVersionId = request.sourceVersionId;
            this.synthesizerConfig = request.synthesizerConfig;
            this.transcriberConfig = request.transcriberConfig;
        } 

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>交互配置</p>
         */
        public Builder interactionConfig(InteractionConfig interactionConfig) {
            String interactionConfigShrink = shrink(interactionConfig, "InteractionConfig", "json");
            this.putBodyParameter("InteractionConfig", interactionConfigShrink);
            this.interactionConfig = interactionConfig;
            return this;
        }

        /**
         * <p>草稿版本的标签配置（JSON字符串）</p>
         */
        public Builder labelConfigs(java.util.List<LabelConfigs> labelConfigs) {
            String labelConfigsShrink = shrink(labelConfigs, "LabelConfigs", "json");
            this.putBodyParameter("LabelConfigs", labelConfigsShrink);
            this.labelConfigs = labelConfigs;
            return this;
        }

        /**
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>话术配置</p>
         */
        public Builder scriptProfile(ScriptProfile scriptProfile) {
            String scriptProfileShrink = shrink(scriptProfile, "ScriptProfile", "json");
            this.putBodyParameter("ScriptProfile", scriptProfileShrink);
            this.scriptProfile = scriptProfile;
            return this;
        }

        /**
         * <p>源版本ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b26</p>
         */
        public Builder sourceVersionId(String sourceVersionId) {
            this.putBodyParameter("SourceVersionId", sourceVersionId);
            this.sourceVersionId = sourceVersionId;
            return this;
        }

        /**
         * <p>语音合成配置</p>
         */
        public Builder synthesizerConfig(SynthesizerConfig synthesizerConfig) {
            String synthesizerConfigShrink = shrink(synthesizerConfig, "SynthesizerConfig", "json");
            this.putBodyParameter("SynthesizerConfig", synthesizerConfigShrink);
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }

        /**
         * <p>语音识别配置</p>
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
    public static class BargeInConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClosingBargeInEnabled")
        private Boolean closingBargeInEnabled;

        @com.aliyun.core.annotation.NameInMap("GlobalBargeInEnabled")
        private Boolean globalBargeInEnabled;

        @com.aliyun.core.annotation.NameInMap("OpeningBargeInEnabled")
        private Boolean openingBargeInEnabled;

        private BargeInConfig(Builder builder) {
            this.closingBargeInEnabled = builder.closingBargeInEnabled;
            this.globalBargeInEnabled = builder.globalBargeInEnabled;
            this.openingBargeInEnabled = builder.openingBargeInEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BargeInConfig create() {
            return builder().build();
        }

        /**
         * @return closingBargeInEnabled
         */
        public Boolean getClosingBargeInEnabled() {
            return this.closingBargeInEnabled;
        }

        /**
         * @return globalBargeInEnabled
         */
        public Boolean getGlobalBargeInEnabled() {
            return this.globalBargeInEnabled;
        }

        /**
         * @return openingBargeInEnabled
         */
        public Boolean getOpeningBargeInEnabled() {
            return this.openingBargeInEnabled;
        }

        public static final class Builder {
            private Boolean closingBargeInEnabled; 
            private Boolean globalBargeInEnabled; 
            private Boolean openingBargeInEnabled; 

            private Builder() {
            } 

            private Builder(BargeInConfig model) {
                this.closingBargeInEnabled = model.closingBargeInEnabled;
                this.globalBargeInEnabled = model.globalBargeInEnabled;
                this.openingBargeInEnabled = model.openingBargeInEnabled;
            } 

            /**
             * ClosingBargeInEnabled.
             */
            public Builder closingBargeInEnabled(Boolean closingBargeInEnabled) {
                this.closingBargeInEnabled = closingBargeInEnabled;
                return this;
            }

            /**
             * GlobalBargeInEnabled.
             */
            public Builder globalBargeInEnabled(Boolean globalBargeInEnabled) {
                this.globalBargeInEnabled = globalBargeInEnabled;
                return this;
            }

            /**
             * OpeningBargeInEnabled.
             */
            public Builder openingBargeInEnabled(Boolean openingBargeInEnabled) {
                this.openingBargeInEnabled = openingBargeInEnabled;
                return this;
            }

            public BargeInConfig build() {
                return new BargeInConfig(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TurnLimit")
        private Integer turnLimit;

        private Triggers(Builder builder) {
            this.closingStatement = builder.closingStatement;
            this.keywords = builder.keywords;
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
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
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
            private java.util.List<String> keywords; 
            private String triggerType; 
            private Integer turnLimit; 

            private Builder() {
            } 

            private Builder(Triggers model) {
                this.closingStatement = model.closingStatement;
                this.keywords = model.keywords;
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
             * Keywords.
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
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
        @com.aliyun.core.annotation.NameInMap("BargeInEnabled")
        private Boolean bargeInEnabled;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<Triggers> triggers;

        private EndConversationConfig(Builder builder) {
            this.bargeInEnabled = builder.bargeInEnabled;
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
         * @return bargeInEnabled
         */
        public Boolean getBargeInEnabled() {
            return this.bargeInEnabled;
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
            private Boolean bargeInEnabled; 
            private Integer delay; 
            private java.util.List<Triggers> triggers; 

            private Builder() {
            } 

            private Builder(EndConversationConfig model) {
                this.bargeInEnabled = model.bargeInEnabled;
                this.delay = model.delay;
                this.triggers = model.triggers;
            } 

            /**
             * BargeInEnabled.
             */
            public Builder bargeInEnabled(Boolean bargeInEnabled) {
                this.bargeInEnabled = bargeInEnabled;
                return this;
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
    public static class FallbackControlParamsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FallbackControlParamsList(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackControlParamsList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(FallbackControlParamsList model) {
                this.type = model.type;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FallbackControlParamsList build() {
                return new FallbackControlParamsList(this);
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
        @com.aliyun.core.annotation.NameInMap("FallbackControlParamsList")
        private java.util.List<FallbackControlParamsList> fallbackControlParamsList;

        @com.aliyun.core.annotation.NameInMap("MaxRepeats")
        private Integer maxRepeats;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private SilenceDetectionConfig(Builder builder) {
            this.fallbackControlParamsList = builder.fallbackControlParamsList;
            this.maxRepeats = builder.maxRepeats;
            this.prompt = builder.prompt;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilenceDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return fallbackControlParamsList
         */
        public java.util.List<FallbackControlParamsList> getFallbackControlParamsList() {
            return this.fallbackControlParamsList;
        }

        /**
         * @return maxRepeats
         */
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private java.util.List<FallbackControlParamsList> fallbackControlParamsList; 
            private Integer maxRepeats; 
            private String prompt; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(SilenceDetectionConfig model) {
                this.fallbackControlParamsList = model.fallbackControlParamsList;
                this.maxRepeats = model.maxRepeats;
                this.prompt = model.prompt;
                this.timeout = model.timeout;
            } 

            /**
             * FallbackControlParamsList.
             */
            public Builder fallbackControlParamsList(java.util.List<FallbackControlParamsList> fallbackControlParamsList) {
                this.fallbackControlParamsList = fallbackControlParamsList;
                return this;
            }

            /**
             * MaxRepeats.
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
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
    public static class TransitionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiPhrasePrompt")
        private String aiPhrasePrompt;

        @com.aliyun.core.annotation.NameInMap("FixedPhraseList")
        private java.util.List<String> fixedPhraseList;

        @com.aliyun.core.annotation.NameInMap("PhraseSource")
        private String phraseSource;

        @com.aliyun.core.annotation.NameInMap("TransitionSwitch")
        private Boolean transitionSwitch;

        private TransitionConfig(Builder builder) {
            this.aiPhrasePrompt = builder.aiPhrasePrompt;
            this.fixedPhraseList = builder.fixedPhraseList;
            this.phraseSource = builder.phraseSource;
            this.transitionSwitch = builder.transitionSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitionConfig create() {
            return builder().build();
        }

        /**
         * @return aiPhrasePrompt
         */
        public String getAiPhrasePrompt() {
            return this.aiPhrasePrompt;
        }

        /**
         * @return fixedPhraseList
         */
        public java.util.List<String> getFixedPhraseList() {
            return this.fixedPhraseList;
        }

        /**
         * @return phraseSource
         */
        public String getPhraseSource() {
            return this.phraseSource;
        }

        /**
         * @return transitionSwitch
         */
        public Boolean getTransitionSwitch() {
            return this.transitionSwitch;
        }

        public static final class Builder {
            private String aiPhrasePrompt; 
            private java.util.List<String> fixedPhraseList; 
            private String phraseSource; 
            private Boolean transitionSwitch; 

            private Builder() {
            } 

            private Builder(TransitionConfig model) {
                this.aiPhrasePrompt = model.aiPhrasePrompt;
                this.fixedPhraseList = model.fixedPhraseList;
                this.phraseSource = model.phraseSource;
                this.transitionSwitch = model.transitionSwitch;
            } 

            /**
             * AiPhrasePrompt.
             */
            public Builder aiPhrasePrompt(String aiPhrasePrompt) {
                this.aiPhrasePrompt = aiPhrasePrompt;
                return this;
            }

            /**
             * FixedPhraseList.
             */
            public Builder fixedPhraseList(java.util.List<String> fixedPhraseList) {
                this.fixedPhraseList = fixedPhraseList;
                return this;
            }

            /**
             * PhraseSource.
             */
            public Builder phraseSource(String phraseSource) {
                this.phraseSource = phraseSource;
                return this;
            }

            /**
             * TransitionSwitch.
             */
            public Builder transitionSwitch(Boolean transitionSwitch) {
                this.transitionSwitch = transitionSwitch;
                return this;
            }

            public TransitionConfig build() {
                return new TransitionConfig(this);
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

        @com.aliyun.core.annotation.NameInMap("BargeInConfig")
        private BargeInConfig bargeInConfig;

        @com.aliyun.core.annotation.NameInMap("EndConversationConfig")
        private EndConversationConfig endConversationConfig;

        @com.aliyun.core.annotation.NameInMap("InitialGreetingDelayMilliseconds")
        private Integer initialGreetingDelayMilliseconds;

        @com.aliyun.core.annotation.NameInMap("SilenceDetectionConfig")
        private SilenceDetectionConfig silenceDetectionConfig;

        @com.aliyun.core.annotation.NameInMap("TransitionConfig")
        private TransitionConfig transitionConfig;

        private InteractionConfig(Builder builder) {
            this.backgroundMusicId = builder.backgroundMusicId;
            this.bargeInConfig = builder.bargeInConfig;
            this.endConversationConfig = builder.endConversationConfig;
            this.initialGreetingDelayMilliseconds = builder.initialGreetingDelayMilliseconds;
            this.silenceDetectionConfig = builder.silenceDetectionConfig;
            this.transitionConfig = builder.transitionConfig;
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
         * @return bargeInConfig
         */
        public BargeInConfig getBargeInConfig() {
            return this.bargeInConfig;
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

        /**
         * @return transitionConfig
         */
        public TransitionConfig getTransitionConfig() {
            return this.transitionConfig;
        }

        public static final class Builder {
            private String backgroundMusicId; 
            private BargeInConfig bargeInConfig; 
            private EndConversationConfig endConversationConfig; 
            private Integer initialGreetingDelayMilliseconds; 
            private SilenceDetectionConfig silenceDetectionConfig; 
            private TransitionConfig transitionConfig; 

            private Builder() {
            } 

            private Builder(InteractionConfig model) {
                this.backgroundMusicId = model.backgroundMusicId;
                this.bargeInConfig = model.bargeInConfig;
                this.endConversationConfig = model.endConversationConfig;
                this.initialGreetingDelayMilliseconds = model.initialGreetingDelayMilliseconds;
                this.silenceDetectionConfig = model.silenceDetectionConfig;
                this.transitionConfig = model.transitionConfig;
            } 

            /**
             * BackgroundMusicId.
             */
            public Builder backgroundMusicId(String backgroundMusicId) {
                this.backgroundMusicId = backgroundMusicId;
                return this;
            }

            /**
             * BargeInConfig.
             */
            public Builder bargeInConfig(BargeInConfig bargeInConfig) {
                this.bargeInConfig = bargeInConfig;
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

            /**
             * TransitionConfig.
             */
            public Builder transitionConfig(TransitionConfig transitionConfig) {
                this.transitionConfig = transitionConfig;
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
    public static class LabelConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateValues")
        private java.util.List<String> candidateValues;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LabelConfigs(Builder builder) {
            this.candidateValues = builder.candidateValues;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelConfigs create() {
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

            private Builder(LabelConfigs model) {
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

            public LabelConfigs build() {
                return new LabelConfigs(this);
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

        @com.aliyun.core.annotation.NameInMap("BuilderType")
        private String builderType;

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
            this.builderType = builder.builderType;
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
         * @return builderType
         */
        public String getBuilderType() {
            return this.builderType;
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
            private String builderType; 
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
                this.builderType = model.builderType;
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
             * BuilderType.
             */
            public Builder builderType(String builderType) {
                this.builderType = builderType;
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
