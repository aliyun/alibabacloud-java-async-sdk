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
 * {@link QueryItemDetailInnerResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemDetailInnerResponseBody</p>
 */
public class QueryItemDetailInnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Item")
    private Item item;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryItemDetailInnerResponseBody(Builder builder) {
        this.code = builder.code;
        this.item = builder.item;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemDetailInnerResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Item item; 
        private String message; 
        private String requestId; 

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

        public QueryItemDetailInnerResponseBody build() {
            return new QueryItemDetailInnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryItemDetailInnerResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailInnerResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Values(Builder builder) {
            this.id = builder.id;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long id; 
            private String text; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailInnerResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailInnerResponseBody</p>
     */
    public static class SkuPropertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

        private SkuPropertys(Builder builder) {
            this.id = builder.id;
            this.text = builder.text;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuPropertys create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return values
         */
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Long id; 
            private String text; 
            private java.util.List<Values> values; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public SkuPropertys build() {
                return new SkuPropertys(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailInnerResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailInnerResponseBody</p>
     */
    public static class Skus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

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

        @com.aliyun.core.annotation.NameInMap("SkuDesc")
        private String skuDesc;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @com.aliyun.core.annotation.NameInMap("SkuPvs")
        private String skuPvs;

        @com.aliyun.core.annotation.NameInMap("SkuTitle")
        private String skuTitle;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Skus(Builder builder) {
            this.extJson = builder.extJson;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.skuDesc = builder.skuDesc;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuPvs = builder.skuPvs;
            this.skuTitle = builder.skuTitle;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skus create() {
            return builder().build();
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
         * @return skuDesc
         */
        public String getSkuDesc() {
            return this.skuDesc;
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
         * @return skuPvs
         */
        public String getSkuPvs() {
            return this.skuPvs;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String extJson; 
            private Long itemId; 
            private String lmItemId; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Integer quantity; 
            private Long reservePrice; 
            private String skuDesc; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuPvs; 
            private String skuTitle; 
            private Integer status; 

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
             * SkuDesc.
             */
            public Builder skuDesc(String skuDesc) {
                this.skuDesc = skuDesc;
                return this;
            }

            /**
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>465309897****</p>
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
             * SkuPvs.
             */
            public Builder skuPvs(String skuPvs) {
                this.skuPvs = skuPvs;
                return this;
            }

            /**
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Skus build() {
                return new Skus(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemDetailInnerResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemDetailInnerResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryIds")
        private java.util.List<Long> categoryIds;

        @com.aliyun.core.annotation.NameInMap("CenterInventory")
        private Boolean centerInventory;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("DescOption")
        private String descOption;

        @com.aliyun.core.annotation.NameInMap("DescPath")
        private String descPath;

        @com.aliyun.core.annotation.NameInMap("FirstPicUrl")
        private String firstPicUrl;

        @com.aliyun.core.annotation.NameInMap("IforestProps")
        private java.util.List<java.util.Map<String, ?>> iforestProps;

        @com.aliyun.core.annotation.NameInMap("IsCanSell")
        private Boolean isCanSell;

        @com.aliyun.core.annotation.NameInMap("IsSellerPayPostfee")
        private Boolean isSellerPayPostfee;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemImages")
        private java.util.List<String> itemImages;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LmItemCategory")
        private String lmItemCategory;

        @com.aliyun.core.annotation.NameInMap("LmShopId")
        private Long lmShopId;

        @com.aliyun.core.annotation.NameInMap("MainPicUrl")
        private String mainPicUrl;

        @com.aliyun.core.annotation.NameInMap("MinPoints")
        private Long minPoints;

        @com.aliyun.core.annotation.NameInMap("MinPrice")
        private Long minPrice;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SellerNick")
        private String sellerNick;

        @com.aliyun.core.annotation.NameInMap("SellerPayPostfee")
        private Boolean sellerPayPostfee;

        @com.aliyun.core.annotation.NameInMap("SkuPropertys")
        private java.util.List<SkuPropertys> skuPropertys;

        @com.aliyun.core.annotation.NameInMap("Skus")
        private java.util.List<Skus> skus;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        @com.aliyun.core.annotation.NameInMap("TotalSoldQuantity")
        private Integer totalSoldQuantity;

        private Item(Builder builder) {
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.categoryIds = builder.categoryIds;
            this.centerInventory = builder.centerInventory;
            this.city = builder.city;
            this.descOption = builder.descOption;
            this.descPath = builder.descPath;
            this.firstPicUrl = builder.firstPicUrl;
            this.iforestProps = builder.iforestProps;
            this.isCanSell = builder.isCanSell;
            this.isSellerPayPostfee = builder.isSellerPayPostfee;
            this.itemId = builder.itemId;
            this.itemImages = builder.itemImages;
            this.itemTitle = builder.itemTitle;
            this.lmItemCategory = builder.lmItemCategory;
            this.lmShopId = builder.lmShopId;
            this.mainPicUrl = builder.mainPicUrl;
            this.minPoints = builder.minPoints;
            this.minPrice = builder.minPrice;
            this.properties = builder.properties;
            this.province = builder.province;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.sellerNick = builder.sellerNick;
            this.sellerPayPostfee = builder.sellerPayPostfee;
            this.skuPropertys = builder.skuPropertys;
            this.skus = builder.skus;
            this.tbShopName = builder.tbShopName;
            this.totalSoldQuantity = builder.totalSoldQuantity;
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
         * @return categoryIds
         */
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

        /**
         * @return centerInventory
         */
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
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
         * @return firstPicUrl
         */
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        /**
         * @return iforestProps
         */
        public java.util.List<java.util.Map<String, ?>> getIforestProps() {
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
        public java.util.List<String> getItemImages() {
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
         * @return lmShopId
         */
        public Long getLmShopId() {
            return this.lmShopId;
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
         * @return province
         */
        public String getProvince() {
            return this.province;
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
         * @return sellerPayPostfee
         */
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        /**
         * @return skuPropertys
         */
        public java.util.List<SkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        /**
         * @return skus
         */
        public java.util.List<Skus> getSkus() {
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

        public static final class Builder {
            private Boolean canSell; 
            private Long categoryId; 
            private java.util.List<Long> categoryIds; 
            private Boolean centerInventory; 
            private String city; 
            private String descOption; 
            private String descPath; 
            private String firstPicUrl; 
            private java.util.List<java.util.Map<String, ?>> iforestProps; 
            private Boolean isCanSell; 
            private Boolean isSellerPayPostfee; 
            private Long itemId; 
            private java.util.List<String> itemImages; 
            private String itemTitle; 
            private String lmItemCategory; 
            private Long lmShopId; 
            private String mainPicUrl; 
            private Long minPoints; 
            private Long minPrice; 
            private java.util.Map<String, ?> properties; 
            private String province; 
            private Integer quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private String sellerNick; 
            private Boolean sellerPayPostfee; 
            private java.util.List<SkuPropertys> skuPropertys; 
            private java.util.List<Skus> skus; 
            private String tbShopName; 
            private Integer totalSoldQuantity; 

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
             * CategoryIds.
             */
            public Builder categoryIds(java.util.List<Long> categoryIds) {
                this.categoryIds = categoryIds;
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
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
             * FirstPicUrl.
             */
            public Builder firstPicUrl(String firstPicUrl) {
                this.firstPicUrl = firstPicUrl;
                return this;
            }

            /**
             * IforestProps.
             */
            public Builder iforestProps(java.util.List<java.util.Map<String, ?>> iforestProps) {
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
            public Builder itemImages(java.util.List<String> itemImages) {
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
             * LmShopId.
             */
            public Builder lmShopId(Long lmShopId) {
                this.lmShopId = lmShopId;
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
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
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
             * SellerPayPostfee.
             */
            public Builder sellerPayPostfee(Boolean sellerPayPostfee) {
                this.sellerPayPostfee = sellerPayPostfee;
                return this;
            }

            /**
             * SkuPropertys.
             */
            public Builder skuPropertys(java.util.List<SkuPropertys> skuPropertys) {
                this.skuPropertys = skuPropertys;
                return this;
            }

            /**
             * Skus.
             */
            public Builder skus(java.util.List<Skus> skus) {
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

            public Item build() {
                return new Item(this);
            } 

        } 

    }
}
