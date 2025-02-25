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
 * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBizItemsWithActivityResponseBody</p>
 */
public class QueryBizItemsWithActivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ItemList")
    private ItemList itemList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryBizItemsWithActivityResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemList = builder.itemList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizItemsWithActivityResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private ItemList itemList; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryBizItemsWithActivityResponseBody build() {
            return new QueryBizItemsWithActivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivityItemSku extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityPrice")
        private Long activityPrice;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        private ActivityItemSku(Builder builder) {
            this.activityPrice = builder.activityPrice;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityItemSku create() {
            return builder().build();
        }

        /**
         * @return activityPrice
         */
        public Long getActivityPrice() {
            return this.activityPrice;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private Long activityPrice; 
            private Long skuId; 

            /**
             * ActivityPrice.
             */
            public Builder activityPrice(Long activityPrice) {
                this.activityPrice = activityPrice;
                return this;
            }

            /**
             * <p>skuId</p>
             * 
             * <strong>example:</strong>
             * <p>471******57</p>
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            public ActivityItemSku build() {
                return new ActivityItemSku(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivityItemSkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityItemSku")
        private java.util.List<ActivityItemSku> activityItemSku;

        private ActivityItemSkuList(Builder builder) {
            this.activityItemSku = builder.activityItemSku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityItemSkuList create() {
            return builder().build();
        }

        /**
         * @return activityItemSku
         */
        public java.util.List<ActivityItemSku> getActivityItemSku() {
            return this.activityItemSku;
        }

        public static final class Builder {
            private java.util.List<ActivityItemSku> activityItemSku; 

            /**
             * ActivityItemSku.
             */
            public Builder activityItemSku(java.util.List<ActivityItemSku> activityItemSku) {
                this.activityItemSku = activityItemSku;
                return this;
            }

            public ActivityItemSkuList build() {
                return new ActivityItemSkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivityItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityItemSkuList")
        private ActivityItemSkuList activityItemSkuList;

        @com.aliyun.core.annotation.NameInMap("ActivityQuantity")
        private Long activityQuantity;

        @com.aliyun.core.annotation.NameInMap("LimitQuantityForPerson")
        private Long limitQuantityForPerson;

        private ActivityItem(Builder builder) {
            this.activityItemSkuList = builder.activityItemSkuList;
            this.activityQuantity = builder.activityQuantity;
            this.limitQuantityForPerson = builder.limitQuantityForPerson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityItem create() {
            return builder().build();
        }

        /**
         * @return activityItemSkuList
         */
        public ActivityItemSkuList getActivityItemSkuList() {
            return this.activityItemSkuList;
        }

        /**
         * @return activityQuantity
         */
        public Long getActivityQuantity() {
            return this.activityQuantity;
        }

        /**
         * @return limitQuantityForPerson
         */
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        public static final class Builder {
            private ActivityItemSkuList activityItemSkuList; 
            private Long activityQuantity; 
            private Long limitQuantityForPerson; 

            /**
             * ActivityItemSkuList.
             */
            public Builder activityItemSkuList(ActivityItemSkuList activityItemSkuList) {
                this.activityItemSkuList = activityItemSkuList;
                return this;
            }

            /**
             * ActivityQuantity.
             */
            public Builder activityQuantity(Long activityQuantity) {
                this.activityQuantity = activityQuantity;
                return this;
            }

            /**
             * LimitQuantityForPerson.
             */
            public Builder limitQuantityForPerson(Long limitQuantityForPerson) {
                this.limitQuantityForPerson = limitQuantityForPerson;
                return this;
            }

            public ActivityItem build() {
                return new ActivityItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivitySessionItemSkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        private ActivitySessionItemSkuList(Builder builder) {
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivitySessionItemSkuList create() {
            return builder().build();
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

        public static final class Builder {
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Long skuId; 

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
             * <p>skuId</p>
             * 
             * <strong>example:</strong>
             * <p>471******57</p>
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            public ActivitySessionItemSkuList build() {
                return new ActivitySessionItemSkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivitySessionItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivitySessionItemSkuList")
        private ActivitySessionItemSkuList activitySessionItemSkuList;

        @com.aliyun.core.annotation.NameInMap("LimitQuantityForPerson")
        private Long limitQuantityForPerson;

        @com.aliyun.core.annotation.NameInMap("SaleableQuantity")
        private Long saleableQuantity;

        @com.aliyun.core.annotation.NameInMap("SessionQuantity")
        private Long sessionQuantity;

        private ActivitySessionItem(Builder builder) {
            this.activitySessionItemSkuList = builder.activitySessionItemSkuList;
            this.limitQuantityForPerson = builder.limitQuantityForPerson;
            this.saleableQuantity = builder.saleableQuantity;
            this.sessionQuantity = builder.sessionQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivitySessionItem create() {
            return builder().build();
        }

        /**
         * @return activitySessionItemSkuList
         */
        public ActivitySessionItemSkuList getActivitySessionItemSkuList() {
            return this.activitySessionItemSkuList;
        }

        /**
         * @return limitQuantityForPerson
         */
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        /**
         * @return saleableQuantity
         */
        public Long getSaleableQuantity() {
            return this.saleableQuantity;
        }

        /**
         * @return sessionQuantity
         */
        public Long getSessionQuantity() {
            return this.sessionQuantity;
        }

        public static final class Builder {
            private ActivitySessionItemSkuList activitySessionItemSkuList; 
            private Long limitQuantityForPerson; 
            private Long saleableQuantity; 
            private Long sessionQuantity; 

            /**
             * ActivitySessionItemSkuList.
             */
            public Builder activitySessionItemSkuList(ActivitySessionItemSkuList activitySessionItemSkuList) {
                this.activitySessionItemSkuList = activitySessionItemSkuList;
                return this;
            }

            /**
             * LimitQuantityForPerson.
             */
            public Builder limitQuantityForPerson(Long limitQuantityForPerson) {
                this.limitQuantityForPerson = limitQuantityForPerson;
                return this;
            }

            /**
             * SaleableQuantity.
             */
            public Builder saleableQuantity(Long saleableQuantity) {
                this.saleableQuantity = saleableQuantity;
                return this;
            }

            /**
             * SessionQuantity.
             */
            public Builder sessionQuantity(Long sessionQuantity) {
                this.sessionQuantity = sessionQuantity;
                return this;
            }

            public ActivitySessionItem build() {
                return new ActivitySessionItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivitySession extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivitySessionItem")
        private ActivitySessionItem activitySessionItem;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayDate")
        private Long displayDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("LmSessionId")
        private Long lmSessionId;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ActivitySession(Builder builder) {
            this.activitySessionItem = builder.activitySessionItem;
            this.description = builder.description;
            this.displayDate = builder.displayDate;
            this.endDate = builder.endDate;
            this.lmSessionId = builder.lmSessionId;
            this.startDate = builder.startDate;
            this.subBizCode = builder.subBizCode;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivitySession create() {
            return builder().build();
        }

        /**
         * @return activitySessionItem
         */
        public ActivitySessionItem getActivitySessionItem() {
            return this.activitySessionItem;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayDate
         */
        public Long getDisplayDate() {
            return this.displayDate;
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return lmSessionId
         */
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private ActivitySessionItem activitySessionItem; 
            private String description; 
            private Long displayDate; 
            private Long endDate; 
            private Long lmSessionId; 
            private Long startDate; 
            private String subBizCode; 
            private String title; 

            /**
             * ActivitySessionItem.
             */
            public Builder activitySessionItem(ActivitySessionItem activitySessionItem) {
                this.activitySessionItem = activitySessionItem;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayDate.
             */
            public Builder displayDate(Long displayDate) {
                this.displayDate = displayDate;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * LmSessionId.
             */
            public Builder lmSessionId(Long lmSessionId) {
                this.lmSessionId = lmSessionId;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ActivitySession build() {
                return new ActivitySession(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class ActivitySessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivitySession")
        private java.util.List<ActivitySession> activitySession;

        private ActivitySessions(Builder builder) {
            this.activitySession = builder.activitySession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivitySessions create() {
            return builder().build();
        }

        /**
         * @return activitySession
         */
        public java.util.List<ActivitySession> getActivitySession() {
            return this.activitySession;
        }

        public static final class Builder {
            private java.util.List<ActivitySession> activitySession; 

            /**
             * ActivitySession.
             */
            public Builder activitySession(java.util.List<ActivitySession> activitySession) {
                this.activitySession = activitySession;
                return this;
            }

            public ActivitySessions build() {
                return new ActivitySessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class Activity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityItem")
        private ActivityItem activityItem;

        @com.aliyun.core.annotation.NameInMap("ActivitySessions")
        private ActivitySessions activitySessions;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("LmActivityId")
        private Long lmActivityId;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Activity(Builder builder) {
            this.activityItem = builder.activityItem;
            this.activitySessions = builder.activitySessions;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.lmActivityId = builder.lmActivityId;
            this.startDate = builder.startDate;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activity create() {
            return builder().build();
        }

        /**
         * @return activityItem
         */
        public ActivityItem getActivityItem() {
            return this.activityItem;
        }

        /**
         * @return activitySessions
         */
        public ActivitySessions getActivitySessions() {
            return this.activitySessions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return lmActivityId
         */
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private ActivityItem activityItem; 
            private ActivitySessions activitySessions; 
            private String description; 
            private Long endDate; 
            private Long lmActivityId; 
            private Long startDate; 
            private String title; 

            /**
             * ActivityItem.
             */
            public Builder activityItem(ActivityItem activityItem) {
                this.activityItem = activityItem;
                return this;
            }

            /**
             * ActivitySessions.
             */
            public Builder activitySessions(ActivitySessions activitySessions) {
                this.activitySessions = activitySessions;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
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
             * StartDate.
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Activity build() {
                return new Activity(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class Activities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activity")
        private java.util.List<Activity> activity;

        private Activities(Builder builder) {
            this.activity = builder.activity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activities create() {
            return builder().build();
        }

        /**
         * @return activity
         */
        public java.util.List<Activity> getActivity() {
            return this.activity;
        }

        public static final class Builder {
            private java.util.List<Activity> activity; 

            /**
             * Activity.
             */
            public Builder activity(java.util.List<Activity> activity) {
                this.activity = activity;
                return this;
            }

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class Sku extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxAllowedCount")
        private Integer maxAllowedCount;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("PointsAmount")
        private Long pointsAmount;

        @com.aliyun.core.annotation.NameInMap("PointsInfo")
        private String pointsInfo;

        @com.aliyun.core.annotation.NameInMap("PointsKey")
        private String pointsKey;

        @com.aliyun.core.annotation.NameInMap("PriceCent")
        private Long priceCent;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private Sku(Builder builder) {
            this.maxAllowedCount = builder.maxAllowedCount;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.pointsInfo = builder.pointsInfo;
            this.pointsKey = builder.pointsKey;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sku create() {
            return builder().build();
        }

        /**
         * @return maxAllowedCount
         */
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
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
         * @return pointsInfo
         */
        public String getPointsInfo() {
            return this.pointsInfo;
        }

        /**
         * @return pointsKey
         */
        public String getPointsKey() {
            return this.pointsKey;
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
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer maxAllowedCount; 
            private Long points; 
            private Long pointsAmount; 
            private String pointsInfo; 
            private String pointsKey; 
            private Long priceCent; 
            private Long quantity; 
            private Long skuId; 
            private Long status; 

            /**
             * MaxAllowedCount.
             */
            public Builder maxAllowedCount(Integer maxAllowedCount) {
                this.maxAllowedCount = maxAllowedCount;
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
             * PointsInfo.
             */
            public Builder pointsInfo(String pointsInfo) {
                this.pointsInfo = pointsInfo;
                return this;
            }

            /**
             * PointsKey.
             */
            public Builder pointsKey(String pointsKey) {
                this.pointsKey = pointsKey;
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
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>skuId</p>
             * 
             * <strong>example:</strong>
             * <p>472266643****</p>
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Sku build() {
                return new Sku(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
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
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activities")
        private Activities activities;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("MaxAllowedCount")
        private Integer maxAllowedCount;

        @com.aliyun.core.annotation.NameInMap("PicUrl")
        private String picUrl;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("ReservePrice")
        private Long reservePrice;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SkuList")
        private SkuList skuList;

        @com.aliyun.core.annotation.NameInMap("TaobaoShopName")
        private String taobaoShopName;

        @com.aliyun.core.annotation.NameInMap("TotalSoldQuantity")
        private Integer totalSoldQuantity;

        private Item(Builder builder) {
            this.activities = builder.activities;
            this.categoryId = builder.categoryId;
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.lmItemId = builder.lmItemId;
            this.maxAllowedCount = builder.maxAllowedCount;
            this.picUrl = builder.picUrl;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.sellerId = builder.sellerId;
            this.skuList = builder.skuList;
            this.taobaoShopName = builder.taobaoShopName;
            this.totalSoldQuantity = builder.totalSoldQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return activities
         */
        public Activities getActivities() {
            return this.activities;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
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
         * @return maxAllowedCount
         */
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
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
        public SkuList getSkuList() {
            return this.skuList;
        }

        /**
         * @return taobaoShopName
         */
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

        /**
         * @return totalSoldQuantity
         */
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public static final class Builder {
            private Activities activities; 
            private Long categoryId; 
            private Long itemId; 
            private String itemTitle; 
            private String lmItemId; 
            private Integer maxAllowedCount; 
            private String picUrl; 
            private Long quantity; 
            private Long reservePrice; 
            private Long sellerId; 
            private SkuList skuList; 
            private String taobaoShopName; 
            private Integer totalSoldQuantity; 

            /**
             * Activities.
             */
            public Builder activities(Activities activities) {
                this.activities = activities;
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
             * MaxAllowedCount.
             */
            public Builder maxAllowedCount(Integer maxAllowedCount) {
                this.maxAllowedCount = maxAllowedCount;
                return this;
            }

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
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
    /**
     * 
     * {@link QueryBizItemsWithActivityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBizItemsWithActivityResponseBody</p>
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
