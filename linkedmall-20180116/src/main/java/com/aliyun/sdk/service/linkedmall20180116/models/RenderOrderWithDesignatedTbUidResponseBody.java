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
 * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
 */
public class RenderOrderWithDesignatedTbUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

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

    private RenderOrderWithDesignatedTbUidResponseBody(Builder builder) {
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

    public static RenderOrderWithDesignatedTbUidResponseBody create() {
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

        public RenderOrderWithDesignatedTbUidResponseBody build() {
            return new RenderOrderWithDesignatedTbUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class AddressInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AddressId")
        private Long addressId;

        @com.aliyun.core.annotation.NameInMap("DivisionCode")
        private String divisionCode;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("ReceiverPhone")
        private String receiverPhone;

        @com.aliyun.core.annotation.NameInMap("TownDivisionCode")
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class DeliveryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PostFee")
        private Long postFee;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
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
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class InvoiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Type")
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class AvailableItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmShopId")
        private Long lmShopId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Removed")
        private Boolean removed;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("UserPayFee")
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>457***764</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class ItemPromInstVOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableItems")
        private java.util.List<AvailableItems> availableItems;

        @com.aliyun.core.annotation.NameInMap("CanUse")
        private Boolean canUse;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionType")
        private String promotionType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("SkuIds")
        private java.util.List<Long> skuIds;

        @com.aliyun.core.annotation.NameInMap("SpecialPrice")
        private Long specialPrice;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @com.aliyun.core.annotation.NameInMap("UseStartTime")
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
        public java.util.List<AvailableItems> getAvailableItems() {
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
        public java.util.List<Long> getSkuIds() {
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
            private java.util.List<AvailableItems> availableItems; 
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
            private java.util.List<Long> skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List<AvailableItems> availableItems) {
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
            public Builder skuIds(java.util.List<Long> skuIds) {
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class LmItemInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualPrice")
        private Long actualPrice;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("Cash")
        private Long cash;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map<String, String> features;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @com.aliyun.core.annotation.NameInMap("ItemPromInstVOS")
        private java.util.List<ItemPromInstVOS> itemPromInstVOS;

        @com.aliyun.core.annotation.NameInMap("ItemUrl")
        private String itemUrl;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PromotionFee")
        private Long promotionFee;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SellerNick")
        private String sellerNick;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        @com.aliyun.core.annotation.NameInMap("VirtualItemType")
        private String virtualItemType;

        private LmItemInfos(Builder builder) {
            this.actualPrice = builder.actualPrice;
            this.canSell = builder.canSell;
            this.cash = builder.cash;
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemPromInstVOS = builder.itemPromInstVOS;
            this.itemUrl = builder.itemUrl;
            this.lmItemId = builder.lmItemId;
            this.message = builder.message;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.promotionFee = builder.promotionFee;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.sellerNick = builder.sellerNick;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.tbShopName = builder.tbShopName;
            this.virtualItemType = builder.virtualItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemInfos create() {
            return builder().build();
        }

        /**
         * @return actualPrice
         */
        public Long getActualPrice() {
            return this.actualPrice;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return cash
         */
        public Long getCash() {
            return this.cash;
        }

        /**
         * @return features
         */
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
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
        public java.util.List<ItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pointPrice
         */
        public Long getPointPrice() {
            return this.pointPrice;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
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
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        /**
         * @return virtualItemType
         */
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public static final class Builder {
            private Long actualPrice; 
            private Boolean canSell; 
            private Long cash; 
            private java.util.Map<String, String> features; 
            private Long itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private java.util.List<ItemPromInstVOS> itemPromInstVOS; 
            private String itemUrl; 
            private String lmItemId; 
            private String message; 
            private Long pointPrice; 
            private Long points; 
            private Long promotionFee; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private String sellerNick; 
            private Long skuId; 
            private String skuName; 
            private String tbShopName; 
            private String virtualItemType; 

            /**
             * ActualPrice.
             */
            public Builder actualPrice(Long actualPrice) {
                this.actualPrice = actualPrice;
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
             * Cash.
             */
            public Builder cash(Long cash) {
                this.cash = cash;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.Map<String, String> features) {
                this.features = features;
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
            public Builder itemPromInstVOS(java.util.List<ItemPromInstVOS> itemPromInstVOS) {
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
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
             * PointPrice.
             */
            public Builder pointPrice(Long pointPrice) {
                this.pointPrice = pointPrice;
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>493***981</p>
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
             * TbShopName.
             */
            public Builder tbShopName(String tbShopName) {
                this.tbShopName = tbShopName;
                return this;
            }

            /**
             * VirtualItemType.
             */
            public Builder virtualItemType(String virtualItemType) {
                this.virtualItemType = virtualItemType;
                return this;
            }

            public LmItemInfos build() {
                return new LmItemInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class ShopPromInstVOSAvailableItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmShopId")
        private Long lmShopId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Removed")
        private Boolean removed;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("UserPayFee")
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>493***981</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class ShopPromInstVOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableItems")
        private java.util.List<ShopPromInstVOSAvailableItems> availableItems;

        @com.aliyun.core.annotation.NameInMap("CanUse")
        private Boolean canUse;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionType")
        private String promotionType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("SkuIds")
        private java.util.List<Long> skuIds;

        @com.aliyun.core.annotation.NameInMap("SpecialPrice")
        private Long specialPrice;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @com.aliyun.core.annotation.NameInMap("UseStartTime")
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
        public java.util.List<ShopPromInstVOSAvailableItems> getAvailableItems() {
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
        public java.util.List<Long> getSkuIds() {
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
            private java.util.List<ShopPromInstVOSAvailableItems> availableItems; 
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
            private java.util.List<Long> skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List<ShopPromInstVOSAvailableItems> availableItems) {
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
            public Builder skuIds(java.util.List<Long> skuIds) {
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class RenderOrderInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("DeliveryInfos")
        private java.util.List<DeliveryInfos> deliveryInfos;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, String> extInfo;

        @com.aliyun.core.annotation.NameInMap("InvoiceInfo")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("LmItemInfos")
        private java.util.List<LmItemInfos> lmItemInfos;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("ShopPromInstVOS")
        private java.util.List<ShopPromInstVOS> shopPromInstVOS;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        private RenderOrderInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.deliveryInfos = builder.deliveryInfos;
            this.extInfo = builder.extInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.lmItemInfos = builder.lmItemInfos;
            this.message = builder.message;
            this.sellerId = builder.sellerId;
            this.shopPromInstVOS = builder.shopPromInstVOS;
            this.tbShopName = builder.tbShopName;
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
        public java.util.List<DeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return lmItemInfos
         */
        public java.util.List<LmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return shopPromInstVOS
         */
        public java.util.List<ShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        /**
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.List<DeliveryInfos> deliveryInfos; 
            private java.util.Map<String, String> extInfo; 
            private InvoiceInfo invoiceInfo; 
            private java.util.List<LmItemInfos> lmItemInfos; 
            private String message; 
            private Long sellerId; 
            private java.util.List<ShopPromInstVOS> shopPromInstVOS; 
            private String tbShopName; 

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
            public Builder deliveryInfos(java.util.List<DeliveryInfos> deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
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
             * LmItemInfos.
             */
            public Builder lmItemInfos(java.util.List<LmItemInfos> lmItemInfos) {
                this.lmItemInfos = lmItemInfos;
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
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * ShopPromInstVOS.
             */
            public Builder shopPromInstVOS(java.util.List<ShopPromInstVOS> shopPromInstVOS) {
                this.shopPromInstVOS = shopPromInstVOS;
                return this;
            }

            /**
             * TbShopName.
             */
            public Builder tbShopName(String tbShopName) {
                this.tbShopName = tbShopName;
                return this;
            }

            public RenderOrderInfos build() {
                return new RenderOrderInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfosDeliveryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PostFee")
        private Long postFee;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
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
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfosInvoiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Type")
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class ItemPromInstVOSAvailableItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmShopId")
        private Long lmShopId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Removed")
        private Boolean removed;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("UserPayFee")
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>504***414</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class LmItemInfosItemPromInstVOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableItems")
        private java.util.List<ItemPromInstVOSAvailableItems> availableItems;

        @com.aliyun.core.annotation.NameInMap("CanUse")
        private Boolean canUse;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionType")
        private String promotionType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("SkuIds")
        private java.util.List<Long> skuIds;

        @com.aliyun.core.annotation.NameInMap("SpecialPrice")
        private Long specialPrice;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @com.aliyun.core.annotation.NameInMap("UseStartTime")
        private Long useStartTime;

        private LmItemInfosItemPromInstVOS(Builder builder) {
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

        public static LmItemInfosItemPromInstVOS create() {
            return builder().build();
        }

        /**
         * @return availableItems
         */
        public java.util.List<ItemPromInstVOSAvailableItems> getAvailableItems() {
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
        public java.util.List<Long> getSkuIds() {
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
            private java.util.List<ItemPromInstVOSAvailableItems> availableItems; 
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
            private java.util.List<Long> skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List<ItemPromInstVOSAvailableItems> availableItems) {
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
             * <p>skuid</p>
             */
            public Builder skuIds(java.util.List<Long> skuIds) {
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

            public LmItemInfosItemPromInstVOS build() {
                return new LmItemInfosItemPromInstVOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfosLmItemInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualPrice")
        private Long actualPrice;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("Cash")
        private Long cash;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map<String, String> features;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @com.aliyun.core.annotation.NameInMap("ItemPromInstVOS")
        private java.util.List<LmItemInfosItemPromInstVOS> itemPromInstVOS;

        @com.aliyun.core.annotation.NameInMap("ItemUrl")
        private String itemUrl;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PromotionFee")
        private Long promotionFee;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SellerNick")
        private String sellerNick;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        @com.aliyun.core.annotation.NameInMap("VirtualItemType")
        private String virtualItemType;

        private UnsellableRenderOrderInfosLmItemInfos(Builder builder) {
            this.actualPrice = builder.actualPrice;
            this.canSell = builder.canSell;
            this.cash = builder.cash;
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemPromInstVOS = builder.itemPromInstVOS;
            this.itemUrl = builder.itemUrl;
            this.lmItemId = builder.lmItemId;
            this.message = builder.message;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.promotionFee = builder.promotionFee;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.sellerNick = builder.sellerNick;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
            this.tbShopName = builder.tbShopName;
            this.virtualItemType = builder.virtualItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnsellableRenderOrderInfosLmItemInfos create() {
            return builder().build();
        }

        /**
         * @return actualPrice
         */
        public Long getActualPrice() {
            return this.actualPrice;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return cash
         */
        public Long getCash() {
            return this.cash;
        }

        /**
         * @return features
         */
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
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
        public java.util.List<LmItemInfosItemPromInstVOS> getItemPromInstVOS() {
            return this.itemPromInstVOS;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pointPrice
         */
        public Long getPointPrice() {
            return this.pointPrice;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
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
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        /**
         * @return virtualItemType
         */
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public static final class Builder {
            private Long actualPrice; 
            private Boolean canSell; 
            private Long cash; 
            private java.util.Map<String, String> features; 
            private Long itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private java.util.List<LmItemInfosItemPromInstVOS> itemPromInstVOS; 
            private String itemUrl; 
            private String lmItemId; 
            private String message; 
            private Long pointPrice; 
            private Long points; 
            private Long promotionFee; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private String sellerNick; 
            private Long skuId; 
            private String skuName; 
            private String tbShopName; 
            private String virtualItemType; 

            /**
             * ActualPrice.
             */
            public Builder actualPrice(Long actualPrice) {
                this.actualPrice = actualPrice;
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
             * Cash.
             */
            public Builder cash(Long cash) {
                this.cash = cash;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.Map<String, String> features) {
                this.features = features;
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
            public Builder itemPromInstVOS(java.util.List<LmItemInfosItemPromInstVOS> itemPromInstVOS) {
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
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
             * PointPrice.
             */
            public Builder pointPrice(Long pointPrice) {
                this.pointPrice = pointPrice;
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
             * TbShopName.
             */
            public Builder tbShopName(String tbShopName) {
                this.tbShopName = tbShopName;
                return this;
            }

            /**
             * VirtualItemType.
             */
            public Builder virtualItemType(String virtualItemType) {
                this.virtualItemType = virtualItemType;
                return this;
            }

            public UnsellableRenderOrderInfosLmItemInfos build() {
                return new UnsellableRenderOrderInfosLmItemInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfosShopPromInstVOSAvailableItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmShopId")
        private Long lmShopId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Removed")
        private Boolean removed;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("UserPayFee")
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
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfosShopPromInstVOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableItems")
        private java.util.List<UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems;

        @com.aliyun.core.annotation.NameInMap("CanUse")
        private Boolean canUse;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionType")
        private String promotionType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("SkuIds")
        private java.util.List<Long> skuIds;

        @com.aliyun.core.annotation.NameInMap("SpecialPrice")
        private Long specialPrice;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("TbSellerId")
        private Long tbSellerId;

        @com.aliyun.core.annotation.NameInMap("ThresholdPrice")
        private Long thresholdPrice;

        @com.aliyun.core.annotation.NameInMap("UseStartTime")
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
        public java.util.List<UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> getAvailableItems() {
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
        public java.util.List<Long> getSkuIds() {
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
            private java.util.List<UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems; 
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
            private java.util.List<Long> skuIds; 
            private Long specialPrice; 
            private String subBizCode; 
            private Long tbSellerId; 
            private Long thresholdPrice; 
            private Long useStartTime; 

            /**
             * AvailableItems.
             */
            public Builder availableItems(java.util.List<UnsellableRenderOrderInfosShopPromInstVOSAvailableItems> availableItems) {
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
             * <p>skuid</p>
             */
            public Builder skuIds(java.util.List<Long> skuIds) {
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
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class UnsellableRenderOrderInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("DeliveryInfos")
        private java.util.List<UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, String> extInfo;

        @com.aliyun.core.annotation.NameInMap("InvoiceInfo")
        private UnsellableRenderOrderInfosInvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("LmItemInfos")
        private java.util.List<UnsellableRenderOrderInfosLmItemInfos> lmItemInfos;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("ShopPromInstVOS")
        private java.util.List<UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        private UnsellableRenderOrderInfos(Builder builder) {
            this.canSell = builder.canSell;
            this.deliveryInfos = builder.deliveryInfos;
            this.extInfo = builder.extInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.lmItemInfos = builder.lmItemInfos;
            this.message = builder.message;
            this.sellerId = builder.sellerId;
            this.shopPromInstVOS = builder.shopPromInstVOS;
            this.tbShopName = builder.tbShopName;
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
        public java.util.List<UnsellableRenderOrderInfosDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return invoiceInfo
         */
        public UnsellableRenderOrderInfosInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return lmItemInfos
         */
        public java.util.List<UnsellableRenderOrderInfosLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return shopPromInstVOS
         */
        public java.util.List<UnsellableRenderOrderInfosShopPromInstVOS> getShopPromInstVOS() {
            return this.shopPromInstVOS;
        }

        /**
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.List<UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos; 
            private java.util.Map<String, String> extInfo; 
            private UnsellableRenderOrderInfosInvoiceInfo invoiceInfo; 
            private java.util.List<UnsellableRenderOrderInfosLmItemInfos> lmItemInfos; 
            private String message; 
            private Long sellerId; 
            private java.util.List<UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS; 
            private String tbShopName; 

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
            public Builder deliveryInfos(java.util.List<UnsellableRenderOrderInfosDeliveryInfos> deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
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
             * LmItemInfos.
             */
            public Builder lmItemInfos(java.util.List<UnsellableRenderOrderInfosLmItemInfos> lmItemInfos) {
                this.lmItemInfos = lmItemInfos;
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
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * ShopPromInstVOS.
             */
            public Builder shopPromInstVOS(java.util.List<UnsellableRenderOrderInfosShopPromInstVOS> shopPromInstVOS) {
                this.shopPromInstVOS = shopPromInstVOS;
                return this;
            }

            /**
             * TbShopName.
             */
            public Builder tbShopName(String tbShopName) {
                this.tbShopName = tbShopName;
                return this;
            }

            public UnsellableRenderOrderInfos build() {
                return new UnsellableRenderOrderInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressInfos")
        private java.util.List<AddressInfos> addressInfos;

        @com.aliyun.core.annotation.NameInMap("BuyerCurrentPoints")
        private Long buyerCurrentPoints;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, String> extInfo;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RenderOrderInfos")
        private java.util.List<RenderOrderInfos> renderOrderInfos;

        @com.aliyun.core.annotation.NameInMap("UnsellableRenderOrderInfos")
        private java.util.List<UnsellableRenderOrderInfos> unsellableRenderOrderInfos;

        private Model(Builder builder) {
            this.addressInfos = builder.addressInfos;
            this.buyerCurrentPoints = builder.buyerCurrentPoints;
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
        public java.util.List<AddressInfos> getAddressInfos() {
            return this.addressInfos;
        }

        /**
         * @return buyerCurrentPoints
         */
        public Long getBuyerCurrentPoints() {
            return this.buyerCurrentPoints;
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
        public java.util.Map<String, String> getExtInfo() {
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
        public java.util.List<RenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        /**
         * @return unsellableRenderOrderInfos
         */
        public java.util.List<UnsellableRenderOrderInfos> getUnsellableRenderOrderInfos() {
            return this.unsellableRenderOrderInfos;
        }

        public static final class Builder {
            private java.util.List<AddressInfos> addressInfos; 
            private Long buyerCurrentPoints; 
            private Boolean canSell; 
            private java.util.Map<String, String> extInfo; 
            private String message; 
            private java.util.List<RenderOrderInfos> renderOrderInfos; 
            private java.util.List<UnsellableRenderOrderInfos> unsellableRenderOrderInfos; 

            /**
             * AddressInfos.
             */
            public Builder addressInfos(java.util.List<AddressInfos> addressInfos) {
                this.addressInfos = addressInfos;
                return this;
            }

            /**
             * BuyerCurrentPoints.
             */
            public Builder buyerCurrentPoints(Long buyerCurrentPoints) {
                this.buyerCurrentPoints = buyerCurrentPoints;
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
            public Builder extInfo(java.util.Map<String, String> extInfo) {
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
            public Builder renderOrderInfos(java.util.List<RenderOrderInfos> renderOrderInfos) {
                this.renderOrderInfos = renderOrderInfos;
                return this;
            }

            /**
             * UnsellableRenderOrderInfos.
             */
            public Builder unsellableRenderOrderInfos(java.util.List<UnsellableRenderOrderInfos> unsellableRenderOrderInfos) {
                this.unsellableRenderOrderInfos = unsellableRenderOrderInfos;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
