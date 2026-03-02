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
 * {@link GetPbcReviewRequest} extends {@link RequestModel}
 *
 * <p>GetPbcReviewRequest</p>
 */
public class GetPbcReviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reviewId")
    private Long reviewId;

    private GetPbcReviewRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPbcReviewRequest create() {
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

    public static final class Builder extends Request.Builder<GetPbcReviewRequest, Builder> {
        private Long reviewId; 

        private Builder() {
            super();
        } 

        private Builder(GetPbcReviewRequest request) {
            super(request);
            this.reviewId = request.reviewId;
        } 

        /**
         * reviewId.
         */
        public Builder reviewId(Long reviewId) {
            this.putPathParameter("reviewId", reviewId);
            this.reviewId = reviewId;
            return this;
        }

        @Override
        public GetPbcReviewRequest build() {
            return new GetPbcReviewRequest(this);
        } 

    } 

}
