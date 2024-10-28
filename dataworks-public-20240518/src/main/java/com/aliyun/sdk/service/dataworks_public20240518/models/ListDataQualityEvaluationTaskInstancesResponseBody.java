// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
 */
public class ListDataQualityEvaluationTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataQualityEvaluationTaskInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityEvaluationTaskInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBody build() {
            return new ListDataQualityEvaluationTaskInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
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
             * <p>Hook触发条件</p>
             * 
             * <strong>example:</strong>
             * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>Hook类型</p>
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class NofiticationReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List < String > receiverValues;

        private NofiticationReceivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NofiticationReceivers create() {
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
        public java.util.List < String > getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List < String > receiverValues; 

            /**
             * <p>扩展信息，格式为 json，例如钉钉机器人支持 at 所有人</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>告警接收人类型</p>
             * 
             * <strong>example:</strong>
             * <p>AliUid</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>告警接收人</p>
             */
            public Builder receiverValues(java.util.List < String > receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public NofiticationReceivers build() {
                return new NofiticationReceivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class NotificationChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List < String > channels;

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
        public java.util.List < String > getChannels() {
            return this.channels;
        }

        public static final class Builder {
            private java.util.List < String > channels; 

            /**
             * <p>通知方式</p>
             */
            public Builder channels(java.util.List < String > channels) {
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class Notifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NofiticationReceivers")
        private java.util.List < NofiticationReceivers> nofiticationReceivers;

        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List < NotificationChannels> notificationChannels;

        private Notifications(Builder builder) {
            this.nofiticationReceivers = builder.nofiticationReceivers;
            this.notificationChannels = builder.notificationChannels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notifications create() {
            return builder().build();
        }

        /**
         * @return nofiticationReceivers
         */
        public java.util.List < NofiticationReceivers> getNofiticationReceivers() {
            return this.nofiticationReceivers;
        }

        /**
         * @return notificationChannels
         */
        public java.util.List < NotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public static final class Builder {
            private java.util.List < NofiticationReceivers> nofiticationReceivers; 
            private java.util.List < NotificationChannels> notificationChannels; 

            /**
             * <p>告警接收人设置</p>
             */
            public Builder nofiticationReceivers(java.util.List < NofiticationReceivers> nofiticationReceivers) {
                this.nofiticationReceivers = nofiticationReceivers;
                return this;
            }

            /**
             * <p>通知方式</p>
             */
            public Builder notificationChannels(java.util.List < NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            public Notifications build() {
                return new Notifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class TaskNotifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private java.util.List < Notifications> notifications;

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
        public java.util.List < Notifications> getNotifications() {
            return this.notifications;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List < Notifications> notifications; 

            /**
             * <p>通知触发条件</p>
             * 
             * <strong>example:</strong>
             * <p>${severity} == &quot;High&quot;</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>具体的消息通知设置</p>
             */
            public Builder notifications(java.util.List < Notifications> notifications) {
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
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
             * <p>表所属的数据库类型</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>分区表的分区设置</p>
             * 
             * <strong>example:</strong>
             * <p>ds=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>表在数据地图中的唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>odps.unit_test.tb_unit_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>监控对象类型</p>
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List < Long > taskIds;

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
        public java.util.List < Long > getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Long > taskIds; 
            private String type; 

            /**
             * <p>具体指明哪些调度节点的实例执行成功后可以触发</p>
             */
            public Builder taskIds(java.util.List < Long > taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>何种事件可以触发质量校验任务执行</p>
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private java.util.List < Hooks> hooks;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private TaskNotifications notifications;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RuntimeConf")
        private String runtimeConf;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private Task(Builder builder) {
            this.description = builder.description;
            this.hooks = builder.hooks;
            this.id = builder.id;
            this.name = builder.name;
            this.notifications = builder.notifications;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.runtimeConf = builder.runtimeConf;
            this.target = builder.target;
            this.tenantId = builder.tenantId;
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
        public java.util.List < Hooks> getHooks() {
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < Hooks> hooks; 
            private Long id; 
            private String name; 
            private TaskNotifications notifications; 
            private Long projectId; 
            private String regionId; 
            private String runtimeConf; 
            private Target target; 
            private Long tenantId; 
            private Trigger trigger; 

            /**
             * <p>质量监控任务描述</p>
             * 
             * <strong>example:</strong>
             * <p>This is a daily run data quality evaluation plan.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>数据质量校验任务实例生命周期中的回调设置，目前只支持一个阻塞调度任务的Hook</p>
             */
            public Builder hooks(java.util.List < Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * <p>代表资源一级ID的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>质量监控任务名称</p>
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>数据质量校验任务通知订阅配置</p>
             */
            public Builder notifications(TaskNotifications notifications) {
                this.notifications = notifications;
                return this;
            }

            /**
             * <p>项目空间Id</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>代表region的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>使用数据源时的一些设置，目前只支持指定EMR的yarn队列、采集EMR表时把SQL引擎指定为SPARK-SQL</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK-SQL&quot; }</p>
             */
            public Builder runtimeConf(String runtimeConf) {
                this.runtimeConf = runtimeConf;
                return this;
            }

            /**
             * <p>参看 DataQualityTarget示例	数据质量校验任务的监控对象，参考 DataQualityTarget</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>租户Id</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>数据质量校验任务的触发配置</p>
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
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class DataQualityEvaluationTaskInstances extends TeaModel {
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

        private DataQualityEvaluationTaskInstances(Builder builder) {
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

        public static DataQualityEvaluationTaskInstances create() {
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>代表资源一级ID的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>项目空间Id</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Task.
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * TriggerContext.
             */
            public Builder triggerContext(String triggerContext) {
                this.triggerContext = triggerContext;
                return this;
            }

            public DataQualityEvaluationTaskInstances build() {
                return new DataQualityEvaluationTaskInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityEvaluationTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityEvaluationTaskInstancesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskInstances")
        private java.util.List < DataQualityEvaluationTaskInstances> dataQualityEvaluationTaskInstances;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.dataQualityEvaluationTaskInstances = builder.dataQualityEvaluationTaskInstances;
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
         * @return dataQualityEvaluationTaskInstances
         */
        public java.util.List < DataQualityEvaluationTaskInstances> getDataQualityEvaluationTaskInstances() {
            return this.dataQualityEvaluationTaskInstances;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DataQualityEvaluationTaskInstances> dataQualityEvaluationTaskInstances; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * DataQualityEvaluationTaskInstances.
             */
            public Builder dataQualityEvaluationTaskInstances(java.util.List < DataQualityEvaluationTaskInstances> dataQualityEvaluationTaskInstances) {
                this.dataQualityEvaluationTaskInstances = dataQualityEvaluationTaskInstances;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
