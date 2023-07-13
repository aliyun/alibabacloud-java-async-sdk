// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutLogMonitorRequest} extends {@link RequestModel}
 *
 * <p>PutLogMonitorRequest</p>
 */
public class PutLogMonitorRequest extends Request {
    @Query
    @NameInMap("Aggregates")
    @Validation(required = true)
    private java.util.List < Aggregates> aggregates;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Groupbys")
    private java.util.List < Groupbys> groupbys;

    @Query
    @NameInMap("LogId")
    private String logId;

    @Query
    @NameInMap("MetricExpress")
    private String metricExpress;

    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("SlsLogstore")
    @Validation(required = true)
    private String slsLogstore;

    @Query
    @NameInMap("SlsProject")
    @Validation(required = true)
    private String slsProject;

    @Query
    @NameInMap("SlsRegionId")
    @Validation(required = true)
    private String slsRegionId;

    @Query
    @NameInMap("Tumblingwindows")
    private String tumblingwindows;

    @Query
    @NameInMap("Unit")
    private String unit;

    @Query
    @NameInMap("ValueFilter")
    private java.util.List < ValueFilter> valueFilter;

    @Query
    @NameInMap("ValueFilterRelation")
    @Validation(required = true)
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
         * Aggregates.
         */
        public Builder aggregates(java.util.List < Aggregates> aggregates) {
            this.putQueryParameter("Aggregates", aggregates);
            this.aggregates = aggregates;
            return this;
        }

        /**
         * The ID of the log monitoring metric.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Groupbys.
         */
        public Builder groupbys(java.util.List < Groupbys> groupbys) {
            this.putQueryParameter("Groupbys", groupbys);
            this.groupbys = groupbys;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
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
         * For example, if you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.
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
         * The returned message.
         * <p>
         * 
         * *   If the call is successful, the value `successful` is returned.
         * *   If the call fails, an error message is returned. Example: `alias of aggreate must be set value.`
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The name of the metric. For more information about the metrics for cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder slsLogstore(String slsLogstore) {
            this.putQueryParameter("SlsLogstore", slsLogstore);
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * The name of the field that is specified as the dimension. Valid values of N: 1 to 10.
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to PutLogMonitor.
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
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
        public Builder tumblingwindows(String tumblingwindows) {
            this.putQueryParameter("Tumblingwindows", tumblingwindows);
            this.tumblingwindows = tumblingwindows;
            return this;
        }

        /**
         * The region in which the Log Service project resides.
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        /**
         * ValueFilter.
         */
        public Builder valueFilter(java.util.List < ValueFilter> valueFilter) {
            this.putQueryParameter("ValueFilter", valueFilter);
            this.valueFilter = valueFilter;
            return this;
        }

        /**
         * The field value to be matched in the filter condition. Valid values of N: 1 to 10.
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
        @NameInMap("Alias")
        @Validation(required = true)
        private String alias;

        @NameInMap("FieldName")
        @Validation(required = true)
        private String fieldName;

        @NameInMap("Function")
        @Validation(required = true)
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
             * The name of the Log Service project.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The alias of the aggregate function. Valid values of N: 1 to 10.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The ID of the log monitoring metric.
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("FieldName")
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
             * The function that is used to aggregate the monitoring data of logs within an aggregation period. Valid values of N: 1 to 10. Valid values:
             * <p>
             * 
             * *   count: counts the number.
             * *   sum: calculates the total value.
             * *   avg: calculates the average value.
             * *   max: selects the maximum value.
             * *   min: selects the minimum value.
             * *   countps: calculates the counted number of the specified field divided by the total number of seconds of the aggregation period.
             * *   sumps: calculates the total value of the specified field divided by the total number of seconds of the aggregation period.
             * *   distinct: counts the number of logs where the specified field appears within the aggregation period.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The ID of the application group.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
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
             * The method that is used to match the field value. Valid values of N: 1 to 10. Valid values:
             * <p>
             * 
             * *   `contain`: contains
             * *   `notContain`: does not contain
             * *   `>`: be greater than
             * *   `<`: be less than
             * *   `>=`: be greater than or equal to
             * *   `<=`: be less than or equal to
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The size of the tumbling window for calculation. Unit: seconds. CloudMonitor performs aggregation for each tumbling window.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The alias of the dimension based on which the data is grouped. Valid values of N: 1 to 10.
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
