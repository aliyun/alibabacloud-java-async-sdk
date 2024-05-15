// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallConfigureRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallConfigureRequest</p>
 */
public class ModifyVpcFirewallConfigureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVpcCidrTableList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localVpcCidrTableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcCidrTableList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerVpcCidrTableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallName;

    private ModifyVpcFirewallConfigureRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.localVpcCidrTableList = builder.localVpcCidrTableList;
        this.memberUid = builder.memberUid;
        this.peerVpcCidrTableList = builder.peerVpcCidrTableList;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallConfigureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static final class Builder extends Request.Builder<ModifyVpcFirewallConfigureRequest, Builder> {
        private String lang; 
        private String localVpcCidrTableList; 
        private String memberUid; 
        private String peerVpcCidrTableList; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallConfigureRequest request) {
            super(request);
            this.lang = request.lang;
            this.localVpcCidrTableList = request.localVpcCidrTableList;
            this.memberUid = request.memberUid;
            this.peerVpcCidrTableList = request.peerVpcCidrTableList;
            this.vpcFirewallId = request.vpcFirewallId;
            this.vpcFirewallName = request.vpcFirewallName;
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
         * The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:
         * <p>
         * 
         * *   **RouteTableId**: the ID of the route table for the local VPC.
         * *   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the local VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the local VPC.
         * 
         * > You can call the [DescribeVpcFirewallDetail](~~342892~~) operation to query the CIDR blocks of local VPCs for VPC firewalls.
         */
        public Builder localVpcCidrTableList(String localVpcCidrTableList) {
            this.putQueryParameter("LocalVpcCidrTableList", localVpcCidrTableList);
            this.localVpcCidrTableList = localVpcCidrTableList;
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
         * 
         * > You can call the [DescribeVpcFirewallDetail](~~342892~~) operation to query the CIDR blocks of peer VPCs for VPC firewalls.
         */
        public Builder peerVpcCidrTableList(String peerVpcCidrTableList) {
            this.putQueryParameter("PeerVpcCidrTableList", peerVpcCidrTableList);
            this.peerVpcCidrTableList = peerVpcCidrTableList;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         * <p>
         * 
         * > You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
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
        public ModifyVpcFirewallConfigureRequest build() {
            return new ModifyVpcFirewallConfigureRequest(this);
        } 

    } 

}
