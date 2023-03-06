// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransitRouteTableAggregationDetailRequest</p>
 */
public class DescribeTransitRouteTableAggregationDetailRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransitRouteTableAggregationCidr")
    @Validation(required = true)
    private String transitRouteTableAggregationCidr;

    @Query
    @NameInMap("TransitRouteTableId")
    @Validation(required = true)
    private String transitRouteTableId;

    private DescribeTransitRouteTableAggregationDetailRequest(Builder builder) {
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

    public static DescribeTransitRouteTableAggregationDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTransitRouteTableAggregationDetailRequest, Builder> {
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

        private Builder(DescribeTransitRouteTableAggregationDetailRequest request) {
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
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId may be different for each request.
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
         * The destination CIDR block of the aggregate route.
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * The ID of the route table of the Enterprise Edition transit router.
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            this.putQueryParameter("TransitRouteTableId", transitRouteTableId);
            this.transitRouteTableId = transitRouteTableId;
            return this;
        }

        @Override
        public DescribeTransitRouteTableAggregationDetailRequest build() {
            return new DescribeTransitRouteTableAggregationDetailRequest(this);
        } 

    } 

}
