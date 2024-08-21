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
    @com.aliyun.core.annotation.NameInMap("AssetStatus")
    private Integer assetStatus;

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
        this.assetStatus = builder.assetStatus;
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
     * @return assetStatus
     */
    public Integer getAssetStatus() {
        return this.assetStatus;
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
        private Integer assetStatus; 
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
         * AssetStatus.
         */
        public Builder assetStatus(Integer assetStatus) {
            this.assetStatus = assetStatus;
            return this;
        }

        /**
         * The payment status. Valid values:
         * <p>
         * 
         * *   **0**: The payment is not overdue.
         * *   **1**: The payment is overdue.
         */
        public Builder debtStatus(Long debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }

        /**
         * The details about the traffic of EIPs with Anti-DDoS (Enhanced) enabled.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * The traffic distribution of EIPs with Anti-DDoS (Enhanced) enabled by region.
         */
        public Builder flowRegion(java.util.Map < String, ? > flowRegion) {
            this.flowRegion = flowRegion;
            return this;
        }

        /**
         * The ID of the Anti-DDoS Origin (Pay-as-you-go) instance to query.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of protected IP addresses.
         */
        public Builder ipCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }

        /**
         * The protected IP addresses and enabled features.
         */
        public Builder ipCountOrFunctionList(java.util.List < IpCountOrFunctionList> ipCountOrFunctionList) {
            this.ipCountOrFunctionList = ipCountOrFunctionList;
            return this;
        }

        /**
         * The IP address distribution. The JSON struct contains the following fields:
         * <p>
         * 
         * *   **eipCnIpCount**: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland
         * *   **eipOvIpCount**: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland
         * *   **standardAssetsCnIpCount**: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland
         * *   **standardAssetsOvIpCount**: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland
         */
        public Builder ipInfo(String ipInfo) {
            this.ipInfo = ipInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the traffic of regular Alibaba Cloud services.
         */
        public Builder standardAssetsFlowList(java.util.List < StandardAssetsFlowList> standardAssetsFlowList) {
            this.standardAssetsFlowList = standardAssetsFlowList;
            return this;
        }

        /**
         * The traffic distribution of regular Alibaba Cloud services by region.
         */
        public Builder standardAssetsFlowRegion(java.util.Map < String, ? > standardAssetsFlowRegion) {
            this.standardAssetsFlowRegion = standardAssetsFlowRegion;
            return this;
        }

        /**
         * The total traffic of regular Alibaba Cloud services in the Chinese mainland in the current month.
         */
        public Builder standardAssetsTotalFlowCn(Long standardAssetsTotalFlowCn) {
            this.standardAssetsTotalFlowCn = standardAssetsTotalFlowCn;
            return this;
        }

        /**
         * The total traffic of regular Alibaba Cloud services outside the Chinese mainland in the current month.
         */
        public Builder standardAssetsTotalFlowOv(Long standardAssetsTotalFlowOv) {
            this.standardAssetsTotalFlowOv = standardAssetsTotalFlowOv;
            return this;
        }

        /**
         * The instance status. Valid values:
         * <p>
         * 
         * *   **1**: normal
         * *   **2**: expired
         * *   **3**: released
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * The total traffic of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland in the current month. Unit: bytes.
         */
        public Builder totalFlowCn(Long totalFlowCn) {
            this.totalFlowCn = totalFlowCn;
            return this;
        }

        /**
         * The total traffic of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland in the current month. Unit: bytes.
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
             * The traffic distribution by region. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **bytes**: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.
             * *   **memberUid**: the owner account.
             * *   **instanceId**: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.
             * *   **ip**: the EIPs with Anti-DDoS (Enhanced) enabled.
             * *   **region**: the region.
             * 
             * >  If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * The traffic distribution by region. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **bytes**: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.
             * *   **instanceId**: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.
             * *   **ip**: the EIPs with Anti-DDoS (Enhanced) enabled.
             * *   **region**: the region.
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * The timestamp. Unit: milliseconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The traffic of EIPs with Anti-DDoS (Enhanced) enabled. Unit: bytes.
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
             * The application scope of the instance. Valid values:
             * <p>
             * 
             * *   **only_mainland_china**: regions in the Chinese mainland
             * *   **global**: all regions
             * *   **international_and_hmt**: regions outside the Chinese mainland
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * The number of IP addresses protected by the pay-as-you-go instance in the Chinese mainland.
             */
            public Builder ipCntCn(Long ipCntCn) {
                this.ipCntCn = ipCntCn;
                return this;
            }

            /**
             * The number of IP addresses protected by the pay-as-you-go instance outside the Chinese mainland.
             */
            public Builder ipCntOv(Long ipCntOv) {
                this.ipCntOv = ipCntOv;
                return this;
            }

            /**
             * The bill distribution by account. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **eipCnIpCount**: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland
             * *   **eipOvIpCount**: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland
             * *   **memberUid**: the owner account
             * *   **standardAssetsCnIpCount**: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland
             * *   **standardAssetsOvIpCount**: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland
             * 
             * >  If the memberUid field in the JSON struct is empty, the information about the current account is returned.
             */
            public Builder memberIpCnt(String memberIpCnt) {
                this.memberIpCnt = memberIpCnt;
                return this;
            }

            /**
             * The billing time. Unit: milliseconds.
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
             * The traffic distribution by region. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **bytes**: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.
             * *   **memberUid**: the owner account.
             * *   **instanceId**: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.
             * *   **ip**: the IP address of the regular Alibaba Cloud service protected by the Anti-DDoS Origin instance.
             * *   **region**: the region.
             * 
             * >  If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * The traffic distribution by region. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **bytes**: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.
             * *   **instanceId**: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.
             * *   **ip**: the IP address protected by the Anti-DDoS Origin instance.
             * *   **region**: the region.
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * The timestamp. Unit: milliseconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The traffic of regular Alibaba Cloud services. Unit: bytes.
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
