// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInspectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetInspectionTaskResponseBody</p>
 */
public class GetInspectionTaskResponseBody extends TeaModel {
    @NameInMap("InspectionTask")
    private InspectionTask inspectionTask;

    @NameInMap("RequestId")
    private String requestId;

    private GetInspectionTaskResponseBody(Builder builder) {
        this.inspectionTask = builder.inspectionTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionTask
     */
    public InspectionTask getInspectionTask() {
        return this.inspectionTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InspectionTask inspectionTask; 
        private String requestId; 

        /**
         * InspectionTask.
         */
        public Builder inspectionTask(InspectionTask inspectionTask) {
            this.inspectionTask = inspectionTask;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInspectionTaskResponseBody build() {
            return new GetInspectionTaskResponseBody(this);
        } 

    } 

    public static class InspectionAlarmRules extends TeaModel {
        @NameInMap("ActualValue")
        private String actualValue;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("Level")
        private String level;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private InspectionAlarmRules(Builder builder) {
            this.actualValue = builder.actualValue;
            this.expression = builder.expression;
            this.level = builder.level;
            this.operator = builder.operator;
            this.value = builder.value;
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
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String actualValue; 
            private String expression; 
            private String level; 
            private String operator; 
            private String value; 

            /**
             * ActualValue.
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InspectionAlarmRules build() {
                return new InspectionAlarmRules(this);
            } 

        } 

    }
    public static class InspectionTask extends TeaModel {
        @NameInMap("DeviceDisplay")
        private String deviceDisplay;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ExecutionBeginTime")
        private String executionBeginTime;

        @NameInMap("ExecutionEndTime")
        private String executionEndTime;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InspectionAlarmRules")
        private java.util.List < InspectionAlarmRules> inspectionAlarmRules;

        @NameInMap("InspectionResult")
        private String inspectionResult;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("Model")
        private java.util.List < String > model;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("Space")
        private String space;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("Vendor")
        private String vendor;

        private InspectionTask(Builder builder) {
            this.deviceDisplay = builder.deviceDisplay;
            this.deviceId = builder.deviceId;
            this.errorCode = builder.errorCode;
            this.executionBeginTime = builder.executionBeginTime;
            this.executionEndTime = builder.executionEndTime;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.inspectionAlarmRules = builder.inspectionAlarmRules;
            this.inspectionResult = builder.inspectionResult;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.model = builder.model;
            this.scriptId = builder.scriptId;
            this.space = builder.space;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTask create() {
            return builder().build();
        }

        /**
         * @return deviceDisplay
         */
        public String getDeviceDisplay() {
            return this.deviceDisplay;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
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
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return model
         */
        public java.util.List < String > getModel() {
            return this.model;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return space
         */
        public String getSpace() {
            return this.space;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String deviceDisplay; 
            private String deviceId; 
            private String errorCode; 
            private String executionBeginTime; 
            private String executionEndTime; 
            private String hostName; 
            private String ip; 
            private java.util.List < InspectionAlarmRules> inspectionAlarmRules; 
            private String inspectionResult; 
            private String itemId; 
            private String itemName; 
            private java.util.List < String > model; 
            private String scriptId; 
            private String space; 
            private String taskId; 
            private String taskStatus; 
            private String vendor; 

            /**
             * DeviceDisplay.
             */
            public Builder deviceDisplay(String deviceDisplay) {
                this.deviceDisplay = deviceDisplay;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(java.util.List < String > model) {
                this.model = model;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * Space.
             */
            public Builder space(String space) {
                this.space = space;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public InspectionTask build() {
                return new InspectionTask(this);
            } 

        } 

    }
}
