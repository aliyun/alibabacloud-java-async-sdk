// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertEvent} extends {@link TeaModel}
 *
 * <p>AlertEvent</p>
 */
public class AlertEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.NameInMap("AlertStatus")
    private String alertStatus;

    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.NameInMap("DeDupId")
    private String deDupId;

    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List < Metrics> metrics;

    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.NameInMap("ResourceInfo")
    private java.util.Map < String, ? > resourceInfo;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private AlertEvent(Builder builder) {
        this.alertName = builder.alertName;
        this.alertStatus = builder.alertStatus;
        this.arn = builder.arn;
        this.content = builder.content;
        this.customLabels = builder.customLabels;
        this.deDupId = builder.deDupId;
        this.details = builder.details;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.expression = builder.expression;
        this.metrics = builder.metrics;
        this.product = builder.product;
        this.resourceInfo = builder.resourceInfo;
        this.ruleName = builder.ruleName;
        this.severity = builder.severity;
        this.source = builder.source;
        this.summary = builder.summary;
        this.timestamp = builder.timestamp;
        this.traceId = builder.traceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertEvent create() {
        return builder().build();
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertStatus
     */
    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return customLabels
     */
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return deDupId
     */
    public String getDeDupId() {
        return this.deDupId;
    }

    /**
     * @return details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return resourceInfo
     */
    public java.util.Map < String, ? > getResourceInfo() {
        return this.resourceInfo;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String alertName; 
        private String alertStatus; 
        private String arn; 
        private String content; 
        private java.util.Map < String, ? > customLabels; 
        private String deDupId; 
        private String details; 
        private String eventName; 
        private String eventType; 
        private String expression; 
        private java.util.List < Metrics> metrics; 
        private String product; 
        private java.util.Map < String, ? > resourceInfo; 
        private String ruleName; 
        private String severity; 
        private String source; 
        private String summary; 
        private Long timestamp; 
        private String traceId; 
        private String userId; 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertStatus.
         */
        public Builder alertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DeDupId.
         */
        public Builder deDupId(String deDupId) {
            this.deDupId = deDupId;
            return this;
        }

        /**
         * Details.
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List < Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * ResourceInfo.
         */
        public Builder resourceInfo(java.util.Map < String, ? > resourceInfo) {
            this.resourceInfo = resourceInfo;
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
         * Severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AlertEvent build() {
            return new AlertEvent(this);
        } 

    } 

    /**
     * 
     * {@link AlertEvent} extends {@link TeaModel}
     *
     * <p>AlertEvent</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurValue")
        private String curValue;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricNameEn")
        private String metricNameEn;

        @com.aliyun.core.annotation.NameInMap("MetricNameZh")
        private String metricNameZh;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("UnitFactor")
        private Float unitFactor;

        private Metrics(Builder builder) {
            this.curValue = builder.curValue;
            this.metricName = builder.metricName;
            this.metricNameEn = builder.metricNameEn;
            this.metricNameZh = builder.metricNameZh;
            this.operator = builder.operator;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.unit = builder.unit;
            this.unitFactor = builder.unitFactor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return curValue
         */
        public String getCurValue() {
            return this.curValue;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricNameEn
         */
        public String getMetricNameEn() {
            return this.metricNameEn;
        }

        /**
         * @return metricNameZh
         */
        public String getMetricNameZh() {
            return this.metricNameZh;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return unitFactor
         */
        public Float getUnitFactor() {
            return this.unitFactor;
        }

        public static final class Builder {
            private String curValue; 
            private String metricName; 
            private String metricNameEn; 
            private String metricNameZh; 
            private String operator; 
            private String statistics; 
            private String threshold; 
            private String unit; 
            private Float unitFactor; 

            /**
             * CurValue.
             */
            public Builder curValue(String curValue) {
                this.curValue = curValue;
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
             * MetricNameEn.
             */
            public Builder metricNameEn(String metricNameEn) {
                this.metricNameEn = metricNameEn;
                return this;
            }

            /**
             * MetricNameZh.
             */
            public Builder metricNameZh(String metricNameZh) {
                this.metricNameZh = metricNameZh;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * UnitFactor.
             */
            public Builder unitFactor(Float unitFactor) {
                this.unitFactor = unitFactor;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
