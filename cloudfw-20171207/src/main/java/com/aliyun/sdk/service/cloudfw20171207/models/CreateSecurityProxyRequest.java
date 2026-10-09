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
 * {@link CreateSecurityProxyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityProxyRequest</p>
 */
public class CreateSecurityProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallServiceMode")
    private String firewallServiceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallServiceZones")
    private java.util.List<String> firewallServiceZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitch")
    private String firewallSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FwVswitchZoneId")
    private String fwVswitchZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatRouteEntryList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<NatRouteEntryList> natRouteEntryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictMode")
    private Integer strictMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchAuto")
    private String vswitchAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchCidr")
    private String vswitchCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    private CreateSecurityProxyRequest(Builder builder) {
        super(builder);
        this.firewallServiceMode = builder.firewallServiceMode;
        this.firewallServiceZones = builder.firewallServiceZones;
        this.firewallSwitch = builder.firewallSwitch;
        this.fwVswitchZoneId = builder.fwVswitchZoneId;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.natRouteEntryList = builder.natRouteEntryList;
        this.proxyName = builder.proxyName;
        this.regionNo = builder.regionNo;
        this.strictMode = builder.strictMode;
        this.vpcId = builder.vpcId;
        this.vswitchAuto = builder.vswitchAuto;
        this.vswitchCidr = builder.vswitchCidr;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallServiceMode
     */
    public String getFirewallServiceMode() {
        return this.firewallServiceMode;
    }

    /**
     * @return firewallServiceZones
     */
    public java.util.List<String> getFirewallServiceZones() {
        return this.firewallServiceZones;
    }

    /**
     * @return firewallSwitch
     */
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    /**
     * @return fwVswitchZoneId
     */
    public String getFwVswitchZoneId() {
        return this.fwVswitchZoneId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natRouteEntryList
     */
    public java.util.List<NatRouteEntryList> getNatRouteEntryList() {
        return this.natRouteEntryList;
    }

    /**
     * @return proxyName
     */
    public String getProxyName() {
        return this.proxyName;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return strictMode
     */
    public Integer getStrictMode() {
        return this.strictMode;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchAuto
     */
    public String getVswitchAuto() {
        return this.vswitchAuto;
    }

    /**
     * @return vswitchCidr
     */
    public String getVswitchCidr() {
        return this.vswitchCidr;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<CreateSecurityProxyRequest, Builder> {
        private String firewallServiceMode; 
        private java.util.List<String> firewallServiceZones; 
        private String firewallSwitch; 
        private String fwVswitchZoneId; 
        private String lang; 
        private String natGatewayId; 
        private java.util.List<NatRouteEntryList> natRouteEntryList; 
        private String proxyName; 
        private String regionNo; 
        private Integer strictMode; 
        private String vpcId; 
        private String vswitchAuto; 
        private String vswitchCidr; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityProxyRequest request) {
            super(request);
            this.firewallServiceMode = request.firewallServiceMode;
            this.firewallServiceZones = request.firewallServiceZones;
            this.firewallSwitch = request.firewallSwitch;
            this.fwVswitchZoneId = request.fwVswitchZoneId;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.natRouteEntryList = request.natRouteEntryList;
            this.proxyName = request.proxyName;
            this.regionNo = request.regionNo;
            this.strictMode = request.strictMode;
            this.vpcId = request.vpcId;
            this.vswitchAuto = request.vswitchAuto;
            this.vswitchCidr = request.vswitchCidr;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * <p>The deployment mode of the firewall service. Valid values:</p>
         * <ul>
         * <li><strong>PrimaryStandby</strong>: primary/standby mode.</li>
         * <li><strong>MultiPrimary</strong>: active-active mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrimaryStandby</p>
         */
        public Builder firewallServiceMode(String firewallServiceMode) {
            this.putQueryParameter("FirewallServiceMode", firewallServiceMode);
            this.firewallServiceMode = firewallServiceMode;
            return this;
        }

        /**
         * <p>The list of zone IDs used by the firewall service.</p>
         */
        public Builder firewallServiceZones(java.util.List<String> firewallServiceZones) {
            this.putQueryParameter("FirewallServiceZones", firewallServiceZones);
            this.firewallServiceZones = firewallServiceZones;
            return this;
        }

        /**
         * <p>The security protection switch. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Enabled.</li>
         * <li><strong>close</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * <p>The zone of the firewall vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-b</p>
         */
        public Builder fwVswitchZoneId(String fwVswitchZoneId) {
            this.putQueryParameter("FwVswitchZoneId", fwVswitchZoneId);
            this.fwVswitchZoneId = fwVswitchZoneId;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1okz6k7******</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The list of routes to be switched for the NAT gateway.</p>
         * <p>This parameter is required.</p>
         */
        public Builder natRouteEntryList(java.util.List<NatRouteEntryList> natRouteEntryList) {
            this.putQueryParameter("NatRouteEntryList", natRouteEntryList);
            this.natRouteEntryList = natRouteEntryList;
            return this;
        }

        /**
         * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length and can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). It cannot start with an underscore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-firewall</p>
         */
        public Builder proxyName(String proxyName) {
            this.putQueryParameter("ProxyName", proxyName);
            this.proxyName = proxyName;
            return this;
        }

        /**
         * <p>The region ID of the VPC.</p>
         * <blockquote>
         * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>Specifies whether to enable strict mode. Valid values:</p>
         * <ul>
         * <li>1: Enable strict mode.</li>
         * <li>0: Disable strict mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder strictMode(Integer strictMode) {
            this.putQueryParameter("StrictMode", strictMode);
            this.strictMode = strictMode;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6b5lyul0x******</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Specifies whether to use the automatic mode for the vSwitch. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: automatic mode.</li>
         * <li><strong>false</strong>: manual mode.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: true. If VswitchAuto is set to true, VswitchCidr is required and must be a valid CIDR block. If VswitchAuto is set to false, VswitchId is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder vswitchAuto(String vswitchAuto) {
            this.putQueryParameter("VswitchAuto", vswitchAuto);
            this.vswitchAuto = vswitchAuto;
            return this;
        }

        /**
         * <p>The CIDR block of the vSwitch. This parameter is required when the automatic mode is used for the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder vswitchCidr(String vswitchCidr) {
            this.putQueryParameter("VswitchCidr", vswitchCidr);
            this.vswitchCidr = vswitchCidr;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. This parameter is required when the manual mode is used for the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1sqg9w******</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public CreateSecurityProxyRequest build() {
            return new CreateSecurityProxyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityProxyRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityProxyRequest</p>
     */
    public static class NatRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String routeTableId;

        private NatRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopId; 
            private String nextHopType; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(NatRouteEntryList model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The destination CIDR block of the default route.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The next hop of the original NAT gateway.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1okz6******</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The network type of the next hop. Valid value: NatGateway.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NatGateway</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The ID of the route table to which the default route of the NAT gateway belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-2ze1******</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public NatRouteEntryList build() {
                return new NatRouteEntryList(this);
            } 

        } 

    }
}
