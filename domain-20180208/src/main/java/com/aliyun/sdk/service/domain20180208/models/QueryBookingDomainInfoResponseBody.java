// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBookingDomainInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBookingDomainInfoResponseBody</p>
 */
public class QueryBookingDomainInfoResponseBody extends TeaModel {
    @NameInMap("AuctionId")
    private Integer auctionId;

    @NameInMap("BookEndTime")
    private Long bookEndTime;

    @NameInMap("Currency")
    private String currency;

    @NameInMap("MaxBid")
    private Float maxBid;

    @NameInMap("PartnerType")
    private String partnerType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnatchNo")
    private String snatchNo;

    @NameInMap("TransferInPrice")
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
