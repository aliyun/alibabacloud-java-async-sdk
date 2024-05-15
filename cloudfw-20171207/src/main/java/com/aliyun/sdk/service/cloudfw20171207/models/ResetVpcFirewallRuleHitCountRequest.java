// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the access control policy.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
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

        @Override
        public ResetVpcFirewallRuleHitCountRequest build() {
            return new ResetVpcFirewallRuleHitCountRequest(this);
        } 

    } 

}
