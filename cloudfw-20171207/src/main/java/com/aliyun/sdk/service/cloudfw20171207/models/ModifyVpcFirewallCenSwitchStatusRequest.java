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
 * {@link ModifyVpcFirewallCenSwitchStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallCenSwitchStatusRequest</p>
 */
public class ModifyVpcFirewallCenSwitchStatusRequest extends Request {
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

    private ModifyVpcFirewallCenSwitchStatusRequest(Builder builder) {
        super(builder);
        this.firewallSwitch = builder.firewallSwitch;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallCenSwitchStatusRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyVpcFirewallCenSwitchStatusRequest, Builder> {
        private String firewallSwitch; 
        private String lang; 
        private String memberUid; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallCenSwitchStatusRequest request) {
            super(request);
            this.firewallSwitch = request.firewallSwitch;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * <p>Specifies whether to enable the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: yes</li>
         * <li><strong>close</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
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
         * <p>The instance ID of the VPC firewall.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation to query the instance IDs of VPC firewalls.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public ModifyVpcFirewallCenSwitchStatusRequest build() {
            return new ModifyVpcFirewallCenSwitchStatusRequest(this);
        } 

    } 

}
