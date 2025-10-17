// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutorsResponseBody</p>
 */
public class ListJobExecutorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exexutors")
    private java.util.List<Exexutors> exexutors;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListJobExecutorsResponseBody(Builder builder) {
        this.exexutors = builder.exexutors;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exexutors
     */
    public java.util.List<Exexutors> getExexutors() {
        return this.exexutors;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Exexutors> exexutors; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobExecutorsResponseBody model) {
            this.exexutors = model.exexutors;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * exexutors.
         */
        public Builder exexutors(java.util.List<Exexutors> exexutors) {
            this.exexutors = exexutors;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobExecutorsResponseBody build() {
            return new ListJobExecutorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutorsResponseBody</p>
     */
    public static class Exexutors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeTasks")
        private Long activeTasks;

        @com.aliyun.core.annotation.NameInMap("addTime")
        private Long addTime;

        @com.aliyun.core.annotation.NameInMap("completedTasks")
        private Long completedTasks;

        @com.aliyun.core.annotation.NameInMap("diskUsed")
        private Long diskUsed;

        @com.aliyun.core.annotation.NameInMap("executorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("executorType")
        private String executorType;

        @com.aliyun.core.annotation.NameInMap("failedTasks")
        private Long failedTasks;

        @com.aliyun.core.annotation.NameInMap("hostPort")
        private String hostPort;

        @com.aliyun.core.annotation.NameInMap("jobRunId")
        private String jobRunId;

        @com.aliyun.core.annotation.NameInMap("maxMemory")
        private Long maxMemory;

        @com.aliyun.core.annotation.NameInMap("memoryUsed")
        private Long memoryUsed;

        @com.aliyun.core.annotation.NameInMap("rddBlocks")
        private Long rddBlocks;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalCores")
        private Long totalCores;

        @com.aliyun.core.annotation.NameInMap("totalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("totalGCTime")
        private Long totalGCTime;

        @com.aliyun.core.annotation.NameInMap("totalInputBytes")
        private Long totalInputBytes;

        @com.aliyun.core.annotation.NameInMap("totalShuffleRead")
        private Long totalShuffleRead;

        @com.aliyun.core.annotation.NameInMap("totalShuffleWrite")
        private Long totalShuffleWrite;

        @com.aliyun.core.annotation.NameInMap("totalTasks")
        private Long totalTasks;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Exexutors(Builder builder) {
            this.activeTasks = builder.activeTasks;
            this.addTime = builder.addTime;
            this.completedTasks = builder.completedTasks;
            this.diskUsed = builder.diskUsed;
            this.executorId = builder.executorId;
            this.executorType = builder.executorType;
            this.failedTasks = builder.failedTasks;
            this.hostPort = builder.hostPort;
            this.jobRunId = builder.jobRunId;
            this.maxMemory = builder.maxMemory;
            this.memoryUsed = builder.memoryUsed;
            this.rddBlocks = builder.rddBlocks;
            this.status = builder.status;
            this.totalCores = builder.totalCores;
            this.totalDuration = builder.totalDuration;
            this.totalGCTime = builder.totalGCTime;
            this.totalInputBytes = builder.totalInputBytes;
            this.totalShuffleRead = builder.totalShuffleRead;
            this.totalShuffleWrite = builder.totalShuffleWrite;
            this.totalTasks = builder.totalTasks;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exexutors create() {
            return builder().build();
        }

        /**
         * @return activeTasks
         */
        public Long getActiveTasks() {
            return this.activeTasks;
        }

        /**
         * @return addTime
         */
        public Long getAddTime() {
            return this.addTime;
        }

        /**
         * @return completedTasks
         */
        public Long getCompletedTasks() {
            return this.completedTasks;
        }

        /**
         * @return diskUsed
         */
        public Long getDiskUsed() {
            return this.diskUsed;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return executorType
         */
        public String getExecutorType() {
            return this.executorType;
        }

        /**
         * @return failedTasks
         */
        public Long getFailedTasks() {
            return this.failedTasks;
        }

        /**
         * @return hostPort
         */
        public String getHostPort() {
            return this.hostPort;
        }

        /**
         * @return jobRunId
         */
        public String getJobRunId() {
            return this.jobRunId;
        }

        /**
         * @return maxMemory
         */
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        /**
         * @return memoryUsed
         */
        public Long getMemoryUsed() {
            return this.memoryUsed;
        }

        /**
         * @return rddBlocks
         */
        public Long getRddBlocks() {
            return this.rddBlocks;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCores
         */
        public Long getTotalCores() {
            return this.totalCores;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return totalGCTime
         */
        public Long getTotalGCTime() {
            return this.totalGCTime;
        }

        /**
         * @return totalInputBytes
         */
        public Long getTotalInputBytes() {
            return this.totalInputBytes;
        }

        /**
         * @return totalShuffleRead
         */
        public Long getTotalShuffleRead() {
            return this.totalShuffleRead;
        }

        /**
         * @return totalShuffleWrite
         */
        public Long getTotalShuffleWrite() {
            return this.totalShuffleWrite;
        }

        /**
         * @return totalTasks
         */
        public Long getTotalTasks() {
            return this.totalTasks;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long activeTasks; 
            private Long addTime; 
            private Long completedTasks; 
            private Long diskUsed; 
            private String executorId; 
            private String executorType; 
            private Long failedTasks; 
            private String hostPort; 
            private String jobRunId; 
            private Long maxMemory; 
            private Long memoryUsed; 
            private Long rddBlocks; 
            private String status; 
            private Long totalCores; 
            private Long totalDuration; 
            private Long totalGCTime; 
            private Long totalInputBytes; 
            private Long totalShuffleRead; 
            private Long totalShuffleWrite; 
            private Long totalTasks; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Exexutors model) {
                this.activeTasks = model.activeTasks;
                this.addTime = model.addTime;
                this.completedTasks = model.completedTasks;
                this.diskUsed = model.diskUsed;
                this.executorId = model.executorId;
                this.executorType = model.executorType;
                this.failedTasks = model.failedTasks;
                this.hostPort = model.hostPort;
                this.jobRunId = model.jobRunId;
                this.maxMemory = model.maxMemory;
                this.memoryUsed = model.memoryUsed;
                this.rddBlocks = model.rddBlocks;
                this.status = model.status;
                this.totalCores = model.totalCores;
                this.totalDuration = model.totalDuration;
                this.totalGCTime = model.totalGCTime;
                this.totalInputBytes = model.totalInputBytes;
                this.totalShuffleRead = model.totalShuffleRead;
                this.totalShuffleWrite = model.totalShuffleWrite;
                this.totalTasks = model.totalTasks;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * activeTasks.
             */
            public Builder activeTasks(Long activeTasks) {
                this.activeTasks = activeTasks;
                return this;
            }

            /**
             * addTime.
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * completedTasks.
             */
            public Builder completedTasks(Long completedTasks) {
                this.completedTasks = completedTasks;
                return this;
            }

            /**
             * diskUsed.
             */
            public Builder diskUsed(Long diskUsed) {
                this.diskUsed = diskUsed;
                return this;
            }

            /**
             * executorId.
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * executorType.
             */
            public Builder executorType(String executorType) {
                this.executorType = executorType;
                return this;
            }

            /**
             * failedTasks.
             */
            public Builder failedTasks(Long failedTasks) {
                this.failedTasks = failedTasks;
                return this;
            }

            /**
             * hostPort.
             */
            public Builder hostPort(String hostPort) {
                this.hostPort = hostPort;
                return this;
            }

            /**
             * jobRunId.
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * maxMemory.
             */
            public Builder maxMemory(Long maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * memoryUsed.
             */
            public Builder memoryUsed(Long memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * rddBlocks.
             */
            public Builder rddBlocks(Long rddBlocks) {
                this.rddBlocks = rddBlocks;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * totalCores.
             */
            public Builder totalCores(Long totalCores) {
                this.totalCores = totalCores;
                return this;
            }

            /**
             * totalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * totalGCTime.
             */
            public Builder totalGCTime(Long totalGCTime) {
                this.totalGCTime = totalGCTime;
                return this;
            }

            /**
             * totalInputBytes.
             */
            public Builder totalInputBytes(Long totalInputBytes) {
                this.totalInputBytes = totalInputBytes;
                return this;
            }

            /**
             * totalShuffleRead.
             */
            public Builder totalShuffleRead(Long totalShuffleRead) {
                this.totalShuffleRead = totalShuffleRead;
                return this;
            }

            /**
             * totalShuffleWrite.
             */
            public Builder totalShuffleWrite(Long totalShuffleWrite) {
                this.totalShuffleWrite = totalShuffleWrite;
                return this;
            }

            /**
             * totalTasks.
             */
            public Builder totalTasks(Long totalTasks) {
                this.totalTasks = totalTasks;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Exexutors build() {
                return new Exexutors(this);
            } 

        } 

    }
}
