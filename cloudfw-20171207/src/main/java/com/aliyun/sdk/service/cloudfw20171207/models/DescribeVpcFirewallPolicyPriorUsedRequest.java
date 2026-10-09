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
 * {@link DescribeVpcFirewallPolicyPriorUsedRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallPolicyPriorUsedRequest</p>
 */
public class DescribeVpcFirewallPolicyPriorUsedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language of the request and response.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The ID of the policy group for the VPC firewall. Call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall protects a Cloud Enterprise Network (CEN) instance, set this parameter to the ID of the CEN instance.</p>
         * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
         * </li>
         * <li><p>If the VPC firewall protects an Express Connect circuit, set this parameter to the ID of the VPC firewall instance.</p>
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
        public DescribeVpcFirewallPolicyPriorUsedRequest build() {
            return new DescribeVpcFirewallPolicyPriorUsedRequest(this);
        } 

    } 

}
