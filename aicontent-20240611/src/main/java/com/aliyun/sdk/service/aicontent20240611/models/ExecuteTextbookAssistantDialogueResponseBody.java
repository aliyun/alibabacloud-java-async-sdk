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
 * {@link ExecuteTextbookAssistantDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTextbookAssistantDialogueResponseBody</p>
 */
public class ExecuteTextbookAssistantDialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ExecuteTextbookAssistantDialogueResponseBody(Builder builder) {
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

    public static ExecuteTextbookAssistantDialogueResponseBody create() {
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
    public String getHttpStatusCode() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ExecuteTextbookAssistantDialogueResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DBFA232A-1176-50E6-95AE-50F7A62A28AD</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ExecuteTextbookAssistantDialogueResponseBody build() {
            return new ExecuteTextbookAssistantDialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteTextbookAssistantDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantDialogueResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chineseResult")
        private String chineseResult;

        @com.aliyun.core.annotation.NameInMap("englishResult")
        private String englishResult;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("isTaskCompleted")
        private Boolean isTaskCompleted;

        private Result(Builder builder) {
            this.chineseResult = builder.chineseResult;
            this.englishResult = builder.englishResult;
            this.isFinish = builder.isFinish;
            this.isTaskCompleted = builder.isTaskCompleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return isTaskCompleted
         */
        public Boolean getIsTaskCompleted() {
            return this.isTaskCompleted;
        }

        public static final class Builder {
            private String chineseResult; 
            private String englishResult; 
            private Boolean isFinish; 
            private Boolean isTaskCompleted; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.chineseResult = model.chineseResult;
                this.englishResult = model.englishResult;
                this.isFinish = model.isFinish;
                this.isTaskCompleted = model.isTaskCompleted;
            } 

            /**
             * <p>The Textbook Assistant\&quot;s reply in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>让我们再看一遍课文。迈克说: “我是迈克·布莱克。”你能试着像迈克那样说吗？</p>
             */
            public Builder chineseResult(String chineseResult) {
                this.chineseResult = chineseResult;
                return this;
            }

            /**
             * <p>The Textbook Assistant\&quot;s reply in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Let\&quot;s look at the text again. Mike says, \&quot;I\&quot;m Mike Black.\&quot; Can you try saying it like Mike?</p>
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
             * <p>Indicates whether the task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTaskCompleted(Boolean isTaskCompleted) {
                this.isTaskCompleted = isTaskCompleted;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteTextbookAssistantDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantDialogueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistant")
        private String assistant;

        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("user")
        private String user;

        private Data(Builder builder) {
            this.assistant = builder.assistant;
            this.chatId = builder.chatId;
            this.result = builder.result;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assistant
         */
        public String getAssistant() {
            return this.assistant;
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String assistant; 
            private String chatId; 
            private Result result; 
            private String user; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assistant = model.assistant;
                this.chatId = model.chatId;
                this.result = model.result;
                this.user = model.user;
            } 

            /**
             * <p>The ID of the Textbook Assistant\&quot;s message.</p>
             * 
             * <strong>example:</strong>
             * <p>6788f4935bdfc807f077a984</p>
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
                return this;
            }

            /**
             * <p>The chat ID for this turn.</p>
             * 
             * <strong>example:</strong>
             * <p>6788e0b475a4631ffc626722</p>
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ID of the user\&quot;s reply.</p>
             * 
             * <strong>example:</strong>
             * <p>6788f4905bdfc807f077a982</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
