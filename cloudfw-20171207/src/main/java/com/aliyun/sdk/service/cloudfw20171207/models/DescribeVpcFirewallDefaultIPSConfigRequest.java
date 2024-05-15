// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallDefaultIPSConfigRequest</p>
 */
public class DescribeVpcFirewallDefaultIPSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDefaultIPSConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallDefaultIPSConfigRequest, Builder> {
        private String memberUid; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallDefaultIPSConfigRequest request) {
            super(request);
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
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
         * The instance ID of the VPC firewall. Valid values:
         * <p>
         * 
         * *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the IDs of CEN instances.
         * *   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall. You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallDefaultIPSConfigRequest build() {
            return new DescribeVpcFirewallDefaultIPSConfigRequest(this);
        } 

    } 

}
