// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("IncludeDataDisks")
    private Boolean includeDataDisks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIds;

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
    public java.util.List < String > getInstanceIds() {
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
        private Boolean includeDataDisks; 
        private String instanceChargeType; 
        private java.util.List < String > instanceIds; 
        private String period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceChargeTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.includeDataDisks = request.includeDataDisks;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceIds = request.instanceIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
        } 

        /**
         * Specifies whether to enable auto-payment when you change the billing method from pay-as-you-go to subscription. Valid values:
         * <p>
         * 
         * true: enables auto-payment. Make sure that your account has sufficient balance.
         * 
         * false (default): does not enable auto-payment. The order is generated but not paid.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal when you change the billing method from pay-as-you-go to subscription. Valid values:
         * <p>
         * 
         * true
         * 
         * false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Specifies whether to change the billing method of all data disks that are created with the instance to subscription when you change the billing method of the instance from pay-as-you-go to subscription. Valid values:
         * <p>
         * 
         * true
         * 
         * false (default)
         */
        public Builder includeDataDisks(Boolean includeDataDisks) {
            this.putQueryParameter("IncludeDataDisks", includeDataDisks);
            this.includeDataDisks = includeDataDisks;
            return this;
        }

        /**
         * The new billing method. Valid values:
         * <p>
         * 
         * PrePaid
         * 
         * PostPaid (default)
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The IDs of the instances.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The subscription duration. This parameter is required if you set the InstanceChargeType parameter to PrePaid. Valid values:
         * <p>
         * 
         * If the PeriodUnit parameter is set to Day, Period can only be set to 3.
         * 
         * If PeriodUnit is Month, Period can be set to 1 to 9 or 12.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration. This parameter is required if you set the InstanceChargeType parameter to PrePaid. Examples:
         * <p>
         * 
         * Month
         * 
         * Day
         * 
         * Valid values:
         * 
         * *   Year
         * *   Month
         * *   Day
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
