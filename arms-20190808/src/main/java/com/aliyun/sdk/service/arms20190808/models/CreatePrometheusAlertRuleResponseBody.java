// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder prometheusAlertRule(PrometheusAlertRule prometheusAlertRule) {
            this.prometheusAlertRule = prometheusAlertRule;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreatePrometheusAlertRuleResponseBody build() {
            return new CreatePrometheusAlertRuleResponseBody(this);
        } 

    } 

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
             * The name of the annotation.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the annotation.
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
             * The name of the tag.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class PrometheusAlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List < Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
        private Long dispatchRuleId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < Labels> labels;

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
        public java.util.List < Annotations> getAnnotations() {
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
        public java.util.List < Labels> getLabels() {
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
            private java.util.List < Annotations> annotations; 
            private String clusterId; 
            private Long dispatchRuleId; 
            private String duration; 
            private String expression; 
            private java.util.List < Labels> labels; 
            private String message; 
            private String notifyType; 
            private Integer status; 
            private String type; 

            /**
             * The ID of the alert rule.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The annotations of the alert rule.
             */
            public Builder annotations(java.util.List < Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The ID of the notification policy.
             */
            public Builder dispatchRuleId(Long dispatchRuleId) {
                this.dispatchRuleId = dispatchRuleId;
                return this;
            }

            /**
             * The duration. The value ranges from 1 to 1440 minutes.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The expression of the alert rule.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The tags of the alert rule.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The content of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The method that is used to send alert notifications. Valid values:
             * <p>
             * 
             * - ALERT_MANAGER: Alert notifications are sent by Operation Center.
             * - DISPATCH_RULE: Alert notifications are sent based on the specified notification policy.
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * - `1`: The alert rule is enabled.
             * - `0`: The alert rule is disabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the alert rule.
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
