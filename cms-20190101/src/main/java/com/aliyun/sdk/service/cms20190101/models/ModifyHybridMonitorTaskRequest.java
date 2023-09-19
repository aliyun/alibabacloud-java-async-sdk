// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridMonitorTaskRequest</p>
 */
public class ModifyHybridMonitorTaskRequest extends Request {
    @Query
    @NameInMap("AttachLabels")
    private java.util.List < AttachLabels> attachLabels;

    @Query
    @NameInMap("CollectInterval")
    private String collectInterval;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SLSProcessConfig")
    private SLSProcessConfig SLSProcessConfig;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("TaskName")
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
         * The tags of the metric.
         */
        public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
            this.putQueryParameter("AttachLabels", attachLabels);
            this.attachLabels = attachLabels;
            return this;
        }

        /**
         * The collection period of the metric. Valid values:
         * <p>
         * 
         * *   15
         * *   60
         * 
         * Unit: seconds.
         */
        public Builder collectInterval(String collectInterval) {
            this.putQueryParameter("CollectInterval", collectInterval);
            this.collectInterval = collectInterval;
            return this;
        }

        /**
         * The description of the metric import task.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The configurations of the logs that are imported from Log Service.
         */
        public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
            this.putQueryParameter("SLSProcessConfig", SLSProcessConfig);
            this.SLSProcessConfig = SLSProcessConfig;
            return this;
        }

        /**
         * The ID of the metric import task.
         * <p>
         * 
         * For information about how to obtain the ID of a metric import task, see [DescribeHybridMonitorTaskList](~~428624~~).
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the metric import task.
         * <p>
         * 
         * For information about how to obtain the ID of a metric import task, see [DescribeHybridMonitorTaskList](~~428624~~).
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
             * The tag key of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag value of the metric.
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
             * The alias of the extended field that specifies the result of basic operations performed on aggregation results.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The extended field that specifies the result of basic operations performed on aggregation results.
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
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The name of the key that is used to filter logs imported from Log Service.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * The value of the key that is used to filter logs imported from Log Service.
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
             * None
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * The relationship between multiple filter conditions. Valid values:
             * <p>
             * 
             * *   and (default): Logs are processed only if all filter conditions are met.
             * *   or: Logs are processed if one of the filter conditions is met.
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
             * The alias of the aggregation result.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The name of the key that is used to aggregate logs imported from Log Service.
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
             * The alias of the aggregation result.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The function that is used to aggregate the log data of a statistical period. Valid values:
             * <p>
             * 
             * *   count: counts the number.
             * *   sum: calculates the total value.
             * *   avg: calculates the average value.
             * *   max: calculates the maximum value.
             * *   min: calculates the minimum value.
             * *   value: collects samples within the statistical period.
             * *   countps: calculates the counted number of the specified field divided by the total number of seconds within the statistical period.
             * *   sumps: calculates the total value of the specified field divided by the total number of seconds within the statistical period.
             * *   distinct: counts the number of logs where the specified field appears within the statistical period.
             * *   distribution: counts the number of logs that meet a specified condition within the statistical period.
             * *   percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The value of the function that is used to aggregate logs imported from Log Service.
             * <p>
             * 
             * *   If the `Function` parameter is set to `distribution`, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.
             * *   If you set the `Function` parameter to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.
             */
            public Builder parameter1(String parameter1) {
                this.parameter1 = parameter1;
                return this;
            }

            /**
             * The value of the function that is used to aggregate logs imported from Log Service.
             * <p>
             * 
             * > This parameter must be specified when `Function` is set to `distribution`. This parameter specifies the upper limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 299.
             */
            public Builder parameter2(String parameter2) {
                this.parameter2 = parameter2;
                return this;
            }

            /**
             * The name of the key that is used to aggregate logs imported from Log Service.
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
             * The extended fields that specify the results of basic operations performed on aggregation results.
             */
            public Builder express(java.util.List < Express> express) {
                this.express = express;
                return this;
            }

            /**
             * The conditions that are used to filter logs imported from Log Service.
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * None
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
