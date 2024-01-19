// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemDetailResponseBody</p>
 */
public class QueryItemDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Item")
    private Item item;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private QueryItemDetailResponseBody(Builder builder) {
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

    public static QueryItemDetailResponseBody create() {
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

        public QueryItemDetailResponseBody build() {
            return new QueryItemDetailResponseBody(this);
        } 

    } 

    public static class ItemImages extends TeaModel {
        @NameInMap("ItemImage")
        private java.util.List < String > itemImage;

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
        public java.util.List < String > getItemImage() {
            return this.itemImage;
        }

        public static final class Builder {
            private java.util.List < String > itemImage; 

            /**
             * ItemImage.
             */
            public Builder itemImage(java.util.List < String > itemImage) {
                this.itemImage = itemImage;
                return this;
            }

            public ItemImages build() {
                return new ItemImages(this);
            } 

        } 

    }
    public static class Sku extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        private java.util.Map < String, ? > customizedAttributeMap;

        @NameInMap("ExtJson")
        private String extJson;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PointPrice")
        private Long pointPrice;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @NameInMap("SkuProperties")
        private String skuProperties;

        @NameInMap("SkuPropertiesJson")
        private String skuPropertiesJson;

        @NameInMap("SkuTitle")
        private String skuTitle;

        private Sku(Builder builder) {
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.extJson = builder.extJson;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuProperties = builder.skuProperties;
            this.skuPropertiesJson = builder.skuPropertiesJson;
            this.skuTitle = builder.skuTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sku create() {
            return builder().build();
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
        public java.util.Map < String, ? > getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
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
        public String getSkuProperties() {
            return this.skuProperties;
        }

        /**
         * @return skuPropertiesJson
         */
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.Map < String, ? > customizedAttributeMap; 
            private String extJson; 
            private Long itemId; 
            private String lmItemId; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuProperties; 
            private String skuPropertiesJson; 
            private String skuTitle; 

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
            public Builder customizedAttributeMap(java.util.Map < String, ? > customizedAttributeMap) {
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
            public Builder skuProperties(String skuProperties) {
                this.skuProperties = skuProperties;
                return this;
            }

            /**
             * SkuPropertiesJson.
             */
            public Builder skuPropertiesJson(String skuPropertiesJson) {
                this.skuPropertiesJson = skuPropertiesJson;
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
    public static class Skus extends TeaModel {
        @NameInMap("Sku")
        private java.util.List < Sku> sku;

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
        public java.util.List < Sku> getSku() {
            return this.sku;
        }

        public static final class Builder {
            private java.util.List < Sku> sku; 

            /**
             * Sku.
             */
            public Builder sku(java.util.List < Sku> sku) {
                this.sku = sku;
                return this;
            }

            public Skus build() {
                return new Skus(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CenterInventory")
        private Boolean centerInventory;

        @NameInMap("CustomizedAttributeMap")
        private java.util.Map < String, ? > customizedAttributeMap;

        @NameInMap("DescOption")
        private String descOption;

        @NameInMap("DescPath")
        private String descPath;

        @NameInMap("ExtJson")
        private String extJson;

        @NameInMap("IforestProps")
        private String iforestProps;

        @NameInMap("IforestPropsJson")
        private String iforestPropsJson;

        @NameInMap("IsCanSell")
        private Boolean isCanSell;

        @NameInMap("IsSellerPayPostfee")
        private Boolean isSellerPayPostfee;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemImages")
        private ItemImages itemImages;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LmItemCategory")
        private String lmItemCategory;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("MainPicUrl")
        private String mainPicUrl;

        @NameInMap("MinPoints")
        private Long minPoints;

        @NameInMap("MinPrice")
        private Long minPrice;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("PropertiesJson")
        private String propertiesJson;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SellerId")
        private Long sellerId;

        @NameInMap("SellerPayPostfee")
        private Boolean sellerPayPostfee;

        @NameInMap("SellerType")
        private Integer sellerType;

        @NameInMap("Skus")
        private Skus skus;

        @NameInMap("TbShopName")
        private String tbShopName;

        @NameInMap("TotalSoldQuantity")
        private Integer totalSoldQuantity;

        @NameInMap("VideoPicUrl")
        private String videoPicUrl;

        @NameInMap("VideoUrl")
        private String videoUrl;

        private Item(Builder builder) {
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.centerInventory = builder.centerInventory;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.descOption = builder.descOption;
            this.descPath = builder.descPath;
            this.extJson = builder.extJson;
            this.iforestProps = builder.iforestProps;
            this.iforestPropsJson = builder.iforestPropsJson;
            this.isCanSell = builder.isCanSell;
            this.isSellerPayPostfee = builder.isSellerPayPostfee;
            this.itemId = builder.itemId;
            this.itemImages = builder.itemImages;
            this.itemTitle = builder.itemTitle;
            this.lmItemCategory = builder.lmItemCategory;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.minPoints = builder.minPoints;
            this.minPrice = builder.minPrice;
            this.properties = builder.properties;
            this.propertiesJson = builder.propertiesJson;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.sellerPayPostfee = builder.sellerPayPostfee;
            this.sellerType = builder.sellerType;
            this.skus = builder.skus;
            this.tbShopName = builder.tbShopName;
            this.totalSoldQuantity = builder.totalSoldQuantity;
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
        public java.util.Map < String, ? > getCustomizedAttributeMap() {
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
         * @return iforestProps
         */
        public String getIforestProps() {
            return this.iforestProps;
        }

        /**
         * @return iforestPropsJson
         */
        public String getIforestPropsJson() {
            return this.iforestPropsJson;
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
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return propertiesJson
         */
        public String getPropertiesJson() {
            return this.propertiesJson;
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
            private Boolean canSell; 
            private Long categoryId; 
            private Boolean centerInventory; 
            private java.util.Map < String, ? > customizedAttributeMap; 
            private String descOption; 
            private String descPath; 
            private String extJson; 
            private String iforestProps; 
            private String iforestPropsJson; 
            private Boolean isCanSell; 
            private Boolean isSellerPayPostfee; 
            private Long itemId; 
            private ItemImages itemImages; 
            private String itemTitle; 
            private String lmItemCategory; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long minPoints; 
            private Long minPrice; 
            private String properties; 
            private String propertiesJson; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private Boolean sellerPayPostfee; 
            private Integer sellerType; 
            private Skus skus; 
            private String tbShopName; 
            private Integer totalSoldQuantity; 
            private String videoPicUrl; 
            private String videoUrl; 

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
            public Builder customizedAttributeMap(java.util.Map < String, ? > customizedAttributeMap) {
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
             * IforestProps.
             */
            public Builder iforestProps(String iforestProps) {
                this.iforestProps = iforestProps;
                return this;
            }

            /**
             * IforestPropsJson.
             */
            public Builder iforestPropsJson(String iforestPropsJson) {
                this.iforestPropsJson = iforestPropsJson;
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
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * PropertiesJson.
             */
            public Builder propertiesJson(String propertiesJson) {
                this.propertiesJson = propertiesJson;
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
