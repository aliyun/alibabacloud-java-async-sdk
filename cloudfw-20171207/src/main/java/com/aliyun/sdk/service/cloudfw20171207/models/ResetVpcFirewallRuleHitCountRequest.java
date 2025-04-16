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
 * {@link ResetVpcFirewallRuleHitCountRequest} extends {@link RequestModel}
 *
 * <p>ResetVpcFirewallRuleHitCountRequest</p>
 */
public class ResetVpcFirewallRuleHitCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ResetVpcFirewallRuleHitCountRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetVpcFirewallRuleHitCountRequest create() {
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

    public static final class Builder extends Request.Builder<ResetVpcFirewallRuleHitCountRequest, Builder> {
        private String aclUuid; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ResetVpcFirewallRuleHitCountRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The natural language of the request and response. </p>
         * <p>Valid values:</p>
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

        @Override
        public ResetVpcFirewallRuleHitCountRequest build() {
            return new ResetVpcFirewallRuleHitCountRequest(this);
        } 

    } 

}
