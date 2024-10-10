// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskTypeResponseBody</p>
 */
public class DescribeRiskTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskTypes")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F22037B5-FCE4-5178-A9E7-71798E1F9270</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information about baseline types.</p>
         */
        public Builder riskTypes(java.util.List < RiskTypes> riskTypes) {
            this.riskTypes = riskTypes;
            return this;
        }

        public DescribeRiskTypeResponseBody build() {
            return new DescribeRiskTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskTypeResponseBody</p>
     */
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
             * <p>If the value of paramType is 1, this parameter is empty. If the value of paramType is 2, this parameter provides the options that can be selected for paramType.</p>
             * 
             * <strong>example:</strong>
             * <p>0,1,2,3</p>
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * <p>The maximum value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>999</p>
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The setting value is 0 means no definition, 1 means success, 2 means failure, 3 means success and failure</p>
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>range_val</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The configuration type of the parameter. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: input</li>
             * <li><strong>2</strong>: selection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskTypeResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Optional")
        private Integer optional;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleId")
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
             * <p>Indicates whether the baseline can be edited. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder optional(Integer optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>An array that consists of the parameters in the rule for the baseline.</p>
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The description of the rule for the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Please customize the password expiration time detection standard as</p>
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The ID of the rule for the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>audit.audit_policy.auditpolicychange.cus</p>
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
    /**
     * 
     * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskTypeResponseBody</p>
     */
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
             * <p>The description of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Set password expiration time, force regular modification of password, reduce password leakage and guess risk.Use non-password login (e.g. key pair) please ignore this item.</p>
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * <p>The ID of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>1299</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Ensure password expiration period is set.</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>An array that consists of the rule details about the baseline.</p>
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
    /**
     * 
     * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskTypeResponseBody</p>
     */
    public static class SubTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AuthFlag")
        private Boolean authFlag;

        @com.aliyun.core.annotation.NameInMap("CheckDetails")
        private java.util.List < CheckDetails> checkDetails;

        @com.aliyun.core.annotation.NameInMap("SupportedOs")
        private String supportedOs;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private SubTypes(Builder builder) {
            this.alias = builder.alias;
            this.authFlag = builder.authFlag;
            this.checkDetails = builder.checkDetails;
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
         * @return authFlag
         */
        public Boolean getAuthFlag() {
            return this.authFlag;
        }

        /**
         * @return checkDetails
         */
        public java.util.List < CheckDetails> getCheckDetails() {
            return this.checkDetails;
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
            private Boolean authFlag; 
            private java.util.List < CheckDetails> checkDetails; 
            private String supportedOs; 
            private String typeName; 

            /**
             * <p>The alias of the baseline subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis unauthorized access high exploit vulnerability risk</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The baseline subtype permission flag of the current user version. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Have access</li>
             * <li><strong>false</strong>: No permissions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authFlag(Boolean authFlag) {
                this.authFlag = authFlag;
                return this;
            }

            /**
             * <p>An array that consists of the check details about the baseline subtype.</p>
             */
            public Builder checkDetails(java.util.List < CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * <p>The operating system type of the server. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong></li>
             * <li><strong>linux</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder supportedOs(String supportedOs) {
                this.supportedOs = supportedOs;
                return this;
            }

            /**
             * <p>The name of the baseline subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>hc_exploit_redis</p>
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
    /**
     * 
     * {@link DescribeRiskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskTypeResponseBody</p>
     */
    public static class RiskTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AuthFlag")
        private Boolean authFlag;

        @com.aliyun.core.annotation.NameInMap("SubTypes")
        private java.util.List < SubTypes> subTypes;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private RiskTypes(Builder builder) {
            this.alias = builder.alias;
            this.authFlag = builder.authFlag;
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
         * @return authFlag
         */
        public Boolean getAuthFlag() {
            return this.authFlag;
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
            private Boolean authFlag; 
            private java.util.List < SubTypes> subTypes; 
            private String typeName; 

            /**
             * <p>The alias of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis unauthorized access high exploit vulnerability risk</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The baseline type flag of the current user version. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Have access</li>
             * <li><strong>false</strong>: No permissions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authFlag(Boolean authFlag) {
                this.authFlag = authFlag;
                return this;
            }

            /**
             * <p>An array that consists of the information about baseline subtypes.</p>
             */
            public Builder subTypes(java.util.List < SubTypes> subTypes) {
                this.subTypes = subTypes;
                return this;
            }

            /**
             * <p>The name of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>hc_exploit</p>
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
