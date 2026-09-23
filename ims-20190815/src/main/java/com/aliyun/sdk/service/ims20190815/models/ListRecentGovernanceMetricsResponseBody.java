// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListRecentGovernanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentGovernanceMetricsResponseBody</p>
 */
public class ListRecentGovernanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GenerateTime")
    private String generateTime;

    @com.aliyun.core.annotation.NameInMap("GovernanceMetrics")
    private GovernanceMetrics governanceMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRecentGovernanceMetricsResponseBody(Builder builder) {
        this.generateTime = builder.generateTime;
        this.governanceMetrics = builder.governanceMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentGovernanceMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generateTime
     */
    public String getGenerateTime() {
        return this.generateTime;
    }

    /**
     * @return governanceMetrics
     */
    public GovernanceMetrics getGovernanceMetrics() {
        return this.governanceMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String generateTime; 
        private GovernanceMetrics governanceMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRecentGovernanceMetricsResponseBody model) {
            this.generateTime = model.generateTime;
            this.governanceMetrics = model.governanceMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-10T02:11:23Z</p>
         */
        public Builder generateTime(String generateTime) {
            this.generateTime = generateTime;
            return this;
        }

        /**
         * GovernanceMetrics.
         */
        public Builder governanceMetrics(GovernanceMetrics governanceMetrics) {
            this.governanceMetrics = governanceMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49846A91-C1C5-5C2B-BC64-8B0B7BADB4C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecentGovernanceMetricsResponseBody build() {
            return new ListRecentGovernanceMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentGovernanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentGovernanceMetricsResponseBody</p>
     */
    public static class GovernanceMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernanceItem")
        private String governanceItem;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private Object metricValue;

        private GovernanceMetric(Builder builder) {
            this.governanceItem = builder.governanceItem;
            this.metricType = builder.metricType;
            this.metricValue = builder.metricValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GovernanceMetric create() {
            return builder().build();
        }

        /**
         * @return governanceItem
         */
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return metricValue
         */
        public Object getMetricValue() {
            return this.metricValue;
        }

        public static final class Builder {
            private String governanceItem; 
            private String metricType; 
            private Object metricValue; 

            private Builder() {
            } 

            private Builder(GovernanceMetric model) {
                this.governanceItem = model.governanceItem;
                this.metricType = model.metricType;
                this.metricValue = model.metricValue;
            } 

            /**
             * GovernanceItem.
             */
            public Builder governanceItem(String governanceItem) {
                this.governanceItem = governanceItem;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * MetricValue.
             */
            public Builder metricValue(Object metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            public GovernanceMetric build() {
                return new GovernanceMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentGovernanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentGovernanceMetricsResponseBody</p>
     */
    public static class GovernanceMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernanceMetric")
        private java.util.List<GovernanceMetric> governanceMetric;

        private GovernanceMetrics(Builder builder) {
            this.governanceMetric = builder.governanceMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GovernanceMetrics create() {
            return builder().build();
        }

        /**
         * @return governanceMetric
         */
        public java.util.List<GovernanceMetric> getGovernanceMetric() {
            return this.governanceMetric;
        }

        public static final class Builder {
            private java.util.List<GovernanceMetric> governanceMetric; 

            private Builder() {
            } 

            private Builder(GovernanceMetrics model) {
                this.governanceMetric = model.governanceMetric;
            } 

            /**
             * GovernanceMetric.
             */
            public Builder governanceMetric(java.util.List<GovernanceMetric> governanceMetric) {
                this.governanceMetric = governanceMetric;
                return this;
            }

            public GovernanceMetrics build() {
                return new GovernanceMetrics(this);
            } 

        } 

    }
}
