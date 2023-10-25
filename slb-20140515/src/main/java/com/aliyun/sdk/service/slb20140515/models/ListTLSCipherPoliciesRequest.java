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

        private Builder(ListTLSCipherPoliciesRequest request) {
            super(request);
            this.includeListener = request.includeListener;
            this.maxItems = request.maxItems;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.TLSCipherPolicyId = request.TLSCipherPolicyId;
        } 

        /**
         * Specifies whether to return the information about the associated listeners. Valid values:
         * <p>
         * 
         * *   **true**: returns the information about the associated listeners.
         * *   **false** (default): does not return the information about the associated listeners.
         */
        public Builder includeListener(Boolean includeListener) {
            this.putQueryParameter("IncludeListener", includeListener);
            this.includeListener = includeListener;
            return this;
        }

        /**
         * The maximum number of TLS policies to be queried in this call. Valid values: **1** to **100**. If you do not set this parameter, the default value **20** is used.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * The name of the TLS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no next query is to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.
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
         * The ID of the region where the Classic Load Balancer (CLB) instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The ID of the TLS policy.
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
