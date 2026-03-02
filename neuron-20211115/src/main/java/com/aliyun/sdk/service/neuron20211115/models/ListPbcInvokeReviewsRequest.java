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
 * {@link ListPbcInvokeReviewsRequest} extends {@link RequestModel}
 *
 * <p>ListPbcInvokeReviewsRequest</p>
 */
public class ListPbcInvokeReviewsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private Integer orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderby")
    private Integer orderby;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    private ListPbcInvokeReviewsRequest(Builder builder) {
        super(builder);
        this.applicant = builder.applicant;
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.orderDirection = builder.orderDirection;
        this.orderby = builder.orderby;
        this.reviewer = builder.reviewer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPbcInvokeReviewsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicant
     */
    public String getApplicant() {
        return this.applicant;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return orderDirection
     */
    public Integer getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orderby
     */
    public Integer getOrderby() {
        return this.orderby;
    }

    /**
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    public static final class Builder extends Request.Builder<ListPbcInvokeReviewsRequest, Builder> {
        private String applicant; 
        private Long companyId; 
        private Long marketId; 
        private Integer orderDirection; 
        private Integer orderby; 
        private String reviewer; 

        private Builder() {
            super();
        } 

        private Builder(ListPbcInvokeReviewsRequest request) {
            super(request);
            this.applicant = request.applicant;
            this.companyId = request.companyId;
            this.marketId = request.marketId;
            this.orderDirection = request.orderDirection;
            this.orderby = request.orderby;
            this.reviewer = request.reviewer;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.putQueryParameter("applicant", applicant);
            this.applicant = applicant;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(Integer orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * orderby.
         */
        public Builder orderby(Integer orderby) {
            this.putQueryParameter("orderby", orderby);
            this.orderby = orderby;
            return this;
        }

        /**
         * reviewer.
         */
        public Builder reviewer(String reviewer) {
            this.putQueryParameter("reviewer", reviewer);
            this.reviewer = reviewer;
            return this;
        }

        @Override
        public ListPbcInvokeReviewsRequest build() {
            return new ListPbcInvokeReviewsRequest(this);
        } 

    } 

}
