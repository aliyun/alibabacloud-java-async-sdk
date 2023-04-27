// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePeakTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePeakTrendResponseBody</p>
 */
public class DescribePeakTrendResponseBody extends TeaModel {
    @NameInMap("FlowChart")
    private java.util.List < FlowChart> flowChart;

    @NameInMap("RequestId")
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
    public java.util.List < FlowChart> getFlowChart() {
        return this.flowChart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FlowChart> flowChart; 
        private String requestId; 

        /**
         * An array of the QPS statistics of the WAF instance.
         */
        public Builder flowChart(java.util.List < FlowChart> flowChart) {
            this.flowChart = flowChart;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePeakTrendResponseBody build() {
            return new DescribePeakTrendResponseBody(this);
        } 

    } 

    public static class FlowChart extends TeaModel {
        @NameInMap("AclSum")
        private Long aclSum;

        @NameInMap("AntiScanSum")
        private Long antiScanSum;

        @NameInMap("CcSum")
        private Long ccSum;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Index")
        private Long index;

        @NameInMap("WafSum")
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
             * The number of requests that are monitored or blocked by the custom rule (access control) module.
             */
            public Builder aclSum(Long aclSum) {
                this.aclSum = aclSum;
                return this;
            }

            /**
             * The number of requests that are monitored or blocked by the scan protection module.
             */
            public Builder antiScanSum(Long antiScanSum) {
                this.antiScanSum = antiScanSum;
                return this;
            }

            /**
             * The number of requests that are monitored or blocked by the HTTP flood protection module.
             */
            public Builder ccSum(Long ccSum) {
                this.ccSum = ccSum;
                return this;
            }

            /**
             * The total number of requests.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The serial number of the time interval. The serial numbers are arranged in chronological order.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * The number of requests that are monitored or blocked by the regular expression protection engine.
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
