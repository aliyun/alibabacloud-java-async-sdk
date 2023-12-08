// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallConfigureRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallConfigureRequest</p>
 */
public class CreateVpcFirewallConfigureRequest extends Request {
    @Query
    @NameInMap("FirewallSwitch")
    @Validation(required = true)
    private String firewallSwitch;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LocalVpcCidrTableList")
    @Validation(required = true)
    private String localVpcCidrTableList;

    @Query
    @NameInMap("LocalVpcId")
    @Validation(required = true)
    private String localVpcId;

    @Query
    @NameInMap("LocalVpcRegion")
    @Validation(required = true)
    private String localVpcRegion;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("PeerVpcCidrTableList")
    @Validation(required = true)
    private String peerVpcCidrTableList;

    @Query
    @NameInMap("PeerVpcId")
    @Validation(required = true)
    private String peerVpcId;

    @Query
    @NameInMap("PeerVpcRegion")
    @Validation(required = true)
    private String peerVpcRegion;

    @Query
    @NameInMap("VpcFirewallName")
    @Validation(required = true)
    private String vpcFirewallName;

    private CreateVpcFirewallConfigureRequest(Builder builder) {
        super(builder);
        this.firewallSwitch = builder.firewallSwitch;
        this.lang = builder.lang;
        this.localVpcCidrTableList = builder.localVpcCidrTableList;
        this.localVpcId = builder.localVpcId;
        this.localVpcRegion = builder.localVpcRegion;
        this.memberUid = builder.memberUid;
        this.peerVpcCidrTableList = builder.peerVpcCidrTableList;
        this.peerVpcId = builder.peerVpcId;
        this.peerVpcRegion = builder.peerVpcRegion;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallConfigureRequest create() {
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
     * @return localVpcCidrTableList
     */
    public String getLocalVpcCidrTableList() {
        return this.localVpcCidrTableList;
    }

    /**
     * @return localVpcId
     */
    public String getLocalVpcId() {
        return this.localVpcId;
    }

    /**
     * @return localVpcRegion
     */
    public String getLocalVpcRegion() {
        return this.localVpcRegion;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return peerVpcCidrTableList
     */
    public String getPeerVpcCidrTableList() {
        return this.peerVpcCidrTableList;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return peerVpcRegion
     */
    public String getPeerVpcRegion() {
        return this.peerVpcRegion;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallConfigureRequest, Builder> {
        private String firewallSwitch; 
        private String lang; 
        private String localVpcCidrTableList; 
        private String localVpcId; 
        private String localVpcRegion; 
        private String memberUid; 
        private String peerVpcCidrTableList; 
        private String peerVpcId; 
        private String peerVpcRegion; 
        private String vpcFirewallName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallConfigureRequest request) {
            super(request);
            this.firewallSwitch = request.firewallSwitch;
            this.lang = request.lang;
            this.localVpcCidrTableList = request.localVpcCidrTableList;
            this.localVpcId = request.localVpcId;
            this.localVpcRegion = request.localVpcRegion;
            this.memberUid = request.memberUid;
            this.peerVpcCidrTableList = request.peerVpcCidrTableList;
            this.peerVpcId = request.peerVpcId;
            this.peerVpcRegion = request.peerVpcRegion;
            this.vpcFirewallName = request.vpcFirewallName;
        } 

        /**
         * The status of the VPC firewall after you create the firewall. Valid values:
         * <p>
         * 
         * *   **open**: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.
         * *   **close**: After you create the VPC firewall, the VPC firewall is disabled. To enable the firewall, you can call the [ModifyVpcFirewallSwitchStatus](~~342935~~) operation.
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:
         * <p>
         * 
         * *   **RouteTableId**: the ID of the route table for the local VPC.
         * *   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the local VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the local VPC.
         */
        public Builder localVpcCidrTableList(String localVpcCidrTableList) {
            this.putQueryParameter("LocalVpcCidrTableList", localVpcCidrTableList);
            this.localVpcCidrTableList = localVpcCidrTableList;
            return this;
        }

        /**
         * The ID of the local VPC.
         */
        public Builder localVpcId(String localVpcId) {
            this.putQueryParameter("LocalVpcId", localVpcId);
            this.localVpcId = localVpcId;
            return this;
        }

        /**
         * The region ID of the local VPC.
         * <p>
         * 
         * >  For more information about the regions in which Cloud Firewall is available, see [Supported regions](~~195657~~).
         */
        public Builder localVpcRegion(String localVpcRegion) {
            this.putQueryParameter("LocalVpcRegion", localVpcRegion);
            this.localVpcRegion = localVpcRegion;
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
         * The CIDR blocks of the peer VPC. The value is a JSON string that contains the following parameters:
         * <p>
         * 
         * *   **RouteTableId**: the ID of the route table for the peer VPC.
         * *   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the peer VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the peer VPC.
         */
        public Builder peerVpcCidrTableList(String peerVpcCidrTableList) {
            this.putQueryParameter("PeerVpcCidrTableList", peerVpcCidrTableList);
            this.peerVpcCidrTableList = peerVpcCidrTableList;
            return this;
        }

        /**
         * The ID of the peer VPC.
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * The region ID of the peer VPC.
         * <p>
         * 
         * >  For more information about Cloud Firewall supported regions, see [Supported regions](~~195657~~).
         */
        public Builder peerVpcRegion(String peerVpcRegion) {
            this.putQueryParameter("PeerVpcRegion", peerVpcRegion);
            this.peerVpcRegion = peerVpcRegion;
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

        @Override
        public CreateVpcFirewallConfigureRequest build() {
            return new CreateVpcFirewallConfigureRequest(this);
        } 

    } 

}
