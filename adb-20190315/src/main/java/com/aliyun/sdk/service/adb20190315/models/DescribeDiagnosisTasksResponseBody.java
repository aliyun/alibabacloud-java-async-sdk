// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDiagnosisTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisTasksResponseBody</p>
 */
public class DescribeDiagnosisTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List<TaskList> taskList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return taskList
     */
    public java.util.List<TaskList> getTaskList() {
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
        private java.util.List<TaskList> taskList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosisTasksResponseBody model) {
            this.requestId = model.requestId;
            this.taskList = model.taskList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0983B43-B2EC-536A-8791-142B5CF1E9B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried tasks.</p>
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * <p>The total number of tasks in the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnosisTasksResponseBody build() {
            return new DescribeDiagnosisTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosisTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosisTasksResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeTimeRatio")
        private String computeTimeRatio;

        @com.aliyun.core.annotation.NameInMap("Drivers")
        private String drivers;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("InputDataSize")
        private Long inputDataSize;

        @com.aliyun.core.annotation.NameInMap("InputRows")
        private Long inputRows;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("OutputDataSize")
        private Long outputDataSize;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("QueuedTime")
        private String queuedTime;

        @com.aliyun.core.annotation.NameInMap("ScanCost")
        private Long scanCost;

        @com.aliyun.core.annotation.NameInMap("ScanDataSize")
        private Long scanDataSize;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskCreateTime")
        private Long taskCreateTime;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private Long taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskHost")
        private String taskHost;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.computeTimeRatio = model.computeTimeRatio;
                this.drivers = model.drivers;
                this.elapsedTime = model.elapsedTime;
                this.inputDataSize = model.inputDataSize;
                this.inputRows = model.inputRows;
                this.operatorCost = model.operatorCost;
                this.outputDataSize = model.outputDataSize;
                this.outputRows = model.outputRows;
                this.peakMemory = model.peakMemory;
                this.queuedTime = model.queuedTime;
                this.scanCost = model.scanCost;
                this.scanDataSize = model.scanDataSize;
                this.scanRows = model.scanRows;
                this.state = model.state;
                this.taskCreateTime = model.taskCreateTime;
                this.taskEndTime = model.taskEndTime;
                this.taskHost = model.taskHost;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The compute time ratio, which can be used to determine whether the task is really time-consuming. This parameter can be calculated by using the following formula: OperatorCost/Drivers/ElapsedTime. A greater value indicates that the task was executed for computing for most of the task time. A less value indicates that the task was waiting for scheduling or blocked due to other reasons for most of the task time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.89</p>
             */
            public Builder computeTimeRatio(String computeTimeRatio) {
                this.computeTimeRatio = computeTimeRatio;
                return this;
            }

            /**
             * <p>The number of tasks that can be executed concurrently.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder drivers(String drivers) {
                this.drivers = drivers;
                return this;
            }

            /**
             * <p>The amount of time that elapsed from when the task was created to when the task was completed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The amount of input data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputDataSize(Long inputDataSize) {
                this.inputDataSize = inputDataSize;
                return this;
            }

            /**
             * <p>The number of input rows in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>105</p>
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * <p>The total amount of time that is consumed by all operators in the task on a node. This parameter can be used to determine whether long tails occur in computing. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The amount of output data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * <p>The number of output rows in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>105</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The peak memory of the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The queuing duration of the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder queuedTime(String queuedTime) {
                this.queuedTime = queuedTime;
                return this;
            }

            /**
             * <p>The amount of time that is consumed to scan data from a data source in the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanCost(Long scanCost) {
                this.scanCost = scanCost;
                return this;
            }

            /**
             * <p>The amount of scanned data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder scanDataSize(Long scanDataSize) {
                this.scanDataSize = scanDataSize;
                return this;
            }

            /**
             * <p>The number of rows that are scanned from a data source in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The final execution state of the task. Valid values:</p>
             * <ul>
             * <li>FINISHED</li>
             * <li>CANCELED</li>
             * <li>ABORTED</li>
             * <li>FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The timestamp when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-12 00:00:12</p>
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * <p>The timestamp when the task ends.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-22 00:00:00</p>
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * <p>The IP address of the host where the task was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder taskHost(String taskHost) {
                this.taskHost = taskHost;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22568****</p>
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
