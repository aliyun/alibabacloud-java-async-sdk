// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
    @com.aliyun.core.annotation.NameInMap("FirewallSwitch")
    private String firewallSwitch;

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
    private java.util.List < NatRouteEntryList> natRouteEntryList;

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
        this.firewallSwitch = builder.firewallSwitch;
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
     * @return firewallSwitch
     */
    public String getFirewallSwitch() {
        return this.firewallSwitch;
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
    public java.util.List < NatRouteEntryList> getNatRouteEntryList() {
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
        private String firewallSwitch; 
        private String lang; 
        private String natGatewayId; 
        private java.util.List < NatRouteEntryList> natRouteEntryList; 
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
            this.firewallSwitch = request.firewallSwitch;
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
         * <p>The status of the NAT firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: enabled</li>
         * <li><strong>close</strong>: disabled</li>
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
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>ngw-bp1okz6k7s4n4mnk5f1g3</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The routes to be switched to the NAT gateway.</p>
         * <p>This parameter is required.</p>
         */
        public Builder natRouteEntryList(java.util.List < NatRouteEntryList> natRouteEntryList) {
            this.putQueryParameter("NatRouteEntryList", natRouteEntryList);
            this.natRouteEntryList = natRouteEntryList;
            return this;
        }

        /**
         * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (_). However, it cannot start with an underscore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-idmp-fir</p>
         */
        public Builder proxyName(String proxyName) {
            this.putQueryParameter("ProxyName", proxyName);
            this.proxyName = proxyName;
            return this;
        }

        /**
         * <p>The region ID of the virtual private cloud (VPC).</p>
         * <blockquote>
         * <p> For more information about Cloud Firewall supported regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
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
         * <p>Specifies whether to enable the strict mode. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
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
         * <p>vpc-uf6b5lyul0xfgv74i01ph</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The mode of the vSwitch that you want to use. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: automatic</li>
         * <li><strong>false</strong>: manual</li>
         * </ul>
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
         * <p>The CIDR block of the vSwitch.</p>
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
         * <p>The ID of the vSwitch. This parameter is required if you set the VswitchAuto parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1sqg9wms9w9y1uxcs1x</p>
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
             * <p>ngw-bp1okz6k7s4n4mnk5f1g3</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The network type of the next hop. Set the value to NatGateway.</p>
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
             * <p>The route table to which the default route of the NAT gateway belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-2ze13wrgz7wsu9yiqeffg</p>
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
