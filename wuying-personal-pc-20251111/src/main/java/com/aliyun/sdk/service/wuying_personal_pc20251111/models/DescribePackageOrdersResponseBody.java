// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribePackageOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackageOrdersResponseBody</p>
 */
public class DescribePackageOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribePackageOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageOrdersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Page page; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribePackageOrdersResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.page = model.page;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribePackageOrdersResponseBody build() {
            return new DescribePackageOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePackageOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePackageOrdersResponseBody</p>
     */
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("CreatorAliUid")
        private Long creatorAliUid;

        @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
        private String deliveryAddress;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("GmtCanceledTime")
        private String gmtCanceledTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtPaidTime")
        private String gmtPaidTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
        private String productSkuCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private String tradePrice;

        private OrderList(Builder builder) {
            this.amount = builder.amount;
            this.creatorAliUid = builder.creatorAliUid;
            this.deliveryAddress = builder.deliveryAddress;
            this.desktopId = builder.desktopId;
            this.gmtCanceledTime = builder.gmtCanceledTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtPaidTime = builder.gmtPaidTime;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.productCode = builder.productCode;
            this.productSkuCode = builder.productSkuCode;
            this.productType = builder.productType;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return creatorAliUid
         */
        public Long getCreatorAliUid() {
            return this.creatorAliUid;
        }

        /**
         * @return deliveryAddress
         */
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return gmtCanceledTime
         */
        public String getGmtCanceledTime() {
            return this.gmtCanceledTime;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtPaidTime
         */
        public String getGmtPaidTime() {
            return this.gmtPaidTime;
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
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productSkuCode
         */
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return tradePrice
         */
        public String getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Integer amount; 
            private Long creatorAliUid; 
            private String deliveryAddress; 
            private String desktopId; 
            private String gmtCanceledTime; 
            private String gmtCreateTime; 
            private String gmtPaidTime; 
            private String instanceId; 
            private String orderId; 
            private String orderStatus; 
            private String orderType; 
            private String productCode; 
            private String productSkuCode; 
            private String productType; 
            private String tradePrice; 

            private Builder() {
            } 

            private Builder(OrderList model) {
                this.amount = model.amount;
                this.creatorAliUid = model.creatorAliUid;
                this.deliveryAddress = model.deliveryAddress;
                this.desktopId = model.desktopId;
                this.gmtCanceledTime = model.gmtCanceledTime;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtPaidTime = model.gmtPaidTime;
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.orderType = model.orderType;
                this.productCode = model.productCode;
                this.productSkuCode = model.productSkuCode;
                this.productType = model.productType;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CreatorAliUid.
             */
            public Builder creatorAliUid(Long creatorAliUid) {
                this.creatorAliUid = creatorAliUid;
                return this;
            }

            /**
             * DeliveryAddress.
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder gmtCanceledTime(String gmtCanceledTime) {
                this.gmtCanceledTime = gmtCanceledTime;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder gmtPaidTime(String gmtPaidTime) {
                this.gmtPaidTime = gmtPaidTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductSkuCode.
             */
            public Builder productSkuCode(String productSkuCode) {
                this.productSkuCode = productSkuCode;
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
             * TradePrice.
             */
            public Builder tradePrice(String tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePackageOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePackageOrdersResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("OrderList")
        private java.util.List<OrderList> orderList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Page(Builder builder) {
            this.currentPage = builder.currentPage;
            this.orderList = builder.orderList;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return orderList
         */
        public java.util.List<OrderList> getOrderList() {
            return this.orderList;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long currentPage; 
            private java.util.List<OrderList> orderList; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.currentPage = model.currentPage;
                this.orderList = model.orderList;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * OrderList.
             */
            public Builder orderList(java.util.List<OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
