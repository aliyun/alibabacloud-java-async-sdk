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
    public static class Data extends TeaModel {
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
