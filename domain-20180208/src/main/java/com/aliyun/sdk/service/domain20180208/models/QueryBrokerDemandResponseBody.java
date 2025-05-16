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
 * {@link QueryBrokerDemandResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBrokerDemandResponseBody</p>
 */
public class QueryBrokerDemandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryBrokerDemandResponseBody(Builder builder) {
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

    public static QueryBrokerDemandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(QueryBrokerDemandResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

        public QueryBrokerDemandResponseBody build() {
            return new QueryBrokerDemandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBrokerDemandResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBrokerDemandResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private Integer auditStatus;

        @com.aliyun.core.annotation.NameInMap("BargainSellerMobile")
        private String bargainSellerMobile;

        @com.aliyun.core.annotation.NameInMap("BargainSellerPrice")
        private Float bargainSellerPrice;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("DemandDomain")
        private String demandDomain;

        @com.aliyun.core.annotation.NameInMap("DemandPrice")
        private Float demandPrice;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("PartnerDomain")
        private String partnerDomain;

        @com.aliyun.core.annotation.NameInMap("PayDomain")
        private String payDomain;

        @com.aliyun.core.annotation.NameInMap("PayPrice")
        private Float payPrice;

        @com.aliyun.core.annotation.NameInMap("PayTime")
        private Long payTime;

        @com.aliyun.core.annotation.NameInMap("ProduceType")
        private Integer produceType;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private Long publishTime;

        @com.aliyun.core.annotation.NameInMap("PurchaseStatus")
        private Integer purchaseStatus;

        @com.aliyun.core.annotation.NameInMap("ServicePayPrice")
        private Float servicePayPrice;

        @com.aliyun.core.annotation.NameInMap("SettleBasePrice")
        private Float settleBasePrice;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.bargainSellerMobile = builder.bargainSellerMobile;
            this.bargainSellerPrice = builder.bargainSellerPrice;
            this.bizId = builder.bizId;
            this.demandDomain = builder.demandDomain;
            this.demandPrice = builder.demandPrice;
            this.description = builder.description;
            this.email = builder.email;
            this.mobile = builder.mobile;
            this.orderType = builder.orderType;
            this.partnerDomain = builder.partnerDomain;
            this.payDomain = builder.payDomain;
            this.payPrice = builder.payPrice;
            this.payTime = builder.payTime;
            this.produceType = builder.produceType;
            this.publishTime = builder.publishTime;
            this.purchaseStatus = builder.purchaseStatus;
            this.servicePayPrice = builder.servicePayPrice;
            this.settleBasePrice = builder.settleBasePrice;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return bargainSellerMobile
         */
        public String getBargainSellerMobile() {
            return this.bargainSellerMobile;
        }

        /**
         * @return bargainSellerPrice
         */
        public Float getBargainSellerPrice() {
            return this.bargainSellerPrice;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return demandDomain
         */
        public String getDemandDomain() {
            return this.demandDomain;
        }

        /**
         * @return demandPrice
         */
        public Float getDemandPrice() {
            return this.demandPrice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return partnerDomain
         */
        public String getPartnerDomain() {
            return this.partnerDomain;
        }

        /**
         * @return payDomain
         */
        public String getPayDomain() {
            return this.payDomain;
        }

        /**
         * @return payPrice
         */
        public Float getPayPrice() {
            return this.payPrice;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return produceType
         */
        public Integer getProduceType() {
            return this.produceType;
        }

        /**
         * @return publishTime
         */
        public Long getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return purchaseStatus
         */
        public Integer getPurchaseStatus() {
            return this.purchaseStatus;
        }

        /**
         * @return servicePayPrice
         */
        public Float getServicePayPrice() {
            return this.servicePayPrice;
        }

        /**
         * @return settleBasePrice
         */
        public Float getSettleBasePrice() {
            return this.settleBasePrice;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer auditStatus; 
            private String bargainSellerMobile; 
            private Float bargainSellerPrice; 
            private String bizId; 
            private String demandDomain; 
            private Float demandPrice; 
            private String description; 
            private String email; 
            private String mobile; 
            private Integer orderType; 
            private String partnerDomain; 
            private String payDomain; 
            private Float payPrice; 
            private Long payTime; 
            private Integer produceType; 
            private Long publishTime; 
            private Integer purchaseStatus; 
            private Float servicePayPrice; 
            private Float settleBasePrice; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditStatus = model.auditStatus;
                this.bargainSellerMobile = model.bargainSellerMobile;
                this.bargainSellerPrice = model.bargainSellerPrice;
                this.bizId = model.bizId;
                this.demandDomain = model.demandDomain;
                this.demandPrice = model.demandPrice;
                this.description = model.description;
                this.email = model.email;
                this.mobile = model.mobile;
                this.orderType = model.orderType;
                this.partnerDomain = model.partnerDomain;
                this.payDomain = model.payDomain;
                this.payPrice = model.payPrice;
                this.payTime = model.payTime;
                this.produceType = model.produceType;
                this.publishTime = model.publishTime;
                this.purchaseStatus = model.purchaseStatus;
                this.servicePayPrice = model.servicePayPrice;
                this.settleBasePrice = model.settleBasePrice;
                this.status = model.status;
            } 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * BargainSellerMobile.
             */
            public Builder bargainSellerMobile(String bargainSellerMobile) {
                this.bargainSellerMobile = bargainSellerMobile;
                return this;
            }

            /**
             * BargainSellerPrice.
             */
            public Builder bargainSellerPrice(Float bargainSellerPrice) {
                this.bargainSellerPrice = bargainSellerPrice;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * DemandDomain.
             */
            public Builder demandDomain(String demandDomain) {
                this.demandDomain = demandDomain;
                return this;
            }

            /**
             * DemandPrice.
             */
            public Builder demandPrice(Float demandPrice) {
                this.demandPrice = demandPrice;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * PartnerDomain.
             */
            public Builder partnerDomain(String partnerDomain) {
                this.partnerDomain = partnerDomain;
                return this;
            }

            /**
             * PayDomain.
             */
            public Builder payDomain(String payDomain) {
                this.payDomain = payDomain;
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
             * PayTime.
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * ProduceType.
             */
            public Builder produceType(Integer produceType) {
                this.produceType = produceType;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(Long publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * PurchaseStatus.
             */
            public Builder purchaseStatus(Integer purchaseStatus) {
                this.purchaseStatus = purchaseStatus;
                return this;
            }

            /**
             * ServicePayPrice.
             */
            public Builder servicePayPrice(Float servicePayPrice) {
                this.servicePayPrice = servicePayPrice;
                return this;
            }

            /**
             * SettleBasePrice.
             */
            public Builder settleBasePrice(Float settleBasePrice) {
                this.settleBasePrice = settleBasePrice;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
