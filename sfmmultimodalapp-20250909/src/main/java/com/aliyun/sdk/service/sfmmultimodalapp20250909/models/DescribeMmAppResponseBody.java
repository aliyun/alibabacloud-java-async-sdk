// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMmAppResponseBody</p>
 */
public class DescribeMmAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private AppConfig appConfig;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("BindingConfig")
    private BindingConfig bindingConfig;

    @com.aliyun.core.annotation.NameInMap("ConversationConfig")
    private ConversationConfig conversationConfig;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private String createUserId;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.NameInMap("ModifyUserId")
    private String modifyUserId;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("PublishVersion")
    private Long publishVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeMmAppResponseBody(Builder builder) {
        this.appConfig = builder.appConfig;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.bindingConfig = builder.bindingConfig;
        this.conversationConfig = builder.conversationConfig;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.modelConfig = builder.modelConfig;
        this.modifyUserId = builder.modifyUserId;
        this.modifyUserName = builder.modifyUserName;
        this.prompt = builder.prompt;
        this.publishVersion = builder.publishVersion;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMmAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appConfig
     */
    public AppConfig getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bindingConfig
     */
    public BindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    /**
     * @return conversationConfig
     */
    public ConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return modelConfig
     */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    /**
     * @return modifyUserId
     */
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return publishVersion
     */
    public Long getPublishVersion() {
        return this.publishVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private AppConfig appConfig; 
        private String appId; 
        private String appName; 
        private BindingConfig bindingConfig; 
        private ConversationConfig conversationConfig; 
        private String createUserId; 
        private String createUserName; 
        private String gmtCreate; 
        private String gmtModified; 
        private ModelConfig modelConfig; 
        private String modifyUserId; 
        private String modifyUserName; 
        private String prompt; 
        private Long publishVersion; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeMmAppResponseBody model) {
            this.appConfig = model.appConfig;
            this.appId = model.appId;
            this.appName = model.appName;
            this.bindingConfig = model.bindingConfig;
            this.conversationConfig = model.conversationConfig;
            this.createUserId = model.createUserId;
            this.createUserName = model.createUserName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.modelConfig = model.modelConfig;
            this.modifyUserId = model.modifyUserId;
            this.modifyUserName = model.modifyUserName;
            this.prompt = model.prompt;
            this.publishVersion = model.publishVersion;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * AppConfig.
         */
        public Builder appConfig(AppConfig appConfig) {
            this.appConfig = appConfig;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * BindingConfig.
         */
        public Builder bindingConfig(BindingConfig bindingConfig) {
            this.bindingConfig = bindingConfig;
            return this;
        }

        /**
         * ConversationConfig.
         */
        public Builder conversationConfig(ConversationConfig conversationConfig) {
            this.conversationConfig = conversationConfig;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * ModelConfig.
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * ModifyUserId.
         */
        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
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
         * PublishVersion.
         */
        public Builder publishVersion(Long publishVersion) {
            this.publishVersion = publishVersion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeMmAppResponseBody build() {
            return new DescribeMmAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class AppConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTransition")
        private Boolean enableTransition;

        private AppConfig(Builder builder) {
            this.enableTransition = builder.enableTransition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppConfig create() {
            return builder().build();
        }

        /**
         * @return enableTransition
         */
        public Boolean getEnableTransition() {
            return this.enableTransition;
        }

        public static final class Builder {
            private Boolean enableTransition; 

            private Builder() {
            } 

            private Builder(AppConfig model) {
                this.enableTransition = model.enableTransition;
            } 

            /**
             * EnableTransition.
             */
            public Builder enableTransition(Boolean enableTransition) {
                this.enableTransition = enableTransition;
                return this;
            }

            public AppConfig build() {
                return new AppConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCode")
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<String> tools;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commands(Builder builder) {
            this.domainCode = builder.domainCode;
            this.tools = builder.tools;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return domainCode
         */
        public String getDomainCode() {
            return this.domainCode;
        }

        /**
         * @return tools
         */
        public java.util.List<String> getTools() {
            return this.tools;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainCode; 
            private java.util.List<String> tools; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.domainCode = model.domainCode;
                this.tools = model.tools;
                this.type = model.type;
            } 

            /**
             * DomainCode.
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<String> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class Mcps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ToolList")
        private java.util.List<String> toolList;

        private Mcps(Builder builder) {
            this.code = builder.code;
            this.toolList = builder.toolList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mcps create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return toolList
         */
        public java.util.List<String> getToolList() {
            return this.toolList;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<String> toolList; 

            private Builder() {
            } 

            private Builder(Mcps model) {
                this.code = model.code;
                this.toolList = model.toolList;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ToolList.
             */
            public Builder toolList(java.util.List<String> toolList) {
                this.toolList = toolList;
                return this;
            }

            public Mcps build() {
                return new Mcps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private String enableSearch;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseCodeList")
        private java.util.List<String> knowledgeBaseCodeList;

        @com.aliyun.core.annotation.NameInMap("PromptStrategy")
        private String promptStrategy;

        @com.aliyun.core.annotation.NameInMap("RankWeights")
        private java.util.Map<String, Double> rankWeights;

        @com.aliyun.core.annotation.NameInMap("RetrieveMaxLength")
        private Integer retrieveMaxLength;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Integer topK;

        private RagConfig(Builder builder) {
            this.enableSearch = builder.enableSearch;
            this.knowledgeBaseCodeList = builder.knowledgeBaseCodeList;
            this.promptStrategy = builder.promptStrategy;
            this.rankWeights = builder.rankWeights;
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
         * @return enableSearch
         */
        public String getEnableSearch() {
            return this.enableSearch;
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
         * @return rankWeights
         */
        public java.util.Map<String, Double> getRankWeights() {
            return this.rankWeights;
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
            private String enableSearch; 
            private java.util.List<String> knowledgeBaseCodeList; 
            private String promptStrategy; 
            private java.util.Map<String, Double> rankWeights; 
            private Integer retrieveMaxLength; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(RagConfig model) {
                this.enableSearch = model.enableSearch;
                this.knowledgeBaseCodeList = model.knowledgeBaseCodeList;
                this.promptStrategy = model.promptStrategy;
                this.rankWeights = model.rankWeights;
                this.retrieveMaxLength = model.retrieveMaxLength;
                this.topK = model.topK;
            } 

            /**
             * EnableSearch.
             */
            public Builder enableSearch(String enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * KnowledgeBaseCodeList.
             */
            public Builder knowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
                this.knowledgeBaseCodeList = knowledgeBaseCodeList;
                return this;
            }

            /**
             * PromptStrategy.
             */
            public Builder promptStrategy(String promptStrategy) {
                this.promptStrategy = promptStrategy;
                return this;
            }

            /**
             * RankWeights.
             */
            public Builder rankWeights(java.util.Map<String, Double> rankWeights) {
                this.rankWeights = rankWeights;
                return this;
            }

            /**
             * RetrieveMaxLength.
             */
            public Builder retrieveMaxLength(Integer retrieveMaxLength) {
                this.retrieveMaxLength = retrieveMaxLength;
                return this;
            }

            /**
             * TopK.
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
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class BindingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<Commands> commands;

        @com.aliyun.core.annotation.NameInMap("Mcps")
        private java.util.List<Mcps> mcps;

        @com.aliyun.core.annotation.NameInMap("RagConfig")
        private RagConfig ragConfig;

        private BindingConfig(Builder builder) {
            this.commands = builder.commands;
            this.mcps = builder.mcps;
            this.ragConfig = builder.ragConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingConfig create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List<Commands> getCommands() {
            return this.commands;
        }

        /**
         * @return mcps
         */
        public java.util.List<Mcps> getMcps() {
            return this.mcps;
        }

        /**
         * @return ragConfig
         */
        public RagConfig getRagConfig() {
            return this.ragConfig;
        }

        public static final class Builder {
            private java.util.List<Commands> commands; 
            private java.util.List<Mcps> mcps; 
            private RagConfig ragConfig; 

            private Builder() {
            } 

            private Builder(BindingConfig model) {
                this.commands = model.commands;
                this.mcps = model.mcps;
                this.ragConfig = model.ragConfig;
            } 

            /**
             * Commands.
             */
            public Builder commands(java.util.List<Commands> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Mcps.
             */
            public Builder mcps(java.util.List<Mcps> mcps) {
                this.mcps = mcps;
                return this;
            }

            /**
             * RagConfig.
             */
            public Builder ragConfig(RagConfig ragConfig) {
                this.ragConfig = ragConfig;
                return this;
            }

            public BindingConfig build() {
                return new BindingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class ConversationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrModel")
        private String asrModel;

        @com.aliyun.core.annotation.NameInMap("OpenAsr")
        private Boolean openAsr;

        @com.aliyun.core.annotation.NameInMap("OpenTts")
        private Boolean openTts;

        @com.aliyun.core.annotation.NameInMap("TtsModel")
        private String ttsModel;

        private ConversationConfig(Builder builder) {
            this.asrModel = builder.asrModel;
            this.openAsr = builder.openAsr;
            this.openTts = builder.openTts;
            this.ttsModel = builder.ttsModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationConfig create() {
            return builder().build();
        }

        /**
         * @return asrModel
         */
        public String getAsrModel() {
            return this.asrModel;
        }

        /**
         * @return openAsr
         */
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        /**
         * @return openTts
         */
        public Boolean getOpenTts() {
            return this.openTts;
        }

        /**
         * @return ttsModel
         */
        public String getTtsModel() {
            return this.ttsModel;
        }

        public static final class Builder {
            private String asrModel; 
            private Boolean openAsr; 
            private Boolean openTts; 
            private String ttsModel; 

            private Builder() {
            } 

            private Builder(ConversationConfig model) {
                this.asrModel = model.asrModel;
                this.openAsr = model.openAsr;
                this.openTts = model.openTts;
                this.ttsModel = model.ttsModel;
            } 

            /**
             * AsrModel.
             */
            public Builder asrModel(String asrModel) {
                this.asrModel = asrModel;
                return this;
            }

            /**
             * OpenAsr.
             */
            public Builder openAsr(Boolean openAsr) {
                this.openAsr = openAsr;
                return this;
            }

            /**
             * OpenTts.
             */
            public Builder openTts(Boolean openTts) {
                this.openTts = openTts;
                return this;
            }

            /**
             * TtsModel.
             */
            public Builder ttsModel(String ttsModel) {
                this.ttsModel = ttsModel;
                return this;
            }

            public ConversationConfig build() {
                return new ConversationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMmAppResponseBody</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryLimit")
        private Integer historyLimit;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("OpenMemory")
        private Boolean openMemory;

        @com.aliyun.core.annotation.NameInMap("OpenWebSearch")
        private Boolean openWebSearch;

        @com.aliyun.core.annotation.NameInMap("TextModal")
        private String textModal;

        private ModelConfig(Builder builder) {
            this.historyLimit = builder.historyLimit;
            this.modelType = builder.modelType;
            this.openMemory = builder.openMemory;
            this.openWebSearch = builder.openWebSearch;
            this.textModal = builder.textModal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelConfig create() {
            return builder().build();
        }

        /**
         * @return historyLimit
         */
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return openMemory
         */
        public Boolean getOpenMemory() {
            return this.openMemory;
        }

        /**
         * @return openWebSearch
         */
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        /**
         * @return textModal
         */
        public String getTextModal() {
            return this.textModal;
        }

        public static final class Builder {
            private Integer historyLimit; 
            private String modelType; 
            private Boolean openMemory; 
            private Boolean openWebSearch; 
            private String textModal; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.historyLimit = model.historyLimit;
                this.modelType = model.modelType;
                this.openMemory = model.openMemory;
                this.openWebSearch = model.openWebSearch;
                this.textModal = model.textModal;
            } 

            /**
             * HistoryLimit.
             */
            public Builder historyLimit(Integer historyLimit) {
                this.historyLimit = historyLimit;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * OpenMemory.
             */
            public Builder openMemory(Boolean openMemory) {
                this.openMemory = openMemory;
                return this;
            }

            /**
             * OpenWebSearch.
             */
            public Builder openWebSearch(Boolean openWebSearch) {
                this.openWebSearch = openWebSearch;
                return this;
            }

            /**
             * TextModal.
             */
            public Builder textModal(String textModal) {
                this.textModal = textModal;
                return this;
            }

            public ModelConfig build() {
                return new ModelConfig(this);
            } 

        } 

    }
}
