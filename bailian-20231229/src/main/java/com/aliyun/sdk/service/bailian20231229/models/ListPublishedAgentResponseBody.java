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
 * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedAgentResponseBody</p>
 */
public class ListPublishedAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ListPublishedAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAgentResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListPublishedAgentResponseBody build() {
            return new ListPublishedAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableCitation")
        private Boolean enableCitation;

        @com.aliyun.core.annotation.NameInMap("enableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseCodeList")
        private java.util.List<String> knowledgeBaseCodeList;

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
        public java.util.List<String> getKnowledgeBaseCodeList() {
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
            private java.util.List<String> knowledgeBaseCodeList; 
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
            public Builder knowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
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
    /**
     * 
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
     */
    public static class Security extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("processingStrategy")
        private String processingStrategy;

        private Security(Builder builder) {
            this.processingStrategy = builder.processingStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Security create() {
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

            public Security build() {
                return new Security(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("security")
        private Security security;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("workFlows")
        private java.util.List<WorkFlows> workFlows;

        private ApplicationConfig(Builder builder) {
            this.historyConfig = builder.historyConfig;
            this.longTermMemory = builder.longTermMemory;
            this.parameters = builder.parameters;
            this.ragConfig = builder.ragConfig;
            this.security = builder.security;
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
         * @return security
         */
        public Security getSecurity() {
            return this.security;
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
            private Security security; 
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
             * security.
             */
            public Builder security(Security security) {
                this.security = security;
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
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationConfig")
        private ApplicationConfig applicationConfig;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("instructions")
        private String instructions;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private List(Builder builder) {
            this.applicationConfig = builder.applicationConfig;
            this.code = builder.code;
            this.instructions = builder.instructions;
            this.modelId = builder.modelId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return applicationConfig
         */
        public ApplicationConfig getApplicationConfig() {
            return this.applicationConfig;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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

        public static final class Builder {
            private ApplicationConfig applicationConfig; 
            private String code; 
            private String instructions; 
            private String modelId; 
            private String name; 

            /**
             * applicationConfig.
             */
            public Builder applicationConfig(ApplicationConfig applicationConfig) {
                this.applicationConfig = applicationConfig;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * instructions.
             */
            public Builder instructions(String instructions) {
                this.instructions = instructions;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
