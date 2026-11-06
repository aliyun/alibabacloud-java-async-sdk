// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is returned when the request fails. A successful response may not contain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error or result message. This parameter is used to describe the cause when the request fails. A successful response may not contain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can provide this value when you troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To determine whether an asynchronous task is completed, you must query the task status separately.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceList(Builder builder) {
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resource; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.resource = model.resource;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The resource content corresponding to ResourceType. For the URL type, specify or return an accessible resource address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The provision method of the resource content.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>HOSTED</strong>: hosted resource</li>
             * <li><strong>TEXT</strong>: text resource</li>
             * <li><strong>URL</strong>: resource provided through a URL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class TaskStepList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepEndTime")
        private String stepEndTime;

        @com.aliyun.core.annotation.NameInMap("StepStartTime")
        private String stepStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskMessage")
        private String taskMessage;

        @com.aliyun.core.annotation.NameInMap("TaskStep")
        private String taskStep;

        private TaskStepList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stepEndTime = builder.stepEndTime;
            this.stepStartTime = builder.stepStartTime;
            this.taskMessage = builder.taskMessage;
            this.taskStep = builder.taskStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStepList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepEndTime
         */
        public String getStepEndTime() {
            return this.stepEndTime;
        }

        /**
         * @return stepStartTime
         */
        public String getStepStartTime() {
            return this.stepStartTime;
        }

        /**
         * @return taskMessage
         */
        public String getTaskMessage() {
            return this.taskMessage;
        }

        /**
         * @return taskStep
         */
        public String getTaskStep() {
            return this.taskStep;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String status; 
            private String stepEndTime; 
            private String stepStartTime; 
            private String taskMessage; 
            private String taskStep; 

            private Builder() {
            } 

            private Builder(TaskStepList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stepEndTime = model.stepEndTime;
                this.stepStartTime = model.stepStartTime;
                this.taskMessage = model.taskMessage;
                this.taskStep = model.taskStep;
            } 

            /**
             * <p>The end time of the step. The time is a UNIX timestamp calculated from 1970-01-01T00:00:00Z. Unit: milliseconds. This parameter may not be returned if the step has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1790130491000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the step. The time is a UNIX timestamp calculated from 1970-01-01T00:00:00Z. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1790130490000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution status of the step.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The step is being executed.</li>
             * <li><strong>SUCCESS</strong>: The step is executed successfully.</li>
             * <li><strong>FAILED</strong>: The step fails to be executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ISO 8601 string of the step end time, including the time zone offset. In the example, +08:00 indicates UTC+8. This parameter represents the same time as EndTime and is parsed according to the offset in the returned value. This parameter may not be returned if the step has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:28:11+08:00</p>
             */
            public Builder stepEndTime(String stepEndTime) {
                this.stepEndTime = stepEndTime;
                return this;
            }

            /**
             * <p>The ISO 8601 string of the step start time, including the time zone offset. In the example, +08:00 indicates UTC+8. This parameter represents the same time as StartTime and is parsed according to the offset in the returned value.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:28:10+08:00</p>
             */
            public Builder stepStartTime(String stepStartTime) {
                this.stepStartTime = stepStartTime;
                return this;
            }

            /**
             * <p>The prompt or execution result description of this step.</p>
             * 
             * <strong>example:</strong>
             * <p>[code=Builder.Failed,httpStatusCode=<null>,message=Builder environment deploy failed.]</p>
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * <p>The task step identifier corresponding to this record. You can call the ListTaskStep operation to query the image creation and application adaptation steps.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_BUILDER_ENV</p>
             */
            public Builder taskStep(String taskStep) {
                this.taskStep = taskStep;
                return this;
            }

            public TaskStepList build() {
                return new TaskStepList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskMessage")
        private String currentTaskMessage;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskStep")
        private String currentTaskStep;

        @com.aliyun.core.annotation.NameInMap("ExecuteRegion")
        private String executeRegion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("PerformanceType")
        private String performanceType;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("SystemImageId")
        private String systemImageId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStepList")
        private java.util.List<TaskStepList> taskStepList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.currentTaskMessage = builder.currentTaskMessage;
            this.currentTaskStep = builder.currentTaskStep;
            this.executeRegion = builder.executeRegion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.performanceType = builder.performanceType;
            this.progress = builder.progress;
            this.resourceList = builder.resourceList;
            this.runMode = builder.runMode;
            this.status = builder.status;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemImageId = builder.systemImageId;
            this.taskId = builder.taskId;
            this.taskStepList = builder.taskStepList;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return currentTaskMessage
         */
        public String getCurrentTaskMessage() {
            return this.currentTaskMessage;
        }

        /**
         * @return currentTaskStep
         */
        public String getCurrentTaskStep() {
            return this.currentTaskStep;
        }

        /**
         * @return executeRegion
         */
        public String getExecuteRegion() {
            return this.executeRegion;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return performanceType
         */
        public String getPerformanceType() {
            return this.performanceType;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resourceList
         */
        public java.util.List<ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return systemImageId
         */
        public String getSystemImageId() {
            return this.systemImageId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStepList
         */
        public java.util.List<TaskStepList> getTaskStepList() {
            return this.taskStepList;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long aliUid; 
            private String currentTaskMessage; 
            private String currentTaskStep; 
            private String executeRegion; 
            private String gmtCreate; 
            private String gmtModified; 
            private String performanceType; 
            private String progress; 
            private java.util.List<ResourceList> resourceList; 
            private String runMode; 
            private String status; 
            private Integer systemDiskSize; 
            private String systemImageId; 
            private String taskId; 
            private java.util.List<TaskStepList> taskStepList; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.currentTaskMessage = model.currentTaskMessage;
                this.currentTaskStep = model.currentTaskStep;
                this.executeRegion = model.executeRegion;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.performanceType = model.performanceType;
                this.progress = model.progress;
                this.resourceList = model.resourceList;
                this.runMode = model.runMode;
                this.status = model.status;
                this.systemDiskSize = model.systemDiskSize;
                this.systemImageId = model.systemImageId;
                this.taskId = model.taskId;
                this.taskStepList = model.taskStepList;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The prompt or execution result description of the current step of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>[code=Builder.Failed,httpStatusCode=<null>,message=Builder environment deploy failed.]</p>
             */
            public Builder currentTaskMessage(String currentTaskMessage) {
                this.currentTaskMessage = currentTaskMessage;
                return this;
            }

            /**
             * <p>The identifier of the step that the task is currently executing. You can call the ListTaskStep operation to query the image creation and application adaptation steps.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_BUILDER_ENV</p>
             */
            public Builder currentTaskStep(String currentTaskStep) {
                this.currentTaskStep = currentTaskStep;
                return this;
            }

            /**
             * <p>The ID of the region where the task is actually executed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder executeRegion(String executeRegion) {
                this.executeRegion = executeRegion;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T02:28:10.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was last modified. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T02:32:43.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The compute type of the task creation resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>CPU</strong>: CPU compute resource</li>
             * <li><strong>GPU</strong>: GPU compute resource</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder performanceType(String performanceType) {
                this.performanceType = performanceType;
                return this;
            }

            /**
             * <p><strong>Not enabled. The system does not return valid task progress.</strong> Determine the task execution status based on the Status, CurrentTaskStep, and TaskStepList parameters.</p>
             * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status, not an actual API response example.</p>
             * 
             * <strong>example:</strong>
             * <p>Not applicable (not enabled)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The list of resources used for task creation, which corresponds to the creation resources submitted when the task is created.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>The running mode of the task creation environment.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: normal running mode</li>
             * <li><strong>COMPATIBLE</strong>: compatible running mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The overall status of the task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is initialized.</li>
             * <li><strong>START</strong>: The task is being created or executed.</li>
             * <li><strong>SUCCESS</strong>: The task is executed successfully.</li>
             * <li><strong>FAILED</strong>: The task fails to be executed.</li>
             * <li><strong>DELETED</strong>: The task is deleted.</li>
             * </ul>
             * <p>Deleted tasks are not included in the regular valid task query scope.</p>
             * 
             * <strong>example:</strong>
             * <p>START</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The system disk capacity of the task creation environment. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the base system image used in the task creation environment.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-bp1parent****</p>
             */
            public Builder systemImageId(String systemImageId) {
                this.systemImageId = systemImageId;
                return this;
            }

            /**
             * <p>The task ID. You can use this ID to call the GetTask operation to query the task status.</p>
             * 
             * <strong>example:</strong>
             * <p>tid-bp1example****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The list of recorded task execution steps and results.</p>
             */
            public Builder taskStepList(java.util.List<TaskStepList> taskStepList) {
                this.taskStepList = taskStepList;
                return this;
            }

            /**
             * <p>The actual type of the task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>AUTO_ADAPT</strong>: automatic adaptation</li>
             * <li><strong>AUTO_CREATE_IMAGE</strong>: automatic image creation</li>
             * <li><strong>RETRY_ADAPT</strong>: retry of automatic adaptation</li>
             * <li><strong>RETRY_CREATE_IMAGE</strong>: retry of automatic image creation</li>
             * <li><strong>AUTO_OTA_IMAGE</strong>: automatic image OTA</li>
             * <li><strong>AUTO_CREATE_VHD</strong>: automatic VHD creation</li>
             * <li><strong>RETRY_VHD</strong>: retry of VHD creation</li>
             * <li><strong>AUTO_CREATE_IMAGE_VHD</strong>: automatic VHD image creation</li>
             * <li><strong>RETRY_CREATE_IMAGE_VHD</strong>: retry of VHD image creation</li>
             * <li><strong>AUTO_VALIDATE_VHD</strong>: automatic VHD validation</li>
             * <li><strong>RETRY_VALIDATE_VHD</strong>: retry of VHD validation</li>
             * <li><strong>SYNCHRONIZE_APP_IMAGE</strong>: application image synchronization</li>
             * <li><strong>APPLY_VHD_BUILDER</strong>: application for VHD application recording environment</li>
             * <li><strong>RETRY_VHD_BUILDER</strong>: retry of application for VHD recording environment</li>
             * <li><strong>ADAPT_AUTO</strong>: automatic application adaptation creation</li>
             * <li><strong>ADAPT_AUTO_RETRY</strong>: retry of automatic application adaptation creation</li>
             * <li><strong>ADAPT_MANUAL</strong>: manual application adaptation creation</li>
             * <li><strong>ADAPT_MANUAL_RETRY</strong>: retry of manual application adaptation creation</li>
             * <li><strong>IMAGE_AUTO</strong>: automatic image creation</li>
             * <li><strong>IMAGE_AUTO_RETRY</strong>: retry of automatic image creation</li>
             * <li><strong>IMAGE_AUTO_VALIDATE</strong>: automatic image validation</li>
             * <li><strong>IMAGE_AUTO_VALIDATE_RETRY</strong>: retry of automatic image validation</li>
             * <li><strong>IMAGE_MANUAL</strong>: manual image creation</li>
             * <li><strong>IMAGE_MANUAL_RETRY</strong>: retry of manual image creation</li>
             * <li><strong>DESKTOP_CUSTOM_IMAGE</strong>: cloud desktop custom image creation</li>
             * <li><strong>DESKTOP_CUSTOM_IMAGE_RETRY</strong>: retry of cloud desktop custom image creation</li>
             * <li><strong>DESKTOP_SYNC_IMAGE</strong>: cloud desktop image synchronization across regions</li>
             * <li><strong>DESKTOP_SYNC_IMAGE_RETRY</strong>: retry of cloud desktop image synchronization across regions</li>
             * <li><strong>IMAGE_DISTRIBUTE</strong>: image distribution to multiple regions</li>
             * <li><strong>IMAGE_DISTRIBUTE_RETRY</strong>: retry of image distribution</li>
             * <li><strong>IMAGE_FROM_INSTANCE</strong>: image creation based on an instance</li>
             * <li><strong>IMAGE_FROM_INSTANCE_RETRY</strong>: retry of image creation based on an instance</li>
             * <li><strong>SNAPSHOT_DISTRIBUTE</strong>: snapshot distribution to multiple regions</li>
             * <li><strong>SNAPSHOT_DISTRIBUTE_RETRY</strong>: retry of snapshot distribution</li>
             * <li><strong>SNAPSHOT_FROM_DISK</strong>: snapshot creation based on a disk</li>
             * <li><strong>SNAPSHOT_FROM_DISK_RETRY</strong>: retry of snapshot creation based on a disk</li>
             * <li><strong>IMAGE_CLEAN_AND_CREATE</strong>: temporary instance creation based on an image, cleanup, and final image creation</li>
             * <li><strong>IMAGE_CLEAN_AND_CREATE_RETRY</strong>: retry of final image creation after cleanup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_MANUAL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
