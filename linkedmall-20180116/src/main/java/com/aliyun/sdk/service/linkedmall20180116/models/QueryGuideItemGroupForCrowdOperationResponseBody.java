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
 * {@link QueryGuideItemGroupForCrowdOperationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGuideItemGroupForCrowdOperationResponseBody</p>
 */
public class QueryGuideItemGroupForCrowdOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

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

    private QueryGuideItemGroupForCrowdOperationResponseBody(Builder builder) {
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

    public static QueryGuideItemGroupForCrowdOperationResponseBody create() {
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
    public java.util.List<Model> getModel() {
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
        private java.util.List<Model> model; 
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
        public Builder model(java.util.List<Model> model) {
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

        public QueryGuideItemGroupForCrowdOperationResponseBody build() {
            return new QueryGuideItemGroupForCrowdOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGuideItemGroupForCrowdOperationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGuideItemGroupForCrowdOperationResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtmospherePicUrl")
        private String atmospherePicUrl;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("CustomizedAttributeMap")
        private java.util.Map<String, String> customizedAttributeMap;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Integer> tags;

        @com.aliyun.core.annotation.NameInMap("WhitePicUrl")
        private String whitePicUrl;

        private Model(Builder builder) {
            this.atmospherePicUrl = builder.atmospherePicUrl;
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
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
            this.tags = builder.tags;
            this.whitePicUrl = builder.whitePicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return atmospherePicUrl
         */
        public String getAtmospherePicUrl() {
            return this.atmospherePicUrl;
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
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
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

        /**
         * @return tags
         */
        public java.util.List<Integer> getTags() {
            return this.tags;
        }

        /**
         * @return whitePicUrl
         */
        public String getWhitePicUrl() {
            return this.whitePicUrl;
        }

        public static final class Builder {
            private String atmospherePicUrl; 
            private Boolean canSell; 
            private java.util.Map<String, String> customizedAttributeMap; 
            private String itemId; 
            private String itemTitle; 
            private String itemUrl; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long pointPrice; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private String reservePrice; 
            private java.util.List<Integer> tags; 
            private String whitePicUrl; 

            /**
             * AtmospherePicUrl.
             */
            public Builder atmospherePicUrl(String atmospherePicUrl) {
                this.atmospherePicUrl = atmospherePicUrl;
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
            public Builder customizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
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

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Integer> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * WhitePicUrl.
             */
            public Builder whitePicUrl(String whitePicUrl) {
                this.whitePicUrl = whitePicUrl;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
