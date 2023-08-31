// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisTasksResponseBody</p>
 */
public class DescribeDiagnosisTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskList")
    private java.util.List < TaskList> taskList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnosisTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskList
     */
    public java.util.List < TaskList> getTaskList() {
        return this.taskList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TaskList> taskList; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried tasks.
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * The total number of tasks in the stage.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnosisTasksResponseBody build() {
            return new DescribeDiagnosisTasksResponseBody(this);
        } 

    } 

    public static class TaskList extends TeaModel {
        @NameInMap("ComputeTimeRatio")
        private String computeTimeRatio;

        @NameInMap("Drivers")
        private String drivers;

        @NameInMap("ElapsedTime")
        private Long elapsedTime;

        @NameInMap("InputDataSize")
        private Long inputDataSize;

        @NameInMap("InputRows")
        private Long inputRows;

        @NameInMap("OperatorCost")
        private Long operatorCost;

        @NameInMap("OutputDataSize")
        private Long outputDataSize;

        @NameInMap("OutputRows")
        private Long outputRows;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("QueuedTime")
        private String queuedTime;

        @NameInMap("ScanCost")
        private Long scanCost;

        @NameInMap("ScanDataSize")
        private Long scanDataSize;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskCreateTime")
        private Long taskCreateTime;

        @NameInMap("TaskEndTime")
        private Long taskEndTime;

        @NameInMap("TaskHost")
        private String taskHost;

        @NameInMap("TaskId")
        private String taskId;

        private TaskList(Builder builder) {
            this.computeTimeRatio = builder.computeTimeRatio;
            this.drivers = builder.drivers;
            this.elapsedTime = builder.elapsedTime;
            this.inputDataSize = builder.inputDataSize;
            this.inputRows = builder.inputRows;
            this.operatorCost = builder.operatorCost;
            this.outputDataSize = builder.outputDataSize;
            this.outputRows = builder.outputRows;
            this.peakMemory = builder.peakMemory;
            this.queuedTime = builder.queuedTime;
            this.scanCost = builder.scanCost;
            this.scanDataSize = builder.scanDataSize;
            this.scanRows = builder.scanRows;
            this.state = builder.state;
            this.taskCreateTime = builder.taskCreateTime;
            this.taskEndTime = builder.taskEndTime;
            this.taskHost = builder.taskHost;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return computeTimeRatio
         */
        public String getComputeTimeRatio() {
            return this.computeTimeRatio;
        }

        /**
         * @return drivers
         */
        public String getDrivers() {
            return this.drivers;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return inputDataSize
         */
        public Long getInputDataSize() {
            return this.inputDataSize;
        }

        /**
         * @return inputRows
         */
        public Long getInputRows() {
            return this.inputRows;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return outputDataSize
         */
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return queuedTime
         */
        public String getQueuedTime() {
            return this.queuedTime;
        }

        /**
         * @return scanCost
         */
        public Long getScanCost() {
            return this.scanCost;
        }

        /**
         * @return scanDataSize
         */
        public Long getScanDataSize() {
            return this.scanDataSize;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskCreateTime
         */
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        /**
         * @return taskEndTime
         */
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskHost
         */
        public String getTaskHost() {
            return this.taskHost;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String computeTimeRatio; 
            private String drivers; 
            private Long elapsedTime; 
            private Long inputDataSize; 
            private Long inputRows; 
            private Long operatorCost; 
            private Long outputDataSize; 
            private Long outputRows; 
            private Long peakMemory; 
            private String queuedTime; 
            private Long scanCost; 
            private Long scanDataSize; 
            private Long scanRows; 
            private String state; 
            private Long taskCreateTime; 
            private Long taskEndTime; 
            private String taskHost; 
            private String taskId; 

            /**
             * The compute time ratio, which can be used to determine whether the task is really time-consuming. This parameter can be calculated by using the following formula: OperatorCost/Drivers/ElapsedTime. A greater value indicates that the task was executed for computing for most of the task time. A less value indicates that the task was waiting for scheduling or blocked due to other reasons for most of the task time.
             */
            public Builder computeTimeRatio(String computeTimeRatio) {
                this.computeTimeRatio = computeTimeRatio;
                return this;
            }

            /**
             * The number of tasks that can be executed concurrently.
             */
            public Builder drivers(String drivers) {
                this.drivers = drivers;
                return this;
            }

            /**
             * The amount of time that elapsed from when the task was created to when the task was completed. Unit: milliseconds.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The amount of input data in the task. Unit: bytes.
             */
            public Builder inputDataSize(Long inputDataSize) {
                this.inputDataSize = inputDataSize;
                return this;
            }

            /**
             * The number of input rows in the task.
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * The total amount of time that is consumed by all operators in the task on a node. This parameter can be used to determine whether long tails occur in computing. Unit: milliseconds.
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * The amount of output data in the task. Unit: bytes.
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * The number of output rows in the task.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * The peak memory of the task. Unit: bytes.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The queuing duration of the task. Unit: milliseconds.
             */
            public Builder queuedTime(String queuedTime) {
                this.queuedTime = queuedTime;
                return this;
            }

            /**
             * The amount of time that is consumed to scan data from a data source in the task. Unit: milliseconds.
             */
            public Builder scanCost(Long scanCost) {
                this.scanCost = scanCost;
                return this;
            }

            /**
             * The amount of scanned data in the task. Unit: bytes.
             */
            public Builder scanDataSize(Long scanDataSize) {
                this.scanDataSize = scanDataSize;
                return this;
            }

            /**
             * The number of rows that are scanned from a data source in the task.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * The final execution state of the task. Valid values:
             * <p>
             * 
             * *   FINISHED
             * *   CANCELED
             * *   ABORTED
             * *   FAILED
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The timestamp when the task was created.
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * The timestamp when the task ends.
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * The IP address of the host where the task was executed.
             */
            public Builder taskHost(String taskHost) {
                this.taskHost = taskHost;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
