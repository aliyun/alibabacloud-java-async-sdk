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
 * {@link DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue} extends {@link TeaModel}
 *
 * <p>DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue</p>
 */
public class DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("carry_length")
    private Integer carryLength;

    @com.aliyun.core.annotation.NameInMap("carry_width")
    private Integer carryWidth;

    @com.aliyun.core.annotation.NameInMap("carry_height")
    private Integer carryHeight;

    @com.aliyun.core.annotation.NameInMap("carry_sum_of_length_width_height")
    private Integer carrySumOfLengthWidthHeight;

    @com.aliyun.core.annotation.NameInMap("length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("sum_of_length_width_height")
    private Integer sumOfLengthWidthHeight;

    private DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue(Builder builder) {
        this.baggageAmount = builder.baggageAmount;
        this.baggageWeight = builder.baggageWeight;
        this.baggageWeightUnit = builder.baggageWeightUnit;
        this.isAllWeight = builder.isAllWeight;
        this.carryOnAmount = builder.carryOnAmount;
        this.carryOnWeight = builder.carryOnWeight;
        this.carryOnWeightUnit = builder.carryOnWeightUnit;
        this.isAllCarryOnWeight = builder.isAllCarryOnWeight;
        this.carryLength = builder.carryLength;
        this.carryWidth = builder.carryWidth;
        this.carryHeight = builder.carryHeight;
        this.carrySumOfLengthWidthHeight = builder.carrySumOfLengthWidthHeight;
        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
        this.sumOfLengthWidthHeight = builder.sumOfLengthWidthHeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return carryLength
     */
    public Integer getCarryLength() {
        return this.carryLength;
    }

    /**
     * @return carryWidth
     */
    public Integer getCarryWidth() {
        return this.carryWidth;
    }

    /**
     * @return carryHeight
     */
    public Integer getCarryHeight() {
        return this.carryHeight;
    }

    /**
     * @return carrySumOfLengthWidthHeight
     */
    public Integer getCarrySumOfLengthWidthHeight() {
        return this.carrySumOfLengthWidthHeight;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return sumOfLengthWidthHeight
     */
    public Integer getSumOfLengthWidthHeight() {
        return this.sumOfLengthWidthHeight;
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
        private Integer carryLength; 
        private Integer carryWidth; 
        private Integer carryHeight; 
        private Integer carrySumOfLengthWidthHeight; 
        private Integer length; 
        private Integer width; 
        private Integer height; 
        private Integer sumOfLengthWidthHeight; 

        private Builder() {
        } 

        private Builder(DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue model) {
            this.baggageAmount = model.baggageAmount;
            this.baggageWeight = model.baggageWeight;
            this.baggageWeightUnit = model.baggageWeightUnit;
            this.isAllWeight = model.isAllWeight;
            this.carryOnAmount = model.carryOnAmount;
            this.carryOnWeight = model.carryOnWeight;
            this.carryOnWeightUnit = model.carryOnWeightUnit;
            this.isAllCarryOnWeight = model.isAllCarryOnWeight;
            this.carryLength = model.carryLength;
            this.carryWidth = model.carryWidth;
            this.carryHeight = model.carryHeight;
            this.carrySumOfLengthWidthHeight = model.carrySumOfLengthWidthHeight;
            this.length = model.length;
            this.width = model.width;
            this.height = model.height;
            this.sumOfLengthWidthHeight = model.sumOfLengthWidthHeight;
        } 

        /**
         * <p>checked baggage quantity</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder baggageAmount(Integer baggageAmount) {
            this.baggageAmount = baggageAmount;
            return this;
        }

        /**
         * <p>checked baggage weight</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder baggageWeight(Integer baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        /**
         * <p>checked baggage weight unit</p>
         * 
         * <strong>example:</strong>
         * <p>kg</p>
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
         * <p>2</p>
         */
        public Builder carryOnWeight(Integer carryOnWeight) {
            this.carryOnWeight = carryOnWeight;
            return this;
        }

        /**
         * <p>carry-on baggage weight unit</p>
         * 
         * <strong>example:</strong>
         * <p>kg</p>
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

        /**
         * carry_length.
         */
        public Builder carryLength(Integer carryLength) {
            this.carryLength = carryLength;
            return this;
        }

        /**
         * carry_width.
         */
        public Builder carryWidth(Integer carryWidth) {
            this.carryWidth = carryWidth;
            return this;
        }

        /**
         * carry_height.
         */
        public Builder carryHeight(Integer carryHeight) {
            this.carryHeight = carryHeight;
            return this;
        }

        /**
         * carry_sum_of_length_width_height.
         */
        public Builder carrySumOfLengthWidthHeight(Integer carrySumOfLengthWidthHeight) {
            this.carrySumOfLengthWidthHeight = carrySumOfLengthWidthHeight;
            return this;
        }

        /**
         * length.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        /**
         * height.
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * sum_of_length_width_height.
         */
        public Builder sumOfLengthWidthHeight(Integer sumOfLengthWidthHeight) {
            this.sumOfLengthWidthHeight = sumOfLengthWidthHeight;
            return this;
        }

        public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue build() {
            return new DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue(this);
        } 

    } 

}
