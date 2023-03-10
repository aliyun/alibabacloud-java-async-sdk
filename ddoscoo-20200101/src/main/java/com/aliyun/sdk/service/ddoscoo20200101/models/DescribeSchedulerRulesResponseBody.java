// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSchedulerRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSchedulerRulesResponseBody</p>
 */
public class DescribeSchedulerRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SchedulerRules")
    private java.util.List < SchedulerRules> schedulerRules;

    @NameInMap("TotalCount")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the scheduling rule.
         */
        public Builder schedulerRules(java.util.List < SchedulerRules> schedulerRules) {
            this.schedulerRules = schedulerRules;
            return this;
        }

        /**
         * The total number of returned scheduling rules.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSchedulerRulesResponseBody build() {
            return new DescribeSchedulerRulesResponseBody(this);
        } 

    } 

    public static class ParamData extends TeaModel {
        @NameInMap("CloudInstanceId")
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
             * The ID of the GA instance.
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
    public static class Param extends TeaModel {
        @NameInMap("ParamData")
        private ParamData paramData;

        @NameInMap("ParamType")
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
             * The interaction resource.
             */
            public Builder paramData(ParamData paramData) {
                this.paramData = paramData;
                return this;
            }

            /**
             * The type of the interaction resource. Valid value: **GA**, which indicates that the Global Accelerator instance is used.
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
    public static class Rules extends TeaModel {
        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RestoreDelay")
        private Integer restoreDelay;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueType")
        private Integer valueType;

        private Rules(Builder builder) {
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
            private Integer priority; 
            private String regionId; 
            private Integer restoreDelay; 
            private Integer status; 
            private String type; 
            private String value; 
            private Integer valueType; 

            /**
             * The priority of the rule.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the region.
             * <p>
             * 
             * > This parameter is returned only if the **RuleType** parameter is set to **2**.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The waiting time of switching back. Unit: minutes.
             */
            public Builder restoreDelay(Integer restoreDelay) {
                this.restoreDelay = restoreDelay;
                return this;
            }

            /**
             * The status of the scheduling rule. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The address type of the interaction resource. Valid values:
             * <p>
             * 
             * *   **A**: IPv4 address
             * *   **CNAME**: CNAME record
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The address of the interaction resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The address type of the interaction resource. Valid values:
             * <p>
             * 
             * *   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance
             * *   **2**: the IP address of the interaction resource in the tiered protection scenario
             * *   **3**: the IP address that is used to accelerate access in the network acceleration scenario
             * *   **5**: the domain name that is configured in CDN in the CDN interaction scenario
             * *   **6** the IP address of the interaction resource in the cloud service interaction scenario
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
    public static class SchedulerRules extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Param")
        private Param param;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Rules")
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
             * The Canonical Name (CNAME) record assigned by Sec-Traffic Manager for the scheduling rule.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **2**: tiered protection
             * *   **3**: network acceleration
             * *   **5**: Alibaba Cloud CDN (CDN) interaction
             * *   **6**: cloud service interaction
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * An array that consists of the rules.
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
