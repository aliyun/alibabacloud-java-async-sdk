// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link CreateAndPulishAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAndPulishAgentRequest</p>
 */
public class CreateAndPulishAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("applicationConfig")
    private ApplicationConfig applicationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instructions")
    private String instructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sampleLibrary")
    private SampleLibrary sampleLibrary;

    private CreateAndPulishAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.applicationConfig = builder.applicationConfig;
        this.instructions = builder.instructions;
        this.modelId = builder.modelId;
        this.name = builder.name;
        this.sampleLibrary = builder.sampleLibrary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndPulishAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return applicationConfig
     */
    public ApplicationConfig getApplicationConfig() {
        return this.applicationConfig;
    }

    /**
     * @return instructions
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sampleLibrary
     */
    public SampleLibrary getSampleLibrary() {
        return this.sampleLibrary;
    }

    public static final class Builder extends Request.Builder<CreateAndPulishAgentRequest, Builder> {
        private String workspaceId; 
        private ApplicationConfig applicationConfig; 
        private String instructions; 
        private String modelId; 
        private String name; 
        private SampleLibrary sampleLibrary; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndPulishAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.applicationConfig = request.applicationConfig;
            this.instructions = request.instructions;
            this.modelId = request.modelId;
            this.name = request.name;
            this.sampleLibrary = request.sampleLibrary;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * applicationConfig.
         */
        public Builder applicationConfig(ApplicationConfig applicationConfig) {
            String applicationConfigShrink = shrink(applicationConfig, "applicationConfig", "json");
            this.putBodyParameter("applicationConfig", applicationConfigShrink);
            this.applicationConfig = applicationConfig;
            return this;
        }

        /**
         * instructions.
         */
        public Builder instructions(String instructions) {
            this.putBodyParameter("instructions", instructions);
            this.instructions = instructions;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * sampleLibrary.
         */
        public Builder sampleLibrary(SampleLibrary sampleLibrary) {
            String sampleLibraryShrink = shrink(sampleLibrary, "sampleLibrary", "json");
            this.putBodyParameter("sampleLibrary", sampleLibraryShrink);
            this.sampleLibrary = sampleLibrary;
            return this;
        }

        @Override
        public CreateAndPulishAgentRequest build() {
            return new CreateAndPulishAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class HistoryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableAdbRecord")
        private Boolean enableAdbRecord;

        @com.aliyun.core.annotation.NameInMap("enableRecord")
        private Boolean enableRecord;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("storeCode")
        private String storeCode;

        private HistoryConfig(Builder builder) {
            this.enableAdbRecord = builder.enableAdbRecord;
            this.enableRecord = builder.enableRecord;
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.storeCode = builder.storeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryConfig create() {
            return builder().build();
        }

        /**
         * @return enableAdbRecord
         */
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        /**
         * @return enableRecord
         */
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return storeCode
         */
        public String getStoreCode() {
            return this.storeCode;
        }

        public static final class Builder {
            private Boolean enableAdbRecord; 
            private Boolean enableRecord; 
            private String instanceId; 
            private String region; 
            private String storeCode; 

            /**
             * enableAdbRecord.
             */
            public Builder enableAdbRecord(Boolean enableAdbRecord) {
                this.enableAdbRecord = enableAdbRecord;
                return this;
            }

            /**
             * enableRecord.
             */
            public Builder enableRecord(Boolean enableRecord) {
                this.enableRecord = enableRecord;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * storeCode.
             */
            public Builder storeCode(String storeCode) {
                this.storeCode = storeCode;
                return this;
            }

            public HistoryConfig build() {
                return new HistoryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class LongTermMemory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private LongTermMemory(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LongTermMemory create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public LongTermMemory build() {
                return new LongTermMemory(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dialogRound")
        private Integer dialogRound;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Integer maxTokens;

        @com.aliyun.core.annotation.NameInMap("temperature")
        private Double temperature;

        private Parameters(Builder builder) {
            this.dialogRound = builder.dialogRound;
            this.maxTokens = builder.maxTokens;
            this.temperature = builder.temperature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return dialogRound
         */
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return temperature
         */
        public Double getTemperature() {
            return this.temperature;
        }

        public static final class Builder {
            private Integer dialogRound; 
            private Integer maxTokens; 
            private Double temperature; 

            /**
             * dialogRound.
             */
            public Builder dialogRound(Integer dialogRound) {
                this.dialogRound = dialogRound;
                return this;
            }

            /**
             * maxTokens.
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * temperature.
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerScope")
        private String answerScope;

        @com.aliyun.core.annotation.NameInMap("enableCitation")
        private Boolean enableCitation;

        @com.aliyun.core.annotation.NameInMap("enableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("enableWebSearch")
        private Boolean enableWebSearch;

        @com.aliyun.core.annotation.NameInMap("fixedReplyDetail")
        private String fixedReplyDetail;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseCodeList")
        private java.util.List<String> knowledgeBaseCodeList;

        @com.aliyun.core.annotation.NameInMap("promptStrategy")
        private String promptStrategy;

        @com.aliyun.core.annotation.NameInMap("ragRejectType")
        private String ragRejectType;

        @com.aliyun.core.annotation.NameInMap("rejectFilterPrompt")
        private String rejectFilterPrompt;

        @com.aliyun.core.annotation.NameInMap("rejectFilterType")
        private String rejectFilterType;

        @com.aliyun.core.annotation.NameInMap("retrieveMaxLength")
        private Integer retrieveMaxLength;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        private RagConfig(Builder builder) {
            this.answerScope = builder.answerScope;
            this.enableCitation = builder.enableCitation;
            this.enableSearch = builder.enableSearch;
            this.enableWebSearch = builder.enableWebSearch;
            this.fixedReplyDetail = builder.fixedReplyDetail;
            this.knowledgeBaseCodeList = builder.knowledgeBaseCodeList;
            this.promptStrategy = builder.promptStrategy;
            this.ragRejectType = builder.ragRejectType;
            this.rejectFilterPrompt = builder.rejectFilterPrompt;
            this.rejectFilterType = builder.rejectFilterType;
            this.retrieveMaxLength = builder.retrieveMaxLength;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
        }

        /**
         * @return answerScope
         */
        public String getAnswerScope() {
            return this.answerScope;
        }

        /**
         * @return enableCitation
         */
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return enableWebSearch
         */
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        /**
         * @return fixedReplyDetail
         */
        public String getFixedReplyDetail() {
            return this.fixedReplyDetail;
        }

        /**
         * @return knowledgeBaseCodeList
         */
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        /**
         * @return promptStrategy
         */
        public String getPromptStrategy() {
            return this.promptStrategy;
        }

        /**
         * @return ragRejectType
         */
        public String getRagRejectType() {
            return this.ragRejectType;
        }

        /**
         * @return rejectFilterPrompt
         */
        public String getRejectFilterPrompt() {
            return this.rejectFilterPrompt;
        }

        /**
         * @return rejectFilterType
         */
        public String getRejectFilterType() {
            return this.rejectFilterType;
        }

        /**
         * @return retrieveMaxLength
         */
        public Integer getRetrieveMaxLength() {
            return this.retrieveMaxLength;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private String answerScope; 
            private Boolean enableCitation; 
            private Boolean enableSearch; 
            private Boolean enableWebSearch; 
            private String fixedReplyDetail; 
            private java.util.List<String> knowledgeBaseCodeList; 
            private String promptStrategy; 
            private String ragRejectType; 
            private String rejectFilterPrompt; 
            private String rejectFilterType; 
            private Integer retrieveMaxLength; 
            private Integer topK; 

            /**
             * answerScope.
             */
            public Builder answerScope(String answerScope) {
                this.answerScope = answerScope;
                return this;
            }

            /**
             * enableCitation.
             */
            public Builder enableCitation(Boolean enableCitation) {
                this.enableCitation = enableCitation;
                return this;
            }

            /**
             * enableSearch.
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * enableWebSearch.
             */
            public Builder enableWebSearch(Boolean enableWebSearch) {
                this.enableWebSearch = enableWebSearch;
                return this;
            }

            /**
             * fixedReplyDetail.
             */
            public Builder fixedReplyDetail(String fixedReplyDetail) {
                this.fixedReplyDetail = fixedReplyDetail;
                return this;
            }

            /**
             * knowledgeBaseCodeList.
             */
            public Builder knowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
                this.knowledgeBaseCodeList = knowledgeBaseCodeList;
                return this;
            }

            /**
             * promptStrategy.
             */
            public Builder promptStrategy(String promptStrategy) {
                this.promptStrategy = promptStrategy;
                return this;
            }

            /**
             * ragRejectType.
             */
            public Builder ragRejectType(String ragRejectType) {
                this.ragRejectType = ragRejectType;
                return this;
            }

            /**
             * rejectFilterPrompt.
             */
            public Builder rejectFilterPrompt(String rejectFilterPrompt) {
                this.rejectFilterPrompt = rejectFilterPrompt;
                return this;
            }

            /**
             * rejectFilterType.
             */
            public Builder rejectFilterType(String rejectFilterType) {
                this.rejectFilterType = rejectFilterType;
                return this;
            }

            /**
             * retrieveMaxLength.
             */
            public Builder retrieveMaxLength(Integer retrieveMaxLength) {
                this.retrieveMaxLength = retrieveMaxLength;
                return this;
            }

            /**
             * topK.
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public RagConfig build() {
                return new RagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class SecurityConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("processingStrategy")
        private String processingStrategy;

        private SecurityConfig(Builder builder) {
            this.processingStrategy = builder.processingStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityConfig create() {
            return builder().build();
        }

        /**
         * @return processingStrategy
         */
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

        public static final class Builder {
            private String processingStrategy; 

            /**
             * processingStrategy.
             */
            public Builder processingStrategy(String processingStrategy) {
                this.processingStrategy = processingStrategy;
                return this;
            }

            public SecurityConfig build() {
                return new SecurityConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Tools(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
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

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class WorkFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private WorkFlows(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlows create() {
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

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public WorkFlows build() {
                return new WorkFlows(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class ApplicationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("historyConfig")
        private HistoryConfig historyConfig;

        @com.aliyun.core.annotation.NameInMap("longTermMemory")
        private LongTermMemory longTermMemory;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("ragConfig")
        private RagConfig ragConfig;

        @com.aliyun.core.annotation.NameInMap("securityConfig")
        private SecurityConfig securityConfig;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("workFlows")
        private java.util.List<WorkFlows> workFlows;

        private ApplicationConfig(Builder builder) {
            this.historyConfig = builder.historyConfig;
            this.longTermMemory = builder.longTermMemory;
            this.parameters = builder.parameters;
            this.ragConfig = builder.ragConfig;
            this.securityConfig = builder.securityConfig;
            this.tools = builder.tools;
            this.workFlows = builder.workFlows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfig create() {
            return builder().build();
        }

        /**
         * @return historyConfig
         */
        public HistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        /**
         * @return longTermMemory
         */
        public LongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return ragConfig
         */
        public RagConfig getRagConfig() {
            return this.ragConfig;
        }

        /**
         * @return securityConfig
         */
        public SecurityConfig getSecurityConfig() {
            return this.securityConfig;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return workFlows
         */
        public java.util.List<WorkFlows> getWorkFlows() {
            return this.workFlows;
        }

        public static final class Builder {
            private HistoryConfig historyConfig; 
            private LongTermMemory longTermMemory; 
            private Parameters parameters; 
            private RagConfig ragConfig; 
            private SecurityConfig securityConfig; 
            private java.util.List<Tools> tools; 
            private java.util.List<WorkFlows> workFlows; 

            /**
             * historyConfig.
             */
            public Builder historyConfig(HistoryConfig historyConfig) {
                this.historyConfig = historyConfig;
                return this;
            }

            /**
             * longTermMemory.
             */
            public Builder longTermMemory(LongTermMemory longTermMemory) {
                this.longTermMemory = longTermMemory;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * ragConfig.
             */
            public Builder ragConfig(RagConfig ragConfig) {
                this.ragConfig = ragConfig;
                return this;
            }

            /**
             * securityConfig.
             */
            public Builder securityConfig(SecurityConfig securityConfig) {
                this.securityConfig = securityConfig;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * workFlows.
             */
            public Builder workFlows(java.util.List<WorkFlows> workFlows) {
                this.workFlows = workFlows;
                return this;
            }

            public ApplicationConfig build() {
                return new ApplicationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPulishAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPulishAgentRequest</p>
     */
    public static class SampleLibrary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableSample")
        private Boolean enableSample;

        @com.aliyun.core.annotation.NameInMap("sampleLibraryIdList")
        private java.util.List<String> sampleLibraryIdList;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        private SampleLibrary(Builder builder) {
            this.enableSample = builder.enableSample;
            this.sampleLibraryIdList = builder.sampleLibraryIdList;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SampleLibrary create() {
            return builder().build();
        }

        /**
         * @return enableSample
         */
        public Boolean getEnableSample() {
            return this.enableSample;
        }

        /**
         * @return sampleLibraryIdList
         */
        public java.util.List<String> getSampleLibraryIdList() {
            return this.sampleLibraryIdList;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private Boolean enableSample; 
            private java.util.List<String> sampleLibraryIdList; 
            private Integer topK; 

            /**
             * enableSample.
             */
            public Builder enableSample(Boolean enableSample) {
                this.enableSample = enableSample;
                return this;
            }

            /**
             * sampleLibraryIdList.
             */
            public Builder sampleLibraryIdList(java.util.List<String> sampleLibraryIdList) {
                this.sampleLibraryIdList = sampleLibraryIdList;
                return this;
            }

            /**
             * topK.
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public SampleLibrary build() {
                return new SampleLibrary(this);
            } 

        } 

    }
}
