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
 * {@link QueryAuctionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuctionDetailResponseBody</p>
 */
public class QueryAuctionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuctionEndTime")
    private Long auctionEndTime;

    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private String auctionId;

    @com.aliyun.core.annotation.NameInMap("BookEndTime")
    private Long bookEndTime;

    @com.aliyun.core.annotation.NameInMap("BookedPartner")
    private String bookedPartner;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("DeliveryTime")
    private Long deliveryTime;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("FailCode")
    private String failCode;

    @com.aliyun.core.annotation.NameInMap("HighBid")
    private Float highBid;

    @com.aliyun.core.annotation.NameInMap("HighBidder")
    private String highBidder;

    @com.aliyun.core.annotation.NameInMap("NextValidBid")
    private Float nextValidBid;

    @com.aliyun.core.annotation.NameInMap("PartnerType")
    private String partnerType;

    @com.aliyun.core.annotation.NameInMap("PayEndTime")
    private Long payEndTime;

    @com.aliyun.core.annotation.NameInMap("PayPrice")
    private Float payPrice;

    @com.aliyun.core.annotation.NameInMap("PayStatus")
    private String payStatus;

    @com.aliyun.core.annotation.NameInMap("ProduceStatus")
    private String produceStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReserveMet")
    private Boolean reserveMet;

    @com.aliyun.core.annotation.NameInMap("ReservePrice")
    private Float reservePrice;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TransferInPrice")
    private Float transferInPrice;

    @com.aliyun.core.annotation.NameInMap("YourCurrentBid")
    private Float yourCurrentBid;

    @com.aliyun.core.annotation.NameInMap("YourMaxBid")
    private Float yourMaxBid;

    private QueryAuctionDetailResponseBody(Builder builder) {
        this.auctionEndTime = builder.auctionEndTime;
        this.auctionId = builder.auctionId;
        this.bookEndTime = builder.bookEndTime;
        this.bookedPartner = builder.bookedPartner;
        this.currency = builder.currency;
        this.deliveryTime = builder.deliveryTime;
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.failCode = builder.failCode;
        this.highBid = builder.highBid;
        this.highBidder = builder.highBidder;
        this.nextValidBid = builder.nextValidBid;
        this.partnerType = builder.partnerType;
        this.payEndTime = builder.payEndTime;
        this.payPrice = builder.payPrice;
        this.payStatus = builder.payStatus;
        this.produceStatus = builder.produceStatus;
        this.requestId = builder.requestId;
        this.reserveMet = builder.reserveMet;
        this.reservePrice = builder.reservePrice;
        this.status = builder.status;
        this.transferInPrice = builder.transferInPrice;
        this.yourCurrentBid = builder.yourCurrentBid;
        this.yourMaxBid = builder.yourMaxBid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuctionDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return auctionEndTime
     */
    public Long getAuctionEndTime() {
        return this.auctionEndTime;
    }

    /**
     * @return auctionId
     */
    public String getAuctionId() {
        return this.auctionId;
    }

    /**
     * @return bookEndTime
     */
    public Long getBookEndTime() {
        return this.bookEndTime;
    }

    /**
     * @return bookedPartner
     */
    public String getBookedPartner() {
        return this.bookedPartner;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return deliveryTime
     */
    public Long getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return failCode
     */
    public String getFailCode() {
        return this.failCode;
    }

    /**
     * @return highBid
     */
    public Float getHighBid() {
        return this.highBid;
    }

    /**
     * @return highBidder
     */
    public String getHighBidder() {
        return this.highBidder;
    }

    /**
     * @return nextValidBid
     */
    public Float getNextValidBid() {
        return this.nextValidBid;
    }

    /**
     * @return partnerType
     */
    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * @return payEndTime
     */
    public Long getPayEndTime() {
        return this.payEndTime;
    }

    /**
     * @return payPrice
     */
    public Float getPayPrice() {
        return this.payPrice;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return produceStatus
     */
    public String getProduceStatus() {
        return this.produceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reserveMet
     */
    public Boolean getReserveMet() {
        return this.reserveMet;
    }

    /**
     * @return reservePrice
     */
    public Float getReservePrice() {
        return this.reservePrice;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return transferInPrice
     */
    public Float getTransferInPrice() {
        return this.transferInPrice;
    }

    /**
     * @return yourCurrentBid
     */
    public Float getYourCurrentBid() {
        return this.yourCurrentBid;
    }

    /**
     * @return yourMaxBid
     */
    public Float getYourMaxBid() {
        return this.yourMaxBid;
    }

    public static final class Builder {
        private Long auctionEndTime; 
        private String auctionId; 
        private Long bookEndTime; 
        private String bookedPartner; 
        private String currency; 
        private Long deliveryTime; 
        private String domainName; 
        private String domainType; 
        private String failCode; 
        private Float highBid; 
        private String highBidder; 
        private Float nextValidBid; 
        private String partnerType; 
        private Long payEndTime; 
        private Float payPrice; 
        private String payStatus; 
        private String produceStatus; 
        private String requestId; 
        private Boolean reserveMet; 
        private Float reservePrice; 
        private String status; 
        private Float transferInPrice; 
        private Float yourCurrentBid; 
        private Float yourMaxBid; 

        /**
         * AuctionEndTime.
         */
        public Builder auctionEndTime(Long auctionEndTime) {
            this.auctionEndTime = auctionEndTime;
            return this;
        }

        /**
         * AuctionId.
         */
        public Builder auctionId(String auctionId) {
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
         * BookedPartner.
         */
        public Builder bookedPartner(String bookedPartner) {
            this.bookedPartner = bookedPartner;
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
         * DeliveryTime.
         */
        public Builder deliveryTime(Long deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * FailCode.
         */
        public Builder failCode(String failCode) {
            this.failCode = failCode;
            return this;
        }

        /**
         * HighBid.
         */
        public Builder highBid(Float highBid) {
            this.highBid = highBid;
            return this;
        }

        /**
         * HighBidder.
         */
        public Builder highBidder(String highBidder) {
            this.highBidder = highBidder;
            return this;
        }

        /**
         * NextValidBid.
         */
        public Builder nextValidBid(Float nextValidBid) {
            this.nextValidBid = nextValidBid;
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
         * PayEndTime.
         */
        public Builder payEndTime(Long payEndTime) {
            this.payEndTime = payEndTime;
            return this;
        }

        /**
         * PayPrice.
         */
        public Builder payPrice(Float payPrice) {
            this.payPrice = payPrice;
            return this;
        }

        /**
         * PayStatus.
         */
        public Builder payStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }

        /**
         * ProduceStatus.
         */
        public Builder produceStatus(String produceStatus) {
            this.produceStatus = produceStatus;
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
         * ReserveMet.
         */
        public Builder reserveMet(Boolean reserveMet) {
            this.reserveMet = reserveMet;
            return this;
        }

        /**
         * ReservePrice.
         */
        public Builder reservePrice(Float reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TransferInPrice.
         */
        public Builder transferInPrice(Float transferInPrice) {
            this.transferInPrice = transferInPrice;
            return this;
        }

        /**
         * YourCurrentBid.
         */
        public Builder yourCurrentBid(Float yourCurrentBid) {
            this.yourCurrentBid = yourCurrentBid;
            return this;
        }

        /**
         * YourMaxBid.
         */
        public Builder yourMaxBid(Float yourMaxBid) {
            this.yourMaxBid = yourMaxBid;
            return this;
        }

        public QueryAuctionDetailResponseBody build() {
            return new QueryAuctionDetailResponseBody(this);
        } 

    } 

}
