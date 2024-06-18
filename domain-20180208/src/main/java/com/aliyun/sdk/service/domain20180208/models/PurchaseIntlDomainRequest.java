// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseIntlDomainRequest} extends {@link RequestModel}
 *
 * <p>PurchaseIntlDomainRequest</p>
 */
public class PurchaseIntlDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auctionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Price")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999, minimum = 1)
    private Double price;

    private PurchaseIntlDomainRequest(Builder builder) {
        super(builder);
        this.auctionId = builder.auctionId;
        this.currency = builder.currency;
        this.price = builder.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseIntlDomainRequest create() {
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
    public Double getPrice() {
        return this.price;
    }

    public static final class Builder extends Request.Builder<PurchaseIntlDomainRequest, Builder> {
        private String auctionId; 
        private String currency; 
        private Double price; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseIntlDomainRequest request) {
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
        public Builder price(Double price) {
            this.putBodyParameter("Price", price);
            this.price = price;
            return this;
        }

        @Override
        public PurchaseIntlDomainRequest build() {
            return new PurchaseIntlDomainRequest(this);
        } 

    } 

}
