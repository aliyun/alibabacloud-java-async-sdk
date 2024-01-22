// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue} extends {@link TeaModel}
 *
 * <p>DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue</p>
 */
public class DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue extends TeaModel {
    @NameInMap("baggage_amount")
    private Integer baggageAmount;

    @NameInMap("baggage_weight")
    private Integer baggageWeight;

    @NameInMap("baggage_weight_unit")
    private String baggageWeightUnit;

    @NameInMap("is_all_weight")
    private Boolean isAllWeight;

    @NameInMap("carry_on_amount")
    private Integer carryOnAmount;

    @NameInMap("carry_on_weight")
    private Integer carryOnWeight;

    @NameInMap("carry_on_weight_unit")
    private String carryOnWeightUnit;

    @NameInMap("is_all_carry_on_weight")
    private Boolean isAllCarryOnWeight;

    private DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue(Builder builder) {
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

    public static DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue create() {
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
         * baggage_amount.
         */
        public Builder baggageAmount(Integer baggageAmount) {
            this.baggageAmount = baggageAmount;
            return this;
        }

        /**
         * baggage_weight.
         */
        public Builder baggageWeight(Integer baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        /**
         * baggage_weight_unit.
         */
        public Builder baggageWeightUnit(String baggageWeightUnit) {
            this.baggageWeightUnit = baggageWeightUnit;
            return this;
        }

        /**
         * is_all_weight.
         */
        public Builder isAllWeight(Boolean isAllWeight) {
            this.isAllWeight = isAllWeight;
            return this;
        }

        /**
         * carry_on_amount.
         */
        public Builder carryOnAmount(Integer carryOnAmount) {
            this.carryOnAmount = carryOnAmount;
            return this;
        }

        /**
         * carry_on_weight.
         */
        public Builder carryOnWeight(Integer carryOnWeight) {
            this.carryOnWeight = carryOnWeight;
            return this;
        }

        /**
         * carry_on_weight_unit.
         */
        public Builder carryOnWeightUnit(String carryOnWeightUnit) {
            this.carryOnWeightUnit = carryOnWeightUnit;
            return this;
        }

        /**
         * is_all_carry_on_weight.
         */
        public Builder isAllCarryOnWeight(Boolean isAllCarryOnWeight) {
            this.isAllCarryOnWeight = isAllCarryOnWeight;
            return this;
        }

        public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue build() {
            return new DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue(this);
        } 

    } 

}
