// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBidRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBidRecordsResponseBody</p>
 */
public class QueryBidRecordsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryBidRecordsResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBidRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryBidRecordsResponseBody build() {
            return new QueryBidRecordsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Bid")
        private Float bid;

        @NameInMap("BidTime")
        private Long bidTime;

        @NameInMap("Bidder")
        private String bidder;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DomainName")
        private String domainName;

        private Data(Builder builder) {
            this.bid = builder.bid;
            this.bidTime = builder.bidTime;
            this.bidder = builder.bidder;
            this.currency = builder.currency;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public Float getBid() {
            return this.bid;
        }

        /**
         * @return bidTime
         */
        public Long getBidTime() {
            return this.bidTime;
        }

        /**
         * @return bidder
         */
        public String getBidder() {
            return this.bidder;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private Float bid; 
            private Long bidTime; 
            private String bidder; 
            private String currency; 
            private String domainName; 

            /**
             * Bid.
             */
            public Builder bid(Float bid) {
                this.bid = bid;
                return this;
            }

            /**
             * BidTime.
             */
            public Builder bidTime(Long bidTime) {
                this.bidTime = bidTime;
                return this;
            }

            /**
             * Bidder.
             */
            public Builder bidder(String bidder) {
                this.bidder = bidder;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
