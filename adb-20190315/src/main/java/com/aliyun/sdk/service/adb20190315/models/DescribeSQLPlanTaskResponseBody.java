// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPlanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlanTaskResponseBody</p>
 */
public class DescribeSQLPlanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskList.
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        public DescribeSQLPlanTaskResponseBody build() {
            return new DescribeSQLPlanTaskResponseBody(this);
        } 

    } 

    public static class TaskList extends TeaModel {
        @NameInMap("ElapsedTime")
        private Long elapsedTime;

        @NameInMap("InputRows")
        private Long inputRows;

        @NameInMap("InputSize")
        private Long inputSize;

        @NameInMap("OperatorCost")
        private Long operatorCost;

        @NameInMap("OutputRows")
        private Long outputRows;

        @NameInMap("OutputSize")
        private Long outputSize;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("ScanCost")
        private Long scanCost;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("ScanSize")
        private Long scanSize;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
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
             * ElapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * InputRows.
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * InputSize.
             */
            public Builder inputSize(Long inputSize) {
                this.inputSize = inputSize;
                return this;
            }

            /**
             * OperatorCost.
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * OutputRows.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * OutputSize.
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * PeakMemory.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * ScanCost.
             */
            public Builder scanCost(Long scanCost) {
                this.scanCost = scanCost;
                return this;
            }

            /**
             * ScanRows.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * ScanSize.
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TaskId.
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
