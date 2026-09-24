// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link PaymentInfo} extends {@link TeaModel}
 *
 * <p>PaymentInfo</p>
 */
public class PaymentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRenewDuration")
    private Long autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("isAutoRenew")
    private Boolean isAutoRenew;

    @com.aliyun.core.annotation.NameInMap("pricingCycle")
    private String pricingCycle;

    private PaymentInfo(Builder builder) {
        this.autoRenewDuration = builder.autoRenewDuration;
        this.duration = builder.duration;
        this.isAutoRenew = builder.isAutoRenew;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaymentInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewDuration
     */
    public Long getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public static final class Builder {
        private Long autoRenewDuration; 
        private Long duration; 
        private Boolean isAutoRenew; 
        private String pricingCycle; 

        private Builder() {
        } 

        private Builder(PaymentInfo model) {
            this.autoRenewDuration = model.autoRenewDuration;
            this.duration = model.duration;
            this.isAutoRenew = model.isAutoRenew;
            this.pricingCycle = model.pricingCycle;
        } 

        /**
         * <p>The auto-renewal cycle. Unit: month. This parameter is required when <strong>isAutoRenew</strong> is set to <strong>true</strong>. The valid values are the same as those on the buy page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoRenewDuration(Long autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter is required. You can specify the duration in months or years.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false (default): disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is required. Valid values:</p>
         * <ul>
         * <li>Year: year</li>
         * <li>Month: month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        public PaymentInfo build() {
            return new PaymentInfo(this);
        } 

    } 

}
