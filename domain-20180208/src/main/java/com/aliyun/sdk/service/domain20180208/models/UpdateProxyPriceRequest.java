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
 * {@link UpdateProxyPriceRequest} extends {@link RequestModel}
 *
 * <p>UpdateProxyPriceRequest</p>
 */
public class UpdateProxyPriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private String auctionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Price")
    private Float price;

    private UpdateProxyPriceRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
        this.currency = builder.currency;
        this.price = builder.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProxyPriceRequest create() {
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
     * @return price
     */
    public Float getPrice() {
        return this.price;
    }

    public static final class Builder extends Request.Builder<UpdateProxyPriceRequest, Builder> {
        private String auctionId; 
        private String currency; 
        private Float price; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProxyPriceRequest request) {
            super(request);
            this.auctionId = request.auctionId;
            this.currency = request.currency;
            this.price = request.price;
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
         * Currency.
         */
        public Builder currency(String currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * Price.
         */
        public Builder price(Float price) {
            this.putBodyParameter("Price", price);
            this.price = price;
            return this;
        }

        @Override
        public UpdateProxyPriceRequest build() {
            return new UpdateProxyPriceRequest(this);
        } 

    } 

}
