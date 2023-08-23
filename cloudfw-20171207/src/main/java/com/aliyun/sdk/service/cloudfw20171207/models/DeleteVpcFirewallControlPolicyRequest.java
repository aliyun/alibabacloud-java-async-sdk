// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcFirewallControlPolicyRequest</p>
 */
public class DeleteVpcFirewallControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclUuid")
    @Validation(required = true)
    private String aclUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private DeleteVpcFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.lang = builder.lang;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcFirewallControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclUuid
     */
    public String getAclUuid() {
        return this.aclUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DeleteVpcFirewallControlPolicyRequest, Builder> {
        private String aclUuid; 
        private String lang; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcFirewallControlPolicyRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.lang = request.lang;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The ID of the access control policy. 
         * <p>
         * 
         * To delete an access control policy, you must provide the ID of the policy. You can call the **DescribeVpcFirewallControlPolicy** operation to query the ID.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The natural language of the request and response. Valid values: 
         * <p>
         * 
         * - **zh**: Chinese
         * - **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the group to which the access control policy belongs. You can call the **DescribeVpcFirewallAclGroupList** operation to query the ID.  
         * <p>
         * 
         * Valid values:
         * 
         * - If the VPC firewall is used to protect a CEN instance, the value of this parameter is the ID of the CEN instance.  
         * 
         * Example: cen-ervw0g12b5jbw****
         * - If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the ID of the VPC firewall.  
         * 
         * Example: vfw-a42bbb7b887148c9****
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DeleteVpcFirewallControlPolicyRequest build() {
            return new DeleteVpcFirewallControlPolicyRequest(this);
        } 

    } 

}
