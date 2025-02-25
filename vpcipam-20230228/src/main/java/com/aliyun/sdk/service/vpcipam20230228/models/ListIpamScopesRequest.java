// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamScopesRequest} extends {@link RequestModel}
 *
 * <p>ListIpamScopesRequest</p>
 */
public class ListIpamScopesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamId")
    private String ipamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamScopeIds")
    private java.util.List<String> ipamScopeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamScopeName")
    private String ipamScopeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamScopeType")
    private String ipamScopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListIpamScopesRequest(Builder builder) {
        super(builder);
        this.ipamId = builder.ipamId;
        this.ipamScopeIds = builder.ipamScopeIds;
        this.ipamScopeName = builder.ipamScopeName;
        this.ipamScopeType = builder.ipamScopeType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamScopesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamId
     */
    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * @return ipamScopeIds
     */
    public java.util.List<String> getIpamScopeIds() {
        return this.ipamScopeIds;
    }

    /**
     * @return ipamScopeName
     */
    public String getIpamScopeName() {
        return this.ipamScopeName;
    }

    /**
     * @return ipamScopeType
     */
    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListIpamScopesRequest, Builder> {
        private String ipamId; 
        private java.util.List<String> ipamScopeIds; 
        private String ipamScopeName; 
        private String ipamScopeType; 
        private Long maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListIpamScopesRequest request) {
            super(request);
            this.ipamId = request.ipamId;
            this.ipamScopeIds = request.ipamScopeIds;
            this.ipamScopeName = request.ipamScopeName;
            this.ipamScopeType = request.ipamScopeType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
        } 

        /**
         * IpamId.
         */
        public Builder ipamId(String ipamId) {
            this.putQueryParameter("IpamId", ipamId);
            this.ipamId = ipamId;
            return this;
        }

        /**
         * IpamScopeIds.
         */
        public Builder ipamScopeIds(java.util.List<String> ipamScopeIds) {
            this.putQueryParameter("IpamScopeIds", ipamScopeIds);
            this.ipamScopeIds = ipamScopeIds;
            return this;
        }

        /**
         * IpamScopeName.
         */
        public Builder ipamScopeName(String ipamScopeName) {
            this.putQueryParameter("IpamScopeName", ipamScopeName);
            this.ipamScopeName = ipamScopeName;
            return this;
        }

        /**
         * IpamScopeType.
         */
        public Builder ipamScopeType(String ipamScopeType) {
            this.putQueryParameter("IpamScopeType", ipamScopeType);
            this.ipamScopeType = ipamScopeType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListIpamScopesRequest build() {
            return new ListIpamScopesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamScopesRequest} extends {@link TeaModel}
     *
     * <p>ListIpamScopesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
