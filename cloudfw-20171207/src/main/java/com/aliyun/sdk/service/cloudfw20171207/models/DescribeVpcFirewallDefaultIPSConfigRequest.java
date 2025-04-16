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
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
