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
 * {@link PbcInvokeReviewListResult} extends {@link TeaModel}
 *
 * <p>PbcInvokeReviewListResult</p>
 */
public class PbcInvokeReviewListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcInvokeReviews")
    private java.util.List<PbcInvokeReview> pbcInvokeReviews;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcInvokeReviewListResult(Builder builder) {
        this.pbcInvokeReviews = builder.pbcInvokeReviews;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInvokeReviewListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcInvokeReviews
     */
    public java.util.List<PbcInvokeReview> getPbcInvokeReviews() {
        return this.pbcInvokeReviews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PbcInvokeReview> pbcInvokeReviews; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcInvokeReviewListResult model) {
            this.pbcInvokeReviews = model.pbcInvokeReviews;
            this.requestId = model.requestId;
        } 

        /**
         * pbcInvokeReviews.
         */
        public Builder pbcInvokeReviews(java.util.List<PbcInvokeReview> pbcInvokeReviews) {
            this.pbcInvokeReviews = pbcInvokeReviews;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcInvokeReviewListResult build() {
            return new PbcInvokeReviewListResult(this);
        } 

    } 

}
