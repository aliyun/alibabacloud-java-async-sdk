// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
        private java.util.List < String > targetIndices;

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
        public java.util.List < String > getTargetIndices() {
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
            private java.util.List < String > targetIndices; 
            private String triggerType; 

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
            public Builder targetIndices(java.util.List < String > targetIndices) {
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
        private java.util.List < String > targetIndices;

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
        public java.util.List < String > getTargetIndices() {
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
            private java.util.List < String > targetIndices; 
            private String triggerType; 

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
            public Builder targetIndices(java.util.List < String > targetIndices) {
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
