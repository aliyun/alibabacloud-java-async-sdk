// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosOriginInstanceBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosOriginInstanceBillResponseBody</p>
 */
public class DescribeDdosOriginInstanceBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DebtStatus")
    private Long debtStatus;

    @com.aliyun.core.annotation.NameInMap("FlowList")
    private java.util.List < FlowList> flowList;

    @com.aliyun.core.annotation.NameInMap("FlowRegion")
    private java.util.Map < String, ? > flowRegion;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IpCount")
    private Long ipCount;

    @com.aliyun.core.annotation.NameInMap("IpCountOrFunctionList")
    private java.util.List < IpCountOrFunctionList> ipCountOrFunctionList;

    @com.aliyun.core.annotation.NameInMap("IpInfo")
    private String ipInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandardAssetsFlowList")
    private java.util.List < StandardAssetsFlowList> standardAssetsFlowList;

    @com.aliyun.core.annotation.NameInMap("StandardAssetsFlowRegion")
    private java.util.Map < String, ? > standardAssetsFlowRegion;

    @com.aliyun.core.annotation.NameInMap("StandardAssetsTotalFlowCn")
    private Long standardAssetsTotalFlowCn;

    @com.aliyun.core.annotation.NameInMap("StandardAssetsTotalFlowOv")
    private Long standardAssetsTotalFlowOv;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("TotalFlowCn")
    private Long totalFlowCn;

    @com.aliyun.core.annotation.NameInMap("TotalFlowOv")
    private Long totalFlowOv;

    private DescribeDdosOriginInstanceBillResponseBody(Builder builder) {
        this.debtStatus = builder.debtStatus;
        this.flowList = builder.flowList;
        this.flowRegion = builder.flowRegion;
        this.instanceId = builder.instanceId;
        this.ipCount = builder.ipCount;
        this.ipCountOrFunctionList = builder.ipCountOrFunctionList;
        this.ipInfo = builder.ipInfo;
        this.requestId = builder.requestId;
        this.standardAssetsFlowList = builder.standardAssetsFlowList;
        this.standardAssetsFlowRegion = builder.standardAssetsFlowRegion;
        this.standardAssetsTotalFlowCn = builder.standardAssetsTotalFlowCn;
        this.standardAssetsTotalFlowOv = builder.standardAssetsTotalFlowOv;
        this.status = builder.status;
        this.totalFlowCn = builder.totalFlowCn;
        this.totalFlowOv = builder.totalFlowOv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosOriginInstanceBillResponseBody create() {
        return builder().build();
    }

    /**
     * @return debtStatus
     */
    public Long getDebtStatus() {
        return this.debtStatus;
    }

    /**
     * @return flowList
     */
    public java.util.List < FlowList> getFlowList() {
        return this.flowList;
    }

    /**
     * @return flowRegion
     */
    public java.util.Map < String, ? > getFlowRegion() {
        return this.flowRegion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipCount
     */
    public Long getIpCount() {
        return this.ipCount;
    }

    /**
     * @return ipCountOrFunctionList
     */
    public java.util.List < IpCountOrFunctionList> getIpCountOrFunctionList() {
        return this.ipCountOrFunctionList;
    }

    /**
     * @return ipInfo
     */
    public String getIpInfo() {
        return this.ipInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standardAssetsFlowList
     */
    public java.util.List < StandardAssetsFlowList> getStandardAssetsFlowList() {
        return this.standardAssetsFlowList;
    }

    /**
     * @return standardAssetsFlowRegion
     */
    public java.util.Map < String, ? > getStandardAssetsFlowRegion() {
        return this.standardAssetsFlowRegion;
    }

    /**
     * @return standardAssetsTotalFlowCn
     */
    public Long getStandardAssetsTotalFlowCn() {
        return this.standardAssetsTotalFlowCn;
    }

    /**
     * @return standardAssetsTotalFlowOv
     */
    public Long getStandardAssetsTotalFlowOv() {
        return this.standardAssetsTotalFlowOv;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return totalFlowCn
     */
    public Long getTotalFlowCn() {
        return this.totalFlowCn;
    }

    /**
     * @return totalFlowOv
     */
    public Long getTotalFlowOv() {
        return this.totalFlowOv;
    }

    public static final class Builder {
        private Long debtStatus; 
        private java.util.List < FlowList> flowList; 
        private java.util.Map < String, ? > flowRegion; 
        private String instanceId; 
        private Long ipCount; 
        private java.util.List < IpCountOrFunctionList> ipCountOrFunctionList; 
        private String ipInfo; 
        private String requestId; 
        private java.util.List < StandardAssetsFlowList> standardAssetsFlowList; 
        private java.util.Map < String, ? > standardAssetsFlowRegion; 
        private Long standardAssetsTotalFlowCn; 
        private Long standardAssetsTotalFlowOv; 
        private Long status; 
        private Long totalFlowCn; 
        private Long totalFlowOv; 

        /**
         * DebtStatus.
         */
        public Builder debtStatus(Long debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }

        /**
         * FlowList.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * FlowRegion.
         */
        public Builder flowRegion(java.util.Map < String, ? > flowRegion) {
            this.flowRegion = flowRegion;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpCount.
         */
        public Builder ipCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }

        /**
         * IpCountOrFunctionList.
         */
        public Builder ipCountOrFunctionList(java.util.List < IpCountOrFunctionList> ipCountOrFunctionList) {
            this.ipCountOrFunctionList = ipCountOrFunctionList;
            return this;
        }

        /**
         * IpInfo.
         */
        public Builder ipInfo(String ipInfo) {
            this.ipInfo = ipInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StandardAssetsFlowList.
         */
        public Builder standardAssetsFlowList(java.util.List < StandardAssetsFlowList> standardAssetsFlowList) {
            this.standardAssetsFlowList = standardAssetsFlowList;
            return this;
        }

        /**
         * StandardAssetsFlowRegion.
         */
        public Builder standardAssetsFlowRegion(java.util.Map < String, ? > standardAssetsFlowRegion) {
            this.standardAssetsFlowRegion = standardAssetsFlowRegion;
            return this;
        }

        /**
         * StandardAssetsTotalFlowCn.
         */
        public Builder standardAssetsTotalFlowCn(Long standardAssetsTotalFlowCn) {
            this.standardAssetsTotalFlowCn = standardAssetsTotalFlowCn;
            return this;
        }

        /**
         * StandardAssetsTotalFlowOv.
         */
        public Builder standardAssetsTotalFlowOv(Long standardAssetsTotalFlowOv) {
            this.standardAssetsTotalFlowOv = standardAssetsTotalFlowOv;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * TotalFlowCn.
         */
        public Builder totalFlowCn(Long totalFlowCn) {
            this.totalFlowCn = totalFlowCn;
            return this;
        }

        /**
         * TotalFlowOv.
         */
        public Builder totalFlowOv(Long totalFlowOv) {
            this.totalFlowOv = totalFlowOv;
            return this;
        }

        public DescribeDdosOriginInstanceBillResponseBody build() {
            return new DescribeDdosOriginInstanceBillResponseBody(this);
        } 

    } 

    public static class FlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberFlow")
        private String memberFlow;

        @com.aliyun.core.annotation.NameInMap("RegionFlow")
        private String regionFlow;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalFlow")
        private Long totalFlow;

        private FlowList(Builder builder) {
            this.memberFlow = builder.memberFlow;
            this.regionFlow = builder.regionFlow;
            this.time = builder.time;
            this.totalFlow = builder.totalFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowList create() {
            return builder().build();
        }

        /**
         * @return memberFlow
         */
        public String getMemberFlow() {
            return this.memberFlow;
        }

        /**
         * @return regionFlow
         */
        public String getRegionFlow() {
            return this.regionFlow;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalFlow
         */
        public Long getTotalFlow() {
            return this.totalFlow;
        }

        public static final class Builder {
            private String memberFlow; 
            private String regionFlow; 
            private Long time; 
            private Long totalFlow; 

            /**
             * MemberFlow.
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * RegionFlow.
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalFlow.
             */
            public Builder totalFlow(Long totalFlow) {
                this.totalFlow = totalFlow;
                return this;
            }

            public FlowList build() {
                return new FlowList(this);
            } 

        } 

    }
    public static class IpCountOrFunctionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("IpCntCn")
        private Long ipCntCn;

        @com.aliyun.core.annotation.NameInMap("IpCntOv")
        private Long ipCntOv;

        @com.aliyun.core.annotation.NameInMap("MemberIpCnt")
        private String memberIpCnt;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private IpCountOrFunctionList(Builder builder) {
            this.coverage = builder.coverage;
            this.ipCntCn = builder.ipCntCn;
            this.ipCntOv = builder.ipCntOv;
            this.memberIpCnt = builder.memberIpCnt;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpCountOrFunctionList create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return ipCntCn
         */
        public Long getIpCntCn() {
            return this.ipCntCn;
        }

        /**
         * @return ipCntOv
         */
        public Long getIpCntOv() {
            return this.ipCntOv;
        }

        /**
         * @return memberIpCnt
         */
        public String getMemberIpCnt() {
            return this.memberIpCnt;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String coverage; 
            private Long ipCntCn; 
            private Long ipCntOv; 
            private String memberIpCnt; 
            private Long time; 

            /**
             * Coverage.
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * IpCntCn.
             */
            public Builder ipCntCn(Long ipCntCn) {
                this.ipCntCn = ipCntCn;
                return this;
            }

            /**
             * IpCntOv.
             */
            public Builder ipCntOv(Long ipCntOv) {
                this.ipCntOv = ipCntOv;
                return this;
            }

            /**
             * MemberIpCnt.
             */
            public Builder memberIpCnt(String memberIpCnt) {
                this.memberIpCnt = memberIpCnt;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public IpCountOrFunctionList build() {
                return new IpCountOrFunctionList(this);
            } 

        } 

    }
    public static class StandardAssetsFlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberFlow")
        private String memberFlow;

        @com.aliyun.core.annotation.NameInMap("RegionFlow")
        private String regionFlow;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalFlow")
        private Long totalFlow;

        private StandardAssetsFlowList(Builder builder) {
            this.memberFlow = builder.memberFlow;
            this.regionFlow = builder.regionFlow;
            this.time = builder.time;
            this.totalFlow = builder.totalFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardAssetsFlowList create() {
            return builder().build();
        }

        /**
         * @return memberFlow
         */
        public String getMemberFlow() {
            return this.memberFlow;
        }

        /**
         * @return regionFlow
         */
        public String getRegionFlow() {
            return this.regionFlow;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalFlow
         */
        public Long getTotalFlow() {
            return this.totalFlow;
        }

        public static final class Builder {
            private String memberFlow; 
            private String regionFlow; 
            private Long time; 
            private Long totalFlow; 

            /**
             * MemberFlow.
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * RegionFlow.
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalFlow.
             */
            public Builder totalFlow(Long totalFlow) {
                this.totalFlow = totalFlow;
                return this;
            }

            public StandardAssetsFlowList build() {
                return new StandardAssetsFlowList(this);
            } 

        } 

    }
}
