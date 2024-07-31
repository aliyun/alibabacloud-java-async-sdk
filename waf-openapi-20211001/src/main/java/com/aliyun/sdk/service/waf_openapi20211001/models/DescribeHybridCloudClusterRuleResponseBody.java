// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudClusterRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudClusterRuleResponseBody</p>
 */
public class DescribeHybridCloudClusterRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterRule")
    private ClusterRule clusterRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudClusterRuleResponseBody(Builder builder) {
        this.clusterRule = builder.clusterRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudClusterRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterRule
     */
    public ClusterRule getClusterRule() {
        return this.clusterRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterRule clusterRule; 
        private String requestId; 

        /**
         * The details of the rule.
         */
        public Builder clusterRule(ClusterRule clusterRule) {
            this.clusterRule = clusterRule;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudClusterRuleResponseBody build() {
            return new DescribeHybridCloudClusterRuleResponseBody(this);
        } 

    } 

    public static class ClusterRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private ClusterRule(Builder builder) {
            this.ruleConfig = builder.ruleConfig;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterRule create() {
            return builder().build();
        }

        /**
         * @return ruleConfig
         */
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String ruleConfig; 
            private String ruleStatus; 
            private String ruleType; 

            /**
             * The configuration of the rule.
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   **on**: enabled.
             * *   **off**: disabled.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **pullin**: The traffic redirection rule of the hybrid cloud cluster.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public ClusterRule build() {
                return new ClusterRule(this);
            } 

        } 

    }
}
