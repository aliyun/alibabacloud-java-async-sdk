// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Feedback")
    private String feedback;

    @Query
    @NameInMap("FeedbackContent")
    private String feedbackContent;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MessageId")
    private String messageId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    private FeedbackRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.feedback = builder.feedback;
        this.feedbackContent = builder.feedbackContent;
        this.instanceId = builder.instanceId;
        this.messageId = builder.messageId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<FeedbackRequest, Builder> {
        private String agentKey; 
        private String feedback; 
        private String feedbackContent; 
        private String instanceId; 
        private String messageId; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.feedback = request.feedback;
            this.feedbackContent = request.feedbackContent;
            this.instanceId = request.instanceId;
            this.messageId = request.messageId;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ????????????key,???????????????????????????????????????key???????????????????????????????????????
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * good-?????????bad-??????
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder feedbackContent(String feedbackContent) {
            this.putQueryParameter("FeedbackContent", feedbackContent);
            this.feedbackContent = feedbackContent;
            return this;
        }

        /**
         * ?????????ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
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
         * ??????Session??????????????????IM??????????????????
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
