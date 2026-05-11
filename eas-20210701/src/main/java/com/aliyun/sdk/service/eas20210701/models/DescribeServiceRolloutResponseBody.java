// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceRolloutResponseBody</p>
 */
public class DescribeServiceRolloutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rollout")
    private Rollout rollout;

    private DescribeServiceRolloutResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rollout = builder.rollout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceRolloutResponseBody create() {
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
     * @return rollout
     */
    public Rollout getRollout() {
        return this.rollout;
    }

    public static final class Builder {
        private String requestId; 
        private Rollout rollout; 

        private Builder() {
        } 

        private Builder(DescribeServiceRolloutResponseBody model) {
            this.requestId = model.requestId;
            this.rollout = model.rollout;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rollout.
         */
        public Builder rollout(Rollout rollout) {
            this.rollout = rollout;
            return this;
        }

        public DescribeServiceRolloutResponseBody build() {
            return new DescribeServiceRolloutResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceRolloutResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentRevision")
        private String currentRevision;

        @com.aliyun.core.annotation.NameInMap("NextBatchStartTime")
        private String nextBatchStartTime;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("TotalReplicas")
        private Integer totalReplicas;

        @com.aliyun.core.annotation.NameInMap("UpdateRevision")
        private String updateRevision;

        @com.aliyun.core.annotation.NameInMap("UpdatedReplicas")
        private Integer updatedReplicas;

        private Status(Builder builder) {
            this.currentRevision = builder.currentRevision;
            this.nextBatchStartTime = builder.nextBatchStartTime;
            this.phase = builder.phase;
            this.totalReplicas = builder.totalReplicas;
            this.updateRevision = builder.updateRevision;
            this.updatedReplicas = builder.updatedReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return currentRevision
         */
        public String getCurrentRevision() {
            return this.currentRevision;
        }

        /**
         * @return nextBatchStartTime
         */
        public String getNextBatchStartTime() {
            return this.nextBatchStartTime;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return totalReplicas
         */
        public Integer getTotalReplicas() {
            return this.totalReplicas;
        }

        /**
         * @return updateRevision
         */
        public String getUpdateRevision() {
            return this.updateRevision;
        }

        /**
         * @return updatedReplicas
         */
        public Integer getUpdatedReplicas() {
            return this.updatedReplicas;
        }

        public static final class Builder {
            private String currentRevision; 
            private String nextBatchStartTime; 
            private String phase; 
            private Integer totalReplicas; 
            private String updateRevision; 
            private Integer updatedReplicas; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.currentRevision = model.currentRevision;
                this.nextBatchStartTime = model.nextBatchStartTime;
                this.phase = model.phase;
                this.totalReplicas = model.totalReplicas;
                this.updateRevision = model.updateRevision;
                this.updatedReplicas = model.updatedReplicas;
            } 

            /**
             * CurrentRevision.
             */
            public Builder currentRevision(String currentRevision) {
                this.currentRevision = currentRevision;
                return this;
            }

            /**
             * NextBatchStartTime.
             */
            public Builder nextBatchStartTime(String nextBatchStartTime) {
                this.nextBatchStartTime = nextBatchStartTime;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * TotalReplicas.
             */
            public Builder totalReplicas(Integer totalReplicas) {
                this.totalReplicas = totalReplicas;
                return this;
            }

            /**
             * UpdateRevision.
             */
            public Builder updateRevision(String updateRevision) {
                this.updateRevision = updateRevision;
                return this;
            }

            /**
             * UpdatedReplicas.
             */
            public Builder updatedReplicas(Integer updatedReplicas) {
                this.updatedReplicas = updatedReplicas;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceRolloutResponseBody</p>
     */
    public static class Batch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private String batchSize;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        private Batch(Builder builder) {
            this.batchSize = builder.batchSize;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Batch create() {
            return builder().build();
        }

        /**
         * @return batchSize
         */
        public String getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private String batchSize; 
            private String interval; 

            private Builder() {
            } 

            private Builder(Batch model) {
                this.batchSize = model.batchSize;
                this.interval = model.interval;
            } 

            /**
             * BatchSize.
             */
            public Builder batchSize(String batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            public Batch build() {
                return new Batch(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceRolloutResponseBody</p>
     */
    public static class Partition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Partition")
        private String partition;

        private Partition(Builder builder) {
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Partition create() {
            return builder().build();
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private String partition; 

            private Builder() {
            } 

            private Builder(Partition model) {
                this.partition = model.partition;
            } 

            /**
             * Partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            public Partition build() {
                return new Partition(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceRolloutResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Batch")
        private Batch batch;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Partition partition;

        private Strategy(Builder builder) {
            this.batch = builder.batch;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return batch
         */
        public Batch getBatch() {
            return this.batch;
        }

        /**
         * @return partition
         */
        public Partition getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Batch batch; 
            private Partition partition; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.batch = model.batch;
                this.partition = model.partition;
            } 

            /**
             * Batch.
             */
            public Builder batch(Batch batch) {
                this.batch = batch;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Partition partition) {
                this.partition = partition;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceRolloutResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceRolloutResponseBody</p>
     */
    public static class Rollout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        private Rollout(Builder builder) {
            this.status = builder.status;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rollout create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Status status; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(Rollout model) {
                this.status = model.status;
                this.strategy = model.strategy;
            } 

            /**
             * Status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public Rollout build() {
                return new Rollout(this);
            } 

        } 

    }
}
