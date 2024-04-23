// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteVpcFirewallControlPolicyRequest</p>
 */
public class BatchDeleteVpcFirewallControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclUuidList")
    @Validation(required = true)
    private java.util.List < String > aclUuidList;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private BatchDeleteVpcFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclUuidList = builder.aclUuidList;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteVpcFirewallControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclUuidList
     */
    public java.util.List < String > getAclUuidList() {
        return this.aclUuidList;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteVpcFirewallControlPolicyRequest, Builder> {
        private java.util.List < String > aclUuidList; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteVpcFirewallControlPolicyRequest request) {
            super(request);
            this.aclUuidList = request.aclUuidList;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The UUIDs of access control policies.
         */
        public Builder aclUuidList(java.util.List < String > aclUuidList) {
            this.putQueryParameter("AclUuidList", aclUuidList);
            this.aclUuidList = aclUuidList;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public BatchDeleteVpcFirewallControlPolicyRequest build() {
            return new BatchDeleteVpcFirewallControlPolicyRequest(this);
        } 

    } 

}
