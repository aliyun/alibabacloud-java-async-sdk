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
 * {@link DescribeTrafficLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrafficLogRequest</p>
 */
public class DescribeTrafficLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclPreRuleId")
    private String aclPreRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclPreState")
    private String aclPreState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppDpiState")
    private String appDpiState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetRegion")
    private String assetRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainUrl")
    private String domainUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIP")
    private String dstIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPort")
    private String dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstVpcId")
    private String dstVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstVpcRegionNo")
    private String dstVpcRegionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowType")
    private String flowType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatFirewallId")
    private String natFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleResult")
    private String ruleResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSource")
    private String ruleSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPort")
    private String srcPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPrivateIP")
    private String srcPrivateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVpcId")
    private String srcVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVpcRegionNo")
    private String srcVpcRegionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsScopeId")
    private String tlsScopeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulLevel")
    private String vulLevel;

    private DescribeTrafficLogRequest(Builder builder) {
        super(builder);
        this.aclPreRuleId = builder.aclPreRuleId;
        this.aclPreState = builder.aclPreState;
        this.appDpiState = builder.appDpiState;
        this.appId = builder.appId;
        this.assetRegion = builder.assetRegion;
        this.attackType = builder.attackType;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.domainName = builder.domainName;
        this.domainUrl = builder.domainUrl;
        this.dstIP = builder.dstIP;
        this.dstPort = builder.dstPort;
        this.dstVpcId = builder.dstVpcId;
        this.dstVpcRegionNo = builder.dstVpcRegionNo;
        this.endTime = builder.endTime;
        this.firewallType = builder.firewallType;
        this.flowType = builder.flowType;
        this.ipProtocol = builder.ipProtocol;
        this.ipVersion = builder.ipVersion;
        this.isp = builder.isp;
        this.lang = builder.lang;
        this.location = builder.location;
        this.memberUid = builder.memberUid;
        this.natFirewallId = builder.natFirewallId;
        this.natGatewayId = builder.natGatewayId;
        this.pageSize = builder.pageSize;
        this.ruleId = builder.ruleId;
        this.ruleResult = builder.ruleResult;
        this.ruleSource = builder.ruleSource;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.srcIP = builder.srcIP;
        this.srcPort = builder.srcPort;
        this.srcPrivateIP = builder.srcPrivateIP;
        this.srcVpcId = builder.srcVpcId;
        this.srcVpcRegionNo = builder.srcVpcRegionNo;
        this.startTime = builder.startTime;
        this.tlsScopeId = builder.tlsScopeId;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vulLevel = builder.vulLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclPreRuleId
     */
    public String getAclPreRuleId() {
        return this.aclPreRuleId;
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
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return assetRegion
     */
    public String getAssetRegion() {
        return this.assetRegion;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
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
    public String getDstPort() {
        return this.dstPort;
    }

    /**
     * @return dstVpcId
     */
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    /**
     * @return dstVpcRegionNo
     */
    public String getDstVpcRegionNo() {
        return this.dstVpcRegionNo;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return flowType
     */
    public String getFlowType() {
        return this.flowType;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return natFirewallId
     */
    public String getNatFirewallId() {
        return this.natFirewallId;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleResult
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * @return ruleSource
     */
    public String getRuleSource() {
        return this.ruleSource;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
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
    public String getSrcPort() {
        return this.srcPort;
    }

    /**
     * @return srcPrivateIP
     */
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    /**
     * @return srcVpcId
     */
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    /**
     * @return srcVpcRegionNo
     */
    public String getSrcVpcRegionNo() {
        return this.srcVpcRegionNo;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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
    public String getVulLevel() {
        return this.vulLevel;
    }

    public static final class Builder extends Request.Builder<DescribeTrafficLogRequest, Builder> {
        private String aclPreRuleId; 
        private String aclPreState; 
        private String appDpiState; 
        private String appId; 
        private String assetRegion; 
        private String attackType; 
        private String currentPage; 
        private String direction; 
        private String domainName; 
        private String domainUrl; 
        private String dstIP; 
        private String dstPort; 
        private String dstVpcId; 
        private String dstVpcRegionNo; 
        private String endTime; 
        private String firewallType; 
        private String flowType; 
        private String ipProtocol; 
        private String ipVersion; 
        private String isp; 
        private String lang; 
        private String location; 
        private Long memberUid; 
        private String natFirewallId; 
        private String natGatewayId; 
        private String pageSize; 
        private String ruleId; 
        private String ruleResult; 
        private String ruleSource; 
        private String sourceCode; 
        private String sourceIp; 
        private String srcIP; 
        private String srcPort; 
        private String srcPrivateIP; 
        private String srcVpcId; 
        private String srcVpcRegionNo; 
        private String startTime; 
        private String tlsScopeId; 
        private String vpcFirewallId; 
        private String vulLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrafficLogRequest request) {
            super(request);
            this.aclPreRuleId = request.aclPreRuleId;
            this.aclPreState = request.aclPreState;
            this.appDpiState = request.appDpiState;
            this.appId = request.appId;
            this.assetRegion = request.assetRegion;
            this.attackType = request.attackType;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.domainName = request.domainName;
            this.domainUrl = request.domainUrl;
            this.dstIP = request.dstIP;
            this.dstPort = request.dstPort;
            this.dstVpcId = request.dstVpcId;
            this.dstVpcRegionNo = request.dstVpcRegionNo;
            this.endTime = request.endTime;
            this.firewallType = request.firewallType;
            this.flowType = request.flowType;
            this.ipProtocol = request.ipProtocol;
            this.ipVersion = request.ipVersion;
            this.isp = request.isp;
            this.lang = request.lang;
            this.location = request.location;
            this.memberUid = request.memberUid;
            this.natFirewallId = request.natFirewallId;
            this.natGatewayId = request.natGatewayId;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
            this.ruleResult = request.ruleResult;
            this.ruleSource = request.ruleSource;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.srcIP = request.srcIP;
            this.srcPort = request.srcPort;
            this.srcPrivateIP = request.srcPrivateIP;
            this.srcVpcId = request.srcVpcId;
            this.srcVpcRegionNo = request.srcVpcRegionNo;
            this.startTime = request.startTime;
            this.tlsScopeId = request.tlsScopeId;
            this.vpcFirewallId = request.vpcFirewallId;
            this.vulLevel = request.vulLevel;
        } 

        /**
         * AclPreRuleId.
         */
        public Builder aclPreRuleId(String aclPreRuleId) {
            this.putQueryParameter("AclPreRuleId", aclPreRuleId);
            this.aclPreRuleId = aclPreRuleId;
            return this;
        }

        /**
         * AclPreState.
         */
        public Builder aclPreState(String aclPreState) {
            this.putQueryParameter("AclPreState", aclPreState);
            this.aclPreState = aclPreState;
            return this;
        }

        /**
         * AppDpiState.
         */
        public Builder appDpiState(String appDpiState) {
            this.putQueryParameter("AppDpiState", appDpiState);
            this.appDpiState = appDpiState;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AssetRegion.
         */
        public Builder assetRegion(String assetRegion) {
            this.putQueryParameter("AssetRegion", assetRegion);
            this.assetRegion = assetRegion;
            return this;
        }

        /**
         * AttackType.
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainUrl.
         */
        public Builder domainUrl(String domainUrl) {
            this.putQueryParameter("DomainUrl", domainUrl);
            this.domainUrl = domainUrl;
            return this;
        }

        /**
         * DstIP.
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * DstPort.
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * DstVpcId.
         */
        public Builder dstVpcId(String dstVpcId) {
            this.putQueryParameter("DstVpcId", dstVpcId);
            this.dstVpcId = dstVpcId;
            return this;
        }

        /**
         * DstVpcRegionNo.
         */
        public Builder dstVpcRegionNo(String dstVpcRegionNo) {
            this.putQueryParameter("DstVpcRegionNo", dstVpcRegionNo);
            this.dstVpcRegionNo = dstVpcRegionNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1742926322</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FirewallType.
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * FlowType.
         */
        public Builder flowType(String flowType) {
            this.putQueryParameter("FlowType", flowType);
            this.flowType = flowType;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * NatFirewallId.
         */
        public Builder natFirewallId(String natFirewallId) {
            this.putQueryParameter("NatFirewallId", natFirewallId);
            this.natFirewallId = natFirewallId;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleResult.
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * RuleSource.
         */
        public Builder ruleSource(String ruleSource) {
            this.putQueryParameter("RuleSource", ruleSource);
            this.ruleSource = ruleSource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SrcIP.
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * SrcPort.
         */
        public Builder srcPort(String srcPort) {
            this.putQueryParameter("SrcPort", srcPort);
            this.srcPort = srcPort;
            return this;
        }

        /**
         * SrcPrivateIP.
         */
        public Builder srcPrivateIP(String srcPrivateIP) {
            this.putQueryParameter("SrcPrivateIP", srcPrivateIP);
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }

        /**
         * SrcVpcId.
         */
        public Builder srcVpcId(String srcVpcId) {
            this.putQueryParameter("SrcVpcId", srcVpcId);
            this.srcVpcId = srcVpcId;
            return this;
        }

        /**
         * SrcVpcRegionNo.
         */
        public Builder srcVpcRegionNo(String srcVpcRegionNo) {
            this.putQueryParameter("SrcVpcRegionNo", srcVpcRegionNo);
            this.srcVpcRegionNo = srcVpcRegionNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1730946241</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TlsScopeId.
         */
        public Builder tlsScopeId(String tlsScopeId) {
            this.putQueryParameter("TlsScopeId", tlsScopeId);
            this.tlsScopeId = tlsScopeId;
            return this;
        }

        /**
         * VpcFirewallId.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * VulLevel.
         */
        public Builder vulLevel(String vulLevel) {
            this.putQueryParameter("VulLevel", vulLevel);
            this.vulLevel = vulLevel;
            return this;
        }

        @Override
        public DescribeTrafficLogRequest build() {
            return new DescribeTrafficLogRequest(this);
        } 

    } 

}
