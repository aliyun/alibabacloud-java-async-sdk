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
 * {@link GetPbcInvokeReviewRequest} extends {@link RequestModel}
 *
 * <p>GetPbcInvokeReviewRequest</p>
 */
public class GetPbcInvokeReviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reviewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewId;

    private GetPbcInvokeReviewRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPbcInvokeReviewRequest create() {
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

    public static final class Builder extends Request.Builder<GetPbcInvokeReviewRequest, Builder> {
        private Long reviewId; 

        private Builder() {
            super();
        } 

        private Builder(GetPbcInvokeReviewRequest request) {
            super(request);
            this.reviewId = request.reviewId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reviewId(Long reviewId) {
            this.putPathParameter("reviewId", reviewId);
            this.reviewId = reviewId;
            return this;
        }

        @Override
        public GetPbcInvokeReviewRequest build() {
            return new GetPbcInvokeReviewRequest(this);
        } 

    } 

}
