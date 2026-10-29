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
 * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
 */
public class DescribeMetricRuleTemplateAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMetricRuleTemplateAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTemplateAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Resource resource; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeMetricRuleTemplateAttributeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The value 200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>8F3A82AD-DA92-52B0-8EC6-C059D1C3839F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the alert template.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
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

        public DescribeMetricRuleTemplateAttributeResponseBody build() {
            return new DescribeMetricRuleTemplateAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
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
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class AlertTemplateLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private AlertTemplateLabels(Builder builder) {
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplateLabels create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(AlertTemplateLabels model) {
                this.labels = model.labels;
            } 

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public AlertTemplateLabels build() {
                return new AlertTemplateLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class AlertTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Escalations")
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private AlertTemplateLabels labels;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private String selector;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private AlertTemplate(Builder builder) {
            this.category = builder.category;
            this.escalations = builder.escalations;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noDataPolicy = builder.noDataPolicy;
            this.ruleName = builder.ruleName;
            this.selector = builder.selector;
            this.silenceTime = builder.silenceTime;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplate create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return labels
         */
        public AlertTemplateLabels getLabels() {
            return this.labels;
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
         * @return noDataPolicy
         */
        public String getNoDataPolicy() {
            return this.noDataPolicy;
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
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String category; 
            private Escalations escalations; 
            private AlertTemplateLabels labels; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String ruleName; 
            private String selector; 
            private Integer silenceTime; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(AlertTemplate model) {
                this.category = model.category;
                this.escalations = model.escalations;
                this.labels = model.labels;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.noDataPolicy = model.noDataPolicy;
                this.ruleName = model.ruleName;
                this.selector = model.selector;
                this.silenceTime = model.silenceTime;
                this.webhook = model.webhook;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(AlertTemplateLabels labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NoDataPolicy.
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Selector.
             */
            public Builder selector(String selector) {
                this.selector = selector;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public AlertTemplate build() {
                return new AlertTemplate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class AlertTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTemplate")
        private java.util.List<AlertTemplate> alertTemplate;

        private AlertTemplates(Builder builder) {
            this.alertTemplate = builder.alertTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplates create() {
            return builder().build();
        }

        /**
         * @return alertTemplate
         */
        public java.util.List<AlertTemplate> getAlertTemplate() {
            return this.alertTemplate;
        }

        public static final class Builder {
            private java.util.List<AlertTemplate> alertTemplate; 

            private Builder() {
            } 

            private Builder(AlertTemplates model) {
                this.alertTemplate = model.alertTemplate;
            } 

            /**
             * AlertTemplate.
             */
            public Builder alertTemplate(java.util.List<AlertTemplate> alertTemplate) {
                this.alertTemplate = alertTemplate;
                return this;
            }

            public AlertTemplates build() {
                return new AlertTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTemplateAttributeResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTemplates")
        private AlertTemplates alertTemplates;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RestVersion")
        private String restVersion;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Resource(Builder builder) {
            this.alertTemplates = builder.alertTemplates;
            this.description = builder.description;
            this.name = builder.name;
            this.restVersion = builder.restVersion;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return alertTemplates
         */
        public AlertTemplates getAlertTemplates() {
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
        public String getRestVersion() {
            return this.restVersion;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private AlertTemplates alertTemplates; 
            private String description; 
            private String name; 
            private String restVersion; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.alertTemplates = model.alertTemplates;
                this.description = model.description;
                this.name = model.name;
                this.restVersion = model.restVersion;
                this.templateId = model.templateId;
            } 

            /**
             * AlertTemplates.
             */
            public Builder alertTemplates(AlertTemplates alertTemplates) {
                this.alertTemplates = alertTemplates;
                return this;
            }

            /**
             * <p>The description of the alert template.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS template</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the alert template.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Template1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the alert template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder restVersion(String restVersion) {
                this.restVersion = restVersion;
                return this;
            }

            /**
             * <p>The ID of the alert template.</p>
             * 
             * <strong>example:</strong>
             * <p>70****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
