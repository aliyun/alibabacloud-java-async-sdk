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
 * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemDetailTeaResponseBody</p>
 */
public class QueryItemDetailTeaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Item")
    private Item item;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryItemDetailTeaResponseBody(Builder builder) {
        this.code = builder.code;
        this.item = builder.item;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemDetailTeaResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return item
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Item item; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Item.
         */
        public Builder item(Item item) {
            this.item = item;
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

        public QueryItemDetailTeaResponseBody build() {
            return new QueryItemDetailTeaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailTeaResponseBody</p>
     */
    public static class IforestProps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IforestProp")
        private java.util.List<java.util.Map<String, ?>> iforestProp;

        private IforestProps(Builder builder) {
            this.iforestProp = builder.iforestProp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IforestProps create() {
            return builder().build();
        }

        /**
         * @return iforestProp
         */
        public java.util.List<java.util.Map<String, ?>> getIforestProp() {
            return this.iforestProp;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> iforestProp; 

            /**
             * IforestProp.
             */
            public Builder iforestProp(java.util.List<java.util.Map<String, ?>> iforestProp) {
                this.iforestProp = iforestProp;
                return this;
            }

            public IforestProps build() {
                return new IforestProps(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailTeaResponseBody</p>
     */
    public static class ItemImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemImage")
        private java.util.List<String> itemImage;

        private ItemImages(Builder builder) {
            this.itemImage = builder.itemImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemImages create() {
            return builder().build();
        }

        /**
         * @return itemImage
         */
        public java.util.List<String> getItemImage() {
            return this.itemImage;
        }

        public static final class Builder {
            private java.util.List<String> itemImage; 

            /**
             * ItemImage.
             */
            public Builder itemImage(java.util.List<String> itemImage) {
                this.itemImage = itemImage;
                return this;
            }

            public ItemImages build() {
                return new ItemImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailTeaResponseBody</p>
     */
    public static class Sku extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanNotBeSoldCode")
        private String canNotBeSoldCode;

        @com.aliyun.core.annotation.NameInMap("CanNotBeSoldMassage")
        private String canNotBeSoldMassage;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CustomizedAttributeMap")
        private java.util.Map<String, ?> customizedAttributeMap;

        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

        @com.aliyun.core.annotation.NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @com.aliyun.core.annotation.NameInMap("SkuProperties")
        private java.util.Map<String, ?> skuProperties;

        @com.aliyun.core.annotation.NameInMap("SkuTitle")
        private String skuTitle;

        private Sku(Builder builder) {
            this.canNotBeSoldCode = builder.canNotBeSoldCode;
            this.canNotBeSoldMassage = builder.canNotBeSoldMassage;
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.extJson = builder.extJson;
            this.hasQuantity = builder.hasQuantity;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.simpleQuantity = builder.simpleQuantity;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuProperties = builder.skuProperties;
            this.skuTitle = builder.skuTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sku create() {
            return builder().build();
        }

        /**
         * @return canNotBeSoldCode
         */
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        /**
         * @return canNotBeSoldMassage
         */
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return customizedAttributeMap
         */
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
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
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuPicUrl
         */
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        /**
         * @return skuProperties
         */
        public java.util.Map<String, ?> getSkuProperties() {
            return this.skuProperties;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public static final class Builder {
            private String canNotBeSoldCode; 
            private String canNotBeSoldMassage; 
            private Boolean canSell; 
            private java.util.Map<String, ?> customizedAttributeMap; 
            private String extJson; 
            private Boolean hasQuantity; 
            private Long itemId; 
            private String lmItemId; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Integer quantity; 
            private Long reservePrice; 
            private String simpleQuantity; 
            private Long skuId; 
            private String skuPicUrl; 
            private java.util.Map<String, ?> skuProperties; 
            private String skuTitle; 

            /**
             * CanNotBeSoldCode.
             */
            public Builder canNotBeSoldCode(String canNotBeSoldCode) {
                this.canNotBeSoldCode = canNotBeSoldCode;
                return this;
            }

            /**
             * CanNotBeSoldMassage.
             */
            public Builder canNotBeSoldMassage(String canNotBeSoldMassage) {
                this.canNotBeSoldMassage = canNotBeSoldMassage;
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
             * CustomizedAttributeMap.
             */
            public Builder customizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
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
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
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
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
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
             * SkuPicUrl.
             */
            public Builder skuPicUrl(String skuPicUrl) {
                this.skuPicUrl = skuPicUrl;
                return this;
            }

            /**
             * SkuProperties.
             */
            public Builder skuProperties(java.util.Map<String, ?> skuProperties) {
                this.skuProperties = skuProperties;
                return this;
            }

            /**
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            public Sku build() {
                return new Sku(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailTeaResponseBody</p>
     */
    public static class Skus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sku")
        private java.util.List<Sku> sku;

        private Skus(Builder builder) {
            this.sku = builder.sku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skus create() {
            return builder().build();
        }

        /**
         * @return sku
         */
        public java.util.List<Sku> getSku() {
            return this.sku;
        }

        public static final class Builder {
            private java.util.List<Sku> sku; 

            /**
             * Sku.
             */
            public Builder sku(java.util.List<Sku> sku) {
                this.sku = sku;
                return this;
            }

            public Skus build() {
                return new Skus(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailTeaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailTeaResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanNotBeSoldCode")
        private String canNotBeSoldCode;

        @com.aliyun.core.annotation.NameInMap("CanNotBeSoldMassage")
        private String canNotBeSoldMassage;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CenterInventory")
        private Boolean centerInventory;

        @com.aliyun.core.annotation.NameInMap("CustomizedAttributeMap")
        private java.util.Map<String, ?> customizedAttributeMap;

        @com.aliyun.core.annotation.NameInMap("DescOption")
        private String descOption;

        @com.aliyun.core.annotation.NameInMap("DescPath")
        private String descPath;

        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

        @com.aliyun.core.annotation.NameInMap("FirstPicUrl")
        private String firstPicUrl;

        @com.aliyun.core.annotation.NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @com.aliyun.core.annotation.NameInMap("IforestProps")
        private IforestProps iforestProps;

        @com.aliyun.core.annotation.NameInMap("IsCanSell")
        private Boolean isCanSell;

        @com.aliyun.core.annotation.NameInMap("IsSellerPayPostfee")
        private Boolean isSellerPayPostfee;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemImages")
        private ItemImages itemImages;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("ItemTotalSimpleValue")
        private String itemTotalSimpleValue;

        @com.aliyun.core.annotation.NameInMap("LmItemCategory")
        private String lmItemCategory;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("MainPicUrl")
        private String mainPicUrl;

        @com.aliyun.core.annotation.NameInMap("MinPoints")
        private Long minPoints;

        @com.aliyun.core.annotation.NameInMap("MinPrice")
        private Long minPrice;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SellerPayPostfee")
        private Boolean sellerPayPostfee;

        @com.aliyun.core.annotation.NameInMap("SellerType")
        private Integer sellerType;

        @com.aliyun.core.annotation.NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @com.aliyun.core.annotation.NameInMap("Skus")
        private Skus skus;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        @com.aliyun.core.annotation.NameInMap("TotalSoldQuantity")
        private Integer totalSoldQuantity;

        @com.aliyun.core.annotation.NameInMap("TotalSoldSimpleQuantity")
        private String totalSoldSimpleQuantity;

        @com.aliyun.core.annotation.NameInMap("VideoPicUrl")
        private String videoPicUrl;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private Item(Builder builder) {
            this.canNotBeSoldCode = builder.canNotBeSoldCode;
            this.canNotBeSoldMassage = builder.canNotBeSoldMassage;
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.centerInventory = builder.centerInventory;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.descOption = builder.descOption;
            this.descPath = builder.descPath;
            this.extJson = builder.extJson;
            this.firstPicUrl = builder.firstPicUrl;
            this.hasQuantity = builder.hasQuantity;
            this.iforestProps = builder.iforestProps;
            this.isCanSell = builder.isCanSell;
            this.isSellerPayPostfee = builder.isSellerPayPostfee;
            this.itemId = builder.itemId;
            this.itemImages = builder.itemImages;
            this.itemTitle = builder.itemTitle;
            this.itemTotalSimpleValue = builder.itemTotalSimpleValue;
            this.lmItemCategory = builder.lmItemCategory;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.minPoints = builder.minPoints;
            this.minPrice = builder.minPrice;
            this.properties = builder.properties;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.sellerPayPostfee = builder.sellerPayPostfee;
            this.sellerType = builder.sellerType;
            this.simpleQuantity = builder.simpleQuantity;
            this.skus = builder.skus;
            this.tbShopName = builder.tbShopName;
            this.totalSoldQuantity = builder.totalSoldQuantity;
            this.totalSoldSimpleQuantity = builder.totalSoldSimpleQuantity;
            this.videoPicUrl = builder.videoPicUrl;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return canNotBeSoldCode
         */
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        /**
         * @return canNotBeSoldMassage
         */
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return centerInventory
         */
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        /**
         * @return customizedAttributeMap
         */
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return descOption
         */
        public String getDescOption() {
            return this.descOption;
        }

        /**
         * @return descPath
         */
        public String getDescPath() {
            return this.descPath;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
        }

        /**
         * @return firstPicUrl
         */
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        /**
         * @return iforestProps
         */
        public IforestProps getIforestProps() {
            return this.iforestProps;
        }

        /**
         * @return isCanSell
         */
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        /**
         * @return isSellerPayPostfee
         */
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemImages
         */
        public ItemImages getItemImages() {
            return this.itemImages;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return itemTotalSimpleValue
         */
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        /**
         * @return lmItemCategory
         */
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        /**
         * @return minPoints
         */
        public Long getMinPoints() {
            return this.minPoints;
        }

        /**
         * @return minPrice
         */
        public Long getMinPrice() {
            return this.minPrice;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
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
         * @return sellerPayPostfee
         */
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        /**
         * @return sellerType
         */
        public Integer getSellerType() {
            return this.sellerType;
        }

        /**
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return skus
         */
        public Skus getSkus() {
            return this.skus;
        }

        /**
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        /**
         * @return totalSoldQuantity
         */
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        /**
         * @return totalSoldSimpleQuantity
         */
        public String getTotalSoldSimpleQuantity() {
            return this.totalSoldSimpleQuantity;
        }

        /**
         * @return videoPicUrl
         */
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String canNotBeSoldCode; 
            private String canNotBeSoldMassage; 
            private Boolean canSell; 
            private Long categoryId; 
            private Boolean centerInventory; 
            private java.util.Map<String, ?> customizedAttributeMap; 
            private String descOption; 
            private String descPath; 
            private String extJson; 
            private String firstPicUrl; 
            private Boolean hasQuantity; 
            private IforestProps iforestProps; 
            private Boolean isCanSell; 
            private Boolean isSellerPayPostfee; 
            private Long itemId; 
            private ItemImages itemImages; 
            private String itemTitle; 
            private String itemTotalSimpleValue; 
            private String lmItemCategory; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long minPoints; 
            private Long minPrice; 
            private java.util.Map<String, ?> properties; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private Boolean sellerPayPostfee; 
            private Integer sellerType; 
            private String simpleQuantity; 
            private Skus skus; 
            private String tbShopName; 
            private Integer totalSoldQuantity; 
            private String totalSoldSimpleQuantity; 
            private String videoPicUrl; 
            private String videoUrl; 

            /**
             * CanNotBeSoldCode.
             */
            public Builder canNotBeSoldCode(String canNotBeSoldCode) {
                this.canNotBeSoldCode = canNotBeSoldCode;
                return this;
            }

            /**
             * CanNotBeSoldMassage.
             */
            public Builder canNotBeSoldMassage(String canNotBeSoldMassage) {
                this.canNotBeSoldMassage = canNotBeSoldMassage;
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
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CenterInventory.
             */
            public Builder centerInventory(Boolean centerInventory) {
                this.centerInventory = centerInventory;
                return this;
            }

            /**
             * CustomizedAttributeMap.
             */
            public Builder customizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
                return this;
            }

            /**
             * DescOption.
             */
            public Builder descOption(String descOption) {
                this.descOption = descOption;
                return this;
            }

            /**
             * DescPath.
             */
            public Builder descPath(String descPath) {
                this.descPath = descPath;
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
             * FirstPicUrl.
             */
            public Builder firstPicUrl(String firstPicUrl) {
                this.firstPicUrl = firstPicUrl;
                return this;
            }

            /**
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
                return this;
            }

            /**
             * IforestProps.
             */
            public Builder iforestProps(IforestProps iforestProps) {
                this.iforestProps = iforestProps;
                return this;
            }

            /**
             * IsCanSell.
             */
            public Builder isCanSell(Boolean isCanSell) {
                this.isCanSell = isCanSell;
                return this;
            }

            /**
             * IsSellerPayPostfee.
             */
            public Builder isSellerPayPostfee(Boolean isSellerPayPostfee) {
                this.isSellerPayPostfee = isSellerPayPostfee;
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
             * ItemImages.
             */
            public Builder itemImages(ItemImages itemImages) {
                this.itemImages = itemImages;
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
             * ItemTotalSimpleValue.
             */
            public Builder itemTotalSimpleValue(String itemTotalSimpleValue) {
                this.itemTotalSimpleValue = itemTotalSimpleValue;
                return this;
            }

            /**
             * LmItemCategory.
             */
            public Builder lmItemCategory(String lmItemCategory) {
                this.lmItemCategory = lmItemCategory;
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
             * MainPicUrl.
             */
            public Builder mainPicUrl(String mainPicUrl) {
                this.mainPicUrl = mainPicUrl;
                return this;
            }

            /**
             * MinPoints.
             */
            public Builder minPoints(Long minPoints) {
                this.minPoints = minPoints;
                return this;
            }

            /**
             * MinPrice.
             */
            public Builder minPrice(Long minPrice) {
                this.minPrice = minPrice;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
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
             * SellerPayPostfee.
             */
            public Builder sellerPayPostfee(Boolean sellerPayPostfee) {
                this.sellerPayPostfee = sellerPayPostfee;
                return this;
            }

            /**
             * SellerType.
             */
            public Builder sellerType(Integer sellerType) {
                this.sellerType = sellerType;
                return this;
            }

            /**
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
                return this;
            }

            /**
             * Skus.
             */
            public Builder skus(Skus skus) {
                this.skus = skus;
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
             * TotalSoldQuantity.
             */
            public Builder totalSoldQuantity(Integer totalSoldQuantity) {
                this.totalSoldQuantity = totalSoldQuantity;
                return this;
            }

            /**
             * TotalSoldSimpleQuantity.
             */
            public Builder totalSoldSimpleQuantity(String totalSoldSimpleQuantity) {
                this.totalSoldSimpleQuantity = totalSoldSimpleQuantity;
                return this;
            }

            /**
             * VideoPicUrl.
             */
            public Builder videoPicUrl(String videoPicUrl) {
                this.videoPicUrl = videoPicUrl;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
}
