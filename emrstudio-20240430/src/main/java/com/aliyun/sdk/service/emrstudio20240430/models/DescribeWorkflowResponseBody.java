// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowResponseBody</p>
 */
public class DescribeWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schedule")
    private Schedule schedule;

    @com.aliyun.core.annotation.NameInMap("taskRelations")
    private java.util.List < TaskRelations> taskRelations;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List < Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("workflow")
    private Workflow workflow;

    private DescribeWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schedule = builder.schedule;
        this.taskRelations = builder.taskRelations;
        this.tasks = builder.tasks;
        this.workflow = builder.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * @return taskRelations
     */
    public java.util.List < TaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return workflow
     */
    public Workflow getWorkflow() {
        return this.workflow;
    }

    public static final class Builder {
        private String requestId; 
        private Schedule schedule; 
        private java.util.List < TaskRelations> taskRelations; 
        private java.util.List < Tasks> tasks; 
        private Workflow workflow; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * schedule.
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * taskRelations.
         */
        public Builder taskRelations(java.util.List < TaskRelations> taskRelations) {
            this.taskRelations = taskRelations;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * workflow.
         */
        public Builder workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        public DescribeWorkflowResponseBody build() {
            return new DescribeWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkflowResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertGroupId")
        private String alertGroupId;

        @com.aliyun.core.annotation.NameInMap("alertStrategy")
        private String alertStrategy;

        @com.aliyun.core.annotation.NameInMap("cronExpr")
        private String cronExpr;

        @com.aliyun.core.annotation.NameInMap("emrClusterId")
        private String emrClusterId;

        @com.aliyun.core.annotation.NameInMap("failureStrategy")
        private String failureStrategy;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("scheduleEndTime")
        private String scheduleEndTime;

        @com.aliyun.core.annotation.NameInMap("scheduleStartTime")
        private String scheduleStartTime;

        @com.aliyun.core.annotation.NameInMap("scheduleState")
        private String scheduleState;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("workflowInstancePriority")
        private String workflowInstancePriority;

        private Schedule(Builder builder) {
            this.alertGroupId = builder.alertGroupId;
            this.alertStrategy = builder.alertStrategy;
            this.cronExpr = builder.cronExpr;
            this.emrClusterId = builder.emrClusterId;
            this.failureStrategy = builder.failureStrategy;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduleEndTime = builder.scheduleEndTime;
            this.scheduleStartTime = builder.scheduleStartTime;
            this.scheduleState = builder.scheduleState;
            this.timeZone = builder.timeZone;
            this.workflowInstancePriority = builder.workflowInstancePriority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return alertGroupId
         */
        public String getAlertGroupId() {
            return this.alertGroupId;
        }

        /**
         * @return alertStrategy
         */
        public String getAlertStrategy() {
            return this.alertStrategy;
        }

        /**
         * @return cronExpr
         */
        public String getCronExpr() {
            return this.cronExpr;
        }

        /**
         * @return emrClusterId
         */
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        /**
         * @return failureStrategy
         */
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scheduleEndTime
         */
        public String getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        /**
         * @return scheduleStartTime
         */
        public String getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        /**
         * @return scheduleState
         */
        public String getScheduleState() {
            return this.scheduleState;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return workflowInstancePriority
         */
        public String getWorkflowInstancePriority() {
            return this.workflowInstancePriority;
        }

        public static final class Builder {
            private String alertGroupId; 
            private String alertStrategy; 
            private String cronExpr; 
            private String emrClusterId; 
            private String failureStrategy; 
            private String resourceGroupId; 
            private String scheduleEndTime; 
            private String scheduleStartTime; 
            private String scheduleState; 
            private String timeZone; 
            private String workflowInstancePriority; 

            /**
             * alertGroupId.
             */
            public Builder alertGroupId(String alertGroupId) {
                this.alertGroupId = alertGroupId;
                return this;
            }

            /**
             * alertStrategy.
             */
            public Builder alertStrategy(String alertStrategy) {
                this.alertStrategy = alertStrategy;
                return this;
            }

            /**
             * cronExpr.
             */
            public Builder cronExpr(String cronExpr) {
                this.cronExpr = cronExpr;
                return this;
            }

            /**
             * emrClusterId.
             */
            public Builder emrClusterId(String emrClusterId) {
                this.emrClusterId = emrClusterId;
                return this;
            }

            /**
             * failureStrategy.
             */
            public Builder failureStrategy(String failureStrategy) {
                this.failureStrategy = failureStrategy;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * scheduleEndTime.
             */
            public Builder scheduleEndTime(String scheduleEndTime) {
                this.scheduleEndTime = scheduleEndTime;
                return this;
            }

            /**
             * scheduleStartTime.
             */
            public Builder scheduleStartTime(String scheduleStartTime) {
                this.scheduleStartTime = scheduleStartTime;
                return this;
            }

            /**
             * scheduleState.
             */
            public Builder scheduleState(String scheduleState) {
                this.scheduleState = scheduleState;
                return this;
            }

            /**
             * timeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * workflowInstancePriority.
             */
            public Builder workflowInstancePriority(String workflowInstancePriority) {
                this.workflowInstancePriority = workflowInstancePriority;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkflowResponseBody</p>
     */
    public static class TaskRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("postTaskId")
        private String postTaskId;

        @com.aliyun.core.annotation.NameInMap("preTaskId")
        private String preTaskId;

        private TaskRelations(Builder builder) {
            this.postTaskId = builder.postTaskId;
            this.preTaskId = builder.preTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRelations create() {
            return builder().build();
        }

        /**
         * @return postTaskId
         */
        public String getPostTaskId() {
            return this.postTaskId;
        }

        /**
         * @return preTaskId
         */
        public String getPreTaskId() {
            return this.preTaskId;
        }

        public static final class Builder {
            private String postTaskId; 
            private String preTaskId; 

            /**
             * postTaskId.
             */
            public Builder postTaskId(String postTaskId) {
                this.postTaskId = postTaskId;
                return this;
            }

            /**
             * preTaskId.
             */
            public Builder preTaskId(String preTaskId) {
                this.preTaskId = preTaskId;
                return this;
            }

            public TaskRelations build() {
                return new TaskRelations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkflowResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        private Tasks(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.taskId = builder.taskId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String taskId; 
            private Integer version; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkflowResponseBody</p>
     */
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("executionType")
        private String executionType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
        private String parentDirectoryId;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workflowId")
        private String workflowId;

        @com.aliyun.core.annotation.NameInMap("workflowParams")
        private String workflowParams;

        private Workflow(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.executionType = builder.executionType;
            this.name = builder.name;
            this.parentDirectoryId = builder.parentDirectoryId;
            this.timeout = builder.timeout;
            this.updateTime = builder.updateTime;
            this.workflowId = builder.workflowId;
            this.workflowParams = builder.workflowParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executionType
         */
        public String getExecutionType() {
            return this.executionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentDirectoryId
         */
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowParams
         */
        public String getWorkflowParams() {
            return this.workflowParams;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String executionType; 
            private String name; 
            private String parentDirectoryId; 
            private Integer timeout; 
            private String updateTime; 
            private String workflowId; 
            private String workflowParams; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * executionType.
             */
            public Builder executionType(String executionType) {
                this.executionType = executionType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parentDirectoryId.
             */
            public Builder parentDirectoryId(String parentDirectoryId) {
                this.parentDirectoryId = parentDirectoryId;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * workflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * workflowParams.
             */
            public Builder workflowParams(String workflowParams) {
                this.workflowParams = workflowParams;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
}
