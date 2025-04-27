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
 * {@link ModifyElastictaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyElastictaskResponseBody</p>
 */
public class ModifyElastictaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ModifyElastictaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElastictaskResponseBody create() {
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

        private Builder(ModifyElastictaskResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyElastictaskResponseBody build() {
            return new ModifyElastictaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyElastictaskResponseBody</p>
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
             * cronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * elasticNodeCount.
             */
            public Builder elasticNodeCount(Integer elasticNodeCount) {
                this.elasticNodeCount = elasticNodeCount;
                return this;
            }

            /**
             * replicaCount.
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
             * triggerType.
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
     * {@link ModifyElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyElastictaskResponseBody</p>
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
             * cronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * elasticNodeCount.
             */
            public Builder elasticNodeCount(Integer elasticNodeCount) {
                this.elasticNodeCount = elasticNodeCount;
                return this;
            }

            /**
             * replicaCount.
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
             * triggerType.
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
     * {@link ModifyElastictaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyElastictaskResponseBody</p>
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
             * elasticExpansionTask.
             */
            public Builder elasticExpansionTask(ElasticExpansionTask elasticExpansionTask) {
                this.elasticExpansionTask = elasticExpansionTask;
                return this;
            }

            /**
             * elasticShrinkTask.
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
