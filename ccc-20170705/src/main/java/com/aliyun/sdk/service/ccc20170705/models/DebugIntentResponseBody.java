// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugIntentResponseBody} extends {@link TeaModel}
 *
 * <p>DebugIntentResponseBody</p>
 */
public class DebugIntentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Feedback")
    private Feedback feedback;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DebugIntentResponseBody(Builder builder) {
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

    public static DebugIntentResponseBody create() {
        return builder().build();
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

        public DebugIntentResponseBody build() {
            return new DebugIntentResponseBody(this);
        } 

    } 

    public static class Feedback extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionParams")
        private String actionParams;

        @NameInMap("Content")
        private String content;

        private Feedback(Builder builder) {
            this.action = builder.action;
            this.actionParams = builder.actionParams;
            this.content = builder.content;
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

        public static final class Builder {
            private String action; 
            private String actionParams; 
            private String content; 

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

            public Feedback build() {
                return new Feedback(this);
            } 

        } 

    }
}
