// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectionTask} extends {@link TeaModel}
 *
 * <p>InspectionTask</p>
 */
public class InspectionTask extends TeaModel {
    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ExecutionBeginTime")
    private String executionBeginTime;

    @NameInMap("ExecutionEndTime")
    private String executionEndTime;

    @NameInMap("Hostname")
    private String hostname;

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
    private String model;

    @NameInMap("Role")
    private String role;

    @NameInMap("Space")
    private String space;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("Vendor")
    private String vendor;

    private InspectionTask(Builder builder) {
        this.deviceId = builder.deviceId;
        this.errorCode = builder.errorCode;
        this.executionBeginTime = builder.executionBeginTime;
        this.executionEndTime = builder.executionEndTime;
        this.hostname = builder.hostname;
        this.ip = builder.ip;
        this.inspectionAlarmRules = builder.inspectionAlarmRules;
        this.inspectionResult = builder.inspectionResult;
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.model = builder.model;
        this.role = builder.role;
        this.space = builder.space;
        this.taskStatus = builder.taskStatus;
        this.templateId = builder.templateId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectionTask create() {
        return builder().build();
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
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
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
    public String getModel() {
        return this.model;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String deviceId; 
        private String errorCode; 
        private String executionBeginTime; 
        private String executionEndTime; 
        private String hostname; 
        private String ip; 
        private java.util.List < InspectionAlarmRules> inspectionAlarmRules; 
        private String inspectionResult; 
        private String itemId; 
        private String itemName; 
        private String model; 
        private String role; 
        private String space; 
        private String taskStatus; 
        private String templateId; 
        private String vendor; 

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
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
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
        public Builder model(String model) {
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
         * Space.
         */
        public Builder space(String space) {
            this.space = space;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
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
}
