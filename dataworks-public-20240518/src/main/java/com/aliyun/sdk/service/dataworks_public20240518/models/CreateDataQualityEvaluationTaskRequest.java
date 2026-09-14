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
 * {@link CreateDataQualityEvaluationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDataQualityEvaluationTaskRequest</p>
 */
public class CreateDataQualityEvaluationTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataQualityRules")
    private java.util.List<DataQualityRules> dataQualityRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 65535)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hooks")
    private java.util.List<Hooks> hooks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notifications")
    private Notifications notifications;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeConf")
    private String runtimeConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private Target target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trigger")
    private Trigger trigger;

    private CreateDataQualityEvaluationTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataQualityRules = builder.dataQualityRules;
        this.dataSourceId = builder.dataSourceId;
        this.description = builder.description;
        this.hooks = builder.hooks;
        this.name = builder.name;
        this.notifications = builder.notifications;
        this.projectId = builder.projectId;
        this.runtimeConf = builder.runtimeConf;
        this.target = builder.target;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityEvaluationTaskRequest create() {
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
     * @return dataQualityRules
     */
    public java.util.List<DataQualityRules> getDataQualityRules() {
        return this.dataQualityRules;
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hooks
     */
    public java.util.List<Hooks> getHooks() {
        return this.hooks;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifications
     */
    public Notifications getNotifications() {
        return this.notifications;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeConf
     */
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    /**
     * @return target
     */
    public Target getTarget() {
        return this.target;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<CreateDataQualityEvaluationTaskRequest, Builder> {
        private String regionId; 
        private java.util.List<DataQualityRules> dataQualityRules; 
        private Long dataSourceId; 
        private String description; 
        private java.util.List<Hooks> hooks; 
        private String name; 
        private Notifications notifications; 
        private Long projectId; 
        private String runtimeConf; 
        private Target target; 
        private Trigger trigger; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataQualityEvaluationTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataQualityRules = request.dataQualityRules;
            this.dataSourceId = request.dataSourceId;
            this.description = request.description;
            this.hooks = request.hooks;
            this.name = request.name;
            this.notifications = request.notifications;
            this.projectId = request.projectId;
            this.runtimeConf = request.runtimeConf;
            this.target = request.target;
            this.trigger = request.trigger;
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
         * <p>The list of data quality rules associated with the data quality monitoring task. If DataQualityRule.Id is specified, the rule corresponding to the ID is associated with the new quality monitoring task. If DataQualityRule.Id is not specified, a new rule is created based on the other fields and associated with the new quality monitoring task.</p>
         */
        public Builder dataQualityRules(java.util.List<DataQualityRules> dataQualityRules) {
            String dataQualityRulesShrink = shrink(dataQualityRules, "DataQualityRules", "json");
            this.putBodyParameter("DataQualityRules", dataQualityRulesShrink);
            this.dataQualityRules = dataQualityRules;
            return this;
        }

        /**
         * <p>The data source ID. You can call <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> to obtain the data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The description of the data quality monitor task.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI create a data quality monitoring test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The callback settings.</p>
         */
        public Builder hooks(java.util.List<Hooks> hooks) {
            String hooksShrink = shrink(hooks, "Hooks", "json");
            this.putBodyParameter("Hooks", hooksShrink);
            this.hooks = hooks;
            return this;
        }

        /**
         * <p>The name of the data quality monitor task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI create a data quality monitoring test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The notification subscription configuration.</p>
         */
        public Builder notifications(Notifications notifications) {
            String notificationsShrink = shrink(notifications, "Notifications", "json");
            this.putBodyParameter("Notifications", notificationsShrink);
            this.notifications = notifications;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The extended configuration. The value is a JSON-formatted string. This parameter takes effect only for EMR-type data quality monitors.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        public Builder runtimeConf(String runtimeConf) {
            this.putBodyParameter("RuntimeConf", runtimeConf);
            this.runtimeConf = runtimeConf;
            return this;
        }

        /**
         * <p>The monitored object of the data quality monitor.</p>
         * <p>This parameter is required.</p>
         */
        public Builder target(Target target) {
            String targetShrink = shrink(target, "Target", "json");
            this.putBodyParameter("Target", targetShrink);
            this.target = target;
            return this;
        }

        /**
         * <p>The trigger configuration of the data quality check task.</p>
         */
        public Builder trigger(Trigger trigger) {
            String triggerShrink = shrink(trigger, "Trigger", "json");
            this.putBodyParameter("Trigger", triggerShrink);
            this.trigger = trigger;
            return this;
        }

        @Override
        public CreateDataQualityEvaluationTaskRequest build() {
            return new CreateDataQualityEvaluationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>Rules of the fluctuation type must use expressions to represent fluctuation thresholds. Examples:</p>
             * <ul>
             * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute value of fluctuation: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Rules of the fixed value type can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
             * <p>0.01</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>Rules of the fluctuation type must use expressions to represent fluctuation thresholds. Examples:</p>
             * <ul>
             * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute value of fluctuation: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Rules of the fixed value type can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>Rules of the fluctuation type must use expressions to represent fluctuation thresholds. Examples:</p>
             * <ul>
             * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
             * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
             * <li>Absolute value of fluctuation: abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>Rules of the fixed value type can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
             * <p>0.001</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>The expression that specifies how to query reference samples. Some threshold types require querying reference samples and then aggregating the values of the reference samples to derive the threshold for comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bizdate&quot;: [&quot;-1&quot;]}</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>The verification threshold settings.</p>
             */
            public Builder thresholds(Thresholds thresholds) {
                this.thresholds = thresholds;
                return this;
            }

            /**
             * <p>The threshold calculation method.</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>The SQL statement specified by the user to filter problematic data. This is required for custom SQL rules.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM ods_api_log WHERE status = \&quot;Error\&quot;;</p>
             */
            public Builder errorDataFilter(String errorDataFilter) {
                this.errorDataFilter = errorDataFilter;
                return this;
            }

            /**
             * <p>The handler type:</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
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
             * <p>The name of the sampling metric. Valid values:</p>
             * <ul>
             * <li>Count: the number of table rows.</li>
             * <li>Min: the minimum value of the field.</li>
             * <li>Max: the maximum value of the field.</li>
             * <li>Avg: the average value of the field.</li>
             * <li>DistinctCount: the number of distinct values in the field.</li>
             * <li>DistinctPercent: the ratio of distinct values in the field to the total number of rows.</li>
             * <li>DuplicatedCount: the number of duplicate values in the field.</li>
             * <li>DuplicatedPercent: the ratio of duplicate values in the field to the total number of rows.</li>
             * <li>TableSize: the table size.</li>
             * <li>NullValueCount: the number of rows where the field is null.</li>
             * <li>NullValuePercent: the ratio of rows where the field is null.</li>
             * <li>GroupCount: the count of rows for each value after aggregation by field value.</li>
             * <li>CountNotIn: the number of rows that do not match the enumerated values.</li>
             * <li>CountDistinctNotIn: the number of distinct values that do not match the enumerated values.</li>
             * <li>UserDefinedSql: sample collection through a custom SQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NullValueCount</p>
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
             * <p>The filter condition used to perform secondary filtering on data that is not of interest during sampling. The maximum length is 16,777,215 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>status != \&quot;Succeeded\&quot;</p>
             */
            public Builder samplingFilter(String samplingFilter) {
                this.samplingFilter = samplingFilter;
                return this;
            }

            /**
             * <p>The runtime parameter setting statements that are executed before the sampling statement. The maximum length is 1,000 characters. Currently, only MaxCompute is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.sql.type.system.odps2=True,odps.sql.hive.compatible=True</p>
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
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class DataQualityRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingConfig")
        private CheckingConfig checkingConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 500)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ErrorHandlers")
        private java.util.List<ErrorHandlers> errorHandlers;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SamplingConfig")
        private SamplingConfig samplingConfig;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private DataQualityRules(Builder builder) {
            this.checkingConfig = builder.checkingConfig;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.errorHandlers = builder.errorHandlers;
            this.id = builder.id;
            this.name = builder.name;
            this.samplingConfig = builder.samplingConfig;
            this.severity = builder.severity;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityRules create() {
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

        public static final class Builder {
            private CheckingConfig checkingConfig; 
            private String description; 
            private Boolean enabled; 
            private java.util.List<ErrorHandlers> errorHandlers; 
            private Long id; 
            private String name; 
            private SamplingConfig samplingConfig; 
            private String severity; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(DataQualityRules model) {
                this.checkingConfig = model.checkingConfig;
                this.description = model.description;
                this.enabled = model.enabled;
                this.errorHandlers = model.errorHandlers;
                this.id = model.id;
                this.name = model.name;
                this.samplingConfig = model.samplingConfig;
                this.severity = model.severity;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>The sample verification settings.</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>The description of the data quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI test rules</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the quality rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of error handlers for quality rule verification issues.</p>
             */
            public Builder errorHandlers(java.util.List<ErrorHandlers> errorHandlers) {
                this.errorHandlers = errorHandlers;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2176</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data quality rule.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI test rules</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameters required for sample collection.</p>
             */
            public Builder samplingConfig(SamplingConfig samplingConfig) {
                this.samplingConfig = samplingConfig;
                return this;
            }

            /**
             * <p>The severity level of the rule for the business (corresponding to strong or weak rules on the page). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The unique identifier of the rule template referenced by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM:field:null_value:fixed:0</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DataQualityRules build() {
                return new DataQualityRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class Hooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Hooks(Builder builder) {
            this.condition = builder.condition;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hooks create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String type; 

            private Builder() {
            } 

            private Builder(Hooks model) {
                this.condition = model.condition;
                this.type = model.type;
            } 

            /**
             * <p>The hook trigger condition. When this condition is met, the hook action is triggered. Only two types of conditional expressions are supported:</p>
             * <ol>
             * <li>Specify a single combination of rule severity type and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means that if any executed rule with a severity of High has a check result of Critical, the condition is met.</li>
             * <li>Specify multiple combinations of rule severity type and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means that the condition is met if any executed rule with a severity of High has a check result of Critical, or any rule with a severity of Normal has a check result of Critical, or any rule with a severity of Normal has a check result of Error. The enumerated values of severity in the conditional expression are consistent with those of severity in DataQualityRule, and the enumerated values of status are consistent with those of status in DataQualityResult.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The hook type. Currently, only one type is supported:</p>
             * 
             * <strong>example:</strong>
             * <p>BlockTaskInstance</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Hooks build() {
                return new Hooks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class NotificationChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

        private NotificationChannels(Builder builder) {
            this.channels = builder.channels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationChannels create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public static final class Builder {
            private java.util.List<String> channels; 

            private Builder() {
            } 

            private Builder(NotificationChannels model) {
                this.channels = model.channels;
            } 

            /**
             * <p>The notification methods.</p>
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            public NotificationChannels build() {
                return new NotificationChannels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class NotificationReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List<String> receiverValues;

        private NotificationReceivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationReceivers create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            private Builder() {
            } 

            private Builder(NotificationReceivers model) {
                this.extension = model.extension;
                this.receiverType = model.receiverType;
                this.receiverValues = model.receiverValues;
            } 

            /**
             * <p>The additional parameter settings for sending alerts. The value is in JSON format. The following keys are supported:</p>
             * 
             * <strong>example:</strong>
             * <p>{  &quot;atAll&quot;: true }</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The type of the alert recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>DingdingUrl</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The alert recipients.</p>
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public NotificationReceivers build() {
                return new NotificationReceivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class NotificationsNotifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List<NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
        private java.util.List<NotificationReceivers> notificationReceivers;

        private NotificationsNotifications(Builder builder) {
            this.notificationChannels = builder.notificationChannels;
            this.notificationReceivers = builder.notificationReceivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationsNotifications create() {
            return builder().build();
        }

        /**
         * @return notificationChannels
         */
        public java.util.List<NotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        /**
         * @return notificationReceivers
         */
        public java.util.List<NotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

        public static final class Builder {
            private java.util.List<NotificationChannels> notificationChannels; 
            private java.util.List<NotificationReceivers> notificationReceivers; 

            private Builder() {
            } 

            private Builder(NotificationsNotifications model) {
                this.notificationChannels = model.notificationChannels;
                this.notificationReceivers = model.notificationReceivers;
            } 

            /**
             * <p>The notification methods.</p>
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>The alert recipient settings.</p>
             */
            public Builder notificationReceivers(java.util.List<NotificationReceivers> notificationReceivers) {
                this.notificationReceivers = notificationReceivers;
                return this;
            }

            public NotificationsNotifications build() {
                return new NotificationsNotifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class Notifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Notifications")
        private java.util.List<NotificationsNotifications> notifications;

        private Notifications(Builder builder) {
            this.condition = builder.condition;
            this.notifications = builder.notifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notifications create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return notifications
         */
        public java.util.List<NotificationsNotifications> getNotifications() {
            return this.notifications;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List<NotificationsNotifications> notifications; 

            private Builder() {
            } 

            private Builder(Notifications model) {
                this.condition = model.condition;
                this.notifications = model.notifications;
            } 

            /**
             * <p>The notification trigger condition. When this condition is met, a message notification is triggered. Currently, only two types of conditional expressions are supported:</p>
             * <p>Specify a single combination of rule severity type and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means that among the executed rules, if a rule with severity High has a check result of Critical, the condition is met.
             * Specify multiple combinations of rule severity type and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means that among the executed rules, if a rule with severity High has a check result of Critical, or a rule with severity Normal has a check result of Critical, or a rule with severity Normal has a check result of Error, the condition is met. The enumeration values of severity in the conditional expression are consistent with the severity enumeration in DataQualityRule, and the enumeration values of status are consistent with the status enumeration in DataQualityResult.</p>
             * 
             * <strong>example:</strong>
             * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The notification settings.</p>
             */
            public Builder notifications(java.util.List<NotificationsNotifications> notifications) {
                this.notifications = notifications;
                return this;
            }

            public Notifications build() {
                return new Notifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("PartitionSpec")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String partitionSpec;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableGuid;

        private Target(Builder builder) {
            this.databaseType = builder.databaseType;
            this.partitionSpec = builder.partitionSpec;
            this.tableGuid = builder.tableGuid;
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

        public static final class Builder {
            private String databaseType; 
            private String partitionSpec; 
            private String tableGuid; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.databaseType = model.databaseType;
                this.partitionSpec = model.partitionSpec;
                this.tableGuid = model.tableGuid;
            } 

            /**
             * <p>The type of the database to which the table belongs. Valid values:</p>
             * <ul>
             * <li>maxcompute</li>
             * <li>hologres</li>
             * <li>cdh</li>
             * <li>analyticdb_for_mysql</li>
             * <li>starrocks</li>
             * <li>emr</li>
             * <li>analyticdb_for_postgresql</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>The partition settings of the partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>pt=$[yyyymmdd-1]</p>
             */
            public Builder partitionSpec(String partitionSpec) {
                this.partitionSpec = partitionSpec;
                return this;
            }

            /**
             * <p>The unique ID of the table in DataWorks Data Map.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.api_test.ods_openapi_log_d</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityEvaluationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskRequest</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List<Long> taskIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.taskIds = builder.taskIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return taskIds
         */
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> taskIds; 
            private String type; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.taskIds = model.taskIds;
                this.type = model.type;
            } 

            /**
             * <p>The list of scheduling task IDs. This parameter is valid only when Type is set to ByScheduledTaskInstance.</p>
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The trigger type for quality monitoring. Valid values:</p>
             * <ul>
             * <li>ByManual: manual trigger. This is the default value.</li>
             * <li>ByScheduledTaskInstance: triggered by an associated scheduled task instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ByScheduledTaskInstance</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
}
