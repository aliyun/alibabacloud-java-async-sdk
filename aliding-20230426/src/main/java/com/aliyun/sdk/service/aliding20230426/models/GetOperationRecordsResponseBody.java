// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperationRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationRecordsResponseBody</p>
 */
public class GetOperationRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetOperationRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetOperationRecordsResponseBody build() {
            return new GetOperationRecordsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionExit")
        private String actionExit;

        @com.aliyun.core.annotation.NameInMap("ActiveTimeGMT")
        private String activeTimeGMT;

        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private Long dataId;

        @com.aliyun.core.annotation.NameInMap("DigitalSign")
        private String digitalSign;

        @com.aliyun.core.annotation.NameInMap("Files")
        private String files;

        @com.aliyun.core.annotation.NameInMap("OperateTimeGMT")
        private String operateTimeGMT;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("OperatorDisplayName")
        private String operatorDisplayName;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorNickName")
        private String operatorNickName;

        @com.aliyun.core.annotation.NameInMap("OperatorPhotoUrl")
        private String operatorPhotoUrl;

        @com.aliyun.core.annotation.NameInMap("OperatorStatus")
        private String operatorStatus;

        @com.aliyun.core.annotation.NameInMap("OperatorUserId")
        private String operatorUserId;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("TaskExecuteType")
        private String taskExecuteType;

        @com.aliyun.core.annotation.NameInMap("TaskHoldTimeGMT")
        private Long taskHoldTimeGMT;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.action = builder.action;
            this.actionExit = builder.actionExit;
            this.activeTimeGMT = builder.activeTimeGMT;
            this.activityId = builder.activityId;
            this.dataId = builder.dataId;
            this.digitalSign = builder.digitalSign;
            this.files = builder.files;
            this.operateTimeGMT = builder.operateTimeGMT;
            this.operateType = builder.operateType;
            this.operatorDisplayName = builder.operatorDisplayName;
            this.operatorName = builder.operatorName;
            this.operatorNickName = builder.operatorNickName;
            this.operatorPhotoUrl = builder.operatorPhotoUrl;
            this.operatorStatus = builder.operatorStatus;
            this.operatorUserId = builder.operatorUserId;
            this.processInstanceId = builder.processInstanceId;
            this.remark = builder.remark;
            this.showName = builder.showName;
            this.size = builder.size;
            this.taskExecuteType = builder.taskExecuteType;
            this.taskHoldTimeGMT = builder.taskHoldTimeGMT;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionExit
         */
        public String getActionExit() {
            return this.actionExit;
        }

        /**
         * @return activeTimeGMT
         */
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return dataId
         */
        public Long getDataId() {
            return this.dataId;
        }

        /**
         * @return digitalSign
         */
        public String getDigitalSign() {
            return this.digitalSign;
        }

        /**
         * @return files
         */
        public String getFiles() {
            return this.files;
        }

        /**
         * @return operateTimeGMT
         */
        public String getOperateTimeGMT() {
            return this.operateTimeGMT;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return operatorDisplayName
         */
        public String getOperatorDisplayName() {
            return this.operatorDisplayName;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorNickName
         */
        public String getOperatorNickName() {
            return this.operatorNickName;
        }

        /**
         * @return operatorPhotoUrl
         */
        public String getOperatorPhotoUrl() {
            return this.operatorPhotoUrl;
        }

        /**
         * @return operatorStatus
         */
        public String getOperatorStatus() {
            return this.operatorStatus;
        }

        /**
         * @return operatorUserId
         */
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return taskExecuteType
         */
        public String getTaskExecuteType() {
            return this.taskExecuteType;
        }

        /**
         * @return taskHoldTimeGMT
         */
        public Long getTaskHoldTimeGMT() {
            return this.taskHoldTimeGMT;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String action; 
            private String actionExit; 
            private String activeTimeGMT; 
            private String activityId; 
            private Long dataId; 
            private String digitalSign; 
            private String files; 
            private String operateTimeGMT; 
            private String operateType; 
            private String operatorDisplayName; 
            private String operatorName; 
            private String operatorNickName; 
            private String operatorPhotoUrl; 
            private String operatorStatus; 
            private String operatorUserId; 
            private String processInstanceId; 
            private String remark; 
            private String showName; 
            private Integer size; 
            private String taskExecuteType; 
            private Long taskHoldTimeGMT; 
            private String taskId; 
            private String taskType; 
            private String type; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionExit.
             */
            public Builder actionExit(String actionExit) {
                this.actionExit = actionExit;
                return this;
            }

            /**
             * ActiveTimeGMT.
             */
            public Builder activeTimeGMT(String activeTimeGMT) {
                this.activeTimeGMT = activeTimeGMT;
                return this;
            }

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(Long dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DigitalSign.
             */
            public Builder digitalSign(String digitalSign) {
                this.digitalSign = digitalSign;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(String files) {
                this.files = files;
                return this;
            }

            /**
             * OperateTimeGMT.
             */
            public Builder operateTimeGMT(String operateTimeGMT) {
                this.operateTimeGMT = operateTimeGMT;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * OperatorDisplayName.
             */
            public Builder operatorDisplayName(String operatorDisplayName) {
                this.operatorDisplayName = operatorDisplayName;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * OperatorNickName.
             */
            public Builder operatorNickName(String operatorNickName) {
                this.operatorNickName = operatorNickName;
                return this;
            }

            /**
             * OperatorPhotoUrl.
             */
            public Builder operatorPhotoUrl(String operatorPhotoUrl) {
                this.operatorPhotoUrl = operatorPhotoUrl;
                return this;
            }

            /**
             * OperatorStatus.
             */
            public Builder operatorStatus(String operatorStatus) {
                this.operatorStatus = operatorStatus;
                return this;
            }

            /**
             * OperatorUserId.
             */
            public Builder operatorUserId(String operatorUserId) {
                this.operatorUserId = operatorUserId;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * TaskExecuteType.
             */
            public Builder taskExecuteType(String taskExecuteType) {
                this.taskExecuteType = taskExecuteType;
                return this;
            }

            /**
             * TaskHoldTimeGMT.
             */
            public Builder taskHoldTimeGMT(Long taskHoldTimeGMT) {
                this.taskHoldTimeGMT = taskHoldTimeGMT;
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
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
