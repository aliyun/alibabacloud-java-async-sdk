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
 * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDownstreamTasksResponseBody</p>
 */
public class ListDownstreamTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDownstreamTasksResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownstreamTasksResponseBody create() {
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

        private Builder(ListDownstreamTasksResponseBody model) {
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
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDownstreamTasksResponseBody build() {
            return new ListDownstreamTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
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
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
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
             * <p>The number of compute units (CUs) consumed during task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the scheduling resource group configured for task execution.</p>
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
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
            this.recurrence = builder.recurrence;
            this.startTime = builder.startTime;
            this.timezone = builder.timezone;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cron; 
            private String endTime; 
            private String recurrence; 
            private String startTime; 
            private String timezone; 
            private String type; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.cron = model.cron;
                this.endTime = model.endTime;
                this.recurrence = model.recurrence;
                this.startTime = model.startTime;
                this.timezone = model.timezone;
                this.type = model.type;
            } 

            /**
             * <p>The cron expression. This parameter takes effect only when Type is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The expiration time of periodic triggering. This parameter takes effect only when Type is set to Scheduler.</p>
             * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>9999-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The execution mode when the task is triggered. This parameter takes effect only when Type is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause: Paused.</li>
             * <li>Skip: Dry run.</li>
             * <li>Normal: Normal execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * <p>The effective time of periodic triggering. This parameter takes effect only when Type is set to Scheduler.</p>
             * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>1970-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: Triggered by a scheduling cycle.</li>
             * <li>Manual: Manually triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

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

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceMode")
        private String instanceMode;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RerunInterval")
        private Integer rerunInterval;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RerunTimes")
        private Integer rerunTimes;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        private Task(Builder builder) {
            this.baselineId = builder.baselineId;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.envType = builder.envType;
            this.id = builder.id;
            this.instanceMode = builder.instanceMode;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.rerunInterval = builder.rerunInterval;
            this.rerunMode = builder.rerunMode;
            this.rerunTimes = builder.rerunTimes;
            this.runtimeResource = builder.runtimeResource;
            this.timeout = builder.timeout;
            this.trigger = builder.trigger;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceMode
         */
        public String getInstanceMode() {
            return this.instanceMode;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return rerunInterval
         */
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return rerunTimes
         */
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        /**
         * @return runtimeResource
         */
        public RuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long createTime; 
            private String createUser; 
            private DataSource dataSource; 
            private String description; 
            private String envType; 
            private Long id; 
            private String instanceMode; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 
            private Integer rerunInterval; 
            private String rerunMode; 
            private Integer rerunTimes; 
            private RuntimeResource runtimeResource; 
            private Integer timeout; 
            private Trigger trigger; 
            private String type; 
            private Long workflowId; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.baselineId = model.baselineId;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.envType = model.envType;
                this.id = model.id;
                this.instanceMode = model.instanceMode;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.rerunInterval = model.rerunInterval;
                this.rerunMode = model.rerunMode;
                this.rerunTimes = model.rerunTimes;
                this.runtimeResource = model.runtimeResource;
                this.timeout = model.timeout;
                this.trigger = model.trigger;
                this.type = model.type;
                this.workflowId = model.workflowId;
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
             * <p>The creation time.</p>
             * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the user who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The associated data source information.</p>
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
             * <p>The project environment. Valid values:</p>
             * <ul>
             * <li>Prod: Production.</li>
             * <li>Dev: Development.</li>
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
             * <p>The unique identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance generation mode. Valid values:</p>
             * <ul>
             * <li>T+1: Generated on the next day.</li>
             * <li>Immediately: Generated immediately.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>T+1</p>
             */
            public Builder instanceMode(String instanceMode) {
                this.instanceMode = instanceMode;
                return this;
            }

            /**
             * <p>The update time.</p>
             * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the user who updated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>The task priority. Valid values: 1 to 8.</p>
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
             * <p>The retry interval, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * <p>The rerun configuration of the task. Valid values:</p>
             * <ul>
             * <li>AllDenied: The task cannot be rerun regardless of whether it succeeds or fails.</li>
             * <li>FailureAllowed: The task can be rerun only when it fails.</li>
             * <li>AllAllowed: The task can be rerun regardless of whether it succeeds or fails.</li>
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
             * <p>The number of retries. This parameter takes effect only when the task is configured to be rerunnable.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * <p>The runtime environment configuration, such as the resource group information.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The task execution timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The trigger method of the task.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class DownstreamTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependencyType")
        private String dependencyType;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Task task;

        private DownstreamTasks(Builder builder) {
            this.dependencyType = builder.dependencyType;
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownstreamTasks create() {
            return builder().build();
        }

        /**
         * @return dependencyType
         */
        public String getDependencyType() {
            return this.dependencyType;
        }

        /**
         * @return task
         */
        public Task getTask() {
            return this.task;
        }

        public static final class Builder {
            private String dependencyType; 
            private Task task; 

            private Builder() {
            } 

            private Builder(DownstreamTasks model) {
                this.dependencyType = model.dependencyType;
                this.task = model.task;
            } 

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>Normal: Same-cycle dependency.</li>
             * <li>CrossCycle: Cross-cycle dependency.</li>
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
             * <p>The details of the task.</p>
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            public DownstreamTasks build() {
                return new DownstreamTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class TasksDataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TasksDataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksDataSource create() {
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

            private Builder(TasksDataSource model) {
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

            public TasksDataSource build() {
                return new TasksDataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class TasksRuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private TasksRuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.image = builder.image;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksRuntimeResource create() {
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

            private Builder(TasksRuntimeResource model) {
                this.cu = model.cu;
                this.image = model.image;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The number of compute units (CUs) consumed during task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the scheduling resource group configured for task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public TasksRuntimeResource build() {
                return new TasksRuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class TasksTrigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TasksTrigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
            this.recurrence = builder.recurrence;
            this.startTime = builder.startTime;
            this.timezone = builder.timezone;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksTrigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cron; 
            private String endTime; 
            private String recurrence; 
            private String startTime; 
            private String timezone; 
            private String type; 

            private Builder() {
            } 

            private Builder(TasksTrigger model) {
                this.cron = model.cron;
                this.endTime = model.endTime;
                this.recurrence = model.recurrence;
                this.startTime = model.startTime;
                this.timezone = model.timezone;
                this.type = model.type;
            } 

            /**
             * <p>The cron expression. This parameter takes effect only when Type is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The expiration time of periodic triggering. This parameter takes effect only when Type is set to Scheduler.</p>
             * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>9999-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The running mode when the task is triggered. This parameter takes effect only when Type is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * <p>The effective time of periodic triggering. This parameter takes effect only when Type is set to Scheduler.</p>
             * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>1970-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TasksTrigger build() {
                return new TasksTrigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private TasksDataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceMode")
        private String instanceMode;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectEnv")
        @Deprecated
        private String projectEnv;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RerunInterval")
        private Integer rerunInterval;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RerunTimes")
        private Integer rerunTimes;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private TasksRuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("StepType")
        private String stepType;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private TasksTrigger trigger;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        private Tasks(Builder builder) {
            this.baselineId = builder.baselineId;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.envType = builder.envType;
            this.id = builder.id;
            this.instanceMode = builder.instanceMode;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectEnv = builder.projectEnv;
            this.projectId = builder.projectId;
            this.rerunInterval = builder.rerunInterval;
            this.rerunMode = builder.rerunMode;
            this.rerunTimes = builder.rerunTimes;
            this.runtimeResource = builder.runtimeResource;
            this.stepType = builder.stepType;
            this.timeout = builder.timeout;
            this.trigger = builder.trigger;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
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
        public TasksDataSource getDataSource() {
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceMode
         */
        public String getInstanceMode() {
            return this.instanceMode;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return rerunInterval
         */
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return rerunTimes
         */
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        /**
         * @return runtimeResource
         */
        public TasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return trigger
         */
        public TasksTrigger getTrigger() {
            return this.trigger;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long createTime; 
            private String createUser; 
            private TasksDataSource dataSource; 
            private String description; 
            private String envType; 
            private Long id; 
            private String instanceMode; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private Integer priority; 
            private String projectEnv; 
            private Long projectId; 
            private Integer rerunInterval; 
            private String rerunMode; 
            private Integer rerunTimes; 
            private TasksRuntimeResource runtimeResource; 
            private String stepType; 
            private Integer timeout; 
            private TasksTrigger trigger; 
            private String type; 
            private Long workflowId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.baselineId = model.baselineId;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.envType = model.envType;
                this.id = model.id;
                this.instanceMode = model.instanceMode;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectEnv = model.projectEnv;
                this.projectId = model.projectId;
                this.rerunInterval = model.rerunInterval;
                this.rerunMode = model.rerunMode;
                this.rerunTimes = model.rerunTimes;
                this.runtimeResource = model.runtimeResource;
                this.stepType = model.stepType;
                this.timeout = model.timeout;
                this.trigger = model.trigger;
                this.type = model.type;
                this.workflowId = model.workflowId;
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
             * <p>The creation time.</p>
             * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the user who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The associated data source information.</p>
             */
            public Builder dataSource(TasksDataSource dataSource) {
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
             * <p>The project environment. Valid values:</p>
             * <ul>
             * <li>Prod: Production.</li>
             * <li>Dev: Development.</li>
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
             * <p>The unique identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance generation mode. Valid values:</p>
             * <ul>
             * <li>T+1: Generated on the next day.</li>
             * <li>Immediately: Generated immediately.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>T+1</p>
             */
            public Builder instanceMode(String instanceMode) {
                this.instanceMode = instanceMode;
                return this;
            }

            /**
             * <p>The update time.</p>
             * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the user who updated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>The task priority. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The project environment. Use EnvType instead.</p>
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
             * <p>The retry interval, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * <p>The rerun configuration of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The number of retries. This parameter takes effect only when the task is configured to be rerunnable.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * <p>The runtime environment configuration, such as the resource group information.</p>
             */
            public Builder runtimeResource(TasksRuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>Normal: Same-cycle dependency.</li>
             * <li>CrossCycle: Cross-cycle dependency.</li>
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
             * <p>The task execution timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The trigger method of the task.</p>
             */
            public Builder trigger(TasksTrigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownstreamTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownstreamTasksResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownstreamTasks")
        private java.util.List<DownstreamTasks> downstreamTasks;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.downstreamTasks = builder.downstreamTasks;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.tasks = builder.tasks;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return downstreamTasks
         */
        public java.util.List<DownstreamTasks> getDownstreamTasks() {
            return this.downstreamTasks;
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
         * @return tasks
         */
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DownstreamTasks> downstreamTasks; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Tasks> tasks; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.downstreamTasks = model.downstreamTasks;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.tasks = model.tasks;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of downstream tasks.</p>
             */
            public Builder downstreamTasks(java.util.List<DownstreamTasks> downstreamTasks) {
                this.downstreamTasks = downstreamTasks;
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
             * <p><strong>[Deprecated]</strong> The list of tasks. Use DownstreamTasks instead.</p>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
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
