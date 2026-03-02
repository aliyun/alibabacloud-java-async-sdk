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
 * {@link ListPbcReviewsRequest} extends {@link RequestModel}
 *
 * <p>ListPbcReviewsRequest</p>
 */
public class ListPbcReviewsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long marketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private Integer orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private Integer orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    private ListPbcReviewsRequest(Builder builder) {
        super(builder);
        this.applicant = builder.applicant;
        this.marketId = builder.marketId;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reviewer = builder.reviewer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPbcReviewsRequest create() {
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
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return orderBy
     */
    public Integer getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public Integer getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    public static final class Builder extends Request.Builder<ListPbcReviewsRequest, Builder> {
        private String applicant; 
        private Long marketId; 
        private Integer orderBy; 
        private Integer orderDirection; 
        private String pageNumber; 
        private String pageSize; 
        private String reviewer; 

        private Builder() {
            super();
        } 

        private Builder(ListPbcReviewsRequest request) {
            super(request);
            this.applicant = request.applicant;
            this.marketId = request.marketId;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * <p>This parameter is required.</p>
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(Integer orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
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
         * pageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListPbcReviewsRequest build() {
            return new ListPbcReviewsRequest(this);
        } 

    } 

}
