// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTransitRouterCidrAllocationRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterCidrAllocationRequest</p>
 */
public class ListTransitRouterCidrAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentId")
    private String attachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentName")
    private String attachmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedOwnerId")
    private String dedicatedOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 5)
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterCidrId")
    private String transitRouterCidrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-2nalp6yksc805w****</p>
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * <p>The name of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder attachmentName(String attachmentName) {
            this.putQueryParameter("AttachmentName", attachmentName);
            this.attachmentName = attachmentName;
            return this;
        }

        /**
         * <p>The CIDR block of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The CIDR blocks that have IP addresses allocated to network instances.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/28</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The CIDR block that is for exclusive use.</p>
         * <p>Set the value to <strong>VPN</strong>, which specifies the CIDR block that is reserved for VPN connections.</p>
         * 
         * <strong>example:</strong>
         * <p>VPN</p>
         */
        public Builder dedicatedOwnerId(String dedicatedOwnerId) {
            this.putQueryParameter("DedicatedOwnerId", dedicatedOwnerId);
            this.dedicatedOwnerId = dedicatedOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li><p>If you do not specify a value for <strong>MaxResults</strong>, entries are returned in one response. After you send the request, the value of <strong>MaxResults</strong> includes all entries.</p>
         * </li>
         * <li><p>If you specify a value for <strong>MaxResults</strong>, entries are returned in batches. Valid values: <strong>1</strong> to <strong>100</strong>. We recommend that you set <strong>MaxResults</strong> to <strong>20</strong>.</p>
         * <p>The value of <strong>MaxResults</strong> in the response indicates that number of entries in the current batch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no subsequent query is to be sent, ignore this parameter.</li>
         * <li>If a subsequent query is to be sent, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
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
         * <p>The region ID of the transit router.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the CIDR block.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/462772.html">ListTransitRouterCidr</a> operation to query the ID of a CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr-0zv0q9crqpntzz****</p>
         */
        public Builder transitRouterCidrId(String transitRouterCidrId) {
            this.putQueryParameter("TransitRouterCidrId", transitRouterCidrId);
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0w3x8c9em72a40nw****</p>
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
