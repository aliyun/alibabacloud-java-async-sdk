// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the rule.</p>
         */
        public Builder clusterRule(ClusterRule clusterRule) {
            this.clusterRule = clusterRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1F29A6D2-9EB6-526D-A997-36888**99CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudClusterRuleResponseBody build() {
            return new DescribeHybridCloudClusterRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudClusterRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudClusterRuleResponseBody</p>
     */
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
             * <p>The configuration of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;check_mode&quot;:&quot;all&quot;,&quot;exclude&quot;:{&quot;exact&quot;:[],&quot;regex&quot;:[]}}</p>
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled.</li>
             * <li><strong>off</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>pullin</strong>: The traffic redirection rule of the hybrid cloud cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pullin</p>
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
