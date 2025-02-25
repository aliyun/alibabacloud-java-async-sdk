// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link DataBaggageAllowanceMapValue} extends {@link TeaModel}
 *
 * <p>DataBaggageAllowanceMapValue</p>
 */
public class DataBaggageAllowanceMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("baggage_amount")
    private Integer baggageAmount;

    @com.aliyun.core.annotation.NameInMap("baggage_weight")
    private Integer baggageWeight;

    @com.aliyun.core.annotation.NameInMap("baggage_weight_unit")
    private String baggageWeightUnit;

    @com.aliyun.core.annotation.NameInMap("is_all_weight")
    private Boolean isAllWeight;

    @com.aliyun.core.annotation.NameInMap("carry_on_amount")
    private Integer carryOnAmount;

    @com.aliyun.core.annotation.NameInMap("carry_on_weight")
    private Integer carryOnWeight;

    @com.aliyun.core.annotation.NameInMap("carry_on_weight_unit")
    private String carryOnWeightUnit;

    @com.aliyun.core.annotation.NameInMap("is_all_carry_on_weight")
    private Boolean isAllCarryOnWeight;

    private DataBaggageAllowanceMapValue(Builder builder) {
        this.baggageAmount = builder.baggageAmount;
        this.baggageWeight = builder.baggageWeight;
        this.baggageWeightUnit = builder.baggageWeightUnit;
        this.isAllWeight = builder.isAllWeight;
        this.carryOnAmount = builder.carryOnAmount;
        this.carryOnWeight = builder.carryOnWeight;
        this.carryOnWeightUnit = builder.carryOnWeightUnit;
        this.isAllCarryOnWeight = builder.isAllCarryOnWeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBaggageAllowanceMapValue create() {
        return builder().build();
    }

    /**
     * @return baggageAmount
     */
    public Integer getBaggageAmount() {
        return this.baggageAmount;
    }

    /**
     * @return baggageWeight
     */
    public Integer getBaggageWeight() {
        return this.baggageWeight;
    }

    /**
     * @return baggageWeightUnit
     */
    public String getBaggageWeightUnit() {
        return this.baggageWeightUnit;
    }

    /**
     * @return isAllWeight
     */
    public Boolean getIsAllWeight() {
        return this.isAllWeight;
    }

    /**
     * @return carryOnAmount
     */
    public Integer getCarryOnAmount() {
        return this.carryOnAmount;
    }

    /**
     * @return carryOnWeight
     */
    public Integer getCarryOnWeight() {
        return this.carryOnWeight;
    }

    /**
     * @return carryOnWeightUnit
     */
    public String getCarryOnWeightUnit() {
        return this.carryOnWeightUnit;
    }

    /**
     * @return isAllCarryOnWeight
     */
    public Boolean getIsAllCarryOnWeight() {
        return this.isAllCarryOnWeight;
    }

    public static final class Builder {
        private Integer baggageAmount; 
        private Integer baggageWeight; 
        private String baggageWeightUnit; 
        private Boolean isAllWeight; 
        private Integer carryOnAmount; 
        private Integer carryOnWeight; 
        private String carryOnWeightUnit; 
        private Boolean isAllCarryOnWeight; 

        /**
         * <p>checked baggage quantity</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder baggageAmount(Integer baggageAmount) {
            this.baggageAmount = baggageAmount;
            return this;
        }

        /**
         * <p>checked baggage weight</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder baggageWeight(Integer baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        /**
         * <p>checked baggage weight unit</p>
         * 
         * <strong>example:</strong>
         * <p>KG</p>
         */
        public Builder baggageWeightUnit(String baggageWeightUnit) {
            this.baggageWeightUnit = baggageWeightUnit;
            return this;
        }

        /**
         * <p>Whether the weight is for all baggages</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAllWeight(Boolean isAllWeight) {
            this.isAllWeight = isAllWeight;
            return this;
        }

        /**
         * <p>carry-on baggage quantity</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder carryOnAmount(Integer carryOnAmount) {
            this.carryOnAmount = carryOnAmount;
            return this;
        }

        /**
         * <p>carry-on baggage weight</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder carryOnWeight(Integer carryOnWeight) {
            this.carryOnWeight = carryOnWeight;
            return this;
        }

        /**
         * <p>carry-on baggage weight unit</p>
         * 
         * <strong>example:</strong>
         * <p>KG</p>
         */
        public Builder carryOnWeightUnit(String carryOnWeightUnit) {
            this.carryOnWeightUnit = carryOnWeightUnit;
            return this;
        }

        /**
         * <p>Whether the weight is for all baggages</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAllCarryOnWeight(Boolean isAllCarryOnWeight) {
            this.isAllCarryOnWeight = isAllCarryOnWeight;
            return this;
        }

        public DataBaggageAllowanceMapValue build() {
            return new DataBaggageAllowanceMapValue(this);
        } 

    } 

}
