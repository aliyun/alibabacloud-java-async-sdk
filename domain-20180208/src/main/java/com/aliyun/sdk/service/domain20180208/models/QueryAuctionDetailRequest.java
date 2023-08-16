// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuctionDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryAuctionDetailRequest</p>
 */
public class QueryAuctionDetailRequest extends Request {
    @Body
    @NameInMap("AuctionId")
    @Validation(required = true)
    private String auctionId;

    private QueryAuctionDetailRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuctionDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAuctionDetailRequest, Builder> {
        private String auctionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuctionDetailRequest request) {
            super(request);
            this.auctionId = request.auctionId;
        } 

        /**
         * AuctionId.
         */
        public Builder auctionId(String auctionId) {
            this.putBodyParameter("AuctionId", auctionId);
            this.auctionId = auctionId;
            return this;
        }

        @Override
        public QueryAuctionDetailRequest build() {
            return new QueryAuctionDetailRequest(this);
        } 

    } 

}
