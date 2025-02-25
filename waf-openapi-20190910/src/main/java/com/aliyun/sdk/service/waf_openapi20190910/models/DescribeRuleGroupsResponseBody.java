// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleGroupsResponseBody</p>
 */
public class DescribeRuleGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleGroups")
    private java.util.List < RuleGroups> ruleGroups;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("WafTaskId")
    private String wafTaskId;

    private DescribeRuleGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleGroups = builder.ruleGroups;
        this.taskStatus = builder.taskStatus;
        this.total = builder.total;
        this.wafTaskId = builder.wafTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleGroups
     */
    public java.util.List < RuleGroups> getRuleGroups() {
        return this.ruleGroups;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return wafTaskId
     */
    public String getWafTaskId() {
        return this.wafTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleGroups> ruleGroups; 
        private Integer taskStatus; 
        private Integer total; 
        private String wafTaskId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleGroups.
         */
        public Builder ruleGroups(java.util.List < RuleGroups> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * WafTaskId.
         */
        public Builder wafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }

        public DescribeRuleGroupsResponseBody build() {
            return new DescribeRuleGroupsResponseBody(this);
        } 

    } 

    public static class RuleGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private java.util.List < String > domainList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("RuleCnt")
        private Integer ruleCnt;

        @com.aliyun.core.annotation.NameInMap("RuleGroupTemplateName")
        private String ruleGroupTemplateName;

        @com.aliyun.core.annotation.NameInMap("RuleGroupUpdateTime")
        private Long ruleGroupUpdateTime;

        @com.aliyun.core.annotation.NameInMap("TemplatePolicyId")
        private Long templatePolicyId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("WafVersion")
        private Long wafVersion;

        private RuleGroups(Builder builder) {
            this.desc = builder.desc;
            this.domainList = builder.domainList;
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.ruleCnt = builder.ruleCnt;
            this.ruleGroupTemplateName = builder.ruleGroupTemplateName;
            this.ruleGroupUpdateTime = builder.ruleGroupUpdateTime;
            this.templatePolicyId = builder.templatePolicyId;
            this.type = builder.type;
            this.wafVersion = builder.wafVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleGroups create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return domainList
         */
        public java.util.List < String > getDomainList() {
            return this.domainList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return ruleCnt
         */
        public Integer getRuleCnt() {
            return this.ruleCnt;
        }

        /**
         * @return ruleGroupTemplateName
         */
        public String getRuleGroupTemplateName() {
            return this.ruleGroupTemplateName;
        }

        /**
         * @return ruleGroupUpdateTime
         */
        public Long getRuleGroupUpdateTime() {
            return this.ruleGroupUpdateTime;
        }

        /**
         * @return templatePolicyId
         */
        public Long getTemplatePolicyId() {
            return this.templatePolicyId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return wafVersion
         */
        public Long getWafVersion() {
            return this.wafVersion;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List < String > domainList; 
            private String name; 
            private Long policyId; 
            private Integer ruleCnt; 
            private String ruleGroupTemplateName; 
            private Long ruleGroupUpdateTime; 
            private Long templatePolicyId; 
            private Integer type; 
            private Long wafVersion; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * DomainList.
             */
            public Builder domainList(java.util.List < String > domainList) {
                this.domainList = domainList;
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
             * PolicyId.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * RuleCnt.
             */
            public Builder ruleCnt(Integer ruleCnt) {
                this.ruleCnt = ruleCnt;
                return this;
            }

            /**
             * RuleGroupTemplateName.
             */
            public Builder ruleGroupTemplateName(String ruleGroupTemplateName) {
                this.ruleGroupTemplateName = ruleGroupTemplateName;
                return this;
            }

            /**
             * RuleGroupUpdateTime.
             */
            public Builder ruleGroupUpdateTime(Long ruleGroupUpdateTime) {
                this.ruleGroupUpdateTime = ruleGroupUpdateTime;
                return this;
            }

            /**
             * TemplatePolicyId.
             */
            public Builder templatePolicyId(Long templatePolicyId) {
                this.templatePolicyId = templatePolicyId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * WafVersion.
             */
            public Builder wafVersion(Long wafVersion) {
                this.wafVersion = wafVersion;
                return this;
            }

            public RuleGroups build() {
                return new RuleGroups(this);
            } 

        } 

    }
}
