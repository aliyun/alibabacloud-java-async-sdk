// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNatFirewallControlPolicyPositionRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatFirewallControlPolicyPositionRequest</p>
 */
public class ModifyNatFirewallControlPolicyPositionRequest extends Request {
    @Query
    @NameInMap("AclUuid")
    @Validation(required = true)
    private String aclUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("NewOrder")
    private Integer newOrder;

    private ModifyNatFirewallControlPolicyPositionRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.newOrder = builder.newOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatFirewallControlPolicyPositionRequest create() {
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

    /**
     * @return newOrder
     */
    public Integer getNewOrder() {
        return this.newOrder;
    }

    public static final class Builder extends Request.Builder<ModifyNatFirewallControlPolicyPositionRequest, Builder> {
        private String aclUuid; 
        private String lang; 
        private String natGatewayId; 
        private Integer newOrder; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatFirewallControlPolicyPositionRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.newOrder = request.newOrder;
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
         * The language of the content within the response. Valid values:
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
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The new priority of the IPv4 access control policy. You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.
         * <p>
         * 
         * > Make sure that the value of this parameter is within the priority range of existing IPv4 access control policies. Otherwise, an error occurs when you call this operation.
         * 
         * Before you call this operation, we recommend that you call the DescribeNatFirewallPolicyPriorUsed operation to query the priority range of the IPv4 access control policies in the specified traffic direction.
         */
        public Builder newOrder(Integer newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        @Override
        public ModifyNatFirewallControlPolicyPositionRequest build() {
            return new ModifyNatFirewallControlPolicyPositionRequest(this);
        } 

    } 

}
