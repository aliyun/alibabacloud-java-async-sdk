// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallControlPolicyPositionRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallControlPolicyPositionRequest</p>
 */
public class ModifyVpcFirewallControlPolicyPositionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewOrder")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldOrder")
    private String oldOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private ModifyVpcFirewallControlPolicyPositionRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.lang = builder.lang;
        this.newOrder = builder.newOrder;
        this.oldOrder = builder.oldOrder;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallControlPolicyPositionRequest create() {
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
     * @return newOrder
     */
    public String getNewOrder() {
        return this.newOrder;
    }

    /**
     * @return oldOrder
     */
    public String getOldOrder() {
        return this.oldOrder;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<ModifyVpcFirewallControlPolicyPositionRequest, Builder> {
        private String aclUuid; 
        private String lang; 
        private String newOrder; 
        private String oldOrder; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallControlPolicyPositionRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.lang = request.lang;
            this.newOrder = request.newOrder;
            this.oldOrder = request.oldOrder;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The UUID of the access control policy.
         * <p>
         * 
         * If you want to modify the configurations of an access control policy, you must provide the UUID of the policy. You can call the [DescribeVpcFirewallControlPolicy](~~159758~~) operation to query the UUID.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The language of the content within the request and the response.
         * <p>
         * 
         * Valid values:
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
         * The new priority of the access control policy.
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * The original priority of the access control policy.
         * <p>
         * 
         * > This parameter is not recommended. We recommend that you use the AclUuid parameter to specify the policy that you want to modify.
         */
        public Builder oldOrder(String oldOrder) {
            this.putQueryParameter("OldOrder", oldOrder);
            this.oldOrder = oldOrder;
            return this;
        }

        /**
         * The ID of the group to which the access control policy belongs. You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the ID.
         * <p>
         * 
         * Valid values:
         * 
         * *   If the VPC firewall is used to protect a CEN instance, the value of this parameter must be the ID of the CEN instance.
         * 
         *     Example: cen-ervw0g12b5jbw\*\*\*\*
         * 
         * *   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.
         * 
         *     Example: vfw-a42bbb7b887148c9\*\*\*\*
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public ModifyVpcFirewallControlPolicyPositionRequest build() {
            return new ModifyVpcFirewallControlPolicyPositionRequest(this);
        } 

    } 

}
