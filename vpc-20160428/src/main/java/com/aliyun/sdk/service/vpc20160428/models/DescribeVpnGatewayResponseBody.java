// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewayResponseBody</p>
 */
public class DescribeVpnGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoPropagate")
    private Boolean autoPropagate;

    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisasterRecoveryInternetIp")
    private String disasterRecoveryInternetIp;

    @com.aliyun.core.annotation.NameInMap("DisasterRecoveryVSwitchId")
    private String disasterRecoveryVSwitchId;

    @com.aliyun.core.annotation.NameInMap("EnableBgp")
    private Boolean enableBgp;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("EniInstanceIds")
    private EniInstanceIds eniInstanceIds;

    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.NameInMap("IpsecVpn")
    private String ipsecVpn;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservationData")
    private ReservationData reservationData;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("SslMaxConnections")
    private Long sslMaxConnections;

    @com.aliyun.core.annotation.NameInMap("SslVpn")
    private String sslVpn;

    @com.aliyun.core.annotation.NameInMap("SslVpnInternetIp")
    private String sslVpnInternetIp;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    @com.aliyun.core.annotation.NameInMap("VpnType")
    private String vpnType;

    private DescribeVpnGatewayResponseBody(Builder builder) {
        this.autoPropagate = builder.autoPropagate;
        this.businessStatus = builder.businessStatus;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.disasterRecoveryInternetIp = builder.disasterRecoveryInternetIp;
        this.disasterRecoveryVSwitchId = builder.disasterRecoveryVSwitchId;
        this.enableBgp = builder.enableBgp;
        this.endTime = builder.endTime;
        this.eniInstanceIds = builder.eniInstanceIds;
        this.internetIp = builder.internetIp;
        this.ipsecVpn = builder.ipsecVpn;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.requestId = builder.requestId;
        this.reservationData = builder.reservationData;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.sslMaxConnections = builder.sslMaxConnections;
        this.sslVpn = builder.sslVpn;
        this.sslVpnInternetIp = builder.sslVpnInternetIp;
        this.status = builder.status;
        this.tag = builder.tag;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpnGatewayId = builder.vpnGatewayId;
        this.vpnType = builder.vpnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoPropagate
     */
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disasterRecoveryInternetIp
     */
    public String getDisasterRecoveryInternetIp() {
        return this.disasterRecoveryInternetIp;
    }

    /**
     * @return disasterRecoveryVSwitchId
     */
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    /**
     * @return enableBgp
     */
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eniInstanceIds
     */
    public EniInstanceIds getEniInstanceIds() {
        return this.eniInstanceIds;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return ipsecVpn
     */
    public String getIpsecVpn() {
        return this.ipsecVpn;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reservationData
     */
    public ReservationData getReservationData() {
        return this.reservationData;
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
     * @return sslMaxConnections
     */
    public Long getSslMaxConnections() {
        return this.sslMaxConnections;
    }

    /**
     * @return sslVpn
     */
    public String getSslVpn() {
        return this.sslVpn;
    }

    /**
     * @return sslVpnInternetIp
     */
    public String getSslVpnInternetIp() {
        return this.sslVpnInternetIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * @return vpnType
     */
    public String getVpnType() {
        return this.vpnType;
    }

    public static final class Builder {
        private Boolean autoPropagate; 
        private String businessStatus; 
        private String chargeType; 
        private Long createTime; 
        private String description; 
        private String disasterRecoveryInternetIp; 
        private String disasterRecoveryVSwitchId; 
        private Boolean enableBgp; 
        private Long endTime; 
        private EniInstanceIds eniInstanceIds; 
        private String internetIp; 
        private String ipsecVpn; 
        private String name; 
        private String networkType; 
        private String requestId; 
        private ReservationData reservationData; 
        private String resourceGroupId; 
        private String spec; 
        private Long sslMaxConnections; 
        private String sslVpn; 
        private String sslVpnInternetIp; 
        private String status; 
        private String tag; 
        private Tags tags; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpnGatewayId; 
        private String vpnType; 

        /**
         * <p>Indicates whether BGP routes are automatically advertised to the VPC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPropagate(Boolean autoPropagate) {
            this.autoPropagate = autoPropagate;
            return this;
        }

        /**
         * <p>The payment status of the VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>The billing method. Valid value:</p>
         * <p><strong>POSTPAY</strong>: pay-as-you-go</p>
         * 
         * <strong>example:</strong>
         * <p>China site (aliyun.com): Prepay. International site (alibabacloud.com): POSTPAY.</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The timestamp when the VPN gateway was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1495382400000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpngatewaydescription</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The second IP address assigned by the system to create an IPsec-VPN connection.</p>
         * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
         * 
         * <strong>example:</strong>
         * <p>47.91.XX.XX</p>
         */
        public Builder disasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
            this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
            return this;
        }

        /**
         * <p>The ID of the second vSwitch associated with the VPN gateway.</p>
         * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w95ql6tmr2ludkt****</p>
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * <p>Indicates whether BGP is enabled for the VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        /**
         * <p>The timestamp when the VPN gateway expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1544666102000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ENIs created by the system for the VPN gateway.</p>
         */
        public Builder eniInstanceIds(EniInstanceIds eniInstanceIds) {
            this.eniInstanceIds = eniInstanceIds;
            return this;
        }

        /**
         * <ul>
         * <li><p>If the VPN gateway supports IPsec-VPN connections in single-tunnel mode, the address is the IP address of the VPN gateway and can be used to create an IPsec-VPN connection or an SSL-VPN connection.</p>
         * </li>
         * <li><p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the address is the first IP address used to create an IPsec-VPN connection. The address cannot be used to create an SSL-VPN connection.</p>
         * <p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the system assigns two IP addresses to the VPN gateway to create two encrypted tunnels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>47.22.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>Indicates whether the IPsec-VPN feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong></li>
         * <li><strong>disable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder ipsecVpn(String ipsecVpn) {
            this.ipsecVpn = ipsecVpn;
            return this;
        }

        /**
         * <p>The name of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpngatewayname</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the VPN gateway.</p>
         * <ul>
         * <li><strong>public</strong></li>
         * <li><strong>private</strong></li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27E4E088-8DE0-4672-BF5C-0A412389DB9E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about pending orders.</p>
         * <blockquote>
         * <p>This set of parameters is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         */
        public Builder reservationData(ReservationData reservationData) {
            this.reservationData = reservationData;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the VPN gateway belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The maximum number of concurrent SSL-VPN connections.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder sslMaxConnections(Long sslMaxConnections) {
            this.sslMaxConnections = sslMaxConnections;
            return this;
        }

        /**
         * <p>The status of the SSL-VPN feature. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong></li>
         * <li><strong>disable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder sslVpn(String sslVpn) {
            this.sslVpn = sslVpn;
            return this;
        }

        /**
         * <p>The IP address of the SSL-VPN connection.</p>
         * <p>This parameter is returned only when the VPN gateway is a public VPN gateway and supports only the single-tunnel mode. In addition, the VPN gateway must have the SSL-VPN feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>47.74.XX.XX</p>
         */
        public Builder sslVpnInternetIp(String sslVpnInternetIp) {
            this.sslVpnInternetIp = sslVpnInternetIp;
            return this;
        }

        /**
         * <p>The status of the VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>init</strong></li>
         * <li><strong>provisioning</strong></li>
         * <li><strong>active</strong></li>
         * <li><strong>updating</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tag that is automatically generated for the VPN gateway. The tag consists of the following parameters:</p>
         * <ul>
         * <li><p><strong>VpnEnableBgp</strong>: indicates whether the VPN gateway supports BGP. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>VisuallySsl</strong>: indicates whether the VPN gateway allows you to view the connection information of SSL clients. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>PbrPriority</strong>: indicates whether the VPN gateway allows you to configure priorities for policy-based routes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>VpnNewImage</strong>: indicates whether the VPN gateway is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>description</strong>: the description of the VPN gateway. This parameter is only for internal use.</p>
         * </li>
         * <li><p><strong>VpnVersion</strong>: the version of the VPN gateway.</p>
         * </li>
         * <li><p><strong>IDaaSNewVersion</strong>: indicates whether the VPN gateway can be associated with an EIAM 2.0 instance.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpnEnableBgp&quot;:&quot;true&quot;,&quot;VisuallySsl&quot;:&quot;true&quot;,&quot;PbrPriority&quot;:&quot;true&quot;,&quot;VpnNewImage&quot;:&quot;true&quot;,&quot;description&quot;:&quot;forwarding1.3.7&quot;,&quot;VpnVersion&quot;:&quot;v1.2.4&quot;}</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The tags that are added to the VPN gateway.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1dmzugdikc6hdgx****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the VPN gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19m2yx1m5q0avyq****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1r3v1xqkl0w519g****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * <p>The type of VPN gateway. Only <strong>Normal</strong> may be returned, which indicates a standard VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder vpnType(String vpnType) {
            this.vpnType = vpnType;
            return this;
        }

        public DescribeVpnGatewayResponseBody build() {
            return new DescribeVpnGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnGatewayResponseBody</p>
     */
    public static class EniInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private java.util.List < String > eniInstanceId;

        private EniInstanceIds(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniInstanceIds create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public java.util.List < String > getEniInstanceId() {
            return this.eniInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > eniInstanceId; 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(java.util.List < String > eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            public EniInstanceIds build() {
                return new EniInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnGatewayResponseBody</p>
     */
    public static class ReservationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservationEndTime")
        private String reservationEndTime;

        @com.aliyun.core.annotation.NameInMap("ReservationIpsec")
        private String reservationIpsec;

        @com.aliyun.core.annotation.NameInMap("ReservationMaxConnections")
        private Integer reservationMaxConnections;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ReservationSpec")
        private String reservationSpec;

        @com.aliyun.core.annotation.NameInMap("ReservationSsl")
        private String reservationSsl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReservationData(Builder builder) {
            this.reservationEndTime = builder.reservationEndTime;
            this.reservationIpsec = builder.reservationIpsec;
            this.reservationMaxConnections = builder.reservationMaxConnections;
            this.reservationOrderType = builder.reservationOrderType;
            this.reservationSpec = builder.reservationSpec;
            this.reservationSsl = builder.reservationSsl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservationData create() {
            return builder().build();
        }

        /**
         * @return reservationEndTime
         */
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        /**
         * @return reservationIpsec
         */
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        /**
         * @return reservationMaxConnections
         */
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return reservationSpec
         */
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        /**
         * @return reservationSsl
         */
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reservationEndTime; 
            private String reservationIpsec; 
            private Integer reservationMaxConnections; 
            private String reservationOrderType; 
            private String reservationSpec; 
            private String reservationSsl; 
            private String status; 

            /**
             * <p>If the order type is <strong>TEMP_UPGRADE</strong> (temporary upgrade), this parameter specifies the time when the temporary upgrade expires.</p>
             * <p>If the order type is <strong>RENEWCHANGE</strong> (renewal with a specification change) or <strong>RENEW</strong> (renewal), this parameter indicates the time when the renewal or renewal with a specification change takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-20T16:00:00Z</p>
             */
            public Builder reservationEndTime(String reservationEndTime) {
                this.reservationEndTime = reservationEndTime;
                return this;
            }

            /**
             * <p>The IPsec-VPN status of the pending order. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong></li>
             * <li><strong>disable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder reservationIpsec(String reservationIpsec) {
                this.reservationIpsec = reservationIpsec;
                return this;
            }

            /**
             * <p>The maximum number of concurrent SSL-VPN connections of the pending order.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder reservationMaxConnections(Integer reservationMaxConnections) {
                this.reservationMaxConnections = reservationMaxConnections;
                return this;
            }

            /**
             * <p>The type of the pending order. Valid values:</p>
             * <ul>
             * <li><strong>RENEWCHANGE</strong>: renewal with upgrade or downgrade</li>
             * <li><strong>TEMP_UPGRADE</strong>: temporary upgrade</li>
             * <li><strong>RENEW</strong>: renewal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEMP_UPGRADE</p>
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * <p>The bandwidth of the pending order. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder reservationSpec(String reservationSpec) {
                this.reservationSpec = reservationSpec;
                return this;
            }

            /**
             * <p>The SSL-VPN status of the pending order. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong></li>
             * <li><strong>disable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder reservationSsl(String reservationSsl) {
                this.reservationSsl = reservationSsl;
                return this;
            }

            /**
             * <p>The status of the pending order. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: indicates that the order of the renewal or specification change has not taken effect.</li>
             * <li><strong>2</strong>: indicates that the order is an order for temporary upgrade and the order has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, <strong>ReservationIpsec</strong>, <strong>ReservationMaxConnections</strong>, <strong>ReservationSpec</strong>, and <strong>ReservationSsl</strong> indicate the previous specification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReservationData build() {
                return new ReservationData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnGatewayResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb</p>
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
     * {@link DescribeVpnGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnGatewayResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * <p>The tag that is automatically generated for the VPN gateway. The tag consists of the following parameters:</p>
             * <ul>
             * <li><p><strong>VpnEnableBgp</strong>: indicates whether the VPN gateway supports BGP. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>VisuallySsl</strong>: indicates whether the VPN gateway allows you to view the connection information of SSL clients. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>PbrPriority</strong>: indicates whether the VPN gateway allows you to configure priorities for policy-based routes. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>VpnNewImage</strong>: indicates whether the VPN gateway is upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>description</strong>: the description of the VPN gateway. This parameter is only for internal use.</p>
             * </li>
             * <li><p><strong>VpnVersion</strong>: the version of the VPN gateway.</p>
             * </li>
             * <li><p><strong>IDaaSNewVersion</strong>: indicates whether the VPN gateway can be associated with an EIAM 2.0 instance.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VpnEnableBgp&quot;:&quot;true&quot;,&quot;VisuallySsl&quot;:&quot;true&quot;,&quot;PbrPriority&quot;:&quot;true&quot;,&quot;VpnNewImage&quot;:&quot;true&quot;,&quot;description&quot;:&quot;forwarding1.3.7&quot;,&quot;VpnVersion&quot;:&quot;v1.2.4&quot;}</p>
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
