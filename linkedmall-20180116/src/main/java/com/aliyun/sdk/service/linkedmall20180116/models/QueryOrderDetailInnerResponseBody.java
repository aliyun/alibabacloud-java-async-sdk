// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderDetailInnerResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderDetailInnerResponseBody</p>
 */
public class QueryOrderDetailInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private QueryOrderDetailInnerResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderDetailInnerResponseBody create() {
        return builder().build();
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOrderDetailInnerResponseBody build() {
            return new QueryOrderDetailInnerResponseBody(this);
        } 

    } 

    public static class FundStructure extends TeaModel {
        @NameInMap("FundAmount")
        private Long fundAmount;

        @NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @NameInMap("FundType")
        private String fundType;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        @NameInMap("TbSubOrderId")
        private Long tbSubOrderId;

        private FundStructure(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
            this.lmOrderId = builder.lmOrderId;
            this.tbSubOrderId = builder.tbSubOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FundStructure create() {
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

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return tbSubOrderId
         */
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 
            private Long lmOrderId; 
            private Long tbSubOrderId; 

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

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * TbSubOrderId.
             */
            public Builder tbSubOrderId(Long tbSubOrderId) {
                this.tbSubOrderId = tbSubOrderId;
                return this;
            }

            public FundStructure build() {
                return new FundStructure(this);
            } 

        } 

    }
    public static class FundStructureModels extends TeaModel {
        @NameInMap("FundStructure")
        private java.util.List < FundStructure> fundStructure;

        private FundStructureModels(Builder builder) {
            this.fundStructure = builder.fundStructure;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FundStructureModels create() {
            return builder().build();
        }

        /**
         * @return fundStructure
         */
        public java.util.List < FundStructure> getFundStructure() {
            return this.fundStructure;
        }

        public static final class Builder {
            private java.util.List < FundStructure> fundStructure; 

            /**
             * FundStructure.
             */
            public Builder fundStructure(java.util.List < FundStructure> fundStructure) {
                this.fundStructure = fundStructure;
                return this;
            }

            public FundStructureModels build() {
                return new FundStructureModels(this);
            } 

        } 

    }
    public static class PostFee extends TeaModel {
        @NameInMap("FundAmount")
        private Long fundAmount;

        @NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @NameInMap("FundType")
        private String fundType;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        @NameInMap("TbSubOrderId")
        private Long tbSubOrderId;

        private PostFee(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
            this.lmOrderId = builder.lmOrderId;
            this.tbSubOrderId = builder.tbSubOrderId;
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

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return tbSubOrderId
         */
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 
            private Long lmOrderId; 
            private Long tbSubOrderId; 

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

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * TbSubOrderId.
             */
            public Builder tbSubOrderId(Long tbSubOrderId) {
                this.tbSubOrderId = tbSubOrderId;
                return this;
            }

            public PostFee build() {
                return new PostFee(this);
            } 

        } 

    }
    public static class ItemPrice extends TeaModel {
        @NameInMap("FundAmount")
        private Long fundAmount;

        @NameInMap("FundAmountMoney")
        private Long fundAmountMoney;

        @NameInMap("FundType")
        private String fundType;

        @NameInMap("TbOrderId")
        private Long tbOrderId;

        @NameInMap("TbSubOrderId")
        private Long tbSubOrderId;

        private ItemPrice(Builder builder) {
            this.fundAmount = builder.fundAmount;
            this.fundAmountMoney = builder.fundAmountMoney;
            this.fundType = builder.fundType;
            this.tbOrderId = builder.tbOrderId;
            this.tbSubOrderId = builder.tbSubOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPrice create() {
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

        /**
         * @return tbOrderId
         */
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        /**
         * @return tbSubOrderId
         */
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        public static final class Builder {
            private Long fundAmount; 
            private Long fundAmountMoney; 
            private String fundType; 
            private Long tbOrderId; 
            private Long tbSubOrderId; 

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

            /**
             * TbOrderId.
             */
            public Builder tbOrderId(Long tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            /**
             * TbSubOrderId.
             */
            public Builder tbSubOrderId(Long tbSubOrderId) {
                this.tbSubOrderId = tbSubOrderId;
                return this;
            }

            public ItemPrice build() {
                return new ItemPrice(this);
            } 

        } 

    }
    public static class ItemPriceList extends TeaModel {
        @NameInMap("ItemPrice")
        private java.util.List < ItemPrice> itemPrice;

        private ItemPriceList(Builder builder) {
            this.itemPrice = builder.itemPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPriceList create() {
            return builder().build();
        }

        /**
         * @return itemPrice
         */
        public java.util.List < ItemPrice> getItemPrice() {
            return this.itemPrice;
        }

        public static final class Builder {
            private java.util.List < ItemPrice> itemPrice; 

            /**
             * ItemPrice.
             */
            public Builder itemPrice(java.util.List < ItemPrice> itemPrice) {
                this.itemPrice = itemPrice;
                return this;
            }

            public ItemPriceList build() {
                return new ItemPriceList(this);
            } 

        } 

    }
    public static class SubItemOrder extends TeaModel {
        @NameInMap("ChannelCode")
        private String channelCode;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemPic")
        private String itemPic;

        @NameInMap("ItemPriceInfo")
        private String itemPriceInfo;

        @NameInMap("ItemPriceList")
        private ItemPriceList itemPriceList;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        @NameInMap("Number")
        private Integer number;

        @NameInMap("PayStatus")
        private Integer payStatus;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuName")
        private String skuName;

        @NameInMap("TbSubOrderId")
        private Long tbSubOrderId;

        @NameInMap("TotalPaymentInfo")
        private String totalPaymentInfo;

        private SubItemOrder(Builder builder) {
            this.channelCode = builder.channelCode;
            this.itemId = builder.itemId;
            this.itemPic = builder.itemPic;
            this.itemPriceInfo = builder.itemPriceInfo;
            this.itemPriceList = builder.itemPriceList;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.lmOrderId = builder.lmOrderId;
            this.number = builder.number;
            this.payStatus = builder.payStatus;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.tbSubOrderId = builder.tbSubOrderId;
            this.totalPaymentInfo = builder.totalPaymentInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubItemOrder create() {
            return builder().build();
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
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
         * @return itemPriceInfo
         */
        public String getItemPriceInfo() {
            return this.itemPriceInfo;
        }

        /**
         * @return itemPriceList
         */
        public ItemPriceList getItemPriceList() {
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
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
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
         * @return tbSubOrderId
         */
        public Long getTbSubOrderId() {
            return this.tbSubOrderId;
        }

        /**
         * @return totalPaymentInfo
         */
        public String getTotalPaymentInfo() {
            return this.totalPaymentInfo;
        }

        public static final class Builder {
            private String channelCode; 
            private Long itemId; 
            private String itemPic; 
            private String itemPriceInfo; 
            private ItemPriceList itemPriceList; 
            private String itemTitle; 
            private String lmItemId; 
            private Long lmOrderId; 
            private Integer number; 
            private Integer payStatus; 
            private Long skuId; 
            private String skuName; 
            private Long tbSubOrderId; 
            private String totalPaymentInfo; 

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
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
             * ItemPriceInfo.
             */
            public Builder itemPriceInfo(String itemPriceInfo) {
                this.itemPriceInfo = itemPriceInfo;
                return this;
            }

            /**
             * ItemPriceList.
             */
            public Builder itemPriceList(ItemPriceList itemPriceList) {
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
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * PayStatus.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
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
             * TbSubOrderId.
             */
            public Builder tbSubOrderId(Long tbSubOrderId) {
                this.tbSubOrderId = tbSubOrderId;
                return this;
            }

            /**
             * TotalPaymentInfo.
             */
            public Builder totalPaymentInfo(String totalPaymentInfo) {
                this.totalPaymentInfo = totalPaymentInfo;
                return this;
            }

            public SubItemOrder build() {
                return new SubItemOrder(this);
            } 

        } 

    }
    public static class SubItemOrderList extends TeaModel {
        @NameInMap("SubItemOrder")
        private java.util.List < SubItemOrder> subItemOrder;

        private SubItemOrderList(Builder builder) {
            this.subItemOrder = builder.subItemOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubItemOrderList create() {
            return builder().build();
        }

        /**
         * @return subItemOrder
         */
        public java.util.List < SubItemOrder> getSubItemOrder() {
            return this.subItemOrder;
        }

        public static final class Builder {
            private java.util.List < SubItemOrder> subItemOrder; 

            /**
             * SubItemOrder.
             */
            public Builder subItemOrder(java.util.List < SubItemOrder> subItemOrder) {
                this.subItemOrder = subItemOrder;
                return this;
            }

            public SubItemOrderList build() {
                return new SubItemOrderList(this);
            } 

        } 

    }
    public static class Order extends TeaModel {
        @NameInMap("ChannelBizType")
        private String channelBizType;

        @NameInMap("ChannelCode")
        private String channelCode;

        @NameInMap("ChannelOrderId")
        private String channelOrderId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("EnableStatus")
        private Integer enableStatus;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Eticket")
        private Boolean eticket;

        @NameInMap("ExtInfo")
        private java.util.Map < String, ? > extInfo;

        @NameInMap("FundStructureModels")
        private FundStructureModels fundStructureModels;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        @NameInMap("LogisticsAddress")
        private String logisticsAddress;

        @NameInMap("LogisticsCompName")
        private String logisticsCompName;

        @NameInMap("LogisticsMobilePhone")
        private String logisticsMobilePhone;

        @NameInMap("LogisticsNo")
        private String logisticsNo;

        @NameInMap("LogisticsStatus")
        private Integer logisticsStatus;

        @NameInMap("LogisticsStatusDesc")
        private String logisticsStatusDesc;

        @NameInMap("LogisticsUserName")
        private String logisticsUserName;

        @NameInMap("OrderAmount")
        private Long orderAmount;

        @NameInMap("OrderPayInfo")
        private String orderPayInfo;

        @NameInMap("PayStatus")
        private Integer payStatus;

        @NameInMap("PayWaterStatus")
        private Integer payWaterStatus;

        @NameInMap("PostFee")
        private PostFee postFee;

        @NameInMap("RefundStatus")
        private Integer refundStatus;

        @NameInMap("ResExtInfo")
        private String resExtInfo;

        @NameInMap("SellerId")
        private Long sellerId;

        @NameInMap("SellerNick")
        private String sellerNick;

        @NameInMap("Shipping")
        private String shipping;

        @NameInMap("ShopName")
        private String shopName;

        @NameInMap("SubItemOrderList")
        private SubItemOrderList subItemOrderList;

        @NameInMap("TbOrderId")
        private String tbOrderId;

        private Order(Builder builder) {
            this.channelBizType = builder.channelBizType;
            this.channelCode = builder.channelCode;
            this.channelOrderId = builder.channelOrderId;
            this.createDate = builder.createDate;
            this.enableStatus = builder.enableStatus;
            this.endTime = builder.endTime;
            this.eticket = builder.eticket;
            this.extInfo = builder.extInfo;
            this.fundStructureModels = builder.fundStructureModels;
            this.lmOrderId = builder.lmOrderId;
            this.logisticsAddress = builder.logisticsAddress;
            this.logisticsCompName = builder.logisticsCompName;
            this.logisticsMobilePhone = builder.logisticsMobilePhone;
            this.logisticsNo = builder.logisticsNo;
            this.logisticsStatus = builder.logisticsStatus;
            this.logisticsStatusDesc = builder.logisticsStatusDesc;
            this.logisticsUserName = builder.logisticsUserName;
            this.orderAmount = builder.orderAmount;
            this.orderPayInfo = builder.orderPayInfo;
            this.payStatus = builder.payStatus;
            this.payWaterStatus = builder.payWaterStatus;
            this.postFee = builder.postFee;
            this.refundStatus = builder.refundStatus;
            this.resExtInfo = builder.resExtInfo;
            this.sellerId = builder.sellerId;
            this.sellerNick = builder.sellerNick;
            this.shipping = builder.shipping;
            this.shopName = builder.shopName;
            this.subItemOrderList = builder.subItemOrderList;
            this.tbOrderId = builder.tbOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return channelBizType
         */
        public String getChannelBizType() {
            return this.channelBizType;
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return channelOrderId
         */
        public String getChannelOrderId() {
            return this.channelOrderId;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eticket
         */
        public Boolean getEticket() {
            return this.eticket;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, ? > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return fundStructureModels
         */
        public FundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return logisticsAddress
         */
        public String getLogisticsAddress() {
            return this.logisticsAddress;
        }

        /**
         * @return logisticsCompName
         */
        public String getLogisticsCompName() {
            return this.logisticsCompName;
        }

        /**
         * @return logisticsMobilePhone
         */
        public String getLogisticsMobilePhone() {
            return this.logisticsMobilePhone;
        }

        /**
         * @return logisticsNo
         */
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        /**
         * @return logisticsStatus
         */
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return logisticsStatusDesc
         */
        public String getLogisticsStatusDesc() {
            return this.logisticsStatusDesc;
        }

        /**
         * @return logisticsUserName
         */
        public String getLogisticsUserName() {
            return this.logisticsUserName;
        }

        /**
         * @return orderAmount
         */
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return orderPayInfo
         */
        public String getOrderPayInfo() {
            return this.orderPayInfo;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payWaterStatus
         */
        public Integer getPayWaterStatus() {
            return this.payWaterStatus;
        }

        /**
         * @return postFee
         */
        public PostFee getPostFee() {
            return this.postFee;
        }

        /**
         * @return refundStatus
         */
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return resExtInfo
         */
        public String getResExtInfo() {
            return this.resExtInfo;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return sellerNick
         */
        public String getSellerNick() {
            return this.sellerNick;
        }

        /**
         * @return shipping
         */
        public String getShipping() {
            return this.shipping;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return subItemOrderList
         */
        public SubItemOrderList getSubItemOrderList() {
            return this.subItemOrderList;
        }

        /**
         * @return tbOrderId
         */
        public String getTbOrderId() {
            return this.tbOrderId;
        }

        public static final class Builder {
            private String channelBizType; 
            private String channelCode; 
            private String channelOrderId; 
            private String createDate; 
            private Integer enableStatus; 
            private Long endTime; 
            private Boolean eticket; 
            private java.util.Map < String, ? > extInfo; 
            private FundStructureModels fundStructureModels; 
            private Long lmOrderId; 
            private String logisticsAddress; 
            private String logisticsCompName; 
            private String logisticsMobilePhone; 
            private String logisticsNo; 
            private Integer logisticsStatus; 
            private String logisticsStatusDesc; 
            private String logisticsUserName; 
            private Long orderAmount; 
            private String orderPayInfo; 
            private Integer payStatus; 
            private Integer payWaterStatus; 
            private PostFee postFee; 
            private Integer refundStatus; 
            private String resExtInfo; 
            private Long sellerId; 
            private String sellerNick; 
            private String shipping; 
            private String shopName; 
            private SubItemOrderList subItemOrderList; 
            private String tbOrderId; 

            /**
             * ChannelBizType.
             */
            public Builder channelBizType(String channelBizType) {
                this.channelBizType = channelBizType;
                return this;
            }

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * ChannelOrderId.
             */
            public Builder channelOrderId(String channelOrderId) {
                this.channelOrderId = channelOrderId;
                return this;
            }

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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Eticket.
             */
            public Builder eticket(Boolean eticket) {
                this.eticket = eticket;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, ? > extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * FundStructureModels.
             */
            public Builder fundStructureModels(FundStructureModels fundStructureModels) {
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
             * LogisticsAddress.
             */
            public Builder logisticsAddress(String logisticsAddress) {
                this.logisticsAddress = logisticsAddress;
                return this;
            }

            /**
             * LogisticsCompName.
             */
            public Builder logisticsCompName(String logisticsCompName) {
                this.logisticsCompName = logisticsCompName;
                return this;
            }

            /**
             * LogisticsMobilePhone.
             */
            public Builder logisticsMobilePhone(String logisticsMobilePhone) {
                this.logisticsMobilePhone = logisticsMobilePhone;
                return this;
            }

            /**
             * LogisticsNo.
             */
            public Builder logisticsNo(String logisticsNo) {
                this.logisticsNo = logisticsNo;
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
             * LogisticsStatusDesc.
             */
            public Builder logisticsStatusDesc(String logisticsStatusDesc) {
                this.logisticsStatusDesc = logisticsStatusDesc;
                return this;
            }

            /**
             * LogisticsUserName.
             */
            public Builder logisticsUserName(String logisticsUserName) {
                this.logisticsUserName = logisticsUserName;
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
             * OrderPayInfo.
             */
            public Builder orderPayInfo(String orderPayInfo) {
                this.orderPayInfo = orderPayInfo;
                return this;
            }

            /**
             * PayStatus.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * PayWaterStatus.
             */
            public Builder payWaterStatus(Integer payWaterStatus) {
                this.payWaterStatus = payWaterStatus;
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
             * RefundStatus.
             */
            public Builder refundStatus(Integer refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * ResExtInfo.
             */
            public Builder resExtInfo(String resExtInfo) {
                this.resExtInfo = resExtInfo;
                return this;
            }

            /**
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * SellerNick.
             */
            public Builder sellerNick(String sellerNick) {
                this.sellerNick = sellerNick;
                return this;
            }

            /**
             * Shipping.
             */
            public Builder shipping(String shipping) {
                this.shipping = shipping;
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
             * SubItemOrderList.
             */
            public Builder subItemOrderList(SubItemOrderList subItemOrderList) {
                this.subItemOrderList = subItemOrderList;
                return this;
            }

            /**
             * TbOrderId.
             */
            public Builder tbOrderId(String tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("order")
        private Order order;

        private Model(Builder builder) {
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Order getOrder() {
            return this.order;
        }

        public static final class Builder {
            private Order order; 

            /**
             * order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
