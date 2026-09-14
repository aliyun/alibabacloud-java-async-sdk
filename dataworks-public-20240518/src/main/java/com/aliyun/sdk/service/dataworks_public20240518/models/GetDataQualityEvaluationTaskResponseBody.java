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
 * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityEvaluationTaskResponseBody</p>
 */
public class GetDataQualityEvaluationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTask")
    private DataQualityEvaluationTask dataQualityEvaluationTask;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityEvaluationTaskResponseBody(Builder builder) {
        this.dataQualityEvaluationTask = builder.dataQualityEvaluationTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityEvaluationTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityEvaluationTask
     */
    public DataQualityEvaluationTask getDataQualityEvaluationTask() {
        return this.dataQualityEvaluationTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityEvaluationTask dataQualityEvaluationTask; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityEvaluationTaskResponseBody model) {
            this.dataQualityEvaluationTask = model.dataQualityEvaluationTask;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Data quality monitoring details.</p>
         */
        public Builder dataQualityEvaluationTask(DataQualityEvaluationTask dataQualityEvaluationTask) {
            this.dataQualityEvaluationTask = dataQualityEvaluationTask;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityEvaluationTaskResponseBody build() {
            return new GetDataQualityEvaluationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Hooks model) {
                this.condition = model.condition;
                this.type = model.type;
            } 

            /**
             * <p>Hook trigger condition. When this condition is met, the hook action is triggered. Currently, only two types of conditional expressions are supported:</p>
             * <ul>
             * <li>Specify a single group of rule severity type and rule validation status, e.g., <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>, which means the condition is met if any executed rule with severity High has a validation result of Critical.</li>
             * <li>Specify multiple groups of rule severity types and rule validation statuses, e.g., <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>, which means the condition is met if any executed rule has severity High with validation result Critical, or severity Normal with validation result Critical, or severity Normal with validation result Error. The severity enum in the conditional expression is consistent with the severity enum in DataQualityRule, and the status enum is consistent with the status in DataQualityResult.</li>
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
             * <li>BlockTaskInstance: Blocks the scheduled task from continuing to run. When data quality monitoring is triggered by a scheduled task, after the data quality monitoring completes, Hook.Condition is used to determine whether to block the scheduled task from continuing to run.</li>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NotificationChannels model) {
                this.channels = model.channels;
            } 

            /**
             * <p>Notification method.</p>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NotificationReceivers model) {
                this.extension = model.extension;
                this.receiverType = model.receiverType;
                this.receiverValues = model.receiverValues;
            } 

            /**
             * <p>Extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>{  &quot;atAll&quot;: true }</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Additional parameter settings when sending alerts. JSON format. Supported keys are as follows:</p>
             * <ul>
             * <li>atAll: Whether to @everyone in the group when sending DingTalk alerts. Takes effect when ReceiverType is DingdingUrl.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DingdingUrl</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>Alert receiver.</p>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Notifications model) {
                this.notificationChannels = model.notificationChannels;
                this.notificationReceivers = model.notificationReceivers;
            } 

            /**
             * <p>Notification method.</p>
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>Alert receiver settings.</p>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
     */
    public static class DataQualityEvaluationTaskNotifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private java.util.List<Notifications> notifications;

        private DataQualityEvaluationTaskNotifications(Builder builder) {
            this.condition = builder.condition;
            this.notifications = builder.notifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityEvaluationTaskNotifications create() {
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

            private Builder() {
            } 

            private Builder(DataQualityEvaluationTaskNotifications model) {
                this.condition = model.condition;
                this.notifications = model.notifications;
            } 

            /**
             * <p>Notification trigger condition. When this condition is met, the message notification is triggered. Currently, only two types of conditional expressions are supported:</p>
             * <ul>
             * <li>Specify a single group of rule severity type and rule validation status, e.g., <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>, which means the condition is met if any executed rule with severity High has a validation result of Critical.</li>
             * <li>Specify multiple groups of rule severity types and rule validation statuses, e.g., <code>(${severity} == &quot;High&quot;AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>, which means the condition is met if any executed rule has severity High with validation result Critical, or severity Normal with validation result Critical, or severity Normal with validation result Error. The severity enum in the conditional expression is consistent with the severity enum in DataQualityRule, and the status enum is consistent with the status in DataQualityResult.</li>
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
             * <p>Notification settings.</p>
             */
            public Builder notifications(java.util.List<Notifications> notifications) {
                this.notifications = notifications;
                return this;
            }

            public DataQualityEvaluationTaskNotifications build() {
                return new DataQualityEvaluationTaskNotifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Target model) {
                this.databaseType = model.databaseType;
                this.partitionSpec = model.partitionSpec;
                this.tableGuid = model.tableGuid;
                this.type = model.type;
            } 

            /**
             * <p>Database type to which the table belongs:</p>
             * <ul>
             * <li>maxcompute</li>
             * <li>hologres</li>
             * <li>cdh</li>
             * <li>analyticdb_for_mysql</li>
             * <li>starrocks</li>
             * <li>emr</li>
             * <li>analyticdb_for_postgresql</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>Partition range setting for data quality monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>pt=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>Unique ID of the table in Data Map.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.meta_open_api_test_sz.test_partition_tbl</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>Monitoring object type.</p>
             * <ul>
             * <li>Table: Table.</li>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.taskIds = model.taskIds;
                this.type = model.type;
            } 

            /**
             * <p>List of scheduled task IDs. Valid when Type is ByScheduledTaskInstance.</p>
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>Quality monitoring trigger type:</p>
             * <ul>
             * <li>ByManual: Manual trigger</li>
             * <li>ByScheduledTaskInstance: Scheduled task trigger</li>
             * <li>ByQualityNode: Quality node trigger</li>
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
     * {@link GetDataQualityEvaluationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityEvaluationTaskResponseBody</p>
     */
    public static class DataQualityEvaluationTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private java.util.List<Hooks> hooks;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private DataQualityEvaluationTaskNotifications notifications;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeConf")
        private String runtimeConf;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private DataQualityEvaluationTask(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
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

        public static DataQualityEvaluationTask create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
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
        public DataQualityEvaluationTaskNotifications getNotifications() {
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
            private Long dataSourceId; 
            private String description; 
            private java.util.List<Hooks> hooks; 
            private Long id; 
            private String name; 
            private DataQualityEvaluationTaskNotifications notifications; 
            private Long projectId; 
            private String runtimeConf; 
            private Target target; 
            private Trigger trigger; 

            private Builder() {
            } 

            private Builder(DataQualityEvaluationTask model) {
                this.dataSourceId = model.dataSourceId;
                this.description = model.description;
                this.hooks = model.hooks;
                this.id = model.id;
                this.name = model.name;
                this.notifications = model.notifications;
                this.projectId = model.projectId;
                this.runtimeConf = model.runtimeConf;
                this.target = model.target;
                this.trigger = model.trigger;
            } 

            /**
             * <p>Data source ID used by the quality monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>45238</p>
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>Description of the quality monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the quality monitoring task.</p>
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
             * <p>Data quality monitoring ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2178</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the quality monitoring task.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI create a data quality monitoring test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Notification subscription configuration.</p>
             */
            public Builder notifications(DataQualityEvaluationTaskNotifications notifications) {
                this.notifications = notifications;
                return this;
            }

            /**
             * <p>Workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2626</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Extended configuration. A JSON-formatted string. Only takes effect for EMR-type data quality monitoring.</p>
             * <ul>
             * <li>queue: The YARN queue used when executing EMR data quality validation. Defaults to the queue configured for the current project.</li>
             * <li>sqlEngine: The SQL engine used when executing EMR data validation.<ul>
             * <li>HIVE_SQL</li>
             * <li>SPARK_SQL</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
             */
            public Builder runtimeConf(String runtimeConf) {
                this.runtimeConf = runtimeConf;
                return this;
            }

            /**
             * <p>Data quality monitoring object.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>Trigger configuration of the data quality validation task.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public DataQualityEvaluationTask build() {
                return new DataQualityEvaluationTask(this);
            } 

        } 

    }
}
