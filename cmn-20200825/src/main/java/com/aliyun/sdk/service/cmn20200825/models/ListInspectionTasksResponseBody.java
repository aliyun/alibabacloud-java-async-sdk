// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListInspectionTasksResponseBody</p>
 */
public class ListInspectionTasksResponseBody extends TeaModel {
    @NameInMap("InspectionTasks")
    private java.util.List < InspectionTasks> inspectionTasks;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListInspectionTasksResponseBody(Builder builder) {
        this.inspectionTasks = builder.inspectionTasks;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionTasksResponseBody create() {
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

        public ListInspectionTasksResponseBody build() {
            return new ListInspectionTasksResponseBody(this);
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
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceType")
        private String deviceType;

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

        @NameInMap("InspectionMessage")
        private String inspectionMessage;

        @NameInMap("InspectionResult")
        private String inspectionResult;

        @NameInMap("IsInspectionResultTruncation")
        private Boolean isInspectionResultTruncation;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("Model")
        private java.util.List < String > model;

        @NameInMap("Role")
        private String role;

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

        private InspectionTasks(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.deviceId = builder.deviceId;
            this.deviceType = builder.deviceType;
            this.errorCode = builder.errorCode;
            this.executionBeginTime = builder.executionBeginTime;
            this.executionEndTime = builder.executionEndTime;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.inspectionAlarmRules = builder.inspectionAlarmRules;
            this.inspectionMessage = builder.inspectionMessage;
            this.inspectionResult = builder.inspectionResult;
            this.isInspectionResultTruncation = builder.isInspectionResultTruncation;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.model = builder.model;
            this.role = builder.role;
            this.scriptId = builder.scriptId;
            this.space = builder.space;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTasks create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
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
         * @return inspectionMessage
         */
        public String getInspectionMessage() {
            return this.inspectionMessage;
        }

        /**
         * @return inspectionResult
         */
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        /**
         * @return isInspectionResultTruncation
         */
        public Boolean getIsInspectionResultTruncation() {
            return this.isInspectionResultTruncation;
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
         * @return role
         */
        public String getRole() {
            return this.role;
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
            private String alarmStatus; 
            private String deviceId; 
            private String deviceType; 
            private String errorCode; 
            private String executionBeginTime; 
            private String executionEndTime; 
            private String hostName; 
            private String ip; 
            private java.util.List < InspectionAlarmRules> inspectionAlarmRules; 
            private String inspectionMessage; 
            private String inspectionResult; 
            private Boolean isInspectionResultTruncation; 
            private String itemId; 
            private String itemName; 
            private java.util.List < String > model; 
            private String role; 
            private String scriptId; 
            private String space; 
            private String taskId; 
            private String taskStatus; 
            private String vendor; 

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
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
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
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
             * InspectionMessage.
             */
            public Builder inspectionMessage(String inspectionMessage) {
                this.inspectionMessage = inspectionMessage;
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
             * IsInspectionResultTruncation.
             */
            public Builder isInspectionResultTruncation(Boolean isInspectionResultTruncation) {
                this.isInspectionResultTruncation = isInspectionResultTruncation;
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
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
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

            public InspectionTasks build() {
                return new InspectionTasks(this);
            } 

        } 

    }
}
