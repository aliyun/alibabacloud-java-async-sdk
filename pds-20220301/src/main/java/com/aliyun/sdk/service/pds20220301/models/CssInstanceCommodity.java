// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssInstanceCommodity} extends {@link TeaModel}
 *
 * <p>CssInstanceCommodity</p>
 */
public class CssInstanceCommodity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activityId")
    private Long activityId;

    @com.aliyun.core.annotation.NameInMap("aliyunProduceCode")
    private String aliyunProduceCode;

    @com.aliyun.core.annotation.NameInMap("chargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<CssInstanceComponent> components;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("isFree")
    private Boolean isFree;

    @com.aliyun.core.annotation.NameInMap("isPrePayPostCharge")
    private Boolean isPrePayPostCharge;

    @com.aliyun.core.annotation.NameInMap("isRenewChange")
    private Boolean isRenewChange;

    @com.aliyun.core.annotation.NameInMap("isSyncToSubscription")
    private Boolean isSyncToSubscription;

    @com.aliyun.core.annotation.NameInMap("orderParams")
    private java.util.Map<String, String> orderParams;

    @com.aliyun.core.annotation.NameInMap("orderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("planItemId")
    private Long planItemId;

    @com.aliyun.core.annotation.NameInMap("pricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("redeemNoList")
    private java.util.List<String> redeemNoList;

    @com.aliyun.core.annotation.NameInMap("redeemOrderType")
    private String redeemOrderType;

    @com.aliyun.core.annotation.NameInMap("refundSpecCode")
    private String refundSpecCode;

    @com.aliyun.core.annotation.NameInMap("specCode")
    private String specCode;

    @com.aliyun.core.annotation.NameInMap("specUpgradeOriginSpecCodes")
    private java.util.List<String> specUpgradeOriginSpecCodes;

    @com.aliyun.core.annotation.NameInMap("specifyStartDate")
    private Long specifyStartDate;

    @com.aliyun.core.annotation.NameInMap("upgradeInquireFinancialValue")
    private Boolean upgradeInquireFinancialValue;

    private CssInstanceCommodity(Builder builder) {
        this.activityId = builder.activityId;
        this.aliyunProduceCode = builder.aliyunProduceCode;
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.components = builder.components;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.isFree = builder.isFree;
        this.isPrePayPostCharge = builder.isPrePayPostCharge;
        this.isRenewChange = builder.isRenewChange;
        this.isSyncToSubscription = builder.isSyncToSubscription;
        this.orderParams = builder.orderParams;
        this.orderType = builder.orderType;
        this.planItemId = builder.planItemId;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.redeemNoList = builder.redeemNoList;
        this.redeemOrderType = builder.redeemOrderType;
        this.refundSpecCode = builder.refundSpecCode;
        this.specCode = builder.specCode;
        this.specUpgradeOriginSpecCodes = builder.specUpgradeOriginSpecCodes;
        this.specifyStartDate = builder.specifyStartDate;
        this.upgradeInquireFinancialValue = builder.upgradeInquireFinancialValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssInstanceCommodity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return aliyunProduceCode
     */
    public String getAliyunProduceCode() {
        return this.aliyunProduceCode;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return components
     */
    public java.util.List<CssInstanceComponent> getComponents() {
        return this.components;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isFree
     */
    public Boolean getIsFree() {
        return this.isFree;
    }

    /**
     * @return isPrePayPostCharge
     */
    public Boolean getIsPrePayPostCharge() {
        return this.isPrePayPostCharge;
    }

    /**
     * @return isRenewChange
     */
    public Boolean getIsRenewChange() {
        return this.isRenewChange;
    }

    /**
     * @return isSyncToSubscription
     */
    public Boolean getIsSyncToSubscription() {
        return this.isSyncToSubscription;
    }

    /**
     * @return orderParams
     */
    public java.util.Map<String, String> getOrderParams() {
        return this.orderParams;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return planItemId
     */
    public Long getPlanItemId() {
        return this.planItemId;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return redeemNoList
     */
    public java.util.List<String> getRedeemNoList() {
        return this.redeemNoList;
    }

    /**
     * @return redeemOrderType
     */
    public String getRedeemOrderType() {
        return this.redeemOrderType;
    }

    /**
     * @return refundSpecCode
     */
    public String getRefundSpecCode() {
        return this.refundSpecCode;
    }

    /**
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    /**
     * @return specUpgradeOriginSpecCodes
     */
    public java.util.List<String> getSpecUpgradeOriginSpecCodes() {
        return this.specUpgradeOriginSpecCodes;
    }

    /**
     * @return specifyStartDate
     */
    public Long getSpecifyStartDate() {
        return this.specifyStartDate;
    }

    /**
     * @return upgradeInquireFinancialValue
     */
    public Boolean getUpgradeInquireFinancialValue() {
        return this.upgradeInquireFinancialValue;
    }

    public static final class Builder {
        private Long activityId; 
        private String aliyunProduceCode; 
        private String chargeType; 
        private String commodityCode; 
        private java.util.List<CssInstanceComponent> components; 
        private Long duration; 
        private String instanceId; 
        private Boolean isFree; 
        private Boolean isPrePayPostCharge; 
        private Boolean isRenewChange; 
        private Boolean isSyncToSubscription; 
        private java.util.Map<String, String> orderParams; 
        private String orderType; 
        private Long planItemId; 
        private String pricingCycle; 
        private Long quantity; 
        private java.util.List<String> redeemNoList; 
        private String redeemOrderType; 
        private String refundSpecCode; 
        private String specCode; 
        private java.util.List<String> specUpgradeOriginSpecCodes; 
        private Long specifyStartDate; 
        private Boolean upgradeInquireFinancialValue; 

        private Builder() {
        } 

        private Builder(CssInstanceCommodity model) {
            this.activityId = model.activityId;
            this.aliyunProduceCode = model.aliyunProduceCode;
            this.chargeType = model.chargeType;
            this.commodityCode = model.commodityCode;
            this.components = model.components;
            this.duration = model.duration;
            this.instanceId = model.instanceId;
            this.isFree = model.isFree;
            this.isPrePayPostCharge = model.isPrePayPostCharge;
            this.isRenewChange = model.isRenewChange;
            this.isSyncToSubscription = model.isSyncToSubscription;
            this.orderParams = model.orderParams;
            this.orderType = model.orderType;
            this.planItemId = model.planItemId;
            this.pricingCycle = model.pricingCycle;
            this.quantity = model.quantity;
            this.redeemNoList = model.redeemNoList;
            this.redeemOrderType = model.redeemOrderType;
            this.refundSpecCode = model.refundSpecCode;
            this.specCode = model.specCode;
            this.specUpgradeOriginSpecCodes = model.specUpgradeOriginSpecCodes;
            this.specifyStartDate = model.specifyStartDate;
            this.upgradeInquireFinancialValue = model.upgradeInquireFinancialValue;
        } 

        /**
         * activityId.
         */
        public Builder activityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }

        /**
         * aliyunProduceCode.
         */
        public Builder aliyunProduceCode(String aliyunProduceCode) {
            this.aliyunProduceCode = aliyunProduceCode;
            return this;
        }

        /**
         * chargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * commodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List<CssInstanceComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * isFree.
         */
        public Builder isFree(Boolean isFree) {
            this.isFree = isFree;
            return this;
        }

        /**
         * isPrePayPostCharge.
         */
        public Builder isPrePayPostCharge(Boolean isPrePayPostCharge) {
            this.isPrePayPostCharge = isPrePayPostCharge;
            return this;
        }

        /**
         * isRenewChange.
         */
        public Builder isRenewChange(Boolean isRenewChange) {
            this.isRenewChange = isRenewChange;
            return this;
        }

        /**
         * isSyncToSubscription.
         */
        public Builder isSyncToSubscription(Boolean isSyncToSubscription) {
            this.isSyncToSubscription = isSyncToSubscription;
            return this;
        }

        /**
         * orderParams.
         */
        public Builder orderParams(java.util.Map<String, String> orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * orderType.
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * planItemId.
         */
        public Builder planItemId(Long planItemId) {
            this.planItemId = planItemId;
            return this;
        }

        /**
         * pricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * redeemNoList.
         */
        public Builder redeemNoList(java.util.List<String> redeemNoList) {
            this.redeemNoList = redeemNoList;
            return this;
        }

        /**
         * redeemOrderType.
         */
        public Builder redeemOrderType(String redeemOrderType) {
            this.redeemOrderType = redeemOrderType;
            return this;
        }

        /**
         * refundSpecCode.
         */
        public Builder refundSpecCode(String refundSpecCode) {
            this.refundSpecCode = refundSpecCode;
            return this;
        }

        /**
         * specCode.
         */
        public Builder specCode(String specCode) {
            this.specCode = specCode;
            return this;
        }

        /**
         * specUpgradeOriginSpecCodes.
         */
        public Builder specUpgradeOriginSpecCodes(java.util.List<String> specUpgradeOriginSpecCodes) {
            this.specUpgradeOriginSpecCodes = specUpgradeOriginSpecCodes;
            return this;
        }

        /**
         * specifyStartDate.
         */
        public Builder specifyStartDate(Long specifyStartDate) {
            this.specifyStartDate = specifyStartDate;
            return this;
        }

        /**
         * upgradeInquireFinancialValue.
         */
        public Builder upgradeInquireFinancialValue(Boolean upgradeInquireFinancialValue) {
            this.upgradeInquireFinancialValue = upgradeInquireFinancialValue;
            return this;
        }

        public CssInstanceCommodity build() {
            return new CssInstanceCommodity(this);
        } 

    } 

}
