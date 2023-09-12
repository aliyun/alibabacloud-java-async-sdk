// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderDetail4DistributionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderDetail4DistributionResponseBody</p>
 */
public class QueryOrderDetail4DistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryOrderDetail4DistributionResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderDetail4DistributionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryOrderDetail4DistributionResponseBody build() {
            return new QueryOrderDetail4DistributionResponseBody(this);
        } 

    } 

    public static class ItemPrice extends TeaModel {
        @NameInMap("FundAmountMoney")
        private String fundAmountMoney;

        private ItemPrice(Builder builder) {
            this.fundAmountMoney = builder.fundAmountMoney;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPrice create() {
            return builder().build();
        }

        /**
         * @return fundAmountMoney
         */
        public String getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public static final class Builder {
            private String fundAmountMoney; 

            /**
             * FundAmountMoney.
             */
            public Builder fundAmountMoney(String fundAmountMoney) {
                this.fundAmountMoney = fundAmountMoney;
                return this;
            }

            public ItemPrice build() {
                return new ItemPrice(this);
            } 

        } 

    }
    public static class SubOrderList extends TeaModel {
        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemPic")
        private String itemPic;

        @NameInMap("ItemPrice")
        private java.util.List < ItemPrice> itemPrice;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LogisticsStatus")
        private String logisticsStatus;

        @NameInMap("MainDistributionOrderId")
        private String mainDistributionOrderId;

        @NameInMap("Number")
        private String number;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("SkuId")
        private String skuId;

        @NameInMap("SkuName")
        private String skuName;

        @NameInMap("SubDistributionOrderId")
        private String subDistributionOrderId;

        private SubOrderList(Builder builder) {
            this.itemId = builder.itemId;
            this.itemPic = builder.itemPic;
            this.itemPrice = builder.itemPrice;
            this.itemTitle = builder.itemTitle;
            this.logisticsStatus = builder.logisticsStatus;
            this.mainDistributionOrderId = builder.mainDistributionOrderId;
            this.number = builder.number;
            this.orderStatus = builder.orderStatus;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.subDistributionOrderId = builder.subDistributionOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemPic
         */
        public String getItemPic() {
            return this.itemPic;
        }

        /**
         * @return itemPrice
         */
        public java.util.List < ItemPrice> getItemPrice() {
            return this.itemPrice;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return logisticsStatus
         */
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return mainDistributionOrderId
         */
        public String getMainDistributionOrderId() {
            return this.mainDistributionOrderId;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        /**
         * @return subDistributionOrderId
         */
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

        public static final class Builder {
            private String itemId; 
            private String itemPic; 
            private java.util.List < ItemPrice> itemPrice; 
            private String itemTitle; 
            private String logisticsStatus; 
            private String mainDistributionOrderId; 
            private String number; 
            private String orderStatus; 
            private String skuId; 
            private String skuName; 
            private String subDistributionOrderId; 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemPic.
             */
            public Builder itemPic(String itemPic) {
                this.itemPic = itemPic;
                return this;
            }

            /**
             * ItemPrice.
             */
            public Builder itemPrice(java.util.List < ItemPrice> itemPrice) {
                this.itemPrice = itemPrice;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(String logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            /**
             * MainDistributionOrderId.
             */
            public Builder mainDistributionOrderId(String mainDistributionOrderId) {
                this.mainDistributionOrderId = mainDistributionOrderId;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
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
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            /**
             * SubDistributionOrderId.
             */
            public Builder subDistributionOrderId(String subDistributionOrderId) {
                this.subDistributionOrderId = subDistributionOrderId;
                return this;
            }

            public SubOrderList build() {
                return new SubOrderList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DistributionOrderId")
        private String distributionOrderId;

        @NameInMap("DistributorId")
        private String distributorId;

        @NameInMap("LogisticsStatus")
        private String logisticsStatus;

        @NameInMap("OrderAmount")
        private String orderAmount;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("SubOrderList")
        private java.util.List < SubOrderList> subOrderList;

        private Model(Builder builder) {
            this.createDate = builder.createDate;
            this.distributionOrderId = builder.distributionOrderId;
            this.distributorId = builder.distributorId;
            this.logisticsStatus = builder.logisticsStatus;
            this.orderAmount = builder.orderAmount;
            this.orderStatus = builder.orderStatus;
            this.subOrderList = builder.subOrderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return distributionOrderId
         */
        public String getDistributionOrderId() {
            return this.distributionOrderId;
        }

        /**
         * @return distributorId
         */
        public String getDistributorId() {
            return this.distributorId;
        }

        /**
         * @return logisticsStatus
         */
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return orderAmount
         */
        public String getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return subOrderList
         */
        public java.util.List < SubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

        public static final class Builder {
            private String createDate; 
            private String distributionOrderId; 
            private String distributorId; 
            private String logisticsStatus; 
            private String orderAmount; 
            private String orderStatus; 
            private java.util.List < SubOrderList> subOrderList; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DistributionOrderId.
             */
            public Builder distributionOrderId(String distributionOrderId) {
                this.distributionOrderId = distributionOrderId;
                return this;
            }

            /**
             * DistributorId.
             */
            public Builder distributorId(String distributorId) {
                this.distributorId = distributorId;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(String logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            /**
             * OrderAmount.
             */
            public Builder orderAmount(String orderAmount) {
                this.orderAmount = orderAmount;
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
             * SubOrderList.
             */
            public Builder subOrderList(java.util.List < SubOrderList> subOrderList) {
                this.subOrderList = subOrderList;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
