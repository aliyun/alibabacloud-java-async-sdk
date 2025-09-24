// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobExecutionProgressResponseBody</p>
 */
public class GetJobExecutionProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetJobExecutionProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobExecutionProgressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetJobExecutionProgressResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJobExecutionProgressResponseBody build() {
            return new GetJobExecutionProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class RootProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Finished")
        private Long finished;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private RootProgress(Builder builder) {
            this.finished = builder.finished;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootProgress create() {
            return builder().build();
        }

        /**
         * @return finished
         */
        public Long getFinished() {
            return this.finished;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long finished; 
            private Long total; 

            private Builder() {
            } 

            private Builder(RootProgress model) {
                this.finished = model.finished;
                this.total = model.total;
            } 

            /**
             * Finished.
             */
            public Builder finished(Long finished) {
                this.finished = finished;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public RootProgress build() {
                return new RootProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class StatusType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private java.util.Map<String, String> tips;

        private StatusType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tips
         */
        public java.util.Map<String, String> getTips() {
            return this.tips;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.Map<String, String> tips; 

            private Builder() {
            } 

            private Builder(StatusType model) {
                this.code = model.code;
                this.name = model.name;
                this.tips = model.tips;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder tips(java.util.Map<String, String> tips) {
                this.tips = tips;
                return this;
            }

            public StatusType build() {
                return new StatusType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class ShardingProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JobExecutionId")
        private String jobExecutionId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusType")
        private StatusType statusType;

        @com.aliyun.core.annotation.NameInMap("WorkerAddr")
        private String workerAddr;

        private ShardingProgress(Builder builder) {
            this.id = builder.id;
            this.jobExecutionId = builder.jobExecutionId;
            this.result = builder.result;
            this.status = builder.status;
            this.statusType = builder.statusType;
            this.workerAddr = builder.workerAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardingProgress create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobExecutionId
         */
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusType
         */
        public StatusType getStatusType() {
            return this.statusType;
        }

        /**
         * @return workerAddr
         */
        public String getWorkerAddr() {
            return this.workerAddr;
        }

        public static final class Builder {
            private Long id; 
            private String jobExecutionId; 
            private String result; 
            private Integer status; 
            private StatusType statusType; 
            private String workerAddr; 

            private Builder() {
            } 

            private Builder(ShardingProgress model) {
                this.id = model.id;
                this.jobExecutionId = model.jobExecutionId;
                this.result = model.result;
                this.status = model.status;
                this.statusType = model.statusType;
                this.workerAddr = model.workerAddr;
            } 

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * JobExecutionId.
             */
            public Builder jobExecutionId(String jobExecutionId) {
                this.jobExecutionId = jobExecutionId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StatusType.
             */
            public Builder statusType(StatusType statusType) {
                this.statusType = statusType;
                return this;
            }

            /**
             * WorkerAddr.
             */
            public Builder workerAddr(String workerAddr) {
                this.workerAddr = workerAddr;
                return this;
            }

            public ShardingProgress build() {
                return new ShardingProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class TaskProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pulled")
        private Integer pulled;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private Integer queue;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Integer running;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Integer success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private TaskProgress(Builder builder) {
            this.failed = builder.failed;
            this.name = builder.name;
            this.pulled = builder.pulled;
            this.queue = builder.queue;
            this.running = builder.running;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskProgress create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pulled
         */
        public Integer getPulled() {
            return this.pulled;
        }

        /**
         * @return queue
         */
        public Integer getQueue() {
            return this.queue;
        }

        /**
         * @return running
         */
        public Integer getRunning() {
            return this.running;
        }

        /**
         * @return success
         */
        public Integer getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer failed; 
            private String name; 
            private Integer pulled; 
            private Integer queue; 
            private Integer running; 
            private Integer success; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(TaskProgress model) {
                this.failed = model.failed;
                this.name = model.name;
                this.pulled = model.pulled;
                this.queue = model.queue;
                this.running = model.running;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pulled.
             */
            public Builder pulled(Integer pulled) {
                this.pulled = pulled;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(Integer queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Running.
             */
            public Builder running(Integer running) {
                this.running = running;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public TaskProgress build() {
                return new TaskProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class TotalProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Finished")
        private Long finished;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private TotalProgress(Builder builder) {
            this.finished = builder.finished;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalProgress create() {
            return builder().build();
        }

        /**
         * @return finished
         */
        public Long getFinished() {
            return this.finished;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long finished; 
            private Long total; 

            private Builder() {
            } 

            private Builder(TotalProgress model) {
                this.finished = model.finished;
                this.total = model.total;
            } 

            /**
             * Finished.
             */
            public Builder finished(Long finished) {
                this.finished = finished;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public TotalProgress build() {
                return new TotalProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class WorkerProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("Pulled")
        private Integer pulled;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private Integer queue;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Integer running;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Integer success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("WorkerAddr")
        private String workerAddr;

        private WorkerProgress(Builder builder) {
            this.failed = builder.failed;
            this.pulled = builder.pulled;
            this.queue = builder.queue;
            this.running = builder.running;
            this.success = builder.success;
            this.total = builder.total;
            this.traceId = builder.traceId;
            this.workerAddr = builder.workerAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerProgress create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return pulled
         */
        public Integer getPulled() {
            return this.pulled;
        }

        /**
         * @return queue
         */
        public Integer getQueue() {
            return this.queue;
        }

        /**
         * @return running
         */
        public Integer getRunning() {
            return this.running;
        }

        /**
         * @return success
         */
        public Integer getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return workerAddr
         */
        public String getWorkerAddr() {
            return this.workerAddr;
        }

        public static final class Builder {
            private Integer failed; 
            private Integer pulled; 
            private Integer queue; 
            private Integer running; 
            private Integer success; 
            private Integer total; 
            private String traceId; 
            private String workerAddr; 

            private Builder() {
            } 

            private Builder(WorkerProgress model) {
                this.failed = model.failed;
                this.pulled = model.pulled;
                this.queue = model.queue;
                this.running = model.running;
                this.success = model.success;
                this.total = model.total;
                this.traceId = model.traceId;
                this.workerAddr = model.workerAddr;
            } 

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Pulled.
             */
            public Builder pulled(Integer pulled) {
                this.pulled = pulled;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(Integer queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Running.
             */
            public Builder running(Integer running) {
                this.running = running;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * WorkerAddr.
             */
            public Builder workerAddr(String workerAddr) {
                this.workerAddr = workerAddr;
                return this;
            }

            public WorkerProgress build() {
                return new WorkerProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobExecutionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobExecutionProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobDescription")
        private String jobDescription;

        @com.aliyun.core.annotation.NameInMap("RootProgress")
        private RootProgress rootProgress;

        @com.aliyun.core.annotation.NameInMap("ShardingProgress")
        private java.util.List<ShardingProgress> shardingProgress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskProgress")
        private java.util.List<TaskProgress> taskProgress;

        @com.aliyun.core.annotation.NameInMap("TotalProgress")
        private TotalProgress totalProgress;

        @com.aliyun.core.annotation.NameInMap("WorkerProgress")
        private java.util.List<WorkerProgress> workerProgress;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.jobDescription = builder.jobDescription;
            this.rootProgress = builder.rootProgress;
            this.shardingProgress = builder.shardingProgress;
            this.startTime = builder.startTime;
            this.taskProgress = builder.taskProgress;
            this.totalProgress = builder.totalProgress;
            this.workerProgress = builder.workerProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobDescription
         */
        public String getJobDescription() {
            return this.jobDescription;
        }

        /**
         * @return rootProgress
         */
        public RootProgress getRootProgress() {
            return this.rootProgress;
        }

        /**
         * @return shardingProgress
         */
        public java.util.List<ShardingProgress> getShardingProgress() {
            return this.shardingProgress;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskProgress
         */
        public java.util.List<TaskProgress> getTaskProgress() {
            return this.taskProgress;
        }

        /**
         * @return totalProgress
         */
        public TotalProgress getTotalProgress() {
            return this.totalProgress;
        }

        /**
         * @return workerProgress
         */
        public java.util.List<WorkerProgress> getWorkerProgress() {
            return this.workerProgress;
        }

        public static final class Builder {
            private String endTime; 
            private String jobDescription; 
            private RootProgress rootProgress; 
            private java.util.List<ShardingProgress> shardingProgress; 
            private String startTime; 
            private java.util.List<TaskProgress> taskProgress; 
            private TotalProgress totalProgress; 
            private java.util.List<WorkerProgress> workerProgress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.jobDescription = model.jobDescription;
                this.rootProgress = model.rootProgress;
                this.shardingProgress = model.shardingProgress;
                this.startTime = model.startTime;
                this.taskProgress = model.taskProgress;
                this.totalProgress = model.totalProgress;
                this.workerProgress = model.workerProgress;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * JobDescription.
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * RootProgress.
             */
            public Builder rootProgress(RootProgress rootProgress) {
                this.rootProgress = rootProgress;
                return this;
            }

            /**
             * ShardingProgress.
             */
            public Builder shardingProgress(java.util.List<ShardingProgress> shardingProgress) {
                this.shardingProgress = shardingProgress;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskProgress.
             */
            public Builder taskProgress(java.util.List<TaskProgress> taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * TotalProgress.
             */
            public Builder totalProgress(TotalProgress totalProgress) {
                this.totalProgress = totalProgress;
                return this;
            }

            /**
             * WorkerProgress.
             */
            public Builder workerProgress(java.util.List<WorkerProgress> workerProgress) {
                this.workerProgress = workerProgress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
