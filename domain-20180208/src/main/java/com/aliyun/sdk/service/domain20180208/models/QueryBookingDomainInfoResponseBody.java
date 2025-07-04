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
 * {@link QueryBookingDomainInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBookingDomainInfoResponseBody</p>
 */
public class QueryBookingDomainInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private Integer auctionId;

    @com.aliyun.core.annotation.NameInMap("BookEndTime")
    private Long bookEndTime;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("MaxBid")
    private Float maxBid;

    @com.aliyun.core.annotation.NameInMap("PartnerType")
    private String partnerType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatchNo")
    private String snatchNo;

    @com.aliyun.core.annotation.NameInMap("TransferInPrice")
    private Float transferInPrice;

    private QueryBookingDomainInfoResponseBody(Builder builder) {
        this.auctionId = builder.auctionId;
        this.bookEndTime = builder.bookEndTime;
        this.currency = builder.currency;
        this.maxBid = builder.maxBid;
        this.partnerType = builder.partnerType;
        this.requestId = builder.requestId;
        this.snatchNo = builder.snatchNo;
        this.transferInPrice = builder.transferInPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBookingDomainInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctionId
     */
    public Integer getAuctionId() {
        return this.auctionId;
    }

    /**
     * @return bookEndTime
     */
    public Long getBookEndTime() {
        return this.bookEndTime;
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

    /**
     * @return partnerType
     */
    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snatchNo
     */
    public String getSnatchNo() {
        return this.snatchNo;
    }

    /**
     * @return transferInPrice
     */
    public Float getTransferInPrice() {
        return this.transferInPrice;
    }

    public static final class Builder {
        private Integer auctionId; 
        private Long bookEndTime; 
        private String currency; 
        private Float maxBid; 
        private String partnerType; 
        private String requestId; 
        private String snatchNo; 
        private Float transferInPrice; 

        private Builder() {
        } 

        private Builder(QueryBookingDomainInfoResponseBody model) {
            this.auctionId = model.auctionId;
            this.bookEndTime = model.bookEndTime;
            this.currency = model.currency;
            this.maxBid = model.maxBid;
            this.partnerType = model.partnerType;
            this.requestId = model.requestId;
            this.snatchNo = model.snatchNo;
            this.transferInPrice = model.transferInPrice;
        } 

        /**
         * AuctionId.
         */
        public Builder auctionId(Integer auctionId) {
            this.auctionId = auctionId;
            return this;
        }

        /**
         * BookEndTime.
         */
        public Builder bookEndTime(Long bookEndTime) {
            this.bookEndTime = bookEndTime;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * MaxBid.
         */
        public Builder maxBid(Float maxBid) {
            this.maxBid = maxBid;
            return this;
        }

        /**
         * PartnerType.
         */
        public Builder partnerType(String partnerType) {
            this.partnerType = partnerType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnatchNo.
         */
        public Builder snatchNo(String snatchNo) {
            this.snatchNo = snatchNo;
            return this;
        }

        /**
         * TransferInPrice.
         */
        public Builder transferInPrice(Float transferInPrice) {
            this.transferInPrice = transferInPrice;
            return this;
        }

        public QueryBookingDomainInfoResponseBody build() {
            return new QueryBookingDomainInfoResponseBody(this);
        } 

    } 

}
