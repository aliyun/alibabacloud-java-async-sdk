// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreatePrometheusAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrometheusAlertRuleResponseBody</p>
 */
public class CreatePrometheusAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PrometheusAlertRule")
    private PrometheusAlertRule prometheusAlertRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreatePrometheusAlertRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.prometheusAlertRule = builder.prometheusAlertRule;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusAlertRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return prometheusAlertRule
     */
    public PrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
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
        private Long code; 
        private String message; 
        private PrometheusAlertRule prometheusAlertRule; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder prometheusAlertRule(PrometheusAlertRule prometheusAlertRule) {
            this.prometheusAlertRule = prometheusAlertRule;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9FEA6D00-317F-45E3-9004-7FB8B0B7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreatePrometheusAlertRuleResponseBody build() {
            return new CreatePrometheusAlertRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrometheusAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePrometheusAlertRuleResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Annotations(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * <p>The name of the annotation.</p>
             * 
             * <strong>example:</strong>
             * <p>message</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the annotation.</p>
             * 
             * <strong>example:</strong>
             * <p>The CPU utilization of ${{$labels.pod_name}} has exceeded 80%. Current value: {{$value}}%</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePrometheusAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePrometheusAlertRuleResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>severity</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>critical</p>
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
     * {@link CreatePrometheusAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePrometheusAlertRuleResponseBody</p>
     */
    public static class PrometheusAlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
        private Long dispatchRuleId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PrometheusAlertRule(Builder builder) {
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.clusterId = builder.clusterId;
            this.dispatchRuleId = builder.dispatchRuleId;
            this.duration = builder.duration;
            this.expression = builder.expression;
            this.labels = builder.labels;
            this.message = builder.message;
            this.notifyType = builder.notifyType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusAlertRule create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return annotations
         */
        public java.util.List<Annotations> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dispatchRuleId
         */
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long alertId; 
            private String alertName; 
            private java.util.List<Annotations> annotations; 
            private String clusterId; 
            private Long dispatchRuleId; 
            private String duration; 
            private String expression; 
            private java.util.List<Labels> labels; 
            private String message; 
            private String notifyType; 
            private Integer status; 
            private String type; 

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>3888704</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus_Alert</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The annotations of the alert rule.</p>
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c0bad479465464e1d8c1e641b0afb****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10282</p>
             */
            public Builder dispatchRuleId(Long dispatchRuleId) {
                this.dispatchRuleId = dispatchRuleId;
                return this;
            }

            /**
             * <p>The duration. The value ranges from 1 to 1440 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10m</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The expression of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100 * (sum(rate(container_cpu_usage_seconds_total[1m])) by (pod_name) / sum(label_replace(kube_pod_container_resource_limits_cpu_cores, &quot;pod_name&quot;, &quot;$1&quot;, &quot;pod&quot;, &quot;(.*)&quot;)) by (pod_name))&gt;75</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The tags of the alert rule.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The content of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.</p>
             * 
             * <strong>example:</strong>
             * <p>The CPU utilization of ${{$labels.pod_name}} has exceeded 80%. Current value: {{$value}}%</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The method that is used to send alert notifications. Valid values:</p>
             * <ul>
             * <li>ALERT_MANAGER: Alert notifications are sent by Operation Center.</li>
             * <li>DISPATCH_RULE: Alert notifications are sent based on the specified notification policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALERT_MANAGER</p>
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is enabled. Valid values:</p>
             * <ul>
             * <li><code>1</code>: The alert rule is enabled.</li>
             * <li><code>0</code>: The alert rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Kubernetes component alert</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PrometheusAlertRule build() {
                return new PrometheusAlertRule(this);
            } 

        } 

    }
}
