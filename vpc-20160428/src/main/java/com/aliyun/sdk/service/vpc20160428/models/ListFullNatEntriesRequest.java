// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFullNatEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListFullNatEntriesRequest</p>
 */
public class ListFullNatEntriesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("FullNatEntryId")
    private String fullNatEntryId;

    @Query
    @NameInMap("FullNatEntryNames")
    private java.util.List < String > fullNatEntryNames;

    @Query
    @NameInMap("FullNatTableId")
    @Validation(required = true)
    private String fullNatTableId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NetworkInterfaceIds")
    private java.util.List < String > networkInterfaceIds;

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

    private ListFullNatEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fullNatEntryId = builder.fullNatEntryId;
        this.fullNatEntryNames = builder.fullNatEntryNames;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.maxResults = builder.maxResults;
        this.networkInterfaceIds = builder.networkInterfaceIds;
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

    public static ListFullNatEntriesRequest create() {
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
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return fullNatEntryNames
     */
    public java.util.List < String > getFullNatEntryNames() {
        return this.fullNatEntryNames;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List < String > getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
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

    public static final class Builder extends Request.Builder<ListFullNatEntriesRequest, Builder> {
        private String clientToken; 
        private String fullNatEntryId; 
        private java.util.List < String > fullNatEntryNames; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private Long maxResults; 
        private java.util.List < String > networkInterfaceIds; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListFullNatEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fullNatEntryId = request.fullNatEntryId;
            this.fullNatEntryNames = request.fullNatEntryNames;
            this.fullNatTableId = request.fullNatTableId;
            this.ipProtocol = request.ipProtocol;
            this.maxResults = request.maxResults;
            this.networkInterfaceIds = request.networkInterfaceIds;
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
         * FullNatEntryId.
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.putQueryParameter("FullNatEntryId", fullNatEntryId);
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * FullNatEntryNames.
         */
        public Builder fullNatEntryNames(java.util.List < String > fullNatEntryNames) {
            this.putQueryParameter("FullNatEntryNames", fullNatEntryNames);
            this.fullNatEntryNames = fullNatEntryNames;
            return this;
        }

        /**
         * FullNatTableId.
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.putQueryParameter("FullNatTableId", fullNatTableId);
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetworkInterfaceIds.
         */
        public Builder networkInterfaceIds(java.util.List < String > networkInterfaceIds) {
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIds;
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
        public ListFullNatEntriesRequest build() {
            return new ListFullNatEntriesRequest(this);
        } 

    } 

}
