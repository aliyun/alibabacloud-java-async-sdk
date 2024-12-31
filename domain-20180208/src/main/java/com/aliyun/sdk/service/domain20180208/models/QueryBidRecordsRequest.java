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
 * {@link QueryBidRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryBidRecordsRequest</p>
 */
public class QueryBidRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auctionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    private QueryBidRecordsRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBidRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctionId
     */
    public String getAuctionId() {
        return this.auctionId;
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

    public static final class Builder extends Request.Builder<QueryBidRecordsRequest, Builder> {
        private String auctionId; 
        private Integer currentPage; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryBidRecordsRequest request) {
            super(request);
            this.auctionId = request.auctionId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder auctionId(String auctionId) {
            this.putBodyParameter("AuctionId", auctionId);
            this.auctionId = auctionId;
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

        @Override
        public QueryBidRecordsRequest build() {
            return new QueryBidRecordsRequest(this);
        } 

    } 

}
