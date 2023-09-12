// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenderDistributionOrderResponseBody} extends {@link TeaModel}
 *
 * <p>RenderDistributionOrderResponseBody</p>
 */
public class RenderDistributionOrderResponseBody extends TeaModel {
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

    private RenderDistributionOrderResponseBody(Builder builder) {
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

    public static RenderDistributionOrderResponseBody create() {
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

        public RenderDistributionOrderResponseBody build() {
            return new RenderDistributionOrderResponseBody(this);
        } 

    } 

    public static class AddressInfos extends TeaModel {
        @NameInMap("AddressDetail")
        private String addressDetail;

        @NameInMap("AddressId")
        private Long addressId;

        @NameInMap("DivisionCode")
        private String divisionCode;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Receiver")
        private String receiver;

        @NameInMap("ReceiverPhone")
        private String receiverPhone;

        @NameInMap("TownDivisionCode")
        private String townDivisionCode;

        private AddressInfos(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.addressId = builder.addressId;
            this.divisionCode = builder.divisionCode;
            this.isDefault = builder.isDefault;
            this.receiver = builder.receiver;
            this.receiverPhone = builder.receiverPhone;
            this.townDivisionCode = builder.townDivisionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressInfos create() {
            return builder().build();
        }

        /**
         * @return addressDetail
         */
        public String getAddressDetail() {
            return this.addressDetail;
        }

        /**
         * @return addressId
         */
        public Long getAddressId() {
            return this.addressId;
        }

        /**
         * @return divisionCode
         */
        public String getDivisionCode() {
            return this.divisionCode;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return receiverPhone
         */
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        /**
         * @return townDivisionCode
         */
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public static final class Builder {
            private String addressDetail; 
            private Long addressId; 
            private String divisionCode; 
            private Boolean isDefault; 
            private String receiver; 
            private String receiverPhone; 
            private String townDivisionCode; 

            /**
             * AddressDetail.
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * AddressId.
             */
            public Builder addressId(Long addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * DivisionCode.
             */
            public Builder divisionCode(String divisionCode) {
                this.divisionCode = divisionCode;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * ReceiverPhone.
             */
            public Builder receiverPhone(String receiverPhone) {
                this.receiverPhone = receiverPhone;
                return this;
            }

            /**
             * TownDivisionCode.
             */
            public Builder townDivisionCode(String townDivisionCode) {
                this.townDivisionCode = townDivisionCode;
                return this;
            }

            public AddressInfos build() {
                return new AddressInfos(this);
            } 

        } 

    }
    public static class DeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Id")
        private String id;

        @NameInMap("PostFee")
        private Long postFee;

        @NameInMap("ServiceType")
        private Long serviceType;

        private DeliveryInfos(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.postFee = builder.postFee;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryInfos create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return postFee
         */
        public Long getPostFee() {
            return this.postFee;
        }

        /**
         * @return serviceType
         */
        public Long getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private Long postFee; 
            private Long serviceType; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * PostFee.
             */
            public Builder postFee(Long postFee) {
                this.postFee = postFee;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(Long serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public DeliveryInfos build() {
                return new DeliveryInfos(this);
            } 

        } 

    }
    public static class InvoiceInfo extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Type")
        private String type;

        private InvoiceInfo(Builder builder) {
            this.desc = builder.desc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceInfo create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String type; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InvoiceInfo build() {
                return new InvoiceInfo(this);
            } 

        } 

    }
    public static class AvailableItems extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmShopId")
        private Long lmShopId;

        @NameInMap("Number")
        private Integer number;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Removed")
        private Boolean removed;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("UserPayFee")
        private Long userPayFee;

        private AvailableItems(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lmShopId = builder.lmShopId;
            this.number = builder.number;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.removed = builder.removed;
            this.skuId = builder.skuId;
            this.tbSellerId = builder.tbSellerId;
            this.userPayFee = builder.userPayFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmShopId
         */
        public Long getLmShopId() {
            return this.lmShopId;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return removed
         */
        public Boolean getRemoved() {
            return this.removed;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return userPayFee
         */
        public Long getUserPayFee() {
            return this.userPayFee;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Long lmShopId; 
            private Integer number; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Boolean removed; 
            private Long skuId; 
            private Long tbSellerId; 
            private Long userPayFee; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmShopId.
             */
            public Builder lmShopId(Long lmShopId) {
                this.lmShopId = lmShopId;
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Removed.
             */
            public Builder removed(Boolean removed) {
                this.removed = removed;
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
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * UserPayFee.
             */
            public Builder userPayFee(Long userPayFee) {
                this.userPayFee = userPayFee;
                return this;
            }

            public AvailableItems build() {
                return new AvailableItems(this);
            } 

        } 

    }
    public static class ItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        private java.util.List < AvailableItems> availableItems;

        @NameInMap("CanUse")
        private Boolean canUse;

        @NameInMap("DiscountPrice")
        private Long discountPrice;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
        private String level;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("PromotionType")
        private String promotionType;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Selected")
        private Boolean selected;

        @NameInMap("SkuIds")
        private java.util.List < Long > skuIds;

        @NameInMap("SpecialPrice")
        private Long specialPrice;

        @NameInMap("SubBizCode")
        private String subBizCode;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @NameInMap("UseStartTime")
        private Long useStartTime;

        private ItemPromInstVOS(Builder builder) {
            this.availableItems = builder.availableItems;
            this.canUse = builder.canUse;
            this.discountPrice = builder.discountPrice;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.lmItemId = builder.lmItemId;
            this.promotionName = builder.promotionName;
            this.promotionType = builder.promotionType;
            this.reason = builder.reason;
            this.selected = builder.selected;
            this.skuIds = builder.skuIds;
            this.specialPrice = builder.specialPrice;
            this.subBizCode = builder.subBizCode;
            this.tbSellerId = builder.tbSellerId;
            this.thresholdPrice = builder.thresholdPrice;
            this.useStartTime = builder.useStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPromInstVOS create() {
            return builder().build();
        }

        /**
         * @return availableItems
         */
        public java.util.List < AvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        /**
         * @return canUse
         */
        public Boolean getCanUse() {
            return this.canUse;
        }

        /**
         * @return discountPrice
         */
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return skuIds
         */
        public java.util.List < Long > getSkuIds() {
            return this.skuIds;
        }

        /**
         * @return specialPrice
         */
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return thresholdPrice
         */
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        /**
         * @return useStartTime
         */
        public Long getUseStartTime() {
            return this.useStartTime;
        }

        public static final class Builder {
            private java.util.List < AvailableItems> availableItems; 
            private Boolean canUse; 
            private Long discountPrice; 
            private Long expireTime; 
            private String instanceId; 
            private String level; 
            private String lmItemId; 
            private String promotionName; 
            private String promotionType; 
            private String reason; 
            private Boolean selected; 
            private java.util.List < Long > skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List < AvailableItems> availableItems) {
                this.availableItems = availableItems;
                return this;
            }

            /**
             * CanUse.
             */
            public Builder canUse(Boolean canUse) {
                this.canUse = canUse;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Long discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * PromotionType.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * SkuIds.
             */
            public Builder skuIds(java.util.List < Long > skuIds) {
                this.skuIds = skuIds;
                return this;
            }

            /**
             * SpecialPrice.
             */
            public Builder specialPrice(Long specialPrice) {
                this.specialPrice = specialPrice;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            /**
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * ThresholdPrice.
             */
            public Builder thresholdPrice(Long thresholdPrice) {
                this.thresholdPrice = thresholdPrice;
                return this;
            }

            /**
             * UseStartTime.
             */
            public Builder useStartTime(Long useStartTime) {
                this.useStartTime = useStartTime;
                return this;
            }

            public ItemPromInstVOS build() {
                return new ItemPromInstVOS(this);
            } 

        } 

    }
    public static class ItemInfos extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("DistributionSupplierId")
        private String distributionSupplierId;

        @NameInMap("DistributorId")
        private String distributorId;

        @NameInMap("Features")
        private java.util.Map < String, String > features;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        private java.util.List < ItemPromInstVOS> itemPromInstVOS;

        @NameInMap("ItemUrl")
        private String itemUrl;

        @NameInMap("Message")
        private String message;

        @NameInMap("Price")
        private Long price;

        @NameInMap("PromotionFee")
        private Long promotionFee;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuName")
        private String skuName;

        @NameInMap("VirtualItemType")
        private String virtualItemType;

        private ItemInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.distributionMallId = builder.distributionMallId;
            this.distributionSupplierId = builder.distributionSupplierId;
            this.distributorId = builder.distributorId;
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemPromInstVOS = builder.itemPromInstVOS;
            this.itemUrl = builder.itemUrl;
            this.message = builder.message;
            this.price = builder.price;
            this.promotionFee = builder.promotionFee;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.virtualItemType = builder.virtualItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfos create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return distributionSupplierId
         */
        public String getDistributionSupplierId() {
            return this.distributionSupplierId;
        }

        /**
         * @return distributorId
         */
        public String getDistributorId() {
            return this.distributorId;
        }

        /**
         * @return features
         */
        public java.util.Map < String, String > getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemPicUrl
         */
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        /**
         * @return itemPromInstVOS
         */
        public java.util.List < ItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return promotionFee
         */
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservePrice
         */
        public Long getReservePrice() {
            return this.reservePrice;
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
         * @return virtualItemType
         */
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public static final class Builder {
            private Boolean canSell; 
            private String distributionMallId; 
            private String distributionSupplierId; 
            private String distributorId; 
            private java.util.Map < String, String > features; 
            private String itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private java.util.List < ItemPromInstVOS> itemPromInstVOS; 
            private String itemUrl; 
            private String message; 
            private Long price; 
            private Long promotionFee; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long skuId; 
            private String skuName; 
            private String virtualItemType; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * DistributionSupplierId.
             */
            public Builder distributionSupplierId(String distributionSupplierId) {
                this.distributionSupplierId = distributionSupplierId;
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
             * Features.
             */
            public Builder features(java.util.Map < String, String > features) {
                this.features = features;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemPicUrl.
             */
            public Builder itemPicUrl(String itemPicUrl) {
                this.itemPicUrl = itemPicUrl;
                return this;
            }

            /**
             * ItemPromInstVOS.
             */
            public Builder itemPromInstVOS(java.util.List < ItemPromInstVOS> itemPromInstVOS) {
                this.itemPromInstVOS = itemPromInstVOS;
                return this;
            }

            /**
             * ItemUrl.
             */
            public Builder itemUrl(String itemUrl) {
                this.itemUrl = itemUrl;
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
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * PromotionFee.
             */
            public Builder promotionFee(Long promotionFee) {
                this.promotionFee = promotionFee;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservePrice.
             */
            public Builder reservePrice(Long reservePrice) {
                this.reservePrice = reservePrice;
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
             * VirtualItemType.
             */
            public Builder virtualItemType(String virtualItemType) {
                this.virtualItemType = virtualItemType;
                return this;
            }

            public ItemInfos build() {
                return new ItemInfos(this);
            } 

        } 

    }
    public static class ShopPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmShopId")
        private Long lmShopId;

        @NameInMap("Number")
        private Integer number;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Removed")
        private Boolean removed;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("UserPayFee")
        private Long userPayFee;

        private ShopPromInstVOSAvailableItems(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lmShopId = builder.lmShopId;
            this.number = builder.number;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.removed = builder.removed;
            this.skuId = builder.skuId;
            this.tbSellerId = builder.tbSellerId;
            this.userPayFee = builder.userPayFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopPromInstVOSAvailableItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmShopId
         */
        public Long getLmShopId() {
            return this.lmShopId;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return removed
         */
        public Boolean getRemoved() {
            return this.removed;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return userPayFee
         */
        public Long getUserPayFee() {
            return this.userPayFee;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Long lmShopId; 
            private Integer number; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Boolean removed; 
            private Long skuId; 
            private Long tbSellerId; 
            private Long userPayFee; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmShopId.
             */
            public Builder lmShopId(Long lmShopId) {
                this.lmShopId = lmShopId;
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Removed.
             */
            public Builder removed(Boolean removed) {
                this.removed = removed;
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
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * UserPayFee.
             */
            public Builder userPayFee(Long userPayFee) {
                this.userPayFee = userPayFee;
                return this;
            }

            public ShopPromInstVOSAvailableItems build() {
                return new ShopPromInstVOSAvailableItems(this);
            } 

        } 

    }
    public static class ShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        private java.util.List < ShopPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        private Boolean canUse;

        @NameInMap("DiscountPrice")
        private Long discountPrice;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
        private String level;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("PromotionType")
        private String promotionType;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Selected")
        private Boolean selected;

        @NameInMap("SkuIds")
        private java.util.List < Long > skuIds;

        @NameInMap("SpecialPrice")
        private Long specialPrice;

        @NameInMap("SubBizCode")
        private String subBizCode;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @NameInMap("UseStartTime")
        private Long useStartTime;

        private ShopPromInstVOS(Builder builder) {
            this.availableItems = builder.availableItems;
            this.canUse = builder.canUse;
            this.discountPrice = builder.discountPrice;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.lmItemId = builder.lmItemId;
            this.promotionName = builder.promotionName;
            this.promotionType = builder.promotionType;
            this.reason = builder.reason;
            this.selected = builder.selected;
            this.skuIds = builder.skuIds;
            this.specialPrice = builder.specialPrice;
            this.subBizCode = builder.subBizCode;
            this.tbSellerId = builder.tbSellerId;
            this.thresholdPrice = builder.thresholdPrice;
            this.useStartTime = builder.useStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopPromInstVOS create() {
            return builder().build();
        }

        /**
         * @return availableItems
         */
        public java.util.List < ShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        /**
         * @return canUse
         */
        public Boolean getCanUse() {
            return this.canUse;
        }

        /**
         * @return discountPrice
         */
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return skuIds
         */
        public java.util.List < Long > getSkuIds() {
            return this.skuIds;
        }

        /**
         * @return specialPrice
         */
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return thresholdPrice
         */
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        /**
         * @return useStartTime
         */
        public Long getUseStartTime() {
            return this.useStartTime;
        }

        public static final class Builder {
            private java.util.List < ShopPromInstVOSAvailableItems> availableItems; 
            private Boolean canUse; 
            private Long discountPrice; 
            private Long expireTime; 
            private String instanceId; 
            private String level; 
            private String lmItemId; 
            private String promotionName; 
            private String promotionType; 
            private String reason; 
            private Boolean selected; 
            private java.util.List < Long > skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List < ShopPromInstVOSAvailableItems> availableItems) {
                this.availableItems = availableItems;
                return this;
            }

            /**
             * CanUse.
             */
            public Builder canUse(Boolean canUse) {
                this.canUse = canUse;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Long discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * PromotionType.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * SkuIds.
             */
            public Builder skuIds(java.util.List < Long > skuIds) {
                this.skuIds = skuIds;
                return this;
            }

            /**
             * SpecialPrice.
             */
            public Builder specialPrice(Long specialPrice) {
                this.specialPrice = specialPrice;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            /**
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * ThresholdPrice.
             */
            public Builder thresholdPrice(Long thresholdPrice) {
                this.thresholdPrice = thresholdPrice;
                return this;
            }

            /**
             * UseStartTime.
             */
            public Builder useStartTime(Long useStartTime) {
                this.useStartTime = useStartTime;
                return this;
            }

            public ShopPromInstVOS build() {
                return new ShopPromInstVOS(this);
            } 

        } 

    }
    public static class RenderOrderInfos extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("DeliveryInfos")
        private java.util.List < DeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        private java.util.Map < String, String > extInfo;

        @NameInMap("InvoiceInfo")
        private InvoiceInfo invoiceInfo;

        @NameInMap("ItemInfos")
        private java.util.List < ItemInfos> itemInfos;

        @NameInMap("Message")
        private String message;

        @NameInMap("ShopPromInstVOS")
        private java.util.List < ShopPromInstVOS> shopPromInstVOS;

        private RenderOrderInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.deliveryInfos = builder.deliveryInfos;
            this.extInfo = builder.extInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.itemInfos = builder.itemInfos;
            this.message = builder.message;
            this.shopPromInstVOS = builder.shopPromInstVOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderOrderInfos create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return deliveryInfos
         */
        public java.util.List < DeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, String > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return itemInfos
         */
        public java.util.List < ItemInfos> getItemInfos() {
            return this.itemInfos;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return shopPromInstVOS
         */
        public java.util.List < ShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.List < DeliveryInfos> deliveryInfos; 
            private java.util.Map < String, String > extInfo; 
            private InvoiceInfo invoiceInfo; 
            private java.util.List < ItemInfos> itemInfos; 
            private String message; 
            private java.util.List < ShopPromInstVOS> shopPromInstVOS; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * DeliveryInfos.
             */
            public Builder deliveryInfos(java.util.List < DeliveryInfos> deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, String > extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * InvoiceInfo.
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * ItemInfos.
             */
            public Builder itemInfos(java.util.List < ItemInfos> itemInfos) {
                this.itemInfos = itemInfos;
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
             * ShopPromInstVOS.
             */
            public Builder shopPromInstVOS(java.util.List < ShopPromInstVOS> shopPromInstVOS) {
                this.shopPromInstVOS = shopPromInstVOS;
                return this;
            }

            public RenderOrderInfos build() {
                return new RenderOrderInfos(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfosDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Id")
        private String id;

        @NameInMap("PostFee")
        private Long postFee;

        @NameInMap("ServiceType")
        private Long serviceType;

        private UnsellableRenderOrderInfosDeliveryInfos(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.postFee = builder.postFee;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosDeliveryInfos create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return postFee
         */
        public Long getPostFee() {
            return this.postFee;
        }

        /**
         * @return serviceType
         */
        public Long getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private Long postFee; 
            private Long serviceType; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * PostFee.
             */
            public Builder postFee(Long postFee) {
                this.postFee = postFee;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(Long serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public UnsellableRenderOrderInfosDeliveryInfos build() {
                return new UnsellableRenderOrderInfosDeliveryInfos(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfosInvoiceInfo extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Type")
        private String type;

        private UnsellableRenderOrderInfosInvoiceInfo(Builder builder) {
            this.desc = builder.desc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosInvoiceInfo create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String type; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UnsellableRenderOrderInfosInvoiceInfo build() {
                return new UnsellableRenderOrderInfosInvoiceInfo(this);
            } 

        } 

    }
    public static class ItemPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmShopId")
        private Long lmShopId;

        @NameInMap("Number")
        private Integer number;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Removed")
        private Boolean removed;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("UserPayFee")
        private Long userPayFee;

        private ItemPromInstVOSAvailableItems(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lmShopId = builder.lmShopId;
            this.number = builder.number;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.removed = builder.removed;
            this.skuId = builder.skuId;
            this.tbSellerId = builder.tbSellerId;
            this.userPayFee = builder.userPayFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemPromInstVOSAvailableItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmShopId
         */
        public Long getLmShopId() {
            return this.lmShopId;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return removed
         */
        public Boolean getRemoved() {
            return this.removed;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return userPayFee
         */
        public Long getUserPayFee() {
            return this.userPayFee;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Long lmShopId; 
            private Integer number; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Boolean removed; 
            private Long skuId; 
            private Long tbSellerId; 
            private Long userPayFee; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmShopId.
             */
            public Builder lmShopId(Long lmShopId) {
                this.lmShopId = lmShopId;
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Removed.
             */
            public Builder removed(Boolean removed) {
                this.removed = removed;
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
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * UserPayFee.
             */
            public Builder userPayFee(Long userPayFee) {
                this.userPayFee = userPayFee;
                return this;
            }

            public ItemPromInstVOSAvailableItems build() {
                return new ItemPromInstVOSAvailableItems(this);
            } 

        } 

    }
    public static class ItemInfosItemPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        private java.util.List < ItemPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        private Boolean canUse;

        @NameInMap("DiscountPrice")
        private Long discountPrice;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
        private String level;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("PromotionType")
        private String promotionType;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Selected")
        private Boolean selected;

        @NameInMap("SkuIds")
        private java.util.List < Long > skuIds;

        @NameInMap("SpecialPrice")
        private Long specialPrice;

        @NameInMap("SubBizCode")
        private String subBizCode;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @NameInMap("UseStartTime")
        private Long useStartTime;

        private ItemInfosItemPromInstVOS(Builder builder) {
            this.availableItems = builder.availableItems;
            this.canUse = builder.canUse;
            this.discountPrice = builder.discountPrice;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.lmItemId = builder.lmItemId;
            this.promotionName = builder.promotionName;
            this.promotionType = builder.promotionType;
            this.reason = builder.reason;
            this.selected = builder.selected;
            this.skuIds = builder.skuIds;
            this.specialPrice = builder.specialPrice;
            this.subBizCode = builder.subBizCode;
            this.tbSellerId = builder.tbSellerId;
            this.thresholdPrice = builder.thresholdPrice;
            this.useStartTime = builder.useStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfosItemPromInstVOS create() {
            return builder().build();
        }

        /**
         * @return availableItems
         */
        public java.util.List < ItemPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        /**
         * @return canUse
         */
        public Boolean getCanUse() {
            return this.canUse;
        }

        /**
         * @return discountPrice
         */
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return skuIds
         */
        public java.util.List < Long > getSkuIds() {
            return this.skuIds;
        }

        /**
         * @return specialPrice
         */
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return thresholdPrice
         */
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        /**
         * @return useStartTime
         */
        public Long getUseStartTime() {
            return this.useStartTime;
        }

        public static final class Builder {
            private java.util.List < ItemPromInstVOSAvailableItems> availableItems; 
            private Boolean canUse; 
            private Long discountPrice; 
            private Long expireTime; 
            private String instanceId; 
            private String level; 
            private String lmItemId; 
            private String promotionName; 
            private String promotionType; 
            private String reason; 
            private Boolean selected; 
            private java.util.List < Long > skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List < ItemPromInstVOSAvailableItems> availableItems) {
                this.availableItems = availableItems;
                return this;
            }

            /**
             * CanUse.
             */
            public Builder canUse(Boolean canUse) {
                this.canUse = canUse;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Long discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * PromotionType.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * SkuIds.
             */
            public Builder skuIds(java.util.List < Long > skuIds) {
                this.skuIds = skuIds;
                return this;
            }

            /**
             * SpecialPrice.
             */
            public Builder specialPrice(Long specialPrice) {
                this.specialPrice = specialPrice;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            /**
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * ThresholdPrice.
             */
            public Builder thresholdPrice(Long thresholdPrice) {
                this.thresholdPrice = thresholdPrice;
                return this;
            }

            /**
             * UseStartTime.
             */
            public Builder useStartTime(Long useStartTime) {
                this.useStartTime = useStartTime;
                return this;
            }

            public ItemInfosItemPromInstVOS build() {
                return new ItemInfosItemPromInstVOS(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfosItemInfos extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("DistributionSupplierId")
        private String distributionSupplierId;

        @NameInMap("DistributorId")
        private String distributorId;

        @NameInMap("Features")
        private java.util.Map < String, String > features;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @NameInMap("ItemPromInstVOS")
        private java.util.List < ItemInfosItemPromInstVOS> itemPromInstVOS;

        @NameInMap("ItemUrl")
        private String itemUrl;

        @NameInMap("Message")
        private String message;

        @NameInMap("Price")
        private Long price;

        @NameInMap("PromotionFee")
        private Long promotionFee;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuName")
        private String skuName;

        @NameInMap("VirtualItemType")
        private String virtualItemType;

        private UnsellableRenderOrderInfosItemInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.distributionMallId = builder.distributionMallId;
            this.distributionSupplierId = builder.distributionSupplierId;
            this.distributorId = builder.distributorId;
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemPromInstVOS = builder.itemPromInstVOS;
            this.itemUrl = builder.itemUrl;
            this.message = builder.message;
            this.price = builder.price;
            this.promotionFee = builder.promotionFee;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.virtualItemType = builder.virtualItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosItemInfos create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return distributionSupplierId
         */
        public String getDistributionSupplierId() {
            return this.distributionSupplierId;
        }

        /**
         * @return distributorId
         */
        public String getDistributorId() {
            return this.distributorId;
        }

        /**
         * @return features
         */
        public java.util.Map < String, String > getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemPicUrl
         */
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        /**
         * @return itemPromInstVOS
         */
        public java.util.List < ItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return promotionFee
         */
        public Long getPromotionFee() {
            return this.promotionFee;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservePrice
         */
        public Long getReservePrice() {
            return this.reservePrice;
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
         * @return virtualItemType
         */
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public static final class Builder {
            private Boolean canSell; 
            private String distributionMallId; 
            private String distributionSupplierId; 
            private String distributorId; 
            private java.util.Map < String, String > features; 
            private String itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private java.util.List < ItemInfosItemPromInstVOS> itemPromInstVOS; 
            private String itemUrl; 
            private String message; 
            private Long price; 
            private Long promotionFee; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long skuId; 
            private String skuName; 
            private String virtualItemType; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * DistributionSupplierId.
             */
            public Builder distributionSupplierId(String distributionSupplierId) {
                this.distributionSupplierId = distributionSupplierId;
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
             * Features.
             */
            public Builder features(java.util.Map < String, String > features) {
                this.features = features;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemPicUrl.
             */
            public Builder itemPicUrl(String itemPicUrl) {
                this.itemPicUrl = itemPicUrl;
                return this;
            }

            /**
             * ItemPromInstVOS.
             */
            public Builder itemPromInstVOS(java.util.List < ItemInfosItemPromInstVOS> itemPromInstVOS) {
                this.itemPromInstVOS = itemPromInstVOS;
                return this;
            }

            /**
             * ItemUrl.
             */
            public Builder itemUrl(String itemUrl) {
                this.itemUrl = itemUrl;
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
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * PromotionFee.
             */
            public Builder promotionFee(Long promotionFee) {
                this.promotionFee = promotionFee;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservePrice.
             */
            public Builder reservePrice(Long reservePrice) {
                this.reservePrice = reservePrice;
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
             * VirtualItemType.
             */
            public Builder virtualItemType(String virtualItemType) {
                this.virtualItemType = virtualItemType;
                return this;
            }

            public UnsellableRenderOrderInfosItemInfos build() {
                return new UnsellableRenderOrderInfosItemInfos(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmShopId")
        private Long lmShopId;

        @NameInMap("Number")
        private Integer number;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Removed")
        private Boolean removed;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("UserPayFee")
        private Long userPayFee;

        private UnsellableRenderOrderInfosShopPromInstVOSAvailableItems(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lmShopId = builder.lmShopId;
            this.number = builder.number;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.removed = builder.removed;
            this.skuId = builder.skuId;
            this.tbSellerId = builder.tbSellerId;
            this.userPayFee = builder.userPayFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosShopPromInstVOSAvailableItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmShopId
         */
        public Long getLmShopId() {
            return this.lmShopId;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return removed
         */
        public Boolean getRemoved() {
            return this.removed;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return userPayFee
         */
        public Long getUserPayFee() {
            return this.userPayFee;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Long lmShopId; 
            private Integer number; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Boolean removed; 
            private Long skuId; 
            private Long tbSellerId; 
            private Long userPayFee; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmShopId.
             */
            public Builder lmShopId(Long lmShopId) {
                this.lmShopId = lmShopId;
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Removed.
             */
            public Builder removed(Boolean removed) {
                this.removed = removed;
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
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * UserPayFee.
             */
            public Builder userPayFee(Long userPayFee) {
                this.userPayFee = userPayFee;
                return this;
            }

            public UnsellableRenderOrderInfosShopPromInstVOSAvailableItems build() {
                return new UnsellableRenderOrderInfosShopPromInstVOSAvailableItems(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfosShopPromInstVOS extends TeaModel {
        @NameInMap("AvailableItems")
        private java.util.List < UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        @NameInMap("CanUse")
        private Boolean canUse;

        @NameInMap("DiscountPrice")
        private Long discountPrice;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
        private String level;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("PromotionType")
        private String promotionType;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Selected")
        private Boolean selected;

        @NameInMap("SkuIds")
        private java.util.List < Long > skuIds;

        @NameInMap("SpecialPrice")
        private Long specialPrice;

        @NameInMap("SubBizCode")
        private String subBizCode;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @NameInMap("UseStartTime")
        private Long useStartTime;

        private UnsellableRenderOrderInfosShopPromInstVOS(Builder builder) {
            this.availableItems = builder.availableItems;
            this.canUse = builder.canUse;
            this.discountPrice = builder.discountPrice;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.lmItemId = builder.lmItemId;
            this.promotionName = builder.promotionName;
            this.promotionType = builder.promotionType;
            this.reason = builder.reason;
            this.selected = builder.selected;
            this.skuIds = builder.skuIds;
            this.specialPrice = builder.specialPrice;
            this.subBizCode = builder.subBizCode;
            this.tbSellerId = builder.tbSellerId;
            this.thresholdPrice = builder.thresholdPrice;
            this.useStartTime = builder.useStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosShopPromInstVOS create() {
            return builder().build();
        }

        /**
         * @return availableItems
         */
        public java.util.List < UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
            return this.availableItems;
        }

        /**
         * @return canUse
         */
        public Boolean getCanUse() {
            return this.canUse;
        }

        /**
         * @return discountPrice
         */
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return skuIds
         */
        public java.util.List < Long > getSkuIds() {
            return this.skuIds;
        }

        /**
         * @return specialPrice
         */
        public Long getSpecialPrice() {
            return this.specialPrice;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return thresholdPrice
         */
        public Long getThresholdPrice() {
            return this.thresholdPrice;
        }

        /**
         * @return useStartTime
         */
        public Long getUseStartTime() {
            return this.useStartTime;
        }

        public static final class Builder {
            private java.util.List < UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems; 
            private Boolean canUse; 
            private Long discountPrice; 
            private Long expireTime; 
            private String instanceId; 
            private String level; 
            private String lmItemId; 
            private String promotionName; 
            private String promotionType; 
            private String reason; 
            private Boolean selected; 
            private java.util.List < Long > skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List < UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
                this.availableItems = availableItems;
                return this;
            }

            /**
             * CanUse.
             */
            public Builder canUse(Boolean canUse) {
                this.canUse = canUse;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Long discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * PromotionType.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * SkuIds.
             */
            public Builder skuIds(java.util.List < Long > skuIds) {
                this.skuIds = skuIds;
                return this;
            }

            /**
             * SpecialPrice.
             */
            public Builder specialPrice(Long specialPrice) {
                this.specialPrice = specialPrice;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            /**
             * TbSellerId.
             */
            public Builder tbSellerId(Long tbSellerId) {
                this.tbSellerId = tbSellerId;
                return this;
            }

            /**
             * ThresholdPrice.
             */
            public Builder thresholdPrice(Long thresholdPrice) {
                this.thresholdPrice = thresholdPrice;
                return this;
            }

            /**
             * UseStartTime.
             */
            public Builder useStartTime(Long useStartTime) {
                this.useStartTime = useStartTime;
                return this;
            }

            public UnsellableRenderOrderInfosShopPromInstVOS build() {
                return new UnsellableRenderOrderInfosShopPromInstVOS(this);
            } 

        } 

    }
    public static class UnsellableRenderOrderInfos extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("DeliveryInfos")
        private java.util.List < UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos;

        @NameInMap("ExtInfo")
        private java.util.Map < String, String > extInfo;

        @NameInMap("InvoiceInfo")
        private UnsellableRenderOrderInfosInvoiceInfo invoiceInfo;

        @NameInMap("ItemInfos")
        private java.util.List < UnsellableRenderOrderInfosItemInfos> itemInfos;

        @NameInMap("Message")
        private String message;

        @NameInMap("ShopPromInstVOS")
        private java.util.List < UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        private UnsellableRenderOrderInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.deliveryInfos = builder.deliveryInfos;
            this.extInfo = builder.extInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.itemInfos = builder.itemInfos;
            this.message = builder.message;
            this.shopPromInstVOS = builder.shopPromInstVOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfos create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return deliveryInfos
         */
        public java.util.List < UnsellableRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, String > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return invoiceInfo
         */
        public UnsellableRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return itemInfos
         */
        public java.util.List < UnsellableRenderOrderInfosItemInfos> getItemInfos() {
            return this.itemInfos;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return shopPromInstVOS
         */
        public java.util.List < UnsellableRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.List < UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos; 
            private java.util.Map < String, String > extInfo; 
            private UnsellableRenderOrderInfosInvoiceInfo invoiceInfo; 
            private java.util.List < UnsellableRenderOrderInfosItemInfos> itemInfos; 
            private String message; 
            private java.util.List < UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * DeliveryInfos.
             */
            public Builder deliveryInfos(java.util.List < UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, String > extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * InvoiceInfo.
             */
            public Builder invoiceInfo(UnsellableRenderOrderInfosInvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * ItemInfos.
             */
            public Builder itemInfos(java.util.List < UnsellableRenderOrderInfosItemInfos> itemInfos) {
                this.itemInfos = itemInfos;
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
             * ShopPromInstVOS.
             */
            public Builder shopPromInstVOS(java.util.List < UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
                this.shopPromInstVOS = shopPromInstVOS;
                return this;
            }

            public UnsellableRenderOrderInfos build() {
                return new UnsellableRenderOrderInfos(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("AddressInfos")
        private java.util.List < AddressInfos> addressInfos;

        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("ExtInfo")
        private java.util.Map < String, String > extInfo;

        @NameInMap("Message")
        private String message;

        @NameInMap("RenderOrderInfos")
        private java.util.List < RenderOrderInfos> renderOrderInfos;

        @NameInMap("UnsellableRenderOrderInfos")
        private java.util.List < UnsellableRenderOrderInfos> unsellableRenderOrderInfos;

        private Model(Builder builder) {
            this.addressInfos = builder.addressInfos;
            this.canSell = builder.canSell;
            this.extInfo = builder.extInfo;
            this.message = builder.message;
            this.renderOrderInfos = builder.renderOrderInfos;
            this.unsellableRenderOrderInfos = builder.unsellableRenderOrderInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return addressInfos
         */
        public java.util.List < AddressInfos> getAddressInfos() {
            return this.addressInfos;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, String > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return renderOrderInfos
         */
        public java.util.List < RenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        /**
         * @return unsellableRenderOrderInfos
         */
        public java.util.List < UnsellableRenderOrderInfos> getUnsellableRenderOrderInfos() {
            return this.unsellableRenderOrderInfos;
        }

        public static final class Builder {
            private java.util.List < AddressInfos> addressInfos; 
            private Boolean canSell; 
            private java.util.Map < String, String > extInfo; 
            private String message; 
            private java.util.List < RenderOrderInfos> renderOrderInfos; 
            private java.util.List < UnsellableRenderOrderInfos> unsellableRenderOrderInfos; 

            /**
             * AddressInfos.
             */
            public Builder addressInfos(java.util.List < AddressInfos> addressInfos) {
                this.addressInfos = addressInfos;
                return this;
            }

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, String > extInfo) {
                this.extInfo = extInfo;
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
             * RenderOrderInfos.
             */
            public Builder renderOrderInfos(java.util.List < RenderOrderInfos> renderOrderInfos) {
                this.renderOrderInfos = renderOrderInfos;
                return this;
            }

            /**
             * UnsellableRenderOrderInfos.
             */
            public Builder unsellableRenderOrderInfos(java.util.List < UnsellableRenderOrderInfos> unsellableRenderOrderInfos) {
                this.unsellableRenderOrderInfos = unsellableRenderOrderInfos;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
