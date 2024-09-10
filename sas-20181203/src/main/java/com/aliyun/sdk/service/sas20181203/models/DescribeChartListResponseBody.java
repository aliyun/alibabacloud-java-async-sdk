// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChartListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChartListResponseBody</p>
 */
public class DescribeChartListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChartList")
    private java.util.List < ChartList> chartList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChartListResponseBody(Builder builder) {
        this.chartList = builder.chartList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChartListResponseBody create() {
        return builder().build();
    }

    /**
     * @return chartList
     */
    public java.util.List < ChartList> getChartList() {
        return this.chartList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ChartList> chartList; 
        private String requestId; 

        /**
         * The charts.
         */
        public Builder chartList(java.util.List < ChartList> chartList) {
            this.chartList = chartList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChartListResponseBody build() {
            return new DescribeChartListResponseBody(this);
        } 

    } 

    public static class ChartList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("ChartId")
        private String chartId;

        @com.aliyun.core.annotation.NameInMap("ChartName")
        private String chartName;

        @com.aliyun.core.annotation.NameInMap("ChartType")
        private String chartType;

        private ChartList(Builder builder) {
            this.businessName = builder.businessName;
            this.businessType = builder.businessType;
            this.chartId = builder.chartId;
            this.chartName = builder.chartName;
            this.chartType = builder.chartType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChartList create() {
            return builder().build();
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return chartId
         */
        public String getChartId() {
            return this.chartId;
        }

        /**
         * @return chartName
         */
        public String getChartName() {
            return this.chartName;
        }

        /**
         * @return chartType
         */
        public String getChartType() {
            return this.chartType;
        }

        public static final class Builder {
            private String businessName; 
            private String businessType; 
            private String chartId; 
            private String chartName; 
            private String chartType; 

            /**
             * The name of the business type. Valid values:
             * <p>
             * 
             * *   Overall Operations Metrics
             * *   Asset Operations Metrics
             * *   Security Alert Operations Metrics
             * *   Vulnerability Operations Metrics
             * *   Baseline Operations Metrics
             * *   Cloud Product Operations Metrics
             * *   Honeypot Operations Metrics
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * The business type. Valid values:
             * <p>
             * 
             * *   INDEX_SECURITY_OVERALL_OPERATION
             * *   INDEX_ASSET_OPERATION
             * *   INDEX_SUSPICIOUS_OPERATION
             * *   INDEX_VUL_OPERATION
             * *   INDEX_BASELINE_CHECK_OPERATION
             * *   INDEX_CLOUD_ASSET_OPERATION
             * *   INDEX_HONEYPOT_RISK_OPERATION
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * The ID of the chart.
             */
            public Builder chartId(String chartId) {
                this.chartId = chartId;
                return this;
            }

            /**
             * The name of the chart.
             */
            public Builder chartName(String chartName) {
                this.chartName = chartName;
                return this;
            }

            /**
             * The type of the chart. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **table**
             * *   **gauge**
             * *   **pie**
             * *   **line**
             * *   **bar**
             * *   **timeBar**
             * *   **timeLine**
             */
            public Builder chartType(String chartType) {
                this.chartType = chartType;
                return this;
            }

            public ChartList build() {
                return new ChartList(this);
            } 

        } 

    }
}
