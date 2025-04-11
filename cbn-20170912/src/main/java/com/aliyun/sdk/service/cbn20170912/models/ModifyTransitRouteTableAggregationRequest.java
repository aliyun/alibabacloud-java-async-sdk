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
         * <p>Use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different.</p>
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
         * <p>Specifies whether to perform a dry run to check information such as the permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends the request. If the request passes the check, an Enterprise Edition transit router is created.</li>
         * <li><strong>true</strong>: checks the request but does not create the Enterprise Edition transit router. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
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
         * <p>The scope of networks that you want to advertise the aggregate route.</p>
         * <p>The valid value is <strong>VPC</strong>, which indicates that the aggregate route is advertised to all VPCs that have associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.</p>
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
         * <p>The scope of networks to which the aggregate route is advertised.</p>
         * <blockquote>
         * <p> You must select at least one attribute from either the Aggregate Route Propagation Range or the Aggregate Route Propagation Range List. We recommend using the latter. The elements of the two attributes cannot duplicate.</p>
         * </blockquote>
         */
        public Builder transitRouteTableAggregationScopeList(java.util.List<String> transitRouteTableAggregationScopeList) {
            String transitRouteTableAggregationScopeListShrink = shrink(transitRouteTableAggregationScopeList, "TransitRouteTableAggregationScopeList", "json");
            this.putQueryParameter("TransitRouteTableAggregationScopeList", transitRouteTableAggregationScopeListShrink);
            this.transitRouteTableAggregationScopeList = transitRouteTableAggregationScopeList;
            return this;
        }

        /**
         * <p>The list of route table IDs of the Enterprise Edition transit router.</p>
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
