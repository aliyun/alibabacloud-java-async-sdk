// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyDetailResponseBody</p>
 */
public class DescribeStrategyDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategy")
    private Strategy strategy;

    private DescribeStrategyDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategy
     */
    public Strategy getStrategy() {
        return this.strategy;
    }

    public static final class Builder {
        private String requestId; 
        private Strategy strategy; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the baseline check policy.
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public DescribeStrategyDetailResponseBody build() {
            return new DescribeStrategyDetailResponseBody(this);
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
            private String value; 

            /**
             * If the value of paramType is 2, this parameter provides the options that can be selected for paramType.
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
             * *   **2**: select
             */
            public Builder paramType(Integer paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * The configured value of the rule parameter.
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

        private Rules(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.optional = builder.optional;
            this.paramList = builder.paramList;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
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

        public static final class Builder {
            private Integer defaultValue; 
            private Integer optional; 
            private java.util.List < ParamList> paramList; 
            private String ruleDesc; 
            private String ruleId; 

            /**
             * The default value of the rule.
             */
            public Builder defaultValue(Integer defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Indicates whether the rule is included in the policy. Valid values:
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
             * An array that consists of the parameters of the rule.
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

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class CheckDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckDesc")
        private String checkDesc;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private CheckDetails(Builder builder) {
            this.checkDesc = builder.checkDesc;
            this.checkId = builder.checkId;
            this.checkItem = builder.checkItem;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckDetails create() {
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
             * The description of the check item.
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The check item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * An array that consists of rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public CheckDetails build() {
                return new CheckDetails(this);
            } 

        } 

    }
    public static class SubTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CheckDetails")
        private java.util.List < CheckDetails> checkDetails;

        @com.aliyun.core.annotation.NameInMap("On")
        private Boolean on;

        @com.aliyun.core.annotation.NameInMap("SupportedOs")
        private String supportedOs;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private SubTypes(Builder builder) {
            this.alias = builder.alias;
            this.checkDetails = builder.checkDetails;
            this.on = builder.on;
            this.supportedOs = builder.supportedOs;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTypes create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return checkDetails
         */
        public java.util.List < CheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        /**
         * @return on
         */
        public Boolean getOn() {
            return this.on;
        }

        /**
         * @return supportedOs
         */
        public String getSupportedOs() {
            return this.supportedOs;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List < CheckDetails> checkDetails; 
            private Boolean on; 
            private String supportedOs; 
            private String typeName; 

            /**
             * The alias of the check item.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The details about the custom check item.
             */
            public Builder checkDetails(java.util.List < CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * Indicates whether the sub-risk item is selected. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder on(Boolean on) {
                this.on = on;
                return this;
            }

            /**
             * The operating system type of the server. Valid values:
             * <p>
             * *   **windows**
             * *   **linux**
             */
            public Builder supportedOs(String supportedOs) {
                this.supportedOs = supportedOs;
                return this;
            }

            /**
             * The type of the sub-check item.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public SubTypes build() {
                return new SubTypes(this);
            } 

        } 

    }
    public static class RiskTypeWhiteListQueryResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("On")
        private Boolean on;

        @com.aliyun.core.annotation.NameInMap("SubTypes")
        private java.util.List < SubTypes> subTypes;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private RiskTypeWhiteListQueryResultList(Builder builder) {
            this.alias = builder.alias;
            this.on = builder.on;
            this.subTypes = builder.subTypes;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskTypeWhiteListQueryResultList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return on
         */
        public Boolean getOn() {
            return this.on;
        }

        /**
         * @return subTypes
         */
        public java.util.List < SubTypes> getSubTypes() {
            return this.subTypes;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private Boolean on; 
            private java.util.List < SubTypes> subTypes; 
            private String typeName; 

            /**
             * The alias of the check item.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Indicates whether the risk item is selected. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder on(Boolean on) {
                this.on = on;
                return this;
            }

            /**
             * An array that consists of sub-risk items.
             */
            public Builder subTypes(java.util.List < SubTypes> subTypes) {
                this.subTypes = subTypes;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public RiskTypeWhiteListQueryResultList build() {
                return new RiskTypeWhiteListQueryResultList(this);
            } 

        } 

    }
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomType")
        private String customType;

        @com.aliyun.core.annotation.NameInMap("CycleDays")
        private Integer cycleDays;

        @com.aliyun.core.annotation.NameInMap("CycleStartTime")
        private Integer cycleStartTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskSubTypeName")
        private String riskSubTypeName;

        @com.aliyun.core.annotation.NameInMap("RiskTypeWhiteListQueryResultList")
        private java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Strategy(Builder builder) {
            this.customType = builder.customType;
            this.cycleDays = builder.cycleDays;
            this.cycleStartTime = builder.cycleStartTime;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.riskSubTypeName = builder.riskSubTypeName;
            this.riskTypeWhiteListQueryResultList = builder.riskTypeWhiteListQueryResultList;
            this.startTime = builder.startTime;
            this.targetType = builder.targetType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return customType
         */
        public String getCustomType() {
            return this.customType;
        }

        /**
         * @return cycleDays
         */
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        /**
         * @return cycleStartTime
         */
        public Integer getCycleStartTime() {
            return this.cycleStartTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskSubTypeName
         */
        public String getRiskSubTypeName() {
            return this.riskSubTypeName;
        }

        /**
         * @return riskTypeWhiteListQueryResultList
         */
        public java.util.List < RiskTypeWhiteListQueryResultList> getRiskTypeWhiteListQueryResultList() {
            return this.riskTypeWhiteListQueryResultList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String customType; 
            private Integer cycleDays; 
            private Integer cycleStartTime; 
            private String endTime; 
            private Integer id; 
            private String name; 
            private String riskSubTypeName; 
            private java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList; 
            private String startTime; 
            private String targetType; 
            private Integer type; 

            /**
             * The type of the baseline check policy that you want to query. Valid values:
             * <p>
             * 
             * *   **common**: standard baseline check policy
             * *   **custom**: custom baseline check policy
             */
            public Builder customType(String customType) {
                this.customType = customType;
                return this;
            }

            /**
             * The check interval of the policy.
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * The time period during which the check starts. Valid values:
             * <p>
             * 
             * *   **0**: 00:00 to 06:00
             * *   **6**: 06:00 to 12:00
             * *   **12**: 12:00 to 18:00
             * *   **18**: 18:00 to 24:00
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * The end time of the check. Specify the time in the HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the baseline check policy.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the baseline check policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The subtype of the baselines. 
             * <p>
             * 
             * > You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the subtypes of baselines.
             */
            public Builder riskSubTypeName(String riskSubTypeName) {
                this.riskSubTypeName = riskSubTypeName;
                return this;
            }

            /**
             * The whitelist of risk items.
             */
            public Builder riskTypeWhiteListQueryResultList(java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList) {
                this.riskTypeWhiteListQueryResultList = riskTypeWhiteListQueryResultList;
                return this;
            }

            /**
             * The start time of the check. Specify the time in the HH:mm:ss format.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The method that is used to apply the baseline check policy. Valid values:
             * <p>
             * 
             * *   **groupId**: asset groups
             * *   **uuid**: assets
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The type of the baseline check policy. Valid values:
             * <p>
             * 
             * *   **1**: standard policies
             * *   **2**: custom policies
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
}
