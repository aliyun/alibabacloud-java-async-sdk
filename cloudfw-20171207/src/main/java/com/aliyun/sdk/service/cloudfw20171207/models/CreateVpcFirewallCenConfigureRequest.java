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
         * <p>The ID of the CEN instance.</p>
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
         * <p>Specifies whether to enable the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.</li>
         * <li><strong>close</strong>: After you create the VPC firewall, the VPC firewall is disabled. You can call the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to manually enable the VPC firewall.</li>
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
         * <p>The CIDR block of the vSwitch that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VSWITCH VPC that is automatically created for the VPC firewall for traffic redirection. The CIDR block does not conflict with your network plan. The subnet mask of the CIDR block must be less than or equal to 29 bits in length. The CIDR block of the vSwitch must be within the network segment of the VPC.</p>
         * <p>If you do not specify a value, the CIDR block 10.219.219.216/29 is automatically allocated.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
         * </blockquote>
         */
        public Builder firewallVSwitchCidrBlock(String firewallVSwitchCidrBlock) {
            this.putQueryParameter("FirewallVSwitchCidrBlock", firewallVSwitchCidrBlock);
            this.firewallVSwitchCidrBlock = firewallVSwitchCidrBlock;
            return this;
        }

        /**
         * <p>The CIDR block of the VPC that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VPC VPC that is automatically created for the VPC firewall for traffic redirection. The subnet mask of the CIDR block must be less than or equal to 28 bits in length.</p>
         * <p>If you do not specify a value, the CIDR block 10.0.0.0/8 is automatically allocated.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
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
         * <p>The ID of the backup availability zone to which the firewall belongs. The firewall will automatically switch to the backup availability zone to continue running only if the primary availability zone service is unavailable.
         * If this parameter is not filled, the backup availability zone for the firewall will be automatically assigned.</p>
         * <blockquote>
         * <p>This parameter is only effective when creating a VPC firewall for the first time in this CEN region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder firewallVpcStandbyZoneId(String firewallVpcStandbyZoneId) {
            this.putQueryParameter("FirewallVpcStandbyZoneId", firewallVpcStandbyZoneId);
            this.firewallVpcStandbyZoneId = firewallVpcStandbyZoneId;
            return this;
        }

        /**
         * <p>The ID of the zone to which the vSwitch belongs. If your service is latency-sensitive, you can specify the same zone for the vSwitch of the firewall and the vSwitch of your business VPC to minimize latency.</p>
         * <p>If you do not specify a value, a zone is automatically assigned for the vSwitch.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region. For more information about zones that are supported by each region, see <a href="https://help.aliyun.com/document_detail/36064.html">Query zones</a>.</p>
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
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
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
         * <p>The ID of the VPC for which you want to create the VPC firewall.</p>
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
         * <p>The ID of the vSwitch that is used to associate with the elastic network interface (ENI) required by the VPC firewall.</p>
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
         * <p>The instance name of the VPC firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * <p>The ID of the region to which the VPC belongs.</p>
         * <blockquote>
         * <p>For more information about the regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
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
