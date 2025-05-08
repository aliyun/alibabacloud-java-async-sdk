// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListSearchTaskDialoguesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchTaskDialoguesResponseBody</p>
 */
public class ListSearchTaskDialoguesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSearchTaskDialoguesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchTaskDialoguesResponseBody create() {
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
    public java.util.List<Data> getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSearchTaskDialoguesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
        public Builder data(java.util.List<Data> data) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSearchTaskDialoguesResponseBody build() {
            return new ListSearchTaskDialoguesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchTaskDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialoguesResponseBody</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchTaskDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialoguesResponseBody</p>
     */
    public static class SearchParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("MultimodalSearchTypes")
        private java.util.List<String> multimodalSearchTypes;

        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<SearchSources> searchSources;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private SearchParam(Builder builder) {
            this.endTime = builder.endTime;
            this.multimodalSearchTypes = builder.multimodalSearchTypes;
            this.searchSources = builder.searchSources;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchParam create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return multimodalSearchTypes
         */
        public java.util.List<String> getMultimodalSearchTypes() {
            return this.multimodalSearchTypes;
        }

        /**
         * @return searchSources
         */
        public java.util.List<SearchSources> getSearchSources() {
            return this.searchSources;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private java.util.List<String> multimodalSearchTypes; 
            private java.util.List<SearchSources> searchSources; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(SearchParam model) {
                this.endTime = model.endTime;
                this.multimodalSearchTypes = model.multimodalSearchTypes;
                this.searchSources = model.searchSources;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MultimodalSearchTypes.
             */
            public Builder multimodalSearchTypes(java.util.List<String> multimodalSearchTypes) {
                this.multimodalSearchTypes = multimodalSearchTypes;
                return this;
            }

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<SearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public SearchParam build() {
                return new SearchParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchTaskDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialoguesResponseBody</p>
     */
    public static class ChatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialogueType")
        private Integer dialogueType;

        @com.aliyun.core.annotation.NameInMap("EndToEnd")
        private Boolean endToEnd;

        @com.aliyun.core.annotation.NameInMap("GenerateLevel")
        private String generateLevel;

        @com.aliyun.core.annotation.NameInMap("GenerateTechnology")
        private String generateTechnology;

        @com.aliyun.core.annotation.NameInMap("SearchModels")
        private java.util.List<String> searchModels;

        @com.aliyun.core.annotation.NameInMap("SearchParam")
        private SearchParam searchParam;

        private ChatConfig(Builder builder) {
            this.dialogueType = builder.dialogueType;
            this.endToEnd = builder.endToEnd;
            this.generateLevel = builder.generateLevel;
            this.generateTechnology = builder.generateTechnology;
            this.searchModels = builder.searchModels;
            this.searchParam = builder.searchParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfig create() {
            return builder().build();
        }

        /**
         * @return dialogueType
         */
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        /**
         * @return endToEnd
         */
        public Boolean getEndToEnd() {
            return this.endToEnd;
        }

        /**
         * @return generateLevel
         */
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        /**
         * @return generateTechnology
         */
        public String getGenerateTechnology() {
            return this.generateTechnology;
        }

        /**
         * @return searchModels
         */
        public java.util.List<String> getSearchModels() {
            return this.searchModels;
        }

        /**
         * @return searchParam
         */
        public SearchParam getSearchParam() {
            return this.searchParam;
        }

        public static final class Builder {
            private Integer dialogueType; 
            private Boolean endToEnd; 
            private String generateLevel; 
            private String generateTechnology; 
            private java.util.List<String> searchModels; 
            private SearchParam searchParam; 

            private Builder() {
            } 

            private Builder(ChatConfig model) {
                this.dialogueType = model.dialogueType;
                this.endToEnd = model.endToEnd;
                this.generateLevel = model.generateLevel;
                this.generateTechnology = model.generateTechnology;
                this.searchModels = model.searchModels;
                this.searchParam = model.searchParam;
            } 

            /**
             * DialogueType.
             */
            public Builder dialogueType(Integer dialogueType) {
                this.dialogueType = dialogueType;
                return this;
            }

            /**
             * EndToEnd.
             */
            public Builder endToEnd(Boolean endToEnd) {
                this.endToEnd = endToEnd;
                return this;
            }

            /**
             * GenerateLevel.
             */
            public Builder generateLevel(String generateLevel) {
                this.generateLevel = generateLevel;
                return this;
            }

            /**
             * GenerateTechnology.
             */
            public Builder generateTechnology(String generateTechnology) {
                this.generateTechnology = generateTechnology;
                return this;
            }

            /**
             * SearchModels.
             */
            public Builder searchModels(java.util.List<String> searchModels) {
                this.searchModels = searchModels;
                return this;
            }

            /**
             * SearchParam.
             */
            public Builder searchParam(SearchParam searchParam) {
                this.searchParam = searchParam;
                return this;
            }

            public ChatConfig build() {
                return new ChatConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchTaskDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchTaskDialoguesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatConfig")
        private ChatConfig chatConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DialogueType")
        private Integer dialogueType;

        @com.aliyun.core.annotation.NameInMap("GoodText")
        private String goodText;

        @com.aliyun.core.annotation.NameInMap("OriginSessionId")
        private String originSessionId;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Rating")
        private String rating;

        @com.aliyun.core.annotation.NameInMap("ResponseBodyStr")
        private String responseBodyStr;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Data(Builder builder) {
            this.chatConfig = builder.chatConfig;
            this.createTime = builder.createTime;
            this.dialogueType = builder.dialogueType;
            this.goodText = builder.goodText;
            this.originSessionId = builder.originSessionId;
            this.prompt = builder.prompt;
            this.rating = builder.rating;
            this.responseBodyStr = builder.responseBodyStr;
            this.sessionId = builder.sessionId;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chatConfig
         */
        public ChatConfig getChatConfig() {
            return this.chatConfig;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dialogueType
         */
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        /**
         * @return goodText
         */
        public String getGoodText() {
            return this.goodText;
        }

        /**
         * @return originSessionId
         */
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return rating
         */
        public String getRating() {
            return this.rating;
        }

        /**
         * @return responseBodyStr
         */
        public String getResponseBodyStr() {
            return this.responseBodyStr;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private ChatConfig chatConfig; 
            private String createTime; 
            private Integer dialogueType; 
            private String goodText; 
            private String originSessionId; 
            private String prompt; 
            private String rating; 
            private String responseBodyStr; 
            private String sessionId; 
            private java.util.List<String> tags; 
            private String taskId; 
            private String text; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chatConfig = model.chatConfig;
                this.createTime = model.createTime;
                this.dialogueType = model.dialogueType;
                this.goodText = model.goodText;
                this.originSessionId = model.originSessionId;
                this.prompt = model.prompt;
                this.rating = model.rating;
                this.responseBodyStr = model.responseBodyStr;
                this.sessionId = model.sessionId;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.text = model.text;
            } 

            /**
             * ChatConfig.
             */
            public Builder chatConfig(ChatConfig chatConfig) {
                this.chatConfig = chatConfig;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DialogueType.
             */
            public Builder dialogueType(Integer dialogueType) {
                this.dialogueType = dialogueType;
                return this;
            }

            /**
             * GoodText.
             */
            public Builder goodText(String goodText) {
                this.goodText = goodText;
                return this;
            }

            /**
             * OriginSessionId.
             */
            public Builder originSessionId(String originSessionId) {
                this.originSessionId = originSessionId;
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
             * Rating.
             */
            public Builder rating(String rating) {
                this.rating = rating;
                return this;
            }

            /**
             * ResponseBodyStr.
             */
            public Builder responseBodyStr(String responseBodyStr) {
                this.responseBodyStr = responseBodyStr;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
