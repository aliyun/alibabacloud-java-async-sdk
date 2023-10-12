// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksHistoriesResponseBody</p>
 */
public class ListTasksHistoriesResponseBody extends TeaModel {
    @NameInMap("InspectionTasks")
    private java.util.List < InspectionTasks> inspectionTasks;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTasksHistoriesResponseBody(Builder builder) {
        this.inspectionTasks = builder.inspectionTasks;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionTasks
     */
    public java.util.List < InspectionTasks> getInspectionTasks() {
        return this.inspectionTasks;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
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
        private java.util.List < InspectionTasks> inspectionTasks; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InspectionTasks.
         */
        public Builder inspectionTasks(java.util.List < InspectionTasks> inspectionTasks) {
            this.inspectionTasks = inspectionTasks;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksHistoriesResponseBody build() {
            return new ListTasksHistoriesResponseBody(this);
        } 

    } 

    public static class InspectionAlarmRules extends TeaModel {
        @NameInMap("ActualValue")
        private String actualValue;

        @NameInMap("AlarmExpression")
        private String alarmExpression;

        @NameInMap("AlarmLevel")
        private String alarmLevel;

        @NameInMap("AlarmOperator")
        private String alarmOperator;

        @NameInMap("AlarmValue")
        private String alarmValue;

        private InspectionAlarmRules(Builder builder) {
            this.actualValue = builder.actualValue;
            this.alarmExpression = builder.alarmExpression;
            this.alarmLevel = builder.alarmLevel;
            this.alarmOperator = builder.alarmOperator;
            this.alarmValue = builder.alarmValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionAlarmRules create() {
            return builder().build();
        }

        /**
         * @return actualValue
         */
        public String getActualValue() {
            return this.actualValue;
        }

        /**
         * @return alarmExpression
         */
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        /**
         * @return alarmLevel
         */
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        /**
         * @return alarmOperator
         */
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        /**
         * @return alarmValue
         */
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public static final class Builder {
            private String actualValue; 
            private String alarmExpression; 
            private String alarmLevel; 
            private String alarmOperator; 
            private String alarmValue; 

            /**
             * ActualValue.
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * AlarmExpression.
             */
            public Builder alarmExpression(String alarmExpression) {
                this.alarmExpression = alarmExpression;
                return this;
            }

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
                return this;
            }

            /**
             * AlarmOperator.
             */
            public Builder alarmOperator(String alarmOperator) {
                this.alarmOperator = alarmOperator;
                return this;
            }

            /**
             * AlarmValue.
             */
            public Builder alarmValue(String alarmValue) {
                this.alarmValue = alarmValue;
                return this;
            }

            public InspectionAlarmRules build() {
                return new InspectionAlarmRules(this);
            } 

        } 

    }
    public static class InspectionTasks extends TeaModel {
        @NameInMap("DeviceDisplay")
        private String deviceDisplay;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ExecutionBeginTime")
        private String executionBeginTime;

        @NameInMap("ExecutionEndTime")
        private String executionEndTime;

        @NameInMap("InspectionAlarmRules")
        private java.util.List < InspectionAlarmRules> inspectionAlarmRules;

        @NameInMap("InspectionResult")
        private String inspectionResult;

        @NameInMap("TaskId")
        private String taskId;

        private InspectionTasks(Builder builder) {
            this.deviceDisplay = builder.deviceDisplay;
            this.errorCode = builder.errorCode;
            this.executionBeginTime = builder.executionBeginTime;
            this.executionEndTime = builder.executionEndTime;
            this.inspectionAlarmRules = builder.inspectionAlarmRules;
            this.inspectionResult = builder.inspectionResult;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTasks create() {
            return builder().build();
        }

        /**
         * @return deviceDisplay
         */
        public String getDeviceDisplay() {
            return this.deviceDisplay;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return executionBeginTime
         */
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        /**
         * @return executionEndTime
         */
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        /**
         * @return inspectionAlarmRules
         */
        public java.util.List < InspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        /**
         * @return inspectionResult
         */
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String deviceDisplay; 
            private String errorCode; 
            private String executionBeginTime; 
            private String executionEndTime; 
            private java.util.List < InspectionAlarmRules> inspectionAlarmRules; 
            private String inspectionResult; 
            private String taskId; 

            /**
             * DeviceDisplay.
             */
            public Builder deviceDisplay(String deviceDisplay) {
                this.deviceDisplay = deviceDisplay;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ExecutionBeginTime.
             */
            public Builder executionBeginTime(String executionBeginTime) {
                this.executionBeginTime = executionBeginTime;
                return this;
            }

            /**
             * ExecutionEndTime.
             */
            public Builder executionEndTime(String executionEndTime) {
                this.executionEndTime = executionEndTime;
                return this;
            }

            /**
             * InspectionAlarmRules.
             */
            public Builder inspectionAlarmRules(java.util.List < InspectionAlarmRules> inspectionAlarmRules) {
                this.inspectionAlarmRules = inspectionAlarmRules;
                return this;
            }

            /**
             * InspectionResult.
             */
            public Builder inspectionResult(String inspectionResult) {
                this.inspectionResult = inspectionResult;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public InspectionTasks build() {
                return new InspectionTasks(this);
            } 

        } 

    }
}
