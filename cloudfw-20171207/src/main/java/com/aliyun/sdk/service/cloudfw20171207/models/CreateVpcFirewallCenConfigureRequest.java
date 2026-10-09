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
         * <p>The instance ID of the CEN instance.</p>
         * <blockquote>
         * <p> Prerequisite: The CEN instance must have been created by invoking the Cbn.CreateCen operation.</p>
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
         * <p>Settings for the virtual private cloud (VPC) firewall status after you create a VPC. Valid values:</p>
         * <ul>
         * <li><strong>open</strong> (default): The virtual private cloud (VPC) firewall is automatically enabled after it is created.</li>
         * <li><strong>close</strong>: The virtual private cloud (VPC) firewall is not automatically enabled after it is created. You can invoke the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to enable the firewall.</li>
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
         * <p>The CIDR block of the vSwitch used by the firewall. Specify a CIDR block with a subnet mask of no more than 29 bits that does not conflict with your network planning. This CIDR block is allocated to the vSwitch that is required during the create a VPC firewall procedure and is used for automatic creation of a vSwitch (Cloud_Firewall_VSWITCH) within the security VPC for traffic redirection. The vSwitch CIDR block must be a subnet of the firewall VPC CIDR block.</p>
         * <p>If you leave this parameter empty, the CIDR block 10.219.219.216/29 is automatically allocated by default.</p>
         * <blockquote>
         * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
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
         * <p>The zone ID of the vSwitch used by the firewall.</p>
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
         * <p>The CIDR block of the VPC used by the firewall. Specify a CIDR block with a subnet mask of no more than 28 bits. This CIDR block is allocated to the VPC that is required during the create a VPC firewall procedure and is used for automatic creation of a security VPC (Cloud_Firewall_VPC) for traffic redirection.</p>
         * <p>If you leave this parameter empty, the CIDR block 10.0.0.0/8 is automatically allocated by default.</p>
         * <blockquote>
         * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
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
         * <p>The ID of the secondary active zone of the firewall. The firewall performs an automatic switchover to the secondary zone to continue running only when the primary zone becomes unavailable.</p>
         * <p>If you leave this parameter empty, a secondary zone is automatically allocated by default.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall for the first time in the local region of the CEN instance.</p>
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
         * <p>The ID of the primary active zone of the firewall. If your business is latency-sensitive, you can set the firewall zone to the same zone as the vSwitch of the business VPC to reduce latency.</p>
         * <p>If you leave this parameter empty, a zone is automatically allocated by default.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a VPC firewall for the first time in the local region of the CEN instance.</p>
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
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The UID of the member account of the current Alibaba Cloud account.</p>
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
         * <p>The instance ID of the VPC-connected instance for which you want to create a virtual private cloud (VPC) firewall.</p>
         * <blockquote>
         * <p> Prerequisite: The VPC must have been attached to the CEN instance specified by CenId by invoking the Cbn.AttachCenChildInstance operation.</p>
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
         * <p>The instance name of the virtual private cloud (VPC) firewall.</p>
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
         * <p>The region ID of the VPC for which you want to create a virtual private cloud (VPC) firewall.</p>
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
