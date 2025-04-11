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
 * {@link RefreshTransitRouteTableAggregationRequest} extends {@link RequestModel}
 *
 * <p>RefreshTransitRouteTableAggregationRequest</p>
 */
public class RefreshTransitRouteTableAggregationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableId;

    private RefreshTransitRouteTableAggregationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouteTableAggregationCidr = builder.transitRouteTableAggregationCidr;
        this.transitRouteTableId = builder.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshTransitRouteTableAggregationRequest create() {
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
     * @return transitRouteTableId
     */
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

    public static final class Builder extends Request.Builder<RefreshTransitRouteTableAggregationRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouteTableAggregationCidr; 
        private String transitRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshTransitRouteTableAggregationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouteTableAggregationCidr = request.transitRouteTableAggregationCidr;
            this.transitRouteTableId = request.transitRouteTableId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.53.0/24</p>
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
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
        public RefreshTransitRouteTableAggregationRequest build() {
            return new RefreshTransitRouteTableAggregationRequest(this);
        } 

    } 

}
