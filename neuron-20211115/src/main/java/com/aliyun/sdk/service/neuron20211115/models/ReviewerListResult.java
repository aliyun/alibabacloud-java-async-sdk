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
 * {@link ReviewerListResult} extends {@link TeaModel}
 *
 * <p>ReviewerListResult</p>
 */
public class ReviewerListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewers")
    private java.util.List<Reviewer> reviewers;

    private ReviewerListResult(Builder builder) {
        this.requestId = builder.requestId;
        this.reviewers = builder.reviewers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReviewerListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewers
     */
    public java.util.List<Reviewer> getReviewers() {
        return this.reviewers;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Reviewer> reviewers; 

        private Builder() {
        } 

        private Builder(ReviewerListResult model) {
            this.requestId = model.requestId;
            this.reviewers = model.reviewers;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * reviewers.
         */
        public Builder reviewers(java.util.List<Reviewer> reviewers) {
            this.reviewers = reviewers;
            return this;
        }

        public ReviewerListResult build() {
            return new ReviewerListResult(this);
        } 

    } 

}
