// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryActivityItemsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryActivityItemsResponseBody</p>
 */
public class QueryActivityItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LmActivityItemModelList")
    private LmActivityItemModelList lmActivityItemModelList;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryActivityItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmActivityItemModelList = builder.lmActivityItemModelList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActivityItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmActivityItemModelList
     */
    public LmActivityItemModelList getLmActivityItemModelList() {
        return this.lmActivityItemModelList;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private LmActivityItemModelList lmActivityItemModelList; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
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
         * LmActivityItemModelList.
         */
        public Builder lmActivityItemModelList(LmActivityItemModelList lmActivityItemModelList) {
            this.lmActivityItemModelList = lmActivityItemModelList;
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
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryActivityItemsResponseBody build() {
            return new QueryActivityItemsResponseBody(this);
        } 

    } 

    public static class LmActivityItemSkuModel extends TeaModel {
        @NameInMap("ActivityPrice")
        private Long activityPrice;

        @NameInMap("ActivityStatus")
        private String activityStatus;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmActivityId")
        private Long lmActivityId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("ReservedPrice")
        private Long reservedPrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @NameInMap("SkuTitle")
        private String skuTitle;

        @NameInMap("Tips")
        private String tips;

        private LmActivityItemSkuModel(Builder builder) {
            this.activityPrice = builder.activityPrice;
            this.activityStatus = builder.activityStatus;
            this.bizId = builder.bizId;
            this.itemId = builder.itemId;
            this.lmActivityId = builder.lmActivityId;
            this.lmItemId = builder.lmItemId;
            this.reservedPrice = builder.reservedPrice;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuTitle = builder.skuTitle;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityItemSkuModel create() {
            return builder().build();
        }

        /**
         * @return activityPrice
         */
        public Long getActivityPrice() {
            return this.activityPrice;
        }

        /**
         * @return activityStatus
         */
        public String getActivityStatus() {
            return this.activityStatus;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmActivityId
         */
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return reservedPrice
         */
        public Long getReservedPrice() {
            return this.reservedPrice;
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
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private Long activityPrice; 
            private String activityStatus; 
            private String bizId; 
            private Long itemId; 
            private Long lmActivityId; 
            private String lmItemId; 
            private Long reservedPrice; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuTitle; 
            private String tips; 

            /**
             * ActivityPrice.
             */
            public Builder activityPrice(Long activityPrice) {
                this.activityPrice = activityPrice;
                return this;
            }

            /**
             * ActivityStatus.
             */
            public Builder activityStatus(String activityStatus) {
                this.activityStatus = activityStatus;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
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
             * LmActivityId.
             */
            public Builder lmActivityId(Long lmActivityId) {
                this.lmActivityId = lmActivityId;
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
             * ReservedPrice.
             */
            public Builder reservedPrice(Long reservedPrice) {
                this.reservedPrice = reservedPrice;
                return this;
            }

            /**
             * skuID
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
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public LmActivityItemSkuModel build() {
                return new LmActivityItemSkuModel(this);
            } 

        } 

    }
    public static class SkuModelList extends TeaModel {
        @NameInMap("LmActivityItemSkuModel")
        private java.util.List < LmActivityItemSkuModel> lmActivityItemSkuModel;

        private SkuModelList(Builder builder) {
            this.lmActivityItemSkuModel = builder.lmActivityItemSkuModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuModelList create() {
            return builder().build();
        }

        /**
         * @return lmActivityItemSkuModel
         */
        public java.util.List < LmActivityItemSkuModel> getLmActivityItemSkuModel() {
            return this.lmActivityItemSkuModel;
        }

        public static final class Builder {
            private java.util.List < LmActivityItemSkuModel> lmActivityItemSkuModel; 

            /**
             * LmActivityItemSkuModel.
             */
            public Builder lmActivityItemSkuModel(java.util.List < LmActivityItemSkuModel> lmActivityItemSkuModel) {
                this.lmActivityItemSkuModel = lmActivityItemSkuModel;
                return this;
            }

            public SkuModelList build() {
                return new SkuModelList(this);
            } 

        } 

    }
    public static class LmActivityItemModel extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("ItemActivityQuantity")
        private Integer itemActivityQuantity;

        @NameInMap("ItemActivityStatus")
        private String itemActivityStatus;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LmActivityId")
        private Long lmActivityId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmShopId")
        private String lmShopId;

        @NameInMap("MainPicUrl")
        private String mainPicUrl;

        @NameInMap("SellableQuantity")
        private Integer sellableQuantity;

        @NameInMap("SkuModelList")
        private SkuModelList skuModelList;

        @NameInMap("TbSellerId")
        private Long tbSellerId;

        @NameInMap("TbShopId")
        private Long tbShopId;

        @NameInMap("TbShopName")
        private String tbShopName;

        @NameInMap("Tips")
        private String tips;

        private LmActivityItemModel(Builder builder) {
            this.canSell = builder.canSell;
            this.itemActivityQuantity = builder.itemActivityQuantity;
            this.itemActivityStatus = builder.itemActivityStatus;
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.lmActivityId = builder.lmActivityId;
            this.lmItemId = builder.lmItemId;
            this.lmShopId = builder.lmShopId;
            this.mainPicUrl = builder.mainPicUrl;
            this.sellableQuantity = builder.sellableQuantity;
            this.skuModelList = builder.skuModelList;
            this.tbSellerId = builder.tbSellerId;
            this.tbShopId = builder.tbShopId;
            this.tbShopName = builder.tbShopName;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityItemModel create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return itemActivityQuantity
         */
        public Integer getItemActivityQuantity() {
            return this.itemActivityQuantity;
        }

        /**
         * @return itemActivityStatus
         */
        public String getItemActivityStatus() {
            return this.itemActivityStatus;
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
         * @return lmActivityId
         */
        public Long getLmActivityId() {
            return this.lmActivityId;
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
        public String getLmShopId() {
            return this.lmShopId;
        }

        /**
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        /**
         * @return sellableQuantity
         */
        public Integer getSellableQuantity() {
            return this.sellableQuantity;
        }

        /**
         * @return skuModelList
         */
        public SkuModelList getSkuModelList() {
            return this.skuModelList;
        }

        /**
         * @return tbSellerId
         */
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        /**
         * @return tbShopId
         */
        public Long getTbShopId() {
            return this.tbShopId;
        }

        /**
         * @return tbShopName
         */
        public String getTbShopName() {
            return this.tbShopName;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private Boolean canSell; 
            private Integer itemActivityQuantity; 
            private String itemActivityStatus; 
            private Long itemId; 
            private String itemTitle; 
            private Long lmActivityId; 
            private String lmItemId; 
            private String lmShopId; 
            private String mainPicUrl; 
            private Integer sellableQuantity; 
            private SkuModelList skuModelList; 
            private Long tbSellerId; 
            private Long tbShopId; 
            private String tbShopName; 
            private String tips; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * ItemActivityQuantity.
             */
            public Builder itemActivityQuantity(Integer itemActivityQuantity) {
                this.itemActivityQuantity = itemActivityQuantity;
                return this;
            }

            /**
             * ItemActivityStatus.
             */
            public Builder itemActivityStatus(String itemActivityStatus) {
                this.itemActivityStatus = itemActivityStatus;
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
             * LmActivityId.
             */
            public Builder lmActivityId(Long lmActivityId) {
                this.lmActivityId = lmActivityId;
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
            public Builder lmShopId(String lmShopId) {
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
             * SellableQuantity.
             */
            public Builder sellableQuantity(Integer sellableQuantity) {
                this.sellableQuantity = sellableQuantity;
                return this;
            }

            /**
             * SkuModelList.
             */
            public Builder skuModelList(SkuModelList skuModelList) {
                this.skuModelList = skuModelList;
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
             * TbShopId.
             */
            public Builder tbShopId(Long tbShopId) {
                this.tbShopId = tbShopId;
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
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public LmActivityItemModel build() {
                return new LmActivityItemModel(this);
            } 

        } 

    }
    public static class LmActivityItemModelList extends TeaModel {
        @NameInMap("LmActivityItemModel")
        private java.util.List < LmActivityItemModel> lmActivityItemModel;

        private LmActivityItemModelList(Builder builder) {
            this.lmActivityItemModel = builder.lmActivityItemModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityItemModelList create() {
            return builder().build();
        }

        /**
         * @return lmActivityItemModel
         */
        public java.util.List < LmActivityItemModel> getLmActivityItemModel() {
            return this.lmActivityItemModel;
        }

        public static final class Builder {
            private java.util.List < LmActivityItemModel> lmActivityItemModel; 

            /**
             * LmActivityItemModel.
             */
            public Builder lmActivityItemModel(java.util.List < LmActivityItemModel> lmActivityItemModel) {
                this.lmActivityItemModel = lmActivityItemModel;
                return this;
            }

            public LmActivityItemModelList build() {
                return new LmActivityItemModelList(this);
            } 

        } 

    }
}
