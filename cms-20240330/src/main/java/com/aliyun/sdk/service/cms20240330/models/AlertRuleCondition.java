// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleCondition} extends {@link TeaModel}
 *
 * <p>AlertRuleCondition</p>
 */
public class AlertRuleCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertCount")
    private Integer alertCount;

    @com.aliyun.core.annotation.NameInMap("caseList")
    private java.util.List < CaseList> caseList;

    @com.aliyun.core.annotation.NameInMap("compareList")
    private java.util.List < CompareList> compareList;

    @com.aliyun.core.annotation.NameInMap("noDataAppendValue")
    private String noDataAppendValue;

    @com.aliyun.core.annotation.NameInMap("nodataAlertLevel")
    private String nodataAlertLevel;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleCondition(Builder builder) {
        this.alertCount = builder.alertCount;
        this.caseList = builder.caseList;
        this.compareList = builder.compareList;
        this.noDataAppendValue = builder.noDataAppendValue;
        this.nodataAlertLevel = builder.nodataAlertLevel;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleCondition create() {
        return builder().build();
    }

    /**
     * @return alertCount
     */
    public Integer getAlertCount() {
        return this.alertCount;
    }

    /**
     * @return caseList
     */
    public java.util.List < CaseList> getCaseList() {
        return this.caseList;
    }

    /**
     * @return compareList
     */
    public java.util.List < CompareList> getCompareList() {
        return this.compareList;
    }

    /**
     * @return noDataAppendValue
     */
    public String getNoDataAppendValue() {
        return this.noDataAppendValue;
    }

    /**
     * @return nodataAlertLevel
     */
    public String getNodataAlertLevel() {
        return this.nodataAlertLevel;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer alertCount; 
        private java.util.List < CaseList> caseList; 
        private java.util.List < CompareList> compareList; 
        private String noDataAppendValue; 
        private String nodataAlertLevel; 
        private String type; 

        /**
         * <p>type=SLS_CONDITION时指定，满足条件几次后告警，默认为1</p>
         */
        public Builder alertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * <p>type=SLS_CONDITION时指定</p>
         */
        public Builder caseList(java.util.List < CaseList> caseList) {
            this.caseList = caseList;
            return this;
        }

        /**
         * compareList.
         */
        public Builder compareList(java.util.List < CompareList> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * noDataAppendValue.
         */
        public Builder noDataAppendValue(String noDataAppendValue) {
            this.noDataAppendValue = noDataAppendValue;
            return this;
        }

        /**
         * <p>无数据时按什么级别告警，不指定则不对无数据报警</p>
         */
        public Builder nodataAlertLevel(String nodataAlertLevel) {
            this.nodataAlertLevel = nodataAlertLevel;
            return this;
        }

        /**
         * <p>规则条件类型，可选值：SLS_CONDITION</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleCondition build() {
            return new AlertRuleCondition(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class CaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("countCondition")
        private String countCondition;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private CaseList(Builder builder) {
            this.condition = builder.condition;
            this.countCondition = builder.countCondition;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseList create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return countCondition
         */
        public String getCountCondition() {
            return this.countCondition;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String countCondition; 
            private String level; 
            private String type; 

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * countCondition.
             */
            public Builder countCondition(String countCondition) {
                this.countCondition = countCondition;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>规则条件类型，可选值：SLS_CONDITION</p>
             * <p>This parameter is required.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CaseList build() {
                return new CaseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class ValueLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("value")
        private Double value;

        private ValueLevelList(Builder builder) {
            this.level = builder.level;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueLevelList create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String level; 
            private Double value; 

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public ValueLevelList build() {
                return new ValueLevelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class CompareList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aggregate")
        private String aggregate;

        @com.aliyun.core.annotation.NameInMap("oper")
        private String oper;

        @com.aliyun.core.annotation.NameInMap("value")
        private Double value;

        @com.aliyun.core.annotation.NameInMap("valueLevelList")
        private java.util.List < ValueLevelList> valueLevelList;

        @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
        private String yoyTimeUnit;

        @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
        private Integer yoyTimeValue;

        private CompareList(Builder builder) {
            this.aggregate = builder.aggregate;
            this.oper = builder.oper;
            this.value = builder.value;
            this.valueLevelList = builder.valueLevelList;
            this.yoyTimeUnit = builder.yoyTimeUnit;
            this.yoyTimeValue = builder.yoyTimeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompareList create() {
            return builder().build();
        }

        /**
         * @return aggregate
         */
        public String getAggregate() {
            return this.aggregate;
        }

        /**
         * @return oper
         */
        public String getOper() {
            return this.oper;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        /**
         * @return valueLevelList
         */
        public java.util.List < ValueLevelList> getValueLevelList() {
            return this.valueLevelList;
        }

        /**
         * @return yoyTimeUnit
         */
        public String getYoyTimeUnit() {
            return this.yoyTimeUnit;
        }

        /**
         * @return yoyTimeValue
         */
        public Integer getYoyTimeValue() {
            return this.yoyTimeValue;
        }

        public static final class Builder {
            private String aggregate; 
            private String oper; 
            private Double value; 
            private java.util.List < ValueLevelList> valueLevelList; 
            private String yoyTimeUnit; 
            private Integer yoyTimeValue; 

            /**
             * aggregate.
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * oper.
             */
            public Builder oper(String oper) {
                this.oper = oper;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * valueLevelList.
             */
            public Builder valueLevelList(java.util.List < ValueLevelList> valueLevelList) {
                this.valueLevelList = valueLevelList;
                return this;
            }

            /**
             * yoyTimeUnit.
             */
            public Builder yoyTimeUnit(String yoyTimeUnit) {
                this.yoyTimeUnit = yoyTimeUnit;
                return this;
            }

            /**
             * yoyTimeValue.
             */
            public Builder yoyTimeValue(Integer yoyTimeValue) {
                this.yoyTimeValue = yoyTimeValue;
                return this;
            }

            public CompareList build() {
                return new CompareList(this);
            } 

        } 

    }
}
