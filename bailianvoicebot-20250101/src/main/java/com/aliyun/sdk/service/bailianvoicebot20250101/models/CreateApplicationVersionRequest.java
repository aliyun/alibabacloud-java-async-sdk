// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link CreateApplicationVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationVersionRequest</p>
 */
public class CreateApplicationVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InteractionConfig")
    private InteractionConfig interactionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptProfile")
    private ScriptProfile scriptProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceVersionId")
    private String sourceVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynthesizerConfig")
    private SynthesizerConfig synthesizerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscriberConfig")
    private TranscriberConfig transcriberConfig;

    private CreateApplicationVersionRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.businessUnitId = builder.businessUnitId;
        this.interactionConfig = builder.interactionConfig;
        this.scriptProfile = builder.scriptProfile;
        this.sourceVersionId = builder.sourceVersionId;
        this.synthesizerConfig = builder.synthesizerConfig;
        this.transcriberConfig = builder.transcriberConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return interactionConfig
     */
    public InteractionConfig getInteractionConfig() {
        return this.interactionConfig;
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

    public static final class Builder extends Request.Builder<CreateApplicationVersionRequest, Builder> {
        private String applicationId; 
        private String businessUnitId; 
        private InteractionConfig interactionConfig; 
        private ScriptProfile scriptProfile; 
        private String sourceVersionId; 
        private SynthesizerConfig synthesizerConfig; 
        private TranscriberConfig transcriberConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationVersionRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.businessUnitId = request.businessUnitId;
            this.interactionConfig = request.interactionConfig;
            this.scriptProfile = request.scriptProfile;
            this.sourceVersionId = request.sourceVersionId;
            this.synthesizerConfig = request.synthesizerConfig;
            this.transcriberConfig = request.transcriberConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a395011f-a247-400f-bc69-28796749fd52</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-c11iig67g863rih8</p>
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putQueryParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * InteractionConfig.
         */
        public Builder interactionConfig(InteractionConfig interactionConfig) {
            String interactionConfigShrink = shrink(interactionConfig, "InteractionConfig", "json");
            this.putQueryParameter("InteractionConfig", interactionConfigShrink);
            this.interactionConfig = interactionConfig;
            return this;
        }

        /**
         * ScriptProfile.
         */
        public Builder scriptProfile(ScriptProfile scriptProfile) {
            String scriptProfileShrink = shrink(scriptProfile, "ScriptProfile", "json");
            this.putQueryParameter("ScriptProfile", scriptProfileShrink);
            this.scriptProfile = scriptProfile;
            return this;
        }

        /**
         * SourceVersionId.
         */
        public Builder sourceVersionId(String sourceVersionId) {
            this.putQueryParameter("SourceVersionId", sourceVersionId);
            this.sourceVersionId = sourceVersionId;
            return this;
        }

        /**
         * SynthesizerConfig.
         */
        public Builder synthesizerConfig(SynthesizerConfig synthesizerConfig) {
            String synthesizerConfigShrink = shrink(synthesizerConfig, "SynthesizerConfig", "json");
            this.putQueryParameter("SynthesizerConfig", synthesizerConfigShrink);
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }

        /**
         * TranscriberConfig.
         */
        public Builder transcriberConfig(TranscriberConfig transcriberConfig) {
            String transcriberConfigShrink = shrink(transcriberConfig, "TranscriberConfig", "json");
            this.putQueryParameter("TranscriberConfig", transcriberConfigShrink);
            this.transcriberConfig = transcriberConfig;
            return this;
        }

        @Override
        public CreateApplicationVersionRequest build() {
            return new CreateApplicationVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class SilenceDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private SilenceDetectionConfig(Builder builder) {
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilenceDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(SilenceDetectionConfig model) {
                this.timeout = model.timeout;
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class InteractionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SilenceDetectionConfig")
        private SilenceDetectionConfig silenceDetectionConfig;

        private InteractionConfig(Builder builder) {
            this.silenceDetectionConfig = builder.silenceDetectionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InteractionConfig create() {
            return builder().build();
        }

        /**
         * @return silenceDetectionConfig
         */
        public SilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public static final class Builder {
            private SilenceDetectionConfig silenceDetectionConfig; 

            private Builder() {
            } 

            private Builder(InteractionConfig model) {
                this.silenceDetectionConfig = model.silenceDetectionConfig;
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class AgentProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PromptsJson")
        private String promptsJson;

        @com.aliyun.core.annotation.NameInMap("ScriptProfileTemplateId")
        private String scriptProfileTemplateId;

        private AgentProfile(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
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

            private Builder(AgentProfile model) {
                this.description = model.description;
                this.name = model.name;
                this.promptsJson = model.promptsJson;
                this.scriptProfileTemplateId = model.scriptProfileTemplateId;
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class ScriptProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfile")
        private AgentProfile agentProfile;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        private ScriptProfile(Builder builder) {
            this.agentProfile = builder.agentProfile;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptProfile create() {
            return builder().build();
        }

        /**
         * @return agentProfile
         */
        public AgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private AgentProfile agentProfile; 
            private String model; 

            private Builder() {
            } 

            private Builder(ScriptProfile model) {
                this.agentProfile = model.agentProfile;
                this.model = model.model;
            } 

            /**
             * AgentProfile.
             */
            public Builder agentProfile(AgentProfile agentProfile) {
                this.agentProfile = agentProfile;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public ScriptProfile build() {
                return new ScriptProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class SynthesizerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("PitchRate")
        private Integer pitchRate;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private SynthesizerConfig(Builder builder) {
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
            this.pitchRate = builder.pitchRate;
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
            private String nlsAccessType; 
            private String nlsEngine; 
            private Integer pitchRate; 
            private Integer speechRate; 
            private String voice; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(SynthesizerConfig model) {
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
                this.pitchRate = model.pitchRate;
                this.speechRate = model.speechRate;
                this.voice = model.voice;
                this.volume = model.volume;
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class TranscriberConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        private TranscriberConfig(Builder builder) {
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscriberConfig create() {
            return builder().build();
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

        public static final class Builder {
            private String nlsAccessType; 
            private String nlsEngine; 

            private Builder() {
            } 

            private Builder(TranscriberConfig model) {
                this.nlsAccessType = model.nlsAccessType;
                this.nlsEngine = model.nlsEngine;
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

            public TranscriberConfig build() {
                return new TranscriberConfig(this);
            } 

        } 

    }
}
