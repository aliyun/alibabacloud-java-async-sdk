// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatFirewallControlPolicyBatchRequest} extends {@link RequestModel}
 *
 * <p>DeleteNatFirewallControlPolicyBatchRequest</p>
 */
public class DeleteNatFirewallControlPolicyBatchRequest extends Request {
    @Query
    @NameInMap("AclUuidList")
    private java.util.List < String > aclUuidList;

    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    private DeleteNatFirewallControlPolicyBatchRequest(Builder builder) {
        super(builder);
        this.aclUuidList = builder.aclUuidList;
        this.direction = builder.direction;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatFirewallControlPolicyBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclUuidList
     */
    public java.util.List < String > getAclUuidList() {
        return this.aclUuidList;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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

    public static final class Builder extends Request.Builder<DeleteNatFirewallControlPolicyBatchRequest, Builder> {
        private java.util.List < String > aclUuidList; 
        private String direction; 
        private String lang; 
        private String natGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNatFirewallControlPolicyBatchRequest request) {
            super(request);
            this.aclUuidList = request.aclUuidList;
            this.direction = request.direction;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
        } 

        /**
         * AclUuidList.
         */
        public Builder aclUuidList(java.util.List < String > aclUuidList) {
            this.putQueryParameter("AclUuidList", aclUuidList);
            this.aclUuidList = aclUuidList;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
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
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        @Override
        public DeleteNatFirewallControlPolicyBatchRequest build() {
            return new DeleteNatFirewallControlPolicyBatchRequest(this);
        } 

    } 

}
