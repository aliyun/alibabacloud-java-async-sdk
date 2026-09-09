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
 * {@link DescribeHybridCloudClusterRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudClusterRulesResponseBody</p>
 */
public class DescribeHybridCloudClusterRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeHybridCloudClusterRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudClusterRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudClusterRulesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of cloud native mode entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudClusterRulesResponseBody build() {
            return new DescribeHybridCloudClusterRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudClusterRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudClusterRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private Long clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterRuleResourceId")
        private String clusterRuleResourceId;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterRuleResourceId = builder.clusterRuleResourceId;
            this.ruleConfig = builder.ruleConfig;
            this.ruleType = builder.ruleType;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public Long getClusterId() {
            return this.clusterId;
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
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long clusterId; 
            private String clusterRuleResourceId; 
            private String ruleConfig; 
            private String ruleType; 
            private String status; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.clusterRuleResourceId = model.clusterRuleResourceId;
                this.ruleConfig = model.ruleConfig;
                this.ruleType = model.ruleType;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the hybrid cloud cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1099</p>
             */
            public Builder clusterId(Long clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The resource ID of the cluster rule.</p>
             * 
             * <strong>example:</strong>
             * <p>hdbc-clusterrule-*****khzre0ym0w</p>
             */
            public Builder clusterRuleResourceId(String clusterRuleResourceId) {
                this.clusterRuleResourceId = clusterRuleResourceId;
                return this;
            }

            /**
             * <p>The configuration of the traffic redirection rule:</p>
             * <ul>
             * <li><p><strong>check_mode</strong></p>
             * <p>: the mode. Valid values:</p>
             * <ul>
             * <li><p><strong>all</strong>: redirects all traffic.</p>
             * </li>
             * <li><p><strong>part</strong>: redirects a portion of traffic.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>type</strong></p>
             * <p>: the match type of the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>exact</strong>: exact match.</p>
             * </li>
             * <li><p><strong>regex</strong>: regular expression match.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>substance</strong>: the value of the rule.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * <p>The type of the rule. Valid value:</p>
             * <ul>
             * <li><strong>pullin</strong>: traffic redirection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pullin</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: enabled.</p>
             * </li>
             * <li><p><strong>0</strong>: disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
