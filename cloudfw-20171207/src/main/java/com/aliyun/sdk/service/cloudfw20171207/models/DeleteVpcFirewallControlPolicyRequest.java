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
 * {@link DeleteVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcFirewallControlPolicyRequest</p>
 */
public class DeleteVpcFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The unique identity ID of the access control policy for virtual private cloud (VPC) firewalls at the border.</p>
         * <p>When you delete an access control policy, you must provide the unique identity ID of the policy. You can invoke the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df2214****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The language of the request and response.</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
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
         * <p>The ID of the access control policy group for virtual private cloud (VPC) firewalls at the border. You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If the virtual private cloud (VPC) firewalls at the border protect a CEN instance, the policy group ID is the instance ID of the CEN instance.</p>
         * <p> Example: cen-ervw0g12b5jbw****</p>
         * </li>
         * <li><p>If the virtual private cloud (VPC) firewalls at the border protect an Express Connect circuit, the policy group ID is the instance ID of the virtual private cloud (VPC) firewalls at the border.</p>
         * <p>Example: vfw-a42bbb7b887148c9****</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-a42bbb7b887148c91****</p>
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
