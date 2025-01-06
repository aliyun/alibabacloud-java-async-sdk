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
 * {@link CreateTransitRouterPrefixListAssociationRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterPrefixListAssociationRequest</p>
 */
public class CreateTransitRouterPrefixListAssociationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHop")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    private Long ownerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefixListId;

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
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterTableId;

    private CreateTransitRouterPrefixListAssociationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.nextHop = builder.nextHop;
        this.nextHopType = builder.nextHopType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.ownerUid = builder.ownerUid;
        this.prefixListId = builder.prefixListId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterTableId = builder.transitRouterTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPrefixListAssociationRequest create() {
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
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
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
     * @return ownerUid
     */
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterTableId
     */
    public String getTransitRouterTableId() {
        return this.transitRouterTableId;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterPrefixListAssociationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String nextHop; 
        private String nextHopType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long ownerUid; 
        private String prefixListId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterId; 
        private String transitRouterTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterPrefixListAssociationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.nextHop = request.nextHop;
            this.nextHopType = request.nextHopType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.ownerUid = request.ownerUid;
            this.prefixListId = request.prefixListId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterTableId = request.transitRouterTableId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-4266****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not in use.</p>
         * </blockquote>
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
         * <p>The ID of the next hop connection.</p>
         * <p>To specify all CIDR blocks in the prefix list as blackhole routes, set this parameter to <strong>BlackHole</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-flbq507rg2ckrj****</p>
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <ul>
         * <li><strong>BlackHole</strong>: specifies that all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.</li>
         * <li><strong>VPC</strong>: specifies a virtual private cloud (VPC) connection as the next hop.</li>
         * <li><strong>VBR</strong>: specifies a virtual border router (VBR) connection as the next hop.</li>
         * <li><strong>TR</strong>: specifies an inter-region connection as the next hop.</li>
         * <li><strong>ECR</strong>: specifies an Express Connect Router (ECR) connection as the next hop.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
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
         * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * <p>The ID of the prefix list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-6ehtn5kqxgeyy08fi****</p>
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * <p>The ID of the region where the transit router is deployed.</p>
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
         * <p>The ID of the transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-6ehx7q2jze8ch5ji0****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The ID of the route table of the transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-6ehgc262hr170qgyc****</p>
         */
        public Builder transitRouterTableId(String transitRouterTableId) {
            this.putQueryParameter("TransitRouterTableId", transitRouterTableId);
            this.transitRouterTableId = transitRouterTableId;
            return this;
        }

        @Override
        public CreateTransitRouterPrefixListAssociationRequest build() {
            return new CreateTransitRouterPrefixListAssociationRequest(this);
        } 

    } 

}
