// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckFixDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckFixDetailsResponseBody</p>
 */
public class DescribeCheckFixDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckFixDetails")
    private java.util.List < CheckFixDetails> checkFixDetails;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCheckFixDetailsResponseBody(Builder builder) {
        this.checkFixDetails = builder.checkFixDetails;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckFixDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkFixDetails
     */
    public java.util.List < CheckFixDetails> getCheckFixDetails() {
        return this.checkFixDetails;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckFixDetails> checkFixDetails; 
        private Integer count; 
        private String requestId; 

        /**
         * An array that consists of the parameters.
         */
        public Builder checkFixDetails(java.util.List < CheckFixDetails> checkFixDetails) {
            this.checkFixDetails = checkFixDetails;
            return this;
        }

        /**
         * The number of risk items that can be fixed.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCheckFixDetailsResponseBody build() {
            return new DescribeCheckFixDetailsResponseBody(this);
        } 

    } 

    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnumValue")
        private String enumValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Integer maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private Integer minValue;

        @com.aliyun.core.annotation.NameInMap("ParamDefaultValue")
        private String paramDefaultValue;

        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private Integer paramType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.enumValue = builder.enumValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.paramDefaultValue = builder.paramDefaultValue;
            this.paramDesc = builder.paramDesc;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.ruleId = builder.ruleId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        /**
         * @return maxValue
         */
        public Integer getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Integer getMinValue() {
            return this.minValue;
        }

        /**
         * @return paramDefaultValue
         */
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public Integer getParamType() {
            return this.paramType;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String enumValue; 
            private Integer maxValue; 
            private Integer minValue; 
            private String paramDefaultValue; 
            private String paramDesc; 
            private String paramName; 
            private Integer paramType; 
            private String ruleId; 
            private String value; 

            /**
             * The options that can be selected for the rule parameter if the value of the ParamType parameter is 2.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * The maximum value of the rule parameter.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The minimum value of the rule parameter.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The default value of the rule parameter.
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * The description of the rule parameter.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * The name of the rule parameter.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * The type of the rule parameter. Valid values:
             * <p>
             * 
             * *   **1**: input
             * *   **2**: selection
             */
            public Builder paramType(Integer paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The specified value of the rule parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private Integer defaultValue;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private Integer optional;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        @com.aliyun.core.annotation.NameInMap("VarName")
        private String varName;

        private Rules(Builder builder) {
            this.checkId = builder.checkId;
            this.defaultValue = builder.defaultValue;
            this.optional = builder.optional;
            this.paramList = builder.paramList;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.value = builder.value;
            this.varName = builder.varName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return defaultValue
         */
        public Integer getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return optional
         */
        public Integer getOptional() {
            return this.optional;
        }

        /**
         * @return paramList
         */
        public java.util.List < ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        /**
         * @return varName
         */
        public String getVarName() {
            return this.varName;
        }

        public static final class Builder {
            private Long checkId; 
            private Integer defaultValue; 
            private Integer optional; 
            private java.util.List < ParamList> paramList; 
            private String ruleDesc; 
            private String ruleId; 
            private Integer value; 
            private String varName; 

            /**
             * The ID of the risk item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The default value of the rule.
             */
            public Builder defaultValue(Integer defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Indicates whether the rule is optional. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder optional(Integer optional) {
                this.optional = optional;
                return this;
            }

            /**
             * An array that consists of the rule parameters.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The specified value of the rule parameter.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            /**
             * The name of the variable.
             */
            public Builder varName(String varName) {
                this.varName = varName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class CheckFixDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckDesc")
        private String checkDesc;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private CheckFixDetails(Builder builder) {
            this.checkDesc = builder.checkDesc;
            this.checkId = builder.checkId;
            this.checkItem = builder.checkItem;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckFixDetails create() {
            return builder().build();
        }

        /**
         * @return checkDesc
         */
        public String getCheckDesc() {
            return this.checkDesc;
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String checkDesc; 
            private Long checkId; 
            private String checkItem; 
            private java.util.List < Rules> rules; 

            /**
             * The detailed description of the risk item.
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * The ID of the risk item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The description of the risk item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * An array consisting of the rules that are supported by the risk item.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public CheckFixDetails build() {
                return new CheckFixDetails(this);
            } 

        } 

    }
}
