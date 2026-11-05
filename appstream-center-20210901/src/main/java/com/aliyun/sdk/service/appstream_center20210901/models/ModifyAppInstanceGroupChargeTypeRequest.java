// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyAppInstanceGroupChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppInstanceGroupChargeTypeRequest</p>
 */
public class ModifyAppInstanceGroupChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> appInstanceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private ModifyAppInstanceGroupChargeTypeRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupIds = builder.appInstanceGroupIds;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productType = builder.productType;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppInstanceGroupChargeTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupIds
     */
    public java.util.List<String> getAppInstanceGroupIds() {
        return this.appInstanceGroupIds;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<ModifyAppInstanceGroupChargeTypeRequest, Builder> {
        private java.util.List<String> appInstanceGroupIds; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private String chargeType; 
        private Integer period; 
        private String periodUnit; 
        private String productType; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppInstanceGroupChargeTypeRequest request) {
            super(request);
            this.appInstanceGroupIds = request.appInstanceGroupIds;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productType = request.productType;
            this.promotionId = request.promotionId;
        } 

        /**
         * <p>The list of delivery group IDs to be modified, in JSON array format. <strong>You must and can only specify one item per request</strong>. The resources must belong to the current account, the specified product, and the business region.</p>
         * <p>This parameter is required.</p>
         */
        public Builder appInstanceGroupIds(java.util.List<String> appInstanceGroupIds) {
            String appInstanceGroupIdsShrink = shrink(appInstanceGroupIds, "AppInstanceGroupIds", "json");
            this.putBodyParameter("AppInstanceGroupIds", appInstanceGroupIdsShrink);
            this.appInstanceGroupIds = appInstanceGroupIds;
            return this;
        }

        /**
         * <p>Specifies whether to allow automatic payment for the conversion order. Default value: <code>false</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Automatic payment is allowed.</li>
         * <li><code>false</code>: Automatic payment is not allowed. If an unpaid order is generated, you must complete the payment separately.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the order. We recommend that you explicitly specify this parameter for subscription orders to determine whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Auto-renewal is enabled.</li>
         * <li><code>false</code>: Auto-renewal is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The business region ID of the target delivery group. It must be the same as the actual region to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The target billing method after conversion. It must be different from the current billing method. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription</li>
         * <li><code>PostPaid</code>: pay-as-you-go</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The numeric part of the purchase duration, used together with <code>PeriodUnit</code>. When converting to subscription and a purchase duration is required, specify both parameters. For example, <code>1</code> and <code>Month</code> indicate a purchase duration of one month. The available purchase durations are determined by the sales rules of the target resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the purchase duration, used together with <code>Period</code>. This parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li><code>Hour</code>: hour</li>
         * <li><code>Day</code>: day</li>
         * <li><code>Week</code>: week</li>
         * <li><code>Month</code>: month</li>
         * <li><code>Year</code>: year</li>
         * </ul>
         * <p>These units do not mean that any combination is available for every product. When converting to subscription, select a period supported by the target resource. For example, for a resource that supports monthly purchase, you can set <code>Period</code> to <code>1</code> and <code>PeriodUnit</code> to <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The product type. Set this parameter to the following fixed value when you call the operation:</p>
         * <ul>
         * <li><code>CloudApp</code>: WUYING Cloud Application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The ID of the promotion used for the conversion order. It takes effect only when an order is created and the promotion is applicable. If omitted, no specific coupon is specified. The availability of the promotion is subject to the order result.</p>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public ModifyAppInstanceGroupChargeTypeRequest build() {
            return new ModifyAppInstanceGroupChargeTypeRequest(this);
        } 

    } 

}
