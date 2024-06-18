// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPurchasedDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPurchasedDomainsResponseBody</p>
 */
public class QueryPurchasedDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryPurchasedDomainsResponseBody(Builder builder) {
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

    public static QueryPurchasedDomainsResponseBody create() {
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

        public QueryPurchasedDomainsResponseBody build() {
            return new QueryPurchasedDomainsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private String deliveryTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("TradeMoney")
        private Double tradeMoney;

        private Data(Builder builder) {
            this.deliveryTime = builder.deliveryTime;
            this.domainName = builder.domainName;
            this.operationStatus = builder.operationStatus;
            this.operationTime = builder.operationTime;
            this.productType = builder.productType;
            this.tradeMoney = builder.tradeMoney;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return tradeMoney
         */
        public Double getTradeMoney() {
            return this.tradeMoney;
        }

        public static final class Builder {
            private String deliveryTime; 
            private String domainName; 
            private String operationStatus; 
            private String operationTime; 
            private String productType; 
            private Double tradeMoney; 

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
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
             * OperationStatus.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * TradeMoney.
             */
            public Builder tradeMoney(Double tradeMoney) {
                this.tradeMoney = tradeMoney;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
