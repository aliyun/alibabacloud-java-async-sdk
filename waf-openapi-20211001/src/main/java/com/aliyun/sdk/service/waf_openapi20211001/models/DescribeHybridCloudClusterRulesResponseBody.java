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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * ClusterId.
             */
            public Builder clusterId(Long clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterRuleResourceId.
             */
            public Builder clusterRuleResourceId(String clusterRuleResourceId) {
                this.clusterRuleResourceId = clusterRuleResourceId;
                return this;
            }

            /**
             * RuleConfig.
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
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
