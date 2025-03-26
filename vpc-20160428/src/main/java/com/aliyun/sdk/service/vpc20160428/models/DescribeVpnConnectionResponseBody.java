// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnConnectionResponseBody</p>
 */
public class DescribeVpnConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachInstanceId")
    private String attachInstanceId;

    @com.aliyun.core.annotation.NameInMap("AttachType")
    private String attachType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CrossAccountAuthorized")
    private Boolean crossAccountAuthorized;

    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @com.aliyun.core.annotation.NameInMap("EnableDpd")
    private Boolean enableDpd;

    @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @com.aliyun.core.annotation.NameInMap("EnableTunnelsBgp")
    private Boolean enableTunnelsBgp;

    @com.aliyun.core.annotation.NameInMap("IkeConfig")
    private IkeConfig ikeConfig;

    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.NameInMap("IpsecConfig")
    private IpsecConfig ipsecConfig;

    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
    private String localSubnet;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
    private String remoteCaCertificate;

    @com.aliyun.core.annotation.NameInMap("RemoteSubnet")
    private String remoteSubnet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterName")
    private String transitRouterName;

    @com.aliyun.core.annotation.NameInMap("TunnelOptionsSpecification")
    private TunnelOptionsSpecification tunnelOptionsSpecification;

    @com.aliyun.core.annotation.NameInMap("VcoHealthCheck")
    private VcoHealthCheck vcoHealthCheck;

    @com.aliyun.core.annotation.NameInMap("VpnBgpConfig")
    private VpnBgpConfig vpnBgpConfig;

    @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    @com.aliyun.core.annotation.NameInMap("ZoneNo")
    private String zoneNo;

    private DescribeVpnConnectionResponseBody(Builder builder) {
        this.attachInstanceId = builder.attachInstanceId;
        this.attachType = builder.attachType;
        this.createTime = builder.createTime;
        this.crossAccountAuthorized = builder.crossAccountAuthorized;
        this.customerGatewayId = builder.customerGatewayId;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.enableTunnelsBgp = builder.enableTunnelsBgp;
        this.ikeConfig = builder.ikeConfig;
        this.internetIp = builder.internetIp;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.remoteCaCertificate = builder.remoteCaCertificate;
        this.remoteSubnet = builder.remoteSubnet;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.state = builder.state;
        this.status = builder.status;
        this.tags = builder.tags;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterName = builder.transitRouterName;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vcoHealthCheck = builder.vcoHealthCheck;
        this.vpnBgpConfig = builder.vpnBgpConfig;
        this.vpnConnectionId = builder.vpnConnectionId;
        this.vpnGatewayId = builder.vpnGatewayId;
        this.zoneNo = builder.zoneNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnConnectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachInstanceId
     */
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    /**
     * @return attachType
     */
    public String getAttachType() {
        return this.attachType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossAccountAuthorized
     */
    public Boolean getCrossAccountAuthorized() {
        return this.crossAccountAuthorized;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return enableDpd
     */
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    /**
     * @return enableNatTraversal
     */
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    /**
     * @return enableTunnelsBgp
     */
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }

    /**
     * @return ikeConfig
     */
    public IkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return ipsecConfig
     */
    public IpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return remoteCaCertificate
     */
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    /**
     * @return remoteSubnet
     */
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterName
     */
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    /**
     * @return tunnelOptionsSpecification
     */
    public TunnelOptionsSpecification getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    /**
     * @return vcoHealthCheck
     */
    public VcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    /**
     * @return vpnBgpConfig
     */
    public VpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * @return zoneNo
     */
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static final class Builder {
        private String attachInstanceId; 
        private String attachType; 
        private Long createTime; 
        private Boolean crossAccountAuthorized; 
        private String customerGatewayId; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private Boolean enableTunnelsBgp; 
        private IkeConfig ikeConfig; 
        private String internetIp; 
        private IpsecConfig ipsecConfig; 
        private String localSubnet; 
        private String name; 
        private String networkType; 
        private String remoteCaCertificate; 
        private String remoteSubnet; 
        private String requestId; 
        private String resourceGroupId; 
        private String spec; 
        private String state; 
        private String status; 
        private Tags tags; 
        private String transitRouterId; 
        private String transitRouterName; 
        private TunnelOptionsSpecification tunnelOptionsSpecification; 
        private VcoHealthCheck vcoHealthCheck; 
        private VpnBgpConfig vpnBgpConfig; 
        private String vpnConnectionId; 
        private String vpnGatewayId; 
        private String zoneNo; 

        private Builder() {
        } 

        private Builder(DescribeVpnConnectionResponseBody model) {
            this.attachInstanceId = model.attachInstanceId;
            this.attachType = model.attachType;
            this.createTime = model.createTime;
            this.crossAccountAuthorized = model.crossAccountAuthorized;
            this.customerGatewayId = model.customerGatewayId;
            this.effectImmediately = model.effectImmediately;
            this.enableDpd = model.enableDpd;
            this.enableNatTraversal = model.enableNatTraversal;
            this.enableTunnelsBgp = model.enableTunnelsBgp;
            this.ikeConfig = model.ikeConfig;
            this.internetIp = model.internetIp;
            this.ipsecConfig = model.ipsecConfig;
            this.localSubnet = model.localSubnet;
            this.name = model.name;
            this.networkType = model.networkType;
            this.remoteCaCertificate = model.remoteCaCertificate;
            this.remoteSubnet = model.remoteSubnet;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.spec = model.spec;
            this.state = model.state;
            this.status = model.status;
            this.tags = model.tags;
            this.transitRouterId = model.transitRouterId;
            this.transitRouterName = model.transitRouterName;
            this.tunnelOptionsSpecification = model.tunnelOptionsSpecification;
            this.vcoHealthCheck = model.vcoHealthCheck;
            this.vpnBgpConfig = model.vpnBgpConfig;
            this.vpnConnectionId = model.vpnConnectionId;
            this.vpnGatewayId = model.vpnGatewayId;
            this.zoneNo = model.zoneNo;
        } 

        /**
         * <p>The ID of the CEN instance to which the transit router belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-lxxpbpalc776qz****</p>
         */
        public Builder attachInstanceId(String attachInstanceId) {
            this.attachInstanceId = attachInstanceId;
            return this;
        }

        /**
         * <p>The type of the resource that is associated with the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>CEN</strong>: indicates that the IPsec-VPN connection is associated with a transit router of a Cloud Enterprise Network (CEN) instance.</li>
         * <li><strong>NO_ASSOCIATED</strong>: indicates that the IPsec-VPN connection is not associated with any resource.</li>
         * <li><strong>VPNGW</strong>: indicates that the IPsec-VPN connection is associated with a VPN gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        public Builder attachType(String attachType) {
            this.attachType = attachType;
            return this;
        }

        /**
         * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492753817000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossAccountAuthorized(Boolean crossAccountAuthorized) {
            this.crossAccountAuthorized = crossAccountAuthorized;
            return this;
        }

        /**
         * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-bp1mvj4g9kogwwcxk****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Negotiations are reinitiated after the configuration is changed.</li>
         * <li><strong>false</strong>: Negotiations are reinitiated after traffic is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * <p>Indicates whether the dead peer detection (DPD) feature is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * <p>After you enable the DPD feature, the initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no response is received from the peer within a specified period of time, the connection fails. Then, the ISAKMP security association (SA), IPsec SA, and IPsec tunnel are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * <p>Indicates whether BGP is enabled for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * <p>The configuration of Phase 1 negotiations.</p>
         */
        public Builder ikeConfig(IkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * <p>The gateway IP address of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.162</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The configuration of Phase 2 negotiations.</p>
         */
        public Builder ipsecConfig(IpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * <p>The CIDR block on the Alibaba Cloud side.</p>
         * <p>Multiple CIDR blocks are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The name of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ipsec1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: an encrypted connection over the Internet</li>
         * <li><strong>private</strong>: an encrypted connection over private networks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The certificate authority (CA) certificate of the peer.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW****</p>
         */
        public Builder remoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }

        /**
         * <p>The CIDR block on the data center side.</p>
         * <p>Multiple CIDR blocks are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder remoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2310D45-BCF6-4E2E-9082-B4503844BA4C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IPsec-VPN connection belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group information.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The bandwidth specification of the IPsec-VPN connection. Unit: <strong>Mbit/s</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000M</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The association state of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: The IPsec-VPN connection is associated with a VPN gateway.</li>
         * <li><strong>init</strong>: The IPsec-VPN connection is not associated with any resource and is being initialized.</li>
         * <li><strong>attaching</strong>: The IPsec-VPN connection is being associated with a transit router.</li>
         * <li><strong>attached</strong>: The IPsec-VPN connection is associated with a transit router.</li>
         * <li><strong>detaching</strong>: The IPsec-VPN connection is being disassociated from a transit router.</li>
         * <li><strong>financialLocked</strong>: The IPsec-VPN connection is locked due to overdue payments.</li>
         * <li><strong>provisioning</strong>: The IPsec-VPN connection is being prepared.</li>
         * <li><strong>updating</strong>: The IPsec-VPN connection is being updated.</li>
         * <li><strong>Upgrading</strong>: The IPsec-VPN connection is being upgraded.</li>
         * <li><strong>deleted</strong>: The IPsec-VPN connection is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>attached</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The state of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>ike_sa_not_established</strong>: Phase 1 negotiations failed.</li>
         * <li><strong>ike_sa_established</strong>: Phase 1 negotiations succeeded.</li>
         * <li><strong>ipsec_sa_not_established</strong>: Phase 2 negotiations failed.</li>
         * <li><strong>ipsec_sa_established</strong>: Phase 2 negotiations succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ike_sa_not_established</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags added to the IPsec-VPN connection.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the transit router with which the IPsec-VPN connection is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0we2edef9qr44a85****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The name of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder transitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }

        /**
         * <p>The tunnel configurations of the IPsec-VPN connection.</p>
         * <p>Parameters in <strong>TunnelOptionsSpecification</strong> are returned only if you query an IPsec-VPN connection in dual-tunnel mode.</p>
         */
        public Builder tunnelOptionsSpecification(TunnelOptionsSpecification tunnelOptionsSpecification) {
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * <p>The health check information about the IPsec-VPN connection.</p>
         */
        public Builder vcoHealthCheck(VcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }

        /**
         * <p>The Border Gateway Protocol (BGP) configuration of the IPsec-VPN connection.</p>
         */
        public Builder vpnBgpConfig(VpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp1bbi27hojx80nck****</p>
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * <p>The ID of the zone where the IPsec-VPN connection is deployed.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> to query zone IDs and mapping between zone IDs and zone names.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }

        public DescribeVpnConnectionResponseBody build() {
            return new DescribeVpnConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class IkeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeAuthAlg")
        private String ikeAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IkeEncAlg")
        private String ikeEncAlg;

        @com.aliyun.core.annotation.NameInMap("IkeLifetime")
        private Long ikeLifetime;

        @com.aliyun.core.annotation.NameInMap("IkeMode")
        private String ikeMode;

        @com.aliyun.core.annotation.NameInMap("IkePfs")
        private String ikePfs;

        @com.aliyun.core.annotation.NameInMap("IkeVersion")
        private String ikeVersion;

        @com.aliyun.core.annotation.NameInMap("LocalId")
        private String localId;

        @com.aliyun.core.annotation.NameInMap("Psk")
        private String psk;

        @com.aliyun.core.annotation.NameInMap("RemoteId")
        private String remoteId;

        private IkeConfig(Builder builder) {
            this.ikeAuthAlg = builder.ikeAuthAlg;
            this.ikeEncAlg = builder.ikeEncAlg;
            this.ikeLifetime = builder.ikeLifetime;
            this.ikeMode = builder.ikeMode;
            this.ikePfs = builder.ikePfs;
            this.ikeVersion = builder.ikeVersion;
            this.localId = builder.localId;
            this.psk = builder.psk;
            this.remoteId = builder.remoteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IkeConfig create() {
            return builder().build();
        }

        /**
         * @return ikeAuthAlg
         */
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        /**
         * @return ikeEncAlg
         */
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        /**
         * @return ikeLifetime
         */
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        /**
         * @return ikeMode
         */
        public String getIkeMode() {
            return this.ikeMode;
        }

        /**
         * @return ikePfs
         */
        public String getIkePfs() {
            return this.ikePfs;
        }

        /**
         * @return ikeVersion
         */
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        /**
         * @return localId
         */
        public String getLocalId() {
            return this.localId;
        }

        /**
         * @return psk
         */
        public String getPsk() {
            return this.psk;
        }

        /**
         * @return remoteId
         */
        public String getRemoteId() {
            return this.remoteId;
        }

        public static final class Builder {
            private String ikeAuthAlg; 
            private String ikeEncAlg; 
            private Long ikeLifetime; 
            private String ikeMode; 
            private String ikePfs; 
            private String ikeVersion; 
            private String localId; 
            private String psk; 
            private String remoteId; 

            private Builder() {
            } 

            private Builder(IkeConfig model) {
                this.ikeAuthAlg = model.ikeAuthAlg;
                this.ikeEncAlg = model.ikeEncAlg;
                this.ikeLifetime = model.ikeLifetime;
                this.ikeMode = model.ikeMode;
                this.ikePfs = model.ikePfs;
                this.ikeVersion = model.ikeVersion;
                this.localId = model.localId;
                this.psk = model.psk;
                this.remoteId = model.remoteId;
            } 

            /**
             * <p>The authentication algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IKE phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The IKE negotiation mode.</p>
             * <ul>
             * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
             * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The Diffie-Hellman (DH) group in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The version of the IKE protocol.</p>
             * <ul>
             * <li><strong>ikev1</strong></li>
             * <li><strong>ikev2</strong></li>
             * </ul>
             * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>116.28.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>pgw6dy****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>139.34.XX.XX</p>
             */
            public Builder remoteId(String remoteId) {
                this.remoteId = remoteId;
                return this;
            }

            public IkeConfig build() {
                return new IkeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class IpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @com.aliyun.core.annotation.NameInMap("IpsecPfs")
        private String ipsecPfs;

        private IpsecConfig(Builder builder) {
            this.ipsecAuthAlg = builder.ipsecAuthAlg;
            this.ipsecEncAlg = builder.ipsecEncAlg;
            this.ipsecLifetime = builder.ipsecLifetime;
            this.ipsecPfs = builder.ipsecPfs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpsecConfig create() {
            return builder().build();
        }

        /**
         * @return ipsecAuthAlg
         */
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        /**
         * @return ipsecEncAlg
         */
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        /**
         * @return ipsecLifetime
         */
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        /**
         * @return ipsecPfs
         */
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public static final class Builder {
            private String ipsecAuthAlg; 
            private String ipsecEncAlg; 
            private Long ipsecLifetime; 
            private String ipsecPfs; 

            private Builder() {
            } 

            private Builder(IpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

            /**
             * <p>The authentication algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH group in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ipsecPfs(String ipsecPfs) {
                this.ipsecPfs = ipsecPfs;
                return this;
            }

            public IpsecConfig build() {
                return new IpsecConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class TunnelBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpStatus")
        private String bgpStatus;

        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private String localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private String peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private TunnelBgpConfig(Builder builder) {
            this.bgpStatus = builder.bgpStatus;
            this.localAsn = builder.localAsn;
            this.localBgpIp = builder.localBgpIp;
            this.peerAsn = builder.peerAsn;
            this.peerBgpIp = builder.peerBgpIp;
            this.tunnelCidr = builder.tunnelCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelBgpConfig create() {
            return builder().build();
        }

        /**
         * @return bgpStatus
         */
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        /**
         * @return localAsn
         */
        public String getLocalAsn() {
            return this.localAsn;
        }

        /**
         * @return localBgpIp
         */
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        /**
         * @return peerAsn
         */
        public String getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerBgpIp
         */
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        /**
         * @return tunnelCidr
         */
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public static final class Builder {
            private String bgpStatus; 
            private String localAsn; 
            private String localBgpIp; 
            private String peerAsn; 
            private String peerBgpIp; 
            private String tunnelCidr; 

            private Builder() {
            } 

            private Builder(TunnelBgpConfig model) {
                this.bgpStatus = model.bgpStatus;
                this.localAsn = model.localAsn;
                this.localBgpIp = model.localBgpIp;
                this.peerAsn = model.peerAsn;
                this.peerBgpIp = model.peerBgpIp;
                this.tunnelCidr = model.tunnelCidr;
            } 

            /**
             * <p>The negotiation state of BGP. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder bgpStatus(String bgpStatus) {
                this.bgpStatus = bgpStatus;
                return this;
            }

            /**
             * <p>The ASN on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder localAsn(String localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP address on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.1</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The ASN of the tunnel peer.</p>
             * 
             * <strong>example:</strong>
             * <p>65531</p>
             */
            public Builder peerAsn(String peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>The BGP IP address of the tunnel peer.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.2</p>
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * <p>The BGP CIDR block of the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.0/30</p>
             */
            public Builder tunnelCidr(String tunnelCidr) {
                this.tunnelCidr = tunnelCidr;
                return this;
            }

            public TunnelBgpConfig build() {
                return new TunnelBgpConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class TunnelIkeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeAuthAlg")
        private String ikeAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IkeEncAlg")
        private String ikeEncAlg;

        @com.aliyun.core.annotation.NameInMap("IkeLifetime")
        private String ikeLifetime;

        @com.aliyun.core.annotation.NameInMap("IkeMode")
        private String ikeMode;

        @com.aliyun.core.annotation.NameInMap("IkePfs")
        private String ikePfs;

        @com.aliyun.core.annotation.NameInMap("IkeVersion")
        private String ikeVersion;

        @com.aliyun.core.annotation.NameInMap("LocalId")
        private String localId;

        @com.aliyun.core.annotation.NameInMap("Psk")
        private String psk;

        @com.aliyun.core.annotation.NameInMap("RemoteId")
        private String remoteId;

        private TunnelIkeConfig(Builder builder) {
            this.ikeAuthAlg = builder.ikeAuthAlg;
            this.ikeEncAlg = builder.ikeEncAlg;
            this.ikeLifetime = builder.ikeLifetime;
            this.ikeMode = builder.ikeMode;
            this.ikePfs = builder.ikePfs;
            this.ikeVersion = builder.ikeVersion;
            this.localId = builder.localId;
            this.psk = builder.psk;
            this.remoteId = builder.remoteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelIkeConfig create() {
            return builder().build();
        }

        /**
         * @return ikeAuthAlg
         */
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        /**
         * @return ikeEncAlg
         */
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        /**
         * @return ikeLifetime
         */
        public String getIkeLifetime() {
            return this.ikeLifetime;
        }

        /**
         * @return ikeMode
         */
        public String getIkeMode() {
            return this.ikeMode;
        }

        /**
         * @return ikePfs
         */
        public String getIkePfs() {
            return this.ikePfs;
        }

        /**
         * @return ikeVersion
         */
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        /**
         * @return localId
         */
        public String getLocalId() {
            return this.localId;
        }

        /**
         * @return psk
         */
        public String getPsk() {
            return this.psk;
        }

        /**
         * @return remoteId
         */
        public String getRemoteId() {
            return this.remoteId;
        }

        public static final class Builder {
            private String ikeAuthAlg; 
            private String ikeEncAlg; 
            private String ikeLifetime; 
            private String ikeMode; 
            private String ikePfs; 
            private String ikeVersion; 
            private String localId; 
            private String psk; 
            private String remoteId; 

            private Builder() {
            } 

            private Builder(TunnelIkeConfig model) {
                this.ikeAuthAlg = model.ikeAuthAlg;
                this.ikeEncAlg = model.ikeEncAlg;
                this.ikeLifetime = model.ikeLifetime;
                this.ikeMode = model.ikeMode;
                this.ikePfs = model.ikePfs;
                this.ikeVersion = model.ikeVersion;
                this.localId = model.localId;
                this.psk = model.psk;
                this.remoteId = model.remoteId;
            } 

            /**
             * <p>The authentication algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IKE phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(String ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The IKE negotiation mode.</p>
             * <ul>
             * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
             * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The Diffie-Hellman (DH) group in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The version of the IKE protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.21.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the tunnel peer.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
             */
            public Builder remoteId(String remoteId) {
                this.remoteId = remoteId;
                return this;
            }

            public TunnelIkeConfig build() {
                return new TunnelIkeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class TunnelIpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private String ipsecLifetime;

        @com.aliyun.core.annotation.NameInMap("IpsecPfs")
        private String ipsecPfs;

        private TunnelIpsecConfig(Builder builder) {
            this.ipsecAuthAlg = builder.ipsecAuthAlg;
            this.ipsecEncAlg = builder.ipsecEncAlg;
            this.ipsecLifetime = builder.ipsecLifetime;
            this.ipsecPfs = builder.ipsecPfs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelIpsecConfig create() {
            return builder().build();
        }

        /**
         * @return ipsecAuthAlg
         */
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        /**
         * @return ipsecEncAlg
         */
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        /**
         * @return ipsecLifetime
         */
        public String getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        /**
         * @return ipsecPfs
         */
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public static final class Builder {
            private String ipsecAuthAlg; 
            private String ipsecEncAlg; 
            private String ipsecLifetime; 
            private String ipsecPfs; 

            private Builder() {
            } 

            private Builder(TunnelIpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

            /**
             * <p>The authentication algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(String ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH group in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ipsecPfs(String ipsecPfs) {
                this.ipsecPfs = ipsecPfs;
                return this;
            }

            public TunnelIpsecConfig build() {
                return new TunnelIpsecConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class TunnelOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("EnableDpd")
        private String enableDpd;

        @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
        private String enableNatTraversal;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TunnelBgpConfig")
        private TunnelBgpConfig tunnelBgpConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("TunnelIkeConfig")
        private TunnelIkeConfig tunnelIkeConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelIndex")
        private Integer tunnelIndex;

        @com.aliyun.core.annotation.NameInMap("TunnelIpsecConfig")
        private TunnelIpsecConfig tunnelIpsecConfig;

        @com.aliyun.core.annotation.NameInMap("ZoneNo")
        private String zoneNo;

        private TunnelOptions(Builder builder) {
            this.customerGatewayId = builder.customerGatewayId;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.internetIp = builder.internetIp;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.role = builder.role;
            this.state = builder.state;
            this.status = builder.status;
            this.tunnelBgpConfig = builder.tunnelBgpConfig;
            this.tunnelId = builder.tunnelId;
            this.tunnelIkeConfig = builder.tunnelIkeConfig;
            this.tunnelIndex = builder.tunnelIndex;
            this.tunnelIpsecConfig = builder.tunnelIpsecConfig;
            this.zoneNo = builder.zoneNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelOptions create() {
            return builder().build();
        }

        /**
         * @return customerGatewayId
         */
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        /**
         * @return enableDpd
         */
        public String getEnableDpd() {
            return this.enableDpd;
        }

        /**
         * @return enableNatTraversal
         */
        public String getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return remoteCaCertificate
         */
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tunnelBgpConfig
         */
        public TunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return tunnelIkeConfig
         */
        public TunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        /**
         * @return tunnelIndex
         */
        public Integer getTunnelIndex() {
            return this.tunnelIndex;
        }

        /**
         * @return tunnelIpsecConfig
         */
        public TunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

        /**
         * @return zoneNo
         */
        public String getZoneNo() {
            return this.zoneNo;
        }

        public static final class Builder {
            private String customerGatewayId; 
            private String enableDpd; 
            private String enableNatTraversal; 
            private String internetIp; 
            private String remoteCaCertificate; 
            private String role; 
            private String state; 
            private String status; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private Integer tunnelIndex; 
            private TunnelIpsecConfig tunnelIpsecConfig; 
            private String zoneNo; 

            private Builder() {
            } 

            private Builder(TunnelOptions model) {
                this.customerGatewayId = model.customerGatewayId;
                this.enableDpd = model.enableDpd;
                this.enableNatTraversal = model.enableNatTraversal;
                this.internetIp = model.internetIp;
                this.remoteCaCertificate = model.remoteCaCertificate;
                this.role = model.role;
                this.state = model.state;
                this.status = model.status;
                this.tunnelBgpConfig = model.tunnelBgpConfig;
                this.tunnelId = model.tunnelId;
                this.tunnelIkeConfig = model.tunnelIkeConfig;
                this.tunnelIndex = model.tunnelIndex;
                this.tunnelIpsecConfig = model.tunnelIpsecConfig;
                this.zoneNo = model.zoneNo;
            } 

            /**
             * <p>The ID of the customer gateway associated with the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>cgw-p0wy363lucf1uyae8****</p>
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * <p>Indicates whether the DPD feature is enabled for the tunnel. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDpd(String enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * <p>Indicates whether NAT traversal is enabled for the tunnel. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableNatTraversal(String enableNatTraversal) {
                this.enableNatTraversal = enableNatTraversal;
                return this;
            }

            /**
             * <p>The tunnel IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.21.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The CA certificate of the tunnel peer.</p>
             * <p>This parameter is returned only if the VPN gateway is of the ShangMi (SM) type.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
             */
            public Builder remoteCaCertificate(String remoteCaCertificate) {
                this.remoteCaCertificate = remoteCaCertificate;
                return this;
            }

            /**
             * <p>The tunnel role. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: The tunnel is an active tunnel.</li>
             * <li><strong>slave</strong>: The tunnel is a standby tunnel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The tunnel status. Valid values:</p>
             * <ul>
             * <li><strong>active</strong></li>
             * <li><strong>updating</strong></li>
             * <li><strong>deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The state of the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>ike_sa_not_established</strong>: Phase 1 negotiations failed.</li>
             * <li><strong>ike_sa_established</strong>: Phase 1 negotiations succeeded.</li>
             * <li><strong>ipsec_sa_not_established</strong>: Phase 2 negotiations failed.</li>
             * <li><strong>ipsec_sa_established</strong>: Phase 2 negotiations succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipsec_sa_established</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The BGP configurations.</p>
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-opsqc4d97wni27****</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The configuration of Phase 1 negotiations.</p>
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * <p>The order in which the tunnel is created.</p>
             * <ul>
             * <li><strong>1</strong>: Tunnel 1.</li>
             * <li><strong>2</strong>: Tunnel 2.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the IPsec-VPN connection is associated with a transit router.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tunnelIndex(Integer tunnelIndex) {
                this.tunnelIndex = tunnelIndex;
                return this;
            }

            /**
             * <p>The configurations of Phase 2 negotiations.</p>
             */
            public Builder tunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
                this.tunnelIpsecConfig = tunnelIpsecConfig;
                return this;
            }

            /**
             * <p>The zone where the tunnel is deployed.</p>
             * <p>You can call <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> to query zone IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneNo(String zoneNo) {
                this.zoneNo = zoneNo;
                return this;
            }

            public TunnelOptions build() {
                return new TunnelOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class TunnelOptionsSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TunnelOptions")
        private java.util.List<TunnelOptions> tunnelOptions;

        private TunnelOptionsSpecification(Builder builder) {
            this.tunnelOptions = builder.tunnelOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelOptionsSpecification create() {
            return builder().build();
        }

        /**
         * @return tunnelOptions
         */
        public java.util.List<TunnelOptions> getTunnelOptions() {
            return this.tunnelOptions;
        }

        public static final class Builder {
            private java.util.List<TunnelOptions> tunnelOptions; 

            private Builder() {
            } 

            private Builder(TunnelOptionsSpecification model) {
                this.tunnelOptions = model.tunnelOptions;
            } 

            /**
             * TunnelOptions.
             */
            public Builder tunnelOptions(java.util.List<TunnelOptions> tunnelOptions) {
                this.tunnelOptions = tunnelOptions;
                return this;
            }

            public TunnelOptionsSpecification build() {
                return new TunnelOptionsSpecification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class VcoHealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dip")
        private String dip;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Integer retry;

        @com.aliyun.core.annotation.NameInMap("Sip")
        private String sip;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private VcoHealthCheck(Builder builder) {
            this.dip = builder.dip;
            this.enable = builder.enable;
            this.interval = builder.interval;
            this.policy = builder.policy;
            this.retry = builder.retry;
            this.sip = builder.sip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoHealthCheck create() {
            return builder().build();
        }

        /**
         * @return dip
         */
        public String getDip() {
            return this.dip;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return retry
         */
        public Integer getRetry() {
            return this.retry;
        }

        /**
         * @return sip
         */
        public String getSip() {
            return this.sip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dip; 
            private String enable; 
            private Integer interval; 
            private String policy; 
            private Integer retry; 
            private String sip; 
            private String status; 

            private Builder() {
            } 

            private Builder(VcoHealthCheck model) {
                this.dip = model.dip;
                this.enable = model.enable;
                this.interval = model.interval;
                this.policy = model.policy;
                this.retry = model.retry;
                this.sip = model.sip;
                this.status = model.status;
            } 

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder dip(String dip) {
                this.dip = dip;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled for the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>Indicates whether advertised routes are withdrawn when the health check fails. Valid values:</p>
             * <ul>
             * <li><strong>revoke_route</strong>: Advertised routes are withdrawn.</li>
             * <li><strong>reserve_route</strong>: Advertised routes are not withdrawn.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>revoke_route</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The maximum number of health check retries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retry(Integer retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder sip(String sip) {
                this.sip = sip;
                return this;
            }

            /**
             * <p>The state of the health check. Valid values:</p>
             * <ul>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong>: normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VcoHealthCheck build() {
                return new VcoHealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionResponseBody</p>
     */
    public static class VpnBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("EnableBgp")
        private String enableBgp;

        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private Long localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private Long peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private VpnBgpConfig(Builder builder) {
            this.authKey = builder.authKey;
            this.enableBgp = builder.enableBgp;
            this.localAsn = builder.localAsn;
            this.localBgpIp = builder.localBgpIp;
            this.peerAsn = builder.peerAsn;
            this.peerBgpIp = builder.peerBgpIp;
            this.status = builder.status;
            this.tunnelCidr = builder.tunnelCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnBgpConfig create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return enableBgp
         */
        public String getEnableBgp() {
            return this.enableBgp;
        }

        /**
         * @return localAsn
         */
        public Long getLocalAsn() {
            return this.localAsn;
        }

        /**
         * @return localBgpIp
         */
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        /**
         * @return peerAsn
         */
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerBgpIp
         */
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tunnelCidr
         */
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public static final class Builder {
            private String authKey; 
            private String enableBgp; 
            private Long localAsn; 
            private String localBgpIp; 
            private Long peerAsn; 
            private String peerBgpIp; 
            private String status; 
            private String tunnelCidr; 

            private Builder() {
            } 

            private Builder(VpnBgpConfig model) {
                this.authKey = model.authKey;
                this.enableBgp = model.enableBgp;
                this.localAsn = model.localAsn;
                this.localBgpIp = model.localBgpIp;
                this.peerAsn = model.peerAsn;
                this.peerBgpIp = model.peerBgpIp;
                this.status = model.status;
                this.tunnelCidr = model.tunnelCidr;
            } 

            /**
             * <p>The authentication key of the BGP routing protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>AuthKey****</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>Indicates whether BGP is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableBgp(String enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * <p>The ASN on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>65531</p>
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP IP address on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.2</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The autonomous system number (ASN) of the peer.</p>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder peerAsn(Long peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>The BGP IP address of the peer.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.1</p>
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * <p>The negotiation state of the BGP routing protocol. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: normal</li>
             * <li><strong>failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The BGP CIDR block of the IPsec-VPN connection. The CIDR block falls within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.0/30</p>
             */
            public Builder tunnelCidr(String tunnelCidr) {
                this.tunnelCidr = tunnelCidr;
                return this;
            }

            public VpnBgpConfig build() {
                return new VpnBgpConfig(this);
            } 

        } 

    }
}
