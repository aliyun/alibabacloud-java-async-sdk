// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C5B28F65-9245-5DC1-B3CF-5F2756A756A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the baseline check policy.</p>
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public DescribeStrategyDetailResponseBody build() {
            return new DescribeStrategyDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
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
             * <p>The options that can be selected for the rule parameter if the value of ParamType is set to 2.</p>
             * 
             * <strong>example:</strong>
             * <p>0,1,2,3</p>
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * <p>The maximum value of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>999</p>
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum value of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The default value of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder paramDefaultValue(String paramDefaultValue) {
                this.paramDefaultValue = paramDefaultValue;
                return this;
            }

            /**
             * <p>The description of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The setting value is 0 means no definition, 1 means success, 2 means failure, 3 means success and failure</p>
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * <p>The name of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>range_val</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The type of the rule parameter. Valid values:</p>
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

            /**
             * <p>The configured value of the rule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
    /**
     * 
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private Integer defaultValue;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private Integer optional;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

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
        public java.util.List<ParamList> getParamList() {
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
            private java.util.List<ParamList> paramList; 
            private String ruleDesc; 
            private String ruleId; 

            /**
             * <p>The default value of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder defaultValue(Integer defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Indicates whether the rule can be selected. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
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
             * <p>The rule parameters.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Please customize the password expiration time detection standard as</p>
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>login_unlock_deny_pam_faillock.must.cus</p>
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
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
     */
    public static class CheckDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckDesc")
        private String checkDesc;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

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
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String checkDesc; 
            private Long checkId; 
            private String checkItem; 
            private java.util.List<Rules> rules; 

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Set password expiration time, force regular modification of password, reduce password leakage and guess risk.Use non-password login (e.g. key pair) please ignore this item.</p>
             */
            public Builder checkDesc(String checkDesc) {
                this.checkDesc = checkDesc;
                return this;
            }

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>206</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Ensure password expiration period is set.</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The details of rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
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
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
     */
    public static class SubTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CheckDetails")
        private java.util.List<CheckDetails> checkDetails;

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
        public java.util.List<CheckDetails> getCheckDetails() {
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
            private java.util.List<CheckDetails> checkDetails; 
            private Boolean on; 
            private String supportedOs; 
            private String typeName; 

            /**
             * <p>The alias of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis unauthorized access high exploit vulnerability risk</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The details of custom check items.</p>
             */
            public Builder checkDetails(java.util.List<CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * <p>Indicates whether the sub-check item is selected. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder on(Boolean on) {
                this.on = on;
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
             * <p>windows</p>
             */
            public Builder supportedOs(String supportedOs) {
                this.supportedOs = supportedOs;
                return this;
            }

            /**
             * <p>The type of the sub-check item.</p>
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
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
     */
    public static class RiskTypeWhiteListQueryResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("On")
        private Boolean on;

        @com.aliyun.core.annotation.NameInMap("SubTypes")
        private java.util.List<SubTypes> subTypes;

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
        public java.util.List<SubTypes> getSubTypes() {
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
            private java.util.List<SubTypes> subTypes; 
            private String typeName; 

            /**
             * <p>The alias of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Unauthorized Access</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Indicates whether the check item is selected. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder on(Boolean on) {
                this.on = on;
                return this;
            }

            /**
             * <p>The information about sub-check items.</p>
             */
            public Builder subTypes(java.util.List<SubTypes> subTypes) {
                this.subTypes = subTypes;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>hc_exploit</p>
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
    /**
     * 
     * {@link DescribeStrategyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyDetailResponseBody</p>
     */
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
        private java.util.List<RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

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
        public java.util.List<RiskTypeWhiteListQueryResultList> getRiskTypeWhiteListQueryResultList() {
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
            private java.util.List<RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList; 
            private String startTime; 
            private String targetType; 
            private Integer type; 

            /**
             * <p>The type of the baseline check policy that you want to query. Valid values:</p>
             * <ul>
             * <li><strong>common</strong>: standard baseline check policy</li>
             * <li><strong>custom</strong>: custom baseline check policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder customType(String customType) {
                this.customType = customType;
                return this;
            }

            /**
             * <p>The check interval of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * <p>The time period during which the check starts. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: 00:00 to 06:00</li>
             * <li><strong>6</strong>: 06:00 to 12:00</li>
             * <li><strong>12</strong>: 12:00 to 18:00</li>
             * <li><strong>18</strong>: 18:00 to 24:00</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * <p>The end time of the check. Specify the time in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>03:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TestStrategy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subtype of the baselines. </p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the subtypes of baselines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hc_nginx_linux,tomcat7,hc_mysql_ali,hc_docker</p>
             */
            public Builder riskSubTypeName(String riskSubTypeName) {
                this.riskSubTypeName = riskSubTypeName;
                return this;
            }

            /**
             * <p>The information about the whitelist of risk items.</p>
             */
            public Builder riskTypeWhiteListQueryResultList(java.util.List<RiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList) {
                this.riskTypeWhiteListQueryResultList = riskTypeWhiteListQueryResultList;
                return this;
            }

            /**
             * <p>The start time of the check. Specify the time in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The method that is used to apply the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>groupId</strong>: asset groups</li>
             * <li><strong>uuid</strong>: assets</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>groupId</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The type of the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: standard policies</li>
             * <li><strong>2</strong>: custom policies</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
