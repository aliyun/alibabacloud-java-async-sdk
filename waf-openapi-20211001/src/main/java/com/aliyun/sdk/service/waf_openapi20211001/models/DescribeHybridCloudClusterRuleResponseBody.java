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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHybridCloudClusterRuleResponseBody model) {
            this.clusterRule = model.clusterRule;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The rule information.</p>
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
        @com.aliyun.core.annotation.NameInMap("ClusterRuleResourceId")
        private String clusterRuleResourceId;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private ClusterRule(Builder builder) {
            this.clusterRuleResourceId = builder.clusterRuleResourceId;
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
         * @return clusterRuleResourceId
         */
        public String getClusterRuleResourceId() {
            return this.clusterRuleResourceId;
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
            private String clusterRuleResourceId; 
            private String ruleConfig; 
            private String ruleStatus; 
            private String ruleType; 

            private Builder() {
            } 

            private Builder(ClusterRule model) {
                this.clusterRuleResourceId = model.clusterRuleResourceId;
                this.ruleConfig = model.ruleConfig;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The cluster rule resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hdbc-clusterrule-2m*****m0w</p>
             */
            public Builder clusterRuleResourceId(String clusterRuleResourceId) {
                this.clusterRuleResourceId = clusterRuleResourceId;
                return this;
            }

            /**
             * <p>The traffic redirection rule configuration:</p>
             * <ul>
             * <li><strong>check_mode</strong>: the mode selection. Valid values:<ul>
             * <li><strong>all</strong>: full traffic redirection</li>
             * <li><strong>part</strong>: partial traffic redirection</li>
             * </ul>
             * </li>
             * <li><strong>type</strong>: the rule matching type. Valid values:<ul>
             * <li><strong>exact</strong>: exact match</li>
             * <li><strong>regex</strong>: regular expression</li>
             * </ul>
             * </li>
             * <li><strong>substance</strong>: the rule value</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;check_mode\&quot;:\&quot;all\&quot;,\&quot;exclude\&quot;:{\&quot;exact\&quot;:[],\&quot;regex\&quot;:[]}}</p>
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * <p>The rule status. Valid values:</p>
             * <ul>
             * <li><p><strong>on</strong>: enabled.</p>
             * </li>
             * <li><p><strong>off</strong>: disabled.</p>
             * </li>
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
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li>pullin: traffic redirection rule</li>
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
