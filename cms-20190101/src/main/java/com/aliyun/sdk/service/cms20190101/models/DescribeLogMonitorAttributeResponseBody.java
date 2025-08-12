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
         * <p> The status code 200 indicates that the request was successful.</p>
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
         * <p>The details of the log monitoring metric.</p>
         */
        public Builder logMonitor(LogMonitor logMonitor) {
            this.logMonitor = logMonitor;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
             * <p>HostName</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The name of the field in logs.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The function that is used to aggregate the monitoring data of logs within a statistical period. Valid values:</p>
             * <ul>
             * <li>count: counts the number</li>
             * <li>sum: calculates the total value</li>
             * <li>avg: calculates the average value</li>
             * <li>max: calculates the maximum value</li>
             * <li>min: calculates the minimum value</li>
             * <li>countps: calculates the number of values of the specified field divided by the total number of seconds within a statistical period</li>
             * <li>sumps: calculates the sum of the values of the specified field divided by the total number of seconds within a statistical period</li>
             * <li>distinct: calculates the number of unique values of the specified field within a statistical period</li>
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
             * <p>10</p>
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
             * <p>The name of the log field used for matching in the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The method that is used to match the field value. Valid values:</p>
             * <ul>
             * <li><code>contain</code>: contains</li>
             * <li><code>notContain</code>: does not contain</li>
             * <li><code>&gt;</code>: greater than</li>
             * <li><code>&lt;</code>: less than</li>
             * <li><code>&gt;=</code>: greater than or equal to</li>
             * <li><code>&lt;=</code>: less than or equal to</li>
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
             * <p>The field value to be matched in the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>portal</p>
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
             * <p>The aggregation logic.</p>
             */
            public Builder aggregates(java.util.List<Aggregates> aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * <p>The time when the metric was created.</p>
             * <p>This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1547431398000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Groupbys.
             */
            public Builder groupbys(java.util.List<String> groupbys) {
                this.groupbys = groupbys;
                return this;
            }

            /**
             * <p>The ID of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder logId(Long logId) {
                this.logId = logId;
                return this;
            }

            /**
             * <p>The extended field. The extended field allows you to perform basic operations on the aggregation results.</p>
             * <p>For example, if you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber*100.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;extend&quot;:{&quot;errorPercent&quot;:&quot;5XXNumber/TotalNumber*100&quot;}}</p>
             */
            public Builder metricExpress(String metricExpress) {
                this.metricExpress = metricExpress;
                return this;
            }

            /**
             * <p>The metric name. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test-logstore</p>
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The ID of the region where the Simple Log Service (SLS) Logstore resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * Tumblingwindows.
             */
            public Builder tumblingwindows(java.util.List<String> tumblingwindows) {
                this.tumblingwindows = tumblingwindows;
                return this;
            }

            /**
             * <p>The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.</p>
             * <p>If no filter condition is specified, all logs are processed. For example, logs contain the Level and Error fields. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.</p>
             */
            public Builder valueFilter(java.util.List<ValueFilter> valueFilter) {
                this.valueFilter = valueFilter;
                return this;
            }

            /**
             * <p>The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters must be used in pair. Valid values:</p>
             * <ul>
             * <li>and</li>
             * <li>or</li>
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
