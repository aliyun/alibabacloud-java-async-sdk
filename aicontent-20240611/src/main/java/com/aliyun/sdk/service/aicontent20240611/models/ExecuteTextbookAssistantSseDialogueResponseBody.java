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
 * {@link ExecuteTextbookAssistantSseDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTextbookAssistantSseDialogueResponseBody</p>
 */
public class ExecuteTextbookAssistantSseDialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assistant")
    private String assistant;

    @com.aliyun.core.annotation.NameInMap("chatId")
    private String chatId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("user")
    private String user;

    private ExecuteTextbookAssistantSseDialogueResponseBody(Builder builder) {
        this.assistant = builder.assistant;
        this.chatId = builder.chatId;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantSseDialogueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder {
        private String assistant; 
        private String chatId; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 
        private String user; 

        private Builder() {
        } 

        private Builder(ExecuteTextbookAssistantSseDialogueResponseBody model) {
            this.assistant = model.assistant;
            this.chatId = model.chatId;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.user = model.user;
        } 

        /**
         * assistant.
         */
        public Builder assistant(String assistant) {
            this.assistant = assistant;
            return this;
        }

        /**
         * chatId.
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
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

        /**
         * user.
         */
        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public ExecuteTextbookAssistantSseDialogueResponseBody build() {
            return new ExecuteTextbookAssistantSseDialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteTextbookAssistantSseDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantSseDialogueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("englishResult")
        private String englishResult;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        private Data(Builder builder) {
            this.englishResult = builder.englishResult;
            this.isFinish = builder.isFinish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        public static final class Builder {
            private String englishResult; 
            private Boolean isFinish; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.englishResult = model.englishResult;
                this.isFinish = model.isFinish;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
