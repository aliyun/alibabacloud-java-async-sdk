// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue</p>
 */
public class ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
    @NameInMap("struct")
    private Boolean struct;

    @NameInMap("cancel_fee_ind")
    private Boolean cancelFeeInd;

    @NameInMap("change_fee_ind")
    private Boolean changeFeeInd;

    @NameInMap("upgrade_fee_ind")
    private Boolean upgradeFeeInd;

    @NameInMap("reissue_ind")
    private Boolean reissueInd;

    @NameInMap("penalty_type_code")
    private Integer penaltyTypeCode;

    @NameInMap("penalty_apply_range_code")
    private Integer penaltyApplyRangeCode;

    @NameInMap("penalty_charge_type_code")
    private Integer penaltyChargeTypeCode;

    @NameInMap("fee")
    private Double fee;

    @NameInMap("currency")
    private String currency;

    @NameInMap("penalty_percent")
    private Double penaltyPercent;

    @NameInMap("start_time")
    private Integer startTime;

    @NameInMap("end_time")
    private Integer endTime;

    @NameInMap("time_unit_code")
    private Integer timeUnitCode;

    private ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue(Builder builder) {
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue create() {
        return builder().build();
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

        public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue build() {
            return new ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue(this);
        } 

    } 

}
