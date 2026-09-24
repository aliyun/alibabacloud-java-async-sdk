// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetElastictaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetElastictaskResponseBody</p>
 */
public class GetElastictaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetElastictaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetElastictaskResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetElastictaskResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetElastictaskResponseBody build() {
            return new GetElastictaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetElastictaskResponseBody</p>
     */
    public static class ElasticExpansionTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("elasticNodeCount")
        private Integer elasticNodeCount;

        @com.aliyun.core.annotation.NameInMap("replicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("targetIndices")
        private java.util.List<String> targetIndices;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private ElasticExpansionTask(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.elasticNodeCount = builder.elasticNodeCount;
            this.replicaCount = builder.replicaCount;
            this.targetIndices = builder.targetIndices;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticExpansionTask create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return elasticNodeCount
         */
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        /**
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        /**
         * @return targetIndices
         */
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String cronExpression; 
            private Integer elasticNodeCount; 
            private Integer replicaCount; 
            private java.util.List<String> targetIndices; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(ElasticExpansionTask model) {
                this.cronExpression = model.cronExpression;
                this.elasticNodeCount = model.elasticNodeCount;
                this.replicaCount = model.replicaCount;
                this.targetIndices = model.targetIndices;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The trigger cycle, specified as a Quartz Cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 ? * MON</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The number of elastic data nodes during peak hours.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder elasticNodeCount(Integer elasticNodeCount) {
                this.elasticNodeCount = elasticNodeCount;
                return this;
            }

            /**
             * <p>The number of replicas for the target index.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * targetIndices.
             */
            public Builder targetIndices(java.util.List<String> targetIndices) {
                this.targetIndices = targetIndices;
                return this;
            }

            /**
             * <p>The cause. Currently, only <strong>crontab</strong> is supported, which indicates scheduled triggering.</p>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ElasticExpansionTask build() {
                return new ElasticExpansionTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetElastictaskResponseBody</p>
     */
    public static class ElasticShrinkTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("elasticNodeCount")
        private Integer elasticNodeCount;

        @com.aliyun.core.annotation.NameInMap("replicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("targetIndices")
        private java.util.List<String> targetIndices;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private ElasticShrinkTask(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.elasticNodeCount = builder.elasticNodeCount;
            this.replicaCount = builder.replicaCount;
            this.targetIndices = builder.targetIndices;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticShrinkTask create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return elasticNodeCount
         */
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        /**
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        /**
         * @return targetIndices
         */
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String cronExpression; 
            private Integer elasticNodeCount; 
            private Integer replicaCount; 
            private java.util.List<String> targetIndices; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(ElasticShrinkTask model) {
                this.cronExpression = model.cronExpression;
                this.elasticNodeCount = model.elasticNodeCount;
                this.replicaCount = model.replicaCount;
                this.targetIndices = model.targetIndices;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The trigger cycle, specified as a Quartz Cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>4 4 4 ? * WED</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The number of elastic data nodes during off-peak hours.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder elasticNodeCount(Integer elasticNodeCount) {
                this.elasticNodeCount = elasticNodeCount;
                return this;
            }

            /**
             * <p>The number of replicas for the target index.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * targetIndices.
             */
            public Builder targetIndices(java.util.List<String> targetIndices) {
                this.targetIndices = targetIndices;
                return this;
            }

            /**
             * <p>The cause. Currently, only crontab is supported, which indicates scheduled triggering.</p>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ElasticShrinkTask build() {
                return new ElasticShrinkTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetElastictaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticExpansionTask")
        private ElasticExpansionTask elasticExpansionTask;

        @com.aliyun.core.annotation.NameInMap("elasticShrinkTask")
        private ElasticShrinkTask elasticShrinkTask;

        private Result(Builder builder) {
            this.elasticExpansionTask = builder.elasticExpansionTask;
            this.elasticShrinkTask = builder.elasticShrinkTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return elasticExpansionTask
         */
        public ElasticExpansionTask getElasticExpansionTask() {
            return this.elasticExpansionTask;
        }

        /**
         * @return elasticShrinkTask
         */
        public ElasticShrinkTask getElasticShrinkTask() {
            return this.elasticShrinkTask;
        }

        public static final class Builder {
            private ElasticExpansionTask elasticExpansionTask; 
            private ElasticShrinkTask elasticShrinkTask; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.elasticExpansionTask = model.elasticExpansionTask;
                this.elasticShrinkTask = model.elasticShrinkTask;
            } 

            /**
             * <p>The elastic scale-out rule.</p>
             */
            public Builder elasticExpansionTask(ElasticExpansionTask elasticExpansionTask) {
                this.elasticExpansionTask = elasticExpansionTask;
                return this;
            }

            /**
             * <p>The elastic scale-in rule.</p>
             */
            public Builder elasticShrinkTask(ElasticShrinkTask elasticShrinkTask) {
                this.elasticShrinkTask = elasticShrinkTask;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
