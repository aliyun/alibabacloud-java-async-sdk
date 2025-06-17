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
 * {@link QueryExportAuctionDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryExportAuctionDetailRequest</p>
 */
public class QueryExportAuctionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private String auctionId;

    private QueryExportAuctionDetailRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExportAuctionDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryExportAuctionDetailRequest, Builder> {
        private String auctionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryExportAuctionDetailRequest request) {
            super(request);
            this.auctionId = request.auctionId;
        } 

        /**
         * AuctionId.
         */
        public Builder auctionId(String auctionId) {
            this.putQueryParameter("AuctionId", auctionId);
            this.auctionId = auctionId;
            return this;
        }

        @Override
        public QueryExportAuctionDetailRequest build() {
            return new QueryExportAuctionDetailRequest(this);
        } 

    } 

}
