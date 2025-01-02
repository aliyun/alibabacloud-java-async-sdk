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
 * {@link DeleteVpcFirewallCenConfigureRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcFirewallCenConfigureRequest</p>
 */
public class DeleteVpcFirewallCenConfigureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> vpcFirewallIdList;

    private DeleteVpcFirewallCenConfigureRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vpcFirewallIdList = builder.vpcFirewallIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcFirewallCenConfigureRequest create() {
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
     * @return vpcFirewallIdList
     */
    public java.util.List<String> getVpcFirewallIdList() {
        return this.vpcFirewallIdList;
    }

    public static final class Builder extends Request.Builder<DeleteVpcFirewallCenConfigureRequest, Builder> {
        private String lang; 
        private String memberUid; 
        private java.util.List<String> vpcFirewallIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcFirewallCenConfigureRequest request) {
            super(request);
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vpcFirewallIdList = request.vpcFirewallIdList;
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
         * <p>The instance IDs of VPC firewalls.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
            this.putQueryParameter("VpcFirewallIdList", vpcFirewallIdList);
            this.vpcFirewallIdList = vpcFirewallIdList;
            return this;
        }

        @Override
        public DeleteVpcFirewallCenConfigureRequest build() {
            return new DeleteVpcFirewallCenConfigureRequest(this);
        } 

    } 

}
