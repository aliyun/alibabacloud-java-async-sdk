// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEdgeInstanceDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeInstanceDeploymentResponseBody</p>
 */
public class GetEdgeInstanceDeploymentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetEdgeInstanceDeploymentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeInstanceDeploymentResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEdgeInstanceDeploymentResponseBody build() {
            return new GetEdgeInstanceDeploymentResponseBody(this);
        } 

    } 

    public static class ResourceSnapshotList extends TeaModel {
        @NameInMap("GmtCompleted")
        private String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("Log")
        private String log;

        @NameInMap("OperateType")
        private Integer operateType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Stage")
        private Integer stage;

        @NameInMap("Status")
        private Integer status;

        private ResourceSnapshotList(Builder builder) {
            this.gmtCompleted = builder.gmtCompleted;
            this.gmtCompletedTimestamp = builder.gmtCompletedTimestamp;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.log = builder.log;
            this.operateType = builder.operateType;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.snapshotId = builder.snapshotId;
            this.stage = builder.stage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSnapshotList create() {
            return builder().build();
        }

        /**
         * @return gmtCompleted
         */
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        /**
         * @return gmtCompletedTimestamp
         */
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return operateType
         */
        public Integer getOperateType() {
            return this.operateType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return stage
         */
        public Integer getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCompleted; 
            private Long gmtCompletedTimestamp; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private String log; 
            private Integer operateType; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String snapshotId; 
            private Integer stage; 
            private Integer status; 

            /**
             * GmtCompleted.
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * GmtCompletedTimestamp.
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(Integer operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ResourceSnapshotList build() {
                return new ResourceSnapshotList(this);
            } 

        } 

    }
    public static class TaskList extends TeaModel {
        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("GmtCompleted")
        private String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("ResourceSnapshotList")
        private java.util.List < ResourceSnapshotList> resourceSnapshotList;

        @NameInMap("Stage")
        private Integer stage;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        private TaskList(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gmtCompleted = builder.gmtCompleted;
            this.gmtCompletedTimestamp = builder.gmtCompletedTimestamp;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.resourceSnapshotList = builder.resourceSnapshotList;
            this.stage = builder.stage;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gmtCompleted
         */
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        /**
         * @return gmtCompletedTimestamp
         */
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return resourceSnapshotList
         */
        public java.util.List < ResourceSnapshotList> getResourceSnapshotList() {
            return this.resourceSnapshotList;
        }

        /**
         * @return stage
         */
        public Integer getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String gatewayId; 
            private String gmtCompleted; 
            private Long gmtCompletedTimestamp; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private java.util.List < ResourceSnapshotList> resourceSnapshotList; 
            private Integer stage; 
            private Integer status; 
            private String taskId; 

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GmtCompleted.
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * GmtCompletedTimestamp.
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * ResourceSnapshotList.
             */
            public Builder resourceSnapshotList(java.util.List < ResourceSnapshotList> resourceSnapshotList) {
                this.resourceSnapshotList = resourceSnapshotList;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeploymentId")
        private String deploymentId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCompleted")
        private String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskList")
        private java.util.List < TaskList> taskList;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.deploymentId = builder.deploymentId;
            this.description = builder.description;
            this.gmtCompleted = builder.gmtCompleted;
            this.gmtCompletedTimestamp = builder.gmtCompletedTimestamp;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.status = builder.status;
            this.taskList = builder.taskList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCompleted
         */
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        /**
         * @return gmtCompletedTimestamp
         */
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskList
         */
        public java.util.List < TaskList> getTaskList() {
            return this.taskList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String deploymentId; 
            private String description; 
            private String gmtCompleted; 
            private Long gmtCompletedTimestamp; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private Integer status; 
            private java.util.List < TaskList> taskList; 
            private String type; 

            /**
             * DeploymentId.
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCompleted.
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * GmtCompletedTimestamp.
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskList.
             */
            public Builder taskList(java.util.List < TaskList> taskList) {
                this.taskList = taskList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
