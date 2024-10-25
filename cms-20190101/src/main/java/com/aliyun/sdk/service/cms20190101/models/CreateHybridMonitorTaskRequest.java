// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridMonitorTaskRequest</p>
 */
public class CreateHybridMonitorTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachLabels")
    private java.util.List < AttachLabels> attachLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccessId")
    private java.util.List < String > cloudAccessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectInterval")
    private String collectInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectTargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collectTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSProcessConfig")
    private SLSProcessConfig SLSProcessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserIdList")
    private String targetUserIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YARMConfig")
    private String YARMConfig;

    private CreateHybridMonitorTaskRequest(Builder builder) {
        super(builder);
        this.attachLabels = builder.attachLabels;
        this.cloudAccessId = builder.cloudAccessId;
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
     * @return cloudAccessId
     */
    public java.util.List < String > getCloudAccessId() {
        return this.cloudAccessId;
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
        private java.util.List < String > cloudAccessId; 
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
            this.cloudAccessId = request.cloudAccessId;
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
         * <p>The tags of the metric.</p>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         */
        public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
            this.putQueryParameter("AttachLabels", attachLabels);
            this.attachLabels = attachLabels;
            return this;
        }

        /**
         * CloudAccessId.
         */
        public Builder cloudAccessId(java.util.List < String > cloudAccessId) {
            this.putQueryParameter("CloudAccessId", cloudAccessId);
            this.cloudAccessId = cloudAccessId;
            return this;
        }

        /**
         * <p>The collection period of the metric. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60 (default)</li>
         * </ul>
         * <p>Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder collectInterval(String collectInterval) {
            this.putQueryParameter("CollectInterval", collectInterval);
            this.collectInterval = collectInterval;
            return this;
        }

        /**
         * <p>The type of the collection target.</p>
         * <ul>
         * <li>If the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>, enter <code>aliyun_fc</code>.</li>
         * <li>If the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>, enter the name of the Logstore group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_fc</p>
         */
        public Builder collectTargetType(String collectTargetType) {
            this.putQueryParameter("CollectTargetType", collectTargetType);
            this.collectTargetType = collectTargetType;
            return this;
        }

        /**
         * <p>The description of the metric import task.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The configurations of the logs that are imported from Simple Log Service.</p>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         */
        public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
            this.putQueryParameter("SLSProcessConfig", SLSProcessConfig);
            this.SLSProcessConfig = SLSProcessConfig;
            return this;
        }

        /**
         * <p>The ID of the member account.</p>
         * <p>If you call this operation by using the management account of a resource directory, you can connect the Alibaba Cloud services that are activated for all members in the resource directory to Hybrid Cloud Monitoring. You can use the resource directory to monitor Alibaba Cloud services across enterprise accounts.</p>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * <p>The IDs of the member accounts. Separate multiple member account IDs with commas (,).</p>
         * <blockquote>
         * <p> This parameter is required only if you call this operation by using the management account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        public Builder targetUserIdList(String targetUserIdList) {
            this.putQueryParameter("TargetUserIdList", targetUserIdList);
            this.targetUserIdList = targetUserIdList;
            return this;
        }

        /**
         * <p>The name of the metric import task.</p>
         * <ul>
         * <li>If the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>, enter the name of the metric import task.</li>
         * <li>If the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>, enter the name of the metric for logs imported from Simple Log Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun_task</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the metric import task. Valid values:</p>
         * <ul>
         * <li>aliyun_fc: metric import tasks for Alibaba Cloud services.</li>
         * <li>aliyun_sls: metrics for logs imported from Simple Log Service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_fc</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
         * <ul>
         * <li>namespace: the namespace of the Alibaba Cloud service. For information about how to query the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a>.</li>
         * <li>metric_list: the metrics of the Alibaba Cloud service. For information about how to query the metrics of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a>.</li>
         * </ul>
         * <p>The following code shows a sample configuration file:</p>
         * <pre><code>products:
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
         * </code></pre>
         * <blockquote>
         * <p> This parameter is required only if the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>products:- namespace: acs_ecs_dashboard  metric_info:  - metric_list:    - cpu_total</p>
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

    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class AttachLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>app_service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tag value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class Express extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Express")
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
             * <p>The alias of the extended field that specifies the result of basic operations performed on aggregation results.</p>
             * 
             * <strong>example:</strong>
             * <p>SuccRate</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The extended field that specifies the result of basic operations performed on aggregation results.</p>
             * 
             * <strong>example:</strong>
             * <p>success_count</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
        private String SLSKeyName;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The method that is used to filter logs imported from Simple Log Service. Valid values:</p>
             * <ul>
             * <li><code>contain</code>: contains</li>
             * <li><code>notContain</code>: does not contain</li>
             * <li><code>&gt;</code>: greater than</li>
             * <li><code>&lt;</code>: less than</li>
             * <li><code>=</code>: equal to</li>
             * <li><code>! =</code>: not equal to</li>
             * <li><code>&gt;=</code>: greater than or equal to</li>
             * <li><code>&lt;=</code>: less than or equal to</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The name of the key that is used to filter logs imported from Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * <p>The value of the key that is used to filter logs imported from Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List < Filters> filters;

        @com.aliyun.core.annotation.NameInMap("Relation")
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
             * <p>The conditions that are used to filter logs imported from Simple Log Service.</p>
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The relationship between multiple filter conditions. Valid values:</p>
             * <ul>
             * <li>and (default): Logs are processed only if all filter conditions are met.</li>
             * <li>or: Logs are processed if one of the filter conditions is met.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class GroupBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
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
             * <p>The alias of the aggregation result.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiResult</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The name of the key that is used to aggregate logs imported from Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Parameter1")
        private String parameter1;

        @com.aliyun.core.annotation.NameInMap("Parameter2")
        private String parameter2;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
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
             * <p>The alias of the aggregation result.</p>
             * 
             * <strong>example:</strong>
             * <p>level_count</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The function that is used to aggregate the log data of a statistical period. Valid values:</p>
             * <ul>
             * <li>count: counts the number.</li>
             * <li>sum: calculates the total value.</li>
             * <li>avg: calculates the average value.</li>
             * <li>max: calculates the maximum value.</li>
             * <li>min: calculates the minimum value.</li>
             * <li>value: collects samples within the statistical period.</li>
             * <li>countps: calculates the number of values of the specified field divided by the total number of seconds within a statistical period.</li>
             * <li>sumps: calculates the sum of the values of the specified field divided by the total number of seconds within a statistical period.</li>
             * <li>distinct: calculates the number of unique values of the specified field within a statistical period.</li>
             * <li>distribution: calculates the number of logs that meet a specified condition within the statistical period.</li>
             * <li>percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>count</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The value of the function that is used to aggregate logs imported from Simple Log Service.</p>
             * <ul>
             * <li>If the <code>Function</code> parameter is set to <code>distribution</code>, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.</li>
             * <li>If the <code>Function</code> parameter is set to <code>percentile</code>, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder parameter1(String parameter1) {
                this.parameter1 = parameter1;
                return this;
            }

            /**
             * <p>The value of the function that is used to aggregate logs imported from Simple Log Service.</p>
             * <blockquote>
             * <p> This parameter is required only if the <code>Function</code> parameter is set to <code>distribution</code>. This parameter specifies the upper limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 299.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>299</p>
             */
            public Builder parameter2(String parameter2) {
                this.parameter2 = parameter2;
                return this;
            }

            /**
             * <p>The name of the key that is used to aggregate logs imported from Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
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
    /**
     * 
     * {@link CreateHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorTaskRequest</p>
     */
    public static class SLSProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Express")
        private java.util.List < Express> express;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("GroupBy")
        private java.util.List < GroupBy> groupBy;

        @com.aliyun.core.annotation.NameInMap("Statistics")
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
             * <p>The extended fields that specify the results of basic operations performed on aggregation results.</p>
             */
            public Builder express(java.util.List < Express> express) {
                this.express = express;
                return this;
            }

            /**
             * <p>The conditions that are used to filter logs imported from Simple Log Service.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * <p>The method that is used to aggregate logs imported from Simple Log Service.</p>
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
