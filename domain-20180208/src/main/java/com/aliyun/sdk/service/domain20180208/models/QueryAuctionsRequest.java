// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryAuctionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAuctionsRequest</p>
 */
public class QueryAuctionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionEndTimeOrder")
    private String auctionEndTimeOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private String statuses;

    private QueryAuctionsRequest(Builder builder) {
        super(builder);
        this.auctionEndTimeOrder = builder.auctionEndTimeOrder;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuctionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctionEndTimeOrder
     */
    public String getAuctionEndTimeOrder() {
        return this.auctionEndTimeOrder;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statuses
     */
    public String getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<QueryAuctionsRequest, Builder> {
        private String auctionEndTimeOrder; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String status; 
        private String statuses; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuctionsRequest request) {
            super(request);
            this.auctionEndTimeOrder = request.auctionEndTimeOrder;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.statuses = request.statuses;
        } 

        /**
         * AuctionEndTimeOrder.
         */
        public Builder auctionEndTimeOrder(String auctionEndTimeOrder) {
            this.putBodyParameter("AuctionEndTimeOrder", auctionEndTimeOrder);
            this.auctionEndTimeOrder = auctionEndTimeOrder;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(String statuses) {
            this.putBodyParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public QueryAuctionsRequest build() {
            return new QueryAuctionsRequest(this);
        } 

    } 

}
