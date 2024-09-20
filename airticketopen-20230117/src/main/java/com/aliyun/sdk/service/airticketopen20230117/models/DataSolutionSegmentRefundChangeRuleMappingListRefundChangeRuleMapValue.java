// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
 *
 * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
 */
public class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("refund_rule_all_unused_list")
    private java.util.List < RefundRuleAllUnusedList> refundRuleAllUnusedList;

    @com.aliyun.core.annotation.NameInMap("refund_rule_part_unused_list")
    private java.util.List < RefundRulePartUnusedList> refundRulePartUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_in_unused_list")
    private java.util.List < ChangeRuleInUnusedList> changeRuleInUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_out_unused_list")
    private java.util.List < ChangeRuleOutUnusedList> changeRuleOutUnusedList;

    private DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue(Builder builder) {
        this.refundRuleAllUnusedList = builder.refundRuleAllUnusedList;
        this.refundRulePartUnusedList = builder.refundRulePartUnusedList;
        this.changeRuleInUnusedList = builder.changeRuleInUnusedList;
        this.changeRuleOutUnusedList = builder.changeRuleOutUnusedList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue create() {
        return builder().build();
    }

    /**
     * @return refundRuleAllUnusedList
     */
    public java.util.List < RefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    /**
     * @return refundRulePartUnusedList
     */
    public java.util.List < RefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    /**
     * @return changeRuleInUnusedList
     */
    public java.util.List < ChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    /**
     * @return changeRuleOutUnusedList
     */
    public java.util.List < ChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static final class Builder {
        private java.util.List < RefundRuleAllUnusedList> refundRuleAllUnusedList; 
        private java.util.List < RefundRulePartUnusedList> refundRulePartUnusedList; 
        private java.util.List < ChangeRuleInUnusedList> changeRuleInUnusedList; 
        private java.util.List < ChangeRuleOutUnusedList> changeRuleOutUnusedList; 

        /**
         * refund_rule_all_unused_list.
         */
        public Builder refundRuleAllUnusedList(java.util.List < RefundRuleAllUnusedList> refundRuleAllUnusedList) {
            this.refundRuleAllUnusedList = refundRuleAllUnusedList;
            return this;
        }

        /**
         * refund_rule_part_unused_list.
         */
        public Builder refundRulePartUnusedList(java.util.List < RefundRulePartUnusedList> refundRulePartUnusedList) {
            this.refundRulePartUnusedList = refundRulePartUnusedList;
            return this;
        }

        /**
         * change_rule_in_unused_list.
         */
        public Builder changeRuleInUnusedList(java.util.List < ChangeRuleInUnusedList> changeRuleInUnusedList) {
            this.changeRuleInUnusedList = changeRuleInUnusedList;
            return this;
        }

        /**
         * change_rule_out_unused_list.
         */
        public Builder changeRuleOutUnusedList(java.util.List < ChangeRuleOutUnusedList> changeRuleOutUnusedList) {
            this.changeRuleOutUnusedList = changeRuleOutUnusedList;
            return this;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build() {
            return new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue(this);
        } 

    } 

    public static class RefundRuleAllUnusedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("time_unit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("rule_start_time")
        private Integer ruleStartTime;

        @com.aliyun.core.annotation.NameInMap("rule_end_time")
        private Integer ruleEndTime;

        @com.aliyun.core.annotation.NameInMap("can_refund")
        private Boolean canRefund;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Double refundFee;

        @com.aliyun.core.annotation.NameInMap("can_return_all_tax")
        private Boolean canReturnAllTax;

        @com.aliyun.core.annotation.NameInMap("return_part_tax_fee")
        private Double returnPartTaxFee;

        private RefundRuleAllUnusedList(Builder builder) {
            this.type = builder.type;
            this.timeUnit = builder.timeUnit;
            this.ruleStartTime = builder.ruleStartTime;
            this.ruleEndTime = builder.ruleEndTime;
            this.canRefund = builder.canRefund;
            this.refundFee = builder.refundFee;
            this.canReturnAllTax = builder.canReturnAllTax;
            this.returnPartTaxFee = builder.returnPartTaxFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleAllUnusedList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return ruleStartTime
         */
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        /**
         * @return ruleEndTime
         */
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        /**
         * @return canRefund
         */
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        /**
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return canReturnAllTax
         */
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        /**
         * @return returnPartTaxFee
         */
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

        public static final class Builder {
            private Integer type; 
            private String timeUnit; 
            private Integer ruleStartTime; 
            private Integer ruleEndTime; 
            private Boolean canRefund; 
            private Double refundFee; 
            private Boolean canReturnAllTax; 
            private Double returnPartTaxFee; 

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * time_unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * rule_start_time.
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * rule_end_time.
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * can_refund.
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * can_return_all_tax.
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * return_part_tax_fee.
             */
            public Builder returnPartTaxFee(Double returnPartTaxFee) {
                this.returnPartTaxFee = returnPartTaxFee;
                return this;
            }

            public RefundRuleAllUnusedList build() {
                return new RefundRuleAllUnusedList(this);
            } 

        } 

    }
    public static class RefundRulePartUnusedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("time_unit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("rule_start_time")
        private Integer ruleStartTime;

        @com.aliyun.core.annotation.NameInMap("rule_end_time")
        private Integer ruleEndTime;

        @com.aliyun.core.annotation.NameInMap("can_refund")
        private Boolean canRefund;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Double refundFee;

        @com.aliyun.core.annotation.NameInMap("can_return_all_tax")
        private Boolean canReturnAllTax;

        @com.aliyun.core.annotation.NameInMap("return_part_tax_fee")
        private Double returnPartTaxFee;

        private RefundRulePartUnusedList(Builder builder) {
            this.type = builder.type;
            this.timeUnit = builder.timeUnit;
            this.ruleStartTime = builder.ruleStartTime;
            this.ruleEndTime = builder.ruleEndTime;
            this.canRefund = builder.canRefund;
            this.refundFee = builder.refundFee;
            this.canReturnAllTax = builder.canReturnAllTax;
            this.returnPartTaxFee = builder.returnPartTaxFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRulePartUnusedList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return ruleStartTime
         */
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        /**
         * @return ruleEndTime
         */
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        /**
         * @return canRefund
         */
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        /**
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return canReturnAllTax
         */
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        /**
         * @return returnPartTaxFee
         */
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

        public static final class Builder {
            private Integer type; 
            private String timeUnit; 
            private Integer ruleStartTime; 
            private Integer ruleEndTime; 
            private Boolean canRefund; 
            private Double refundFee; 
            private Boolean canReturnAllTax; 
            private Double returnPartTaxFee; 

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * time_unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * rule_start_time.
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * rule_end_time.
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * can_refund.
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * can_return_all_tax.
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * return_part_tax_fee.
             */
            public Builder returnPartTaxFee(Double returnPartTaxFee) {
                this.returnPartTaxFee = returnPartTaxFee;
                return this;
            }

            public RefundRulePartUnusedList build() {
                return new RefundRulePartUnusedList(this);
            } 

        } 

    }
    public static class ChangeRuleInUnusedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("time_unit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("rule_start_time")
        private Integer ruleStartTime;

        @com.aliyun.core.annotation.NameInMap("rule_end_time")
        private Integer ruleEndTime;

        @com.aliyun.core.annotation.NameInMap("can_change")
        private Boolean canChange;

        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Double changeFee;

        private ChangeRuleInUnusedList(Builder builder) {
            this.type = builder.type;
            this.timeUnit = builder.timeUnit;
            this.ruleStartTime = builder.ruleStartTime;
            this.ruleEndTime = builder.ruleEndTime;
            this.canChange = builder.canChange;
            this.changeFee = builder.changeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleInUnusedList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return ruleStartTime
         */
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        /**
         * @return ruleEndTime
         */
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        /**
         * @return canChange
         */
        public Boolean getCanChange() {
            return this.canChange;
        }

        /**
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        public static final class Builder {
            private Integer type; 
            private String timeUnit; 
            private Integer ruleStartTime; 
            private Integer ruleEndTime; 
            private Boolean canChange; 
            private Double changeFee; 

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * time_unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * rule_start_time.
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * rule_end_time.
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * can_change.
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            public ChangeRuleInUnusedList build() {
                return new ChangeRuleInUnusedList(this);
            } 

        } 

    }
    public static class ChangeRuleOutUnusedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("time_unit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("rule_start_time")
        private Integer ruleStartTime;

        @com.aliyun.core.annotation.NameInMap("rule_end_time")
        private Integer ruleEndTime;

        @com.aliyun.core.annotation.NameInMap("can_change")
        private Boolean canChange;

        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Double changeFee;

        private ChangeRuleOutUnusedList(Builder builder) {
            this.type = builder.type;
            this.timeUnit = builder.timeUnit;
            this.ruleStartTime = builder.ruleStartTime;
            this.ruleEndTime = builder.ruleEndTime;
            this.canChange = builder.canChange;
            this.changeFee = builder.changeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleOutUnusedList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return ruleStartTime
         */
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        /**
         * @return ruleEndTime
         */
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        /**
         * @return canChange
         */
        public Boolean getCanChange() {
            return this.canChange;
        }

        /**
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        public static final class Builder {
            private Integer type; 
            private String timeUnit; 
            private Integer ruleStartTime; 
            private Integer ruleEndTime; 
            private Boolean canChange; 
            private Double changeFee; 

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * time_unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * rule_start_time.
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * rule_end_time.
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * can_change.
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            public ChangeRuleOutUnusedList build() {
                return new ChangeRuleOutUnusedList(this);
            } 

        } 

    }
}
