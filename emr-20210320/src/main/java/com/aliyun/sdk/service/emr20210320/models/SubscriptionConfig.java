// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link SubscriptionConfig} extends {@link TeaModel}
 *
 * <p>SubscriptionConfig</p>
 */
public class SubscriptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentDurationUnit;

    private SubscriptionConfig(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionConfig create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 

        /**
         * <p>自动续费。取值范围：</p>
         * <ul>
         * <li>true：开启启动续费。</li>
         * <li>false：不开启自动续费。
         * 默认值：false。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>自动续费时长。当AutoRenew取值为true时生效。当AutoRenewDurationUnit取值为Month时，取值：1、2、3、4、5、6、7、8、9、12、24、36、48、60。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <ul>
         * <li>Month：月。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }

        /**
         * <p>付费时长。PaymentDurationUnit取值为Month时，取值：1、2、3、4、5、6、7、8、9、12、24、36、48、60。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * <p>付费时长单位。取值范围：</p>
         * <ul>
         * <li>Month：月。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        public SubscriptionConfig build() {
            return new SubscriptionConfig(this);
        } 

    } 

}
