// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModuleFlightItemListBestPriceItemFlightRuleInfosValue} extends {@link TeaModel}
 *
 * <p>ModuleFlightItemListBestPriceItemFlightRuleInfosValue</p>
 */
public class ModuleFlightItemListBestPriceItemFlightRuleInfosValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("refund_change_rule_desc")
    private String refundChangeRuleDesc;

    @com.aliyun.core.annotation.NameInMap("baggage_desc")
    private String baggageDesc;

    private ModuleFlightItemListBestPriceItemFlightRuleInfosValue(Builder builder) {
        this.refundChangeRuleDesc = builder.refundChangeRuleDesc;
        this.baggageDesc = builder.baggageDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleFlightItemListBestPriceItemFlightRuleInfosValue create() {
        return builder().build();
    }

    /**
     * @return refundChangeRuleDesc
     */
    public String getRefundChangeRuleDesc() {
        return this.refundChangeRuleDesc;
    }

    /**
     * @return baggageDesc
     */
    public String getBaggageDesc() {
        return this.baggageDesc;
    }

    public static final class Builder {
        private String refundChangeRuleDesc; 
        private String baggageDesc; 

        /**
         * refund_change_rule_desc.
         */
        public Builder refundChangeRuleDesc(String refundChangeRuleDesc) {
            this.refundChangeRuleDesc = refundChangeRuleDesc;
            return this;
        }

        /**
         * baggage_desc.
         */
        public Builder baggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }

        public ModuleFlightItemListBestPriceItemFlightRuleInfosValue build() {
            return new ModuleFlightItemListBestPriceItemFlightRuleInfosValue(this);
        } 

    } 

}
