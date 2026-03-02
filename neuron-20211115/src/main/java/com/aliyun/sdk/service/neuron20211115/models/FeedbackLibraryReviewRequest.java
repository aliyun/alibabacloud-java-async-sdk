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
 * {@link FeedbackLibraryReviewRequest} extends {@link RequestModel}
 *
 * <p>FeedbackLibraryReviewRequest</p>
 */
public class FeedbackLibraryReviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reviewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("approve")
    private String approve;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("feedback")
    private String feedback;

    private FeedbackLibraryReviewRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
        this.approve = builder.approve;
        this.feedback = builder.feedback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackLibraryReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reviewId
     */
    public Long getReviewId() {
        return this.reviewId;
    }

    /**
     * @return approve
     */
    public String getApprove() {
        return this.approve;
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    public static final class Builder extends Request.Builder<FeedbackLibraryReviewRequest, Builder> {
        private Long reviewId; 
        private String approve; 
        private String feedback; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackLibraryReviewRequest request) {
            super(request);
            this.reviewId = request.reviewId;
            this.approve = request.approve;
            this.feedback = request.feedback;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reviewId(Long reviewId) {
            this.putPathParameter("reviewId", reviewId);
            this.putBodyParameter("reviewId", reviewId);
            this.reviewId = reviewId;
            return this;
        }

        /**
         * approve.
         */
        public Builder approve(String approve) {
            this.putBodyParameter("approve", approve);
            this.approve = approve;
            return this;
        }

        /**
         * feedback.
         */
        public Builder feedback(String feedback) {
            this.putBodyParameter("feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        @Override
        public FeedbackLibraryReviewRequest build() {
            return new FeedbackLibraryReviewRequest(this);
        } 

    } 

}
