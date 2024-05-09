// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleFlightItemListItemListFlightRuleInfosValue} extends {@link TeaModel}
 *
 * <p>ModuleFlightItemListItemListFlightRuleInfosValue</p>
 */
public class ModuleFlightItemListItemListFlightRuleInfosValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("refund_change_rule_desc")
    private String refundChangeRuleDesc;

    @com.aliyun.core.annotation.NameInMap("baggage_desc")
    private String baggageDesc;

    private ModuleFlightItemListItemListFlightRuleInfosValue(Builder builder) {
        this.refundChangeRuleDesc = builder.refundChangeRuleDesc;
        this.baggageDesc = builder.baggageDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleFlightItemListItemListFlightRuleInfosValue create() {
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

        public ModuleFlightItemListItemListFlightRuleInfosValue build() {
            return new ModuleFlightItemListItemListFlightRuleInfosValue(this);
        } 

    } 

}
