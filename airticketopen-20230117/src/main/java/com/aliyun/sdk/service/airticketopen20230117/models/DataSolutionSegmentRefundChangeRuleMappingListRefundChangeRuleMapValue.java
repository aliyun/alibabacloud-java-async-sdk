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
 * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
 *
 * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
 */
public class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("refund_rule_all_unused_list")
    private java.util.List<RefundRuleAllUnusedList> refundRuleAllUnusedList;

    @com.aliyun.core.annotation.NameInMap("refund_rule_part_unused_list")
    private java.util.List<RefundRulePartUnusedList> refundRulePartUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_in_unused_list")
    private java.util.List<ChangeRuleInUnusedList> changeRuleInUnusedList;

    @com.aliyun.core.annotation.NameInMap("change_rule_out_unused_list")
    private java.util.List<ChangeRuleOutUnusedList> changeRuleOutUnusedList;

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

        /**
         * <p>refund rule for fully-unused tickets</p>
         */
        public Builder refundRuleAllUnusedList(java.util.List<RefundRuleAllUnusedList> refundRuleAllUnusedList) {
            this.refundRuleAllUnusedList = refundRuleAllUnusedList;
            return this;
        }

        /**
         * <p>refund rule for partially-used tickets</p>
         */
        public Builder refundRulePartUnusedList(java.util.List<RefundRulePartUnusedList> refundRulePartUnusedList) {
            this.refundRulePartUnusedList = refundRulePartUnusedList;
            return this;
        }

        /**
         * <p>change rule for inbound segment unused tickets</p>
         */
        public Builder changeRuleInUnusedList(java.util.List<ChangeRuleInUnusedList> changeRuleInUnusedList) {
            this.changeRuleInUnusedList = changeRuleInUnusedList;
            return this;
        }

        /**
         * <p>change rule for outbound-flight-unused tickets</p>
         */
        public Builder changeRuleOutUnusedList(java.util.List<ChangeRuleOutUnusedList> changeRuleOutUnusedList) {
            this.changeRuleOutUnusedList = changeRuleOutUnusedList;
            return this;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build() {
            return new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue(this);
        } 

    } 

    /**
     * 
     * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
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

            /**
             * <p>type: 0 - fully-unused ticket; 1 - partially used ticket</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>applicable refund rule start time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>applicable refund rule end time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>whether refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * <p>refund fee X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * <p>whether tax is fully refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * <p>tax amount refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
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

            /**
             * <p>type: 0 - fully-unused ticket; 1 - partially used ticket</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>applicable refund rule start time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>applicable refund rule end time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>whether refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * <p>refund fee X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * <p>whether tax is fully refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canReturnAllTax(Boolean canReturnAllTax) {
                this.canReturnAllTax = canReturnAllTax;
                return this;
            }

            /**
             * <p>tax amount refundable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
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

            /**
             * <p>type: 2 - outbound segment unused; 3 - inbound segment unused</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>applicable change rule start time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>applicable change rule end time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>whether changeable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * <p>change fee X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue} extends {@link TeaModel}
     *
     * <p>DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue</p>
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

            /**
             * <p>type: 2 - outbound segment unused; 3 - inbound segment unused</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>time unit: day/hour</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>applicable change rule start time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ruleStartTime(Integer ruleStartTime) {
                this.ruleStartTime = ruleStartTime;
                return this;
            }

            /**
             * <p>applicable change rule end time, time unit (day/hour)</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleEndTime(Integer ruleEndTime) {
                this.ruleEndTime = ruleEndTime;
                return this;
            }

            /**
             * <p>whether changeable X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canChange(Boolean canChange) {
                this.canChange = canChange;
                return this;
            }

            /**
             * <p>change fee X-Y hour(day) before departure</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
