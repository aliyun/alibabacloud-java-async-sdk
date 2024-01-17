// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeedbackDialogueRequest} extends {@link RequestModel}
 *
 * <p>FeedbackDialogueRequest</p>
 */
public class FeedbackDialogueRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("CustomerResponse")
    private String customerResponse;

    @Body
    @NameInMap("GoodText")
    private String goodText;

    @Body
    @NameInMap("ModifiedResponse")
    private String modifiedResponse;

    @Body
    @NameInMap("Rating")
    private String rating;

    @Body
    @NameInMap("RatingTags")
    private java.util.List < String > ratingTags;

    @Body
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private FeedbackDialogueRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.customerResponse = builder.customerResponse;
        this.goodText = builder.goodText;
        this.modifiedResponse = builder.modifiedResponse;
        this.rating = builder.rating;
        this.ratingTags = builder.ratingTags;
        this.sessionId = builder.sessionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackDialogueRequest create() {
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
     * @return customerResponse
     */
    public String getCustomerResponse() {
        return this.customerResponse;
    }

    /**
     * @return goodText
     */
    public String getGoodText() {
        return this.goodText;
    }

    /**
     * @return modifiedResponse
     */
    public String getModifiedResponse() {
        return this.modifiedResponse;
    }

    /**
     * @return rating
     */
    public String getRating() {
        return this.rating;
    }

    /**
     * @return ratingTags
     */
    public java.util.List < String > getRatingTags() {
        return this.ratingTags;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<FeedbackDialogueRequest, Builder> {
        private String agentKey; 
        private String customerResponse; 
        private String goodText; 
        private String modifiedResponse; 
        private String rating; 
        private java.util.List < String > ratingTags; 
        private String sessionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackDialogueRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.customerResponse = request.customerResponse;
            this.goodText = request.goodText;
            this.modifiedResponse = request.modifiedResponse;
            this.rating = request.rating;
            this.ratingTags = request.ratingTags;
            this.sessionId = request.sessionId;
            this.taskId = request.taskId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * CustomerResponse.
         */
        public Builder customerResponse(String customerResponse) {
            this.putBodyParameter("CustomerResponse", customerResponse);
            this.customerResponse = customerResponse;
            return this;
        }

        /**
         * GoodText.
         */
        public Builder goodText(String goodText) {
            this.putBodyParameter("GoodText", goodText);
            this.goodText = goodText;
            return this;
        }

        /**
         * ModifiedResponse.
         */
        public Builder modifiedResponse(String modifiedResponse) {
            this.putBodyParameter("ModifiedResponse", modifiedResponse);
            this.modifiedResponse = modifiedResponse;
            return this;
        }

        /**
         * Rating.
         */
        public Builder rating(String rating) {
            this.putBodyParameter("Rating", rating);
            this.rating = rating;
            return this;
        }

        /**
         * RatingTags.
         */
        public Builder ratingTags(java.util.List < String > ratingTags) {
            String ratingTagsShrink = shrink(ratingTags, "RatingTags", "json");
            this.putBodyParameter("RatingTags", ratingTagsShrink);
            this.ratingTags = ratingTags;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public FeedbackDialogueRequest build() {
            return new FeedbackDialogueRequest(this);
        } 

    } 

}
