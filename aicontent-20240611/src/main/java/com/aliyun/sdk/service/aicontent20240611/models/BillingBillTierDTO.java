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
         * dimValues.
         */
        public Builder dimValues(String dimValues) {
            this.dimValues = dimValues;
            return this;
        }

        /**
         * payableAmount.
         */
        public Builder payableAmount(Float payableAmount) {
            this.payableAmount = payableAmount;
            return this;
        }

        /**
         * values.
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
