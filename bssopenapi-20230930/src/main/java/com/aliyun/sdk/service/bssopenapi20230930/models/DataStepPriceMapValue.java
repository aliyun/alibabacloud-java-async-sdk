// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DataStepPriceMapValue} extends {@link TeaModel}
 *
 * <p>DataStepPriceMapValue</p>
 */
public class DataStepPriceMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RightClose")
    private Boolean rightClose;

    @com.aliyun.core.annotation.NameInMap("Min")
    private String min;

    @com.aliyun.core.annotation.NameInMap("Max")
    private String max;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("LeftClose")
    private Boolean leftClose;

    @com.aliyun.core.annotation.NameInMap("StepPriceValue")
    private String stepPriceValue;

    @com.aliyun.core.annotation.NameInMap("PriceValueType")
    private String priceValueType;

    @com.aliyun.core.annotation.NameInMap("PriceValue")
    private String priceValue;

    @com.aliyun.core.annotation.NameInMap("DeductCycleType")
    private String deductCycleType;

    private DataStepPriceMapValue(Builder builder) {
        this.rightClose = builder.rightClose;
        this.min = builder.min;
        this.max = builder.max;
        this.currency = builder.currency;
        this.leftClose = builder.leftClose;
        this.stepPriceValue = builder.stepPriceValue;
        this.priceValueType = builder.priceValueType;
        this.priceValue = builder.priceValue;
        this.deductCycleType = builder.deductCycleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataStepPriceMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rightClose
     */
    public Boolean getRightClose() {
        return this.rightClose;
    }

    /**
     * @return min
     */
    public String getMin() {
        return this.min;
    }

    /**
     * @return max
     */
    public String getMax() {
        return this.max;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return leftClose
     */
    public Boolean getLeftClose() {
        return this.leftClose;
    }

    /**
     * @return stepPriceValue
     */
    public String getStepPriceValue() {
        return this.stepPriceValue;
    }

    /**
     * @return priceValueType
     */
    public String getPriceValueType() {
        return this.priceValueType;
    }

    /**
     * @return priceValue
     */
    public String getPriceValue() {
        return this.priceValue;
    }

    /**
     * @return deductCycleType
     */
    public String getDeductCycleType() {
        return this.deductCycleType;
    }

    public static final class Builder {
        private Boolean rightClose; 
        private String min; 
        private String max; 
        private String currency; 
        private Boolean leftClose; 
        private String stepPriceValue; 
        private String priceValueType; 
        private String priceValue; 
        private String deductCycleType; 

        private Builder() {
        } 

        private Builder(DataStepPriceMapValue model) {
            this.rightClose = model.rightClose;
            this.min = model.min;
            this.max = model.max;
            this.currency = model.currency;
            this.leftClose = model.leftClose;
            this.stepPriceValue = model.stepPriceValue;
            this.priceValueType = model.priceValueType;
            this.priceValue = model.priceValue;
            this.deductCycleType = model.deductCycleType;
        } 

        /**
         * RightClose.
         */
        public Builder rightClose(Boolean rightClose) {
            this.rightClose = rightClose;
            return this;
        }

        /**
         * Min.
         */
        public Builder min(String min) {
            this.min = min;
            return this;
        }

        /**
         * Max.
         */
        public Builder max(String max) {
            this.max = max;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * LeftClose.
         */
        public Builder leftClose(Boolean leftClose) {
            this.leftClose = leftClose;
            return this;
        }

        /**
         * StepPriceValue.
         */
        public Builder stepPriceValue(String stepPriceValue) {
            this.stepPriceValue = stepPriceValue;
            return this;
        }

        /**
         * PriceValueType.
         */
        public Builder priceValueType(String priceValueType) {
            this.priceValueType = priceValueType;
            return this;
        }

        /**
         * PriceValue.
         */
        public Builder priceValue(String priceValue) {
            this.priceValue = priceValue;
            return this;
        }

        /**
         * DeductCycleType.
         */
        public Builder deductCycleType(String deductCycleType) {
            this.deductCycleType = deductCycleType;
            return this;
        }

        public DataStepPriceMapValue build() {
            return new DataStepPriceMapValue(this);
        } 

    } 

}
