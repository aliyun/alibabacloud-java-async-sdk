// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMonitorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMonitorAttributeResponseBody</p>
 */
public class DescribeLogMonitorAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogMonitor")
    private LogMonitor logMonitor;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeLogMonitorAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.logMonitor = builder.logMonitor;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogMonitorAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logMonitor
     */
    public LogMonitor getLogMonitor() {
        return this.logMonitor;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private LogMonitor logMonitor; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters are used in pair. Valid values:
         * <p>
         * 
         * *   and
         * *   or
         */
        public Builder logMonitor(LogMonitor logMonitor) {
            this.logMonitor = logMonitor;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the log monitoring metric.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLogMonitorAttributeResponseBody build() {
            return new DescribeLogMonitorAttributeResponseBody(this);
        } 

    } 

    public static class Aggregates extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("Function")
        private String function;

        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
        private String min;

        private Aggregates(Builder builder) {
            this.alias = builder.alias;
            this.fieldName = builder.fieldName;
            this.function = builder.function;
            this.max = builder.max;
            this.min = builder.min;
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

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        public static final class Builder {
            private String alias; 
            private String fieldName; 
            private String function; 
            private String max; 
            private String min; 

            /**
             * The name of the field in logs.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.
             * <p>
             * 
             * If no filter condition is specified, all logs are processed. Assume that logs contain the Level field, which may be set to Error. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The alias of the aggregate function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The minimum value.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * The function that is used to aggregate the monitoring data of logs within an aggregation period. Valid values:
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
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            public Aggregates build() {
                return new Aggregates(this);
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
             * The field value to be matched in the filter condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The size of the tumbling window for calculation. Unit: seconds. The system performs an aggregation for each tumbling window.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The method that is used to match the field value. Valid values:
             * <p>
             * 
             * *   `contain`
             * *   `notContain`
             * *   `>`: greater than
             * *   `<`: less than
             * *   `>=`: greater than or equal to
             * *   `<=`: less than or equal to
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
    public static class LogMonitor extends TeaModel {
        @NameInMap("Aggregates")
        private java.util.List < Aggregates> aggregates;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("Groupbys")
        private java.util.List < String > groupbys;

        @NameInMap("LogId")
        private Long logId;

        @NameInMap("MetricExpress")
        private String metricExpress;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("SlsLogstore")
        private String slsLogstore;

        @NameInMap("SlsProject")
        private String slsProject;

        @NameInMap("SlsRegionId")
        private String slsRegionId;

        @NameInMap("Tumblingwindows")
        private java.util.List < String > tumblingwindows;

        @NameInMap("ValueFilter")
        private java.util.List < ValueFilter> valueFilter;

        @NameInMap("ValueFilterRelation")
        private String valueFilterRelation;

        private LogMonitor(Builder builder) {
            this.aggregates = builder.aggregates;
            this.gmtCreate = builder.gmtCreate;
            this.groupId = builder.groupId;
            this.groupbys = builder.groupbys;
            this.logId = builder.logId;
            this.metricExpress = builder.metricExpress;
            this.metricName = builder.metricName;
            this.slsLogstore = builder.slsLogstore;
            this.slsProject = builder.slsProject;
            this.slsRegionId = builder.slsRegionId;
            this.tumblingwindows = builder.tumblingwindows;
            this.valueFilter = builder.valueFilter;
            this.valueFilterRelation = builder.valueFilterRelation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMonitor create() {
            return builder().build();
        }

        /**
         * @return aggregates
         */
        public java.util.List < Aggregates> getAggregates() {
            return this.aggregates;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupbys
         */
        public java.util.List < String > getGroupbys() {
            return this.groupbys;
        }

        /**
         * @return logId
         */
        public Long getLogId() {
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
        public java.util.List < String > getTumblingwindows() {
            return this.tumblingwindows;
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

        public static final class Builder {
            private java.util.List < Aggregates> aggregates; 
            private Long gmtCreate; 
            private Long groupId; 
            private java.util.List < String > groupbys; 
            private Long logId; 
            private String metricExpress; 
            private String metricName; 
            private String slsLogstore; 
            private String slsProject; 
            private String slsRegionId; 
            private java.util.List < String > tumblingwindows; 
            private java.util.List < ValueFilter> valueFilter; 
            private String valueFilterRelation; 

            /**
             * The maximum value.
             */
            public Builder aggregates(java.util.List < Aggregates> aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * The name of the Log Service project.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID returned by Log Service.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Groupbys.
             */
            public Builder groupbys(java.util.List < String > groupbys) {
                this.groupbys = groupbys;
                return this;
            }

            /**
             * The extended field. The extended field allows you to perform basic operations on the aggregation results.
             * <p>
             * 
             * Assume that you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.
             */
            public Builder logId(Long logId) {
                this.logId = logId;
                return this;
            }

            /**
             * The ID of the region where the Log Service Logstore resides.
             */
            public Builder metricExpress(String metricExpress) {
                this.metricExpress = metricExpress;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The name of the log monitoring metric. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * The aggregate functions.
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * The time when the log monitoring metric was created.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * The dimension based on which the data is grouped. This parameter is equivalent to the GROUP BY clause in SQL statements. If no dimension is specified, all data is aggregated based on the aggregate function.
             */
            public Builder tumblingwindows(java.util.List < String > tumblingwindows) {
                this.tumblingwindows = tumblingwindows;
                return this;
            }

            /**
             * The name of the log field used for matching in the filter condition.
             */
            public Builder valueFilter(java.util.List < ValueFilter> valueFilter) {
                this.valueFilter = valueFilter;
                return this;
            }

            /**
             * The name of the Log Service Logstore.
             */
            public Builder valueFilterRelation(String valueFilterRelation) {
                this.valueFilterRelation = valueFilterRelation;
                return this;
            }

            public LogMonitor build() {
                return new LogMonitor(this);
            } 

        } 

    }
}
