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
    @com.aliyun.core.annotation.NameInMap("FirewallVSwitchZoneId")
    private String firewallVSwitchZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcCidrBlock")
    private String firewallVpcCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallVpcStandbyZoneId")
    private String firewallVpcStandbyZoneId;

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
        this.firewallVSwitchZoneId = builder.firewallVSwitchZoneId;
        this.firewallVpcCidrBlock = builder.firewallVpcCidrBlock;
        this.firewallVpcStandbyZoneId = builder.firewallVpcStandbyZoneId;
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
     * @return firewallVSwitchZoneId
     */
    public String getFirewallVSwitchZoneId() {
        return this.firewallVSwitchZoneId;
    }

    /**
     * @return firewallVpcCidrBlock
     */
    public String getFirewallVpcCidrBlock() {
        return this.firewallVpcCidrBlock;
    }

    /**
     * @return firewallVpcStandbyZoneId
     */
    public String getFirewallVpcStandbyZoneId() {
        return this.firewallVpcStandbyZoneId;
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
        private String firewallVSwitchZoneId; 
        private String firewallVpcCidrBlock; 
        private String firewallVpcStandbyZoneId; 
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
            this.firewallVSwitchZoneId = request.firewallVSwitchZoneId;
            this.firewallVpcCidrBlock = request.firewallVpcCidrBlock;
            this.firewallVpcStandbyZoneId = request.firewallVpcStandbyZoneId;
            this.firewallVpcZoneId = request.firewallVpcZoneId;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.networkInstanceId = request.networkInstanceId;
            this.vSwitchId = request.vSwitchId;
            this.vpcFirewallName = request.vpcFirewallName;
            this.vpcRegion = request.vpcRegion;
        } 

        /**
         * <p>The instance ID of the CEN.</p>
         * <blockquote>
         * <p>Prerequisite: The CEN instance must be created by invoking the CreateCen operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-x5jayxou71ad73****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The settings for the switch status of the virtual private cloud (VPC) firewalls at the border. Valid values:</p>
         * <ul>
         * <li><strong>open</strong> (default): Automatically enables protection after you create a VPC and the virtual private cloud (VPC) firewalls at the border are created.</li>
         * <li><strong>close</strong>: Does not automatically enable protection after the virtual private cloud (VPC) firewalls at the border are created. You can invoke the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to enable protection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * <p>The vSwitch CIDR block used by the firewall. You must configure a CIDR block with a subnet mask of no more than 29 bits that does not conflict with your network planning to allocate to the vSwitch CIDR block required for the procedure of creating the firewall, in order to perform automatic creation of the vSwitch (Cloud_Firewall_VSWITCH) in the firewall secure VPC for traffic diversion and processing. The vSwitch CIDR block must be a subnet of the firewall VPC CIDR block.</p>
         * <p>If you do not specify this parameter, the default is to automatically allocate the 10.219.219.216/29 CIDR block.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.219.219.216/29</p>
         */
        public Builder firewallVSwitchCidrBlock(String firewallVSwitchCidrBlock) {
            this.putQueryParameter("FirewallVSwitchCidrBlock", firewallVSwitchCidrBlock);
            this.firewallVSwitchCidrBlock = firewallVSwitchCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the zone to which the firewall vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder firewallVSwitchZoneId(String firewallVSwitchZoneId) {
            this.putQueryParameter("FirewallVSwitchZoneId", firewallVSwitchZoneId);
            this.firewallVSwitchZoneId = firewallVSwitchZoneId;
            return this;
        }

        /**
         * <p>The VPC CIDR block used by the firewall. You must configure a CIDR block with a subnet mask of no more than 28 bits to allocate to the VPC CIDR block required for the procedure of creating the firewall, in order to perform automatic creation of the firewall secure VPC (Cloud_Firewall_VPC) for traffic diversion and processing.</p>
         * <p>If you do not specify this parameter, the default is to automatically allocate the 10.0.0.0/8 CIDR block.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder firewallVpcCidrBlock(String firewallVpcCidrBlock) {
            this.putQueryParameter("FirewallVpcCidrBlock", firewallVpcCidrBlock);
            this.firewallVpcCidrBlock = firewallVpcCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the secondary zone to which the firewall belongs. Only when the primary zone service is not active, the firewall will perform automatic switchover to the secondary zone to continue running.</p>
         * <p>If you do not specify this parameter, the default is to automatically allocate the secondary zone for the firewall.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.219.219.216/29</p>
         */
        public Builder firewallVpcStandbyZoneId(String firewallVpcStandbyZoneId) {
            this.putQueryParameter("FirewallVpcStandbyZoneId", firewallVpcStandbyZoneId);
            this.firewallVpcStandbyZoneId = firewallVpcStandbyZoneId;
            return this;
        }

        /**
         * <p>The ID of the primary zone to which the firewall belongs.
         * If your business is sensitive to latency, you can set the zone of the firewall to be the same as the zone of the vSwitch in your business VPC to reduce latency.</p>
         * <p>If you do not specify this parameter, the system automatically assigns a zone for the firewall.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder firewallVpcZoneId(String firewallVpcZoneId) {
            this.putQueryParameter("FirewallVpcZoneId", firewallVpcZoneId);
            this.firewallVpcZoneId = firewallVpcZoneId;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
         * <p>The UID of the member accounts of the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The instance ID of the VPC-connected instance for which you want to create virtual private cloud (VPC) firewalls at the border.</p>
         * <blockquote>
         * <p>Prerequisite: The VPC must be added to the CEN specified by the CenId parameter by invoking the AttachCenChildInstance operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10zlifxh6j0232w****</p>
         */
        public Builder networkInstanceId(String networkInstanceId) {
            this.putQueryParameter("NetworkInstanceId", networkInstanceId);
            this.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the Cloud Firewall interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-qzeaol304m***</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The instance name of the virtual private cloud (VPC) firewalls at the border.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-firewall-test</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * <p>The region ID of the VPC for which you want to create virtual private cloud (VPC) firewalls at the border.</p>
         * <blockquote>
         * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
