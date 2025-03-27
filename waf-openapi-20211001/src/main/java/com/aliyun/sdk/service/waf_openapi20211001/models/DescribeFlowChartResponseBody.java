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
 * {@link DescribeFlowChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowChartResponseBody</p>
 */
public class DescribeFlowChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowChart")
    private java.util.List<FlowChart> flowChart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFlowChartResponseBody model) {
            this.flowChart = model.flowChart;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The traffic statistics.</p>
         */
        public Builder flowChart(java.util.List<FlowChart> flowChart) {
            this.flowChart = flowChart;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BFA71416-670E-585D-AAE6-E7BBEE248FAB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowChartResponseBody build() {
            return new DescribeFlowChartResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowChartResponseBody</p>
     */
    public static class FlowChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclCustomBlockSum")
        private Long aclCustomBlockSum;

        @com.aliyun.core.annotation.NameInMap("AclCustomReportsSum")
        private Long aclCustomReportsSum;

        @com.aliyun.core.annotation.NameInMap("AntiScanBlockSum")
        private Long antiScanBlockSum;

        @com.aliyun.core.annotation.NameInMap("AntibotBlockSum")
        private Long antibotBlockSum;

        @com.aliyun.core.annotation.NameInMap("AntibotReportSum")
        private String antibotReportSum;

        @com.aliyun.core.annotation.NameInMap("AntiscanReportsSum")
        private Long antiscanReportsSum;

        @com.aliyun.core.annotation.NameInMap("BlacklistBlockSum")
        private String blacklistBlockSum;

        @com.aliyun.core.annotation.NameInMap("BlacklistReportsSum")
        private Long blacklistReportsSum;

        @com.aliyun.core.annotation.NameInMap("CcCustomBlockSum")
        private Long ccCustomBlockSum;

        @com.aliyun.core.annotation.NameInMap("CcCustomReportsSum")
        private Long ccCustomReportsSum;

        @com.aliyun.core.annotation.NameInMap("CcSystemBlocksSum")
        private Long ccSystemBlocksSum;

        @com.aliyun.core.annotation.NameInMap("CcSystemReportsSum")
        private Long ccSystemReportsSum;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("MaxPv")
        private Long maxPv;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("RatelimitBlockSum")
        private Long ratelimitBlockSum;

        @com.aliyun.core.annotation.NameInMap("RatelimitReportSum")
        private Long ratelimitReportSum;

        @com.aliyun.core.annotation.NameInMap("RegionBlockBlocksSum")
        private Long regionBlockBlocksSum;

        @com.aliyun.core.annotation.NameInMap("RegionBlockReportsSum")
        private Long regionBlockReportsSum;

        @com.aliyun.core.annotation.NameInMap("RobotCount")
        private Long robotCount;

        @com.aliyun.core.annotation.NameInMap("WafBlockSum")
        private Long wafBlockSum;

        @com.aliyun.core.annotation.NameInMap("WafReportSum")
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
            this.ratelimitBlockSum = builder.ratelimitBlockSum;
            this.ratelimitReportSum = builder.ratelimitReportSum;
            this.regionBlockBlocksSum = builder.regionBlockBlocksSum;
            this.regionBlockReportsSum = builder.regionBlockReportsSum;
            this.robotCount = builder.robotCount;
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
         * @return ratelimitBlockSum
         */
        public Long getRatelimitBlockSum() {
            return this.ratelimitBlockSum;
        }

        /**
         * @return ratelimitReportSum
         */
        public Long getRatelimitReportSum() {
            return this.ratelimitReportSum;
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
         * @return robotCount
         */
        public Long getRobotCount() {
            return this.robotCount;
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
            private Long ratelimitBlockSum; 
            private Long ratelimitReportSum; 
            private Long regionBlockBlocksSum; 
            private Long regionBlockReportsSum; 
            private Long robotCount; 
            private Long wafBlockSum; 
            private String wafReportSum; 

            private Builder() {
            } 

            private Builder(FlowChart model) {
                this.aclCustomBlockSum = model.aclCustomBlockSum;
                this.aclCustomReportsSum = model.aclCustomReportsSum;
                this.antiScanBlockSum = model.antiScanBlockSum;
                this.antibotBlockSum = model.antibotBlockSum;
                this.antibotReportSum = model.antibotReportSum;
                this.antiscanReportsSum = model.antiscanReportsSum;
                this.blacklistBlockSum = model.blacklistBlockSum;
                this.blacklistReportsSum = model.blacklistReportsSum;
                this.ccCustomBlockSum = model.ccCustomBlockSum;
                this.ccCustomReportsSum = model.ccCustomReportsSum;
                this.ccSystemBlocksSum = model.ccSystemBlocksSum;
                this.ccSystemReportsSum = model.ccSystemReportsSum;
                this.count = model.count;
                this.inBytes = model.inBytes;
                this.index = model.index;
                this.maxPv = model.maxPv;
                this.outBytes = model.outBytes;
                this.ratelimitBlockSum = model.ratelimitBlockSum;
                this.ratelimitReportSum = model.ratelimitReportSum;
                this.regionBlockBlocksSum = model.regionBlockBlocksSum;
                this.regionBlockReportsSum = model.regionBlockReportsSum;
                this.robotCount = model.robotCount;
                this.wafBlockSum = model.wafBlockSum;
                this.wafReportSum = model.wafReportSum;
            } 

            /**
             * <p>The number of requests that are blocked by custom access control list (ACL) rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aclCustomBlockSum(Long aclCustomBlockSum) {
                this.aclCustomBlockSum = aclCustomBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by custom ACL rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aclCustomReportsSum(Long aclCustomReportsSum) {
                this.aclCustomReportsSum = aclCustomReportsSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by scan protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder antiScanBlockSum(Long antiScanBlockSum) {
                this.antiScanBlockSum = antiScanBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by bot management rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder antibotBlockSum(Long antibotBlockSum) {
                this.antibotBlockSum = antibotBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by bot management rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder antibotReportSum(String antibotReportSum) {
                this.antibotReportSum = antibotReportSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by scan protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder antiscanReportsSum(Long antiscanReportsSum) {
                this.antiscanReportsSum = antiscanReportsSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by the IP address blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder blacklistBlockSum(String blacklistBlockSum) {
                this.blacklistBlockSum = blacklistBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by the IP address blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder blacklistReportsSum(Long blacklistReportsSum) {
                this.blacklistReportsSum = blacklistReportsSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by custom HTTP flood protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccCustomBlockSum(Long ccCustomBlockSum) {
                this.ccCustomBlockSum = ccCustomBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by custom HTTP flood protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccCustomReportsSum(Long ccCustomReportsSum) {
                this.ccCustomReportsSum = ccCustomReportsSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by HTTP flood protection rules created by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccSystemBlocksSum(Long ccSystemBlocksSum) {
                this.ccSystemBlocksSum = ccSystemBlocksSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by HTTP flood protection rules created by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccSystemReportsSum(Long ccSystemReportsSum) {
                this.ccSystemReportsSum = ccSystemReportsSum;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>2932</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The total number of requests that are redirected to the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>121645464</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
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
             * <p>The peak traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>2932</p>
             */
            public Builder maxPv(Long maxPv) {
                this.maxPv = maxPv;
                return this;
            }

            /**
             * <p>The total number of requests that are forwarded by the WAF instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1200540464</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by rate limiting rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ratelimitBlockSum(Long ratelimitBlockSum) {
                this.ratelimitBlockSum = ratelimitBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by rate limiting rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ratelimitReportSum(Long ratelimitReportSum) {
                this.ratelimitReportSum = ratelimitReportSum;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by region blacklist rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder regionBlockBlocksSum(Long regionBlockBlocksSum) {
                this.regionBlockBlocksSum = regionBlockBlocksSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by region blacklist rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder regionBlockReportsSum(Long regionBlockReportsSum) {
                this.regionBlockReportsSum = regionBlockReportsSum;
                return this;
            }

            /**
             * <p>The total number of bot requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1110</p>
             */
            public Builder robotCount(Long robotCount) {
                this.robotCount = robotCount;
                return this;
            }

            /**
             * <p>The number of requests that are blocked by basic protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wafBlockSum(Long wafBlockSum) {
                this.wafBlockSum = wafBlockSum;
                return this;
            }

            /**
             * <p>The number of requests that are monitored by basic protection rules.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
