// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeOrderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetChangeOrderInfoResponseBody</p>
 */
public class GetChangeOrderInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("changeOrderInfo")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the change process.
         */
        public Builder changeOrderInfo(ChangeOrderInfo changeOrderInfo) {
            this.changeOrderInfo = changeOrderInfo;
            return this;
        }

        public GetChangeOrderInfoResponseBody build() {
            return new GetChangeOrderInfoResponseBody(this);
        } 

    } 

    public static class TaskInfoDTO extends TeaModel {
        @NameInMap("RetryType")
        private Integer retryType;

        @NameInMap("ShowManualIgnorance")
        private Boolean showManualIgnorance;

        @NameInMap("TaskErrorCode")
        private String taskErrorCode;

        @NameInMap("TaskErrorIgnorance")
        private Integer taskErrorIgnorance;

        @NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskMessage")
        private String taskMessage;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskStatus")
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

            /**
             * The type of the retry policy. Value 0 indicates no retry, value 1 indicates automatic retry, and value 2 indicates manual retry.
             */
            public Builder retryType(Integer retryType) {
                this.retryType = retryType;
                return this;
            }

            /**
             * Indicates whether errors that occur in the change process are ignored. Valid values:``
             * <p>
             * 
             * *   true: Errors that occur in the change process are ignored. This parameter can be set to true only when URL health checks are performed.
             * *   false: Errors that occur in the change process are not ignored.
             */
            public Builder showManualIgnorance(Boolean showManualIgnorance) {
                this.showManualIgnorance = showManualIgnorance;
                return this;
            }

            /**
             * Error codes
             */
            public Builder taskErrorCode(String taskErrorCode) {
                this.taskErrorCode = taskErrorCode;
                return this;
            }

            /**
             * Indicates whether the task is error-tolerant. If the task can tolerate errors, the errors that occur in the change process are ignored and the next task is executed.
             * <p>
             * 
             * *   0: The task is not error-tolerant.
             * *   1: The task is error-tolerant.
             */
            public Builder taskErrorIgnorance(Integer taskErrorIgnorance) {
                this.taskErrorIgnorance = taskErrorIgnorance;
                return this;
            }

            /**
             * The error message for the task.
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Task information
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The state of the task. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
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
    public static class TaskList extends TeaModel {
        @NameInMap("TaskInfoDTO")
        private java.util.List < TaskInfoDTO> taskInfoDTO;

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
        public java.util.List < TaskInfoDTO> getTaskInfoDTO() {
            return this.taskInfoDTO;
        }

        public static final class Builder {
            private java.util.List < TaskInfoDTO> taskInfoDTO; 

            /**
             * TaskInfoDTO.
             */
            public Builder taskInfoDTO(java.util.List < TaskInfoDTO> taskInfoDTO) {
                this.taskInfoDTO = taskInfoDTO;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    public static class StageDetailDTO extends TeaModel {
        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("StageStatus")
        private Integer stageStatus;

        @NameInMap("TaskList")
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

            /**
             * The ID of the stage.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The name of the stage.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * The status of the stage. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
             */
            public Builder stageStatus(Integer stageStatus) {
                this.stageStatus = stageStatus;
                return this;
            }

            /**
             * The information about the task.
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
    public static class StageDetailList extends TeaModel {
        @NameInMap("StageDetailDTO")
        private java.util.List < StageDetailDTO> stageDetailDTO;

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
        public java.util.List < StageDetailDTO> getStageDetailDTO() {
            return this.stageDetailDTO;
        }

        public static final class Builder {
            private java.util.List < StageDetailDTO> stageDetailDTO; 

            /**
             * StageDetailDTO.
             */
            public Builder stageDetailDTO(java.util.List < StageDetailDTO> stageDetailDTO) {
                this.stageDetailDTO = stageDetailDTO;
                return this;
            }

            public StageDetailList build() {
                return new StageDetailList(this);
            } 

        } 

    }
    public static class InstanceStageDTO extends TeaModel {
        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageMessage")
        private String stageMessage;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
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

            /**
             * The time when the execution stopped.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the stage.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The information about the stage.
             */
            public Builder stageMessage(String stageMessage) {
                this.stageMessage = stageMessage;
                return this;
            }

            /**
             * The name of the stage.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * The time when the execution was started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the stage. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
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
    public static class InstanceStageDTOList extends TeaModel {
        @NameInMap("InstanceStageDTO")
        private java.util.List < InstanceStageDTO> instanceStageDTO;

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
        public java.util.List < InstanceStageDTO> getInstanceStageDTO() {
            return this.instanceStageDTO;
        }

        public static final class Builder {
            private java.util.List < InstanceStageDTO> instanceStageDTO; 

            /**
             * InstanceStageDTO.
             */
            public Builder instanceStageDTO(java.util.List < InstanceStageDTO> instanceStageDTO) {
                this.instanceStageDTO = instanceStageDTO;
                return this;
            }

            public InstanceStageDTOList build() {
                return new InstanceStageDTOList(this);
            } 

        } 

    }
    public static class InstanceDTO extends TeaModel {
        @NameInMap("InstanceIp")
        private String instanceIp;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStageDTOList")
        private InstanceStageDTOList instanceStageDTOList;

        @NameInMap("PodName")
        private String podName;

        @NameInMap("PodStatus")
        private String podStatus;

        @NameInMap("Status")
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

            /**
             * The IP address of the ECS instance.
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The results of the task executed on the ECS instance in each stage.
             */
            public Builder instanceStageDTOList(InstanceStageDTOList instanceStageDTOList) {
                this.instanceStageDTOList = instanceStageDTOList;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * The state of the pod.
             */
            public Builder podStatus(String podStatus) {
                this.podStatus = podStatus;
                return this;
            }

            /**
             * The running state. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
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
    public static class InstanceDTOList extends TeaModel {
        @NameInMap("InstanceDTO")
        private java.util.List < InstanceDTO> instanceDTO;

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
        public java.util.List < InstanceDTO> getInstanceDTO() {
            return this.instanceDTO;
        }

        public static final class Builder {
            private java.util.List < InstanceDTO> instanceDTO; 

            /**
             * InstanceDTO.
             */
            public Builder instanceDTO(java.util.List < InstanceDTO> instanceDTO) {
                this.instanceDTO = instanceDTO;
                return this;
            }

            public InstanceDTOList build() {
                return new InstanceDTOList(this);
            } 

        } 

    }
    public static class ServiceStage extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("Status")
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

            /**
             * The execution result in the stage.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the stage.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * Phase Name
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * The running state. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
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
    public static class StageResultDTO extends TeaModel {
        @NameInMap("InstanceDTOList")
        private InstanceDTOList instanceDTOList;

        @NameInMap("ServiceStage")
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

            /**
             * The results of the task executed on each Elastic Compute Service (ECS) instance in each stage.
             */
            public Builder instanceDTOList(InstanceDTOList instanceDTOList) {
                this.instanceDTOList = instanceDTOList;
                return this;
            }

            /**
             * The results of tasks executed in each service-oriented stage.
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
    public static class StageInfoDTO extends TeaModel {
        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("StageResultDTO")
        private StageResultDTO stageResultDTO;

        @NameInMap("Status")
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

            /**
             * The ID of the stage.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The name of the stage.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * The results of the task executed in the stage.
             */
            public Builder stageResultDTO(StageResultDTO stageResultDTO) {
                this.stageResultDTO = stageResultDTO;
                return this;
            }

            /**
             * The state of the stage. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
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
    public static class StageList extends TeaModel {
        @NameInMap("StageInfoDTO")
        private java.util.List < StageInfoDTO> stageInfoDTO;

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
        public java.util.List < StageInfoDTO> getStageInfoDTO() {
            return this.stageInfoDTO;
        }

        public static final class Builder {
            private java.util.List < StageInfoDTO> stageInfoDTO; 

            /**
             * StageInfoDTO.
             */
            public Builder stageInfoDTO(java.util.List < StageInfoDTO> stageInfoDTO) {
                this.stageInfoDTO = stageInfoDTO;
                return this;
            }

            public StageList build() {
                return new StageList(this);
            } 

        } 

    }
    public static class PipelineInfo extends TeaModel {
        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("PipelineName")
        private String pipelineName;

        @NameInMap("PipelineStatus")
        private Integer pipelineStatus;

        @NameInMap("StageDetailList")
        private StageDetailList stageDetailList;

        @NameInMap("StageList")
        private StageList stageList;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("UpdateTime")
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

            /**
             * The ID of each batch for the change during the phased release.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The name of the batch.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * The state of the change task. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
             */
            public Builder pipelineStatus(Integer pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            /**
             * The execution results in each stage.
             */
            public Builder stageDetailList(StageDetailList stageDetailList) {
                this.stageDetailList = stageDetailList;
                return this;
            }

            /**
             * The stages of the change process.
             */
            public Builder stageList(StageList stageList) {
                this.stageList = stageList;
                return this;
            }

            /**
             * The time when the change task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time when the change task was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
    public static class PipelineInfoList extends TeaModel {
        @NameInMap("PipelineInfo")
        private java.util.List < PipelineInfo> pipelineInfo;

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
        public java.util.List < PipelineInfo> getPipelineInfo() {
            return this.pipelineInfo;
        }

        public static final class Builder {
            private java.util.List < PipelineInfo> pipelineInfo; 

            /**
             * PipelineInfo.
             */
            public Builder pipelineInfo(java.util.List < PipelineInfo> pipelineInfo) {
                this.pipelineInfo = pipelineInfo;
                return this;
            }

            public PipelineInfoList build() {
                return new PipelineInfoList(this);
            } 

        } 

    }
    public static class Targets extends TeaModel {
        @NameInMap("Items")
        private java.util.List < String > items;

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
        public java.util.List < String > getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < String > items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < String > items) {
                this.items = items;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class TrafficControl extends TeaModel {
        @NameInMap("Routes")
        private String routes;

        @NameInMap("Rules")
        private String rules;

        @NameInMap("Tips")
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

            /**
             * The route forwarding policy.
             */
            public Builder routes(String routes) {
                this.routes = routes;
                return this;
            }

            /**
             * The traffic routing rules.
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The description of throttling rules.
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
    public static class ChangeOrderInfo extends TeaModel {
        @NameInMap("BatchCount")
        private Integer batchCount;

        @NameInMap("BatchType")
        private String batchType;

        @NameInMap("ChangeOrderDescription")
        private String changeOrderDescription;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("CoType")
        private String coType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("PipelineInfoList")
        private PipelineInfoList pipelineInfoList;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupportRollback")
        private Boolean supportRollback;

        @NameInMap("Targets")
        private Targets targets;

        @NameInMap("TrafficControl")
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

            /**
             * The number of batches for the change.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * Indicates whether the change for the next batch is automatically or manually triggered when phased release is performed. Valid values:
             * <p>
             * 
             * *   Automatic: The change for the next batch is automatically triggered.
             * *   Manual: The change for the next batch is manually triggered.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The description of the change process.
             */
            public Builder changeOrderDescription(String changeOrderDescription) {
                this.changeOrderDescription = changeOrderDescription;
                return this;
            }

            /**
             * The ID of the change process.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * The type of the change process.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * The time when the change process is created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The person in charge of the change process.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * The description of the change process.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The information about the batches of the change task.
             */
            public Builder pipelineInfoList(PipelineInfoList pipelineInfoList) {
                this.pipelineInfoList = pipelineInfoList;
                return this;
            }

            /**
             * The state of the change process. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   7: partially executed
             * *   8: wait for manual confirmation to trigger the next batch during a manual phased release
             * *   9: wait to trigger the next batch during an automatic phased release
             * *   10: failed due to a system exception
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether rollbacks are allowed. Valid values:
             * <p>
             * 
             * *   true: Rollbacks are allowed.
             * *   false: Rollbacks are not allowed.
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
             * The throttling rules.
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
