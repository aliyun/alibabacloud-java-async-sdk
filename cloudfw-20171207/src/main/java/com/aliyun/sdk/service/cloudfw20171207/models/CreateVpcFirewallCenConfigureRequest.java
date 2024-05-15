// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallCenConfigureRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallCenConfigureRequest</p>
 */
public class CreateVpcFirewallCenConfigureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVSwitchCidrBlock")
    private String firewallVSwitchCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcCidrBlock")
    private String firewallVpcCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcZoneId")
    private String firewallVpcZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcRegion;

    private CreateVpcFirewallCenConfigureRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.firewallSwitch = builder.firewallSwitch;
        this.firewallVSwitchCidrBlock = builder.firewallVSwitchCidrBlock;
        this.firewallVpcCidrBlock = builder.firewallVpcCidrBlock;
        this.firewallVpcZoneId = builder.firewallVpcZoneId;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.networkInstanceId = builder.networkInstanceId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcFirewallName = builder.vpcFirewallName;
        this.vpcRegion = builder.vpcRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallCenConfigureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return firewallSwitch
     */
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    /**
     * @return firewallVSwitchCidrBlock
     */
    public String getFirewallVSwitchCidrBlock() {
        return this.firewallVSwitchCidrBlock;
    }

    /**
     * @return firewallVpcCidrBlock
     */
    public String getFirewallVpcCidrBlock() {
        return this.firewallVpcCidrBlock;
    }

    /**
     * @return firewallVpcZoneId
     */
    public String getFirewallVpcZoneId() {
        return this.firewallVpcZoneId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return networkInstanceId
     */
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    /**
     * @return vpcRegion
     */
    public String getVpcRegion() {
        return this.vpcRegion;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallCenConfigureRequest, Builder> {
        private String cenId; 
        private String firewallSwitch; 
        private String firewallVSwitchCidrBlock; 
        private String firewallVpcCidrBlock; 
        private String firewallVpcZoneId; 
        private String lang; 
        private String memberUid; 
        private String networkInstanceId; 
        private String vSwitchId; 
        private String vpcFirewallName; 
        private String vpcRegion; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallCenConfigureRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.firewallSwitch = request.firewallSwitch;
            this.firewallVSwitchCidrBlock = request.firewallVSwitchCidrBlock;
            this.firewallVpcCidrBlock = request.firewallVpcCidrBlock;
            this.firewallVpcZoneId = request.firewallVpcZoneId;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.networkInstanceId = request.networkInstanceId;
            this.vSwitchId = request.vSwitchId;
            this.vpcFirewallName = request.vpcFirewallName;
            this.vpcRegion = request.vpcRegion;
        } 

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * Specifies whether to enable the VPC firewall. Valid values:
         * <p>
         * 
         * *   **open**: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.
         * *   **close**: After you create the VPC firewall, the VPC firewall is disabled. You can call the [ModifyVpcFirewallCenSwitchStatus](~~345780~~) operation to manually enable the VPC firewall.
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * The CIDR block of the vSwitch that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VSWITCH VPC that is automatically created for the VPC firewall for traffic redirection. The CIDR block does not conflict with your network plan. The subnet mask of the CIDR block must be less than or equal to 29 bits in length. The CIDR block of the vSwitch must be within the network segment of the VPC.
         * <p>
         * 
         * If you do not specify a value, the CIDR block 10.219.219.216/29 is automatically allocated.
         * 
         * >  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.
         */
        public Builder firewallVSwitchCidrBlock(String firewallVSwitchCidrBlock) {
            this.putQueryParameter("FirewallVSwitchCidrBlock", firewallVSwitchCidrBlock);
            this.firewallVSwitchCidrBlock = firewallVSwitchCidrBlock;
            return this;
        }

        /**
         * The CIDR block of the VPC that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VPC VPC that is automatically created for the VPC firewall for traffic redirection. The subnet mask of the CIDR block must be less than or equal to 28 bits in length.
         * <p>
         * 
         * If you do not specify a value, the CIDR block 10.0.0.0/8 is automatically allocated.
         * 
         * >  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.
         */
        public Builder firewallVpcCidrBlock(String firewallVpcCidrBlock) {
            this.putQueryParameter("FirewallVpcCidrBlock", firewallVpcCidrBlock);
            this.firewallVpcCidrBlock = firewallVpcCidrBlock;
            return this;
        }

        /**
         * The ID of the zone to which the vSwitch belongs. If your service is latency-sensitive, you can specify the same zone for the vSwitch of the firewall and the vSwitch of your business VPC to minimize latency.
         * <p>
         * 
         * If you do not specify a value, a zone is automatically assigned for the vSwitch.
         * 
         * >  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region. For more information about zones that are supported by each region, see [Query zones](~~36064~~).
         */
        public Builder firewallVpcZoneId(String firewallVpcZoneId) {
            this.putQueryParameter("FirewallVpcZoneId", firewallVpcZoneId);
            this.firewallVpcZoneId = firewallVpcZoneId;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The ID of the VPC for which you want to create the VPC firewall.
         */
        public Builder networkInstanceId(String networkInstanceId) {
            this.putQueryParameter("NetworkInstanceId", networkInstanceId);
            this.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * The ID of the vSwitch that is used to associate with the elastic network interface (ENI) required by the VPC firewall.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The instance name of the VPC firewall.
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * The ID of the region to which the VPC belongs.
         * <p>
         * 
         * > For more information about the regions, see [Supported regions](~~195657~~).
         */
        public Builder vpcRegion(String vpcRegion) {
            this.putQueryParameter("VpcRegion", vpcRegion);
            this.vpcRegion = vpcRegion;
            return this;
        }

        @Override
        public CreateVpcFirewallCenConfigureRequest build() {
            return new CreateVpcFirewallCenConfigureRequest(this);
        } 

    } 

}
