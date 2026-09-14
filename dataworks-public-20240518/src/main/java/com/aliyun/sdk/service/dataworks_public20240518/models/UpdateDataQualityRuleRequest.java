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
 * {@link UpdateDataQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataQualityRuleRequest</p>
 */
public class UpdateDataQualityRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckingConfig")
    private CheckingConfig checkingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorHandlers")
    private java.util.List<ErrorHandlers> errorHandlers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingConfig")
    private SamplingConfig samplingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    private UpdateDataQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkingConfig = builder.checkingConfig;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.errorHandlers = builder.errorHandlers;
        this.id = builder.id;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.samplingConfig = builder.samplingConfig;
        this.severity = builder.severity;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataQualityRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<UpdateDataQualityRuleRequest, Builder> {
        private String regionId; 
        private CheckingConfig checkingConfig; 
        private String description; 
        private Boolean enabled; 
        private java.util.List<ErrorHandlers> errorHandlers; 
        private Long id; 
        private String name; 
        private Long projectId; 
        private SamplingConfig samplingConfig; 
        private String severity; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkingConfig = request.checkingConfig;
            this.description = request.description;
            this.enabled = request.enabled;
            this.errorHandlers = request.errorHandlers;
            this.id = request.id;
            this.name = request.name;
            this.projectId = request.projectId;
            this.samplingConfig = request.samplingConfig;
            this.severity = request.severity;
            this.templateCode = request.templateCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sample verification settings.</p>
         */
        public Builder checkingConfig(CheckingConfig checkingConfig) {
            String checkingConfigShrink = shrink(checkingConfig, "CheckingConfig", "json");
            this.putBodyParameter("CheckingConfig", checkingConfigShrink);
            this.checkingConfig = checkingConfig;
            return this;
        }

        /**
         * <p>The rule description. The maximum length is 500 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a odps _sql task</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The list of issue handlers for data quality rule verification.</p>
         */
        public Builder errorHandlers(java.util.List<ErrorHandlers> errorHandlers) {
            String errorHandlersShrink = shrink(errorHandlers, "ErrorHandlers", "json");
            this.putBodyParameter("ErrorHandlers", errorHandlersShrink);
            this.errorHandlers = errorHandlers;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The rule name. The name can be a combination of digits, English letters, Chinese characters, and half-width or full-width punctuation. The maximum length is 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>The table cannot be empty.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The settings required for sample collection.</p>
         */
        public Builder samplingConfig(SamplingConfig samplingConfig) {
            String samplingConfigShrink = shrink(samplingConfig, "SamplingConfig", "json");
            this.putBodyParameter("SamplingConfig", samplingConfigShrink);
            this.samplingConfig = samplingConfig;
            return this;
        }

        /**
         * <p>The severity level of the rule for the business (corresponding to strong/weak rules on the page). Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>High</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder severity(String severity) {
            this.putBodyParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>The unique identifier of the rule template referenced by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM:table:table_count:fixed</p>
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public UpdateDataQualityRuleRequest build() {
            return new UpdateDataQualityRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(Critical model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The threshold expression.</p>
             * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. Examples:</p>
             * <ul>
             * <li>Upward fluctuation greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Downward fluctuation greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Fixed-value rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.05</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>!=</li>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(Expected model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The threshold expression.</p>
             * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. Examples:</p>
             * <ul>
             * <li>Upward fluctuation greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Downward fluctuation greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Fixed-value rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &lt;= 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>!=</li>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(Warned model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The threshold expression.</p>
             * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. Examples:</p>
             * <ul>
             * <li>Upward fluctuation greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Downward fluctuation greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Fixed-value rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>&lt;</li>
             * <li>&lt;=</li>
             * <li>!=</li>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(Thresholds model) {
                this.critical = model.critical;
                this.expected = model.expected;
                this.warned = model.warned;
            } 

            /**
             * <p>The threshold settings for critical warnings.</p>
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The expected threshold settings.</p>
             */
            public Builder expected(Expected expected) {
                this.expected = expected;
                return this;
            }

            /**
             * <p>The threshold settings for normal warnings.</p>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(CheckingConfig model) {
                this.referencedSamplesFilter = model.referencedSamplesFilter;
                this.thresholds = model.thresholds;
                this.type = model.type;
            } 

            /**
             * <p>Some types of thresholds require querying reference samples and then aggregating the values of those reference samples to derive the threshold used for comparison. An expression is used here to indicate how the reference samples are queried.</p>
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
             * <p>The threshold calculation method. This parameter is not required when a template is used.</p>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(ErrorHandlers model) {
                this.errorDataFilter = model.errorDataFilter;
                this.type = model.type;
            } 

            /**
             * <p>For a custom SQL rule, you must specify the SQL used to filter problematic data.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
             */
            public Builder errorDataFilter(String errorDataFilter) {
                this.errorDataFilter = errorDataFilter;
                return this;
            }

            /**
             * <p>The handler type.</p>
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
     * {@link UpdateDataQualityRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityRuleRequest</p>
     */
    public static class SamplingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricParameters")
        private String metricParameters;

        @com.aliyun.core.annotation.NameInMap("SamplingFilter")
        private String samplingFilter;

        @com.aliyun.core.annotation.NameInMap("SettingConfig")
        @com.aliyun.core.annotation.Validation(maxLength = 1000)
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

            private Builder() {
            } 

            private Builder(SamplingConfig model) {
                this.metric = model.metric;
                this.metricParameters = model.metricParameters;
                this.samplingFilter = model.samplingFilter;
                this.settingConfig = model.settingConfig;
            } 

            /**
             * <p>The name of the metric to sample. This parameter is not required when a template is used.</p>
             * <ul>
             * <li>Count: the number of rows in the table.</li>
             * <li>Min: the minimum value of the field.</li>
             * <li>Max: the maximum value of the field.</li>
             * <li>Avg: the average value of the field.</li>
             * <li>DistinctCount: the number of distinct values in the field.</li>
             * <li>DistinctPercent: the ratio of the number of distinct values in the field to the total number of rows.</li>
             * <li>DuplicatedCount: the number of duplicate values in the field.</li>
             * <li>DuplicatedPercent: the ratio of the number of duplicate values in the field to the total number of rows.</li>
             * <li>TableSize: the size of the table.</li>
             * <li>NullValueCount: the number of rows in which the field is null.</li>
             * <li>NullValuePercent: the percentage of rows in which the field is null.</li>
             * <li>GroupCount: the number of data rows for each value after aggregation by field value.</li>
             * <li>CountNotIn: the number of rows that do not match the enumerated values.</li>
             * <li>CountDistinctNotIn: the number of distinct values that do not match the enumerated values.</li>
             * <li>UserDefinedSql: sample collection by using custom SQL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Min</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The parameters required for sample collection.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>The condition used to apply secondary filtering on data that is not of interest during sampling. The maximum length is 16,777,215 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>id IS NULL</p>
             */
            public Builder samplingFilter(String samplingFilter) {
                this.samplingFilter = samplingFilter;
                return this;
            }

            /**
             * <p>The runtime parameter setting statements to be inserted and executed before the actual sampling statements. The maximum length is 1,000 characters. Only MaxCompute is supported.</p>
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
}
