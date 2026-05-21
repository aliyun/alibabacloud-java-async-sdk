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
    @com.aliyun.core.annotation.NameInMap("RagConfig")
    private RagConfig ragConfig;

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
    @com.aliyun.core.annotation.NameInMap("ToolConfig")
    private ToolConfig toolConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscriberConfig")
    private TranscriberConfig transcriberConfig;

    private CreateApplicationVersionRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.businessUnitId = builder.businessUnitId;
        this.interactionConfig = builder.interactionConfig;
        this.ragConfig = builder.ragConfig;
        this.scriptProfile = builder.scriptProfile;
        this.sourceVersionId = builder.sourceVersionId;
        this.synthesizerConfig = builder.synthesizerConfig;
        this.toolConfig = builder.toolConfig;
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
     * @return ragConfig
     */
    public RagConfig getRagConfig() {
        return this.ragConfig;
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
     * @return toolConfig
     */
    public ToolConfig getToolConfig() {
        return this.toolConfig;
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
        private RagConfig ragConfig; 
        private ScriptProfile scriptProfile; 
        private String sourceVersionId; 
        private SynthesizerConfig synthesizerConfig; 
        private ToolConfig toolConfig; 
        private TranscriberConfig transcriberConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationVersionRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.businessUnitId = request.businessUnitId;
            this.interactionConfig = request.interactionConfig;
            this.ragConfig = request.ragConfig;
            this.scriptProfile = request.scriptProfile;
            this.sourceVersionId = request.sourceVersionId;
            this.synthesizerConfig = request.synthesizerConfig;
            this.toolConfig = request.toolConfig;
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
         * RagConfig.
         */
        public Builder ragConfig(RagConfig ragConfig) {
            String ragConfigShrink = shrink(ragConfig, "RagConfig", "json");
            this.putQueryParameter("RagConfig", ragConfigShrink);
            this.ragConfig = ragConfig;
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
         * ToolConfig.
         */
        public Builder toolConfig(ToolConfig toolConfig) {
            String toolConfigShrink = shrink(toolConfig, "ToolConfig", "json");
            this.putQueryParameter("ToolConfig", toolConfigShrink);
            this.toolConfig = toolConfig;
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
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseIds")
        private java.util.List<String> knowledgeBaseIds;

        @com.aliyun.core.annotation.NameInMap("MaxContentLength")
        @com.aliyun.core.annotation.Validation(maximum = 2000, minimum = 1)
        private Integer maxContentLength;

        @com.aliyun.core.annotation.NameInMap("RagEngine")
        private String ragEngine;

        @com.aliyun.core.annotation.NameInMap("TopN")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer topN;

        private RagConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.knowledgeBaseIds = builder.knowledgeBaseIds;
            this.maxContentLength = builder.maxContentLength;
            this.ragEngine = builder.ragEngine;
            this.topN = builder.topN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return knowledgeBaseIds
         */
        public java.util.List<String> getKnowledgeBaseIds() {
            return this.knowledgeBaseIds;
        }

        /**
         * @return maxContentLength
         */
        public Integer getMaxContentLength() {
            return this.maxContentLength;
        }

        /**
         * @return ragEngine
         */
        public String getRagEngine() {
            return this.ragEngine;
        }

        /**
         * @return topN
         */
        public Integer getTopN() {
            return this.topN;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> knowledgeBaseIds; 
            private Integer maxContentLength; 
            private String ragEngine; 
            private Integer topN; 

            private Builder() {
            } 

            private Builder(RagConfig model) {
                this.enabled = model.enabled;
                this.knowledgeBaseIds = model.knowledgeBaseIds;
                this.maxContentLength = model.maxContentLength;
                this.ragEngine = model.ragEngine;
                this.topN = model.topN;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * KnowledgeBaseIds.
             */
            public Builder knowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
                this.knowledgeBaseIds = knowledgeBaseIds;
                return this;
            }

            /**
             * MaxContentLength.
             */
            public Builder maxContentLength(Integer maxContentLength) {
                this.maxContentLength = maxContentLength;
                return this;
            }

            /**
             * RagEngine.
             */
            public Builder ragEngine(String ragEngine) {
                this.ragEngine = ragEngine;
                return this;
            }

            /**
             * TopN.
             */
            public Builder topN(Integer topN) {
                this.topN = topN;
                return this;
            }

            public RagConfig build() {
                return new RagConfig(this);
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class McpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SseEndpoint")
        private String sseEndpoint;

        private McpServers(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.name = builder.name;
            this.sseEndpoint = builder.sseEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServers create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sseEndpoint
         */
        public String getSseEndpoint() {
            return this.sseEndpoint;
        }

        public static final class Builder {
            private String baseUrl; 
            private String name; 
            private String sseEndpoint; 

            private Builder() {
            } 

            private Builder(McpServers model) {
                this.baseUrl = model.baseUrl;
                this.name = model.name;
                this.sseEndpoint = model.sseEndpoint;
            } 

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
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
             * SseEndpoint.
             */
            public Builder sseEndpoint(String sseEndpoint) {
                this.sseEndpoint = sseEndpoint;
                return this;
            }

            public McpServers build() {
                return new McpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
     */
    public static class ToolConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("McpServers")
        private java.util.List<McpServers> mcpServers;

        private ToolConfig(Builder builder) {
            this.mcpServers = builder.mcpServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolConfig create() {
            return builder().build();
        }

        /**
         * @return mcpServers
         */
        public java.util.List<McpServers> getMcpServers() {
            return this.mcpServers;
        }

        public static final class Builder {
            private java.util.List<McpServers> mcpServers; 

            private Builder() {
            } 

            private Builder(ToolConfig model) {
                this.mcpServers = model.mcpServers;
            } 

            /**
             * McpServers.
             */
            public Builder mcpServers(java.util.List<McpServers> mcpServers) {
                this.mcpServers = mcpServers;
                return this;
            }

            public ToolConfig build() {
                return new ToolConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
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
     * {@link CreateApplicationVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationVersionRequest</p>
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
