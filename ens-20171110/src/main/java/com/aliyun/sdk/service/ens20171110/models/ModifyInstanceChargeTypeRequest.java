// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyInstanceChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceChargeTypeRequest</p>
 */
public class ModifyInstanceChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDataDisks")
    private Boolean includeDataDisks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    private ModifyInstanceChargeTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.billingCycle = builder.billingCycle;
        this.includeDataDisks = builder.includeDataDisks;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceIds = builder.instanceIds;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceChargeTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return includeDataDisks
     */
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceChargeTypeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String billingCycle; 
        private Boolean includeDataDisks; 
        private String instanceChargeType; 
        private java.util.List<String> instanceIds; 
        private String period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceChargeTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.billingCycle = request.billingCycle;
            this.includeDataDisks = request.includeDataDisks;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceIds = request.instanceIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
        } 

        /**
         * <p>Specifies whether to automatically complete the payment when you switch the billing method of the instance from pay-as-you-go to subscription. Valid values:</p>
         * <p>true: The payment is automatically completed. Make sure that your account balance is sufficient.</p>
         * <p>false: Only an order is generated but no payment is made. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal when converting the instance from pay-as-you-go to subscription. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is not enabled (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The billing cycle. Valid values: Month, Day, and Hour.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>Specifies whether to convert all pay-as-you-go data cloud disks created with the instance to subscription data cloud disks when converting an instance-level pay-as-you-go instance to a subscription instance. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeDataDisks(Boolean includeDataDisks) {
            this.putQueryParameter("IncludeDataDisks", includeDataDisks);
            this.includeDataDisks = includeDataDisks;
            return this;
        }

        /**
         * <p>The target billing method of the instance. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The list of instance IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The subscription duration when converting a pay-as-you-go instance to subscription. This parameter is required in this scenario. Valid values:</p>
         * <p>If PeriodUnit is set to Day, Period can only be set to 3.</p>
         * <p>If PeriodUnit is set to Month, Period can be set to 1-9 or 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration when converting an instance-level pay-as-you-go instance to a subscription instance. This parameter is required in this scenario. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        @Override
        public ModifyInstanceChargeTypeRequest build() {
            return new ModifyInstanceChargeTypeRequest(this);
        } 

    } 

}
