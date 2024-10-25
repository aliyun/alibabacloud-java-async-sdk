// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridMonitorTaskRequest</p>
 */
public class ModifyHybridMonitorTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachLabels")
    private java.util.List < AttachLabels> attachLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectInterval")
    private String collectInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSProcessConfig")
    private SLSProcessConfig SLSProcessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private ModifyHybridMonitorTaskRequest(Builder builder) {
        super(builder);
        this.attachLabels = builder.attachLabels;
        this.collectInterval = builder.collectInterval;
        this.description = builder.description;
        this.SLSProcessConfig = builder.SLSProcessConfig;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridMonitorTaskRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return SLSProcessConfig
     */
    public SLSProcessConfig getSLSProcessConfig() {
        return this.SLSProcessConfig;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ModifyHybridMonitorTaskRequest, Builder> {
        private java.util.List < AttachLabels> attachLabels; 
        private String collectInterval; 
        private String description; 
        private SLSProcessConfig SLSProcessConfig; 
        private String taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridMonitorTaskRequest request) {
            super(request);
            this.attachLabels = request.attachLabels;
            this.collectInterval = request.collectInterval;
            this.description = request.description;
            this.SLSProcessConfig = request.SLSProcessConfig;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The tags of the metric.</p>
         */
        public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
            this.putQueryParameter("AttachLabels", attachLabels);
            this.attachLabels = attachLabels;
            return this;
        }

        /**
         * <p>The collection period of the metric. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * </ul>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder collectInterval(String collectInterval) {
            this.putQueryParameter("CollectInterval", collectInterval);
            this.collectInterval = collectInterval;
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
         * <p>The configurations of the logs that are imported from Log Service.</p>
         */
        public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
            this.putQueryParameter("SLSProcessConfig", SLSProcessConfig);
            this.SLSProcessConfig = SLSProcessConfig;
            return this;
        }

        /**
         * <p>The ID of the metric import task.</p>
         * <p>For information about how to obtain the ID of a metric import task, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the metric import task.</p>
         * <p>For information about how to obtain the ID of a metric import task, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS_task</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ModifyHybridMonitorTaskRequest build() {
            return new ModifyHybridMonitorTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
             * <p>The method that is used to filter logs imported from Log Service. Valid values:</p>
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
             * <p>The name of the key that is used to filter logs imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * <p>The value of the key that is used to filter logs imported from Log Service.</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
             * <p>None</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
             * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
             * <li>countps: calculates the counted number of the specified field divided by the total number of seconds within the statistical period.</li>
             * <li>sumps: calculates the total value of the specified field divided by the total number of seconds within the statistical period.</li>
             * <li>distinct: counts the number of logs where the specified field appears within the statistical period.</li>
             * <li>distribution: counts the number of logs that meet a specified condition within the statistical period.</li>
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
             * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
             * <ul>
             * <li>If the <code>Function</code> parameter is set to <code>distribution</code>, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.</li>
             * <li>If you set the <code>Function</code> parameter to <code>percentile</code>, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</li>
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
             * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
             * <blockquote>
             * <p>This parameter must be specified when <code>Function</code> is set to <code>distribution</code>. This parameter specifies the upper limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 299.</p>
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
             * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
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
     * {@link ModifyHybridMonitorTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyHybridMonitorTaskRequest</p>
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
             * <p>The conditions that are used to filter logs imported from Log Service.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * <p>None</p>
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
