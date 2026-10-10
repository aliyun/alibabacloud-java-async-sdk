// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherExpansionDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteAITeacherExpansionDialogueResponseBody</p>
 */
public class ExecuteAITeacherExpansionDialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ExecuteAITeacherExpansionDialogueResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherExpansionDialogueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteAITeacherExpansionDialogueResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>A unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecuteAITeacherExpansionDialogueResponseBody build() {
            return new ExecuteAITeacherExpansionDialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAITeacherExpansionDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherExpansionDialogueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chineseResult")
        private String chineseResult;

        @com.aliyun.core.annotation.NameInMap("englishResult")
        private String englishResult;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("isOffTopicControl")
        private Boolean isOffTopicControl;

        @com.aliyun.core.annotation.NameInMap("isOnTopic")
        private Boolean isOnTopic;

        @com.aliyun.core.annotation.NameInMap("questionIndex")
        private Integer questionIndex;

        private Data(Builder builder) {
            this.chineseResult = builder.chineseResult;
            this.englishResult = builder.englishResult;
            this.isFinish = builder.isFinish;
            this.isOffTopicControl = builder.isOffTopicControl;
            this.isOnTopic = builder.isOnTopic;
            this.questionIndex = builder.questionIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chineseResult
         */
        public String getChineseResult() {
            return this.chineseResult;
        }

        /**
         * @return englishResult
         */
        public String getEnglishResult() {
            return this.englishResult;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return isOffTopicControl
         */
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        /**
         * @return isOnTopic
         */
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        /**
         * @return questionIndex
         */
        public Integer getQuestionIndex() {
            return this.questionIndex;
        }

        public static final class Builder {
            private String chineseResult; 
            private String englishResult; 
            private Boolean isFinish; 
            private Boolean isOffTopicControl; 
            private Boolean isOnTopic; 
            private Integer questionIndex; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chineseResult = model.chineseResult;
                this.englishResult = model.englishResult;
                this.isFinish = model.isFinish;
                this.isOffTopicControl = model.isOffTopicControl;
                this.isOnTopic = model.isOnTopic;
                this.questionIndex = model.questionIndex;
            } 

            /**
             * <p>The AI teacher\&quot;s response in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chineseResult(String chineseResult) {
                this.chineseResult = chineseResult;
                return this;
            }

            /**
             * <p>The AI teacher\&quot;s response in English.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder englishResult(String englishResult) {
                this.englishResult = englishResult;
                return this;
            }

            /**
             * <p>Indicates whether the dialogue is finished.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>Indicates whether the response is off-topic.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOffTopicControl(Boolean isOffTopicControl) {
                this.isOffTopicControl = isOffTopicControl;
                return this;
            }

            /**
             * <p>Indicates whether the response is on-topic.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOnTopic(Boolean isOnTopic) {
                this.isOnTopic = isOnTopic;
                return this;
            }

            /**
             * <p>The index of the current question.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder questionIndex(Integer questionIndex) {
                this.questionIndex = questionIndex;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
