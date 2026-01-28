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
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
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
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class AgentProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfileId")
        private String agentProfileId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PromptsJson")
        private String promptsJson;

        @com.aliyun.core.annotation.NameInMap("ScriptProfileTemplateId")
        private String scriptProfileTemplateId;

        private AgentProfile(Builder builder) {
            this.agentProfileId = builder.agentProfileId;
            this.description = builder.description;
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
         * @return agentProfileId
         */
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String agentProfileId; 
            private String description; 
            private String promptsJson; 
            private String scriptProfileTemplateId; 

            private Builder() {
            } 

            private Builder(AgentProfile model) {
                this.agentProfileId = model.agentProfileId;
                this.description = model.description;
                this.promptsJson = model.promptsJson;
                this.scriptProfileTemplateId = model.scriptProfileTemplateId;
            } 

            /**
             * AgentProfileId.
             */
            public Builder agentProfileId(String agentProfileId) {
                this.agentProfileId = agentProfileId;
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class ScriptProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfile")
        private AgentProfile agentProfile;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private String temperature;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private String topP;

        private ScriptProfile(Builder builder) {
            this.agentProfile = builder.agentProfile;
            this.model = builder.model;
            this.temperature = builder.temperature;
            this.topP = builder.topP;
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

        /**
         * @return temperature
         */
        public String getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public String getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private AgentProfile agentProfile; 
            private String model; 
            private String temperature; 
            private String topP; 

            private Builder() {
            } 

            private Builder(ScriptProfile model) {
                this.agentProfile = model.agentProfile;
                this.model = model.model;
                this.temperature = model.temperature;
                this.topP = model.topP;
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

            /**
             * Temperature.
             */
            public Builder temperature(String temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * TopP.
             */
            public Builder topP(String topP) {
                this.topP = topP;
                return this;
            }

            public ScriptProfile build() {
                return new ScriptProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
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
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class DraftVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InteractionConfig")
        private InteractionConfig interactionConfig;

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
            private ScriptProfile scriptProfile; 
            private SynthesizerConfig synthesizerConfig; 
            private TranscriberConfig transcriberConfig; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(DraftVersion model) {
                this.interactionConfig = model.interactionConfig;
                this.scriptProfile = model.scriptProfile;
                this.synthesizerConfig = model.synthesizerConfig;
                this.transcriberConfig = model.transcriberConfig;
                this.versionId = model.versionId;
            } 

            /**
             * InteractionConfig.
             */
            public Builder interactionConfig(InteractionConfig interactionConfig) {
                this.interactionConfig = interactionConfig;
                return this;
            }

            /**
             * ScriptProfile.
             */
            public Builder scriptProfile(ScriptProfile scriptProfile) {
                this.scriptProfile = scriptProfile;
                return this;
            }

            /**
             * SynthesizerConfig.
             */
            public Builder synthesizerConfig(SynthesizerConfig synthesizerConfig) {
                this.synthesizerConfig = synthesizerConfig;
                return this;
            }

            /**
             * TranscriberConfig.
             */
            public Builder transcriberConfig(TranscriberConfig transcriberConfig) {
                this.transcriberConfig = transcriberConfig;
                return this;
            }

            /**
             * VersionId.
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class InteractionConfigSilenceDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private InteractionConfigSilenceDetectionConfig(Builder builder) {
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InteractionConfigSilenceDetectionConfig create() {
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

            private Builder(InteractionConfigSilenceDetectionConfig model) {
                this.timeout = model.timeout;
            } 

            /**
             * Timeout.
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PublishedVersionInteractionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SilenceDetectionConfig")
        private InteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        private PublishedVersionInteractionConfig(Builder builder) {
            this.silenceDetectionConfig = builder.silenceDetectionConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionInteractionConfig create() {
            return builder().build();
        }

        /**
         * @return silenceDetectionConfig
         */
        public InteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public static final class Builder {
            private InteractionConfigSilenceDetectionConfig silenceDetectionConfig; 

            private Builder() {
            } 

            private Builder(PublishedVersionInteractionConfig model) {
                this.silenceDetectionConfig = model.silenceDetectionConfig;
            } 

            /**
             * SilenceDetectionConfig.
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class ScriptProfileAgentProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfileId")
        private String agentProfileId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PromptsJson")
        private String promptsJson;

        @com.aliyun.core.annotation.NameInMap("ScriptProfileTemplateId")
        private String scriptProfileTemplateId;

        private ScriptProfileAgentProfile(Builder builder) {
            this.agentProfileId = builder.agentProfileId;
            this.description = builder.description;
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
         * @return agentProfileId
         */
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String agentProfileId; 
            private String description; 
            private String promptsJson; 
            private String scriptProfileTemplateId; 

            private Builder() {
            } 

            private Builder(ScriptProfileAgentProfile model) {
                this.agentProfileId = model.agentProfileId;
                this.description = model.description;
                this.promptsJson = model.promptsJson;
                this.scriptProfileTemplateId = model.scriptProfileTemplateId;
            } 

            /**
             * AgentProfileId.
             */
            public Builder agentProfileId(String agentProfileId) {
                this.agentProfileId = agentProfileId;
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

            public ScriptProfileAgentProfile build() {
                return new ScriptProfileAgentProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PublishedVersionScriptProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfile")
        private ScriptProfileAgentProfile agentProfile;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private String temperature;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private String topP;

        private PublishedVersionScriptProfile(Builder builder) {
            this.agentProfile = builder.agentProfile;
            this.model = builder.model;
            this.temperature = builder.temperature;
            this.topP = builder.topP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionScriptProfile create() {
            return builder().build();
        }

        /**
         * @return agentProfile
         */
        public ScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return temperature
         */
        public String getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public String getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private ScriptProfileAgentProfile agentProfile; 
            private String model; 
            private String temperature; 
            private String topP; 

            private Builder() {
            } 

            private Builder(PublishedVersionScriptProfile model) {
                this.agentProfile = model.agentProfile;
                this.model = model.model;
                this.temperature = model.temperature;
                this.topP = model.topP;
            } 

            /**
             * AgentProfile.
             */
            public Builder agentProfile(ScriptProfileAgentProfile agentProfile) {
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

            /**
             * Temperature.
             */
            public Builder temperature(String temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * TopP.
             */
            public Builder topP(String topP) {
                this.topP = topP;
                return this;
            }

            public PublishedVersionScriptProfile build() {
                return new PublishedVersionScriptProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PublishedVersionSynthesizerConfig extends TeaModel {
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

        private PublishedVersionSynthesizerConfig(Builder builder) {
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

        public static PublishedVersionSynthesizerConfig create() {
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

            private Builder(PublishedVersionSynthesizerConfig model) {
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

            public PublishedVersionSynthesizerConfig build() {
                return new PublishedVersionSynthesizerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PublishedVersionTranscriberConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NlsAccessType")
        private String nlsAccessType;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        private PublishedVersionTranscriberConfig(Builder builder) {
            this.nlsAccessType = builder.nlsAccessType;
            this.nlsEngine = builder.nlsEngine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionTranscriberConfig create() {
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

            private Builder(PublishedVersionTranscriberConfig model) {
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

            public PublishedVersionTranscriberConfig build() {
                return new PublishedVersionTranscriberConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class PublishedVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InteractionConfig")
        private PublishedVersionInteractionConfig interactionConfig;

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
            private PublishedVersionScriptProfile scriptProfile; 
            private PublishedVersionSynthesizerConfig synthesizerConfig; 
            private PublishedVersionTranscriberConfig transcriberConfig; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(PublishedVersion model) {
                this.interactionConfig = model.interactionConfig;
                this.scriptProfile = model.scriptProfile;
                this.synthesizerConfig = model.synthesizerConfig;
                this.transcriberConfig = model.transcriberConfig;
                this.versionId = model.versionId;
            } 

            /**
             * InteractionConfig.
             */
            public Builder interactionConfig(PublishedVersionInteractionConfig interactionConfig) {
                this.interactionConfig = interactionConfig;
                return this;
            }

            /**
             * ScriptProfile.
             */
            public Builder scriptProfile(PublishedVersionScriptProfile scriptProfile) {
                this.scriptProfile = scriptProfile;
                return this;
            }

            /**
             * SynthesizerConfig.
             */
            public Builder synthesizerConfig(PublishedVersionSynthesizerConfig synthesizerConfig) {
                this.synthesizerConfig = synthesizerConfig;
                return this;
            }

            /**
             * TranscriberConfig.
             */
            public Builder transcriberConfig(PublishedVersionTranscriberConfig transcriberConfig) {
                this.transcriberConfig = transcriberConfig;
                return this;
            }

            /**
             * VersionId.
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
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

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

        @com.aliyun.core.annotation.NameInMap("NluAccessType")
        private String nluAccessType;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("PublishedVersion")
        private PublishedVersion publishedVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Data(Builder builder) {
            this.applicationId = builder.applicationId;
            this.concurrency = builder.concurrency;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.draftVersion = builder.draftVersion;
            this.name = builder.name;
            this.nluAccessType = builder.nluAccessType;
            this.nluEngine = builder.nluEngine;
            this.publishedVersion = builder.publishedVersion;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
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
         * @return publishedVersion
         */
        public PublishedVersion getPublishedVersion() {
            return this.publishedVersion;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String applicationId; 
            private Integer concurrency; 
            private Long createdTime; 
            private String description; 
            private DraftVersion draftVersion; 
            private String name; 
            private String nluAccessType; 
            private String nluEngine; 
            private PublishedVersion publishedVersion; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationId = model.applicationId;
                this.concurrency = model.concurrency;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.draftVersion = model.draftVersion;
                this.name = model.name;
                this.nluAccessType = model.nluAccessType;
                this.nluEngine = model.nluEngine;
                this.publishedVersion = model.publishedVersion;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * DraftVersion.
             */
            public Builder draftVersion(DraftVersion draftVersion) {
                this.draftVersion = draftVersion;
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
             * NluAccessType.
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * NluEngine.
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * PublishedVersion.
             */
            public Builder publishedVersion(PublishedVersion publishedVersion) {
                this.publishedVersion = publishedVersion;
                return this;
            }

            /**
             * UpdatedTime.
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
