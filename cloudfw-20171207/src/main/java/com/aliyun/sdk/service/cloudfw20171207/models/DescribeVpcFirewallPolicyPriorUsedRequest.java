// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallPolicyPriorUsedRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallPolicyPriorUsedRequest</p>
 */
public class DescribeVpcFirewallPolicyPriorUsedRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallPolicyPriorUsedRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallPolicyPriorUsedRequest create() {
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
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallPolicyPriorUsedRequest, Builder> {
        private String lang; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallPolicyPriorUsedRequest request) {
            super(request);
            this.lang = request.lang;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The natural language of the request and response. 
         * <p>
         * 
         * Valid values:
         * 
         * - **zh**: Chinese (default)
         * - **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the policy group to which the access control policy belongs. You can call the DescribeVpcFirewallAclGroupList operation to query the ID.  
         * <p>
         * 
         * Valid values:
         * 
         * - If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.  
         * 
         * Example: cen-ervw0g12b5jbw****
         * - If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the ID of the VPC firewall instance.  
         * 
         * Example: vfw-a42bbb7b887148c9****
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallPolicyPriorUsedRequest build() {
            return new DescribeVpcFirewallPolicyPriorUsedRequest(this);
        } 

    } 

}
