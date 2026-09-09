// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeBaseRuleChangeLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBaseRuleChangeLogResponseBody</p>
 */
public class DescribeBaseRuleChangeLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBaseRuleChangeLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBaseRuleChangeLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBaseRuleChangeLogResponseBody model) {
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FBF08CB-8691-5B65-BBF8-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rule group changes.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of rule change records.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBaseRuleChangeLogResponseBody build() {
            return new DescribeBaseRuleChangeLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBaseRuleChangeLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBaseRuleChangeLogResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Rules(Builder builder) {
            this.cveId = builder.cveId;
            this.operation = builder.operation;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cveId; 
            private String operation; 
            private Long ruleId; 
            private String ruleName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.cveId = model.cveId;
                this.operation = model.operation;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The CVE ID of the vulnerability associated with the system rule.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2021-34538</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li>add: added.</li>
             * <li>modify: modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>42755</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>Header XSS Scanner Behavior</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The time when the rule was updated. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665460629000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
