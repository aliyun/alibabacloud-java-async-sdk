// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskTypeResponseBody</p>
 */
public class DescribeRiskTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskTypes")
    private java.util.List < RiskTypes> riskTypes;

    private DescribeRiskTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskTypes = builder.riskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskTypes
     */
    public java.util.List < RiskTypes> getRiskTypes() {
        return this.riskTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RiskTypes> riskTypes; 

        /**
         * The description of the rule for the baseline.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about baseline types.
         */
        public Builder riskTypes(java.util.List < RiskTypes> riskTypes) {
            this.riskTypes = riskTypes;
            return this;
        }

        public DescribeRiskTypeResponseBody build() {
            return new DescribeRiskTypeResponseBody(this);
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

        private ParamList(Builder builder) {
            this.enumValue = builder.enumValue;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.paramDefaultValue = builder.paramDefaultValue;
            this.paramDesc = builder.paramDesc;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
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

        public static final class Builder {
            private String enumValue; 
            private Integer maxValue; 
            private Integer minValue; 
            private String paramDefaultValue; 
            private String paramDesc; 
            private String paramName; 
            private Integer paramType; 

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
             * The ID of the request, which is used to locate and troubleshoot issues.
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
             * Queries baseline types.
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

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Optional")
        private Integer optional;

        @NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @NameInMap("RuleDesc")
        private String ruleDesc;

        @NameInMap("RuleId")
        private String ruleId;

        private Rules(Builder builder) {
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
            private Integer optional; 
            private java.util.List < ParamList> paramList; 
            private String ruleDesc; 
            private String ruleId; 

            /**
             * The name of the parameter.
             */
            public Builder optional(Integer optional) {
                this.optional = optional;
                return this;
            }

            /**
             * The description of the baseline.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * An array that consists of the information about baseline subtypes.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * The maximum value of the parameter.
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
             * The alias of the baseline subtype.
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * The ID of the baseline.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The name of the baseline subtype.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The minimum value of the parameter.
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

        @NameInMap("TypeName")
        private String typeName;

        private SubTypes(Builder builder) {
            this.alias = builder.alias;
            this.checkDetails = builder.checkDetails;
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
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List < CheckDetails> checkDetails; 
            private String typeName; 

            /**
             * The configuration type of the parameter. Valid values:
             * <p>
             * 
             * *   **1**: input
             * *   **2**: selection
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The language of the content within the request and response. Default value: **zh**. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder checkDetails(java.util.List < CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * An array that consists of the check details about the baseline subtype.
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
    public static class RiskTypes extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("SubTypes")
        private java.util.List < SubTypes> subTypes;

        @NameInMap("TypeName")
        private String typeName;

        private RiskTypes(Builder builder) {
            this.alias = builder.alias;
            this.subTypes = builder.subTypes;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskTypes create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
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
            private java.util.List < SubTypes> subTypes; 
            private String typeName; 

            /**
             * The description of the parameter.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * An array that consists of the rule details about the baseline.
             */
            public Builder subTypes(java.util.List < SubTypes> subTypes) {
                this.subTypes = subTypes;
                return this;
            }

            /**
             * The alias of the baseline type.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public RiskTypes build() {
                return new RiskTypes(this);
            } 

        } 

    }
}
