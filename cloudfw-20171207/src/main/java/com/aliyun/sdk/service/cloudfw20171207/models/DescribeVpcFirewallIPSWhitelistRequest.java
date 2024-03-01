// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallIPSWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallIPSWhitelistRequest</p>
 */
public class DescribeVpcFirewallIPSWhitelistRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private Long memberUid;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallIPSWhitelistRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallIPSWhitelistRequest create() {
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
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallIPSWhitelistRequest, Builder> {
        private String lang; 
        private Long memberUid; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallIPSWhitelistRequest request) {
            super(request);
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * VpcFirewallId.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallIPSWhitelistRequest build() {
            return new DescribeVpcFirewallIPSWhitelistRequest(this);
        } 

    } 

}
