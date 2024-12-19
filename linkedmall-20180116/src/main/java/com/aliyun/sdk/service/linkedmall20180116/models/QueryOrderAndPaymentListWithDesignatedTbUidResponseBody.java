// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
 */
public class QueryOrderAndPaymentListWithDesignatedTbUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryOrderAndPaymentListWithDesignatedTbUidResponseBody(Builder builder) {
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

    public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBody create() {
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
    public java.util.List<Model> getModel() {
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
        private java.util.List<Model> model; 
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
        public Builder model(java.util.List<Model> model) {
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
         * <p>pageSize</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody build() {
            return new QueryOrderAndPaymentListWithDesignatedTbUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
     */
    public static class FundStructureModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundAmount")
        private Long fundAmount;

        @com.aliyun.core.annotation.NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        private FundStructureModels(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FundStructureModels create() {
            return builder().build();
        }

        /**
         * @return fundAmount
         */
        public Long getFundAmount() {
            return this.fundAmount;
        }

        /**
         * @return fundAmountMoney
         */
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        /**
         * @return fundType
         */
        public String getFundType() {
            return this.fundType;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 

            /**
             * FundAmount.
             */
            public Builder fundAmount(Long fundAmount) {
                this.fundAmount = fundAmount;
                return this;
            }

            /**
             * FundAmountMoney.
             */
            public Builder fundAmountMoney(Long fundAmountMoney) {
                this.fundAmountMoney = fundAmountMoney;
                return this;
            }

            /**
             * FundType.
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            public FundStructureModels build() {
                return new FundStructureModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
     */
    public static class PostFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundAmount")
        private Long fundAmount;

        @com.aliyun.core.annotation.NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        private PostFee(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostFee create() {
            return builder().build();
        }

        /**
         * @return fundAmount
         */
        public Long getFundAmount() {
            return this.fundAmount;
        }

        /**
         * @return fundAmountMoney
         */
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        /**
         * @return fundType
         */
        public String getFundType() {
            return this.fundType;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 

            /**
             * FundAmount.
             */
            public Builder fundAmount(Long fundAmount) {
                this.fundAmount = fundAmount;
                return this;
            }

            /**
             * FundAmountMoney.
             */
            public Builder fundAmountMoney(Long fundAmountMoney) {
                this.fundAmountMoney = fundAmountMoney;
                return this;
            }

            /**
             * FundType.
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            public PostFee build() {
                return new PostFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
     */
    public static class ItemPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundAmount")
        private Long fundAmount;

        @com.aliyun.core.annotation.NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        private ItemPriceList(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPriceList create() {
            return builder().build();
        }

        /**
         * @return fundAmount
         */
        public Long getFundAmount() {
            return this.fundAmount;
        }

        /**
         * @return fundAmountMoney
         */
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        /**
         * @return fundType
         */
        public String getFundType() {
            return this.fundType;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 

            /**
             * FundAmount.
             */
            public Builder fundAmount(Long fundAmount) {
                this.fundAmount = fundAmount;
                return this;
            }

            /**
             * FundAmountMoney.
             */
            public Builder fundAmountMoney(Long fundAmountMoney) {
                this.fundAmountMoney = fundAmountMoney;
                return this;
            }

            /**
             * FundType.
             */
            public Builder fundType(String fundType) {
                this.fundType = fundType;
                return this;
            }

            public ItemPriceList build() {
                return new ItemPriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
     */
    public static class SubOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Integer enableStatus;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemPic")
        private String itemPic;

        @com.aliyun.core.annotation.NameInMap("ItemPriceList")
        private java.util.List<ItemPriceList> itemPriceList;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private Long lmOrderId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Long number;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        @com.aliyun.core.annotation.NameInMap("TbOrderId")
        private Long tbOrderId;

        private SubOrderList(Builder builder) {
            this.enableStatus = builder.enableStatus;
            this.itemId = builder.itemId;
            this.itemPic = builder.itemPic;
            this.itemPriceList = builder.itemPriceList;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.lmOrderId = builder.lmOrderId;
            this.number = builder.number;
            this.orderStatus = builder.orderStatus;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.tbOrderId = builder.tbOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderList create() {
            return builder().build();
        }

        /**
         * @return enableStatus
         */
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemPic
         */
        public String getItemPic() {
            return this.itemPic;
        }

        /**
         * @return itemPriceList
         */
        public java.util.List<ItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return number
         */
        public Long getNumber() {
            return this.number;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
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
         * @return tbOrderId
         */
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public static final class Builder {
            private Integer enableStatus; 
            private Long itemId; 
            private String itemPic; 
            private java.util.List<ItemPriceList> itemPriceList; 
            private String itemTitle; 
            private String lmItemId; 
            private Long lmOrderId; 
            private Long number; 
            private Integer orderStatus; 
            private String skuId; 
            private String skuName; 
            private Long tbOrderId; 

            /**
             * EnableStatus.
             */
            public Builder enableStatus(Integer enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
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
             * ItemPriceList.
             */
            public Builder itemPriceList(java.util.List<ItemPriceList> itemPriceList) {
                this.itemPriceList = itemPriceList;
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Long number) {
                this.number = number;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>skuId</p>
             * 
             * <strong>example:</strong>
             * <p>477***60</p>
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
             * TbOrderId.
             */
            public Builder tbOrderId(Long tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            public SubOrderList build() {
                return new SubOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListWithDesignatedTbUidResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Integer enableStatus;

        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

        @com.aliyun.core.annotation.NameInMap("FundStructureModels")
        private java.util.List<FundStructureModels> fundStructureModels;

        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private Long lmOrderId;

        @com.aliyun.core.annotation.NameInMap("LmPaymentId")
        private String lmPaymentId;

        @com.aliyun.core.annotation.NameInMap("LogisticsStatus")
        private Integer logisticsStatus;

        @com.aliyun.core.annotation.NameInMap("OrderAmount")
        private Long orderAmount;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("PostFee")
        private PostFee postFee;

        @com.aliyun.core.annotation.NameInMap("ShopName")
        private String shopName;

        @com.aliyun.core.annotation.NameInMap("SubOrderList")
        private java.util.List<SubOrderList> subOrderList;

        @com.aliyun.core.annotation.NameInMap("TbOrderId")
        private Long tbOrderId;

        private Model(Builder builder) {
            this.createTime = builder.createTime;
            this.enableStatus = builder.enableStatus;
            this.extJson = builder.extJson;
            this.fundStructureModels = builder.fundStructureModels;
            this.lmOrderId = builder.lmOrderId;
            this.lmPaymentId = builder.lmPaymentId;
            this.logisticsStatus = builder.logisticsStatus;
            this.orderAmount = builder.orderAmount;
            this.orderStatus = builder.orderStatus;
            this.postFee = builder.postFee;
            this.shopName = builder.shopName;
            this.subOrderList = builder.subOrderList;
            this.tbOrderId = builder.tbOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableStatus
         */
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
        }

        /**
         * @return fundStructureModels
         */
        public java.util.List<FundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return lmPaymentId
         */
        public String getLmPaymentId() {
            return this.lmPaymentId;
        }

        /**
         * @return logisticsStatus
         */
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return orderAmount
         */
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return postFee
         */
        public PostFee getPostFee() {
            return this.postFee;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return subOrderList
         */
        public java.util.List<SubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

        /**
         * @return tbOrderId
         */
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public static final class Builder {
            private String createTime; 
            private Integer enableStatus; 
            private String extJson; 
            private java.util.List<FundStructureModels> fundStructureModels; 
            private Long lmOrderId; 
            private String lmPaymentId; 
            private Integer logisticsStatus; 
            private Long orderAmount; 
            private Integer orderStatus; 
            private PostFee postFee; 
            private String shopName; 
            private java.util.List<SubOrderList> subOrderList; 
            private Long tbOrderId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(Integer enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * ExtJson.
             */
            public Builder extJson(String extJson) {
                this.extJson = extJson;
                return this;
            }

            /**
             * FundStructureModels.
             */
            public Builder fundStructureModels(java.util.List<FundStructureModels> fundStructureModels) {
                this.fundStructureModels = fundStructureModels;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * LmPaymentId.
             */
            public Builder lmPaymentId(String lmPaymentId) {
                this.lmPaymentId = lmPaymentId;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(Integer logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            /**
             * OrderAmount.
             */
            public Builder orderAmount(Long orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * PostFee.
             */
            public Builder postFee(PostFee postFee) {
                this.postFee = postFee;
                return this;
            }

            /**
             * ShopName.
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * SubOrderList.
             */
            public Builder subOrderList(java.util.List<SubOrderList> subOrderList) {
                this.subOrderList = subOrderList;
                return this;
            }

            /**
             * TbOrderId.
             */
            public Builder tbOrderId(Long tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
