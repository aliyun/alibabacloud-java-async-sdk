// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficLogResponseBody</p>
 */
public class DescribeTrafficLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTrafficLogResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTrafficLogResponseBody model) {
            this.dataList = model.dataList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrafficLogResponseBody build() {
            return new DescribeTrafficLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficLogResponseBody</p>
     */
    public static class DstVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private DstVpc(Builder builder) {
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstVpc create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String regionNo; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(DstVpc model) {
                this.regionNo = model.regionNo;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public DstVpc build() {
                return new DstVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficLogResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Rules(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficLogResponseBody</p>
     */
    public static class SrcVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private SrcVpc(Builder builder) {
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcVpc create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String regionNo; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(SrcVpc model) {
                this.regionNo = model.regionNo;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public SrcVpc build() {
                return new SrcVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficLogResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclPreRuleId")
        private String aclPreRuleId;

        @com.aliyun.core.annotation.NameInMap("AclPreRuleName")
        private String aclPreRuleName;

        @com.aliyun.core.annotation.NameInMap("AclPreState")
        private String aclPreState;

        @com.aliyun.core.annotation.NameInMap("AppDpiState")
        private String appDpiState;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AttackApp")
        private String attackApp;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Integer attackType;

        @com.aliyun.core.annotation.NameInMap("CityId")
        private String cityId;

        @com.aliyun.core.annotation.NameInMap("CloseReason")
        private String closeReason;

        @com.aliyun.core.annotation.NameInMap("CloudInstanceId")
        private String cloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("CountryId")
        private String countryId;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainUrl")
        private String domainUrl;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private Integer dstPort;

        @com.aliyun.core.annotation.NameInMap("DstVpc")
        private DstVpc dstVpc;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private String inBytes;

        @com.aliyun.core.annotation.NameInMap("InPackets")
        private String inPackets;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("IspId")
        private String ispId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private String outBytes;

        @com.aliyun.core.annotation.NameInMap("OutPackets")
        private String outPackets;

        @com.aliyun.core.annotation.NameInMap("PacketBytes")
        private Long packetBytes;

        @com.aliyun.core.annotation.NameInMap("PacketCount")
        private Long packetCount;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("PrivatePort")
        private Integer privatePort;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleResult")
        private Integer ruleResult;

        @com.aliyun.core.annotation.NameInMap("RuleSource")
        private String ruleSource;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private Integer srcPort;

        @com.aliyun.core.annotation.NameInMap("SrcPrivateIP")
        private String srcPrivateIP;

        @com.aliyun.core.annotation.NameInMap("SrcVpc")
        private SrcVpc srcVpc;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TlsRuleId")
        private String tlsRuleId;

        @com.aliyun.core.annotation.NameInMap("TlsRuleName")
        private String tlsRuleName;

        @com.aliyun.core.annotation.NameInMap("TlsScopeId")
        private String tlsScopeId;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
        private Integer vulLevel;

        private DataList(Builder builder) {
            this.aclPreRuleId = builder.aclPreRuleId;
            this.aclPreRuleName = builder.aclPreRuleName;
            this.aclPreState = builder.aclPreState;
            this.appDpiState = builder.appDpiState;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.attackApp = builder.attackApp;
            this.attackType = builder.attackType;
            this.cityId = builder.cityId;
            this.closeReason = builder.closeReason;
            this.cloudInstanceId = builder.cloudInstanceId;
            this.countryId = builder.countryId;
            this.direction = builder.direction;
            this.domainName = builder.domainName;
            this.domainUrl = builder.domainUrl;
            this.dstIP = builder.dstIP;
            this.dstPort = builder.dstPort;
            this.dstVpc = builder.dstVpc;
            this.endTime = builder.endTime;
            this.ext = builder.ext;
            this.inBytes = builder.inBytes;
            this.inPackets = builder.inPackets;
            this.ipProtocol = builder.ipProtocol;
            this.isp = builder.isp;
            this.ispId = builder.ispId;
            this.location = builder.location;
            this.memberUid = builder.memberUid;
            this.outBytes = builder.outBytes;
            this.outPackets = builder.outPackets;
            this.packetBytes = builder.packetBytes;
            this.packetCount = builder.packetCount;
            this.privateIp = builder.privateIp;
            this.privatePort = builder.privatePort;
            this.regionId = builder.regionId;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleResult = builder.ruleResult;
            this.ruleSource = builder.ruleSource;
            this.rules = builder.rules;
            this.srcIP = builder.srcIP;
            this.srcPort = builder.srcPort;
            this.srcPrivateIP = builder.srcPrivateIP;
            this.srcVpc = builder.srcVpc;
            this.startTime = builder.startTime;
            this.tlsRuleId = builder.tlsRuleId;
            this.tlsRuleName = builder.tlsRuleName;
            this.tlsScopeId = builder.tlsScopeId;
            this.vpcFirewallId = builder.vpcFirewallId;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aclPreRuleId
         */
        public String getAclPreRuleId() {
            return this.aclPreRuleId;
        }

        /**
         * @return aclPreRuleName
         */
        public String getAclPreRuleName() {
            return this.aclPreRuleName;
        }

        /**
         * @return aclPreState
         */
        public String getAclPreState() {
            return this.aclPreState;
        }

        /**
         * @return appDpiState
         */
        public String getAppDpiState() {
            return this.appDpiState;
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return attackApp
         */
        public String getAttackApp() {
            return this.attackApp;
        }

        /**
         * @return attackType
         */
        public Integer getAttackType() {
            return this.attackType;
        }

        /**
         * @return cityId
         */
        public String getCityId() {
            return this.cityId;
        }

        /**
         * @return closeReason
         */
        public String getCloseReason() {
            return this.closeReason;
        }

        /**
         * @return cloudInstanceId
         */
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        /**
         * @return countryId
         */
        public String getCountryId() {
            return this.countryId;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainUrl
         */
        public String getDomainUrl() {
            return this.domainUrl;
        }

        /**
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
        }

        /**
         * @return dstPort
         */
        public Integer getDstPort() {
            return this.dstPort;
        }

        /**
         * @return dstVpc
         */
        public DstVpc getDstVpc() {
            return this.dstVpc;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return inBytes
         */
        public String getInBytes() {
            return this.inBytes;
        }

        /**
         * @return inPackets
         */
        public String getInPackets() {
            return this.inPackets;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispId
         */
        public String getIspId() {
            return this.ispId;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return outBytes
         */
        public String getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return outPackets
         */
        public String getOutPackets() {
            return this.outPackets;
        }

        /**
         * @return packetBytes
         */
        public Long getPacketBytes() {
            return this.packetBytes;
        }

        /**
         * @return packetCount
         */
        public Long getPacketCount() {
            return this.packetCount;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return privatePort
         */
        public Integer getPrivatePort() {
            return this.privatePort;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleResult
         */
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        /**
         * @return ruleSource
         */
        public String getRuleSource() {
            return this.ruleSource;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return srcPort
         */
        public Integer getSrcPort() {
            return this.srcPort;
        }

        /**
         * @return srcPrivateIP
         */
        public String getSrcPrivateIP() {
            return this.srcPrivateIP;
        }

        /**
         * @return srcVpc
         */
        public SrcVpc getSrcVpc() {
            return this.srcVpc;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return tlsRuleId
         */
        public String getTlsRuleId() {
            return this.tlsRuleId;
        }

        /**
         * @return tlsRuleName
         */
        public String getTlsRuleName() {
            return this.tlsRuleName;
        }

        /**
         * @return tlsScopeId
         */
        public String getTlsScopeId() {
            return this.tlsScopeId;
        }

        /**
         * @return vpcFirewallId
         */
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        /**
         * @return vulLevel
         */
        public Integer getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private String aclPreRuleId; 
            private String aclPreRuleName; 
            private String aclPreState; 
            private String appDpiState; 
            private Integer appId; 
            private String appName; 
            private String attackApp; 
            private Integer attackType; 
            private String cityId; 
            private String closeReason; 
            private String cloudInstanceId; 
            private String countryId; 
            private String direction; 
            private String domainName; 
            private String domainUrl; 
            private String dstIP; 
            private Integer dstPort; 
            private DstVpc dstVpc; 
            private Long endTime; 
            private String ext; 
            private String inBytes; 
            private String inPackets; 
            private String ipProtocol; 
            private String isp; 
            private String ispId; 
            private String location; 
            private String memberUid; 
            private String outBytes; 
            private String outPackets; 
            private Long packetBytes; 
            private Long packetCount; 
            private String privateIp; 
            private Integer privatePort; 
            private String regionId; 
            private String ruleId; 
            private String ruleName; 
            private Integer ruleResult; 
            private String ruleSource; 
            private java.util.List<Rules> rules; 
            private String srcIP; 
            private Integer srcPort; 
            private String srcPrivateIP; 
            private SrcVpc srcVpc; 
            private Long startTime; 
            private String tlsRuleId; 
            private String tlsRuleName; 
            private String tlsScopeId; 
            private String vpcFirewallId; 
            private Integer vulLevel; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aclPreRuleId = model.aclPreRuleId;
                this.aclPreRuleName = model.aclPreRuleName;
                this.aclPreState = model.aclPreState;
                this.appDpiState = model.appDpiState;
                this.appId = model.appId;
                this.appName = model.appName;
                this.attackApp = model.attackApp;
                this.attackType = model.attackType;
                this.cityId = model.cityId;
                this.closeReason = model.closeReason;
                this.cloudInstanceId = model.cloudInstanceId;
                this.countryId = model.countryId;
                this.direction = model.direction;
                this.domainName = model.domainName;
                this.domainUrl = model.domainUrl;
                this.dstIP = model.dstIP;
                this.dstPort = model.dstPort;
                this.dstVpc = model.dstVpc;
                this.endTime = model.endTime;
                this.ext = model.ext;
                this.inBytes = model.inBytes;
                this.inPackets = model.inPackets;
                this.ipProtocol = model.ipProtocol;
                this.isp = model.isp;
                this.ispId = model.ispId;
                this.location = model.location;
                this.memberUid = model.memberUid;
                this.outBytes = model.outBytes;
                this.outPackets = model.outPackets;
                this.packetBytes = model.packetBytes;
                this.packetCount = model.packetCount;
                this.privateIp = model.privateIp;
                this.privatePort = model.privatePort;
                this.regionId = model.regionId;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleResult = model.ruleResult;
                this.ruleSource = model.ruleSource;
                this.rules = model.rules;
                this.srcIP = model.srcIP;
                this.srcPort = model.srcPort;
                this.srcPrivateIP = model.srcPrivateIP;
                this.srcVpc = model.srcVpc;
                this.startTime = model.startTime;
                this.tlsRuleId = model.tlsRuleId;
                this.tlsRuleName = model.tlsRuleName;
                this.tlsScopeId = model.tlsScopeId;
                this.vpcFirewallId = model.vpcFirewallId;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * AclPreRuleId.
             */
            public Builder aclPreRuleId(String aclPreRuleId) {
                this.aclPreRuleId = aclPreRuleId;
                return this;
            }

            /**
             * AclPreRuleName.
             */
            public Builder aclPreRuleName(String aclPreRuleName) {
                this.aclPreRuleName = aclPreRuleName;
                return this;
            }

            /**
             * AclPreState.
             */
            public Builder aclPreState(String aclPreState) {
                this.aclPreState = aclPreState;
                return this;
            }

            /**
             * AppDpiState.
             */
            public Builder appDpiState(String appDpiState) {
                this.appDpiState = appDpiState;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AttackApp.
             */
            public Builder attackApp(String attackApp) {
                this.attackApp = attackApp;
                return this;
            }

            /**
             * AttackType.
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * CityId.
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * CloseReason.
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * CloudInstanceId.
             */
            public Builder cloudInstanceId(String cloudInstanceId) {
                this.cloudInstanceId = cloudInstanceId;
                return this;
            }

            /**
             * CountryId.
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainUrl.
             */
            public Builder domainUrl(String domainUrl) {
                this.domainUrl = domainUrl;
                return this;
            }

            /**
             * DstIP.
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * DstVpc.
             */
            public Builder dstVpc(DstVpc dstVpc) {
                this.dstVpc = dstVpc;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(String inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * InPackets.
             */
            public Builder inPackets(String inPackets) {
                this.inPackets = inPackets;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspId.
             */
            public Builder ispId(String ispId) {
                this.ispId = ispId;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * OutBytes.
             */
            public Builder outBytes(String outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * OutPackets.
             */
            public Builder outPackets(String outPackets) {
                this.outPackets = outPackets;
                return this;
            }

            /**
             * PacketBytes.
             */
            public Builder packetBytes(Long packetBytes) {
                this.packetBytes = packetBytes;
                return this;
            }

            /**
             * PacketCount.
             */
            public Builder packetCount(Long packetCount) {
                this.packetCount = packetCount;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PrivatePort.
             */
            public Builder privatePort(Integer privatePort) {
                this.privatePort = privatePort;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleResult.
             */
            public Builder ruleResult(Integer ruleResult) {
                this.ruleResult = ruleResult;
                return this;
            }

            /**
             * RuleSource.
             */
            public Builder ruleSource(String ruleSource) {
                this.ruleSource = ruleSource;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * SrcIP.
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * SrcPort.
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * SrcPrivateIP.
             */
            public Builder srcPrivateIP(String srcPrivateIP) {
                this.srcPrivateIP = srcPrivateIP;
                return this;
            }

            /**
             * SrcVpc.
             */
            public Builder srcVpc(SrcVpc srcVpc) {
                this.srcVpc = srcVpc;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TlsRuleId.
             */
            public Builder tlsRuleId(String tlsRuleId) {
                this.tlsRuleId = tlsRuleId;
                return this;
            }

            /**
             * TlsRuleName.
             */
            public Builder tlsRuleName(String tlsRuleName) {
                this.tlsRuleName = tlsRuleName;
                return this;
            }

            /**
             * TlsScopeId.
             */
            public Builder tlsScopeId(String tlsScopeId) {
                this.tlsScopeId = tlsScopeId;
                return this;
            }

            /**
             * VpcFirewallId.
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * VulLevel.
             */
            public Builder vulLevel(Integer vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTrafficLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficLogResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
