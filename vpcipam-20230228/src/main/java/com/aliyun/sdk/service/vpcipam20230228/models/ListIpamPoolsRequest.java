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
 * {@link ListIpamPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListIpamPoolsRequest</p>
 */
public class ListIpamPoolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolIds")
    private java.util.List<String> ipamPoolIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolName")
    private String ipamPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamScopeId")
    private String ipamScopeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsShared")
    private Boolean isShared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

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
    @com.aliyun.core.annotation.NameInMap("PoolRegionId")
    private String poolRegionId;

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
    @com.aliyun.core.annotation.NameInMap("SourceIpamPoolId")
    private String sourceIpamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListIpamPoolsRequest(Builder builder) {
        super(builder);
        this.ipamPoolIds = builder.ipamPoolIds;
        this.ipamPoolName = builder.ipamPoolName;
        this.ipamScopeId = builder.ipamScopeId;
        this.isShared = builder.isShared;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.poolRegionId = builder.poolRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIpamPoolId = builder.sourceIpamPoolId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamPoolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamPoolIds
     */
    public java.util.List<String> getIpamPoolIds() {
        return this.ipamPoolIds;
    }

    /**
     * @return ipamPoolName
     */
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    /**
     * @return ipamScopeId
     */
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
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
     * @return poolRegionId
     */
    public String getPoolRegionId() {
        return this.poolRegionId;
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
     * @return sourceIpamPoolId
     */
    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListIpamPoolsRequest, Builder> {
        private java.util.List<String> ipamPoolIds; 
        private String ipamPoolName; 
        private String ipamScopeId; 
        private Boolean isShared; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String poolRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceIpamPoolId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListIpamPoolsRequest request) {
            super(request);
            this.ipamPoolIds = request.ipamPoolIds;
            this.ipamPoolName = request.ipamPoolName;
            this.ipamScopeId = request.ipamScopeId;
            this.isShared = request.isShared;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.poolRegionId = request.poolRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIpamPoolId = request.sourceIpamPoolId;
            this.tags = request.tags;
        } 

        /**
         * <p>The IDs of IPAM pools. Valid values of N: 1 to 100. A maximum of 100 IPAM pools can be queried at a time.</p>
         */
        public Builder ipamPoolIds(java.util.List<String> ipamPoolIds) {
            this.putQueryParameter("IpamPoolIds", ipamPoolIds);
            this.ipamPoolIds = ipamPoolIds;
            return this;
        }

        /**
         * <p>The name of the IPAM pool. You can enter at most 20 names.</p>
         * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipamPoolName(String ipamPoolName) {
            this.putQueryParameter("IpamPoolName", ipamPoolName);
            this.ipamPoolName = ipamPoolName;
            return this;
        }

        /**
         * <p>The ID of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        public Builder ipamScopeId(String ipamScopeId) {
            this.putQueryParameter("IpamScopeId", ipamScopeId);
            this.ipamScopeId = ipamScopeId;
            return this;
        }

        /**
         * <p>Whether it is a shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isShared(Boolean isShared) {
            this.putQueryParameter("IsShared", isShared);
            this.isShared = isShared;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If NextToken is empty, no next page exists.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
         * <p>The effective region of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder poolRegionId(String poolRegionId) {
            this.putQueryParameter("PoolRegionId", poolRegionId);
            this.poolRegionId = poolRegionId;
            return this;
        }

        /**
         * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the IPAM pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2sermdd6****</p>
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
         * <p>The ID of the source IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-lfnwi4jok1ss0g****</p>
         */
        public Builder sourceIpamPoolId(String sourceIpamPoolId) {
            this.putQueryParameter("SourceIpamPoolId", sourceIpamPoolId);
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }

        /**
         * <p>The tag information.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListIpamPoolsRequest build() {
            return new ListIpamPoolsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamPoolsRequest} extends {@link TeaModel}
     *
     * <p>ListIpamPoolsRequest</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. You can specify at most 20 tag keys. It cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The tag key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can specify at most 20 tag values. It can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It must start with a letter and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
