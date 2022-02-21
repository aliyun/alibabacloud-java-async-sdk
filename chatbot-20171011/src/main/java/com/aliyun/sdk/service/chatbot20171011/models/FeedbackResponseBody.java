// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeedbackResponseBody} extends {@link TeaModel}
 *
 * <p>FeedbackResponseBody</p>
 */
public class FeedbackResponseBody extends TeaModel {
    @NameInMap("Feedback")
    private String feedback;

    @NameInMap("HttpStatus")
    private Long httpStatus;

    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private FeedbackResponseBody(Builder builder) {
        this.feedback = builder.feedback;
        this.httpStatus = builder.httpStatus;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return httpStatus
     */
    public Long getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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
        private String feedback; 
        private Long httpStatus; 
        private String messageId; 
        private String requestId; 
        private Boolean success; 

        /**
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        /**
         * HttpStatus.
         */
        public Builder httpStatus(Long httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
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

        public FeedbackResponseBody build() {
            return new FeedbackResponseBody(this);
        } 

    } 

}
