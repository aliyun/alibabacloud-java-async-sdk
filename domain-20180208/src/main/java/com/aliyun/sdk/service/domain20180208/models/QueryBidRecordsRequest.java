// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBidRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryBidRecordsRequest</p>
 */
public class QueryBidRecordsRequest extends Request {
    @Body
    @NameInMap("AuctionId")
    @Validation(required = true)
    private String auctionId;

    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
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
         * AuctionId.
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
