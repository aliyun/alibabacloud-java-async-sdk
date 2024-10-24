// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSchedulerRulesResponseBody</p>
 */
public class DescribeSchedulerRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchedulerRules")
    private java.util.List < SchedulerRules> schedulerRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSchedulerRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schedulerRules = builder.schedulerRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSchedulerRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedulerRules
     */
    public java.util.List < SchedulerRules> getSchedulerRules() {
        return this.schedulerRules;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SchedulerRules> schedulerRules; 
        private String totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchedulerRules.
         */
        public Builder schedulerRules(java.util.List < SchedulerRules> schedulerRules) {
            this.schedulerRules = schedulerRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSchedulerRulesResponseBody build() {
            return new DescribeSchedulerRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSchedulerRulesResponseBody</p>
     */
    public static class ParamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudInstanceId")
        private String cloudInstanceId;

        private ParamData(Builder builder) {
            this.cloudInstanceId = builder.cloudInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamData create() {
            return builder().build();
        }

        /**
         * @return cloudInstanceId
         */
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public static final class Builder {
            private String cloudInstanceId; 

            /**
             * CloudInstanceId.
             */
            public Builder cloudInstanceId(String cloudInstanceId) {
                this.cloudInstanceId = cloudInstanceId;
                return this;
            }

            public ParamData build() {
                return new ParamData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSchedulerRulesResponseBody</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamData")
        private ParamData paramData;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        private Param(Builder builder) {
            this.paramData = builder.paramData;
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return paramData
         */
        public ParamData getParamData() {
            return this.paramData;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private ParamData paramData; 
            private String paramType; 

            /**
             * ParamData.
             */
            public Builder paramData(ParamData paramData) {
                this.paramData = paramData;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSchedulerRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RestoreDelay")
        private Integer restoreDelay;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private Integer valueType;

        private Rules(Builder builder) {
            this.line = builder.line;
            this.priority = builder.priority;
            this.regionId = builder.regionId;
            this.restoreDelay = builder.restoreDelay;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return restoreDelay
         */
        public Integer getRestoreDelay() {
            return this.restoreDelay;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public Integer getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String line; 
            private Integer priority; 
            private String regionId; 
            private Integer restoreDelay; 
            private Integer status; 
            private String type; 
            private String value; 
            private Integer valueType; 

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RestoreDelay.
             */
            public Builder restoreDelay(Integer restoreDelay) {
                this.restoreDelay = restoreDelay;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(Integer valueType) {
                this.valueType = valueType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSchedulerRulesResponseBody</p>
     */
    public static class SchedulerRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private SchedulerRules(Builder builder) {
            this.cname = builder.cname;
            this.param = builder.param;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerRules create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String cname; 
            private Param param; 
            private String ruleName; 
            private String ruleType; 
            private java.util.List < Rules> rules; 

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * Param.
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public SchedulerRules build() {
                return new SchedulerRules(this);
            } 

        } 

    }
}
