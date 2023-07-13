// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridMonitorTaskRequest</p>
 */
public class CreateHybridMonitorTaskRequest extends Request {
    @Query
    @NameInMap("AttachLabels")
    private java.util.List < AttachLabels> attachLabels;

    @Query
    @NameInMap("CollectInterval")
    private String collectInterval;

    @Query
    @NameInMap("CollectTargetType")
    @Validation(required = true)
    private String collectTargetType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("SLSProcessConfig")
    private SLSProcessConfig SLSProcessConfig;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;

    @Query
    @NameInMap("TargetUserIdList")
    private String targetUserIdList;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    @Query
    @NameInMap("YARMConfig")
    private String YARMConfig;

    private CreateHybridMonitorTaskRequest(Builder builder) {
        super(builder);
        this.attachLabels = builder.attachLabels;
        this.collectInterval = builder.collectInterval;
        this.collectTargetType = builder.collectTargetType;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.SLSProcessConfig = builder.SLSProcessConfig;
        this.targetUserId = builder.targetUserId;
        this.targetUserIdList = builder.targetUserIdList;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.YARMConfig = builder.YARMConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridMonitorTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachLabels
     */
    public java.util.List < AttachLabels> getAttachLabels() {
        return this.attachLabels;
    }

    /**
     * @return collectInterval
     */
    public String getCollectInterval() {
        return this.collectInterval;
    }

    /**
     * @return collectTargetType
     */
    public String getCollectTargetType() {
        return this.collectTargetType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return SLSProcessConfig
     */
    public SLSProcessConfig getSLSProcessConfig() {
        return this.SLSProcessConfig;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return targetUserIdList
     */
    public String getTargetUserIdList() {
        return this.targetUserIdList;
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
     * @return YARMConfig
     */
    public String getYARMConfig() {
        return this.YARMConfig;
    }

    public static final class Builder extends Request.Builder<CreateHybridMonitorTaskRequest, Builder> {
        private java.util.List < AttachLabels> attachLabels; 
        private String collectInterval; 
        private String collectTargetType; 
        private String description; 
        private String groupId; 
        private String namespace; 
        private SLSProcessConfig SLSProcessConfig; 
        private String targetUserId; 
        private String targetUserIdList; 
        private String taskName; 
        private String taskType; 
        private String YARMConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridMonitorTaskRequest request) {
            super(request);
            this.attachLabels = request.attachLabels;
            this.collectInterval = request.collectInterval;
            this.collectTargetType = request.collectTargetType;
            this.description = request.description;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.SLSProcessConfig = request.SLSProcessConfig;
            this.targetUserId = request.targetUserId;
            this.targetUserIdList = request.targetUserIdList;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.YARMConfig = request.YARMConfig;
        } 

        /**
         * AttachLabels.
         */
        public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
            this.putQueryParameter("AttachLabels", attachLabels);
            this.attachLabels = attachLabels;
            return this;
        }

        /**
         * The error message.
         */
        public Builder collectInterval(String collectInterval) {
            this.putQueryParameter("CollectInterval", collectInterval);
            this.collectInterval = collectInterval;
            return this;
        }

        /**
         * The type of the collection target.
         * <p>
         * 
         * *   If the `TaskType` parameter is set to `aliyun_fc`, enter `aliyun_fc`.
         * *   If the `TaskType` parameter is set to `aliyun_sls`, enter the name of the Logstore group.
         */
        public Builder collectTargetType(String collectTargetType) {
            this.putQueryParameter("CollectTargetType", collectTargetType);
            this.collectTargetType = collectTargetType;
            return this;
        }

        /**
         * The tag value of the metric.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The conditions that are used to filter logs imported from Log Service.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The extended field that specifies the result of basic operations that are performed on aggregation results.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The tag key of the metric.
         */
        public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
            this.putQueryParameter("SLSProcessConfig", SLSProcessConfig);
            this.SLSProcessConfig = SLSProcessConfig;
            return this;
        }

        /**
         * The method that is used to filter logs imported from Log Service. Valid values:
         * <p>
         * 
         * *   `contain`: contains
         * *   `notContain`: does not contain
         * *   `>`: greater than
         * *   `<`: less than
         * *   `=`: equal to
         * *   `! =`: not equal to
         * *   `>=`: greater than or equal to
         * *   `<=`: less than or equal to
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * The ID of the metric import task.
         */
        public Builder targetUserIdList(String targetUserIdList) {
            this.putQueryParameter("TargetUserIdList", targetUserIdList);
            this.targetUserIdList = targetUserIdList;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **CreateHybridMonitorTask**.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * The interval at which metrics are collected. Valid values:
         * <p>
         * 
         * *   15
         * *   60 (default value)
         * 
         * Unit: seconds.
         * 
         * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.
         */
        public Builder YARMConfig(String YARMConfig) {
            this.putQueryParameter("YARMConfig", YARMConfig);
            this.YARMConfig = YARMConfig;
            return this;
        }

        @Override
        public CreateHybridMonitorTaskRequest build() {
            return new CreateHybridMonitorTaskRequest(this);
        } 

    } 

    public static class AttachLabels extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private AttachLabels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachLabels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The conditions that are used to filter logs imported from Log Service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the namespace.
             * <p>
             * 
             * For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttachLabels build() {
                return new AttachLabels(this);
            } 

        } 

    }
    public static class Express extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Express")
        private String express;

        private Express(Builder builder) {
            this.alias = builder.alias;
            this.express = builder.express;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Express create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return express
         */
        public String getExpress() {
            return this.express;
        }

        public static final class Builder {
            private String alias; 
            private String express; 

            /**
             * The value of the key that is used to filter logs imported from Log Service.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Specifies whether to create a metric import task for an Alibaba Cloud service or create a metric for logs imported from Log Service. Valid values:
             * <p>
             * 
             * *   aliyun_fc: creates a metric import task for an Alibaba Cloud service
             * *   aliyun_sls: creates a metric for logs imported from Log Service
             */
            public Builder express(String express) {
                this.express = express;
                return this;
            }

            public Express build() {
                return new Express(this);
            } 

        } 

    }
    public static class Filters extends TeaModel {
        @NameInMap("Operator")
        private String operator;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        @NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.operator = builder.operator;
            this.SLSKeyName = builder.SLSKeyName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operator; 
            private String SLSKeyName; 
            private String value; 

            /**
             * The description of the metric import task.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
             * <p>
             * 
             * *   namespace: the namespace of the Alibaba Cloud service. For information about how to query the namespace of an Alibaba Cloud service, see [DescribeMetricMetaList](~~98846~~).
             * *   metric_list: the metrics of the Alibaba Cloud service. For information about how to query the metrics of an Alibaba Cloud service, see [DescribeMetricMetaList](~~98846~~).
             * 
             * The following code shows a sample configuration file:
             * 
             * ```
             * 
             * products:
             * - namespace: acs_ecs_dashboard
             *   metric_info:
             *   - metric_list:
             *     - cpu_total
             *     - cpu_idle
             *     - diskusage_utilization
             *     - CPUUtilization
             *     - DiskReadBPS
             *     - InternetOut
             *     - IntranetOut
             *     - cpu_system
             * - namespace: acs_rds_dashboard
             *   metric_info:
             *   - metric_list:
             *     - MySQL_QPS
             *     - MySQL_TPS
             * ```
             * 
             * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_fc`.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * The name of the metric import task.
             * <p>
             * 
             * *   If the `TaskType` parameter is set to `aliyun_fc`, enter the name of the metric import task.
             * *   If the `TaskType` parameter is set to `aliyun_sls`, enter the name of the metric for logs imported from Log Service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class Filter extends TeaModel {
        @NameInMap("Filters")
        private java.util.List < Filters> filters;

        @NameInMap("Relation")
        private String relation;

        private Filter(Builder builder) {
            this.filters = builder.filters;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return filters
         */
        public java.util.List < Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private java.util.List < Filters> filters; 
            private String relation; 

            /**
             * The relationship between multiple filter conditions. Valid values:
             * <p>
             * 
             * *   and (default value): Logs are processed only if all filter conditions are met.
             * *   or: Logs are processed if one of the filter conditions is met.
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * The configurations of the logs that are imported from Log Service.
             * <p>
             * 
             * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class GroupBy extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        private GroupBy(Builder builder) {
            this.alias = builder.alias;
            this.SLSKeyName = builder.SLSKeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupBy create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public static final class Builder {
            private String alias; 
            private String SLSKeyName; 

            /**
             * The ID of the member account.
             * <p>
             * 
             * If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in a resource directory to Hybrid Cloud Monitoring. You can use the resource directory to monitor Alibaba Cloud services across enterprise accounts.
             * 
             * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_fc`.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The IDs of the member accounts. Separate multiple member account IDs with commas (,).
             * <p>
             * 
             * >  This parameter is required only if you call this operation by using the management account.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            public GroupBy build() {
                return new GroupBy(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Function")
        private String function;

        @NameInMap("Parameter1")
        private String parameter1;

        @NameInMap("Parameter2")
        private String parameter2;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        private Statistics(Builder builder) {
            this.alias = builder.alias;
            this.function = builder.function;
            this.parameter1 = builder.parameter1;
            this.parameter2 = builder.parameter2;
            this.SLSKeyName = builder.SLSKeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return parameter1
         */
        public String getParameter1() {
            return this.parameter1;
        }

        /**
         * @return parameter2
         */
        public String getParameter2() {
            return this.parameter2;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public static final class Builder {
            private String alias; 
            private String function; 
            private String parameter1; 
            private String parameter2; 
            private String SLSKeyName; 

            /**
             * The ID of the member account.
             * <p>
             * 
             * If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in a resource directory to Hybrid Cloud Monitoring. You can use the resource directory to monitor Alibaba Cloud services across enterprise accounts.
             * 
             * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_fc`.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * Parameter1.
             */
            public Builder parameter1(String parameter1) {
                this.parameter1 = parameter1;
                return this;
            }

            /**
             * Parameter2.
             */
            public Builder parameter2(String parameter2) {
                this.parameter2 = parameter2;
                return this;
            }

            /**
             * The IDs of the member accounts. Separate multiple member account IDs with commas (,).
             * <p>
             * 
             * >  This parameter is required only if you call this operation by using the management account.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    public static class SLSProcessConfig extends TeaModel {
        @NameInMap("Express")
        private java.util.List < Express> express;

        @NameInMap("Filter")
        private Filter filter;

        @NameInMap("GroupBy")
        private java.util.List < GroupBy> groupBy;

        @NameInMap("Statistics")
        private java.util.List < Statistics> statistics;

        private SLSProcessConfig(Builder builder) {
            this.express = builder.express;
            this.filter = builder.filter;
            this.groupBy = builder.groupBy;
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLSProcessConfig create() {
            return builder().build();
        }

        /**
         * @return express
         */
        public java.util.List < Express> getExpress() {
            return this.express;
        }

        /**
         * @return filter
         */
        public Filter getFilter() {
            return this.filter;
        }

        /**
         * @return groupBy
         */
        public java.util.List < GroupBy> getGroupBy() {
            return this.groupBy;
        }

        /**
         * @return statistics
         */
        public java.util.List < Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private java.util.List < Express> express; 
            private Filter filter; 
            private java.util.List < GroupBy> groupBy; 
            private java.util.List < Statistics> statistics; 

            /**
             * The name of the key that is used to aggregate logs imported from Log Service.
             */
            public Builder express(java.util.List < Express> express) {
                this.express = express;
                return this;
            }

            /**
             * The extended fields that specify the results of basic operations that are performed on aggregation results.
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * The ID of the application group.
             * <p>
             * 
             * For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
             * 
             * >  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(java.util.List < Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public SLSProcessConfig build() {
                return new SLSProcessConfig(this);
            } 

        } 

    }
}
