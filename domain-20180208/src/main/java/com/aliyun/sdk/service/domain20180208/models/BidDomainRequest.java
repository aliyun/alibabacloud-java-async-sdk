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
 * {@link BidDomainRequest} extends {@link RequestModel}
 *
 * <p>BidDomainRequest</p>
 */
public class BidDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auctionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxBid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float maxBid;

    private BidDomainRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
        this.currency = builder.currency;
        this.maxBid = builder.maxBid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BidDomainRequest create() {
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
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return maxBid
     */
    public Float getMaxBid() {
        return this.maxBid;
    }

    public static final class Builder extends Request.Builder<BidDomainRequest, Builder> {
        private String auctionId; 
        private String currency; 
        private Float maxBid; 

        private Builder() {
            super();
        } 

        private Builder(BidDomainRequest request) {
            super(request);
            this.auctionId = request.auctionId;
            this.currency = request.currency;
            this.maxBid = request.maxBid;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder auctionId(String auctionId) {
            this.putBodyParameter("AuctionId", auctionId);
            this.auctionId = auctionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        public Builder currency(String currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxBid(Float maxBid) {
            this.putBodyParameter("MaxBid", maxBid);
            this.maxBid = maxBid;
            return this;
        }

        @Override
        public BidDomainRequest build() {
            return new BidDomainRequest(this);
        } 

    } 

}
