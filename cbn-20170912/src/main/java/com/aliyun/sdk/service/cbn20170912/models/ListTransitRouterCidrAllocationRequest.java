// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterCidrAllocationRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterCidrAllocationRequest</p>
 */
public class ListTransitRouterCidrAllocationRequest extends Request {
    @Query
    @NameInMap("AttachmentId")
    private String attachmentId;

    @Query
    @NameInMap("AttachmentName")
    private String attachmentName;

    @Query
    @NameInMap("Cidr")
    private String cidr;

    @Query
    @NameInMap("CidrBlock")
    private String cidrBlock;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DedicatedOwnerId")
    private String dedicatedOwnerId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 5)
    private Integer maxResults;

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
    @NameInMap("TransitRouterCidrId")
    private String transitRouterCidrId;

    @Query
    @NameInMap("TransitRouterId")
    @Validation(required = true)
    private String transitRouterId;

    private ListTransitRouterCidrAllocationRequest(Builder builder) {
        super(builder);
        this.attachmentId = builder.attachmentId;
        this.attachmentName = builder.attachmentName;
        this.cidr = builder.cidr;
        this.cidrBlock = builder.cidrBlock;
        this.clientToken = builder.clientToken;
        this.dedicatedOwnerId = builder.dedicatedOwnerId;
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterCidrId = builder.transitRouterCidrId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterCidrAllocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachmentId
     */
    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * @return attachmentName
     */
    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedOwnerId
     */
    public String getDedicatedOwnerId() {
        return this.dedicatedOwnerId;
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
     * @return transitRouterCidrId
     */
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterCidrAllocationRequest, Builder> {
        private String attachmentId; 
        private String attachmentName; 
        private String cidr; 
        private String cidrBlock; 
        private String clientToken; 
        private String dedicatedOwnerId; 
        private Boolean dryRun; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterCidrId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterCidrAllocationRequest request) {
            super(request);
            this.attachmentId = request.attachmentId;
            this.attachmentName = request.attachmentName;
            this.cidr = request.cidr;
            this.cidrBlock = request.cidrBlock;
            this.clientToken = request.clientToken;
            this.dedicatedOwnerId = request.dedicatedOwnerId;
            this.dryRun = request.dryRun;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterCidrId = request.transitRouterCidrId;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * The ID of the network instance connection.
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * The name of the network instance connection.
         */
        public Builder attachmentName(String attachmentName) {
            this.putQueryParameter("AttachmentName", attachmentName);
            this.attachmentName = attachmentName;
            return this;
        }

        /**
         * The CIDR block of the transit router.
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * The CIDR blocks that have IP addresses allocated to network instances.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The CIDR block that is for exclusive use.
         * <p>
         * 
         * Set the value to **VPN**, which specifies the CIDR block that is reserved for VPN connections.
         */
        public Builder dedicatedOwnerId(String dedicatedOwnerId) {
            this.putQueryParameter("DedicatedOwnerId", dedicatedOwnerId);
            this.dedicatedOwnerId = dedicatedOwnerId;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and sends the request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   If you do not set **MaxResults**, it indicates that you do not need to query results in batches. The value of **MaxResults** indicates the total number of entries.
         * 
         * *   If a value is specified for **MaxResults**, it indicates that you need to query results in batches. Valid values: **1** to **100**. We recommend that you set **MaxResults** to **20**.
         * 
         *         The value of **MaxResults** in the response indicates the number of entries in the current batch.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no subsequent query is to be sent, ignore this parameter.
         * *   If a subsequent query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
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
         * The ID of the region where the transit router is deployed.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
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
         * The ID of the CIDR block.
         * <p>
         * 
         * You can call the [ListTransitRouterCidr](~~462772~~) operation to query the ID of a CIDR block.
         */
        public Builder transitRouterCidrId(String transitRouterCidrId) {
            this.putQueryParameter("TransitRouterCidrId", transitRouterCidrId);
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }

        /**
         * The ID of the transit router.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public ListTransitRouterCidrAllocationRequest build() {
            return new ListTransitRouterCidrAllocationRequest(this);
        } 

    } 

}
