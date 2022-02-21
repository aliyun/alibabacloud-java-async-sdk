// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTLSCipherPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListTLSCipherPoliciesRequest</p>
 */
public class ListTLSCipherPoliciesRequest extends Request {
    @Query
    @NameInMap("IncludeListener")
    private Boolean includeListener;

    @Query
    @NameInMap("MaxItems")
    private Integer maxItems;

    @Query
    @NameInMap("Name")
    private String name;

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

    @Query
    @NameInMap("TLSCipherPolicyId")
    private String TLSCipherPolicyId;

    private ListTLSCipherPoliciesRequest(Builder builder) {
        super(builder);
        this.includeListener = builder.includeListener;
        this.maxItems = builder.maxItems;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.TLSCipherPolicyId = builder.TLSCipherPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTLSCipherPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeListener
     */
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return TLSCipherPolicyId
     */
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    public static final class Builder extends Request.Builder<ListTLSCipherPoliciesRequest, Builder> {
        private Boolean includeListener; 
        private Integer maxItems; 
        private String name; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String TLSCipherPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(ListTLSCipherPoliciesRequest response) {
            super(response);
            this.includeListener = response.includeListener;
            this.maxItems = response.maxItems;
            this.name = response.name;
            this.nextToken = response.nextToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.TLSCipherPolicyId = response.TLSCipherPolicyId;
        } 

        /**
         * IncludeListener.
         */
        public Builder includeListener(Boolean includeListener) {
            this.putQueryParameter("IncludeListener", includeListener);
            this.includeListener = includeListener;
            return this;
        }

        /**
         * MaxItems.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * TLSCipherPolicyId.
         */
        public Builder TLSCipherPolicyId(String TLSCipherPolicyId) {
            this.putQueryParameter("TLSCipherPolicyId", TLSCipherPolicyId);
            this.TLSCipherPolicyId = TLSCipherPolicyId;
            return this;
        }

        @Override
        public ListTLSCipherPoliciesRequest build() {
            return new ListTLSCipherPoliciesRequest(this);
        } 

    } 

}
