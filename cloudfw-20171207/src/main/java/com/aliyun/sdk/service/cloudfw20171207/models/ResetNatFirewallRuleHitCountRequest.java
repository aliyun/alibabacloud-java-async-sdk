// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetNatFirewallRuleHitCountRequest} extends {@link RequestModel}
 *
 * <p>ResetNatFirewallRuleHitCountRequest</p>
 */
public class ResetNatFirewallRuleHitCountRequest extends Request {
    @Query
    @NameInMap("AclUuid")
    @Validation(required = true)
    private String aclUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NatGatewayId")
    private String natGatewayId;

    private ResetNatFirewallRuleHitCountRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetNatFirewallRuleHitCountRequest create() {
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

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static final class Builder extends Request.Builder<ResetNatFirewallRuleHitCountRequest, Builder> {
        private String aclUuid; 
        private String lang; 
        private String natGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ResetNatFirewallRuleHitCountRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
        } 

        /**
         * The UUID of the access control policy.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        @Override
        public ResetNatFirewallRuleHitCountRequest build() {
            return new ResetNatFirewallRuleHitCountRequest(this);
        } 

    } 

}
