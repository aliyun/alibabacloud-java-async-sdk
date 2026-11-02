// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListNatIpCidrsRequest} extends {@link RequestModel}
 *
 * <p>ListNatIpCidrsRequest</p>
 */
public class ListNatIpCidrsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpCidr")
    private String natIpCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpCidrName")
    private java.util.List<String> natIpCidrName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpCidrStatus")
    private String natIpCidrStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpCidrs")
    private java.util.List<String> natIpCidrs;

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
    public java.util.List<String> getNatIpCidrName() {
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
    public java.util.List<String> getNatIpCidrs() {
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
        private java.util.List<String> natIpCidrName; 
        private String natIpCidrStatus; 
        private java.util.List<String> natIpCidrs; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListNatIpCidrsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.maxResults = request.maxResults;
            this.natGatewayId = request.natGatewayId;
            this.natIpCidr = request.natIpCidr;
            this.natIpCidrName = request.natIpCidrName;
            this.natIpCidrStatus = request.natIpCidrStatus;
            this.natIpCidrs = request.natIpCidrs;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without querying the NAT CIDR blocks. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the check, the corresponding error is returned. If the request passes the check, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong>: sends a normal request. This is the default value. If the request passes the check, an HTTP 2xx status code is returned and the NAT CIDR blocks are queried.</p>
         * </li>
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
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The instance ID of the VPC NAT gateway for which you want to query NAT CIDR blocks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The NAT CIDR block that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder natIpCidr(String natIpCidr) {
            this.putQueryParameter("NatIpCidr", natIpCidr);
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * <p>The name of the NAT CIDR block that you want to query. <strong>N</strong> ranges from <strong>1</strong> to <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder natIpCidrName(java.util.List<String> natIpCidrName) {
            this.putQueryParameter("NatIpCidrName", natIpCidrName);
            this.natIpCidrName = natIpCidrName;
            return this;
        }

        /**
         * <p>The status of the NAT CIDR block that you want to query. Valid values: <strong>Available</strong>, which indicates that the NAT CIDR block is active.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder natIpCidrStatus(String natIpCidrStatus) {
            this.putQueryParameter("NatIpCidrStatus", natIpCidrStatus);
            this.natIpCidrStatus = natIpCidrStatus;
            return this;
        }

        /**
         * <p>The NAT CIDR block that you want to query. <strong>N</strong> ranges from <strong>1</strong> to <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder natIpCidrs(java.util.List<String> natIpCidrs) {
            this.putQueryParameter("NatIpCidrs", natIpCidrs);
            this.natIpCidrs = natIpCidrs;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
         * <li>If a next query is to be sent, set the value to the NextToken value that is returned from the last API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
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
         * <p>The region ID of the VPC NAT gateway to which the NAT CIDR blocks belong. You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eu-central-1</p>
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
