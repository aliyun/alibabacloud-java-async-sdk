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
 * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUpstreamTaskInstancesResponseBody</p>
 */
public class ListUpstreamTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUpstreamTaskInstancesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUpstreamTaskInstancesResponseBody create() {
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

        private Builder(ListUpstreamTaskInstancesResponseBody model) {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUpstreamTaskInstancesResponseBody build() {
            return new ListUpstreamTaskInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
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
             * <p>The name of the data source.</p>
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
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
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
             * <p>The host for running.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.1.2</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The instance run ID.</p>
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
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
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
             * <p>The default number of compute units (CUs) configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The ID of the resource group for scheduling configured for task running.</p>
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
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
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
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

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
            private String projectEnv; 
            private Long projectId; 
            private String rerunMode; 
            private Integer runNumber; 
            private Runtime runtime; 
            private RuntimeResource runtimeResource; 
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
             * <p>The data timestamp.</p>
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
             * <p>The account ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The information about the associated data source.</p>
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
             * <p>The environment of the workspace. Valid values:</p>
             * <ul>
             * <li>Prod</li>
             * <li>Dev</li>
             * </ul>
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
             * <p>The instance ID.</p>
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
             * <p>The account ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The account ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The sequence number of the period. Indicates which cycle of the day the task instance is in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The priority of the task. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The environment of the workspace. Valid values:</p>
             * <ul>
             * <li>Prod: production environment</li>
             * <li>Dev: development environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder projectEnv(String projectEnv) {
                this.projectEnv = projectEnv;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The rerun mode. Valid values:</p>
             * <ul>
             * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
             * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
             * <li>AllAllowed: The task can be rerun regardless of whether the task is successfully run or fails to run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The number of times the instance is run. By default, the value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runNumber(Integer runNumber) {
                this.runNumber = runNumber;
                return this;
            }

            /**
             * <p>The runtime information about the instance.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The configurations of the runtime environment, such as the resource group information.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>NotRun: The instance is not run.</li>
             * <li>Running: The instance is running.</li>
             * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
             * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
             * <li>WaitResource: The instance is waiting for resources.</li>
             * <li>Failure: The instance fails to be run.</li>
             * <li>Success: The instance is successfully run.</li>
             * <li>Checking: Data quality is being checked for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The scheduling dependency type. Valid values:</p>
             * <ul>
             * <li>Normal: same-cycle scheduling dependency</li>
             * <li>CrossCycle: cross-cycle scheduling dependency</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            /**
             * <p>The ID of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period of task running. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause</li>
             * <li>Skip</li>
             * <li>Normal</li>
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
             * <p>The scheduling time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: scheduling cycle-based trigger</li>
             * <li>Manual: manual trigger</li>
             * </ul>
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
             * <p>The workflow instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The type of the workflow instance. Valid values:</p>
             * <ul>
             * <li>SmokeTest</li>
             * <li>SupplementData</li>
             * <li>Manual</li>
             * <li>ManualWorkflow</li>
             * <li>Normal</li>
             * <li>ManualFlow</li>
             * </ul>
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
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstanceDataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TaskInstanceDataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstanceDataSource create() {
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

            private Builder(TaskInstanceDataSource model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TaskInstanceDataSource build() {
                return new TaskInstanceDataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstanceRuntime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        private TaskInstanceRuntime(Builder builder) {
            this.gateway = builder.gateway;
            this.processId = builder.processId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstanceRuntime create() {
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

            private Builder(TaskInstanceRuntime model) {
                this.gateway = model.gateway;
                this.processId = model.processId;
            } 

            /**
             * <p>The host for running.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.1.2</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The instance run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>T3_123</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            public TaskInstanceRuntime build() {
                return new TaskInstanceRuntime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
     */
    public static class TaskInstanceRuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private TaskInstanceRuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.image = builder.image;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstanceRuntimeResource create() {
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

            private Builder(TaskInstanceRuntimeResource model) {
                this.cu = model.cu;
                this.image = model.image;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The default number of compute units (CUs) configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The ID of the resource group for scheduling configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public TaskInstanceRuntimeResource build() {
                return new TaskInstanceRuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
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
        private TaskInstanceDataSource dataSource;

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
        private TaskInstanceRuntime runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private TaskInstanceRuntimeResource runtimeResource;

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
        public TaskInstanceDataSource getDataSource() {
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
        public TaskInstanceRuntime getRuntime() {
            return this.runtime;
        }

        /**
         * @return runtimeResource
         */
        public TaskInstanceRuntimeResource getRuntimeResource() {
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
            private TaskInstanceDataSource dataSource; 
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
            private TaskInstanceRuntime runtime; 
            private TaskInstanceRuntimeResource runtimeResource; 
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
             * <p>The data timestamp.</p>
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
             * <p>The account ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The information about the associated data source.</p>
             */
            public Builder dataSource(TaskInstanceDataSource dataSource) {
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
             * <p>The environment in which the data source is used. Valid values:</p>
             * <ul>
             * <li>Dev</li>
             * <li>Prod</li>
             * </ul>
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
             * <p>The instance ID.</p>
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
             * <p>The account ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The account ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The sequence number of the cycle. This parameter indicates the cycle of the task instance on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The priority of the task. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The rerun mode.</p>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The number of times the instance is run. By default, the value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runNumber(Integer runNumber) {
                this.runNumber = runNumber;
                return this;
            }

            /**
             * <p>The runtime information about the instance.</p>
             */
            public Builder runtime(TaskInstanceRuntime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The configurations of the runtime environment, such as the resource group information.</p>
             */
            public Builder runtimeResource(TaskInstanceRuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>NotRun: The instance is not run.</li>
             * <li>Running: The instance is running.</li>
             * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
             * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
             * <li>WaitResource: The instance is waiting for resources.</li>
             * <li>Failure: The instance fails to be run.</li>
             * <li>Success: The instance is successfully run.</li>
             * <li>Checking: Data quality is being checked for the instance.</li>
             * <li>WaitTrigger: The instance is waiting to be triggered by external scheduling systems.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task for which the instance is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period of task running. Unit: seconds.</p>
             * <p>Note: The value of this parameter is rounded up by hour.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause</li>
             * <li>Skip</li>
             * <li>Normal</li>
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
             * <p>The scheduling time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: scheduling cycle-based trigger</li>
             * <li>Manual: manual trigger</li>
             * </ul>
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
             * <p>The workflow instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The type of the workflow instance. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Manual</li>
             * <li>SmokeTest</li>
             * <li>SupplementData</li>
             * <li>ManualWorkflow</li>
             * </ul>
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
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
     */
    public static class UpstreamTaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependencyType")
        private String dependencyType;

        @com.aliyun.core.annotation.NameInMap("TaskInstance")
        private TaskInstance taskInstance;

        private UpstreamTaskInstances(Builder builder) {
            this.dependencyType = builder.dependencyType;
            this.taskInstance = builder.taskInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamTaskInstances create() {
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

            private Builder(UpstreamTaskInstances model) {
                this.dependencyType = model.dependencyType;
                this.taskInstance = model.taskInstance;
            } 

            /**
             * <p>The scheduling dependency type. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>CrossCycle</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder dependencyType(String dependencyType) {
                this.dependencyType = dependencyType;
                return this;
            }

            /**
             * <p>The information about a task instance.</p>
             */
            public Builder taskInstance(TaskInstance taskInstance) {
                this.taskInstance = taskInstance;
                return this;
            }

            public UpstreamTaskInstances build() {
                return new UpstreamTaskInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUpstreamTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpstreamTaskInstancesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TaskInstances")
        private java.util.List<TaskInstances> taskInstances;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UpstreamTaskInstances")
        private java.util.List<UpstreamTaskInstances> upstreamTaskInstances;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.taskInstances = builder.taskInstances;
            this.totalCount = builder.totalCount;
            this.upstreamTaskInstances = builder.upstreamTaskInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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

        /**
         * @return upstreamTaskInstances
         */
        public java.util.List<UpstreamTaskInstances> getUpstreamTaskInstances() {
            return this.upstreamTaskInstances;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<TaskInstances> taskInstances; 
            private Integer totalCount; 
            private java.util.List<UpstreamTaskInstances> upstreamTaskInstances; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.taskInstances = model.taskInstances;
                this.totalCount = model.totalCount;
                this.upstreamTaskInstances = model.upstreamTaskInstances;
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
             * <p>The instances. This parameter is deprecated and replaced by the UpstreamTaskInstances parameter.</p>
             */
            public Builder taskInstances(java.util.List<TaskInstances> taskInstances) {
                this.taskInstances = taskInstances;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The ancestor instances.</p>
             */
            public Builder upstreamTaskInstances(java.util.List<UpstreamTaskInstances> upstreamTaskInstances) {
                this.upstreamTaskInstances = upstreamTaskInstances;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
