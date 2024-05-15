// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallSwitchStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallSwitchStatusRequest</p>
 */
public class ModifyVpcFirewallSwitchStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private ModifyVpcFirewallSwitchStatusRequest(Builder builder) {
        super(builder);
        this.firewallSwitch = builder.firewallSwitch;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallSwitchStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallSwitch
     */
    public String getFirewallSwitch() {
        return this.firewallSwitch;
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

    public static final class Builder extends Request.Builder<ModifyVpcFirewallSwitchStatusRequest, Builder> {
        private String firewallSwitch; 
        private String lang; 
        private String memberUid; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallSwitchStatusRequest request) {
            super(request);
            this.firewallSwitch = request.firewallSwitch;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * Specifies whether to enable the VPC firewall. Valid values:
         * <p>
         * 
         * *   **open**: yes
         * *   **close**: no
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
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
         * > You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public ModifyVpcFirewallSwitchStatusRequest build() {
            return new ModifyVpcFirewallSwitchStatusRequest(this);
        } 

    } 

}
