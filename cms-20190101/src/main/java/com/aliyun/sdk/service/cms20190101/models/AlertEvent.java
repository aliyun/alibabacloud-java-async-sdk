// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlertEvent} extends {@link TeaModel}
 *
 * <p>AlertEvent</p>
 */
public class AlertEvent extends TeaModel {
    @NameInMap("AlertName")
    private String alertName;

    @NameInMap("AlertStatus")
    private String alertStatus;

    @NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @NameInMap("DeDupId")
    private String deDupId;

    @NameInMap("Details")
    private String details;

    @NameInMap("EventName")
    private String eventName;

    @NameInMap("Expression")
    private String expression;

    @NameInMap("Metrics")
    private java.util.List < Metrics> metrics;

    @NameInMap("ResourceInfo")
    private java.util.Map < String, ? > resourceInfo;

    @NameInMap("RuleName")
    private String ruleName;

    @NameInMap("Severity")
    private String severity;

    @NameInMap("Source")
    private String source;

    @NameInMap("Summary")
    private String summary;

    @NameInMap("Timestamp")
    private Long timestamp;

    @NameInMap("TraceId")
    private String traceId;

    @NameInMap("UserId")
    private String userId;

    private AlertEvent(Builder builder) {
        this.alertName = builder.alertName;
        this.alertStatus = builder.alertStatus;
        this.customLabels = builder.customLabels;
        this.deDupId = builder.deDupId;
        this.details = builder.details;
        this.eventName = builder.eventName;
        this.expression = builder.expression;
        this.metrics = builder.metrics;
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
        private java.util.Map < String, ? > customLabels; 
        private String deDupId; 
        private String details; 
        private String eventName; 
        private String expression; 
        private java.util.List < Metrics> metrics; 
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

    public static class Metrics extends TeaModel {
        @NameInMap("CurValue")
        private String curValue;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("MetricNameEn")
        private String metricNameEn;

        @NameInMap("MetricNameZh")
        private String metricNameZh;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("UnitFactor")
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
