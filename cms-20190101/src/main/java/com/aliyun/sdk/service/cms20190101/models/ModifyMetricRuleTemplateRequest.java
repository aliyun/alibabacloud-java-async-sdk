// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyMetricRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyMetricRuleTemplateRequest</p>
 */
public class ModifyMetricRuleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertTemplates")
    private java.util.List < AlertTemplates> alertTemplates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long restVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private ModifyMetricRuleTemplateRequest(Builder builder) {
        super(builder);
        this.alertTemplates = builder.alertTemplates;
        this.description = builder.description;
        this.name = builder.name;
        this.restVersion = builder.restVersion;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMetricRuleTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTemplates
     */
    public java.util.List < AlertTemplates> getAlertTemplates() {
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

    /**
     * @return restVersion
     */
    public Long getRestVersion() {
        return this.restVersion;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifyMetricRuleTemplateRequest, Builder> {
        private java.util.List < AlertTemplates> alertTemplates; 
        private String description; 
        private String name; 
        private Long restVersion; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMetricRuleTemplateRequest request) {
            super(request);
            this.alertTemplates = request.alertTemplates;
            this.description = request.description;
            this.name = request.name;
            this.restVersion = request.restVersion;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The details of the alert template.</p>
         */
        public Builder alertTemplates(java.util.List < AlertTemplates> alertTemplates) {
            this.putQueryParameter("AlertTemplates", alertTemplates);
            this.alertTemplates = alertTemplates;
            return this;
        }

        /**
         * <p>The description of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_template1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the alert template.</p>
         * <p>For information about how to obtain the name of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The version of the alert template. The version changes with the number of times that the alert template is modified.</p>
         * <p>For information about how to obtain the version of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restVersion(Long restVersion) {
            this.putQueryParameter("RestVersion", restVersion);
            this.restVersion = restVersion;
            return this;
        }

        /**
         * <p>The ID of the alert template.</p>
         * <p>For information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifyMetricRuleTemplateRequest build() {
            return new ModifyMetricRuleTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyMetricRuleTemplateRequest</p>
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

            /**
             * ComparisonOperator.
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
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
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
     * {@link ModifyMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyMetricRuleTemplateRequest</p>
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

            /**
             * ComparisonOperator.
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
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
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
     * {@link ModifyMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyMetricRuleTemplateRequest</p>
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

            /**
             * ComparisonOperator.
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
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
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
     * {@link ModifyMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyMetricRuleTemplateRequest</p>
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
     * {@link ModifyMetricRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyMetricRuleTemplateRequest</p>
     */
    public static class AlertTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Escalations")
        @com.aliyun.core.annotation.Validation(required = true)
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("RuleName")
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
             * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain metrics, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
             * <p>For information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The statistical period of the monitoring data.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>If the value is set to 300 seconds, the monitoring data is collected every 300 seconds. If the monitoring data is reported every 1 minute, the alert system calculates the average, maximum, and minimum values of the monitoring data of 5 minutes and checks whether the aggregated values exceed the threshold. To prevent unexpected alerts, we recommend that you set this parameter together with other parameters.</p>
             * </blockquote>
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
             * 
             * <strong>example:</strong>
             * <p>rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The dimension of the alert. It is an extended field.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For example, an alert template is applied to an application group, this parameter is set to <code>{&quot;disk&quot;:&quot;/&quot;}</code>, and the MetricName parameter is set to <code>DiskUtilization</code>. In this case, the generated alert rule is applied to the root disk partition (<code>&quot;/&quot;</code>) of all instances in the application group to which the alert template is applied.</p>
             * <blockquote>
             * <p>For more information about the values of extended fields, see <a href="https://help.aliyun.com/document_detail/114979.html">DescribeMetricRuleTemplateAttribute</a>.</p>
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
             * <p>The callback URL.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp">https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp</a></p>
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
