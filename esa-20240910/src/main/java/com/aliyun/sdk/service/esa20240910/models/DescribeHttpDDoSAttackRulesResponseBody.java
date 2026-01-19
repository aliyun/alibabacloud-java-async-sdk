// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeHttpDDoSAttackRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHttpDDoSAttackRulesResponseBody</p>
 */
public class DescribeHttpDDoSAttackRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfos")
    private java.util.List<RuleInfos> ruleInfos;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHttpDDoSAttackRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.ruleInfos = builder.ruleInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSAttackRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleInfos
     */
    public java.util.List<RuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<RuleInfos> ruleInfos; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHttpDDoSAttackRulesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.ruleInfos = model.ruleInfos;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D4030CD2-0D9D-5E92-B358-421AE58307C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleInfos.
         */
        public Builder ruleInfos(java.util.List<RuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHttpDDoSAttackRulesResponseBody build() {
            return new DescribeHttpDDoSAttackRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHttpDDoSAttackRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHttpDDoSAttackRulesResponseBody</p>
     */
    public static class RuleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DefaultAction")
        private String defaultAction;

        @com.aliyun.core.annotation.NameInMap("LogRuleId")
        private Integer logRuleId;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleIdInfo")
        private String ruleIdInfo;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RuleInfos(Builder builder) {
            this.action = builder.action;
            this.defaultAction = builder.defaultAction;
            this.logRuleId = builder.logRuleId;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.ruleIdInfo = builder.ruleIdInfo;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return defaultAction
         */
        public String getDefaultAction() {
            return this.defaultAction;
        }

        /**
         * @return logRuleId
         */
        public Integer getLogRuleId() {
            return this.logRuleId;
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
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleIdInfo
         */
        public String getRuleIdInfo() {
            return this.ruleIdInfo;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String defaultAction; 
            private Integer logRuleId; 
            private String ruleDesc; 
            private Integer ruleId; 
            private String ruleIdInfo; 
            private String ruleName; 
            private String status; 

            private Builder() {
            } 

            private Builder(RuleInfos model) {
                this.action = model.action;
                this.defaultAction = model.defaultAction;
                this.logRuleId = model.logRuleId;
                this.ruleDesc = model.ruleDesc;
                this.ruleId = model.ruleId;
                this.ruleIdInfo = model.ruleIdInfo;
                this.ruleName = model.ruleName;
                this.status = model.status;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * DefaultAction.
             */
            public Builder defaultAction(String defaultAction) {
                this.defaultAction = defaultAction;
                return this;
            }

            /**
             * LogRuleId.
             */
            public Builder logRuleId(Integer logRuleId) {
                this.logRuleId = logRuleId;
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
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleIdInfo.
             */
            public Builder ruleIdInfo(String ruleIdInfo) {
                this.ruleIdInfo = ruleIdInfo;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
}
