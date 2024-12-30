// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePeakTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePeakTrendResponseBody</p>
 */
public class DescribePeakTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowChart")
    private java.util.List<FlowChart> flowChart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePeakTrendResponseBody(Builder builder) {
        this.flowChart = builder.flowChart;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePeakTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowChart
     */
    public java.util.List<FlowChart> getFlowChart() {
        return this.flowChart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FlowChart> flowChart; 
        private String requestId; 

        /**
         * <p>An array of the QPS statistics of the WAF instance.</p>
         */
        public Builder flowChart(java.util.List<FlowChart> flowChart) {
            this.flowChart = flowChart;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D11AC3A-A10C-56E7-A342-E87EC892BAE2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePeakTrendResponseBody build() {
            return new DescribePeakTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePeakTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePeakTrendResponseBody</p>
     */
    public static class FlowChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclSum")
        private Long aclSum;

        @com.aliyun.core.annotation.NameInMap("AntiScanSum")
        private Long antiScanSum;

        @com.aliyun.core.annotation.NameInMap("CcSum")
        private Long ccSum;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("WafSum")
        private Long wafSum;

        private FlowChart(Builder builder) {
            this.aclSum = builder.aclSum;
            this.antiScanSum = builder.antiScanSum;
            this.ccSum = builder.ccSum;
            this.count = builder.count;
            this.index = builder.index;
            this.wafSum = builder.wafSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowChart create() {
            return builder().build();
        }

        /**
         * @return aclSum
         */
        public Long getAclSum() {
            return this.aclSum;
        }

        /**
         * @return antiScanSum
         */
        public Long getAntiScanSum() {
            return this.antiScanSum;
        }

        /**
         * @return ccSum
         */
        public Long getCcSum() {
            return this.ccSum;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return wafSum
         */
        public Long getWafSum() {
            return this.wafSum;
        }

        public static final class Builder {
            private Long aclSum; 
            private Long antiScanSum; 
            private Long ccSum; 
            private Long count; 
            private Long index; 
            private Long wafSum; 

            /**
             * <p>The number of requests that are monitored or blocked by the custom rule (access control) module.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aclSum(Long aclSum) {
                this.aclSum = aclSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored or blocked by the scan protection module.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder antiScanSum(Long antiScanSum) {
                this.antiScanSum = antiScanSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored or blocked by the HTTP flood protection module.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccSum(Long ccSum) {
                this.ccSum = ccSum;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>2622</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The serial number of the time interval. The serial numbers are arranged in chronological order.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The number of requests that are monitored or blocked by the regular expression protection engine.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wafSum(Long wafSum) {
                this.wafSum = wafSum;
                return this;
            }

            public FlowChart build() {
                return new FlowChart(this);
            } 

        } 

    }
}
