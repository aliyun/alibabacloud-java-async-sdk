// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeedbackRequest} extends {@link RequestModel}
 *
 * <p>FeedbackRequest</p>
 */
public class FeedbackRequest extends Request {
    @Query
    @NameInMap("Feedback")
    @Validation(required = true)
    private String feedback;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    private FeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.instanceId = builder.instanceId;
        this.messageId = builder.messageId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackRequest create() {
        return builder().build();
    }

    @Override
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<FeedbackRequest, Builder> {
        private String feedback; 
        private String instanceId; 
        private String messageId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackRequest response) {
            super(response);
            this.feedback = response.feedback;
            this.instanceId = response.instanceId;
            this.messageId = response.messageId;
            this.sessionId = response.sessionId;
        } 

        /**
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public FeedbackRequest build() {
            return new FeedbackRequest(this);
        } 

    } 

}
