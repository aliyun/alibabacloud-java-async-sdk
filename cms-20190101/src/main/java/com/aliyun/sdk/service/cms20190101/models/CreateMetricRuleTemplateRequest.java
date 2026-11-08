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
 * {@link CreateMetricRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricRuleTemplateRequest</p>
 */
public class CreateMetricRuleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertTemplates")
    private java.util.List<AlertTemplates> alertTemplates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateMetricRuleTemplateRequest(Builder builder) {
        super(builder);
        this.alertTemplates = builder.alertTemplates;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricRuleTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTemplates
     */
    public java.util.List<AlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateMetricRuleTemplateRequest, Builder> {
        private java.util.List<AlertTemplates> alertTemplates; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetricRuleTemplateRequest request) {
            super(request);
            this.alertTemplates = request.alertTemplates;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The alert templates.</p>
         */
        public Builder alertTemplates(java.util.List<AlertTemplates> alertTemplates) {
            this.putQueryParameter("AlertTemplates", alertTemplates);
            this.alertTemplates = alertTemplates;
            return this;
        }

        /**
         * <p>The description of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Template1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the alert template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Template1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateMetricRuleTemplateRequest build() {
            return new CreateMetricRuleTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleTemplateRequest</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private Integer n;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the critical-level alert threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last period. </li>
             * <li>LessThanLastPeriod: less than the metric value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * <p>The statistical method for critical-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the Statistics column that corresponds to the MetricName parameter of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold that triggers a critical-level alert notification.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of consecutive times that the monitoring metrics must reach the alert threshold to send a critical alert notification.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleTemplateRequest</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private Integer n;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the info-level alert threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last period. </li>
             * <li>LessThanLastPeriod: less than the metric value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * <p>The statistical method for info-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the Statistics column that corresponds to the MetricName parameter of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The info-level alert threshold.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of consecutive times that the monitoring metrics must reach the alert threshold to send an info-level alert notification.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleTemplateRequest</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private Integer n;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warn create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the warning-level alert threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last period. </li>
             * <li>LessThanLastPeriod: less than the metric value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * <p>The statistical method for warning-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the Statistics column that corresponds to the MetricName parameter of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The warning-level alert threshold.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of consecutive times that the monitoring metrics must reach the alert threshold to send a warning alert notification.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, the Settings for the Statistics, ComparisonOperator, Threshold, and Times parameters must be configured at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleTemplateRequest</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        @com.aliyun.core.annotation.Validation(required = true)
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        @com.aliyun.core.annotation.Validation(required = true)
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
        @com.aliyun.core.annotation.Validation(required = true)
        private Warn warn;

        private Escalations(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return warn
         */
        public Warn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private Critical critical; 
            private Info info; 
            private Warn warn; 

            private Builder() {
            } 

            private Builder(Escalations model) {
                this.critical = model.critical;
                this.info = model.info;
                this.warn = model.warn;
            } 

            /**
             * Critical.
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleTemplateRequest</p>
     */
    public static class AlertTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Escalations")
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private String selector;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private AlertTemplates(Builder builder) {
            this.escalations = builder.escalations;
            this.category = builder.category;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.period = builder.period;
            this.ruleName = builder.ruleName;
            this.selector = builder.selector;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplates create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return selector
         */
        public String getSelector() {
            return this.selector;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Escalations escalations; 
            private String category; 
            private String metricName; 
            private String namespace; 
            private Integer period; 
            private String ruleName; 
            private String selector; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(AlertTemplates model) {
                this.escalations = model.escalations;
                this.category = model.category;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.period = model.period;
                this.ruleName = model.ruleName;
                this.selector = model.selector;
                this.webhook = model.webhook;
            } 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For more information about how to obtain the abbreviation of a cloud service name, see the metricCategory field in the Labels response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For more information about how to obtain the metric name, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For more information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The aggregation period of the monitoring data. Unit: seconds.</p>
             * <p>The default value is the minimum aggregation period of the metric. In most cases, you do not need to specify this parameter.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The options for the extended Dimension field.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For example, if the alert template is applied to an application group, this parameter is set to <code>{&quot;disk&quot;:&quot;/&quot;}</code>, and the MetricName parameter is set to DiskUtilization, the root partition (<code>&quot;/&quot;</code>) of the disk for all instances in the application group is associated with the corresponding alert rule.</p>
             * <blockquote>
             * <p>For more information about the valid values of the extended field options, see <a href="https://help.aliyun.com/document_detail/114979.html">DescribeMetricRuleTemplateAttribute</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;disk&quot;:&quot;/&quot;}</p>
             */
            public Builder selector(String selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The webhook URL to which alert notifications are sent.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>Specify a publicly accessible URL. CloudMonitor sends alert notifications to this URL by using HTTP POST requests. Only HTTP is supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ww.aliyun.com">http://ww.aliyun.com</a></p>
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public AlertTemplates build() {
                return new AlertTemplates(this);
            } 

        } 

    }
}
