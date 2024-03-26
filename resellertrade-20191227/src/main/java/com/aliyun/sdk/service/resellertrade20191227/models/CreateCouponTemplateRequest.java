// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCouponTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCouponTemplateRequest</p>
 */
public class CreateCouponTemplateRequest extends Request {
    @Body
    @NameInMap("ActivitySite")
    private Integer activitySite;

    @Body
    @NameInMap("Bid")
    private Long bid;

    @Body
    @NameInMap("CertainMoney")
    private Double certainMoney;

    @Body
    @NameInMap("ClientType")
    private String clientType;

    @Body
    @NameInMap("CommodityType")
    private String commodityType;

    @Body
    @NameInMap("ControlType")
    private String controlType;

    @Body
    @NameInMap("CouponAmount")
    private Double couponAmount;

    @Body
    @NameInMap("CouponEndTime")
    private String couponEndTime;

    @Body
    @NameInMap("CouponFixedType")
    private String couponFixedType;

    @Body
    @NameInMap("CouponStartTime")
    private String couponStartTime;

    @Body
    @NameInMap("CouponType")
    private String couponType;

    @Body
    @NameInMap("Currency")
    private Currency currency;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DiscountRate")
    private Double discountRate;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("ExtendsMap")
    private java.util.Map < String, String > extendsMap;

    @Body
    @NameInMap("FromApp")
    private String fromApp;

    @Body
    @NameInMap("ItemCodeSet")
    private java.util.List < String > itemCodeSet;

    @Body
    @NameInMap("Market")
    private String market;

    @Body
    @NameInMap("MarketType")
    private Long marketType;

    @Body
    @NameInMap("MaxRelease")
    private Double maxRelease;

    @Body
    @NameInMap("MessageId")
    private String messageId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Operator")
    private String operator;

    @Body
    @NameInMap("OrderTypeSet")
    private java.util.List < String > orderTypeSet;

    @Body
    @NameInMap("PerLimitNum")
    private Integer perLimitNum;

    @Body
    @NameInMap("PromotionId")
    private Long promotionId;

    @Body
    @NameInMap("Reason")
    private String reason;

    @Body
    @NameInMap("RelativeSecond")
    private Integer relativeSecond;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SelectionIdSet")
    private java.util.List < String > selectionIdSet;

    @Body
    @NameInMap("SellerId")
    private Long sellerId;

    @Body
    @NameInMap("Site")
    private String site;

    @Body
    @NameInMap("SpId")
    private Long spId;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("UniversalType")
    private String universalType;

    @Body
    @NameInMap("UpperLimit")
    private Double upperLimit;

    @Body
    @NameInMap("UsageCount")
    private Integer usageCount;

    @Body
    @NameInMap("UseScene")
    private String useScene;

    @Body
    @NameInMap("UserPkAmount")
    private String userPkAmount;

    @Body
    @NameInMap("ValidityType")
    private String validityType;

    private CreateCouponTemplateRequest(Builder builder) {
        super(builder);
        this.activitySite = builder.activitySite;
        this.bid = builder.bid;
        this.certainMoney = builder.certainMoney;
        this.clientType = builder.clientType;
        this.commodityType = builder.commodityType;
        this.controlType = builder.controlType;
        this.couponAmount = builder.couponAmount;
        this.couponEndTime = builder.couponEndTime;
        this.couponFixedType = builder.couponFixedType;
        this.couponStartTime = builder.couponStartTime;
        this.couponType = builder.couponType;
        this.currency = builder.currency;
        this.description = builder.description;
        this.discountRate = builder.discountRate;
        this.endTime = builder.endTime;
        this.extendsMap = builder.extendsMap;
        this.fromApp = builder.fromApp;
        this.itemCodeSet = builder.itemCodeSet;
        this.market = builder.market;
        this.marketType = builder.marketType;
        this.maxRelease = builder.maxRelease;
        this.messageId = builder.messageId;
        this.name = builder.name;
        this.operator = builder.operator;
        this.orderTypeSet = builder.orderTypeSet;
        this.perLimitNum = builder.perLimitNum;
        this.promotionId = builder.promotionId;
        this.reason = builder.reason;
        this.relativeSecond = builder.relativeSecond;
        this.requestId = builder.requestId;
        this.selectionIdSet = builder.selectionIdSet;
        this.sellerId = builder.sellerId;
        this.site = builder.site;
        this.spId = builder.spId;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.universalType = builder.universalType;
        this.upperLimit = builder.upperLimit;
        this.usageCount = builder.usageCount;
        this.useScene = builder.useScene;
        this.userPkAmount = builder.userPkAmount;
        this.validityType = builder.validityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCouponTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activitySite
     */
    public Integer getActivitySite() {
        return this.activitySite;
    }

    /**
     * @return bid
     */
    public Long getBid() {
        return this.bid;
    }

    /**
     * @return certainMoney
     */
    public Double getCertainMoney() {
        return this.certainMoney;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return commodityType
     */
    public String getCommodityType() {
        return this.commodityType;
    }

    /**
     * @return controlType
     */
    public String getControlType() {
        return this.controlType;
    }

    /**
     * @return couponAmount
     */
    public Double getCouponAmount() {
        return this.couponAmount;
    }

    /**
     * @return couponEndTime
     */
    public String getCouponEndTime() {
        return this.couponEndTime;
    }

    /**
     * @return couponFixedType
     */
    public String getCouponFixedType() {
        return this.couponFixedType;
    }

    /**
     * @return couponStartTime
     */
    public String getCouponStartTime() {
        return this.couponStartTime;
    }

    /**
     * @return couponType
     */
    public String getCouponType() {
        return this.couponType;
    }

    /**
     * @return currency
     */
    public Currency getCurrency() {
        return this.currency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return discountRate
     */
    public Double getDiscountRate() {
        return this.discountRate;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extendsMap
     */
    public java.util.Map < String, String > getExtendsMap() {
        return this.extendsMap;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return itemCodeSet
     */
    public java.util.List < String > getItemCodeSet() {
        return this.itemCodeSet;
    }

    /**
     * @return market
     */
    public String getMarket() {
        return this.market;
    }

    /**
     * @return marketType
     */
    public Long getMarketType() {
        return this.marketType;
    }

    /**
     * @return maxRelease
     */
    public Double getMaxRelease() {
        return this.maxRelease;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return orderTypeSet
     */
    public java.util.List < String > getOrderTypeSet() {
        return this.orderTypeSet;
    }

    /**
     * @return perLimitNum
     */
    public Integer getPerLimitNum() {
        return this.perLimitNum;
    }

    /**
     * @return promotionId
     */
    public Long getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return relativeSecond
     */
    public Integer getRelativeSecond() {
        return this.relativeSecond;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectionIdSet
     */
    public java.util.List < String > getSelectionIdSet() {
        return this.selectionIdSet;
    }

    /**
     * @return sellerId
     */
    public Long getSellerId() {
        return this.sellerId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    /**
     * @return spId
     */
    public Long getSpId() {
        return this.spId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return universalType
     */
    public String getUniversalType() {
        return this.universalType;
    }

    /**
     * @return upperLimit
     */
    public Double getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * @return usageCount
     */
    public Integer getUsageCount() {
        return this.usageCount;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    /**
     * @return userPkAmount
     */
    public String getUserPkAmount() {
        return this.userPkAmount;
    }

    /**
     * @return validityType
     */
    public String getValidityType() {
        return this.validityType;
    }

    public static final class Builder extends Request.Builder<CreateCouponTemplateRequest, Builder> {
        private Integer activitySite; 
        private Long bid; 
        private Double certainMoney; 
        private String clientType; 
        private String commodityType; 
        private String controlType; 
        private Double couponAmount; 
        private String couponEndTime; 
        private String couponFixedType; 
        private String couponStartTime; 
        private String couponType; 
        private Currency currency; 
        private String description; 
        private Double discountRate; 
        private String endTime; 
        private java.util.Map < String, String > extendsMap; 
        private String fromApp; 
        private java.util.List < String > itemCodeSet; 
        private String market; 
        private Long marketType; 
        private Double maxRelease; 
        private String messageId; 
        private String name; 
        private String operator; 
        private java.util.List < String > orderTypeSet; 
        private Integer perLimitNum; 
        private Long promotionId; 
        private String reason; 
        private Integer relativeSecond; 
        private String requestId; 
        private java.util.List < String > selectionIdSet; 
        private Long sellerId; 
        private String site; 
        private Long spId; 
        private String startTime; 
        private String type; 
        private String universalType; 
        private Double upperLimit; 
        private Integer usageCount; 
        private String useScene; 
        private String userPkAmount; 
        private String validityType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCouponTemplateRequest request) {
            super(request);
            this.activitySite = request.activitySite;
            this.bid = request.bid;
            this.certainMoney = request.certainMoney;
            this.clientType = request.clientType;
            this.commodityType = request.commodityType;
            this.controlType = request.controlType;
            this.couponAmount = request.couponAmount;
            this.couponEndTime = request.couponEndTime;
            this.couponFixedType = request.couponFixedType;
            this.couponStartTime = request.couponStartTime;
            this.couponType = request.couponType;
            this.currency = request.currency;
            this.description = request.description;
            this.discountRate = request.discountRate;
            this.endTime = request.endTime;
            this.extendsMap = request.extendsMap;
            this.fromApp = request.fromApp;
            this.itemCodeSet = request.itemCodeSet;
            this.market = request.market;
            this.marketType = request.marketType;
            this.maxRelease = request.maxRelease;
            this.messageId = request.messageId;
            this.name = request.name;
            this.operator = request.operator;
            this.orderTypeSet = request.orderTypeSet;
            this.perLimitNum = request.perLimitNum;
            this.promotionId = request.promotionId;
            this.reason = request.reason;
            this.relativeSecond = request.relativeSecond;
            this.requestId = request.requestId;
            this.selectionIdSet = request.selectionIdSet;
            this.sellerId = request.sellerId;
            this.site = request.site;
            this.spId = request.spId;
            this.startTime = request.startTime;
            this.type = request.type;
            this.universalType = request.universalType;
            this.upperLimit = request.upperLimit;
            this.usageCount = request.usageCount;
            this.useScene = request.useScene;
            this.userPkAmount = request.userPkAmount;
            this.validityType = request.validityType;
        } 

        /**
         * ActivitySite.
         */
        public Builder activitySite(Integer activitySite) {
            this.putBodyParameter("ActivitySite", activitySite);
            this.activitySite = activitySite;
            return this;
        }

        /**
         * Bid.
         */
        public Builder bid(Long bid) {
            this.putBodyParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * CertainMoney.
         */
        public Builder certainMoney(Double certainMoney) {
            this.putBodyParameter("CertainMoney", certainMoney);
            this.certainMoney = certainMoney;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * CommodityType.
         */
        public Builder commodityType(String commodityType) {
            this.putBodyParameter("CommodityType", commodityType);
            this.commodityType = commodityType;
            return this;
        }

        /**
         * ControlType.
         */
        public Builder controlType(String controlType) {
            this.putBodyParameter("ControlType", controlType);
            this.controlType = controlType;
            return this;
        }

        /**
         * CouponAmount.
         */
        public Builder couponAmount(Double couponAmount) {
            this.putBodyParameter("CouponAmount", couponAmount);
            this.couponAmount = couponAmount;
            return this;
        }

        /**
         * CouponEndTime.
         */
        public Builder couponEndTime(String couponEndTime) {
            this.putBodyParameter("CouponEndTime", couponEndTime);
            this.couponEndTime = couponEndTime;
            return this;
        }

        /**
         * CouponFixedType.
         */
        public Builder couponFixedType(String couponFixedType) {
            this.putBodyParameter("CouponFixedType", couponFixedType);
            this.couponFixedType = couponFixedType;
            return this;
        }

        /**
         * CouponStartTime.
         */
        public Builder couponStartTime(String couponStartTime) {
            this.putBodyParameter("CouponStartTime", couponStartTime);
            this.couponStartTime = couponStartTime;
            return this;
        }

        /**
         * CouponType.
         */
        public Builder couponType(String couponType) {
            this.putBodyParameter("CouponType", couponType);
            this.couponType = couponType;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(Currency currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DiscountRate.
         */
        public Builder discountRate(Double discountRate) {
            this.putBodyParameter("DiscountRate", discountRate);
            this.discountRate = discountRate;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExtendsMap.
         */
        public Builder extendsMap(java.util.Map < String, String > extendsMap) {
            this.putBodyParameter("ExtendsMap", extendsMap);
            this.extendsMap = extendsMap;
            return this;
        }

        /**
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putBodyParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * ItemCodeSet.
         */
        public Builder itemCodeSet(java.util.List < String > itemCodeSet) {
            this.putBodyParameter("ItemCodeSet", itemCodeSet);
            this.itemCodeSet = itemCodeSet;
            return this;
        }

        /**
         * Market.
         */
        public Builder market(String market) {
            this.putBodyParameter("Market", market);
            this.market = market;
            return this;
        }

        /**
         * MarketType.
         */
        public Builder marketType(Long marketType) {
            this.putBodyParameter("MarketType", marketType);
            this.marketType = marketType;
            return this;
        }

        /**
         * MaxRelease.
         */
        public Builder maxRelease(Double maxRelease) {
            this.putBodyParameter("MaxRelease", maxRelease);
            this.maxRelease = maxRelease;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * OrderTypeSet.
         */
        public Builder orderTypeSet(java.util.List < String > orderTypeSet) {
            this.putBodyParameter("OrderTypeSet", orderTypeSet);
            this.orderTypeSet = orderTypeSet;
            return this;
        }

        /**
         * PerLimitNum.
         */
        public Builder perLimitNum(Integer perLimitNum) {
            this.putBodyParameter("PerLimitNum", perLimitNum);
            this.perLimitNum = perLimitNum;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(Long promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * RelativeSecond.
         */
        public Builder relativeSecond(Integer relativeSecond) {
            this.putBodyParameter("RelativeSecond", relativeSecond);
            this.relativeSecond = relativeSecond;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SelectionIdSet.
         */
        public Builder selectionIdSet(java.util.List < String > selectionIdSet) {
            this.putBodyParameter("SelectionIdSet", selectionIdSet);
            this.selectionIdSet = selectionIdSet;
            return this;
        }

        /**
         * SellerId.
         */
        public Builder sellerId(Long sellerId) {
            this.putBodyParameter("SellerId", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * Site.
         */
        public Builder site(String site) {
            this.putBodyParameter("Site", site);
            this.site = site;
            return this;
        }

        /**
         * SpId.
         */
        public Builder spId(Long spId) {
            this.putBodyParameter("SpId", spId);
            this.spId = spId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UniversalType.
         */
        public Builder universalType(String universalType) {
            this.putBodyParameter("UniversalType", universalType);
            this.universalType = universalType;
            return this;
        }

        /**
         * UpperLimit.
         */
        public Builder upperLimit(Double upperLimit) {
            this.putBodyParameter("UpperLimit", upperLimit);
            this.upperLimit = upperLimit;
            return this;
        }

        /**
         * UsageCount.
         */
        public Builder usageCount(Integer usageCount) {
            this.putBodyParameter("UsageCount", usageCount);
            this.usageCount = usageCount;
            return this;
        }

        /**
         * UseScene.
         */
        public Builder useScene(String useScene) {
            this.putBodyParameter("UseScene", useScene);
            this.useScene = useScene;
            return this;
        }

        /**
         * UserPkAmount.
         */
        public Builder userPkAmount(String userPkAmount) {
            this.putBodyParameter("UserPkAmount", userPkAmount);
            this.userPkAmount = userPkAmount;
            return this;
        }

        /**
         * ValidityType.
         */
        public Builder validityType(String validityType) {
            this.putBodyParameter("ValidityType", validityType);
            this.validityType = validityType;
            return this;
        }

        @Override
        public CreateCouponTemplateRequest build() {
            return new CreateCouponTemplateRequest(this);
        } 

    } 

    public static class Currency extends TeaModel {
        @NameInMap("CurrencyCode")
        private String currencyCode;

        @NameInMap("DefaultFractionDigits")
        private Integer defaultFractionDigits;

        @NameInMap("NumericCode")
        private Integer numericCode;

        private Currency(Builder builder) {
            this.currencyCode = builder.currencyCode;
            this.defaultFractionDigits = builder.defaultFractionDigits;
            this.numericCode = builder.numericCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Currency create() {
            return builder().build();
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return defaultFractionDigits
         */
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        /**
         * @return numericCode
         */
        public Integer getNumericCode() {
            return this.numericCode;
        }

        public static final class Builder {
            private String currencyCode; 
            private Integer defaultFractionDigits; 
            private Integer numericCode; 

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * DefaultFractionDigits.
             */
            public Builder defaultFractionDigits(Integer defaultFractionDigits) {
                this.defaultFractionDigits = defaultFractionDigits;
                return this;
            }

            /**
             * NumericCode.
             */
            public Builder numericCode(Integer numericCode) {
                this.numericCode = numericCode;
                return this;
            }

            public Currency build() {
                return new Currency(this);
            } 

        } 

    }
}
