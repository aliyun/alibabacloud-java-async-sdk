// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallCenConfigureRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallCenConfigureRequest</p>
 */
public class ModifyVpcFirewallCenConfigureRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    @Query
    @NameInMap("VpcFirewallName")
    @Validation(required = true)
    private String vpcFirewallName;

    private ModifyVpcFirewallCenConfigureRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallCenConfigureRequest create() {
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
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static final class Builder extends Request.Builder<ModifyVpcFirewallCenConfigureRequest, Builder> {
        private String lang; 
        private String memberUid; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallCenConfigureRequest request) {
            super(request);
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
            this.vpcFirewallName = request.vpcFirewallName;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
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
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         * <p>
         * 
         * > You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * The instance name of the VPC firewall.
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        @Override
        public ModifyVpcFirewallCenConfigureRequest build() {
            return new ModifyVpcFirewallCenConfigureRequest(this);
        } 

    } 

}
