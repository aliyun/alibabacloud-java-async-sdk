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
 * {@link ModifyNatFirewallControlPolicyPositionRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatFirewallControlPolicyPositionRequest</p>
 */
public class ModifyNatFirewallControlPolicyPositionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewOrder")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer newOrder;

    private ModifyNatFirewallControlPolicyPositionRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.direction = builder.direction;
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

    /**
     * @return newOrder
     */
    public Integer getNewOrder() {
        return this.newOrder;
    }

    public static final class Builder extends Request.Builder<ModifyNatFirewallControlPolicyPositionRequest, Builder> {
        private String aclUuid; 
        private String direction; 
        private String lang; 
        private String natGatewayId; 
        private Integer newOrder; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatFirewallControlPolicyPositionRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.direction = request.direction;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.newOrder = request.newOrder;
        } 

        /**
         * <p>The UUID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>66961eea-e659-4225-84c9-9b6da76ec401</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The direction of the traffic to which the access control policy applies.</p>
         * <ul>
         * <li>Set the value to <strong>out</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
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
         * <p>The ID of the NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxxxxx</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The new priority of the IPv4 access control policy. You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.</p>
         * <blockquote>
         * <p>Make sure that the value of this parameter is within the priority range of existing IPv4 access control policies. Otherwise, an error occurs when you call this operation.</p>
         * </blockquote>
         * <p>Before you call this operation, we recommend that you call the DescribeNatFirewallPolicyPriorUsed operation to query the priority range of the IPv4 access control policies in the specified traffic direction.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
