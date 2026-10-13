// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link FeedbackResponseBody} extends {@link TeaModel}
 *
 * <p>FeedbackResponseBody</p>
 */
public class FeedbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(FeedbackResponseBody model) {
            this.feedback = model.feedback;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The feedback type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>good: Like.</li>
         * <li>bad: Dislike.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>good</p>
         */
        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>The ID that uniquely identifies a single message in a session window.</p>
         * 
         * <strong>example:</strong>
         * <p>5ca40988-4f99-47ad-ac96-9060d0f81db9</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4e5eea71-f326-450c-8849-49515473ef64</p>
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
