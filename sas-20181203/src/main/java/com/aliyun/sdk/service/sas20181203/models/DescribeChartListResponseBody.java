// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeChartListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChartListResponseBody</p>
 */
public class DescribeChartListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChartList")
    private java.util.List<ChartList> chartList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chartList
     */
    public java.util.List<ChartList> getChartList() {
        return this.chartList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChartList> chartList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChartListResponseBody model) {
            this.chartList = model.chartList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of charts.</p>
         */
        public Builder chartList(java.util.List<ChartList> chartList) {
            this.chartList = chartList;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>35B434CC-1615-5937-A04E-A9BC2868DB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChartListResponseBody build() {
            return new DescribeChartListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChartListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ChartList model) {
                this.businessName = model.businessName;
                this.businessType = model.businessType;
                this.chartId = model.chartId;
                this.chartName = model.chartName;
                this.chartType = model.chartType;
            } 

            /**
             * <p>The business type name. Valid values:</p>
             * <ul>
             * <li>Overall operation metrics</li>
             * <li>Asset operation metrics</li>
             * <li>Security alert operation metrics</li>
             * <li>Vulnerability operation metrics</li>
             * <li>Baseline operation metrics</li>
             * <li>Cloud service operation metrics</li>
             * <li>Cloud honeypot operation metrics.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Overall Operation Metrics</p>
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * <p>The business type. Valid values:</p>
             * <ul>
             * <li>INDEX_SECURITY_OVERALL_OPERATION</li>
             * <li>INDEX_ASSET_OPERATION</li>
             * <li>INDEX_SUSPICIOUS_OPERATION</li>
             * <li>INDEX_VUL_OPERATION</li>
             * <li>INDEX_BASELINE_CHECK_OPERATION</li>
             * <li>INDEX_CLOUD_ASSET_OPERATION</li>
             * <li>INDEX_HONEYPOT_RISK_OPERATION.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INDEX_SECURITY_OVERALL_OPERATION</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The chart ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CID_CLOUD_ASSET_SUMMARY</p>
             */
            public Builder chartId(String chartId) {
                this.chartId = chartId;
                return this;
            }

            /**
             * <p>The chart name.</p>
             * 
             * <strong>example:</strong>
             * <p>Security Score</p>
             */
            public Builder chartName(String chartName) {
                this.chartName = chartName;
                return this;
            }

            /**
             * <p>The chart type. Valid values:</p>
             * <ul>
             * <li><strong>text</strong>: text</li>
             * <li><strong>table</strong>: table</li>
             * <li><strong>gauge</strong>: gauge chart</li>
             * <li><strong>pie</strong>: pie chart</li>
             * <li><strong>line</strong>: line chart</li>
             * <li><strong>bar</strong>: bar chart</li>
             * <li><strong>timeBar</strong>: timeline bar chart</li>
             * <li><strong>timeLine</strong>: timeline line chart.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
