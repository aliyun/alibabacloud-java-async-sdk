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
 * {@link CreateElasticRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateElasticRuleResponseBody</p>
 */
public class CreateElasticRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateElasticRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateElasticRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateElasticRuleResponseBody build() {
            return new CreateElasticRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateElasticRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateElasticRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterClass")
        private String clusterClass;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("ElasticRuleStartTime")
        private String elasticRuleStartTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionPeriod")
        private String executionPeriod;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Data(Builder builder) {
            this.clusterClass = builder.clusterClass;
            this.clusterId = builder.clusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.elasticRuleStartTime = builder.elasticRuleStartTime;
            this.executionPeriod = builder.executionPeriod;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterClass
         */
        public String getClusterClass() {
            return this.clusterClass;
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
            private String clusterId; 
            private String dbInstanceId; 
            private String elasticRuleStartTime; 
            private String executionPeriod; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterClass = model.clusterClass;
                this.clusterId = model.clusterId;
                this.dbInstanceId = model.dbInstanceId;
                this.elasticRuleStartTime = model.elasticRuleStartTime;
                this.executionPeriod = model.executionPeriod;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The rule for computing resources of the required cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb.2xlarge</p>
             */
            public Builder clusterClass(String clusterClass) {
                this.clusterClass = clusterClass;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-xxxb9f2w-be</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-7213cjv****</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The time when the scheduled scaling rule is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder elasticRuleStartTime(String elasticRuleStartTime) {
                this.elasticRuleStartTime = elasticRuleStartTime;
                return this;
            }

            /**
             * <p>The execution cycle.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Day</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Day</p>
             */
            public Builder executionPeriod(String executionPeriod) {
                this.executionPeriod = executionPeriod;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5465</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
