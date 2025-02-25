// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityRuleResponseBody</p>
 */
public class GetDataQualityRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityRule")
    private DataQualityRule dataQualityRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityRuleResponseBody(Builder builder) {
        this.dataQualityRule = builder.dataQualityRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataQualityRule
     */
    public DataQualityRule getDataQualityRule() {
        return this.dataQualityRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityRule dataQualityRule; 
        private String requestId; 

        /**
         * <p>The information about the rule.</p>
         */
        public Builder dataQualityRule(DataQualityRule dataQualityRule) {
            this.dataQualityRule = dataQualityRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-4ED0-9441</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityRuleResponseBody build() {
            return new GetDataQualityRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Critical(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
            private String operator; 
            private String value; 

            /**
             * <p>The threshold expression.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.05</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Comparison character:</p>
             * <ul>
             * <li>&gt;</li>
             * <li>% =</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>! =</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold value.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class Expected extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Expected(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expected create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
            private String operator; 
            private String value; 

            /**
             * <p>The threshold expression.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &lt;= 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Comparison character:</p>
             * <ul>
             * <li>&gt;</li>
             * <li>% =</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>! =</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold value.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Expected build() {
                return new Expected(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class Warned extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Warned(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warned create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
            private String operator; 
            private String value; 

            /**
             * <p>The threshold expression.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Comparison character:</p>
             * <ul>
             * <li>&gt;</li>
             * <li>% =</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>! =</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold value.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Warned build() {
                return new Warned(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class Thresholds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Expected")
        private Expected expected;

        @com.aliyun.core.annotation.NameInMap("Warned")
        private Warned warned;

        private Thresholds(Builder builder) {
            this.critical = builder.critical;
            this.expected = builder.expected;
            this.warned = builder.warned;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thresholds create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return expected
         */
        public Expected getExpected() {
            return this.expected;
        }

        /**
         * @return warned
         */
        public Warned getWarned() {
            return this.warned;
        }

        public static final class Builder {
            private Critical critical; 
            private Expected expected; 
            private Warned warned; 

            /**
             * <p>The threshold settings for critical alerts.</p>
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The expected threshold setting.</p>
             */
            public Builder expected(Expected expected) {
                this.expected = expected;
                return this;
            }

            /**
             * <p>The threshold settings for normal alerts.</p>
             */
            public Builder warned(Warned warned) {
                this.warned = warned;
                return this;
            }

            public Thresholds build() {
                return new Thresholds(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class CheckingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferencedSamplesFilter")
        private String referencedSamplesFilter;

        @com.aliyun.core.annotation.NameInMap("Thresholds")
        private Thresholds thresholds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CheckingConfig(Builder builder) {
            this.referencedSamplesFilter = builder.referencedSamplesFilter;
            this.thresholds = builder.thresholds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckingConfig create() {
            return builder().build();
        }

        /**
         * @return referencedSamplesFilter
         */
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        /**
         * @return thresholds
         */
        public Thresholds getThresholds() {
            return this.thresholds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String referencedSamplesFilter; 
            private Thresholds thresholds; 
            private String type; 

            /**
             * <p>Some types of thresholds need to query some reference samples, and then summarize the values of the reference samples to obtain the threshold for comparison. Here, an expression is used to represent the query method of the reference samples.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>The threshold settings.</p>
             */
            public Builder thresholds(Thresholds thresholds) {
                this.thresholds = thresholds;
                return this;
            }

            /**
             * <p>Threshold Calculation method:</p>
             * <ul>
             * <li>Fixed</li>
             * <li>Fluctation</li>
             * <li>FluctationDiscreate</li>
             * <li>Auto</li>
             * <li>Average</li>
             * <li>Variance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Fixed</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CheckingConfig build() {
                return new CheckingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class ErrorHandlers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorDataFilter")
        private String errorDataFilter;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ErrorHandlers(Builder builder) {
            this.errorDataFilter = builder.errorDataFilter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorHandlers create() {
            return builder().build();
        }

        /**
         * @return errorDataFilter
         */
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String errorDataFilter; 
            private String type; 

            /**
             * <p>For custom SQL rules, you must specify SQL to filter problem data.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
             */
            public Builder errorDataFilter(String errorDataFilter) {
                this.errorDataFilter = errorDataFilter;
                return this;
            }

            /**
             * <p>Processor type:</p>
             * <ul>
             * <li>SaveErrorData</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SaveErrorData</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ErrorHandlers build() {
                return new ErrorHandlers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class SamplingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricParameters")
        private String metricParameters;

        @com.aliyun.core.annotation.NameInMap("SamplingFilter")
        private String samplingFilter;

        @com.aliyun.core.annotation.NameInMap("SettingConfig")
        private String settingConfig;

        private SamplingConfig(Builder builder) {
            this.metric = builder.metric;
            this.metricParameters = builder.metricParameters;
            this.samplingFilter = builder.samplingFilter;
            this.settingConfig = builder.settingConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingConfig create() {
            return builder().build();
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return metricParameters
         */
        public String getMetricParameters() {
            return this.metricParameters;
        }

        /**
         * @return samplingFilter
         */
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        /**
         * @return settingConfig
         */
        public String getSettingConfig() {
            return this.settingConfig;
        }

        public static final class Builder {
            private String metric; 
            private String metricParameters; 
            private String samplingFilter; 
            private String settingConfig; 

            /**
             * <p>The name of the sampled metric:</p>
             * <ul>
             * <li>Count: number of table rows</li>
             * <li>Min: minimum value of the field</li>
             * <li>Max: The maximum value of the field.</li>
             * <li>Avg: field mean</li>
             * <li>DistinctCount: number of unique field values</li>
             * <li>DistinctPercent: the ratio of the number of unique field values to the number of data rows.</li>
             * <li>DuplicatedCount: number of duplicate field values</li>
             * <li>DuplicatedPercent: the ratio of the number of duplicate field values to the number of data rows.</li>
             * <li>TableSize: table size</li>
             * <li>NullValueCount: number of rows with empty fields</li>
             * <li>NullValuePercent: the proportion of fields that are empty.</li>
             * <li>GroupCount: aggregate each value by field value and the corresponding number of data rows</li>
             * <li>CountNotIn: the enumerated value does not match the number of rows.</li>
             * <li>CountDistinctNotIn: the number of unique values that the enumerated values do not match.</li>
             * <li>UserDefinedSql: use custom SQL to collect samples</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Max</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>Parameters required for sample collection.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>The condition for secondary filtering of data that is not concerned during sampling, which can be up to 16777215 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>id IS NULL</p>
             */
            public Builder samplingFilter(String samplingFilter) {
                this.samplingFilter = samplingFilter;
                return this;
            }

            /**
             * <p>Before executing the sample statement, insert some runtime parameter setting statements, which can be up to 1000 characters in length. Currently, only MaxCompute is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>SET odps.sql.udf.timeout=600s; 
             * SET odps.sql.python.version=cp27;</p>
             */
            public Builder settingConfig(String settingConfig) {
                this.settingConfig = settingConfig;
                return this;
            }

            public SamplingConfig build() {
                return new SamplingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
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
             * <p>The dataset of the table type. The database type to which the table belongs.</p>
             * <ul>
             * <li>maxcompute</li>
             * <li>emr</li>
             * <li>cdh</li>
             * <li>hologres</li>
             * <li>analyticdb_for_postgresql</li>
             * <li>analyticdb_for_mysql</li>
             * <li>starrocks</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>Partition settings for partitioned tables.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>The unique ID of the table used by the rule in the data map.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.unit_test.tb_unit_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>Monitoring object type</p>
             * <ul>
             * <li>Table</li>
             * </ul>
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
     * {@link GetDataQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleResponseBody</p>
     */
    public static class DataQualityRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingConfig")
        private CheckingConfig checkingConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ErrorHandlers")
        private java.util.List<ErrorHandlers> errorHandlers;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SamplingConfig")
        private SamplingConfig samplingConfig;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private DataQualityRule(Builder builder) {
            this.checkingConfig = builder.checkingConfig;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.errorHandlers = builder.errorHandlers;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.samplingConfig = builder.samplingConfig;
            this.severity = builder.severity;
            this.target = builder.target;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityRule create() {
            return builder().build();
        }

        /**
         * @return checkingConfig
         */
        public CheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return errorHandlers
         */
        public java.util.List<ErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return samplingConfig
         */
        public SamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private CheckingConfig checkingConfig; 
            private String description; 
            private Boolean enabled; 
            private java.util.List<ErrorHandlers> errorHandlers; 
            private Long id; 
            private String name; 
            private Long projectId; 
            private SamplingConfig samplingConfig; 
            private String severity; 
            private Target target; 
            private String templateCode; 

            /**
             * <p>The check settings for sample data.</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>The description of the rule. It can be up to 500 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a odps _sql task</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Whether the rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of quality rule verification problem processors.</p>
             */
            public Builder errorHandlers(java.util.List<ErrorHandlers> errorHandlers) {
                this.errorHandlers = errorHandlers;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>16033</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The table cannot be empty.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1948</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The settings required for sample collection.</p>
             */
            public Builder samplingConfig(SamplingConfig samplingConfig) {
                this.samplingConfig = samplingConfig;
                return this;
            }

            /**
             * <p>Rule for the business level (corresponding to the strong and weak rules on the page), optional enumeration value:</p>
             * <ul>
             * <li>Normal</li>
             * <li>High</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The object monitored by the rule.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The ID of the template used by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>system::user_defined</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DataQualityRule build() {
                return new DataQualityRule(this);
            } 

        } 

    }
}
