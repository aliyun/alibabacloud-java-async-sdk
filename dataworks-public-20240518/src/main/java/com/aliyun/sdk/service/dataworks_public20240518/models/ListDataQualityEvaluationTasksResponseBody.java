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
 * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataQualityEvaluationTasksResponseBody</p>
 */
public class ListDataQualityEvaluationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataQualityEvaluationTasksResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityEvaluationTasksResponseBody create() {
        return builder().build();
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
         * <p>691CA452-D37A-4ED0-9441</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataQualityEvaluationTasksResponseBody build() {
            return new ListDataQualityEvaluationTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The trigger configuration of the callback event.</p>
             * 
             * <strong>example:</strong>
             * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The type of the callback event. Valid values:</p>
             * <ul>
             * <li>BlockTaskInstance. The value indicates that an auto triggered node is blocked.</li>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The alert notification methods.</p>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The extended information in the JSON format. For example, the DingTalk chatbot can remind all members in a DingTalk group by using the at sign (@).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The type of the alert recipient. Valid values:</p>
             * <ul>
             * <li>AliUid: Alibaba Cloud account ID</li>
             * <li>WebhookUrl: URL of a custom webhook</li>
             * <li>DingdingUrl: DingTalk chatbot URL</li>
             * <li>FeishuUrl: Lark chatbot URL</li>
             * <li>WeixinUrl: WeCom chatbot URL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AliUid</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The alert recipients.</p>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The alert notification methods.</p>
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>The alert recipients.</p>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
     */
    public static class DataQualityEvaluationTasksNotifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private java.util.List<Notifications> notifications;

        private DataQualityEvaluationTasksNotifications(Builder builder) {
            this.condition = builder.condition;
            this.notifications = builder.notifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityEvaluationTasksNotifications create() {
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
             * <p>The trigger condition of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>${severity} == &quot;High&quot;</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The configurations for the alert notification.</p>
             */
            public Builder notifications(java.util.List<Notifications> notifications) {
                this.notifications = notifications;
                return this;
            }

            public DataQualityEvaluationTasksNotifications build() {
                return new DataQualityEvaluationTasksNotifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The type of the database to which the table belongs. Valid values:</p>
             * <ul>
             * <li>maxcompute</li>
             * <li>emr</li>
             * <li>cdh</li>
             * <li>hologres</li>
             * <li>analyticdb_for_postgresql</li>
             * <li>analyticdb_for_mysql</li>
             * <li>starrocks</li>
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
             * <p>The configuration of the partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>The ID of the table in Data Map.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.unit_test.tb_unit_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The type of the monitored object. Valid values:</p>
             * <ul>
             * <li>Table</li>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
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
             * <p>The IDs of the auto triggered nodes of which the instances are successfully run. This parameter takes effect only if the Type parameter is set to ByScheduledTaskInstance.</p>
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The trigger condition of the task. Valid values:</p>
             * <ul>
             * <li>ByScheduledTaskInstance. The value indicates that the task is triggered when the instance of an auto triggered node is successfully run.</li>
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
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
     */
    public static class DataQualityEvaluationTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private java.util.List<Hooks> hooks;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private DataQualityEvaluationTasksNotifications notifications;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeConf")
        private String runtimeConf;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private DataQualityEvaluationTasks(Builder builder) {
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

        public static DataQualityEvaluationTasks create() {
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
        public DataQualityEvaluationTasksNotifications getNotifications() {
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
            private DataQualityEvaluationTasksNotifications notifications; 
            private Long projectId; 
            private String runtimeConf; 
            private Target target; 
            private Trigger trigger; 

            /**
             * <p>The description of the data quality monitoring task. The description can be up to 65,535 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a daily run data quality evaluation plan</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The callback configurations of the task during the instance lifecycle. Blocking an auto triggered node is a type of callback event. Only this type is supported.</p>
             */
            public Builder hooks(java.util.List<Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * <p>The ID of the data quality monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data quality monitoring task. The name can be up to 255 characters in length and can contain digits, letters, and punctuation marks.</p>
             * 
             * <strong>example:</strong>
             * <p>Data quality verification task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configurations for alert notifications.</p>
             */
            public Builder notifications(DataQualityEvaluationTasksNotifications notifications) {
                this.notifications = notifications;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The configuration of the data source. The value of the queue field is default, and that of the sqlEngine field can be set to SPARK_SQL, KYUUBI, PRESTO_SQL, or HIVE_SQL. The value default indicates the YARN queue for E-MapReduce (EMR) tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK-SQL&quot; }</p>
             */
            public Builder runtimeConf(String runtimeConf) {
                this.runtimeConf = runtimeConf;
                return this;
            }

            /**
             * <p>The monitored object of the task.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The trigger configuration of the task.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public DataQualityEvaluationTasks build() {
                return new DataQualityEvaluationTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTasksResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTasks")
        private java.util.List<DataQualityEvaluationTasks> dataQualityEvaluationTasks;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private PagingInfo(Builder builder) {
            this.dataQualityEvaluationTasks = builder.dataQualityEvaluationTasks;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return dataQualityEvaluationTasks
         */
        public java.util.List<DataQualityEvaluationTasks> getDataQualityEvaluationTasks() {
            return this.dataQualityEvaluationTasks;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataQualityEvaluationTasks> dataQualityEvaluationTasks; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * <p>The data quality monitoring tasks.</p>
             */
            public Builder dataQualityEvaluationTasks(java.util.List<DataQualityEvaluationTasks> dataQualityEvaluationTasks) {
                this.dataQualityEvaluationTasks = dataQualityEvaluationTasks;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>131</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
