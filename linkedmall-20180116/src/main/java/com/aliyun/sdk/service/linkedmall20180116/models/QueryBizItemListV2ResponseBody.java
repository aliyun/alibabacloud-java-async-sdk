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
 * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBizItemListV2ResponseBody</p>
 */
public class QueryBizItemListV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ItemList")
    private ItemList itemList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryBizItemListV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemList = builder.itemList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizItemListV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return itemList
     */
    public ItemList getItemList() {
        return this.itemList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private ItemList itemList; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ItemList.
         */
        public Builder itemList(ItemList itemList) {
            this.itemList = itemList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryBizItemListV2ResponseBody build() {
            return new QueryBizItemListV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class UserLabelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserLabelList")
        private java.util.List<String> userLabelList;

        private UserLabelList(Builder builder) {
            this.userLabelList = builder.userLabelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserLabelList create() {
            return builder().build();
        }

        /**
         * @return userLabelList
         */
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

        public static final class Builder {
            private java.util.List<String> userLabelList; 

            /**
             * UserLabelList.
             */
            public Builder userLabelList(java.util.List<String> userLabelList) {
                this.userLabelList = userLabelList;
                return this;
            }

            public UserLabelList build() {
                return new UserLabelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class GradePriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessUrl")
        private String accessUrl;

        @com.aliyun.core.annotation.NameInMap("CanBuy")
        private Boolean canBuy;

        @com.aliyun.core.annotation.NameInMap("CharacteristicCode")
        private String characteristicCode;

        @com.aliyun.core.annotation.NameInMap("CharacteristicName")
        private String characteristicName;

        @com.aliyun.core.annotation.NameInMap("Exclusive")
        private Boolean exclusive;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Recommend")
        private Boolean recommend;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("UserLabelList")
        private UserLabelList userLabelList;

        private GradePriceModel(Builder builder) {
            this.accessUrl = builder.accessUrl;
            this.canBuy = builder.canBuy;
            this.characteristicCode = builder.characteristicCode;
            this.characteristicName = builder.characteristicName;
            this.exclusive = builder.exclusive;
            this.icon = builder.icon;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.recommend = builder.recommend;
            this.showName = builder.showName;
            this.subBizCode = builder.subBizCode;
            this.userLabelList = builder.userLabelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GradePriceModel create() {
            return builder().build();
        }

        /**
         * @return accessUrl
         */
        public String getAccessUrl() {
            return this.accessUrl;
        }

        /**
         * @return canBuy
         */
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        /**
         * @return characteristicCode
         */
        public String getCharacteristicCode() {
            return this.characteristicCode;
        }

        /**
         * @return characteristicName
         */
        public String getCharacteristicName() {
            return this.characteristicName;
        }

        /**
         * @return exclusive
         */
        public Boolean getExclusive() {
            return this.exclusive;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
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
         * @return recommend
         */
        public Boolean getRecommend() {
            return this.recommend;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return userLabelList
         */
        public UserLabelList getUserLabelList() {
            return this.userLabelList;
        }

        public static final class Builder {
            private String accessUrl; 
            private Boolean canBuy; 
            private String characteristicCode; 
            private String characteristicName; 
            private Boolean exclusive; 
            private String icon; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Boolean recommend; 
            private String showName; 
            private String subBizCode; 
            private UserLabelList userLabelList; 

            /**
             * AccessUrl.
             */
            public Builder accessUrl(String accessUrl) {
                this.accessUrl = accessUrl;
                return this;
            }

            /**
             * CanBuy.
             */
            public Builder canBuy(Boolean canBuy) {
                this.canBuy = canBuy;
                return this;
            }

            /**
             * CharacteristicCode.
             */
            public Builder characteristicCode(String characteristicCode) {
                this.characteristicCode = characteristicCode;
                return this;
            }

            /**
             * CharacteristicName.
             */
            public Builder characteristicName(String characteristicName) {
                this.characteristicName = characteristicName;
                return this;
            }

            /**
             * Exclusive.
             */
            public Builder exclusive(Boolean exclusive) {
                this.exclusive = exclusive;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
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
             * Recommend.
             */
            public Builder recommend(Boolean recommend) {
                this.recommend = recommend;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
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
             * UserLabelList.
             */
            public Builder userLabelList(UserLabelList userLabelList) {
                this.userLabelList = userLabelList;
                return this;
            }

            public GradePriceModel build() {
                return new GradePriceModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class GradePriceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GradePriceModel")
        private java.util.List<GradePriceModel> gradePriceModel;

        private GradePriceModels(Builder builder) {
            this.gradePriceModel = builder.gradePriceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GradePriceModels create() {
            return builder().build();
        }

        /**
         * @return gradePriceModel
         */
        public java.util.List<GradePriceModel> getGradePriceModel() {
            return this.gradePriceModel;
        }

        public static final class Builder {
            private java.util.List<GradePriceModel> gradePriceModel; 

            /**
             * GradePriceModel.
             */
            public Builder gradePriceModel(java.util.List<GradePriceModel> gradePriceModel) {
                this.gradePriceModel = gradePriceModel;
                return this;
            }

            public GradePriceModels build() {
                return new GradePriceModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class SkuUserLabelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserLabelList")
        private java.util.List<String> userLabelList;

        private SkuUserLabelList(Builder builder) {
            this.userLabelList = builder.userLabelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuUserLabelList create() {
            return builder().build();
        }

        /**
         * @return userLabelList
         */
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

        public static final class Builder {
            private java.util.List<String> userLabelList; 

            /**
             * UserLabelList.
             */
            public Builder userLabelList(java.util.List<String> userLabelList) {
                this.userLabelList = userLabelList;
                return this;
            }

            public SkuUserLabelList build() {
                return new SkuUserLabelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class Sku extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BenefitId")
        private String benefitId;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CustomizedAttributeMap")
        private java.util.Map<String, ?> customizedAttributeMap;

        @com.aliyun.core.annotation.NameInMap("GradePriceModels")
        private GradePriceModels gradePriceModels;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @com.aliyun.core.annotation.NameInMap("SkuTitle")
        private String skuTitle;

        @com.aliyun.core.annotation.NameInMap("TaoBaoCurrentPrice")
        private Long taoBaoCurrentPrice;

        @com.aliyun.core.annotation.NameInMap("UserLabelList")
        private SkuUserLabelList userLabelList;

        private Sku(Builder builder) {
            this.benefitId = builder.benefitId;
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.gradePriceModels = builder.gradePriceModels;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuTitle = builder.skuTitle;
            this.taoBaoCurrentPrice = builder.taoBaoCurrentPrice;
            this.userLabelList = builder.userLabelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sku create() {
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
         * @return gradePriceModels
         */
        public GradePriceModels getGradePriceModels() {
            return this.gradePriceModels;
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
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        /**
         * @return taoBaoCurrentPrice
         */
        public Long getTaoBaoCurrentPrice() {
            return this.taoBaoCurrentPrice;
        }

        /**
         * @return userLabelList
         */
        public SkuUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

        public static final class Builder {
            private String benefitId; 
            private Boolean canSell; 
            private java.util.Map<String, ?> customizedAttributeMap; 
            private GradePriceModels gradePriceModels; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuTitle; 
            private Long taoBaoCurrentPrice; 
            private SkuUserLabelList userLabelList; 

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
             * GradePriceModels.
             */
            public Builder gradePriceModels(GradePriceModels gradePriceModels) {
                this.gradePriceModels = gradePriceModels;
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
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            /**
             * TaoBaoCurrentPrice.
             */
            public Builder taoBaoCurrentPrice(Long taoBaoCurrentPrice) {
                this.taoBaoCurrentPrice = taoBaoCurrentPrice;
                return this;
            }

            /**
             * UserLabelList.
             */
            public Builder userLabelList(SkuUserLabelList userLabelList) {
                this.userLabelList = userLabelList;
                return this;
            }

            public Sku build() {
                return new Sku(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class SkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sku")
        private java.util.List<Sku> sku;

        private SkuList(Builder builder) {
            this.sku = builder.sku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
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

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CustomizedItemName")
        private String customizedItemName;

        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private String extJson;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("MainPicUrl")
        private String mainPicUrl;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SkuList")
        private SkuList skuList;

        @com.aliyun.core.annotation.NameInMap("TaobaoShopName")
        private String taobaoShopName;

        private Item(Builder builder) {
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.customizedItemName = builder.customizedItemName;
            this.extJson = builder.extJson;
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.skuList = builder.skuList;
            this.taobaoShopName = builder.taobaoShopName;
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
         * @return customizedItemName
         */
        public String getCustomizedItemName() {
            return this.customizedItemName;
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
        public SkuList getSkuList() {
            return this.skuList;
        }

        /**
         * @return taobaoShopName
         */
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

        public static final class Builder {
            private Boolean canSell; 
            private Long categoryId; 
            private String customizedItemName; 
            private String extJson; 
            private Long itemId; 
            private String itemTitle; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long reservePrice; 
            private Long sellerId; 
            private SkuList skuList; 
            private String taobaoShopName; 

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
             * CustomizedItemName.
             */
            public Builder customizedItemName(String customizedItemName) {
                this.customizedItemName = customizedItemName;
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
            public Builder skuList(SkuList skuList) {
                this.skuList = skuList;
                return this;
            }

            /**
             * TaobaoShopName.
             */
            public Builder taobaoShopName(String taobaoShopName) {
                this.taobaoShopName = taobaoShopName;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemListV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemListV2ResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private ItemList(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
