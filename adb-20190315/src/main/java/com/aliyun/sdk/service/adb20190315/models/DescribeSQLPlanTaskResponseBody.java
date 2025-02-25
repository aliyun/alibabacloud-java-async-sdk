// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSQLPlanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlanTaskResponseBody</p>
 */
public class DescribeSQLPlanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List < TaskList> taskList;

    private DescribeSQLPlanTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPlanTaskResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private java.util.List < TaskList> taskList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of tasks.</p>
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        public DescribeSQLPlanTaskResponseBody build() {
            return new DescribeSQLPlanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLPlanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLPlanTaskResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("InputRows")
        private Long inputRows;

        @com.aliyun.core.annotation.NameInMap("InputSize")
        private Long inputSize;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("OutputSize")
        private Long outputSize;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ScanCost")
        private Long scanCost;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("ScanSize")
        private Long scanSize;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private TaskList(Builder builder) {
            this.elapsedTime = builder.elapsedTime;
            this.inputRows = builder.inputRows;
            this.inputSize = builder.inputSize;
            this.operatorCost = builder.operatorCost;
            this.outputRows = builder.outputRows;
            this.outputSize = builder.outputSize;
            this.peakMemory = builder.peakMemory;
            this.scanCost = builder.scanCost;
            this.scanRows = builder.scanRows;
            this.scanSize = builder.scanSize;
            this.state = builder.state;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return inputRows
         */
        public Long getInputRows() {
            return this.inputRows;
        }

        /**
         * @return inputSize
         */
        public Long getInputSize() {
            return this.inputSize;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return outputSize
         */
        public Long getOutputSize() {
            return this.outputSize;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return scanCost
         */
        public Long getScanCost() {
            return this.scanCost;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scanSize
         */
        public Long getScanSize() {
            return this.scanSize;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long elapsedTime; 
            private Long inputRows; 
            private Long inputSize; 
            private Long operatorCost; 
            private Long outputRows; 
            private Long outputSize; 
            private Long peakMemory; 
            private Long scanCost; 
            private Long scanRows; 
            private Long scanSize; 
            private String state; 
            private Integer taskId; 

            /**
             * <p>The time elapsed from when the task was created to when the task was complete. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
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
             * <p>The amount of input data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3763</p>
             */
            public Builder inputSize(Long inputSize) {
                this.inputSize = inputSize;
                return this;
            }

            /**
             * <p>The total amount of time consumed by operators in the task on a specific node. This parameter can be used to determine whether long tails occur in computing. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
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
             * <p>The amount of output data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>945</p>
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * <p>The peak memory of the task on a specific node. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>898576</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The time consumed to scan data from a data source in the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanCost(Long scanCost) {
                this.scanCost = scanCost;
                return this;
            }

            /**
             * <p>The number of rows scanned from a data source in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The amount of data scanned from a data source in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * <p>The final execution status of the task. Valid values:</p>
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
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>198877623</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
