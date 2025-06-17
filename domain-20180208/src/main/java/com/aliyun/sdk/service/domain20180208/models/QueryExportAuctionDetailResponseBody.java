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
 * {@link QueryExportAuctionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExportAuctionDetailResponseBody</p>
 */
public class QueryExportAuctionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuctionEndTime")
    private String auctionEndTime;

    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private String auctionId;

    @com.aliyun.core.annotation.NameInMap("AuctionStatus")
    private String auctionStatus;

    @com.aliyun.core.annotation.NameInMap("BookEndTime")
    private String bookEndTime;

    @com.aliyun.core.annotation.NameInMap("BuyerStatus")
    private String buyerStatus;

    @com.aliyun.core.annotation.NameInMap("CurrentPrice")
    private Double currentPrice;

    @com.aliyun.core.annotation.NameInMap("IncreasePrice")
    private Double increasePrice;

    @com.aliyun.core.annotation.NameInMap("MyPrice")
    private Double myPrice;

    @com.aliyun.core.annotation.NameInMap("MyProxyPrice")
    private Double myProxyPrice;

    @com.aliyun.core.annotation.NameInMap("OthersMaxProxyPrice")
    private Double othersMaxProxyPrice;

    @com.aliyun.core.annotation.NameInMap("ProxyPrice")
    private Double proxyPrice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryExportAuctionDetailResponseBody(Builder builder) {
        this.auctionEndTime = builder.auctionEndTime;
        this.auctionId = builder.auctionId;
        this.auctionStatus = builder.auctionStatus;
        this.bookEndTime = builder.bookEndTime;
        this.buyerStatus = builder.buyerStatus;
        this.currentPrice = builder.currentPrice;
        this.increasePrice = builder.increasePrice;
        this.myPrice = builder.myPrice;
        this.myProxyPrice = builder.myProxyPrice;
        this.othersMaxProxyPrice = builder.othersMaxProxyPrice;
        this.proxyPrice = builder.proxyPrice;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExportAuctionDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctionEndTime
     */
    public String getAuctionEndTime() {
        return this.auctionEndTime;
    }

    /**
     * @return auctionId
     */
    public String getAuctionId() {
        return this.auctionId;
    }

    /**
     * @return auctionStatus
     */
    public String getAuctionStatus() {
        return this.auctionStatus;
    }

    /**
     * @return bookEndTime
     */
    public String getBookEndTime() {
        return this.bookEndTime;
    }

    /**
     * @return buyerStatus
     */
    public String getBuyerStatus() {
        return this.buyerStatus;
    }

    /**
     * @return currentPrice
     */
    public Double getCurrentPrice() {
        return this.currentPrice;
    }

    /**
     * @return increasePrice
     */
    public Double getIncreasePrice() {
        return this.increasePrice;
    }

    /**
     * @return myPrice
     */
    public Double getMyPrice() {
        return this.myPrice;
    }

    /**
     * @return myProxyPrice
     */
    public Double getMyProxyPrice() {
        return this.myProxyPrice;
    }

    /**
     * @return othersMaxProxyPrice
     */
    public Double getOthersMaxProxyPrice() {
        return this.othersMaxProxyPrice;
    }

    /**
     * @return proxyPrice
     */
    public Double getProxyPrice() {
        return this.proxyPrice;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String auctionEndTime; 
        private String auctionId; 
        private String auctionStatus; 
        private String bookEndTime; 
        private String buyerStatus; 
        private Double currentPrice; 
        private Double increasePrice; 
        private Double myPrice; 
        private Double myProxyPrice; 
        private Double othersMaxProxyPrice; 
        private Double proxyPrice; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryExportAuctionDetailResponseBody model) {
            this.auctionEndTime = model.auctionEndTime;
            this.auctionId = model.auctionId;
            this.auctionStatus = model.auctionStatus;
            this.bookEndTime = model.bookEndTime;
            this.buyerStatus = model.buyerStatus;
            this.currentPrice = model.currentPrice;
            this.increasePrice = model.increasePrice;
            this.myPrice = model.myPrice;
            this.myProxyPrice = model.myProxyPrice;
            this.othersMaxProxyPrice = model.othersMaxProxyPrice;
            this.proxyPrice = model.proxyPrice;
            this.requestId = model.requestId;
        } 

        /**
         * AuctionEndTime.
         */
        public Builder auctionEndTime(String auctionEndTime) {
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
         * AuctionStatus.
         */
        public Builder auctionStatus(String auctionStatus) {
            this.auctionStatus = auctionStatus;
            return this;
        }

        /**
         * BookEndTime.
         */
        public Builder bookEndTime(String bookEndTime) {
            this.bookEndTime = bookEndTime;
            return this;
        }

        /**
         * BuyerStatus.
         */
        public Builder buyerStatus(String buyerStatus) {
            this.buyerStatus = buyerStatus;
            return this;
        }

        /**
         * CurrentPrice.
         */
        public Builder currentPrice(Double currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }

        /**
         * IncreasePrice.
         */
        public Builder increasePrice(Double increasePrice) {
            this.increasePrice = increasePrice;
            return this;
        }

        /**
         * MyPrice.
         */
        public Builder myPrice(Double myPrice) {
            this.myPrice = myPrice;
            return this;
        }

        /**
         * MyProxyPrice.
         */
        public Builder myProxyPrice(Double myProxyPrice) {
            this.myProxyPrice = myProxyPrice;
            return this;
        }

        /**
         * OthersMaxProxyPrice.
         */
        public Builder othersMaxProxyPrice(Double othersMaxProxyPrice) {
            this.othersMaxProxyPrice = othersMaxProxyPrice;
            return this;
        }

        /**
         * ProxyPrice.
         */
        public Builder proxyPrice(Double proxyPrice) {
            this.proxyPrice = proxyPrice;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryExportAuctionDetailResponseBody build() {
            return new QueryExportAuctionDetailResponseBody(this);
        } 

    } 

}
