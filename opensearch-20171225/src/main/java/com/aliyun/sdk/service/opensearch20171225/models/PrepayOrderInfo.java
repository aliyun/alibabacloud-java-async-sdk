// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrepayOrderInfo} extends {@link TeaModel}
 *
 * <p>PrepayOrderInfo</p>
 */
public class PrepayOrderInfo extends TeaModel {
    @NameInMap("autoRenew")
    private Boolean autoRenew;

    @NameInMap("duration")
    private Integer duration;

    @NameInMap("pricingCycle")
    private String pricingCycle;

    private PrepayOrderInfo(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.duration = builder.duration;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepayOrderInfo create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer duration; 
        private String pricingCycle; 

        /**
         * autoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * pricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        public PrepayOrderInfo build() {
            return new PrepayOrderInfo(this);
        } 

    } 

}
