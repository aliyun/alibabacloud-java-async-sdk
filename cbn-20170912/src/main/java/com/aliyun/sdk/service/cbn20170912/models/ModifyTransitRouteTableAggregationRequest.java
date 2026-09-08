// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ModifyTransitRouteTableAggregationRequest} extends {@link RequestModel}
 *
 * <p>ModifyTransitRouteTableAggregationRequest</p>
 */
public class ModifyTransitRouteTableAggregationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableAggregationCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationDescription")
    private String transitRouteTableAggregationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationName")
    private String transitRouteTableAggregationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationScope")
    private String transitRouteTableAggregationScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationScopeList")
    private java.util.List<String> transitRouteTableAggregationScopeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableId;

    private ModifyTransitRouteTableAggregationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouteTableAggregationCidr = builder.transitRouteTableAggregationCidr;
        this.transitRouteTableAggregationDescription = builder.transitRouteTableAggregationDescription;
        this.transitRouteTableAggregationName = builder.transitRouteTableAggregationName;
        this.transitRouteTableAggregationScope = builder.transitRouteTableAggregationScope;
        this.transitRouteTableAggregationScopeList = builder.transitRouteTableAggregationScopeList;
        this.transitRouteTableId = builder.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTransitRouteTableAggregationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return transitRouteTableAggregationCidr
     */
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    /**
     * @return transitRouteTableAggregationDescription
     */
    public String getTransitRouteTableAggregationDescription() {
        return this.transitRouteTableAggregationDescription;
    }

    /**
     * @return transitRouteTableAggregationName
     */
    public String getTransitRouteTableAggregationName() {
        return this.transitRouteTableAggregationName;
    }

    /**
     * @return transitRouteTableAggregationScope
     */
    public String getTransitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }

    /**
     * @return transitRouteTableAggregationScopeList
     */
    public java.util.List<String> getTransitRouteTableAggregationScopeList() {
        return this.transitRouteTableAggregationScopeList;
    }

    /**
     * @return transitRouteTableId
     */
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

    public static final class Builder extends Request.Builder<ModifyTransitRouteTableAggregationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouteTableAggregationCidr; 
        private String transitRouteTableAggregationDescription; 
        private String transitRouteTableAggregationName; 
        private String transitRouteTableAggregationScope; 
        private java.util.List<String> transitRouteTableAggregationScopeList; 
        private String transitRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTransitRouteTableAggregationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouteTableAggregationCidr = request.transitRouteTableAggregationCidr;
            this.transitRouteTableAggregationDescription = request.transitRouteTableAggregationDescription;
            this.transitRouteTableAggregationName = request.transitRouteTableAggregationName;
            this.transitRouteTableAggregationScope = request.transitRouteTableAggregationScope;
            this.transitRouteTableAggregationScopeList = request.transitRouteTableAggregationScopeList;
            this.transitRouteTableId = request.transitRouteTableId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, including permission and instance status validation. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, the aggregate route is modified.</li>
         * <li><strong>true</strong>: sends a check request. Only validation is performed, and the aggregate route is not modified. The system checks whether required parameters are specified and whether the request format is valid. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The destination CIDR block of the aggregate route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * <p>The description of the aggregate route.</p>
         * <p>The description can be empty or 0 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder transitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
            this.putQueryParameter("TransitRouteTableAggregationDescription", transitRouteTableAggregationDescription);
            this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
            return this;
        }

        /**
         * <p>The name of the aggregate route.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder transitRouteTableAggregationName(String transitRouteTableAggregationName) {
            this.putQueryParameter("TransitRouteTableAggregationName", transitRouteTableAggregationName);
            this.transitRouteTableAggregationName = transitRouteTableAggregationName;
            return this;
        }

        /**
         * <p>The propagation scope of the aggregate route.</p>
         * <p>Set the value to <strong>VPC</strong>, which indicates that the aggregate route is propagated to all VPC-connected instances that have established associated forwarding relationships with the current Enterprise Edition transit router route table and have the route synchronization feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder transitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
            this.putQueryParameter("TransitRouteTableAggregationScope", transitRouteTableAggregationScope);
            this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
            return this;
        }

        /**
         * <p>The list of propagation scopes for the aggregate route.</p>
         * <blockquote>
         * <p>You must specify at least one of the aggregate route propagation scope or the aggregate route propagation scope list. We recommend that you use the aggregate route propagation scope list. The elements in the aggregate route propagation scope list cannot duplicate the value of the aggregate route propagation scope.</p>
         * </blockquote>
         */
        public Builder transitRouteTableAggregationScopeList(java.util.List<String> transitRouteTableAggregationScopeList) {
            String transitRouteTableAggregationScopeListShrink = shrink(transitRouteTableAggregationScopeList, "TransitRouteTableAggregationScopeList", "json");
            this.putQueryParameter("TransitRouteTableAggregationScopeList", transitRouteTableAggregationScopeListShrink);
            this.transitRouteTableAggregationScopeList = transitRouteTableAggregationScopeList;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition transit router route table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-6ehgc262hr170qgyc****</p>
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            this.putQueryParameter("TransitRouteTableId", transitRouteTableId);
            this.transitRouteTableId = transitRouteTableId;
            return this;
        }

        @Override
        public ModifyTransitRouteTableAggregationRequest build() {
            return new ModifyTransitRouteTableAggregationRequest(this);
        } 

    } 

}
