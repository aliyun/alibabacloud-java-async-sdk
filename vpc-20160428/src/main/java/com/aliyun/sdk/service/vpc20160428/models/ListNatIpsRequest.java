// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpsRequest} extends {@link RequestModel}
 *
 * <p>ListNatIpsRequest</p>
 */
public class ListNatIpsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxResults")
    private String maxResults;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("NatIpCidr")
    private String natIpCidr;

    @Query
    @NameInMap("NatIpIds")
    private java.util.List < String > natIpIds;

    @Query
    @NameInMap("NatIpName")
    private java.util.List < String > natIpName;

    @Query
    @NameInMap("NatIpStatus")
    private String natIpStatus;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListNatIpsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.natIpCidr = builder.natIpCidr;
        this.natIpIds = builder.natIpIds;
        this.natIpName = builder.natIpName;
        this.natIpStatus = builder.natIpStatus;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNatIpsRequest create() {
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
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natIpCidr
     */
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    /**
     * @return natIpIds
     */
    public java.util.List < String > getNatIpIds() {
        return this.natIpIds;
    }

    /**
     * @return natIpName
     */
    public java.util.List < String > getNatIpName() {
        return this.natIpName;
    }

    /**
     * @return natIpStatus
     */
    public String getNatIpStatus() {
        return this.natIpStatus;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ListNatIpsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String maxResults; 
        private String natGatewayId; 
        private String natIpCidr; 
        private java.util.List < String > natIpIds; 
        private java.util.List < String > natIpName; 
        private String natIpStatus; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListNatIpsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.maxResults = request.maxResults;
            this.natGatewayId = request.natGatewayId;
            this.natIpCidr = request.natIpCidr;
            this.natIpIds = request.natIpIds;
            this.natIpName = request.natIpName;
            this.natIpStatus = request.natIpStatus;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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

        /**
         * NatIpCidr.
         */
        public Builder natIpCidr(String natIpCidr) {
            this.putQueryParameter("NatIpCidr", natIpCidr);
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * NatIpIds.
         */
        public Builder natIpIds(java.util.List < String > natIpIds) {
            this.putQueryParameter("NatIpIds", natIpIds);
            this.natIpIds = natIpIds;
            return this;
        }

        /**
         * NatIpName.
         */
        public Builder natIpName(java.util.List < String > natIpName) {
            this.putQueryParameter("NatIpName", natIpName);
            this.natIpName = natIpName;
            return this;
        }

        /**
         * NatIpStatus.
         */
        public Builder natIpStatus(String natIpStatus) {
            this.putQueryParameter("NatIpStatus", natIpStatus);
            this.natIpStatus = natIpStatus;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ListNatIpsRequest build() {
            return new ListNatIpsRequest(this);
        } 

    } 

}
