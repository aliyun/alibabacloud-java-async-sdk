// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DialogueResponseBody} extends {@link TeaModel}
 *
 * <p>DialogueResponseBody</p>
 */
public class DialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Feedback")
    private Feedback feedback;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DialogueResponseBody(Builder builder) {
        this.code = builder.code;
        this.feedback = builder.feedback;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogueResponseBody create() {
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
     * @return feedback
     */
    public Feedback getFeedback() {
        return this.feedback;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Feedback feedback; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DialogueResponseBody model) {
            this.code = model.code;
            this.feedback = model.feedback;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Feedback.
         */
        public Builder feedback(Feedback feedback) {
            this.feedback = feedback;
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

        public DialogueResponseBody build() {
            return new DialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DialogueResponseBody} extends {@link TeaModel}
     *
     * <p>DialogueResponseBody</p>
     */
    public static class Feedback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionParams")
        private String actionParams;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentParams")
        private String contentParams;

        @com.aliyun.core.annotation.NameInMap("Interruptible")
        private Boolean interruptible;

        private Feedback(Builder builder) {
            this.action = builder.action;
            this.actionParams = builder.actionParams;
            this.content = builder.content;
            this.contentParams = builder.contentParams;
            this.interruptible = builder.interruptible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feedback create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionParams
         */
        public String getActionParams() {
            return this.actionParams;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentParams
         */
        public String getContentParams() {
            return this.contentParams;
        }

        /**
         * @return interruptible
         */
        public Boolean getInterruptible() {
            return this.interruptible;
        }

        public static final class Builder {
            private String action; 
            private String actionParams; 
            private String content; 
            private String contentParams; 
            private Boolean interruptible; 

            private Builder() {
            } 

            private Builder(Feedback model) {
                this.action = model.action;
                this.actionParams = model.actionParams;
                this.content = model.content;
                this.contentParams = model.contentParams;
                this.interruptible = model.interruptible;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionParams.
             */
            public Builder actionParams(String actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>已废弃</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder contentParams(String contentParams) {
                this.contentParams = contentParams;
                return this;
            }

            /**
             * Interruptible.
             */
            public Builder interruptible(Boolean interruptible) {
                this.interruptible = interruptible;
                return this;
            }

            public Feedback build() {
                return new Feedback(this);
            } 

        } 

    }
}
