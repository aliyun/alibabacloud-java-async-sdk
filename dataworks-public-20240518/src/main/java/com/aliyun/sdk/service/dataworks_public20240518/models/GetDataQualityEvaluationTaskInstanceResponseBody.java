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
 * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
 */
public class GetDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskInstance")
    private DataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityEvaluationTaskInstanceResponseBody(Builder builder) {
        this.dataQualityEvaluationTaskInstance = builder.dataQualityEvaluationTaskInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityEvaluationTaskInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataQualityEvaluationTaskInstance
     */
    public DataQualityEvaluationTaskInstance getDataQualityEvaluationTaskInstance() {
        return this.dataQualityEvaluationTaskInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance; 
        private String requestId; 

        /**
         * <p>The details of the monitor instance.</p>
         */
        public Builder dataQualityEvaluationTaskInstance(DataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance) {
            this.dataQualityEvaluationTaskInstance = dataQualityEvaluationTaskInstance;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBody build() {
            return new GetDataQualityEvaluationTaskInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class Hooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Hooks(Builder builder) {
            this.condition = builder.condition;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hooks create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String type; 

            /**
             * <p>Hook trigger condition. When this condition is met, hook action is triggered. Currently, only two conditional expressions are supported:</p>
             * <ul>
             * <li>Specify only one set of rule severity types AND rule verification status, such as <code>${severity} = = &quot;High&quot; AND ${status} = = &quot;Critical&quot;</code>, which indicates that in the executed rule, if the rule verification result of severity High is Critical, the condition is met.</li>
             * <li>Specify multiple sets of rule severity types AND rule verification status, such as <code>(${severity} = = &quot;High&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Error&quot;)</code>, if the rule verification result of severity High is Critical, the rule verification result of severity Normal is Critical, or the rule verification result of severity Normal is Error, the enumeration that satisfies the condition expression severity is consistent with the enumeration DataQualityRule in severity, and the enumeration of status is consistent with the status in DataQualityResult.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>Hook type. Currently, only one type is supported:</p>
             * <ul>
             * <li>BlockTaskInstance: the blocking scheduling task continues to run. Data quality monitoring is triggered by the scheduling task. After the data quality monitoring is completed, the Hook.Condition is used to determine whether the blocking scheduling task continues to run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BlockTaskInstance</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Hooks build() {
                return new Hooks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class NotificationChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

        private NotificationChannels(Builder builder) {
            this.channels = builder.channels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationChannels create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public static final class Builder {
            private java.util.List<String> channels; 

            /**
             * <p>The notification method.</p>
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            public NotificationChannels build() {
                return new NotificationChannels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class NotificationReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List<String> receiverValues;

        private NotificationReceivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationReceivers create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            /**
             * <p>Additional parameter settings for sending alerts in json format. The supported keys are as follows:</p>
             * <ul>
             * <li>atAll: when sending DingTalk alerts, do you need to @ everyone in the group. It takes effect when ReceiverType is DingdingUrl.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;atAll&quot;: true }</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The type of alert recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>DingdingUrl</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The recipient of the alert.</p>
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public NotificationReceivers build() {
                return new NotificationReceivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class Notifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List<NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
        private java.util.List<NotificationReceivers> notificationReceivers;

        private Notifications(Builder builder) {
            this.notificationChannels = builder.notificationChannels;
            this.notificationReceivers = builder.notificationReceivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notifications create() {
            return builder().build();
        }

        /**
         * @return notificationChannels
         */
        public java.util.List<NotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        /**
         * @return notificationReceivers
         */
        public java.util.List<NotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

        public static final class Builder {
            private java.util.List<NotificationChannels> notificationChannels; 
            private java.util.List<NotificationReceivers> notificationReceivers; 

            /**
             * <p>The notification method.</p>
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>The value of the receiver.</p>
             */
            public Builder notificationReceivers(java.util.List<NotificationReceivers> notificationReceivers) {
                this.notificationReceivers = notificationReceivers;
                return this;
            }

            public Notifications build() {
                return new Notifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class TaskNotifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private java.util.List<Notifications> notifications;

        private TaskNotifications(Builder builder) {
            this.condition = builder.condition;
            this.notifications = builder.notifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskNotifications create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return notifications
         */
        public java.util.List<Notifications> getNotifications() {
            return this.notifications;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List<Notifications> notifications; 

            /**
             * <p>The notification trigger condition. When this condition is met, a message notification is triggered. Currently, only two conditional expressions are supported:</p>
             * <ul>
             * <li>Specify only one set of rule severity types AND rule verification status, such as <code>${severity} = = &quot;High&quot; AND ${status} = = &quot;Critical&quot;</code>, which indicates that in the executed rule, if the rule verification result of severity High is Critical, the condition is met.</li>
             * <li>Specify multiple sets of rule severity types AND rule verification status, such as <code>(${severity} = = &quot;High&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Error&quot;)</code>, if the rule verification result of severity High is Critical, the rule verification result of severity Normal is Critical, or the rule verification result of severity Normal is Error, the enumeration that satisfies the condition expression severity is consistent with the enumeration DataQualityRule in severity, and the enumeration of status is consistent with the status in DataQualityResult.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The alert notification methods.</p>
             */
            public Builder notifications(java.util.List<Notifications> notifications) {
                this.notifications = notifications;
                return this;
            }

            public TaskNotifications build() {
                return new TaskNotifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("PartitionSpec")
        private String partitionSpec;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.databaseType = builder.databaseType;
            this.partitionSpec = builder.partitionSpec;
            this.tableGuid = builder.tableGuid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return partitionSpec
         */
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String databaseType; 
            private String partitionSpec; 
            private String tableGuid; 
            private String type; 

            /**
             * <p>The type of the database to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>The partition range monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>pt=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>The unique ID of the table in the data map.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.api_trace.ods_d_api_log</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The type of the monitoring object.</p>
             * <ul>
             * <li>Table: Table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List<Long> taskIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.taskIds = builder.taskIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return taskIds
         */
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> taskIds; 
            private String type; 

            /**
             * <p>The Id list of the scheduled task, which is valid when the Type is ByScheduledTaskInstance.</p>
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>Quality Monitoring trigger type:</p>
             * <ul>
             * <li>ByManual: manually triggered. Default value</li>
             * <li>ByScheduledTaskInstance: triggered by associated scheduling tasks</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ByScheduledTaskInstance</p>
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
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private java.util.List<Hooks> hooks;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private TaskNotifications notifications;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeConf")
        private String runtimeConf;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private Task(Builder builder) {
            this.description = builder.description;
            this.hooks = builder.hooks;
            this.id = builder.id;
            this.name = builder.name;
            this.notifications = builder.notifications;
            this.projectId = builder.projectId;
            this.runtimeConf = builder.runtimeConf;
            this.target = builder.target;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hooks
         */
        public java.util.List<Hooks> getHooks() {
            return this.hooks;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifications
         */
        public TaskNotifications getNotifications() {
            return this.notifications;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return runtimeConf
         */
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Hooks> hooks; 
            private Long id; 
            private String name; 
            private TaskNotifications notifications; 
            private Long projectId; 
            private String runtimeConf; 
            private Target target; 
            private Trigger trigger; 

            /**
             * <p>The description of the monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI quality monitoring test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Callback settings.</p>
             */
            public Builder hooks(java.util.List<Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * <p>The ID of the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>28544990</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>Data quality OpenAPI monitoring test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configurations of alert notifications.</p>
             */
            public Builder notifications(TaskNotifications notifications) {
                this.notifications = notifications;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>20629</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Extended configuration, JSON-formatted string, takes effect only for EMR-type data quality monitoring.</p>
             * <ul>
             * <li>queue: the yarn queue used when performing EMR data quality verification. The default queue is the queue configured for this project.</li>
             * <li>sqlEngine: SQL engine used when performing EMR data verification<ul>
             * <li>HIVE_ SQL</li>
             * <li>SPARK_ SQL</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;queue&quot;: &quot;default&quot; }</p>
             */
            public Builder runtimeConf(String runtimeConf) {
                this.runtimeConf = runtimeConf;
                return this;
            }

            /**
             * <p>For more information, see DataQualityTarget monitoring objects for the sample data quality verification task. For more information, see DataQualityTarget.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The trigger configuration of the data quality verification task.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskInstanceResponseBody</p>
     */
    public static class DataQualityEvaluationTaskInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Task task;

        @com.aliyun.core.annotation.NameInMap("TriggerContext")
        private String triggerContext;

        private DataQualityEvaluationTaskInstance(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.parameters = builder.parameters;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.task = builder.task;
            this.triggerContext = builder.triggerContext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityEvaluationTaskInstance create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return task
         */
        public Task getTask() {
            return this.task;
        }

        /**
         * @return triggerContext
         */
        public String getTriggerContext() {
            return this.triggerContext;
        }

        public static final class Builder {
            private Long createTime; 
            private Long finishTime; 
            private Long id; 
            private String parameters; 
            private Long projectId; 
            private String status; 
            private Task task; 
            private String triggerContext; 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1716344665000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1716344665000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the data quality monitoring instance.</p>
             * 
             * <strong>example:</strong>
             * <p>7234231689</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Data quality verification execution parameters in JSON format. The available keys are as follows:</p>
             * <ul>
             * <li>triggerTime: the millisecond timestamp of the trigger time. The baseline time of the $[yyyymmdd] expression in the data range of data quality monitoring. Required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>98330</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the data quality monitoring instance.</p>
             * <ul>
             * <li>Running: Verifying</li>
             * <li>Error: A rule verification Error occurred.</li>
             * <li>Passed: all rules are verified</li>
             * <li>Warned: normal alarm threshold triggered by rules</li>
             * <li>Critical: Threshold for serious alerts triggered by rules</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Passed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The monitor.</p>
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * <p>The context information when the instance is triggered, in JSON format. The possible keys are as follows:</p>
             * <ul>
             * <li>TriggerClient: the trigger source of the data quality monitoring instance, such as CWF2 (scheduling system), may be added later.</li>
             * <li>TriggerClientId: associated with a specific business resource in the source system. For example, if TriggerClient is CWF2, the ID of the scheduling task is recorded here.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;triggerClient&quot;: &quot;CWF2&quot;, &quot;triggerClientId&quot;: 70001238945 }</p>
             */
            public Builder triggerContext(String triggerContext) {
                this.triggerContext = triggerContext;
                return this;
            }

            public DataQualityEvaluationTaskInstance build() {
                return new DataQualityEvaluationTaskInstance(this);
            } 

        } 

    }
}
