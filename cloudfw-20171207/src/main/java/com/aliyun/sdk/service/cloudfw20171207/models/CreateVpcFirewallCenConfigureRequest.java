// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallCenConfigureRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallCenConfigureRequest</p>
 */
public class CreateVpcFirewallCenConfigureRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("FirewallSwitch")
    @Validation(required = true)
    private String firewallSwitch;

    @Query
    @NameInMap("FirewallVSwitchCidrBlock")
    private String firewallVSwitchCidrBlock;

    @Query
    @NameInMap("FirewallVpcCidrBlock")
    private String firewallVpcCidrBlock;

    @Query
    @NameInMap("FirewallVpcZoneId")
    private String firewallVpcZoneId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("NetworkInstanceId")
    @Validation(required = true)
    private String networkInstanceId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcFirewallName")
    @Validation(required = true)
    private String vpcFirewallName;

    @Query
    @NameInMap("VpcRegion")
    @Validation(required = true)
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
         * FirewallVSwitchCidrBlock.
         */
        public Builder firewallVSwitchCidrBlock(String firewallVSwitchCidrBlock) {
            this.putQueryParameter("FirewallVSwitchCidrBlock", firewallVSwitchCidrBlock);
            this.firewallVSwitchCidrBlock = firewallVSwitchCidrBlock;
            return this;
        }

        /**
         * FirewallVpcCidrBlock.
         */
        public Builder firewallVpcCidrBlock(String firewallVpcCidrBlock) {
            this.putQueryParameter("FirewallVpcCidrBlock", firewallVpcCidrBlock);
            this.firewallVpcCidrBlock = firewallVpcCidrBlock;
            return this;
        }

        /**
         * FirewallVpcZoneId.
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
         * VSwitchId.
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
