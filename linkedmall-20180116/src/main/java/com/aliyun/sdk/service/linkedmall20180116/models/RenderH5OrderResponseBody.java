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
 * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
 *
 * <p>RenderH5OrderResponseBody</p>
 */
public class RenderH5OrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

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

    private RenderH5OrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderH5OrderResponseBody create() {
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

        public RenderH5OrderResponseBody build() {
            return new RenderH5OrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderH5OrderResponseBody</p>
     */
    public static class AddressInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AddressId")
        private Long addressId;

        @com.aliyun.core.annotation.NameInMap("Default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("DivisionCode")
        private String divisionCode;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("ReceiverPhone")
        private String receiverPhone;

        private AddressInfoList(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.addressId = builder.addressId;
            this._default = builder._default;
            this.divisionCode = builder.divisionCode;
            this.receiver = builder.receiver;
            this.receiverPhone = builder.receiverPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressInfoList create() {
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
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return divisionCode
         */
        public String getDivisionCode() {
            return this.divisionCode;
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

        public static final class Builder {
            private String addressDetail; 
            private Long addressId; 
            private Boolean _default; 
            private String divisionCode; 
            private String receiver; 
            private String receiverPhone; 

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
             * Default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
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

            public AddressInfoList build() {
                return new AddressInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderH5OrderResponseBody</p>
     */
    public static class DeliveryInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PostFee")
        private Long postFee;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Long serviceType;

        private DeliveryInfoList(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.postFee = builder.postFee;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryInfoList create() {
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

            public DeliveryInfoList build() {
                return new DeliveryInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderH5OrderResponseBody</p>
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
     * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderH5OrderResponseBody</p>
     */
    public static class LmItemInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualPrice")
        private Long actualPrice;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("Cash")
        private Long cash;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @com.aliyun.core.annotation.NameInMap("ItemUrl")
        private String itemUrl;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

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

        private LmItemInfoList(Builder builder) {
            this.actualPrice = builder.actualPrice;
            this.canSell = builder.canSell;
            this.cash = builder.cash;
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemUrl = builder.itemUrl;
            this.lmItemId = builder.lmItemId;
            this.message = builder.message;
            this.points = builder.points;
            this.quantity = builder.quantity;
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

        public static LmItemInfoList create() {
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
        public java.util.Map<String, ?> getFeatures() {
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
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
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
            private java.util.Map<String, ?> features; 
            private Long itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private String itemUrl; 
            private String lmItemId; 
            private String message; 
            private Long points; 
            private Integer quantity; 
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
            public Builder features(java.util.Map<String, ?> features) {
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
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

            public LmItemInfoList build() {
                return new LmItemInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderH5OrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderH5OrderResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressInfoList")
        private java.util.List<AddressInfoList> addressInfoList;

        @com.aliyun.core.annotation.NameInMap("BuyerCurrentPoints")
        private Long buyerCurrentPoints;

        @com.aliyun.core.annotation.NameInMap("DeliveryInfoList")
        private java.util.List<DeliveryInfoList> deliveryInfoList;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("InvoiceInfo")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("LmItemInfoList")
        private java.util.List<LmItemInfoList> lmItemInfoList;

        private Model(Builder builder) {
            this.addressInfoList = builder.addressInfoList;
            this.buyerCurrentPoints = builder.buyerCurrentPoints;
            this.deliveryInfoList = builder.deliveryInfoList;
            this.extInfo = builder.extInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.lmItemInfoList = builder.lmItemInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return addressInfoList
         */
        public java.util.List<AddressInfoList> getAddressInfoList() {
            return this.addressInfoList;
        }

        /**
         * @return buyerCurrentPoints
         */
        public Long getBuyerCurrentPoints() {
            return this.buyerCurrentPoints;
        }

        /**
         * @return deliveryInfoList
         */
        public java.util.List<DeliveryInfoList> getDeliveryInfoList() {
            return this.deliveryInfoList;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return lmItemInfoList
         */
        public java.util.List<LmItemInfoList> getLmItemInfoList() {
            return this.lmItemInfoList;
        }

        public static final class Builder {
            private java.util.List<AddressInfoList> addressInfoList; 
            private Long buyerCurrentPoints; 
            private java.util.List<DeliveryInfoList> deliveryInfoList; 
            private java.util.Map<String, ?> extInfo; 
            private InvoiceInfo invoiceInfo; 
            private java.util.List<LmItemInfoList> lmItemInfoList; 

            /**
             * AddressInfoList.
             */
            public Builder addressInfoList(java.util.List<AddressInfoList> addressInfoList) {
                this.addressInfoList = addressInfoList;
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
             * DeliveryInfoList.
             */
            public Builder deliveryInfoList(java.util.List<DeliveryInfoList> deliveryInfoList) {
                this.deliveryInfoList = deliveryInfoList;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
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
             * LmItemInfoList.
             */
            public Builder lmItemInfoList(java.util.List<LmItemInfoList> lmItemInfoList) {
                this.lmItemInfoList = lmItemInfoList;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
