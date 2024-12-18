// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeElasticRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticRulesResponseBody</p>
 */
public class DescribeElasticRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeElasticRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public DescribeElasticRulesResponseBody build() {
            return new DescribeElasticRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterClass")
        private String clusterClass;

        @com.aliyun.core.annotation.NameInMap("ElasticRuleStartTime")
        private String elasticRuleStartTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionPeriod")
        private String executionPeriod;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Rules(Builder builder) {
            this.clusterClass = builder.clusterClass;
            this.elasticRuleStartTime = builder.elasticRuleStartTime;
            this.executionPeriod = builder.executionPeriod;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return clusterClass
         */
        public String getClusterClass() {
            return this.clusterClass;
        }

        /**
         * @return elasticRuleStartTime
         */
        public String getElasticRuleStartTime() {
            return this.elasticRuleStartTime;
        }

        /**
         * @return executionPeriod
         */
        public String getExecutionPeriod() {
            return this.executionPeriod;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String clusterClass; 
            private String elasticRuleStartTime; 
            private String executionPeriod; 
            private Long ruleId; 

            /**
             * ClusterClass.
             */
            public Builder clusterClass(String clusterClass) {
                this.clusterClass = clusterClass;
                return this;
            }

            /**
             * ElasticRuleStartTime.
             */
            public Builder elasticRuleStartTime(String elasticRuleStartTime) {
                this.elasticRuleStartTime = elasticRuleStartTime;
                return this;
            }

            /**
             * ExecutionPeriod.
             */
            public Builder executionPeriod(String executionPeriod) {
                this.executionPeriod = executionPeriod;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.rules = builder.rules;
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
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String clusterId; 
            private String dbInstanceId; 
            private java.util.List<Rules> rules; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
