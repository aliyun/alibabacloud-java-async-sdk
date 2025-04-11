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
 * {@link ResolveAndRouteServiceInCenRequest} extends {@link RequestModel}
 *
 * <p>ResolveAndRouteServiceInCenRequest</p>
 */
public class ResolveAndRouteServiceInCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessRegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> accessRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ResolveAndRouteServiceInCenRequest(Builder builder) {
        super(builder);
        this.accessRegionIds = builder.accessRegionIds;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.host = builder.host;
        this.hostRegionId = builder.hostRegionId;
        this.hostVpcId = builder.hostVpcId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResolveAndRouteServiceInCenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessRegionIds
     */
    public java.util.List<String> getAccessRegionIds() {
        return this.accessRegionIds;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return hostRegionId
     */
    public String getHostRegionId() {
        return this.hostRegionId;
    }

    /**
     * @return hostVpcId
     */
    public String getHostVpcId() {
        return this.hostVpcId;
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

    public static final class Builder extends Request.Builder<ResolveAndRouteServiceInCenRequest, Builder> {
        private java.util.List<String> accessRegionIds; 
        private String cenId; 
        private String clientToken; 
        private String description; 
        private String host; 
        private String hostRegionId; 
        private String hostVpcId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ResolveAndRouteServiceInCenRequest request) {
            super(request);
            this.accessRegionIds = request.accessRegionIds;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.host = request.host;
            this.hostRegionId = request.hostRegionId;
            this.hostVpcId = request.hostVpcId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The IDs of the regions where the cloud service is accessed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder accessRegionIds(java.util.List<String> accessRegionIds) {
            this.putQueryParameter("AccessRegionIds", accessRegionIds);
            this.accessRegionIds = accessRegionIds;
            return this;
        }

        /**
         * <p>The ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ckwa2hhmuislse****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the cloud service.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>descname</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IP addresses or CIDR blocks of the cloud service.</p>
         * <blockquote>
         * <p>In most cases, multiple IP addresses or CIDR blocks are assigned to a cloud service. We recommend that you call this operation multiple times to add all IP addresses and CIDR blocks of the cloud service.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100.118.28.0/24</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The ID of the region in which the cloud service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder hostRegionId(String hostRegionId) {
            this.putQueryParameter("HostRegionId", hostRegionId);
            this.hostRegionId = hostRegionId;
            return this;
        }

        /**
         * <p>The ID of the VPC that is associated with the cloud service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-o6woh5s494zueq40v****</p>
         */
        public Builder hostVpcId(String hostVpcId) {
            this.putQueryParameter("HostVpcId", hostVpcId);
            this.hostVpcId = hostVpcId;
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
        public ResolveAndRouteServiceInCenRequest build() {
            return new ResolveAndRouteServiceInCenRequest(this);
        } 

    } 

}
