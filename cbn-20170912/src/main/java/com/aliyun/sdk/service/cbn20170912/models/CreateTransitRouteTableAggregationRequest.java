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
 * {@link CreateTransitRouteTableAggregationRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouteTableAggregationRequest</p>
 */
public class CreateTransitRouteTableAggregationRequest extends Request {
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

    private CreateTransitRouteTableAggregationRequest(Builder builder) {
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

    public static CreateTransitRouteTableAggregationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateTransitRouteTableAggregationRequest, Builder> {
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

        private Builder(CreateTransitRouteTableAggregationRequest request) {
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
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. The dry run checks items such as permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends a normal request and directly creates the aggregate route after the request passes the check.</li>
         * <li><strong>true</strong>: sends a check request without creating the aggregate route. The check items include required parameters and request format. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
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
         * <blockquote>
         * <p>The following CIDR blocks are not supported:</p>
         * </blockquote>
         * <ul>
         * <li>CIDR blocks that start with &quot;0&quot; or &quot;100.64&quot;</li>
         * <li>Multicast addresses (224.0.0.1 to 239.255.255.254)</li>
         * </ul>
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
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>Set the value to <strong>VPC</strong>, which indicates that the aggregate route is propagated to all VPC-connected instances that have established an associated forwarding relationship with the current Enterprise Edition transit router route table and have the route synchronization feature enabled.</p>
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
         * <p>The propagation scope list of the aggregate route.</p>
         * <blockquote>
         * <p>You must specify at least one of the propagation scope and the propagation scope list. We recommend that you use the propagation scope list. The elements in the propagation scope list cannot duplicate the value of the propagation scope.</p>
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
         * <p>vtb-iq8qgruq1ry8jc7vt****</p>
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            this.putQueryParameter("TransitRouteTableId", transitRouteTableId);
            this.transitRouteTableId = transitRouteTableId;
            return this;
        }

        @Override
        public CreateTransitRouteTableAggregationRequest build() {
            return new CreateTransitRouteTableAggregationRequest(this);
        } 

    } 

}
