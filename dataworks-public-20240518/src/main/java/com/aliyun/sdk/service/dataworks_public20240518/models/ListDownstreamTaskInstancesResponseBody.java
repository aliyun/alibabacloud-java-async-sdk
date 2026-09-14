// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDownstreamTaskInstancesResponseBody</p>
 */
public class ListDownstreamTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDownstreamTaskInstancesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownstreamTaskInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDownstreamTaskInstancesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDownstreamTaskInstancesResponseBody build() {
            return new ListDownstreamTaskInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.name = model.name;
            } 

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        private Runtime(Builder builder) {
            this.gateway = builder.gateway;
            this.processId = builder.processId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        public static final class Builder {
            private String gateway; 
            private String processId; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.gateway = model.gateway;
                this.processId = model.processId;
            } 

            /**
             * <p>The machine on which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.1.2</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The unique run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>T3_123</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.image = builder.image;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String cu; 
            private String image; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.image = model.image;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The compute unit (CU) consumption configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The image ID configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the schedule resource group configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PeriodNumber")
        private Integer periodNumber;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RunNumber")
        private Integer runNumber;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("TriggerRecurrence")
        private String triggerRecurrence;

        @com.aliyun.core.annotation.NameInMap("TriggerTime")
        private Long triggerTime;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceType")
        private String workflowInstanceType;

        @com.aliyun.core.annotation.NameInMap("WorkflowName")
        private String workflowName;

        private TaskInstance(Builder builder) {
            this.baselineId = builder.baselineId;
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.envType = builder.envType;
            this.finishedTime = builder.finishedTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.owner = builder.owner;
            this.periodNumber = builder.periodNumber;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.rerunMode = builder.rerunMode;
            this.runNumber = builder.runNumber;
            this.runtime = builder.runtime;
            this.runtimeResource = builder.runtimeResource;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.timeout = builder.timeout;
            this.triggerRecurrence = builder.triggerRecurrence;
            this.triggerTime = builder.triggerTime;
            this.triggerType = builder.triggerType;
            this.workflowId = builder.workflowId;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowInstanceType = builder.workflowInstanceType;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstance create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return periodNumber
         */
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return runNumber
         */
        public Integer getRunNumber() {
            return this.runNumber;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        /**
         * @return runtimeResource
         */
        public RuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return triggerRecurrence
         */
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        /**
         * @return triggerTime
         */
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowInstanceType
         */
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        /**
         * @return workflowName
         */
        public String getWorkflowName() {
            return this.workflowName;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long bizdate; 
            private Long createTime; 
            private String createUser; 
            private DataSource dataSource; 
            private String description; 
            private String envType; 
            private Long finishedTime; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String owner; 
            private Integer periodNumber; 
            private Integer priority; 
            private Long projectId; 
            private String rerunMode; 
            private Integer runNumber; 
            private Runtime runtime; 
            private RuntimeResource runtimeResource; 
            private Long startedTime; 
            private String status; 
            private Long taskId; 
            private String taskName; 
            private String taskType; 
            private Integer timeout; 
            private String triggerRecurrence; 
            private Long triggerTime; 
            private String triggerType; 
            private Long workflowId; 
            private Long workflowInstanceId; 
            private String workflowInstanceType; 
            private String workflowName; 

            private Builder() {
            } 

            private Builder(TaskInstance model) {
                this.baselineId = model.baselineId;
                this.bizdate = model.bizdate;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.envType = model.envType;
                this.finishedTime = model.finishedTime;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.owner = model.owner;
                this.periodNumber = model.periodNumber;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.rerunMode = model.rerunMode;
                this.runNumber = model.runNumber;
                this.runtime = model.runtime;
                this.runtimeResource = model.runtimeResource;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.timeout = model.timeout;
                this.triggerRecurrence = model.triggerRecurrence;
                this.triggerTime = model.triggerTime;
                this.triggerType = model.triggerType;
                this.workflowId = model.workflowId;
                this.workflowInstanceId = model.workflowInstanceId;
                this.workflowInstanceType = model.workflowInstanceType;
                this.workflowName = model.workflowName;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the user who created the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data source information associated with the instance.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment of the target data source. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The unique identifier of the task instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the user who last modified the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The account ID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The period number. Indicates which scheduling cycle of the day the instance is in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The run priority of the node. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The rerun configuration of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The current run number. The default value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runNumber(Integer runNumber) {
                this.runNumber = runNumber;
                return this;
            }

            /**
             * <p>The runtime information of the instance.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The runtime environment configuration, such as resource group information.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The time when the instance started running.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The run status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period for node execution. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The run mode when triggered. This parameter takes effect when TriggerType is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause: paused.</li>
             * <li>Skip: dry run.</li>
             * <li>Normal: normal execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder triggerRecurrence(String triggerRecurrence) {
                this.triggerRecurrence = triggerRecurrence;
                return this;
            }

            /**
             * <p>The scheduled trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            /**
             * <p>The trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The ID of the workflow instance to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The type of the workflow instance to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder workflowInstanceType(String workflowInstanceType) {
                this.workflowInstanceType = workflowInstanceType;
                return this;
            }

            /**
             * <p>The name of the workflow to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test workflow</p>
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public TaskInstance build() {
                return new TaskInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class DownstreamTaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependencyType")
        private String dependencyType;

        @com.aliyun.core.annotation.NameInMap("TaskInstance")
        private TaskInstance taskInstance;

        private DownstreamTaskInstances(Builder builder) {
            this.dependencyType = builder.dependencyType;
            this.taskInstance = builder.taskInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownstreamTaskInstances create() {
            return builder().build();
        }

        /**
         * @return dependencyType
         */
        public String getDependencyType() {
            return this.dependencyType;
        }

        /**
         * @return taskInstance
         */
        public TaskInstance getTaskInstance() {
            return this.taskInstance;
        }

        public static final class Builder {
            private String dependencyType; 
            private TaskInstance taskInstance; 

            private Builder() {
            } 

            private Builder(DownstreamTaskInstances model) {
                this.dependencyType = model.dependencyType;
                this.taskInstance = model.taskInstance;
            } 

            /**
             * <p>The dependency type.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder dependencyType(String dependencyType) {
                this.dependencyType = dependencyType;
                return this;
            }

            /**
             * <p>The task instance.</p>
             */
            public Builder taskInstance(TaskInstance taskInstance) {
                this.taskInstance = taskInstance;
                return this;
            }

            public DownstreamTaskInstances build() {
                return new DownstreamTaskInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstancesDataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TaskInstancesDataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstancesDataSource create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(TaskInstancesDataSource model) {
                this.name = model.name;
            } 

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TaskInstancesDataSource build() {
                return new TaskInstancesDataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstancesRuntime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        private TaskInstancesRuntime(Builder builder) {
            this.gateway = builder.gateway;
            this.processId = builder.processId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstancesRuntime create() {
            return builder().build();
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        public static final class Builder {
            private String gateway; 
            private String processId; 

            private Builder() {
            } 

            private Builder(TaskInstancesRuntime model) {
                this.gateway = model.gateway;
                this.processId = model.processId;
            } 

            /**
             * <p>The machine on which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.1.2</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The unique run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>T3_123</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            public TaskInstancesRuntime build() {
                return new TaskInstancesRuntime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstancesRuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private TaskInstancesRuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.image = builder.image;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstancesRuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String cu; 
            private String image; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(TaskInstancesRuntimeResource model) {
                this.cu = model.cu;
                this.image = model.image;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The compute unit (CU) consumption configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The image ID configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the schedule resource group configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public TaskInstancesRuntimeResource build() {
                return new TaskInstancesRuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private TaskInstancesDataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PeriodNumber")
        private Integer periodNumber;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectEnv")
        @Deprecated
        private String projectEnv;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RunNumber")
        private Integer runNumber;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private TaskInstancesRuntime runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private TaskInstancesRuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepType")
        private String stepType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("TriggerRecurrence")
        private String triggerRecurrence;

        @com.aliyun.core.annotation.NameInMap("TriggerTime")
        private Long triggerTime;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceType")
        private String workflowInstanceType;

        @com.aliyun.core.annotation.NameInMap("WorkflowName")
        private String workflowName;

        private TaskInstances(Builder builder) {
            this.baselineId = builder.baselineId;
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.envType = builder.envType;
            this.finishedTime = builder.finishedTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.owner = builder.owner;
            this.periodNumber = builder.periodNumber;
            this.priority = builder.priority;
            this.projectEnv = builder.projectEnv;
            this.projectId = builder.projectId;
            this.rerunMode = builder.rerunMode;
            this.runNumber = builder.runNumber;
            this.runtime = builder.runtime;
            this.runtimeResource = builder.runtimeResource;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.stepType = builder.stepType;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.timeout = builder.timeout;
            this.triggerRecurrence = builder.triggerRecurrence;
            this.triggerTime = builder.triggerTime;
            this.triggerType = builder.triggerType;
            this.workflowId = builder.workflowId;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowInstanceType = builder.workflowInstanceType;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstances create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSource
         */
        public TaskInstancesDataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return periodNumber
         */
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectEnv
         */
        public String getProjectEnv() {
            return this.projectEnv;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return runNumber
         */
        public Integer getRunNumber() {
            return this.runNumber;
        }

        /**
         * @return runtime
         */
        public TaskInstancesRuntime getRuntime() {
            return this.runtime;
        }

        /**
         * @return runtimeResource
         */
        public TaskInstancesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return triggerRecurrence
         */
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        /**
         * @return triggerTime
         */
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowInstanceType
         */
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        /**
         * @return workflowName
         */
        public String getWorkflowName() {
            return this.workflowName;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long bizdate; 
            private Long createTime; 
            private String createUser; 
            private TaskInstancesDataSource dataSource; 
            private String description; 
            private String envType; 
            private Long finishedTime; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String owner; 
            private Integer periodNumber; 
            private Integer priority; 
            private String projectEnv; 
            private Long projectId; 
            private String rerunMode; 
            private Integer runNumber; 
            private TaskInstancesRuntime runtime; 
            private TaskInstancesRuntimeResource runtimeResource; 
            private Long startedTime; 
            private String status; 
            private String stepType; 
            private Long taskId; 
            private String taskName; 
            private String taskType; 
            private Integer timeout; 
            private String triggerRecurrence; 
            private Long triggerTime; 
            private String triggerType; 
            private Long workflowId; 
            private Long workflowInstanceId; 
            private String workflowInstanceType; 
            private String workflowName; 

            private Builder() {
            } 

            private Builder(TaskInstances model) {
                this.baselineId = model.baselineId;
                this.bizdate = model.bizdate;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.envType = model.envType;
                this.finishedTime = model.finishedTime;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.owner = model.owner;
                this.periodNumber = model.periodNumber;
                this.priority = model.priority;
                this.projectEnv = model.projectEnv;
                this.projectId = model.projectId;
                this.rerunMode = model.rerunMode;
                this.runNumber = model.runNumber;
                this.runtime = model.runtime;
                this.runtimeResource = model.runtimeResource;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.stepType = model.stepType;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.timeout = model.timeout;
                this.triggerRecurrence = model.triggerRecurrence;
                this.triggerTime = model.triggerTime;
                this.triggerType = model.triggerType;
                this.workflowId = model.workflowId;
                this.workflowInstanceId = model.workflowInstanceId;
                this.workflowInstanceType = model.workflowInstanceType;
                this.workflowName = model.workflowName;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the user who created the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data source information associated with the instance.</p>
             */
            public Builder dataSource(TaskInstancesDataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment of the target data source. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The unique identifier of the task instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the user who last modified the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The account ID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The period number. Indicates which scheduling cycle of the day the instance is in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The run priority of the node. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The project environment. This field is deprecated. Use EnvType instead.</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder projectEnv(String projectEnv) {
                this.projectEnv = projectEnv;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The rerun configuration of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The current run number. The default value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runNumber(Integer runNumber) {
                this.runNumber = runNumber;
                return this;
            }

            /**
             * <p>The runtime information of the instance.</p>
             */
            public Builder runtime(TaskInstancesRuntime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The resource group information associated with the instance.</p>
             */
            public Builder runtimeResource(TaskInstancesRuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The time when the instance started running.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The run status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The dependency type.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            /**
             * <p>The ID of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the corresponding node.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period for node execution. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The run mode at the time of triggering. This parameter takes effect when TriggerType is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder triggerRecurrence(String triggerRecurrence) {
                this.triggerRecurrence = triggerRecurrence;
                return this;
            }

            /**
             * <p>The scheduled trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            /**
             * <p>The trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The ID of the workflow instance to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The type of the workflow instance to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder workflowInstanceType(String workflowInstanceType) {
                this.workflowInstanceType = workflowInstanceType;
                return this;
            }

            /**
             * <p>The name of the workflow to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test workflow</p>
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public TaskInstances build() {
                return new TaskInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTaskInstancesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownstreamTaskInstances")
        private java.util.List<DownstreamTaskInstances> downstreamTaskInstances;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TaskInstances")
        private java.util.List<TaskInstances> taskInstances;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.downstreamTaskInstances = builder.downstreamTaskInstances;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.taskInstances = builder.taskInstances;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return downstreamTaskInstances
         */
        public java.util.List<DownstreamTaskInstances> getDownstreamTaskInstances() {
            return this.downstreamTaskInstances;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return taskInstances
         */
        public java.util.List<TaskInstances> getTaskInstances() {
            return this.taskInstances;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DownstreamTaskInstances> downstreamTaskInstances; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<TaskInstances> taskInstances; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.downstreamTaskInstances = model.downstreamTaskInstances;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.taskInstances = model.taskInstances;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of downstream task instances.</p>
             */
            public Builder downstreamTaskInstances(java.util.List<DownstreamTaskInstances> downstreamTaskInstances) {
                this.downstreamTaskInstances = downstreamTaskInstances;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The list of task instances. This field is deprecated. Use DownstreamTaskInstances instead.</p>
             */
            public Builder taskInstances(java.util.List<TaskInstances> taskInstances) {
                this.taskInstances = taskInstances;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
