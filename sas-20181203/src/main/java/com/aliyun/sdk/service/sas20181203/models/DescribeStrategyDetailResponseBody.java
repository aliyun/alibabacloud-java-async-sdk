// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyDetailResponseBody</p>
 */
public class DescribeStrategyDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Strategy")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Strategy.
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
        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("MaxValue")
        private Integer maxValue;

        @NameInMap("MinValue")
        private Integer minValue;

        @NameInMap("ParamDefaultValue")
        private String paramDefaultValue;

        @NameInMap("ParamDesc")
        private String paramDesc;

        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamType")
        private Integer paramType;

        @NameInMap("Value")
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
             * EnumValue.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ParamDefaultValue.
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * ParamDesc.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(Integer paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("DefaultValue")
        private Integer defaultValue;

        @NameInMap("Optional")
        private Integer optional;

        @NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @NameInMap("RuleDesc")
        private String ruleDesc;

        @NameInMap("RuleId")
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
             * DefaultValue.
             */
            public Builder defaultValue(Integer defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(Integer optional) {
                this.optional = optional;
                return this;
            }

            /**
             * ParamList.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * RuleDesc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * RuleId.
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
        @NameInMap("CheckDesc")
        private String checkDesc;

        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("Rules")
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
             * CheckDesc.
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * CheckId.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * Rules.
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("CheckDetails")
        private java.util.List < CheckDetails> checkDetails;

        @NameInMap("On")
        private Boolean on;

        @NameInMap("TypeName")
        private String typeName;

        private SubTypes(Builder builder) {
            this.alias = builder.alias;
            this.checkDetails = builder.checkDetails;
            this.on = builder.on;
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
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List < CheckDetails> checkDetails; 
            private Boolean on; 
            private String typeName; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * CheckDetails.
             */
            public Builder checkDetails(java.util.List < CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * On.
             */
            public Builder on(Boolean on) {
                this.on = on;
                return this;
            }

            /**
             * TypeName.
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("On")
        private Boolean on;

        @NameInMap("SubTypes")
        private java.util.List < SubTypes> subTypes;

        @NameInMap("TypeName")
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
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * On.
             */
            public Builder on(Boolean on) {
                this.on = on;
                return this;
            }

            /**
             * SubTypes.
             */
            public Builder subTypes(java.util.List < SubTypes> subTypes) {
                this.subTypes = subTypes;
                return this;
            }

            /**
             * TypeName.
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
        @NameInMap("CycleDays")
        private Integer cycleDays;

        @NameInMap("CycleStartTime")
        private Integer cycleStartTime;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RiskTypeWhiteListQueryResultList")
        private java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        @NameInMap("Type")
        private Integer type;

        private Strategy(Builder builder) {
            this.cycleDays = builder.cycleDays;
            this.cycleStartTime = builder.cycleStartTime;
            this.id = builder.id;
            this.name = builder.name;
            this.riskTypeWhiteListQueryResultList = builder.riskTypeWhiteListQueryResultList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
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
         * @return riskTypeWhiteListQueryResultList
         */
        public java.util.List < RiskTypeWhiteListQueryResultList> getRiskTypeWhiteListQueryResultList() {
            return this.riskTypeWhiteListQueryResultList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cycleDays; 
            private Integer cycleStartTime; 
            private Integer id; 
            private String name; 
            private java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList; 
            private Integer type; 

            /**
             * CycleDays.
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * CycleStartTime.
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RiskTypeWhiteListQueryResultList.
             */
            public Builder riskTypeWhiteListQueryResultList(java.util.List < RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList) {
                this.riskTypeWhiteListQueryResultList = riskTypeWhiteListQueryResultList;
                return this;
            }

            /**
             * Type.
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
