// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpCidrsRequest} extends {@link RequestModel}
 *
 * <p>ListNatIpCidrsRequest</p>
 */
public class ListNatIpCidrsRequest extends Request {
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
    @NameInMap("NatIpCidrName")
    private java.util.List < String > natIpCidrName;

    @Query
    @NameInMap("NatIpCidrStatus")
    private String natIpCidrStatus;

    @Query
    @NameInMap("NatIpCidrs")
    private java.util.List < String > natIpCidrs;

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

    private ListNatIpCidrsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.natIpCidr = builder.natIpCidr;
        this.natIpCidrName = builder.natIpCidrName;
        this.natIpCidrStatus = builder.natIpCidrStatus;
        this.natIpCidrs = builder.natIpCidrs;
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

    public static ListNatIpCidrsRequest create() {
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
     * @return natIpCidrName
     */
    public java.util.List < String > getNatIpCidrName() {
        return this.natIpCidrName;
    }

    /**
     * @return natIpCidrStatus
     */
    public String getNatIpCidrStatus() {
        return this.natIpCidrStatus;
    }

    /**
     * @return natIpCidrs
     */
    public java.util.List < String > getNatIpCidrs() {
        return this.natIpCidrs;
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

    public static final class Builder extends Request.Builder<ListNatIpCidrsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String maxResults; 
        private String natGatewayId; 
        private String natIpCidr; 
        private java.util.List < String > natIpCidrName; 
        private String natIpCidrStatus; 
        private java.util.List < String > natIpCidrs; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListNatIpCidrsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.maxResults = response.maxResults;
            this.natGatewayId = response.natGatewayId;
            this.natIpCidr = response.natIpCidr;
            this.natIpCidrName = response.natIpCidrName;
            this.natIpCidrStatus = response.natIpCidrStatus;
            this.natIpCidrs = response.natIpCidrs;
            this.nextToken = response.nextToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
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
         * NatIpCidrName.
         */
        public Builder natIpCidrName(java.util.List < String > natIpCidrName) {
            this.putQueryParameter("NatIpCidrName", natIpCidrName);
            this.natIpCidrName = natIpCidrName;
            return this;
        }

        /**
         * NatIpCidrStatus.
         */
        public Builder natIpCidrStatus(String natIpCidrStatus) {
            this.putQueryParameter("NatIpCidrStatus", natIpCidrStatus);
            this.natIpCidrStatus = natIpCidrStatus;
            return this;
        }

        /**
         * NatIpCidrs.
         */
        public Builder natIpCidrs(java.util.List < String > natIpCidrs) {
            this.putQueryParameter("NatIpCidrs", natIpCidrs);
            this.natIpCidrs = natIpCidrs;
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
        public ListNatIpCidrsRequest build() {
            return new ListNatIpCidrsRequest(this);
        } 

    } 

}
