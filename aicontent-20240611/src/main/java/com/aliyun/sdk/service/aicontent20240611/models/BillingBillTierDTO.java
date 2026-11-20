// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BillingBillTierDTO} extends {@link TeaModel}
 *
 * <p>BillingBillTierDTO</p>
 */
public class BillingBillTierDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dimValues")
    private String dimValues;

    @com.aliyun.core.annotation.NameInMap("payableAmount")
    private Float payableAmount;

    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private BillingBillTierDTO(Builder builder) {
        this.dimValues = builder.dimValues;
        this.payableAmount = builder.payableAmount;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingBillTierDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimValues
     */
    public String getDimValues() {
        return this.dimValues;
    }

    /**
     * @return payableAmount
     */
    public Float getPayableAmount() {
        return this.payableAmount;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder {
        private String dimValues; 
        private Float payableAmount; 
        private String values; 

        private Builder() {
        } 

        private Builder(BillingBillTierDTO model) {
            this.dimValues = model.dimValues;
            this.payableAmount = model.payableAmount;
            this.values = model.values;
        } 

        /**
         * <p>The dimension key-value mapping, where the key is the dimension column name and the value is the display value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;context_tier&quot;: &quot;0-32k&quot;}</p>
         */
        public Builder dimValues(String dimValues) {
            this.dimValues = dimValues;
            return this;
        }

        /**
         * <p>The cost of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        public Builder payableAmount(Float payableAmount) {
            this.payableAmount = payableAmount;
            return this;
        }

        /**
         * <p>The usage value mapping, where the key is the metric name and the value is the numerical value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input_tokens&quot;: 1000, &quot;output_tokens&quot;: 500}</p>
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        public BillingBillTierDTO build() {
            return new BillingBillTierDTO(this);
        } 

    } 

}
