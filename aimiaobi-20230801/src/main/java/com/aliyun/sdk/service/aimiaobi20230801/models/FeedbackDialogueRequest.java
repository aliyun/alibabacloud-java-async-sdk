// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link FeedbackDialogueRequest} extends {@link RequestModel}
 *
 * <p>FeedbackDialogueRequest</p>
 */
public class FeedbackDialogueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerResponse")
    private String customerResponse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GoodText")
    private String goodText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifiedResponse")
    private String modifiedResponse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rating")
    private String rating;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RatingTags")
    private java.util.List<String> ratingTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private FeedbackDialogueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
    public java.util.List<String> getRatingTags() {
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
        private String regionId; 
        private String agentKey; 
        private String customerResponse; 
        private String goodText; 
        private String modifiedResponse; 
        private String rating; 
        private java.util.List<String> ratingTags; 
        private String sessionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackDialogueRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fcb14f25c9ee41ccad33a049de8f941b_p_outbound_public</p>
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
        public Builder ratingTags(java.util.List<String> ratingTags) {
            String ratingTagsShrink = shrink(ratingTags, "RatingTags", "json");
            this.putBodyParameter("RatingTags", ratingTagsShrink);
            this.ratingTags = ratingTags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>75bf82fa-b71b-45d7-ae40-0b00e496cd9e</p>
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
