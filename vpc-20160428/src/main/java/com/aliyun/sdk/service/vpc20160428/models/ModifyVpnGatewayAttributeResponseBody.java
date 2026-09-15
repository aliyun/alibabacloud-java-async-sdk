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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyVpnGatewayAttributeResponseBody model) {
            this.autoPropagate = model.autoPropagate;
            this.businessStatus = model.businessStatus;
            this.createTime = model.createTime;
            this.description = model.description;
            this.disasterRecoveryInternetIp = model.disasterRecoveryInternetIp;
            this.disasterRecoveryVSwitchId = model.disasterRecoveryVSwitchId;
            this.enableBgp = model.enableBgp;
            this.endTime = model.endTime;
            this.internetIp = model.internetIp;
            this.intranetIp = model.intranetIp;
            this.name = model.name;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.spec = model.spec;
            this.sslVpnInternetIp = model.sslVpnInternetIp;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
            this.vpnGatewayId = model.vpnGatewayId;
        } 

        /**
         * <p>Indicates whether routing automatic propagation is enabled for BGP routes to the VPC. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: automatic propagation is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: automatic propagation is not enabled.</p>
         * </li>
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
         * <p>The payment status of the VPN gateway instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal.</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payment.</li>
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
         * <p>The timestamp when the VPN gateway instance was created. Unit: milliseconds.</p>
         * <p>The timestamp is in the UNIX format and represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492753580000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The second IP address assigned by the system to the VPN gateway instance for creating IPsec-VPN connections.</p>
         * <p>This parameter is returned only for VPN gateway instances that support creating dual-tunnel IPsec-VPN connections.</p>
         * 
         * <strong>example:</strong>
         * <p>116.11.XX.XX</p>
         */
        public Builder disasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
            this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
            return this;
        }

        /**
         * <p>The ID of the second vSwitch associated with the VPN gateway instance.</p>
         * <p>This parameter is returned only for VPN gateway instances that support creating dual-tunnel IPsec-VPN connections.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w95ql6tmr2ludkt****</p>
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * <p>The enabling status of the BGP feature for the VPN gateway. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: not enabled.</p>
         * </li>
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
         * <p>The timestamp when the VPN gateway instance expires. Unit: milliseconds.</p>
         * <p>The timestamp is in the UNIX format and represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <li><p>If the VPN gateway instance supports creating single-tunnel IPsec-VPN connections, this address is the IP address of the VPN gateway instance and can be used to create IPsec-VPN connections or SSL-VPN connections.</p>
         * </li>
         * <li><p>If the VPN gateway instance supports creating dual-tunnel IPsec-VPN connections, this address is the first IP address used to create IPsec-VPN connections and cannot be used to create SSL-VPN connections.</p>
         * <p>  If the VPN gateway instance supports creating dual-tunnel IPsec-VPN connections, the system assigns two IPsec IP addresses to the VPN gateway instance for creating dual-tunnel IPsec-VPN connections.</p>
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
         * <p>The private IP address of the vSwitch occupied by the system when deploying the VPN gateway instance.</p>
         * <p>This parameter is returned only for VPN gateway instances that support single-tunnel IPsec-VPN connections and have the IPsec-VPN feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.10.46</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The name of the VPN gateway instance.</p>
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
         * <p>The ID of the resource group to which the VPN gateway instance belongs.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> to query resource group information.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The bandwidth specification of the VPN gateway instance. Unit: Mbit/s.</p>
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
         * <p>This parameter is returned only when the SSL-VPN feature is enabled for a VPN gateway instance that supports creating dual-tunnel IPsec-VPN connections and uses the public network type.</p>
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
         * <li><strong>init</strong>: initializing.</li>
         * <li><strong>provisioning</strong>: preparing.</li>
         * <li><strong>active</strong>: Normal.</li>
         * <li><strong>updating</strong>: updating.</li>
         * <li><strong>deleting</strong>: deleting.</li>
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
         * <p>The ID of the vSwitch associated with the VPN gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1y9ovl1cu9ou4tv****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the VPN gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ub1yt9cvakoel****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway instance.</p>
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
