// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListPublicIpAddressPoolsRequest</p>
 */
public class ListPublicIpAddressPoolsRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

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
    @NameInMap("PublicIpAddressPoolIds")
    private java.util.List < String > publicIpAddressPoolIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityProtectionEnabled")
    private Boolean securityProtectionEnabled;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ListPublicIpAddressPoolsRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.isp = builder.isp;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.publicIpAddressPoolIds = builder.publicIpAddressPoolIds;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityProtectionEnabled = builder.securityProtectionEnabled;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicIpAddressPoolsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return publicIpAddressPoolIds
     */
    public java.util.List < String > getPublicIpAddressPoolIds() {
        return this.publicIpAddressPoolIds;
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
     * @return securityProtectionEnabled
     */
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListPublicIpAddressPoolsRequest, Builder> {
        private Boolean dryRun; 
        private String isp; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < String > publicIpAddressPoolIds; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean securityProtectionEnabled; 
        private String status; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListPublicIpAddressPoolsRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.isp = request.isp;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.publicIpAddressPoolIds = request.publicIpAddressPoolIds;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityProtectionEnabled = request.securityProtectionEnabled;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * Specifies whether to perform a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The line type. Valid values:
         * <p>
         * 
         * *   **BGP** (default): BGP (Multi-ISP) line
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro line
         * 
         * For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see the "Line types" section of [What is EIP?](~~32321~~)
         * 
         * If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:
         * 
         * *   **ChinaTelecom**
         * *   **ChinaUnicom**
         * *   **ChinaMobile**
         * *   **ChinaTelecom_L2**
         * *   **ChinaUnicom_L2**
         * *   **ChinaMobile_L2**
         * 
         * If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to **BGP_FinanceCloud**.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The maximum number of entries to return. Valid values: **10** to **100**. Default value: **10**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The name of the IP address pool.
         * <p>
         * 
         * If you enter a name, the name must be 1 to 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
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
         * The IDs of the IP address pool.
         * <p>
         * 
         * You can enter up to 100 IDs.
         */
        public Builder publicIpAddressPoolIds(java.util.List < String > publicIpAddressPoolIds) {
            this.putQueryParameter("PublicIpAddressPoolIds", publicIpAddressPoolIds);
            this.publicIpAddressPoolIds = publicIpAddressPoolIds;
            return this;
        }

        /**
         * The ID of the region in which the IP address pool that you want to query resides.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the IP address pool belongs.
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
         * SecurityProtectionEnabled.
         */
        public Builder securityProtectionEnabled(Boolean securityProtectionEnabled) {
            this.putQueryParameter("SecurityProtectionEnabled", securityProtectionEnabled);
            this.securityProtectionEnabled = securityProtectionEnabled;
            return this;
        }

        /**
         * The status of the IP address pool. Valid values:
         * <p>
         * 
         * *   **Created**
         * *   **Deleting**
         * *   **Modifying**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags to add to the resource.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListPublicIpAddressPoolsRequest build() {
            return new ListPublicIpAddressPoolsRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:` and cannot contain `http://` or `https://`.
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
