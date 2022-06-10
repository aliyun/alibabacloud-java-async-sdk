// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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

    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("RequestId")
    private String requestId;

    private FeedbackResponseBody(Builder builder) {
        this.feedback = builder.feedback;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private String feedback; 
        private String messageId; 
        private String requestId; 

        /**
         * good-点赞、bad-点踩
         */
        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        /**
         * 会话窗单次会话标识
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * 请求id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FeedbackResponseBody build() {
            return new FeedbackResponseBody(this);
        } 

    } 

}
