// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaymentInfo} extends {@link TeaModel}
 *
 * <p>PaymentInfo</p>
 */
public class PaymentInfo extends TeaModel {
    @NameInMap("autoRenewDuration")
    private Long autoRenewDuration;

    @NameInMap("duration")
    private Long duration;

    @NameInMap("isAutoRenew")
    private Boolean isAutoRenew;

    @NameInMap("pricingCycle")
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

        /**
         * autoRenewDuration.
         */
        public Builder autoRenewDuration(Long autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
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
         * isAutoRenew.
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * pricingCycle.
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
