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
         * <p>The unique ID of the access control policy.</p>
         * <p>To modify an access control policy, provide the unique ID of the policy. Call the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2746d9ff-5d7c-449d-a2a9-ccaa15fe****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The language of the request and response.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (Default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
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
         * <p>The new priority of the access control policy.</p>
         * <blockquote>
         * <p>For more information about the valid range of priorities, see <a href="https://help.aliyun.com/document_detail/474145.html">DescribePolicyPriorities</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * <p>The original priority of the access control policy.</p>
         * <blockquote>
         * <p>This parameter is deprecated. Use the AclUuid parameter to specify the policy to modify.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder oldOrder(String oldOrder) {
            this.putQueryParameter("OldOrder", oldOrder);
            this.oldOrder = oldOrder;
            return this;
        }

        /**
         * <p>The ID of the policy group for the VPC firewall. You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain the ID.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall protects a Cloud Enterprise Network (CEN) instance, the ID of the policy group is the ID of the CEN instance.</p>
         * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
         * </li>
         * <li><p>If the VPC firewall protects an Express Connect circuit, the ID of the policy group is the ID of the VPC firewall instance.</p>
         * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\<em>\</em></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-a42bbb7b887148c9****</p>
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
