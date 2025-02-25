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
 * {@link ResetNatFirewallRuleHitCountRequest} extends {@link RequestModel}
 *
 * <p>ResetNatFirewallRuleHitCountRequest</p>
 */
public class ResetNatFirewallRuleHitCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
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
         * <p>The UUID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3de3aed5-6de7-4ecd-9106-cfe994b9c49f</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-zm0h3c1exm5bifuorg8c5</p>
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
