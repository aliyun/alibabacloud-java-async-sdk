// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue</p>
 */
public class ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("start_city_code")
    private String startCityCode;

    @com.aliyun.core.annotation.NameInMap("end_city_code")
    private String endCityCode;

    @com.aliyun.core.annotation.NameInMap("carry_free_pc")
    private Integer carryFreePc;

    @com.aliyun.core.annotation.NameInMap("carry_bag_weight")
    private Integer carryBagWeight;

    @com.aliyun.core.annotation.NameInMap("carry_bag_size")
    private String carryBagSize;

    @com.aliyun.core.annotation.NameInMap("is_all_carry_bag_weight")
    private Boolean isAllCarryBagWeight;

    @com.aliyun.core.annotation.NameInMap("total_pcs")
    private Long totalPcs;

    @com.aliyun.core.annotation.NameInMap("total_weight")
    private Long totalWeight;

    @com.aliyun.core.annotation.NameInMap("carry_unknown")
    private Boolean carryUnknown;

    @com.aliyun.core.annotation.NameInMap("carry_length")
    private Integer carryLength;

    @com.aliyun.core.annotation.NameInMap("carry_width")
    private Integer carryWidth;

    @com.aliyun.core.annotation.NameInMap("carry_height")
    private Integer carryHeight;

    @com.aliyun.core.annotation.NameInMap("carry_sum_of_length_width_height")
    private Integer carrySumOfLengthWidthHeight;

    @com.aliyun.core.annotation.NameInMap("free_pcs")
    private Long freePcs;

    @com.aliyun.core.annotation.NameInMap("baggage_weight")
    private Long baggageWeight;

    @com.aliyun.core.annotation.NameInMap("baggage_unit")
    private String baggageUnit;

    @com.aliyun.core.annotation.NameInMap("baggage_size")
    private String baggageSize;

    @com.aliyun.core.annotation.NameInMap("all_weight")
    private Boolean allWeight;

    @com.aliyun.core.annotation.NameInMap("length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("sum_of_length_width_height")
    private Integer sumOfLengthWidthHeight;

    @com.aliyun.core.annotation.NameInMap("unknown")
    private Boolean unknown;

    @com.aliyun.core.annotation.NameInMap("cn_desc")
    private String cnDesc;

    @com.aliyun.core.annotation.NameInMap("en_desc")
    private String enDesc;

    @com.aliyun.core.annotation.NameInMap("attribute")
    private String attribute;

    @com.aliyun.core.annotation.NameInMap("baggage_price")
    private Integer baggagePrice;

    @com.aliyun.core.annotation.NameInMap("carry_on_baggage_tips")
    private String carryOnBaggageTips;

    private ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue(Builder builder) {
        this.startCityCode = builder.startCityCode;
        this.endCityCode = builder.endCityCode;
        this.carryFreePc = builder.carryFreePc;
        this.carryBagWeight = builder.carryBagWeight;
        this.carryBagSize = builder.carryBagSize;
        this.isAllCarryBagWeight = builder.isAllCarryBagWeight;
        this.totalPcs = builder.totalPcs;
        this.totalWeight = builder.totalWeight;
        this.carryUnknown = builder.carryUnknown;
        this.carryLength = builder.carryLength;
        this.carryWidth = builder.carryWidth;
        this.carryHeight = builder.carryHeight;
        this.carrySumOfLengthWidthHeight = builder.carrySumOfLengthWidthHeight;
        this.freePcs = builder.freePcs;
        this.baggageWeight = builder.baggageWeight;
        this.baggageUnit = builder.baggageUnit;
        this.baggageSize = builder.baggageSize;
        this.allWeight = builder.allWeight;
        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
        this.sumOfLengthWidthHeight = builder.sumOfLengthWidthHeight;
        this.unknown = builder.unknown;
        this.cnDesc = builder.cnDesc;
        this.enDesc = builder.enDesc;
        this.attribute = builder.attribute;
        this.baggagePrice = builder.baggagePrice;
        this.carryOnBaggageTips = builder.carryOnBaggageTips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return startCityCode
     */
    public String getStartCityCode() {
        return this.startCityCode;
    }

    /**
     * @return endCityCode
     */
    public String getEndCityCode() {
        return this.endCityCode;
    }

    /**
     * @return carryFreePc
     */
    public Integer getCarryFreePc() {
        return this.carryFreePc;
    }

    /**
     * @return carryBagWeight
     */
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    /**
     * @return carryBagSize
     */
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    /**
     * @return isAllCarryBagWeight
     */
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    /**
     * @return totalPcs
     */
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    /**
     * @return totalWeight
     */
    public Long getTotalWeight() {
        return this.totalWeight;
    }

    /**
     * @return carryUnknown
     */
    public Boolean getCarryUnknown() {
        return this.carryUnknown;
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
     * @return freePcs
     */
    public Long getFreePcs() {
        return this.freePcs;
    }

    /**
     * @return baggageWeight
     */
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    /**
     * @return baggageUnit
     */
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    /**
     * @return baggageSize
     */
    public String getBaggageSize() {
        return this.baggageSize;
    }

    /**
     * @return allWeight
     */
    public Boolean getAllWeight() {
        return this.allWeight;
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

    /**
     * @return unknown
     */
    public Boolean getUnknown() {
        return this.unknown;
    }

    /**
     * @return cnDesc
     */
    public String getCnDesc() {
        return this.cnDesc;
    }

    /**
     * @return enDesc
     */
    public String getEnDesc() {
        return this.enDesc;
    }

    /**
     * @return attribute
     */
    public String getAttribute() {
        return this.attribute;
    }

    /**
     * @return baggagePrice
     */
    public Integer getBaggagePrice() {
        return this.baggagePrice;
    }

    /**
     * @return carryOnBaggageTips
     */
    public String getCarryOnBaggageTips() {
        return this.carryOnBaggageTips;
    }

    public static final class Builder {
        private String startCityCode; 
        private String endCityCode; 
        private Integer carryFreePc; 
        private Integer carryBagWeight; 
        private String carryBagSize; 
        private Boolean isAllCarryBagWeight; 
        private Long totalPcs; 
        private Long totalWeight; 
        private Boolean carryUnknown; 
        private Integer carryLength; 
        private Integer carryWidth; 
        private Integer carryHeight; 
        private Integer carrySumOfLengthWidthHeight; 
        private Long freePcs; 
        private Long baggageWeight; 
        private String baggageUnit; 
        private String baggageSize; 
        private Boolean allWeight; 
        private Integer length; 
        private Integer width; 
        private Integer height; 
        private Integer sumOfLengthWidthHeight; 
        private Boolean unknown; 
        private String cnDesc; 
        private String enDesc; 
        private String attribute; 
        private Integer baggagePrice; 
        private String carryOnBaggageTips; 

        private Builder() {
        } 

        private Builder(ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue model) {
            this.startCityCode = model.startCityCode;
            this.endCityCode = model.endCityCode;
            this.carryFreePc = model.carryFreePc;
            this.carryBagWeight = model.carryBagWeight;
            this.carryBagSize = model.carryBagSize;
            this.isAllCarryBagWeight = model.isAllCarryBagWeight;
            this.totalPcs = model.totalPcs;
            this.totalWeight = model.totalWeight;
            this.carryUnknown = model.carryUnknown;
            this.carryLength = model.carryLength;
            this.carryWidth = model.carryWidth;
            this.carryHeight = model.carryHeight;
            this.carrySumOfLengthWidthHeight = model.carrySumOfLengthWidthHeight;
            this.freePcs = model.freePcs;
            this.baggageWeight = model.baggageWeight;
            this.baggageUnit = model.baggageUnit;
            this.baggageSize = model.baggageSize;
            this.allWeight = model.allWeight;
            this.length = model.length;
            this.width = model.width;
            this.height = model.height;
            this.sumOfLengthWidthHeight = model.sumOfLengthWidthHeight;
            this.unknown = model.unknown;
            this.cnDesc = model.cnDesc;
            this.enDesc = model.enDesc;
            this.attribute = model.attribute;
            this.baggagePrice = model.baggagePrice;
            this.carryOnBaggageTips = model.carryOnBaggageTips;
        } 

        /**
         * start_city_code.
         */
        public Builder startCityCode(String startCityCode) {
            this.startCityCode = startCityCode;
            return this;
        }

        /**
         * end_city_code.
         */
        public Builder endCityCode(String endCityCode) {
            this.endCityCode = endCityCode;
            return this;
        }

        /**
         * carry_free_pc.
         */
        public Builder carryFreePc(Integer carryFreePc) {
            this.carryFreePc = carryFreePc;
            return this;
        }

        /**
         * carry_bag_weight.
         */
        public Builder carryBagWeight(Integer carryBagWeight) {
            this.carryBagWeight = carryBagWeight;
            return this;
        }

        /**
         * carry_bag_size.
         */
        public Builder carryBagSize(String carryBagSize) {
            this.carryBagSize = carryBagSize;
            return this;
        }

        /**
         * is_all_carry_bag_weight.
         */
        public Builder isAllCarryBagWeight(Boolean isAllCarryBagWeight) {
            this.isAllCarryBagWeight = isAllCarryBagWeight;
            return this;
        }

        /**
         * total_pcs.
         */
        public Builder totalPcs(Long totalPcs) {
            this.totalPcs = totalPcs;
            return this;
        }

        /**
         * total_weight.
         */
        public Builder totalWeight(Long totalWeight) {
            this.totalWeight = totalWeight;
            return this;
        }

        /**
         * carry_unknown.
         */
        public Builder carryUnknown(Boolean carryUnknown) {
            this.carryUnknown = carryUnknown;
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
         * free_pcs.
         */
        public Builder freePcs(Long freePcs) {
            this.freePcs = freePcs;
            return this;
        }

        /**
         * baggage_weight.
         */
        public Builder baggageWeight(Long baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        /**
         * baggage_unit.
         */
        public Builder baggageUnit(String baggageUnit) {
            this.baggageUnit = baggageUnit;
            return this;
        }

        /**
         * baggage_size.
         */
        public Builder baggageSize(String baggageSize) {
            this.baggageSize = baggageSize;
            return this;
        }

        /**
         * all_weight.
         */
        public Builder allWeight(Boolean allWeight) {
            this.allWeight = allWeight;
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

        /**
         * unknown.
         */
        public Builder unknown(Boolean unknown) {
            this.unknown = unknown;
            return this;
        }

        /**
         * cn_desc.
         */
        public Builder cnDesc(String cnDesc) {
            this.cnDesc = cnDesc;
            return this;
        }

        /**
         * en_desc.
         */
        public Builder enDesc(String enDesc) {
            this.enDesc = enDesc;
            return this;
        }

        /**
         * attribute.
         */
        public Builder attribute(String attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * baggage_price.
         */
        public Builder baggagePrice(Integer baggagePrice) {
            this.baggagePrice = baggagePrice;
            return this;
        }

        /**
         * carry_on_baggage_tips.
         */
        public Builder carryOnBaggageTips(String carryOnBaggageTips) {
            this.carryOnBaggageTips = carryOnBaggageTips;
            return this;
        }

        public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue build() {
            return new ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue(this);
        } 

    } 

}
