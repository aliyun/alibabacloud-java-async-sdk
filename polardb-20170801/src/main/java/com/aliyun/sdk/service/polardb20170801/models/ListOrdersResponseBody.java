// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ListOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrdersResponseBody</p>
 */
public class ListOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OrderList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OrderList> orderList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOrdersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderList = builder.orderList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderList
     */
    public java.util.List<OrderList> getOrderList() {
        return this.orderList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<OrderList> orderList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOrdersResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.orderList = model.orderList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries to return. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used to retrieve more results. If a single request does not return all results, this parameter is returned. You can pass the returned token in a subsequent request to continue retrieving results.</p>
         * 
         * <strong>example:</strong>
         * <p>212db86sca4384811e0b5e8707e******</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The order list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder orderList(java.util.List<OrderList> orderList) {
            this.orderList = orderList;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrdersResponseBody build() {
            return new ListOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrdersResponseBody</p>
     */
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ProduceCode")
        private String produceCode;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private OrderList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.produceCode = builder.produceCode;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return produceCode
         */
        public String getProduceCode() {
            return this.produceCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String aliUid; 
            private String chargeType; 
            private String commodityCode; 
            private String createdTime; 
            private String instanceId; 
            private String orderId; 
            private String orderStatus; 
            private String orderType; 
            private String produceCode; 
            private String region; 

            private Builder() {
            } 

            private Builder(OrderList model) {
                this.aliUid = model.aliUid;
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.orderType = model.orderType;
                this.produceCode = model.produceCode;
                this.region = model.region;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1910740440664****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
             * </li>
             * <li><p><strong>Prepaid</strong>: subscription.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The commodity code. Valid values:</p>
             * <ul>
             * <li>polardb_sub: subscription in the Chinese mainland.</li>
             * <li>polardb_sub_intl: subscription in Hong Kong (China) and outside China.</li>
             * <li>polardb_payg: pay-as-you-go in the Chinese mainland.</li>
             * <li>polardb_payg_intl: pay-as-you-go in Hong Kong (China) and outside China.</li>
             * <li>polardb_sub_jushita: Jushita subscription.</li>
             * <li>polardb_payg_jushita: Jushita pay-as-you-go.</li>
             * <li>polardb_sub_cainiao: Cainiao subscription.</li>
             * <li>polardb_payg_cainiao: Cainiao pay-as-you-go.<blockquote>
             * <ul>
             * <li>If you use an Alibaba Cloud China Website account, you can view only the commodity codes for the Chinese mainland.</li>
             * <li>If you use an Alibaba Cloud International Website account, you can view only the commodity codes for international regions.</li>
             * <li>If you use a Jushita account, you can view only the commodity codes for Jushita.</li>
             * <li>If you use a Cainiao account, you can view only the commodity codes for Cainiao.</li>
             * </ul>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polardb_payg_intl</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>The time is in the YYYY-MM-DDTHH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-31T16:09:13</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The cluster ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-uf6k532gav*******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>25808743077*****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The order status. Valid values:</p>
             * <ul>
             * <li><p><strong>pending</strong>: The task is waiting to start.</p>
             * </li>
             * <li><p><strong>create</strong>: The order has been placed and entered the production process.</p>
             * </li>
             * <li><p><strong>fail</strong>: Production failed.</p>
             * </li>
             * <li><p><strong>cancel</strong>: The order is canceled.</p>
             * </li>
             * <li><p><strong>success</strong>: Production succeeded.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>The order type. Valid values:</p>
             * <ul>
             * <li>BUY: new purchase.</li>
             * <li>UPGRADE: configuration change.</li>
             * <li>RENEW: renewal.</li>
             * <li>CONVERT: billing method conversion.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
             */
            public Builder produceCode(String produceCode) {
                this.produceCode = produceCode;
                return this;
            }

            /**
             * <p>The region information.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
}
