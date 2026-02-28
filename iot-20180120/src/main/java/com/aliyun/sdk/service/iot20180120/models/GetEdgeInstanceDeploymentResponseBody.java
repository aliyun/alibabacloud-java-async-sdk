// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetEdgeInstanceDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeInstanceDeploymentResponseBody</p>
 */
public class GetEdgeInstanceDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetEdgeInstanceDeploymentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6B72291A-9492-445E-81D9-335D2D3E44C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEdgeInstanceDeploymentResponseBody build() {
            return new GetEdgeInstanceDeploymentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeInstanceDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeInstanceDeploymentResponseBody</p>
     */
    public static class ResourceSnapshotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCompleted")
        private String gmtCompleted;

        @com.aliyun.core.annotation.NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private Integer operateType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private Integer stage;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ResourceSnapshotList model) {
                this.gmtCompleted = model.gmtCompleted;
                this.gmtCompletedTimestamp = model.gmtCompletedTimestamp;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.log = model.log;
                this.operateType = model.operateType;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.snapshotId = model.snapshotId;
                this.stage = model.stage;
                this.status = model.status;
            } 

            /**
             * <p>The time when the deployment task snapshot was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:34</p>
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task snapshot was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * <p>The time when the deployment task snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The last time when the deployment task snapshot was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:34</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The last UNIX timestamp when the deployment task snapshot was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * <p>The logs of resource deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;resourceId&quot;:&quot;device_config&quot;,&quot;code&quot;:&quot;0&quot;,&quot;stage&quot;:0,&quot;level&quot;:&quot;INFO&quot;,&quot;message&quot;:&quot;init success&quot;,&quot;resourceType&quot;:&quot;DEVICE_CONFIG&quot;,&quot;timestamp&quot;:1561543949858},{&quot;resourceId&quot;:&quot;device_config&quot;,&quot;code&quot;:&quot;0&quot;,&quot;stage&quot;:8,&quot;level&quot;:&quot;INFO&quot;,&quot;message&quot;:&quot;assembly success&quot;,&quot;resourceType&quot;:&quot;DEVICE_CONFIG&quot;,&quot;timestamp&quot;:1561543951419},{&quot;resourceId&quot;:&quot;device_config&quot;,&quot;code&quot;:&quot;0&quot;,&quot;stage&quot;:16,&quot;level&quot;:&quot;INFO&quot;,&quot;message&quot;:&quot;package success&quot;,&quot;resourceType&quot;:&quot;DEVICE_CONFIG&quot;,&quot;timestamp&quot;:1561543952591},{&quot;resourceId&quot;:&quot;device_config&quot;,&quot;code&quot;:&quot;0&quot;,&quot;stage&quot;:32,&quot;level&quot;:&quot;INFO&quot;,&quot;message&quot;:&quot;download success&quot;,&quot;resourceType&quot;:&quot;DEVICE_CONFIG&quot;,&quot;timestamp&quot;:1561543954149}]</p>
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The type of the operation.</p>
             * <ul>
             * <li>0: deploys resources.</li>
             * <li>1: deletes resources.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder operateType(Integer operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>device_config</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>device_config</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>device_config</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the deployment task snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>ab576e84a43043d7840cbcebf4a5****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The stage of the snapshot task.</p>
             * <ul>
             * <li>0: The snapshot task was in the initial state.</li>
             * <li>8: The snapshot task was being assembled.</li>
             * <li>16: The snapshot task was being packaged.</li>
             * <li>24: The snapshot task was being dispatched.</li>
             * <li>32: The snapshot task was complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The status of the snapshot task.</p>
             * <ul>
             * <li>0: The snapshot task was not started.</li>
             * <li>1: The snapshot task was being processed.</li>
             * <li>2: The snapshot task was successful.</li>
             * <li>3: The snapshot task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetEdgeInstanceDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeInstanceDeploymentResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GmtCompleted")
        private String gmtCompleted;

        @com.aliyun.core.annotation.NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("ResourceSnapshotList")
        private java.util.List<ResourceSnapshotList> resourceSnapshotList;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private Integer stage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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
        public java.util.List<ResourceSnapshotList> getResourceSnapshotList() {
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
            private java.util.List<ResourceSnapshotList> resourceSnapshotList; 
            private Integer stage; 
            private Integer status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.gatewayId = model.gatewayId;
                this.gmtCompleted = model.gmtCompleted;
                this.gmtCompletedTimestamp = model.gmtCompletedTimestamp;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.resourceSnapshotList = model.resourceSnapshotList;
                this.stage = model.stage;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>jQWf3MVgQjMzcwsY****000101</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The time when the deployment subtask was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:35</p>
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment subtask was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * <p>The time when the deployment subtask was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment subtask was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The last time when the deployment subtask was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:35</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The last UNIX timestamp when the deployment subtask was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * <p>The list of deployment task snapshots.</p>
             */
            public Builder resourceSnapshotList(java.util.List<ResourceSnapshotList> resourceSnapshotList) {
                this.resourceSnapshotList = resourceSnapshotList;
                return this;
            }

            /**
             * <p>The stage of the deployment subtask.</p>
             * <ul>
             * <li>0: The subtask was not started.</li>
             * <li>8: The subtask was being assembled.</li>
             * <li>16: The subtask was being packaged.</li>
             * <li>24: The subtask was being dispatched.</li>
             * <li>32: The subtask was complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The status of the deployment subtask.</p>
             * <ul>
             * <li>0: The subtask was in the initial state.</li>
             * <li>1: The subtask was being processed.</li>
             * <li>2: The subtask was successful.</li>
             * <li>3: The subtask failed.</li>
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
             * <p>The ID of the deployment subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>49ea651529014bf8b5645d5f9062****</p>
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
    /**
     * 
     * {@link GetEdgeInstanceDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeInstanceDeploymentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCompleted")
        private String gmtCompleted;

        @com.aliyun.core.annotation.NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskList")
        private java.util.List<TaskList> taskList;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<TaskList> getTaskList() {
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
            private java.util.List<TaskList> taskList; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentId = model.deploymentId;
                this.description = model.description;
                this.gmtCompleted = model.gmtCompleted;
                this.gmtCompletedTimestamp = model.gmtCompletedTimestamp;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.status = model.status;
                this.taskList = model.taskList;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>9261e308a9504fde9b4cf8462b0b****</p>
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * <p>The description of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy_1561543948874</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the deployment task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:35</p>
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * <p>The time when the deployment task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The last time when the deployment task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:35</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The last UNIX timestamp when the deployment task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * <p>The status of the deployment task.</p>
             * <ul>
             * <li>0: The task was not started.</li>
             * <li>1: The task was being processed.</li>
             * <li>2: The task was successful.</li>
             * <li>3: The task failed.</li>
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
             * <p>The list of deployment subtasks.</p>
             */
            public Builder taskList(java.util.List<TaskList> taskList) {
                this.taskList = taskList;
                return this;
            }

            /**
             * <p>The type of the deployment task.</p>
             * <ul>
             * <li>deploy: deploys the edge instance.</li>
             * <li>reset: resets the edge instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deploy</p>
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
