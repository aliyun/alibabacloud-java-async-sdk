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
 * {@link ListMmAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmAppResponseBody</p>
 */
public class ListMmAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfoList")
    private java.util.List<AppInfoList> appInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMmAppResponseBody(Builder builder) {
        this.appInfoList = builder.appInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInfoList
     */
    public java.util.List<AppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AppInfoList> appInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMmAppResponseBody model) {
            this.appInfoList = model.appInfoList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AppInfoList.
         */
        public Builder appInfoList(java.util.List<AppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMmAppResponseBody build() {
            return new ListMmAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmAppResponseBody</p>
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
     * {@link ListMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmAppResponseBody</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryLimit")
        private String historyLimit;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("OpenWebSearch")
        private Boolean openWebSearch;

        @com.aliyun.core.annotation.NameInMap("TextModal")
        private String textModal;

        private ModelConfig(Builder builder) {
            this.historyLimit = builder.historyLimit;
            this.modelType = builder.modelType;
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
        public String getHistoryLimit() {
            return this.historyLimit;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
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
            private String historyLimit; 
            private String modelType; 
            private Boolean openWebSearch; 
            private String textModal; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.historyLimit = model.historyLimit;
                this.modelType = model.modelType;
                this.openWebSearch = model.openWebSearch;
                this.textModal = model.textModal;
            } 

            /**
             * HistoryLimit.
             */
            public Builder historyLimit(String historyLimit) {
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
    /**
     * 
     * {@link ListMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmAppResponseBody</p>
     */
    public static class AppInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private AppInfoList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
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
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfoList create() {
            return builder().build();
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
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
            private Integer status; 

            private Builder() {
            } 

            private Builder(AppInfoList model) {
                this.appId = model.appId;
                this.appName = model.appName;
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
                this.status = model.status;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public AppInfoList build() {
                return new AppInfoList(this);
            } 

        } 

    }
}
