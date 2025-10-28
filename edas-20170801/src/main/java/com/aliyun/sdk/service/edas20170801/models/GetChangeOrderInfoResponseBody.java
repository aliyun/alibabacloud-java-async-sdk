// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetChangeOrderInfoResponseBody</p>
 */
public class GetChangeOrderInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("changeOrderInfo")
    private ChangeOrderInfo changeOrderInfo;

    private GetChangeOrderInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.changeOrderInfo = builder.changeOrderInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeOrderInfoResponseBody create() {
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
     * @return changeOrderInfo
     */
    public ChangeOrderInfo getChangeOrderInfo() {
        return this.changeOrderInfo;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private ChangeOrderInfo changeOrderInfo; 

        private Builder() {
        } 

        private Builder(GetChangeOrderInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.changeOrderInfo = model.changeOrderInfo;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4JFR-FV9F***************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the change process.</p>
         */
        public Builder changeOrderInfo(ChangeOrderInfo changeOrderInfo) {
            this.changeOrderInfo = changeOrderInfo;
            return this;
        }

        public GetChangeOrderInfoResponseBody build() {
            return new GetChangeOrderInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class TaskInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RetryType")
        private Integer retryType;

        @com.aliyun.core.annotation.NameInMap("ShowManualIgnorance")
        private Boolean showManualIgnorance;

        @com.aliyun.core.annotation.NameInMap("TaskErrorCode")
        private String taskErrorCode;

        @com.aliyun.core.annotation.NameInMap("TaskErrorIgnorance")
        private Integer taskErrorIgnorance;

        @com.aliyun.core.annotation.NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskMessage")
        private String taskMessage;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private TaskInfoDTO(Builder builder) {
            this.retryType = builder.retryType;
            this.showManualIgnorance = builder.showManualIgnorance;
            this.taskErrorCode = builder.taskErrorCode;
            this.taskErrorIgnorance = builder.taskErrorIgnorance;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskId = builder.taskId;
            this.taskMessage = builder.taskMessage;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfoDTO create() {
            return builder().build();
        }

        /**
         * @return retryType
         */
        public Integer getRetryType() {
            return this.retryType;
        }

        /**
         * @return showManualIgnorance
         */
        public Boolean getShowManualIgnorance() {
            return this.showManualIgnorance;
        }

        /**
         * @return taskErrorCode
         */
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        /**
         * @return taskErrorIgnorance
         */
        public Integer getTaskErrorIgnorance() {
            return this.taskErrorIgnorance;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskMessage
         */
        public String getTaskMessage() {
            return this.taskMessage;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private Integer retryType; 
            private Boolean showManualIgnorance; 
            private String taskErrorCode; 
            private Integer taskErrorIgnorance; 
            private String taskErrorMessage; 
            private String taskId; 
            private String taskMessage; 
            private String taskName; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(TaskInfoDTO model) {
                this.retryType = model.retryType;
                this.showManualIgnorance = model.showManualIgnorance;
                this.taskErrorCode = model.taskErrorCode;
                this.taskErrorIgnorance = model.taskErrorIgnorance;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
                this.taskMessage = model.taskMessage;
                this.taskName = model.taskName;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The type of the retry policy. Value 0 indicates no retry, value 1 indicates automatic retry, and value 2 indicates manual retry.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retryType(Integer retryType) {
                this.retryType = retryType;
                return this;
            }

            /**
             * <p>Indicates whether errors that occur in the change process are ignored. Valid values:``</p>
             * <ul>
             * <li>true: Errors that occur in the change process are ignored. This parameter can be set to true only when URL health checks are performed.</li>
             * <li>false: Errors that occur in the change process are not ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showManualIgnorance(Boolean showManualIgnorance) {
                this.showManualIgnorance = showManualIgnorance;
                return this;
            }

            /**
             * <p>Error codes</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder taskErrorCode(String taskErrorCode) {
                this.taskErrorCode = taskErrorCode;
                return this;
            }

            /**
             * <p>Indicates whether the task is error-tolerant. If the task can tolerate errors, the errors that occur in the change process are ignored and the next task is executed.</p>
             * <ul>
             * <li>0: The task is not error-tolerant.</li>
             * <li>1: The task is error-tolerant.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskErrorIgnorance(Integer taskErrorIgnorance) {
                this.taskErrorIgnorance = taskErrorIgnorance;
                return this;
            }

            /**
             * <p>The error message for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>d6d3b934-90a1-4ae8-8cbd-2446003d****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task information</p>
             * 
             * <strong>example:</strong>
             * <p>[CALLBACK] 2020-03-11 15:28:44.781  requestId: c952ab99-8c5b-4ff1-9412-ae3bf9b1****, message: success</p>
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Build Image</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The state of the task. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public TaskInfoDTO build() {
                return new TaskInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskInfoDTO")
        private java.util.List<TaskInfoDTO> taskInfoDTO;

        private TaskList(Builder builder) {
            this.taskInfoDTO = builder.taskInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return taskInfoDTO
         */
        public java.util.List<TaskInfoDTO> getTaskInfoDTO() {
            return this.taskInfoDTO;
        }

        public static final class Builder {
            private java.util.List<TaskInfoDTO> taskInfoDTO; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.taskInfoDTO = model.taskInfoDTO;
            } 

            /**
             * TaskInfoDTO.
             */
            public Builder taskInfoDTO(java.util.List<TaskInfoDTO> taskInfoDTO) {
                this.taskInfoDTO = taskInfoDTO;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class StageDetailDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StageStatus")
        private Integer stageStatus;

        @com.aliyun.core.annotation.NameInMap("TaskList")
        private TaskList taskList;

        private StageDetailDTO(Builder builder) {
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.stageStatus = builder.stageStatus;
            this.taskList = builder.taskList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageDetailDTO create() {
            return builder().build();
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return stageStatus
         */
        public Integer getStageStatus() {
            return this.stageStatus;
        }

        /**
         * @return taskList
         */
        public TaskList getTaskList() {
            return this.taskList;
        }

        public static final class Builder {
            private String stageId; 
            private String stageName; 
            private Integer stageStatus; 
            private TaskList taskList; 

            private Builder() {
            } 

            private Builder(StageDetailDTO model) {
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.stageStatus = model.stageStatus;
                this.taskList = model.taskList;
            } 

            /**
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>d7561440-10a6-452f-8a90-62f6e7ec****</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Process Start</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The status of the stage. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder stageStatus(Integer stageStatus) {
                this.stageStatus = stageStatus;
                return this;
            }

            /**
             * <p>The information about the task.</p>
             */
            public Builder taskList(TaskList taskList) {
                this.taskList = taskList;
                return this;
            }

            public StageDetailDTO build() {
                return new StageDetailDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class StageDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageDetailDTO")
        private java.util.List<StageDetailDTO> stageDetailDTO;

        private StageDetailList(Builder builder) {
            this.stageDetailDTO = builder.stageDetailDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageDetailList create() {
            return builder().build();
        }

        /**
         * @return stageDetailDTO
         */
        public java.util.List<StageDetailDTO> getStageDetailDTO() {
            return this.stageDetailDTO;
        }

        public static final class Builder {
            private java.util.List<StageDetailDTO> stageDetailDTO; 

            private Builder() {
            } 

            private Builder(StageDetailList model) {
                this.stageDetailDTO = model.stageDetailDTO;
            } 

            /**
             * StageDetailDTO.
             */
            public Builder stageDetailDTO(java.util.List<StageDetailDTO> stageDetailDTO) {
                this.stageDetailDTO = stageDetailDTO;
                return this;
            }

            public StageDetailList build() {
                return new StageDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class InstanceStageDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageMessage")
        private String stageMessage;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private InstanceStageDTO(Builder builder) {
            this.finishTime = builder.finishTime;
            this.stageId = builder.stageId;
            this.stageMessage = builder.stageMessage;
            this.stageName = builder.stageName;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStageDTO create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageMessage
         */
        public String getStageMessage() {
            return this.stageMessage;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String finishTime; 
            private String stageId; 
            private String stageMessage; 
            private String stageName; 
            private String startTime; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(InstanceStageDTO model) {
                this.finishTime = model.finishTime;
                this.stageId = model.stageId;
                this.stageMessage = model.stageMessage;
                this.stageName = model.stageName;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The time when the execution stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-11T07:28:52Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>5dd4c0f2-d81a-406f-<strong><strong>-</strong></strong>********</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The information about the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Pulling image &quot;registry-vpc.cn-hangzhou.aliyuncs.com****-user/1172745****_shared_repo:428084d6-265f-<strong><strong>-911a-7eb0d2c3</strong></strong>_15839117****\</p>
             */
            public Builder stageMessage(String stageMessage) {
                this.stageMessage = stageMessage;
                return this;
            }

            /**
             * <p>The name of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>scale out</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The time when the execution was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-11T07:28:49Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the stage. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public InstanceStageDTO build() {
                return new InstanceStageDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class InstanceStageDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceStageDTO")
        private java.util.List<InstanceStageDTO> instanceStageDTO;

        private InstanceStageDTOList(Builder builder) {
            this.instanceStageDTO = builder.instanceStageDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStageDTOList create() {
            return builder().build();
        }

        /**
         * @return instanceStageDTO
         */
        public java.util.List<InstanceStageDTO> getInstanceStageDTO() {
            return this.instanceStageDTO;
        }

        public static final class Builder {
            private java.util.List<InstanceStageDTO> instanceStageDTO; 

            private Builder() {
            } 

            private Builder(InstanceStageDTOList model) {
                this.instanceStageDTO = model.instanceStageDTO;
            } 

            /**
             * InstanceStageDTO.
             */
            public Builder instanceStageDTO(java.util.List<InstanceStageDTO> instanceStageDTO) {
                this.instanceStageDTO = instanceStageDTO;
                return this;
            }

            public InstanceStageDTOList build() {
                return new InstanceStageDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class InstanceDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIp")
        private String instanceIp;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStageDTOList")
        private InstanceStageDTOList instanceStageDTOList;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("PodStatus")
        private String podStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private InstanceDTO(Builder builder) {
            this.instanceIp = builder.instanceIp;
            this.instanceName = builder.instanceName;
            this.instanceStageDTOList = builder.instanceStageDTOList;
            this.podName = builder.podName;
            this.podStatus = builder.podStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDTO create() {
            return builder().build();
        }

        /**
         * @return instanceIp
         */
        public String getInstanceIp() {
            return this.instanceIp;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStageDTOList
         */
        public InstanceStageDTOList getInstanceStageDTOList() {
            return this.instanceStageDTOList;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return podStatus
         */
        public String getPodStatus() {
            return this.podStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceIp; 
            private String instanceName; 
            private InstanceStageDTOList instanceStageDTOList; 
            private String podName; 
            private String podStatus; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(InstanceDTO model) {
                this.instanceIp = model.instanceIp;
                this.instanceName = model.instanceName;
                this.instanceStageDTOList = model.instanceStageDTOList;
                this.podName = model.podName;
                this.podStatus = model.podStatus;
                this.status = model.status;
            } 

            /**
             * <p>The IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.12 (Public)<br><em><strong>.</strong>.</em>.*** (*******)</p>
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-scaled</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The results of the task executed on the ECS instance in each stage.</p>
             */
            public Builder instanceStageDTOList(InstanceStageDTOList instanceStageDTOList) {
                this.instanceStageDTOList = instanceStageDTOList;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>canary-test</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>The state of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>In progress</p>
             */
            public Builder podStatus(String podStatus) {
                this.podStatus = podStatus;
                return this;
            }

            /**
             * <p>The running state. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public InstanceDTO build() {
                return new InstanceDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class InstanceDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceDTO")
        private java.util.List<InstanceDTO> instanceDTO;

        private InstanceDTOList(Builder builder) {
            this.instanceDTO = builder.instanceDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDTOList create() {
            return builder().build();
        }

        /**
         * @return instanceDTO
         */
        public java.util.List<InstanceDTO> getInstanceDTO() {
            return this.instanceDTO;
        }

        public static final class Builder {
            private java.util.List<InstanceDTO> instanceDTO; 

            private Builder() {
            } 

            private Builder(InstanceDTOList model) {
                this.instanceDTO = model.instanceDTO;
            } 

            /**
             * InstanceDTO.
             */
            public Builder instanceDTO(java.util.List<InstanceDTO> instanceDTO) {
                this.instanceDTO = instanceDTO;
                return this;
            }

            public InstanceDTOList build() {
                return new InstanceDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class ServiceStage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private ServiceStage(Builder builder) {
            this.message = builder.message;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceStage create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String stageId; 
            private String stageName; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(ServiceStage model) {
                this.message = model.message;
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.status = model.status;
            } 

            /**
             * <p>The execution result in the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>358a143f-09a0-45e0-<strong><strong>-</strong></strong>********</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>Phase Name</p>
             * 
             * <strong>example:</strong>
             * <p>Enable Tengine</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The running state. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ServiceStage build() {
                return new ServiceStage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class StageResultDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceDTOList")
        private InstanceDTOList instanceDTOList;

        @com.aliyun.core.annotation.NameInMap("ServiceStage")
        private ServiceStage serviceStage;

        private StageResultDTO(Builder builder) {
            this.instanceDTOList = builder.instanceDTOList;
            this.serviceStage = builder.serviceStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageResultDTO create() {
            return builder().build();
        }

        /**
         * @return instanceDTOList
         */
        public InstanceDTOList getInstanceDTOList() {
            return this.instanceDTOList;
        }

        /**
         * @return serviceStage
         */
        public ServiceStage getServiceStage() {
            return this.serviceStage;
        }

        public static final class Builder {
            private InstanceDTOList instanceDTOList; 
            private ServiceStage serviceStage; 

            private Builder() {
            } 

            private Builder(StageResultDTO model) {
                this.instanceDTOList = model.instanceDTOList;
                this.serviceStage = model.serviceStage;
            } 

            /**
             * <p>The results of the task executed on each Elastic Compute Service (ECS) instance in each stage.</p>
             */
            public Builder instanceDTOList(InstanceDTOList instanceDTOList) {
                this.instanceDTOList = instanceDTOList;
                return this;
            }

            /**
             * <p>The results of tasks executed in each service-oriented stage.</p>
             */
            public Builder serviceStage(ServiceStage serviceStage) {
                this.serviceStage = serviceStage;
                return this;
            }

            public StageResultDTO build() {
                return new StageResultDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class StageInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StageResultDTO")
        private StageResultDTO stageResultDTO;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private StageInfoDTO(Builder builder) {
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.stageResultDTO = builder.stageResultDTO;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageInfoDTO create() {
            return builder().build();
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return stageResultDTO
         */
        public StageResultDTO getStageResultDTO() {
            return this.stageResultDTO;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String stageId; 
            private String stageName; 
            private StageResultDTO stageResultDTO; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(StageInfoDTO model) {
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.stageResultDTO = model.stageResultDTO;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>358a143f-09a0-45e0-<strong><strong>-</strong></strong>********@<strong><em>*******</em>***</strong></p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Scale Out</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The results of the task executed in the stage.</p>
             */
            public Builder stageResultDTO(StageResultDTO stageResultDTO) {
                this.stageResultDTO = stageResultDTO;
                return this;
            }

            /**
             * <p>The state of the stage. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public StageInfoDTO build() {
                return new StageInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class StageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageInfoDTO")
        private java.util.List<StageInfoDTO> stageInfoDTO;

        private StageList(Builder builder) {
            this.stageInfoDTO = builder.stageInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageList create() {
            return builder().build();
        }

        /**
         * @return stageInfoDTO
         */
        public java.util.List<StageInfoDTO> getStageInfoDTO() {
            return this.stageInfoDTO;
        }

        public static final class Builder {
            private java.util.List<StageInfoDTO> stageInfoDTO; 

            private Builder() {
            } 

            private Builder(StageList model) {
                this.stageInfoDTO = model.stageInfoDTO;
            } 

            /**
             * StageInfoDTO.
             */
            public Builder stageInfoDTO(java.util.List<StageInfoDTO> stageInfoDTO) {
                this.stageInfoDTO = stageInfoDTO;
                return this;
            }

            public StageList build() {
                return new StageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class PipelineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("PipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("PipelineStatus")
        private Integer pipelineStatus;

        @com.aliyun.core.annotation.NameInMap("StageDetailList")
        private StageDetailList stageDetailList;

        @com.aliyun.core.annotation.NameInMap("StageList")
        private StageList stageList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PipelineInfo(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.pipelineName = builder.pipelineName;
            this.pipelineStatus = builder.pipelineStatus;
            this.stageDetailList = builder.stageDetailList;
            this.stageList = builder.stageList;
            this.startTime = builder.startTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineInfo create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return pipelineStatus
         */
        public Integer getPipelineStatus() {
            return this.pipelineStatus;
        }

        /**
         * @return stageDetailList
         */
        public StageDetailList getStageDetailList() {
            return this.stageDetailList;
        }

        /**
         * @return stageList
         */
        public StageList getStageList() {
            return this.stageList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String pipelineId; 
            private String pipelineName; 
            private Integer pipelineStatus; 
            private StageDetailList stageDetailList; 
            private StageList stageList; 
            private String startTime; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(PipelineInfo model) {
                this.pipelineId = model.pipelineId;
                this.pipelineName = model.pipelineName;
                this.pipelineStatus = model.pipelineStatus;
                this.stageDetailList = model.stageDetailList;
                this.stageList = model.stageList;
                this.startTime = model.startTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of each batch for the change during the phased release.</p>
             * 
             * <strong>example:</strong>
             * <p>4c4ee320-5e47-4a48-<strong><strong>-</strong></strong>********</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The name of the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch: 1</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>The state of the change task. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pipelineStatus(Integer pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            /**
             * <p>The execution results in each stage.</p>
             */
            public Builder stageDetailList(StageDetailList stageDetailList) {
                this.stageDetailList = stageDetailList;
                return this;
            }

            /**
             * <p>The stages of the change process.</p>
             */
            public Builder stageList(StageList stageList) {
                this.stageList = stageList;
                return this;
            }

            /**
             * <p>The time when the change task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1583911702158</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the change task was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1583911743633</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PipelineInfo build() {
                return new PipelineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class PipelineInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineInfo")
        private java.util.List<PipelineInfo> pipelineInfo;

        private PipelineInfoList(Builder builder) {
            this.pipelineInfo = builder.pipelineInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineInfoList create() {
            return builder().build();
        }

        /**
         * @return pipelineInfo
         */
        public java.util.List<PipelineInfo> getPipelineInfo() {
            return this.pipelineInfo;
        }

        public static final class Builder {
            private java.util.List<PipelineInfo> pipelineInfo; 

            private Builder() {
            } 

            private Builder(PipelineInfoList model) {
                this.pipelineInfo = model.pipelineInfo;
            } 

            /**
             * PipelineInfo.
             */
            public Builder pipelineInfo(java.util.List<PipelineInfo> pipelineInfo) {
                this.pipelineInfo = pipelineInfo;
                return this;
            }

            public PipelineInfoList build() {
                return new PipelineInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<String> items;

        private Targets(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<String> items; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class TrafficControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Routes")
        private String routes;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private String rules;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        private TrafficControl(Builder builder) {
            this.routes = builder.routes;
            this.rules = builder.rules;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControl create() {
            return builder().build();
        }

        /**
         * @return routes
         */
        public String getRoutes() {
            return this.routes;
        }

        /**
         * @return rules
         */
        public String getRules() {
            return this.rules;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private String routes; 
            private String rules; 
            private String tips; 

            private Builder() {
            } 

            private Builder(TrafficControl model) {
                this.routes = model.routes;
                this.rules = model.rules;
                this.tips = model.tips;
            } 

            /**
             * <p>The route forwarding policy.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;app&quot;:&quot;9c8247da-91b6-42bb-8f99-92a0b9c6f****&quot;,&quot;type&quot;:&quot;GROUP&quot;}]</p>
             */
            public Builder routes(String routes) {
                this.routes = routes;
                return this;
            }

            /**
             * <p>The traffic routing rules.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;conditionType&quot;:&quot;content&quot;,&quot;conditions&quot;:[{&quot;key&quot;:&quot;name&quot;,&quot;operator&quot;:&quot;EQ&quot;,&quot;strategy&quot;:&quot;PARAM&quot;,&quot;values&quot;:[&quot;jim&quot;]},{&quot;key&quot;:&quot;name&quot;,&quot;operator&quot;:&quot;EQ&quot;,&quot;strategy&quot;:&quot;COOKIE&quot;,&quot;values&quot;:[&quot;jim&quot;]}],&quot;percent&quot;:100,&quot;protocol&quot;:&quot;SPRINGCLOUD&quot;,&quot;triggerPolicy&quot;:&quot;AND&quot;}]</p>
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The description of throttling rules.</p>
             * 
             * <strong>example:</strong>
             * <p>This canary release batch is complete, and the user has confirmed to proceed to the next batch.</p>
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public TrafficControl build() {
                return new TrafficControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeOrderInfoResponseBody</p>
     */
    public static class ChangeOrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchCount")
        private Integer batchCount;

        @com.aliyun.core.annotation.NameInMap("BatchType")
        private String batchType;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderDescription")
        private String changeOrderDescription;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("CoType")
        private String coType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private String createUserId;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("PipelineInfoList")
        private PipelineInfoList pipelineInfoList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupportRollback")
        private Boolean supportRollback;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private Targets targets;

        @com.aliyun.core.annotation.NameInMap("TrafficControl")
        private TrafficControl trafficControl;

        private ChangeOrderInfo(Builder builder) {
            this.batchCount = builder.batchCount;
            this.batchType = builder.batchType;
            this.changeOrderDescription = builder.changeOrderDescription;
            this.changeOrderId = builder.changeOrderId;
            this.coType = builder.coType;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.desc = builder.desc;
            this.pipelineInfoList = builder.pipelineInfoList;
            this.status = builder.status;
            this.supportRollback = builder.supportRollback;
            this.targets = builder.targets;
            this.trafficControl = builder.trafficControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrderInfo create() {
            return builder().build();
        }

        /**
         * @return batchCount
         */
        public Integer getBatchCount() {
            return this.batchCount;
        }

        /**
         * @return batchType
         */
        public String getBatchType() {
            return this.batchType;
        }

        /**
         * @return changeOrderDescription
         */
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return coType
         */
        public String getCoType() {
            return this.coType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return pipelineInfoList
         */
        public PipelineInfoList getPipelineInfoList() {
            return this.pipelineInfoList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supportRollback
         */
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

        /**
         * @return targets
         */
        public Targets getTargets() {
            return this.targets;
        }

        /**
         * @return trafficControl
         */
        public TrafficControl getTrafficControl() {
            return this.trafficControl;
        }

        public static final class Builder {
            private Integer batchCount; 
            private String batchType; 
            private String changeOrderDescription; 
            private String changeOrderId; 
            private String coType; 
            private String createTime; 
            private String createUserId; 
            private String desc; 
            private PipelineInfoList pipelineInfoList; 
            private Integer status; 
            private Boolean supportRollback; 
            private Targets targets; 
            private TrafficControl trafficControl; 

            private Builder() {
            } 

            private Builder(ChangeOrderInfo model) {
                this.batchCount = model.batchCount;
                this.batchType = model.batchType;
                this.changeOrderDescription = model.changeOrderDescription;
                this.changeOrderId = model.changeOrderId;
                this.coType = model.coType;
                this.createTime = model.createTime;
                this.createUserId = model.createUserId;
                this.desc = model.desc;
                this.pipelineInfoList = model.pipelineInfoList;
                this.status = model.status;
                this.supportRollback = model.supportRollback;
                this.targets = model.targets;
                this.trafficControl = model.trafficControl;
            } 

            /**
             * <p>The number of batches for the change.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * <p>Indicates whether the change for the next batch is automatically or manually triggered when phased release is performed. Valid values:</p>
             * <ul>
             * <li>Automatic: The change for the next batch is automatically triggered.</li>
             * <li>Manual: The change for the next batch is manually triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automatic</p>
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The description of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>Application scale-out</p>
             */
            public Builder changeOrderDescription(String changeOrderDescription) {
                this.changeOrderDescription = changeOrderDescription;
                return this;
            }

            /**
             * <p>The ID of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>1074f3e2-e974-4a0e-<strong><strong>-</strong></strong>********</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The type of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>Application Scale Out</p>
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * <p>The time when the change process is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-13 14:23:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The person in charge of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The description of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>IP of Scale-Out Instance: 47.107.XX.XX</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The information about the batches of the change task.</p>
             */
            public Builder pipelineInfoList(PipelineInfoList pipelineInfoList) {
                this.pipelineInfoList = pipelineInfoList;
                return this;
            }

            /**
             * <p>The state of the change process. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>7: partially executed</li>
             * <li>8: wait for manual confirmation to trigger the next batch during a manual phased release</li>
             * <li>9: wait to trigger the next batch during an automatic phased release</li>
             * <li>10: failed due to a system exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether rollbacks are allowed. Valid values:</p>
             * <ul>
             * <li>true: Rollbacks are allowed.</li>
             * <li>false: Rollbacks are not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportRollback(Boolean supportRollback) {
                this.supportRollback = supportRollback;
                return this;
            }

            /**
             * Targets.
             */
            public Builder targets(Targets targets) {
                this.targets = targets;
                return this;
            }

            /**
             * <p>The throttling rules.</p>
             */
            public Builder trafficControl(TrafficControl trafficControl) {
                this.trafficControl = trafficControl;
                return this;
            }

            public ChangeOrderInfo build() {
                return new ChangeOrderInfo(this);
            } 

        } 

    }
}
