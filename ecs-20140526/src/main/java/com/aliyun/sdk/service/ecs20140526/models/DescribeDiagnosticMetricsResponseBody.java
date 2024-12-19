// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiagnosticMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticMetricsResponseBody</p>
 */
public class DescribeDiagnosticMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metrics> metrics;

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
    public java.util.List<Metrics> getMetrics() {
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
        private java.util.List<Metrics> metrics; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The ID of the diagnostic metric.</p>
         */
        public Builder metrics(java.util.List<Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The list of diagnostic metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The query token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticMetricsResponseBody build() {
            return new DescribeDiagnosticMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosticMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticMetricsResponseBody</p>
     */
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
             * <p>CPU diagnostic</p>
             * 
             * <strong>example:</strong>
             * <p>The resource type supported by the diagnostic metric.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The operating system type supported by the diagnostic metric. Valid values:</p>
             * <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * <li>All: both Windows and Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder guestMetric(Boolean guestMetric) {
                this.guestMetric = guestMetric;
                return this;
            }

            /**
             * <p>The description of the diagnostic metric.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder metricCategory(String metricCategory) {
                this.metricCategory = metricCategory;
                return this;
            }

            /**
             * <p>The name of the diagnostic metric.</p>
             * 
             * <strong>example:</strong>
             * <p>GuestOS.WinFirewall</p>
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * <p>CPU diagnostic</p>
             * 
             * <strong>example:</strong>
             * <p>The category of the diagnostic metric.</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>Indicates whether the diagnostic metric needs to be assessed by running a Cloud Assistant command in a guest operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
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
