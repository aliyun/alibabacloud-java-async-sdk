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
 * {@link FeedbackRequest} extends {@link RequestModel}
 *
 * <p>FeedbackRequest</p>
 */
public class FeedbackRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeedbackContent")
    private String feedbackContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private FeedbackRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.feedback = builder.feedback;
        this.feedbackContent = builder.feedbackContent;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return feedbackContent
     */
    public String getFeedbackContent() {
        return this.feedbackContent;
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
        private String regionId; 
        private String agentKey; 
        private String feedback; 
        private String feedbackContent; 
        private String instanceId; 
        private String messageId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.feedback = request.feedback;
            this.feedbackContent = request.feedbackContent;
            this.instanceId = request.instanceId;
            this.messageId = request.messageId;
            this.sessionId = request.sessionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The feedback type, which corresponds to the FeedbackType field in the session history API.</p>
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
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>The content of the like or dislike feedback. You can directly enter the feedback content or pass in a JSON string as shown in the example. The content field corresponds to FeedbackUserInfo in the session history, and feedbackLabels corresponds to FeedbackLabels in the session history.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;content&quot;: &quot;I think this answer is incorrect. It should be based on facts.&quot;,
         *     &quot;feedbackLabels&quot;: [
         *         &quot;Contains factual errors&quot;
         *     ]
         * }</p>
         */
        public Builder feedbackContent(String feedbackContent) {
            this.putQueryParameter("FeedbackContent", feedbackContent);
            this.feedbackContent = feedbackContent;
            return this;
        }

        /**
         * <p>The unique identifier of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-mp90s2lrk00050</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID that uniquely identifies a single message in a session window.</p>
         * 
         * <strong>example:</strong>
         * <p>5ca40988-4f99-47ad-ac96-9060d0f81db9</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The session ID that uniquely identifies an IM session.</p>
         * 
         * <strong>example:</strong>
         * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
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
