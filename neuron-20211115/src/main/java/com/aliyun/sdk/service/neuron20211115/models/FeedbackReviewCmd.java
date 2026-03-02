// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link FeedbackReviewCmd} extends {@link TeaModel}
 *
 * <p>FeedbackReviewCmd</p>
 */
public class FeedbackReviewCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("feedbackPbcAPI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedbackPbcAPI;

    @com.aliyun.core.annotation.NameInMap("feedbackPbcInstruction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedbackPbcInstruction;

    @com.aliyun.core.annotation.NameInMap("feedbackPbcSchema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedbackPbcSchema;

    @com.aliyun.core.annotation.NameInMap("feedbackSecurity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedbackSecurity;

    @com.aliyun.core.annotation.NameInMap("feedbackServiceAvailable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feedbackServiceAvailable;

    @com.aliyun.core.annotation.NameInMap("reviewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewId;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private FeedbackReviewCmd(Builder builder) {
        this.feedbackPbcAPI = builder.feedbackPbcAPI;
        this.feedbackPbcInstruction = builder.feedbackPbcInstruction;
        this.feedbackPbcSchema = builder.feedbackPbcSchema;
        this.feedbackSecurity = builder.feedbackSecurity;
        this.feedbackServiceAvailable = builder.feedbackServiceAvailable;
        this.reviewId = builder.reviewId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackReviewCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedbackPbcAPI
     */
    public String getFeedbackPbcAPI() {
        return this.feedbackPbcAPI;
    }

    /**
     * @return feedbackPbcInstruction
     */
    public String getFeedbackPbcInstruction() {
        return this.feedbackPbcInstruction;
    }

    /**
     * @return feedbackPbcSchema
     */
    public String getFeedbackPbcSchema() {
        return this.feedbackPbcSchema;
    }

    /**
     * @return feedbackSecurity
     */
    public String getFeedbackSecurity() {
        return this.feedbackSecurity;
    }

    /**
     * @return feedbackServiceAvailable
     */
    public String getFeedbackServiceAvailable() {
        return this.feedbackServiceAvailable;
    }

    /**
     * @return reviewId
     */
    public Long getReviewId() {
        return this.reviewId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String feedbackPbcAPI; 
        private String feedbackPbcInstruction; 
        private String feedbackPbcSchema; 
        private String feedbackSecurity; 
        private String feedbackServiceAvailable; 
        private Long reviewId; 
        private String status; 

        private Builder() {
        } 

        private Builder(FeedbackReviewCmd model) {
            this.feedbackPbcAPI = model.feedbackPbcAPI;
            this.feedbackPbcInstruction = model.feedbackPbcInstruction;
            this.feedbackPbcSchema = model.feedbackPbcSchema;
            this.feedbackSecurity = model.feedbackSecurity;
            this.feedbackServiceAvailable = model.feedbackServiceAvailable;
            this.reviewId = model.reviewId;
            this.status = model.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>符合规范</p>
         */
        public Builder feedbackPbcAPI(String feedbackPbcAPI) {
            this.feedbackPbcAPI = feedbackPbcAPI;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>符合规范</p>
         */
        public Builder feedbackPbcInstruction(String feedbackPbcInstruction) {
            this.feedbackPbcInstruction = feedbackPbcInstruction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>符合规范</p>
         */
        public Builder feedbackPbcSchema(String feedbackPbcSchema) {
            this.feedbackPbcSchema = feedbackPbcSchema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>服务安全</p>
         */
        public Builder feedbackSecurity(String feedbackSecurity) {
            this.feedbackSecurity = feedbackSecurity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>服务可运行</p>
         */
        public Builder feedbackServiceAvailable(String feedbackServiceAvailable) {
            this.feedbackServiceAvailable = feedbackServiceAvailable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewId(Long reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REVIEW_FAILED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public FeedbackReviewCmd build() {
            return new FeedbackReviewCmd(this);
        } 

    } 

}
