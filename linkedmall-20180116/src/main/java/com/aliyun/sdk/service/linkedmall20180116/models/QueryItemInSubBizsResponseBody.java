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
 * {@link QueryItemInSubBizsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemInSubBizsResponseBody</p>
 */
public class QueryItemInSubBizsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ItemBizList")
    private java.util.List<ItemBizList> itemBizList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryItemInSubBizsResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemBizList = builder.itemBizList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemInSubBizsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return itemBizList
     */
    public java.util.List<ItemBizList> getItemBizList() {
        return this.itemBizList;
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
        private java.util.List<ItemBizList> itemBizList; 
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
         * ItemBizList.
         */
        public Builder itemBizList(java.util.List<ItemBizList> itemBizList) {
            this.itemBizList = itemBizList;
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

        public QueryItemInSubBizsResponseBody build() {
            return new QueryItemInSubBizsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryItemInSubBizsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInSubBizsResponseBody</p>
     */
    public static class SkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BenefitId")
        private String benefitId;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CustomizedAttributeMap")
        private java.util.Map<String, ?> customizedAttributeMap;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @com.aliyun.core.annotation.NameInMap("SkuProperties")
        private String skuProperties;

        @com.aliyun.core.annotation.NameInMap("SkuPropertiesJson")
        private String skuPropertiesJson;

        @com.aliyun.core.annotation.NameInMap("SkuTitle")
        private String skuTitle;

        private SkuList(Builder builder) {
            this.benefitId = builder.benefitId;
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
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

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return benefitId
         */
        public String getBenefitId() {
            return this.benefitId;
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
            private String benefitId; 
            private Boolean canSell; 
            private java.util.Map<String, ?> customizedAttributeMap; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Long reservePrice; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuProperties; 
            private String skuPropertiesJson; 
            private String skuTitle; 

            /**
             * BenefitId.
             */
            public Builder benefitId(String benefitId) {
                this.benefitId = benefitId;
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

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemInSubBizsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInSubBizsResponseBody</p>
     */
    public static class ItemBizList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("DescOption")
        private String descOption;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemImages")
        private java.util.List<String> itemImages;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("MainPicUrl")
        private String mainPicUrl;

        @com.aliyun.core.annotation.NameInMap("PropertiesJson")
        private String propertiesJson;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SkuList")
        private java.util.List<SkuList> skuList;

        @com.aliyun.core.annotation.NameInMap("SubBizId")
        private String subBizId;

        @com.aliyun.core.annotation.NameInMap("TbShopName")
        private String tbShopName;

        private ItemBizList(Builder builder) {
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.descOption = builder.descOption;
            this.itemId = builder.itemId;
            this.itemImages = builder.itemImages;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.propertiesJson = builder.propertiesJson;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.skuList = builder.skuList;
            this.subBizId = builder.subBizId;
            this.tbShopName = builder.tbShopName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemBizList create() {
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
         * @return descOption
         */
        public String getDescOption() {
            return this.descOption;
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
         * @return propertiesJson
         */
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
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
         * @return skuList
         */
        public java.util.List<SkuList> getSkuList() {
            return this.skuList;
        }

        /**
         * @return subBizId
         */
        public String getSubBizId() {
            return this.subBizId;
        }

        /**
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        public static final class Builder {
            private Boolean canSell; 
            private Long categoryId; 
            private String descOption; 
            private Long itemId; 
            private java.util.List<String> itemImages; 
            private String itemTitle; 
            private String lmItemId; 
            private String mainPicUrl; 
            private String propertiesJson; 
            private Long quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private java.util.List<SkuList> skuList; 
            private String subBizId; 
            private String tbShopName; 

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
             * DescOption.
             */
            public Builder descOption(String descOption) {
                this.descOption = descOption;
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
             * PropertiesJson.
             */
            public Builder propertiesJson(String propertiesJson) {
                this.propertiesJson = propertiesJson;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
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
             * SkuList.
             */
            public Builder skuList(java.util.List<SkuList> skuList) {
                this.skuList = skuList;
                return this;
            }

            /**
             * SubBizId.
             */
            public Builder subBizId(String subBizId) {
                this.subBizId = subBizId;
                return this;
            }

            /**
             * TbShopName.
             */
            public Builder tbShopName(String tbShopName) {
                this.tbShopName = tbShopName;
                return this;
            }

            public ItemBizList build() {
                return new ItemBizList(this);
            } 

        } 

    }
}
