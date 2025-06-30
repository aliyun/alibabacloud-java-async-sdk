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
 * {@link ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue</p>
 */
public class ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("struct")
    private Boolean struct;

    @com.aliyun.core.annotation.NameInMap("cancel_fee_ind")
    private Boolean cancelFeeInd;

    @com.aliyun.core.annotation.NameInMap("change_fee_ind")
    private Boolean changeFeeInd;

    @com.aliyun.core.annotation.NameInMap("upgrade_fee_ind")
    private Boolean upgradeFeeInd;

    @com.aliyun.core.annotation.NameInMap("reissue_ind")
    private Boolean reissueInd;

    @com.aliyun.core.annotation.NameInMap("penalty_type_code")
    private Integer penaltyTypeCode;

    @com.aliyun.core.annotation.NameInMap("penalty_apply_range_code")
    private Integer penaltyApplyRangeCode;

    @com.aliyun.core.annotation.NameInMap("penalty_charge_type_code")
    private Integer penaltyChargeTypeCode;

    @com.aliyun.core.annotation.NameInMap("fee")
    private Double fee;

    @com.aliyun.core.annotation.NameInMap("currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("penalty_percent")
    private Double penaltyPercent;

    @com.aliyun.core.annotation.NameInMap("start_time")
    private Integer startTime;

    @com.aliyun.core.annotation.NameInMap("end_time")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("time_unit_code")
    private Integer timeUnitCode;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("dep_time")
    private String depTime;

    @com.aliyun.core.annotation.NameInMap("segment_number")
    private String segmentNumber;

    @com.aliyun.core.annotation.NameInMap("desc_infos")
    private java.util.Map<String, String> descInfos;

    private ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue(Builder builder) {
        this.struct = builder.struct;
        this.cancelFeeInd = builder.cancelFeeInd;
        this.changeFeeInd = builder.changeFeeInd;
        this.upgradeFeeInd = builder.upgradeFeeInd;
        this.reissueInd = builder.reissueInd;
        this.penaltyTypeCode = builder.penaltyTypeCode;
        this.penaltyApplyRangeCode = builder.penaltyApplyRangeCode;
        this.penaltyChargeTypeCode = builder.penaltyChargeTypeCode;
        this.fee = builder.fee;
        this.currency = builder.currency;
        this.penaltyPercent = builder.penaltyPercent;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.timeUnitCode = builder.timeUnitCode;
        this.title = builder.title;
        this.depTime = builder.depTime;
        this.segmentNumber = builder.segmentNumber;
        this.descInfos = builder.descInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return struct
     */
    public Boolean getStruct() {
        return this.struct;
    }

    /**
     * @return cancelFeeInd
     */
    public Boolean getCancelFeeInd() {
        return this.cancelFeeInd;
    }

    /**
     * @return changeFeeInd
     */
    public Boolean getChangeFeeInd() {
        return this.changeFeeInd;
    }

    /**
     * @return upgradeFeeInd
     */
    public Boolean getUpgradeFeeInd() {
        return this.upgradeFeeInd;
    }

    /**
     * @return reissueInd
     */
    public Boolean getReissueInd() {
        return this.reissueInd;
    }

    /**
     * @return penaltyTypeCode
     */
    public Integer getPenaltyTypeCode() {
        return this.penaltyTypeCode;
    }

    /**
     * @return penaltyApplyRangeCode
     */
    public Integer getPenaltyApplyRangeCode() {
        return this.penaltyApplyRangeCode;
    }

    /**
     * @return penaltyChargeTypeCode
     */
    public Integer getPenaltyChargeTypeCode() {
        return this.penaltyChargeTypeCode;
    }

    /**
     * @return fee
     */
    public Double getFee() {
        return this.fee;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return penaltyPercent
     */
    public Double getPenaltyPercent() {
        return this.penaltyPercent;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return timeUnitCode
     */
    public Integer getTimeUnitCode() {
        return this.timeUnitCode;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return depTime
     */
    public String getDepTime() {
        return this.depTime;
    }

    /**
     * @return segmentNumber
     */
    public String getSegmentNumber() {
        return this.segmentNumber;
    }

    /**
     * @return descInfos
     */
    public java.util.Map<String, String> getDescInfos() {
        return this.descInfos;
    }

    public static final class Builder {
        private Boolean struct; 
        private Boolean cancelFeeInd; 
        private Boolean changeFeeInd; 
        private Boolean upgradeFeeInd; 
        private Boolean reissueInd; 
        private Integer penaltyTypeCode; 
        private Integer penaltyApplyRangeCode; 
        private Integer penaltyChargeTypeCode; 
        private Double fee; 
        private String currency; 
        private Double penaltyPercent; 
        private Integer startTime; 
        private Integer endTime; 
        private Integer timeUnitCode; 
        private String title; 
        private String depTime; 
        private String segmentNumber; 
        private java.util.Map<String, String> descInfos; 

        private Builder() {
        } 

        private Builder(ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue model) {
            this.struct = model.struct;
            this.cancelFeeInd = model.cancelFeeInd;
            this.changeFeeInd = model.changeFeeInd;
            this.upgradeFeeInd = model.upgradeFeeInd;
            this.reissueInd = model.reissueInd;
            this.penaltyTypeCode = model.penaltyTypeCode;
            this.penaltyApplyRangeCode = model.penaltyApplyRangeCode;
            this.penaltyChargeTypeCode = model.penaltyChargeTypeCode;
            this.fee = model.fee;
            this.currency = model.currency;
            this.penaltyPercent = model.penaltyPercent;
            this.startTime = model.startTime;
            this.endTime = model.endTime;
            this.timeUnitCode = model.timeUnitCode;
            this.title = model.title;
            this.depTime = model.depTime;
            this.segmentNumber = model.segmentNumber;
            this.descInfos = model.descInfos;
        } 

        /**
         * struct.
         */
        public Builder struct(Boolean struct) {
            this.struct = struct;
            return this;
        }

        /**
         * cancel_fee_ind.
         */
        public Builder cancelFeeInd(Boolean cancelFeeInd) {
            this.cancelFeeInd = cancelFeeInd;
            return this;
        }

        /**
         * change_fee_ind.
         */
        public Builder changeFeeInd(Boolean changeFeeInd) {
            this.changeFeeInd = changeFeeInd;
            return this;
        }

        /**
         * upgrade_fee_ind.
         */
        public Builder upgradeFeeInd(Boolean upgradeFeeInd) {
            this.upgradeFeeInd = upgradeFeeInd;
            return this;
        }

        /**
         * reissue_ind.
         */
        public Builder reissueInd(Boolean reissueInd) {
            this.reissueInd = reissueInd;
            return this;
        }

        /**
         * penalty_type_code.
         */
        public Builder penaltyTypeCode(Integer penaltyTypeCode) {
            this.penaltyTypeCode = penaltyTypeCode;
            return this;
        }

        /**
         * penalty_apply_range_code.
         */
        public Builder penaltyApplyRangeCode(Integer penaltyApplyRangeCode) {
            this.penaltyApplyRangeCode = penaltyApplyRangeCode;
            return this;
        }

        /**
         * penalty_charge_type_code.
         */
        public Builder penaltyChargeTypeCode(Integer penaltyChargeTypeCode) {
            this.penaltyChargeTypeCode = penaltyChargeTypeCode;
            return this;
        }

        /**
         * fee.
         */
        public Builder fee(Double fee) {
            this.fee = fee;
            return this;
        }

        /**
         * currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * penalty_percent.
         */
        public Builder penaltyPercent(Double penaltyPercent) {
            this.penaltyPercent = penaltyPercent;
            return this;
        }

        /**
         * start_time.
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * end_time.
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * time_unit_code.
         */
        public Builder timeUnitCode(Integer timeUnitCode) {
            this.timeUnitCode = timeUnitCode;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * dep_time.
         */
        public Builder depTime(String depTime) {
            this.depTime = depTime;
            return this;
        }

        /**
         * segment_number.
         */
        public Builder segmentNumber(String segmentNumber) {
            this.segmentNumber = segmentNumber;
            return this;
        }

        /**
         * desc_infos.
         */
        public Builder descInfos(java.util.Map<String, String> descInfos) {
            this.descInfos = descInfos;
            return this;
        }

        public ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue build() {
            return new ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue(this);
        } 

    } 

}
