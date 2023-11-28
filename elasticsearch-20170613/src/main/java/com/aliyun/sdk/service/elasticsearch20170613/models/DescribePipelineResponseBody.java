// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineResponseBody</p>
 */
public class DescribePipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribePipelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineResponseBody create() {
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
         * The time when the pipeline was updated.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the queue. Valid values:
         * <p>
         * 
         * *   MEMORY: a traditional memory-based queue.
         * *   PERSISTED: disk-based ACKed queue (persistent queue).
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribePipelineResponseBody build() {
            return new DescribePipelineResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("batchDelay")
        private Integer batchDelay;

        @NameInMap("batchSize")
        private Integer batchSize;

        @NameInMap("config")
        private String config;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @NameInMap("pipelineId")
        private String pipelineId;

        @NameInMap("pipelineStatus")
        private String pipelineStatus;

        @NameInMap("queueCheckPointWrites")
        private Integer queueCheckPointWrites;

        @NameInMap("queueMaxBytes")
        private Integer queueMaxBytes;

        @NameInMap("queueType")
        private String queueType;

        @NameInMap("workers")
        private Integer workers;

        private Result(Builder builder) {
            this.batchDelay = builder.batchDelay;
            this.batchSize = builder.batchSize;
            this.config = builder.config;
            this.description = builder.description;
            this.gmtCreatedTime = builder.gmtCreatedTime;
            this.gmtUpdateTime = builder.gmtUpdateTime;
            this.pipelineId = builder.pipelineId;
            this.pipelineStatus = builder.pipelineStatus;
            this.queueCheckPointWrites = builder.queueCheckPointWrites;
            this.queueMaxBytes = builder.queueMaxBytes;
            this.queueType = builder.queueType;
            this.workers = builder.workers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return batchDelay
         */
        public Integer getBatchDelay() {
            return this.batchDelay;
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreatedTime
         */
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        /**
         * @return gmtUpdateTime
         */
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineStatus
         */
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

        /**
         * @return queueCheckPointWrites
         */
        public Integer getQueueCheckPointWrites() {
            return this.queueCheckPointWrites;
        }

        /**
         * @return queueMaxBytes
         */
        public Integer getQueueMaxBytes() {
            return this.queueMaxBytes;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return workers
         */
        public Integer getWorkers() {
            return this.workers;
        }

        public static final class Builder {
            private Integer batchDelay; 
            private Integer batchSize; 
            private String config; 
            private String description; 
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String pipelineId; 
            private String pipelineStatus; 
            private Integer queueCheckPointWrites; 
            private Integer queueMaxBytes; 
            private String queueType; 
            private Integer workers; 

            /**
             * The time when the pipeline was created.
             */
            public Builder batchDelay(Integer batchDelay) {
                this.batchDelay = batchDelay;
                return this;
            }

            /**
             * batchSize.
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * The description of the pipeline.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The state of the MPS queue. Valid values:
             * <p>
             * 
             * *   NOT_DEPLOYED: The node is not deployed.
             * *   RUNNING
             * *   DELETED: Deleted. The console does not display this status.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreatedTime.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * The total capacity of the queue in bytes. Unit: MB.
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * Number of queue checkpoint writes.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * pipelineStatus.
             */
            public Builder pipelineStatus(String pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            /**
             * Pipeline batch delay. Unit: milliseconds.
             */
            public Builder queueCheckPointWrites(Integer queueCheckPointWrites) {
                this.queueCheckPointWrites = queueCheckPointWrites;
                return this;
            }

            /**
             * The number of pipeline workers.
             */
            public Builder queueMaxBytes(Integer queueMaxBytes) {
                this.queueMaxBytes = queueMaxBytes;
                return this;
            }

            /**
             * The specific configuration of the pipeline.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * The size of the pipeline batch.
             */
            public Builder workers(Integer workers) {
                this.workers = workers;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
