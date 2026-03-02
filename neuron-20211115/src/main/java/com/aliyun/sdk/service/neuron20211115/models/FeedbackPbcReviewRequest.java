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
 * {@link FeedbackPbcReviewRequest} extends {@link RequestModel}
 *
 * <p>FeedbackPbcReviewRequest</p>
 */
public class FeedbackPbcReviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reviewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private FeedbackReviewCmd body;

    private FeedbackPbcReviewRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeedbackPbcReviewRequest create() {
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
     * @return body
     */
    public FeedbackReviewCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<FeedbackPbcReviewRequest, Builder> {
        private Long reviewId; 
        private FeedbackReviewCmd body; 

        private Builder() {
            super();
        } 

        private Builder(FeedbackPbcReviewRequest request) {
            super(request);
            this.reviewId = request.reviewId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reviewId(Long reviewId) {
            this.putPathParameter("reviewId", reviewId);
            this.reviewId = reviewId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(FeedbackReviewCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public FeedbackPbcReviewRequest build() {
            return new FeedbackPbcReviewRequest(this);
        } 

    } 

}
