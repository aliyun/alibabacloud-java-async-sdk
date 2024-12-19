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
 * {@link QueryGuideItemGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGuideItemGroupResponseBody</p>
 */
public class QueryGuideItemGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GuideItemGroup")
    private GuideItemGroup guideItemGroup;

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

    private QueryGuideItemGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.guideItemGroup = builder.guideItemGroup;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGuideItemGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return guideItemGroup
     */
    public GuideItemGroup getGuideItemGroup() {
        return this.guideItemGroup;
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
        private GuideItemGroup guideItemGroup; 
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
         * GuideItemGroup.
         */
        public Builder guideItemGroup(GuideItemGroup guideItemGroup) {
            this.guideItemGroup = guideItemGroup;
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

        public QueryGuideItemGroupResponseBody build() {
            return new QueryGuideItemGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGuideItemGroupResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGuideItemGroupResponseBody</p>
     */
    public static class ItemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("ItemUrl")
        private String itemUrl;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("MainPicUrl")
        private String mainPicUrl;

        @com.aliyun.core.annotation.NameInMap("PointPrice")
        private Long pointPrice;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private String reservePrice;

        private ItemInfo(Builder builder) {
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.itemUrl = builder.itemUrl;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.pointPrice = builder.pointPrice;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.reservePrice = builder.reservePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfo create() {
            return builder().build();
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
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
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
        public String getReservePrice() {
            return this.reservePrice;
        }

        public static final class Builder {
            private Long itemId; 
            private String itemTitle; 
            private String itemUrl; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private String reservePrice; 

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
             * MainPicUrl.
             */
            public Builder mainPicUrl(String mainPicUrl) {
                this.mainPicUrl = mainPicUrl;
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
            public Builder reservePrice(String reservePrice) {
                this.reservePrice = reservePrice;
                return this;
            }

            public ItemInfo build() {
                return new ItemInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryGuideItemGroupResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGuideItemGroupResponseBody</p>
     */
    public static class GuideItemGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemInfo")
        private java.util.List<ItemInfo> itemInfo;

        private GuideItemGroup(Builder builder) {
            this.itemInfo = builder.itemInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuideItemGroup create() {
            return builder().build();
        }

        /**
         * @return itemInfo
         */
        public java.util.List<ItemInfo> getItemInfo() {
            return this.itemInfo;
        }

        public static final class Builder {
            private java.util.List<ItemInfo> itemInfo; 

            /**
             * ItemInfo.
             */
            public Builder itemInfo(java.util.List<ItemInfo> itemInfo) {
                this.itemInfo = itemInfo;
                return this;
            }

            public GuideItemGroup build() {
                return new GuideItemGroup(this);
            } 

        } 

    }
}
