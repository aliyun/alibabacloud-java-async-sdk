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
 * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderAndPaymentListResponseBody</p>
 */
public class QueryOrderAndPaymentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LmOrderList")
    private LmOrderList lmOrderList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PostFee")
    private PostFee postFee;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryOrderAndPaymentListResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmOrderList = builder.lmOrderList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.postFee = builder.postFee;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderAndPaymentListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmOrderList
     */
    public LmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return postFee
     */
    public PostFee getPostFee() {
        return this.postFee;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private LmOrderList lmOrderList; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private PostFee postFee; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LmOrderList.
         */
        public Builder lmOrderList(LmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PostFee.
         */
        public Builder postFee(PostFee postFee) {
            this.postFee = postFee;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryOrderAndPaymentListResponseBody build() {
            return new QueryOrderAndPaymentListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
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
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class LmOrderListFundStructureModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundStructureModels")
        private java.util.List<FundStructureModels> fundStructureModels;

        private LmOrderListFundStructureModels(Builder builder) {
            this.fundStructureModels = builder.fundStructureModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderListFundStructureModels create() {
            return builder().build();
        }

        /**
         * @return fundStructureModels
         */
        public java.util.List<FundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

        public static final class Builder {
            private java.util.List<FundStructureModels> fundStructureModels; 

            /**
             * FundStructureModels.
             */
            public Builder fundStructureModels(java.util.List<FundStructureModels> fundStructureModels) {
                this.fundStructureModels = fundStructureModels;
                return this;
            }

            public LmOrderListFundStructureModels build() {
                return new LmOrderListFundStructureModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class LmOrderListPostFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundAmount")
        private Long fundAmount;

        @com.aliyun.core.annotation.NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @com.aliyun.core.annotation.NameInMap("FundType")
        private String fundType;

        private LmOrderListPostFee(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderListPostFee create() {
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

            public LmOrderListPostFee build() {
                return new LmOrderListPostFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
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
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class SubOrderListItemPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemPriceList")
        private java.util.List<ItemPriceList> itemPriceList;

        private SubOrderListItemPriceList(Builder builder) {
            this.itemPriceList = builder.itemPriceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderListItemPriceList create() {
            return builder().build();
        }

        /**
         * @return itemPriceList
         */
        public java.util.List<ItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

        public static final class Builder {
            private java.util.List<ItemPriceList> itemPriceList; 

            /**
             * ItemPriceList.
             */
            public Builder itemPriceList(java.util.List<ItemPriceList> itemPriceList) {
                this.itemPriceList = itemPriceList;
                return this;
            }

            public SubOrderListItemPriceList build() {
                return new SubOrderListItemPriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class SubOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Integer enableStatus;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemPic")
        private String itemPic;

        @com.aliyun.core.annotation.NameInMap("ItemPriceList")
        private SubOrderListItemPriceList itemPriceList;

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
        private Long skuId;

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
        public SubOrderListItemPriceList getItemPriceList() {
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
        public Long getSkuId() {
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
            private SubOrderListItemPriceList itemPriceList; 
            private String itemTitle; 
            private String lmItemId; 
            private Long lmOrderId; 
            private Long number; 
            private Integer orderStatus; 
            private Long skuId; 
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
            public Builder itemPriceList(SubOrderListItemPriceList itemPriceList) {
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
             * SkuId.
             */
            public Builder skuId(Long skuId) {
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
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class LmOrderListSubOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubOrderList")
        private java.util.List<SubOrderList> subOrderList;

        private LmOrderListSubOrderList(Builder builder) {
            this.subOrderList = builder.subOrderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderListSubOrderList create() {
            return builder().build();
        }

        /**
         * @return subOrderList
         */
        public java.util.List<SubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

        public static final class Builder {
            private java.util.List<SubOrderList> subOrderList; 

            /**
             * SubOrderList.
             */
            public Builder subOrderList(java.util.List<SubOrderList> subOrderList) {
                this.subOrderList = subOrderList;
                return this;
            }

            public LmOrderListSubOrderList build() {
                return new LmOrderListSubOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class LmOrderListLmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Integer enableStatus;

        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

        @com.aliyun.core.annotation.NameInMap("FundStructureModels")
        private LmOrderListFundStructureModels fundStructureModels;

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
        private LmOrderListPostFee postFee;

        @com.aliyun.core.annotation.NameInMap("ShopName")
        private String shopName;

        @com.aliyun.core.annotation.NameInMap("SubOrderList")
        private LmOrderListSubOrderList subOrderList;

        @com.aliyun.core.annotation.NameInMap("TbOrderId")
        private Long tbOrderId;

        private LmOrderListLmOrderList(Builder builder) {
            this.createDate = builder.createDate;
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

        public static LmOrderListLmOrderList create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
        public LmOrderListFundStructureModels getFundStructureModels() {
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
        public LmOrderListPostFee getPostFee() {
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
        public LmOrderListSubOrderList getSubOrderList() {
            return this.subOrderList;
        }

        /**
         * @return tbOrderId
         */
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public static final class Builder {
            private String createDate; 
            private Integer enableStatus; 
            private String extJson; 
            private LmOrderListFundStructureModels fundStructureModels; 
            private Long lmOrderId; 
            private String lmPaymentId; 
            private Integer logisticsStatus; 
            private Long orderAmount; 
            private Integer orderStatus; 
            private LmOrderListPostFee postFee; 
            private String shopName; 
            private LmOrderListSubOrderList subOrderList; 
            private Long tbOrderId; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
            public Builder fundStructureModels(LmOrderListFundStructureModels fundStructureModels) {
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
            public Builder postFee(LmOrderListPostFee postFee) {
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
            public Builder subOrderList(LmOrderListSubOrderList subOrderList) {
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

            public LmOrderListLmOrderList build() {
                return new LmOrderListLmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
     */
    public static class LmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private java.util.List<LmOrderListLmOrderList> lmOrderList;

        private LmOrderList(Builder builder) {
            this.lmOrderList = builder.lmOrderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderList create() {
            return builder().build();
        }

        /**
         * @return lmOrderList
         */
        public java.util.List<LmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

        public static final class Builder {
            private java.util.List<LmOrderListLmOrderList> lmOrderList; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List<LmOrderListLmOrderList> lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            public LmOrderList build() {
                return new LmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderAndPaymentListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderAndPaymentListResponseBody</p>
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
}
