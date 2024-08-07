// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticMetricsResponseBody</p>
 */
public class DescribeDiagnosticMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List < Metrics> metrics;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public java.util.List < Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Metrics> metrics; 
        private String nextToken; 
        private String requestId; 

        /**
         * The ID of the diagnostic metric.
         */
        public Builder metrics(java.util.List < Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * The list of diagnostic metrics.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The query token returned in this call.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticMetricsResponseBody build() {
            return new DescribeDiagnosticMetricsResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GuestMetric")
        private Boolean guestMetric;

        @com.aliyun.core.annotation.NameInMap("MetricCategory")
        private String metricCategory;

        @com.aliyun.core.annotation.NameInMap("MetricId")
        private String metricId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SupportedOperatingSystem")
        private String supportedOperatingSystem;

        private Metrics(Builder builder) {
            this.description = builder.description;
            this.guestMetric = builder.guestMetric;
            this.metricCategory = builder.metricCategory;
            this.metricId = builder.metricId;
            this.metricName = builder.metricName;
            this.resourceType = builder.resourceType;
            this.supportedOperatingSystem = builder.supportedOperatingSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guestMetric
         */
        public Boolean getGuestMetric() {
            return this.guestMetric;
        }

        /**
         * @return metricCategory
         */
        public String getMetricCategory() {
            return this.metricCategory;
        }

        /**
         * @return metricId
         */
        public String getMetricId() {
            return this.metricId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return supportedOperatingSystem
         */
        public String getSupportedOperatingSystem() {
            return this.supportedOperatingSystem;
        }

        public static final class Builder {
            private String description; 
            private Boolean guestMetric; 
            private String metricCategory; 
            private String metricId; 
            private String metricName; 
            private String resourceType; 
            private String supportedOperatingSystem; 

            /**
             * CPU diagnostic
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The operating system type supported by the diagnostic metric. Valid values:
             * <p>
             * 
             * *   Windows
             * *   Linux
             * *   All: both Windows and Linux
             */
            public Builder guestMetric(Boolean guestMetric) {
                this.guestMetric = guestMetric;
                return this;
            }

            /**
             * The description of the diagnostic metric.
             */
            public Builder metricCategory(String metricCategory) {
                this.metricCategory = metricCategory;
                return this;
            }

            /**
             * The name of the diagnostic metric.
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * CPU diagnostic
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Indicates whether the diagnostic metric needs to be assessed by running a Cloud Assistant command in a guest operating system.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SupportedOperatingSystem.
             */
            public Builder supportedOperatingSystem(String supportedOperatingSystem) {
                this.supportedOperatingSystem = supportedOperatingSystem;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
