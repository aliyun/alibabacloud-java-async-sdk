// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowChartResponseBody</p>
 */
public class DescribeFlowChartResponseBody extends TeaModel {
    @NameInMap("FlowChart")
    private java.util.List < FlowChart> flowChart;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFlowChartResponseBody(Builder builder) {
        this.flowChart = builder.flowChart;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowChartResponseBody create() {
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
         * FlowChart.
         */
        public Builder flowChart(java.util.List < FlowChart> flowChart) {
            this.flowChart = flowChart;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowChartResponseBody build() {
            return new DescribeFlowChartResponseBody(this);
        } 

    } 

    public static class FlowChart extends TeaModel {
        @NameInMap("AclCustomBlockSum")
        private Long aclCustomBlockSum;

        @NameInMap("AclCustomReportsSum")
        private Long aclCustomReportsSum;

        @NameInMap("AntiScanBlockSum")
        private Long antiScanBlockSum;

        @NameInMap("AntibotBlockSum")
        private Long antibotBlockSum;

        @NameInMap("AntibotReportSum")
        private String antibotReportSum;

        @NameInMap("AntiscanReportsSum")
        private Long antiscanReportsSum;

        @NameInMap("BlacklistBlockSum")
        private String blacklistBlockSum;

        @NameInMap("BlacklistReportsSum")
        private Long blacklistReportsSum;

        @NameInMap("CcCustomBlockSum")
        private Long ccCustomBlockSum;

        @NameInMap("CcCustomReportsSum")
        private Long ccCustomReportsSum;

        @NameInMap("CcSystemBlocksSum")
        private Long ccSystemBlocksSum;

        @NameInMap("CcSystemReportsSum")
        private Long ccSystemReportsSum;

        @NameInMap("Count")
        private Long count;

        @NameInMap("InBytes")
        private Long inBytes;

        @NameInMap("Index")
        private Long index;

        @NameInMap("MaxPv")
        private Long maxPv;

        @NameInMap("OutBytes")
        private Long outBytes;

        @NameInMap("RegionBlockBlocksSum")
        private Long regionBlockBlocksSum;

        @NameInMap("RegionBlockReportsSum")
        private Long regionBlockReportsSum;

        @NameInMap("WafBlockSum")
        private Long wafBlockSum;

        @NameInMap("WafReportSum")
        private String wafReportSum;

        private FlowChart(Builder builder) {
            this.aclCustomBlockSum = builder.aclCustomBlockSum;
            this.aclCustomReportsSum = builder.aclCustomReportsSum;
            this.antiScanBlockSum = builder.antiScanBlockSum;
            this.antibotBlockSum = builder.antibotBlockSum;
            this.antibotReportSum = builder.antibotReportSum;
            this.antiscanReportsSum = builder.antiscanReportsSum;
            this.blacklistBlockSum = builder.blacklistBlockSum;
            this.blacklistReportsSum = builder.blacklistReportsSum;
            this.ccCustomBlockSum = builder.ccCustomBlockSum;
            this.ccCustomReportsSum = builder.ccCustomReportsSum;
            this.ccSystemBlocksSum = builder.ccSystemBlocksSum;
            this.ccSystemReportsSum = builder.ccSystemReportsSum;
            this.count = builder.count;
            this.inBytes = builder.inBytes;
            this.index = builder.index;
            this.maxPv = builder.maxPv;
            this.outBytes = builder.outBytes;
            this.regionBlockBlocksSum = builder.regionBlockBlocksSum;
            this.regionBlockReportsSum = builder.regionBlockReportsSum;
            this.wafBlockSum = builder.wafBlockSum;
            this.wafReportSum = builder.wafReportSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowChart create() {
            return builder().build();
        }

        /**
         * @return aclCustomBlockSum
         */
        public Long getAclCustomBlockSum() {
            return this.aclCustomBlockSum;
        }

        /**
         * @return aclCustomReportsSum
         */
        public Long getAclCustomReportsSum() {
            return this.aclCustomReportsSum;
        }

        /**
         * @return antiScanBlockSum
         */
        public Long getAntiScanBlockSum() {
            return this.antiScanBlockSum;
        }

        /**
         * @return antibotBlockSum
         */
        public Long getAntibotBlockSum() {
            return this.antibotBlockSum;
        }

        /**
         * @return antibotReportSum
         */
        public String getAntibotReportSum() {
            return this.antibotReportSum;
        }

        /**
         * @return antiscanReportsSum
         */
        public Long getAntiscanReportsSum() {
            return this.antiscanReportsSum;
        }

        /**
         * @return blacklistBlockSum
         */
        public String getBlacklistBlockSum() {
            return this.blacklistBlockSum;
        }

        /**
         * @return blacklistReportsSum
         */
        public Long getBlacklistReportsSum() {
            return this.blacklistReportsSum;
        }

        /**
         * @return ccCustomBlockSum
         */
        public Long getCcCustomBlockSum() {
            return this.ccCustomBlockSum;
        }

        /**
         * @return ccCustomReportsSum
         */
        public Long getCcCustomReportsSum() {
            return this.ccCustomReportsSum;
        }

        /**
         * @return ccSystemBlocksSum
         */
        public Long getCcSystemBlocksSum() {
            return this.ccSystemBlocksSum;
        }

        /**
         * @return ccSystemReportsSum
         */
        public Long getCcSystemReportsSum() {
            return this.ccSystemReportsSum;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return maxPv
         */
        public Long getMaxPv() {
            return this.maxPv;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return regionBlockBlocksSum
         */
        public Long getRegionBlockBlocksSum() {
            return this.regionBlockBlocksSum;
        }

        /**
         * @return regionBlockReportsSum
         */
        public Long getRegionBlockReportsSum() {
            return this.regionBlockReportsSum;
        }

        /**
         * @return wafBlockSum
         */
        public Long getWafBlockSum() {
            return this.wafBlockSum;
        }

        /**
         * @return wafReportSum
         */
        public String getWafReportSum() {
            return this.wafReportSum;
        }

        public static final class Builder {
            private Long aclCustomBlockSum; 
            private Long aclCustomReportsSum; 
            private Long antiScanBlockSum; 
            private Long antibotBlockSum; 
            private String antibotReportSum; 
            private Long antiscanReportsSum; 
            private String blacklistBlockSum; 
            private Long blacklistReportsSum; 
            private Long ccCustomBlockSum; 
            private Long ccCustomReportsSum; 
            private Long ccSystemBlocksSum; 
            private Long ccSystemReportsSum; 
            private Long count; 
            private Long inBytes; 
            private Long index; 
            private Long maxPv; 
            private Long outBytes; 
            private Long regionBlockBlocksSum; 
            private Long regionBlockReportsSum; 
            private Long wafBlockSum; 
            private String wafReportSum; 

            /**
             * AclCustomBlockSum.
             */
            public Builder aclCustomBlockSum(Long aclCustomBlockSum) {
                this.aclCustomBlockSum = aclCustomBlockSum;
                return this;
            }

            /**
             * AclCustomReportsSum.
             */
            public Builder aclCustomReportsSum(Long aclCustomReportsSum) {
                this.aclCustomReportsSum = aclCustomReportsSum;
                return this;
            }

            /**
             * AntiScanBlockSum.
             */
            public Builder antiScanBlockSum(Long antiScanBlockSum) {
                this.antiScanBlockSum = antiScanBlockSum;
                return this;
            }

            /**
             * AntibotBlockSum.
             */
            public Builder antibotBlockSum(Long antibotBlockSum) {
                this.antibotBlockSum = antibotBlockSum;
                return this;
            }

            /**
             * AntibotReportSum.
             */
            public Builder antibotReportSum(String antibotReportSum) {
                this.antibotReportSum = antibotReportSum;
                return this;
            }

            /**
             * AntiscanReportsSum.
             */
            public Builder antiscanReportsSum(Long antiscanReportsSum) {
                this.antiscanReportsSum = antiscanReportsSum;
                return this;
            }

            /**
             * BlacklistBlockSum.
             */
            public Builder blacklistBlockSum(String blacklistBlockSum) {
                this.blacklistBlockSum = blacklistBlockSum;
                return this;
            }

            /**
             * BlacklistReportsSum.
             */
            public Builder blacklistReportsSum(Long blacklistReportsSum) {
                this.blacklistReportsSum = blacklistReportsSum;
                return this;
            }

            /**
             * CcCustomBlockSum.
             */
            public Builder ccCustomBlockSum(Long ccCustomBlockSum) {
                this.ccCustomBlockSum = ccCustomBlockSum;
                return this;
            }

            /**
             * CcCustomReportsSum.
             */
            public Builder ccCustomReportsSum(Long ccCustomReportsSum) {
                this.ccCustomReportsSum = ccCustomReportsSum;
                return this;
            }

            /**
             * CcSystemBlocksSum.
             */
            public Builder ccSystemBlocksSum(Long ccSystemBlocksSum) {
                this.ccSystemBlocksSum = ccSystemBlocksSum;
                return this;
            }

            /**
             * CcSystemReportsSum.
             */
            public Builder ccSystemReportsSum(Long ccSystemReportsSum) {
                this.ccSystemReportsSum = ccSystemReportsSum;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * MaxPv.
             */
            public Builder maxPv(Long maxPv) {
                this.maxPv = maxPv;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * RegionBlockBlocksSum.
             */
            public Builder regionBlockBlocksSum(Long regionBlockBlocksSum) {
                this.regionBlockBlocksSum = regionBlockBlocksSum;
                return this;
            }

            /**
             * RegionBlockReportsSum.
             */
            public Builder regionBlockReportsSum(Long regionBlockReportsSum) {
                this.regionBlockReportsSum = regionBlockReportsSum;
                return this;
            }

            /**
             * WafBlockSum.
             */
            public Builder wafBlockSum(Long wafBlockSum) {
                this.wafBlockSum = wafBlockSum;
                return this;
            }

            /**
             * WafReportSum.
             */
            public Builder wafReportSum(String wafReportSum) {
                this.wafReportSum = wafReportSum;
                return this;
            }

            public FlowChart build() {
                return new FlowChart(this);
            } 

        } 

    }
}
