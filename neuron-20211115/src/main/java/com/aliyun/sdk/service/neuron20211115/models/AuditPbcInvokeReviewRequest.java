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
 * {@link AuditPbcInvokeReviewRequest} extends {@link RequestModel}
 *
 * <p>AuditPbcInvokeReviewRequest</p>
 */
public class AuditPbcInvokeReviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reviewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("approve")
    private Boolean approve;

    private AuditPbcInvokeReviewRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
        this.approve = builder.approve;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditPbcInvokeReviewRequest create() {
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
    public Boolean getApprove() {
        return this.approve;
    }

    public static final class Builder extends Request.Builder<AuditPbcInvokeReviewRequest, Builder> {
        private Long reviewId; 
        private Boolean approve; 

        private Builder() {
            super();
        } 

        private Builder(AuditPbcInvokeReviewRequest request) {
            super(request);
            this.reviewId = request.reviewId;
            this.approve = request.approve;
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
         * approve.
         */
        public Builder approve(Boolean approve) {
            this.putBodyParameter("approve", approve);
            this.approve = approve;
            return this;
        }

        @Override
        public AuditPbcInvokeReviewRequest build() {
            return new AuditPbcInvokeReviewRequest(this);
        } 

    } 

}
