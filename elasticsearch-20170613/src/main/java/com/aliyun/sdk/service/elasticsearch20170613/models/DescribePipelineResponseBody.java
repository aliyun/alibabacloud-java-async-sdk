// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineResponseBody</p>
 */
public class DescribePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The time when the pipeline was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>829F38F6-E2D6-4109-90A6-888160BD1***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the queue. Valid values:</p>
         * <ul>
         * <li>MEMORY: a traditional memory-based queue.</li>
         * <li>PERSISTED: disk-based ACKed queue (persistent queue).</li>
         * </ul>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribePipelineResponseBody build() {
            return new DescribePipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePipelineResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchDelay")
        private Integer batchDelay;

        @com.aliyun.core.annotation.NameInMap("batchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @com.aliyun.core.annotation.NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @com.aliyun.core.annotation.NameInMap("pipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("pipelineStatus")
        private String pipelineStatus;

        @com.aliyun.core.annotation.NameInMap("queueCheckPointWrites")
        private Integer queueCheckPointWrites;

        @com.aliyun.core.annotation.NameInMap("queueMaxBytes")
        private Integer queueMaxBytes;

        @com.aliyun.core.annotation.NameInMap("queueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("workers")
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
             * <p>The time when the pipeline was created.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
             * <p>The description of the pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>input {  }  filter {  }  output {  }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The state of the MPS queue. Valid values:</p>
             * <ul>
             * <li>NOT_DEPLOYED: The node is not deployed.</li>
             * <li>RUNNING</li>
             * <li>DELETED: Deleted. The console does not display this status.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>this is a test</p>
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
             * <p>The total capacity of the queue in bytes. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-20T07:26:47.000+0000</p>
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * <p>Number of queue checkpoint writes.</p>
             * 
             * <strong>example:</strong>
             * <p>pipeline_test</p>
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
             * <p>Pipeline batch delay. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder queueCheckPointWrites(Integer queueCheckPointWrites) {
                this.queueCheckPointWrites = queueCheckPointWrites;
                return this;
            }

            /**
             * <p>The number of pipeline workers.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder queueMaxBytes(Integer queueMaxBytes) {
                this.queueMaxBytes = queueMaxBytes;
                return this;
            }

            /**
             * <p>The specific configuration of the pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>MEMORY</p>
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * <p>The size of the pipeline batch.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
