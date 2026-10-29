// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeLogMonitorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMonitorAttributeResponseBody</p>
 */
public class DescribeLogMonitorAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogMonitor")
    private LogMonitor logMonitor;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLogMonitorAttributeResponseBody model) {
            this.code = model.code;
            this.logMonitor = model.logMonitor;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A status code of 200 indicates a successful request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the Log Monitoring task.</p>
         */
        public Builder logMonitor(LogMonitor logMonitor) {
            this.logMonitor = logMonitor;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6718537-E673-4A58-8EE1-24B8B38C7AAE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLogMonitorAttributeResponseBody build() {
            return new DescribeLogMonitorAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMonitorAttributeResponseBody</p>
     */
    public static class Aggregates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
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

            private Builder() {
            } 

            private Builder(Aggregates model) {
                this.alias = model.alias;
                this.fieldName = model.fieldName;
                this.function = model.function;
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The alias of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>alias_******</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The original name of the field in the log.</p>
             * 
             * <strong>example:</strong>
             * <p>field_******</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The function that is used to aggregate log data in a statistical period. Valid values:</p>
             * <ul>
             * <li><p>count: Counts the number of logs.</p>
             * </li>
             * <li><p>sum: Calculates the sum of values in a field.</p>
             * </li>
             * <li><p>avg: Calculates the average of values in a field.</p>
             * </li>
             * <li><p>max: Selects the maximum value in a field.</p>
             * </li>
             * <li><p>min: Selects the minimum value in a field.</p>
             * </li>
             * <li><p>countps: Calculates the average number of logs that are generated per second in a statistical period.</p>
             * </li>
             * <li><p>sumps: Calculates the average sum of values in a field per second in a statistical period.</p>
             * </li>
             * <li><p>distinct: Counts the number of unique values in a field in a statistical period.</p>
             * </li>
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
             * <p>The maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeLogMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMonitorAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ValueFilter model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The key.</p>
             * 
             * <strong>example:</strong>
             * <p>key_******</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The operator that is used to match the field value. Valid values:</p>
             * <ul>
             * <li><p><code>contain</code>: contains.</p>
             * </li>
             * <li><p><code>notContain</code>: does not contain.</p>
             * </li>
             * <li><p><code>&gt;</code>: greater than.</p>
             * </li>
             * <li><p><code>&lt;</code>: less than.</p>
             * </li>
             * <li><p><code>&gt;=</code>: greater than or equal to.</p>
             * </li>
             * <li><p><code>&lt;=</code>: less than or equal to.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contain</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>value_******</p>
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
    /**
     * 
     * {@link DescribeLogMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMonitorAttributeResponseBody</p>
     */
    public static class LogMonitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregates")
        private java.util.List<Aggregates> aggregates;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("Groupbys")
        private java.util.List<String> groupbys;

        @com.aliyun.core.annotation.NameInMap("LogId")
        private Long logId;

        @com.aliyun.core.annotation.NameInMap("MetricExpress")
        private String metricExpress;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SlsLogstore")
        private String slsLogstore;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        @com.aliyun.core.annotation.NameInMap("SlsRegionId")
        private String slsRegionId;

        @com.aliyun.core.annotation.NameInMap("Tumblingwindows")
        private java.util.List<String> tumblingwindows;

        @com.aliyun.core.annotation.NameInMap("ValueFilter")
        private java.util.List<ValueFilter> valueFilter;

        @com.aliyun.core.annotation.NameInMap("ValueFilterRelation")
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
        public java.util.List<Aggregates> getAggregates() {
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
        public java.util.List<String> getGroupbys() {
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
        public java.util.List<String> getTumblingwindows() {
            return this.tumblingwindows;
        }

        /**
         * @return valueFilter
         */
        public java.util.List<ValueFilter> getValueFilter() {
            return this.valueFilter;
        }

        /**
         * @return valueFilterRelation
         */
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

        public static final class Builder {
            private java.util.List<Aggregates> aggregates; 
            private Long gmtCreate; 
            private Long groupId; 
            private java.util.List<String> groupbys; 
            private Long logId; 
            private String metricExpress; 
            private String metricName; 
            private String slsLogstore; 
            private String slsProject; 
            private String slsRegionId; 
            private java.util.List<String> tumblingwindows; 
            private java.util.List<ValueFilter> valueFilter; 
            private String valueFilterRelation; 

            private Builder() {
            } 

            private Builder(LogMonitor model) {
                this.aggregates = model.aggregates;
                this.gmtCreate = model.gmtCreate;
                this.groupId = model.groupId;
                this.groupbys = model.groupbys;
                this.logId = model.logId;
                this.metricExpress = model.metricExpress;
                this.metricName = model.metricName;
                this.slsLogstore = model.slsLogstore;
                this.slsProject = model.slsProject;
                this.slsRegionId = model.slsRegionId;
                this.tumblingwindows = model.tumblingwindows;
                this.valueFilter = model.valueFilter;
                this.valueFilterRelation = model.valueFilterRelation;
            } 

            /**
             * <p>The definitions of aggregations.</p>
             */
            public Builder aggregates(java.util.List<Aggregates> aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * <p>This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970.</p>
             * 
             * <strong>example:</strong>
             * <p>1678440033000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>123******</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The dimension based on which log data is aggregated. This parameter is equivalent to the \<code>GROUP BY\\</code> clause in an SQL statement. You can specify a dimension to group monitoring data. If you do not specify this parameter, all monitoring data is aggregated based on the aggregation method.</p>
             */
            public Builder groupbys(java.util.List<String> groupbys) {
                this.groupbys = groupbys;
                return this;
            }

            /**
             * <p>The ID of the Log Monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>123******</p>
             */
            public Builder logId(Long logId) {
                this.logId = logId;
                return this;
            }

            /**
             * <p>The metric expression.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metricExpress(String metricExpress) {
                this.metricExpress = metricExpress;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total_******</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>logstore_******</p>
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>project_******</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The ID of the region where Simple Log Service resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * <p>The pre-aggregation window. Unit: seconds. Cloud Monitor aggregates data in the specified pre-aggregation window.</p>
             */
            public Builder tumblingwindows(java.util.List<String> tumblingwindows) {
                this.tumblingwindows = tumblingwindows;
                return this;
            }

            /**
             * <p>The filter conditions. This parameter is used with \<code>ValueFilterRelation\\</code>. This parameter is equivalent to the \<code>WHERE\\</code> clause in an SQL statement.</p>
             * <p>If you do not specify this parameter, all data is processed. For example, if a log contains a \<code>Level\\</code> field and you want to count the number of logs where the value of \<code>Level\\</code> is \<code>Error\\</code>, you can set the aggregation function to \<code>count\\</code> and specify a filter condition where \<code>Level\\</code> equals \<code>Error\\</code>.</p>
             */
            public Builder valueFilter(java.util.List<ValueFilter> valueFilter) {
                this.valueFilter = valueFilter;
                return this;
            }

            /**
             * <p>The logical operator for the filter conditions. This parameter is used with \<code>ValueFilter\\</code>. Valid values:</p>
             * <ul>
             * <li><p>and: The logical AND operator.</p>
             * </li>
             * <li><p>or: The logical OR operator.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
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
