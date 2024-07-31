// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private CreateAndPulishAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.applicationConfig = builder.applicationConfig;
        this.instructions = builder.instructions;
        this.modelId = builder.modelId;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<CreateAndPulishAgentRequest, Builder> {
        private String workspaceId; 
        private ApplicationConfig applicationConfig; 
        private String instructions; 
        private String modelId; 
        private String name; 

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

        @Override
        public CreateAndPulishAgentRequest build() {
            return new CreateAndPulishAgentRequest(this);
        } 

    } 

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
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableCitation")
        private Boolean enableCitation;

        @com.aliyun.core.annotation.NameInMap("enableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseCodeList")
        private java.util.List < String > knowledgeBaseCodeList;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        private RagConfig(Builder builder) {
            this.enableCitation = builder.enableCitation;
            this.enableSearch = builder.enableSearch;
            this.knowledgeBaseCodeList = builder.knowledgeBaseCodeList;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
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
         * @return knowledgeBaseCodeList
         */
        public java.util.List < String > getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private Boolean enableCitation; 
            private Boolean enableSearch; 
            private java.util.List < String > knowledgeBaseCodeList; 
            private Integer topK; 

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
             * knowledgeBaseCodeList.
             */
            public Builder knowledgeBaseCodeList(java.util.List < String > knowledgeBaseCodeList) {
                this.knowledgeBaseCodeList = knowledgeBaseCodeList;
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
        private java.util.List < Tools> tools;

        @com.aliyun.core.annotation.NameInMap("workFlows")
        private java.util.List < WorkFlows> workFlows;

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
        public java.util.List < Tools> getTools() {
            return this.tools;
        }

        /**
         * @return workFlows
         */
        public java.util.List < WorkFlows> getWorkFlows() {
            return this.workFlows;
        }

        public static final class Builder {
            private HistoryConfig historyConfig; 
            private LongTermMemory longTermMemory; 
            private Parameters parameters; 
            private RagConfig ragConfig; 
            private SecurityConfig securityConfig; 
            private java.util.List < Tools> tools; 
            private java.util.List < WorkFlows> workFlows; 

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
            public Builder tools(java.util.List < Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * workFlows.
             */
            public Builder workFlows(java.util.List < WorkFlows> workFlows) {
                this.workFlows = workFlows;
                return this;
            }

            public ApplicationConfig build() {
                return new ApplicationConfig(this);
            } 

        } 

    }
}
