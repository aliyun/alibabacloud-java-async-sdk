// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutLogMonitorRequest} extends {@link RequestModel}
 *
 * <p>PutLogMonitorRequest</p>
 */
public class PutLogMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aggregates")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Aggregates> aggregates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Groupbys")
    private java.util.List < Groupbys> groupbys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogId")
    private String logId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricExpress")
    private String metricExpress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsLogstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsLogstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsProject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tumblingwindows")
    private String tumblingwindows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueFilter")
    private java.util.List < ValueFilter> valueFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueFilterRelation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String valueFilterRelation;

    private PutLogMonitorRequest(Builder builder) {
        super(builder);
        this.aggregates = builder.aggregates;
        this.groupId = builder.groupId;
        this.groupbys = builder.groupbys;
        this.logId = builder.logId;
        this.metricExpress = builder.metricExpress;
        this.metricName = builder.metricName;
        this.slsLogstore = builder.slsLogstore;
        this.slsProject = builder.slsProject;
        this.slsRegionId = builder.slsRegionId;
        this.tumblingwindows = builder.tumblingwindows;
        this.unit = builder.unit;
        this.valueFilter = builder.valueFilter;
        this.valueFilterRelation = builder.valueFilterRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLogMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregates
     */
    public java.util.List < Aggregates> getAggregates() {
        return this.aggregates;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupbys
     */
    public java.util.List < Groupbys> getGroupbys() {
        return this.groupbys;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return metricExpress
     */
    public String getMetricExpress() {
        return this.metricExpress;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return slsLogstore
     */
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return tumblingwindows
     */
    public String getTumblingwindows() {
        return this.tumblingwindows;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @return valueFilter
     */
    public java.util.List < ValueFilter> getValueFilter() {
        return this.valueFilter;
    }

    /**
     * @return valueFilterRelation
     */
    public String getValueFilterRelation() {
        return this.valueFilterRelation;
    }

    public static final class Builder extends Request.Builder<PutLogMonitorRequest, Builder> {
        private java.util.List < Aggregates> aggregates; 
        private String groupId; 
        private java.util.List < Groupbys> groupbys; 
        private String logId; 
        private String metricExpress; 
        private String metricName; 
        private String slsLogstore; 
        private String slsProject; 
        private String slsRegionId; 
        private String tumblingwindows; 
        private String unit; 
        private java.util.List < ValueFilter> valueFilter; 
        private String valueFilterRelation; 

        private Builder() {
            super();
        } 

        private Builder(PutLogMonitorRequest request) {
            super(request);
            this.aggregates = request.aggregates;
            this.groupId = request.groupId;
            this.groupbys = request.groupbys;
            this.logId = request.logId;
            this.metricExpress = request.metricExpress;
            this.metricName = request.metricName;
            this.slsLogstore = request.slsLogstore;
            this.slsProject = request.slsProject;
            this.slsRegionId = request.slsRegionId;
            this.tumblingwindows = request.tumblingwindows;
            this.unit = request.unit;
            this.valueFilter = request.valueFilter;
            this.valueFilterRelation = request.valueFilterRelation;
        } 

        /**
         * The aggregation logic.
         */
        public Builder aggregates(java.util.List < Aggregates> aggregates) {
            this.putQueryParameter("Aggregates", aggregates);
            this.aggregates = aggregates;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The dimension based on which the data is grouped. This parameter is equivalent to the GROUP BY clause in SQL statements. If no dimension is specified, all data is aggregated based on the aggregate function.
         */
        public Builder groupbys(java.util.List < Groupbys> groupbys) {
            this.putQueryParameter("Groupbys", groupbys);
            this.groupbys = groupbys;
            return this;
        }

        /**
         * The ID of the log monitoring metric.
         */
        public Builder logId(String logId) {
            this.putQueryParameter("LogId", logId);
            this.logId = logId;
            return this;
        }

        /**
         * The extended field. The extended field allows you to perform basic operations on the aggregation results.
         * <p>
         * 
         * For example, you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.
         * 
         * JSON format: {"extend":{"errorPercent":"5XXNumber/TotalNumber\*100"}}. Description:
         * 
         * *   extend: required.
         * *   errorPercent: the alias of the field generated in the calculation result. You can specify the alias as needed.
         * *   5XXNumber/TotalNumber\*100: the calculation expression.
         */
        public Builder metricExpress(String metricExpress) {
            this.putQueryParameter("MetricExpress", metricExpress);
            this.metricExpress = metricExpress;
            return this;
        }

        /**
         * The metric name. For more information about the metrics for cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The name of the Simple Log Service Logstore.
         */
        public Builder slsLogstore(String slsLogstore) {
            this.putQueryParameter("SlsLogstore", slsLogstore);
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * The name of the Simple Log Service project.
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        /**
         * The region in which the Simple Log Service project resides.
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * The size of the tumbling window for calculation. Unit: seconds. CloudMonitor performs aggregation for each tumbling window.
         */
        public Builder tumblingwindows(String tumblingwindows) {
            this.putQueryParameter("Tumblingwindows", tumblingwindows);
            this.tumblingwindows = tumblingwindows;
            return this;
        }

        /**
         * The unit.
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        /**
         * The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements. If no filter condition is specified, all logs are processed. For example, logs contain the Level and Error fields. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.
         */
        public Builder valueFilter(java.util.List < ValueFilter> valueFilter) {
            this.putQueryParameter("ValueFilter", valueFilter);
            this.valueFilter = valueFilter;
            return this;
        }

        /**
         * The logical operator that is used between log filter conditions. Valid values:
         * <p>
         * 
         * *   and
         * *   or
         * 
         * >  The ValueFilterRelation and `ValueFilter.N.Key` parameters must be used in pair.
         */
        public Builder valueFilterRelation(String valueFilterRelation) {
            this.putQueryParameter("ValueFilterRelation", valueFilterRelation);
            this.valueFilterRelation = valueFilterRelation;
            return this;
        }

        @Override
        public PutLogMonitorRequest build() {
            return new PutLogMonitorRequest(this);
        } 

    } 

    public static class Aggregates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        @com.aliyun.core.annotation.Validation(required = true)
        private String alias;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Function")
        @com.aliyun.core.annotation.Validation(required = true)
        private String function;

        private Aggregates(Builder builder) {
            this.alias = builder.alias;
            this.fieldName = builder.fieldName;
            this.function = builder.function;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregates create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        public static final class Builder {
            private String alias; 
            private String fieldName; 
            private String function; 

            /**
             * The alias of the aggregate function. Valid values of N: 1 to 10.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The name of the field to be aggregated. Valid values of N: 1 to 10.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The function that is used to aggregate log data within a statistical period. Valid values of N: 1 to 10. Valid values:
             * <p>
             * 
             * *   count: counts the number.
             * *   sum: calculates the total value.
             * *   avg: calculates the average value.
             * *   max: calculates the maximum value.
             * *   min: calculates the minimum value.
             * *   countps: calculates the number of values of the specified field divided by the total number of seconds within a statistical period.
             * *   sumps: calculates the sum of the values of the specified field divided by the total number of seconds within a statistical period.
             * *   distinct: calculates the number of unique values of the specified field within a statistical period.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            public Aggregates build() {
                return new Aggregates(this);
            } 

        } 

    }
    public static class Groupbys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        private Groupbys(Builder builder) {
            this.alias = builder.alias;
            this.fieldName = builder.fieldName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groupbys create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        public static final class Builder {
            private String alias; 
            private String fieldName; 

            /**
             * The alias of the dimension based on which the data is grouped. Valid values of N: 1 to 10.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The name of the field that is specified as the dimension. Valid values of N: 1 to 10.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            public Groupbys build() {
                return new Groupbys(this);
            } 

        } 

    }
    public static class ValueFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ValueFilter(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueFilter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * The name of the log field that is used for matching in the filter condition. Valid values of N: 1 to 10.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The method that is used to match the field value. Valid values of N: 1 to 10. Valid values:
             * <p>
             * 
             * *   `contain`: contains
             * *   `notContain`: does not contain
             * *   `>`: greater than
             * *   `<`: less than
             * *   `>=`: greater than or equal to
             * *   `<=`: less than or equal to
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The field value to be matched in the filter condition. Valid values of N: 1 to 10.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ValueFilter build() {
                return new ValueFilter(this);
            } 

        } 

    }
}
