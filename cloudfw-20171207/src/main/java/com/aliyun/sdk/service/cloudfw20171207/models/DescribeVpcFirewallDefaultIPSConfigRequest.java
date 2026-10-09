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
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall protects a network instance in a Cloud Enterprise Network (CEN) instance, set this parameter to the ID of the CEN instance. To query the ID of a CEN instance of Basic Edition, call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation. To query the ID of a CEN instance of Enterprise Edition, call the <a href="https://help.aliyun.com/document_detail/2384695.html">DescribeTrFirewallsV2List</a> operation.</p>
         * </li>
         * <li><p>If the VPC firewall protects traffic between two VPCs connected by an Express Connect circuit, set this parameter to the ID of the VPC firewall instance. To query the ID of the VPC firewall instance, call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-****</p>
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
