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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
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

            /**
             * chineseResult.
             */
            public Builder chineseResult(String chineseResult) {
                this.chineseResult = chineseResult;
                return this;
            }

            /**
             * englishResult.
             */
            public Builder englishResult(String englishResult) {
                this.englishResult = englishResult;
                return this;
            }

            /**
             * isFinish.
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * isOffTopicControl.
             */
            public Builder isOffTopicControl(Boolean isOffTopicControl) {
                this.isOffTopicControl = isOffTopicControl;
                return this;
            }

            /**
             * isOnTopic.
             */
            public Builder isOnTopic(Boolean isOnTopic) {
                this.isOnTopic = isOnTopic;
                return this;
            }

            /**
             * questionIndex.
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
