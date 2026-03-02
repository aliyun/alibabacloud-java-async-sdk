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
 * {@link ForkReviewListResult} extends {@link TeaModel}
 *
 * <p>ForkReviewListResult</p>
 */
public class ForkReviewListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("forkReviews")
    private java.util.List<ForkReview> forkReviews;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ForkReviewListResult(Builder builder) {
        this.forkReviews = builder.forkReviews;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForkReviewListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forkReviews
     */
    public java.util.List<ForkReview> getForkReviews() {
        return this.forkReviews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ForkReview> forkReviews; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ForkReviewListResult model) {
            this.forkReviews = model.forkReviews;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * forkReviews.
         */
        public Builder forkReviews(java.util.List<ForkReview> forkReviews) {
            this.forkReviews = forkReviews;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ForkReviewListResult build() {
            return new ForkReviewListResult(this);
        } 

    } 

}
