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
 * {@link LibraryReviewsListQuery} extends {@link TeaModel}
 *
 * <p>LibraryReviewsListQuery</p>
 */
public class LibraryReviewsListQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    private LibraryReviewsListQuery(Builder builder) {
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

    public static LibraryReviewsListQuery create() {
        return builder().build();
    }

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
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    public static final class Builder {
        private String applicant; 
        private Long marketId; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String reviewer; 

        private Builder() {
        } 

        private Builder(LibraryReviewsListQuery model) {
            this.applicant = model.applicant;
            this.marketId = model.marketId;
            this.orderBy = model.orderBy;
            this.orderDirection = model.orderDirection;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reviewer = model.reviewer;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.applicant = applicant;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * reviewer.
         */
        public Builder reviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public LibraryReviewsListQuery build() {
            return new LibraryReviewsListQuery(this);
        } 

    } 

}
