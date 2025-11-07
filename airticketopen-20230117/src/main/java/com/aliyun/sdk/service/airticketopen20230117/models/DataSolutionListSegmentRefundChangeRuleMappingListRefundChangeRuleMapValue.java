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
 * {@link DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
 *
 * <p>DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
 */
public class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("refund_rule_all_unused_list")
    private java.util.List<RefundRuleAllUnusedList> refundRuleAllUnusedList;

    @com.aliyun.core.annotation.NameInMap("refund_rule_part_unused_list")
    private java.util.List<RefundRulePartUnusedList> refundRulePartUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_in_unused_list")
    private java.util.List<ChangeRuleInUnusedList> changeRuleInUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_out_unused_list")
    private java.util.List<ChangeRuleOutUnusedList> changeRuleOutUnusedList;

    private DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue(Builder builder) {
        this.refundRuleAllUnusedList = builder.refundRuleAllUnusedList;
        this.refundRulePartUnusedList = builder.refundRulePartUnusedList;
        this.changeRuleInUnusedList = builder.changeRuleInUnusedList;
        this.changeRuleOutUnusedList = builder.changeRuleOutUnusedList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return refundRuleAllUnusedList
     */
    public java.util.List<RefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    /**
     * @return refundRulePartUnusedList
     */
    public java.util.List<RefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    /**
     * @return changeRuleInUnusedList
     */
    public java.util.List<ChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    /**
     * @return changeRuleOutUnusedList
     */
    public java.util.List<ChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static final class Builder {
        private java.util.List<RefundRuleAllUnusedList> refundRuleAllUnusedList; 
        private java.util.List<RefundRulePartUnusedList> refundRulePartUnusedList; 
        private java.util.List<ChangeRuleInUnusedList> changeRuleInUnusedList; 
        private java.util.List<ChangeRuleOutUnusedList> changeRuleOutUnusedList; 

        private Builder() {
        } 

        private Builder(DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue model) {
            this.refundRuleAllUnusedList = model.refundRuleAllUnusedList;
            this.refundRulePartUnusedList = model.refundRulePartUnusedList;
            this.changeRuleInUnusedList = model.changeRuleInUnusedList;
            this.changeRuleOutUnusedList = model.changeRuleOutUnusedList;
        } 

        /**
         * <p>Full unused ticket refund rules</p>
         */
        public Builder refundRuleAllUnusedList(java.util.List<RefundRuleAllUnusedList> refundRuleAllUnusedList) {
            this.refundRuleAllUnusedList = refundRuleAllUnusedList;
            return this;
        }

        /**
         * <p>Partial unused ticket refund rules</p>
         */
        public Builder refundRulePartUnusedList(java.util.List<RefundRulePartUnusedList> refundRulePartUnusedList) {
            this.refundRulePartUnusedList = refundRulePartUnusedList;
            return this;
        }

        /**
         * <p>Unused return flight change rules</p>
         */
        public Builder changeRuleInUnusedList(java.util.List<ChangeRuleInUnusedList> changeRuleInUnusedList) {
            this.changeRuleInUnusedList = changeRuleInUnusedList;
            return this;
        }

        /**
         * <p>Unused outbound change rules</p>
         */
        public Builder changeRuleOutUnusedList(java.util.List<ChangeRuleOutUnusedList> changeRuleOutUnusedList) {
            this.changeRuleOutUnusedList = changeRuleOutUnusedList;
            return this;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build() {
            return new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue(this);
        } 

    } 

    /**
     * 
     * {@link DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
     */
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

            private Builder() {
            } 

            private Builder(RefundRuleAllUnusedList model) {
                this.type = model.type;
                this.timeUnit = model.timeUnit;
                this.ruleStartTime = model.ruleStartTime;
                this.ruleEndTime = model.ruleEndTime;
                this.canRefund = model.canRefund;
                this.refundFee = model.refundFee;
                this.canReturnAllTax = model.canReturnAllTax;
                this.returnPartTaxFee = model.returnPartTaxFee;
            } 

            /**
             * <p>The type of itinerary this refund rule applies to 0: fully unused; 1: partially unused</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The start time of the refund time interval for this refund rule, in units of (days/hours)</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>The end time of the refund time interval for this refund rule, in units of (days/hours)</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>Whether a refund is allowed X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * <p>Refund fee X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * <p>Whether full tax refund is allowed X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * <p>Partial tax refund amount X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
     */
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

            private Builder() {
            } 

            private Builder(RefundRulePartUnusedList model) {
                this.type = model.type;
                this.timeUnit = model.timeUnit;
                this.ruleStartTime = model.ruleStartTime;
                this.ruleEndTime = model.ruleEndTime;
                this.canRefund = model.canRefund;
                this.refundFee = model.refundFee;
                this.canReturnAllTax = model.canReturnAllTax;
                this.returnPartTaxFee = model.returnPartTaxFee;
            } 

            /**
             * <p>The type of itinerary usage for this refund rule. 0: Entirely unused; 1: Partially unused</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The start time of the refund time interval for this refund rule, in units of days/hours</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>The end time of the refund time interval for this refund rule, in units of days/hours</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>Whether a refund is allowed X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * <p>Refund fee X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * <p>Whether full tax refund is allowed X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * <p>Partial tax refund amount X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
     */
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

            private Builder() {
            } 

            private Builder(ChangeRuleInUnusedList model) {
                this.type = model.type;
                this.timeUnit = model.timeUnit;
                this.ruleStartTime = model.ruleStartTime;
                this.ruleEndTime = model.ruleEndTime;
                this.canChange = model.canChange;
                this.changeFee = model.changeFee;
            } 

            /**
             * <p>Type of itinerary usage for the change rule 2: outbound unused; 3: return unused</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>Start time of the refund time interval, in units of days/hours, to which this refund rule applies</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>End time of the refund time interval, in units of days/hours, to which this refund rule applies</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>Whether it is possible to change the ticket X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * <p>Change fee X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
     */
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

            private Builder() {
            } 

            private Builder(ChangeRuleOutUnusedList model) {
                this.type = model.type;
                this.timeUnit = model.timeUnit;
                this.ruleStartTime = model.ruleStartTime;
                this.ruleEndTime = model.ruleEndTime;
                this.canChange = model.canChange;
                this.changeFee = model.changeFee;
            } 

            /**
             * <p>The type of itinerary usage for this change rule 2: unused outbound; 3: unused return</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>Start time of the refund time interval for this refund rule, in days/hours</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>End time of the refund time interval for this refund rule, in days/hours</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>Whether it is possible to change the ticket X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * <p>Change fee X-Y hours (days) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
