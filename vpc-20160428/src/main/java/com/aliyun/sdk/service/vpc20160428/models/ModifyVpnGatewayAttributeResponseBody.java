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
 * {@link ModifyVpnGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpnGatewayAttributeResponseBody</p>
 */
public class ModifyVpnGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoPropagate")
    private Boolean autoPropagate;

    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

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

    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("SslVpnInternetIp")
    private String sslVpnInternetIp;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private ModifyVpnGatewayAttributeResponseBody(Builder builder) {
        this.autoPropagate = builder.autoPropagate;
        this.businessStatus = builder.businessStatus;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.disasterRecoveryInternetIp = builder.disasterRecoveryInternetIp;
        this.disasterRecoveryVSwitchId = builder.disasterRecoveryVSwitchId;
        this.enableBgp = builder.enableBgp;
        this.endTime = builder.endTime;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.sslVpnInternetIp = builder.sslVpnInternetIp;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpnGatewayAttributeResponseBody create() {
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
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder {
        private Boolean autoPropagate; 
        private String businessStatus; 
        private Long createTime; 
        private String description; 
        private String disasterRecoveryInternetIp; 
        private String disasterRecoveryVSwitchId; 
        private Boolean enableBgp; 
        private Long endTime; 
        private String internetIp; 
        private String intranetIp; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private String spec; 
        private String sslVpnInternetIp; 
        private String status; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpnGatewayId; 

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
         * <p>The time when the VPN gateway was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492753580000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>116.11.XX.XX</p>
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
         * <p>The time when the VPN gateway expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1495382400000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
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
         * <p>116.62.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The private IP address of the vSwitch that is used by the system when the VPN gateway is deployed.</p>
         * <p>The parameter is returned only for VPN gateways that support single-tunnel IPsec-VPN connections. The IPsec-VPN feature must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>172.27.30.24</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The name of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>5M</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The IP address of the SSL-VPN connection.</p>
         * <p>This parameter is returned only when the VPN gateway is a public VPN gateway and supports only the single-tunnel mode. In addition, the VPN gateway must have the SSL-VPN feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>116.33.XX.XX</p>
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
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the vSwitch associated with the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1y9ovl1cu9ou4tv****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the VPN gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ub1yt9cvakoel****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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

        public ModifyVpnGatewayAttributeResponseBody build() {
            return new ModifyVpnGatewayAttributeResponseBody(this);
        } 

    } 

}
