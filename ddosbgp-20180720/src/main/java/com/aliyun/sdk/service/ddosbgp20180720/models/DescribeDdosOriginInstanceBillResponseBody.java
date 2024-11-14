// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.NameInMap("MonthlySummaryList")
    private java.util.List < MonthlySummaryList> monthlySummaryList;

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
        this.monthlySummaryList = builder.monthlySummaryList;
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
     * @return monthlySummaryList
     */
    public java.util.List < MonthlySummaryList> getMonthlySummaryList() {
        return this.monthlySummaryList;
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
        private java.util.List < MonthlySummaryList> monthlySummaryList; 
        private String requestId; 
        private java.util.List < StandardAssetsFlowList> standardAssetsFlowList; 
        private java.util.Map < String, ? > standardAssetsFlowRegion; 
        private Long standardAssetsTotalFlowCn; 
        private Long standardAssetsTotalFlowOv; 
        private Long status; 
        private Long totalFlowCn; 
        private Long totalFlowOv; 

        /**
         * <p>The asset status.</p>
         * <ul>
         * <li><strong>0</strong>: No asset is added to the instance for protection.</li>
         * <li><strong>1</strong>: Assets are added to the instance for protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder assetStatus(Integer assetStatus) {
            this.assetStatus = assetStatus;
            return this;
        }

        /**
         * <p>The payment status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The payment is not overdue.</li>
         * <li><strong>1</strong>: The payment is overdue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder debtStatus(Long debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }

        /**
         * <p>The details about the traffic of EIPs with Anti-DDoS (Enhanced) enabled.</p>
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * <p>The traffic distribution of EIPs with Anti-DDoS (Enhanced) enabled by region.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cn-hongkong&quot;: 166491566}</p>
         */
        public Builder flowRegion(java.util.Map < String, ? > flowRegion) {
            this.flowRegion = flowRegion;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Origin (Pay-as-you-go) instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosorigin_cn-u7c3lcr9r02</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of protected IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder ipCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }

        /**
         * <p>The protected IP addresses and enabled features.</p>
         */
        public Builder ipCountOrFunctionList(java.util.List < IpCountOrFunctionList> ipCountOrFunctionList) {
            this.ipCountOrFunctionList = ipCountOrFunctionList;
            return this;
        }

        /**
         * <p>The IP address distribution. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>eipCnIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
         * <li><strong>eipOvIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
         * <li><strong>standardAssetsCnIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland.</li>
         * <li><strong>standardAssetsOvIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;eipCnIpCount&quot;:6,&quot;eipOvIpCount&quot;:17,&quot;standardAssetsCnIpCount&quot;:2,&quot;standardAssetsOvIpCount&quot;:0}</p>
         */
        public Builder ipInfo(String ipInfo) {
            this.ipInfo = ipInfo;
            return this;
        }

        /**
         * MonthlySummaryList.
         */
        public Builder monthlySummaryList(java.util.List < MonthlySummaryList> monthlySummaryList) {
            this.monthlySummaryList = monthlySummaryList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72155560-F343-55C8-82FE-ED4D7E4AA97E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the traffic of regular Alibaba Cloud services.</p>
         */
        public Builder standardAssetsFlowList(java.util.List < StandardAssetsFlowList> standardAssetsFlowList) {
            this.standardAssetsFlowList = standardAssetsFlowList;
            return this;
        }

        /**
         * <p>The traffic distribution of regular Alibaba Cloud services by region.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cn-hongkong&quot;: 166491566}</p>
         */
        public Builder standardAssetsFlowRegion(java.util.Map < String, ? > standardAssetsFlowRegion) {
            this.standardAssetsFlowRegion = standardAssetsFlowRegion;
            return this;
        }

        /**
         * <p>The total traffic of regular Alibaba Cloud services in the Chinese mainland in the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder standardAssetsTotalFlowCn(Long standardAssetsTotalFlowCn) {
            this.standardAssetsTotalFlowCn = standardAssetsTotalFlowCn;
            return this;
        }

        /**
         * <p>The total traffic of regular Alibaba Cloud services outside the Chinese mainland in the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder standardAssetsTotalFlowOv(Long standardAssetsTotalFlowOv) {
            this.standardAssetsTotalFlowOv = standardAssetsTotalFlowOv;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: normal</li>
         * <li><strong>2</strong>: expired</li>
         * <li><strong>3</strong>: released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland in the current month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6302081067</p>
         */
        public Builder totalFlowCn(Long totalFlowCn) {
            this.totalFlowCn = totalFlowCn;
            return this;
        }

        /**
         * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland in the current month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6204918019</p>
         */
        public Builder totalFlowOv(Long totalFlowOv) {
            this.totalFlowOv = totalFlowOv;
            return this;
        }

        public DescribeDdosOriginInstanceBillResponseBody build() {
            return new DescribeDdosOriginInstanceBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDdosOriginInstanceBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosOriginInstanceBillResponseBody</p>
     */
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
             * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>bytes</strong>: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.</li>
             * <li><strong>memberUid</strong>: the owner account.</li>
             * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.</li>
             * <li><strong>ip</strong>: the EIPs with Anti-DDoS (Enhanced) enabled.</li>
             * <li><strong>region</strong>: the region.</li>
             * </ul>
             * <blockquote>
             * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;bytes&quot;:79282719,&quot;memberUid&quot;:&quot;&quot;,&quot;regionFlows&quot;:{&quot;cn-hangzhou&quot;:[{&quot;bytes&quot;:79282719,&quot;instanceId&quot;:&quot;ddosorigin_cn-u7c3lcr9r02&quot;,&quot;ip&quot;:&quot;47.118.168.57&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;}]}}]</p>
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>bytes</strong>: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.</li>
             * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.</li>
             * <li><strong>ip</strong>: the EIPs with Anti-DDoS (Enhanced) enabled.</li>
             * <li><strong>region</strong>: the region.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cn-hangzhou&quot;:[{&quot;bytes&quot;:0,&quot;instanceId&quot;:&quot;ddosorigin_cn-u7c3lcr9r02&quot;,&quot;ip&quot;:&quot;47.118.168.124&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;}]}</p>
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * <p>The timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620951900</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The traffic of EIPs with Anti-DDoS (Enhanced) enabled. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>6302081067</p>
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
    /**
     * 
     * {@link DescribeDdosOriginInstanceBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosOriginInstanceBillResponseBody</p>
     */
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
             * <p>The application scope of the instance. Valid values:</p>
             * <ul>
             * <li><strong>only_mainland_china</strong>: regions in the Chinese mainland.</li>
             * <li><strong>global</strong>: all regions.</li>
             * <li><strong>international_and_hmt</strong>: regions outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The number of IP addresses protected by the pay-as-you-go instance in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ipCntCn(Long ipCntCn) {
                this.ipCntCn = ipCntCn;
                return this;
            }

            /**
             * <p>The number of IP addresses protected by the pay-as-you-go instance outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ipCntOv(Long ipCntOv) {
                this.ipCntOv = ipCntOv;
                return this;
            }

            /**
             * <p>The bill distribution by account. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>eipCnIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
             * <li><strong>eipOvIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
             * <li><strong>memberUid</strong>: the owner account.</li>
             * <li><strong>standardAssetsCnIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland.</li>
             * <li><strong>standardAssetsOvIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland.</li>
             * </ul>
             * <blockquote>
             * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;eipCnIpCount&quot;:3,&quot;eipOvIpCount&quot;:18,&quot;memberUid&quot;:&quot;&quot;,&quot;standardAssetsCnIpCount&quot;:2,&quot;standardAssetsOvIpCount&quot;:0},{&quot;eipCnIpCount&quot;:3,&quot;eipOvIpCount&quot;:0,&quot;memberUid&quot;:&quot;1776997906319249&quot;,&quot;standardAssetsCnIpCount&quot;:0,&quot;standardAssetsOvIpCount&quot;:0}]</p>
             */
            public Builder memberIpCnt(String memberIpCnt) {
                this.memberIpCnt = memberIpCnt;
                return this;
            }

            /**
             * <p>The billing time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1680278400000</p>
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
    /**
     * 
     * {@link DescribeDdosOriginInstanceBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosOriginInstanceBillResponseBody</p>
     */
    public static class MonthlySummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableDays")
        private Integer enableDays;

        @com.aliyun.core.annotation.NameInMap("FlowCn")
        private Long flowCn;

        @com.aliyun.core.annotation.NameInMap("FlowIntl")
        private Long flowIntl;

        @com.aliyun.core.annotation.NameInMap("IpCountCn")
        private Integer ipCountCn;

        @com.aliyun.core.annotation.NameInMap("IpCountIntl")
        private Integer ipCountIntl;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("StandardAssetsFlowCn")
        private Long standardAssetsFlowCn;

        @com.aliyun.core.annotation.NameInMap("StandardAssetsFlowIntl")
        private Long standardAssetsFlowIntl;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private MonthlySummaryList(Builder builder) {
            this.enableDays = builder.enableDays;
            this.flowCn = builder.flowCn;
            this.flowIntl = builder.flowIntl;
            this.ipCountCn = builder.ipCountCn;
            this.ipCountIntl = builder.ipCountIntl;
            this.memberUid = builder.memberUid;
            this.standardAssetsFlowCn = builder.standardAssetsFlowCn;
            this.standardAssetsFlowIntl = builder.standardAssetsFlowIntl;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonthlySummaryList create() {
            return builder().build();
        }

        /**
         * @return enableDays
         */
        public Integer getEnableDays() {
            return this.enableDays;
        }

        /**
         * @return flowCn
         */
        public Long getFlowCn() {
            return this.flowCn;
        }

        /**
         * @return flowIntl
         */
        public Long getFlowIntl() {
            return this.flowIntl;
        }

        /**
         * @return ipCountCn
         */
        public Integer getIpCountCn() {
            return this.ipCountCn;
        }

        /**
         * @return ipCountIntl
         */
        public Integer getIpCountIntl() {
            return this.ipCountIntl;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return standardAssetsFlowCn
         */
        public Long getStandardAssetsFlowCn() {
            return this.standardAssetsFlowCn;
        }

        /**
         * @return standardAssetsFlowIntl
         */
        public Long getStandardAssetsFlowIntl() {
            return this.standardAssetsFlowIntl;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Integer enableDays; 
            private Long flowCn; 
            private Long flowIntl; 
            private Integer ipCountCn; 
            private Integer ipCountIntl; 
            private String memberUid; 
            private Long standardAssetsFlowCn; 
            private Long standardAssetsFlowIntl; 
            private String uid; 

            /**
             * EnableDays.
             */
            public Builder enableDays(Integer enableDays) {
                this.enableDays = enableDays;
                return this;
            }

            /**
             * FlowCn.
             */
            public Builder flowCn(Long flowCn) {
                this.flowCn = flowCn;
                return this;
            }

            /**
             * FlowIntl.
             */
            public Builder flowIntl(Long flowIntl) {
                this.flowIntl = flowIntl;
                return this;
            }

            /**
             * IpCountCn.
             */
            public Builder ipCountCn(Integer ipCountCn) {
                this.ipCountCn = ipCountCn;
                return this;
            }

            /**
             * IpCountIntl.
             */
            public Builder ipCountIntl(Integer ipCountIntl) {
                this.ipCountIntl = ipCountIntl;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * StandardAssetsFlowCn.
             */
            public Builder standardAssetsFlowCn(Long standardAssetsFlowCn) {
                this.standardAssetsFlowCn = standardAssetsFlowCn;
                return this;
            }

            /**
             * StandardAssetsFlowIntl.
             */
            public Builder standardAssetsFlowIntl(Long standardAssetsFlowIntl) {
                this.standardAssetsFlowIntl = standardAssetsFlowIntl;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public MonthlySummaryList build() {
                return new MonthlySummaryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDdosOriginInstanceBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosOriginInstanceBillResponseBody</p>
     */
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
             * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>bytes</strong>: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.</li>
             * <li><strong>memberUid</strong>: the owner account.</li>
             * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.</li>
             * <li><strong>ip</strong>: the IP address of the regular Alibaba Cloud service protected by the Anti-DDoS Origin instance.</li>
             * <li><strong>region</strong>: the region.</li>
             * </ul>
             * <blockquote>
             * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;bytes&quot;:79282719,&quot;memberUid&quot;:&quot;&quot;,&quot;regionFlows&quot;:{&quot;cn-hangzhou&quot;:[{&quot;bytes&quot;:79282719,&quot;instanceId&quot;:&quot;ddosorigin_cn-u7c3lcr9r02&quot;,&quot;ip&quot;:&quot;47.118.168.57&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;}]}}]</p>
             */
            public Builder memberFlow(String memberFlow) {
                this.memberFlow = memberFlow;
                return this;
            }

            /**
             * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>bytes</strong>: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.</li>
             * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.</li>
             * <li><strong>ip</strong>: the IP address protected by the Anti-DDoS Origin instance.</li>
             * <li><strong>region</strong>: the region.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cn-hangzhou&quot;:[{&quot;bytes&quot;:0,&quot;instanceId&quot;:&quot;ddosorigin_cn-u7c3lcr9r02&quot;,&quot;ip&quot;:&quot;47.118.168.124&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;}]}</p>
             */
            public Builder regionFlow(String regionFlow) {
                this.regionFlow = regionFlow;
                return this;
            }

            /**
             * <p>The timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679846400000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The traffic of regular Alibaba Cloud services. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>6302081067</p>
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
