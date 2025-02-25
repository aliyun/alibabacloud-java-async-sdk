// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHistoryEventsStatRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryEventsStatRequest</p>
 */
public class DescribeHistoryEventsStatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveStatus")
    private String archiveStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromStartTime")
    private String fromStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToStartTime")
    private String toStartTime;

    private DescribeHistoryEventsStatRequest(Builder builder) {
        super(builder);
        this.archiveStatus = builder.archiveStatus;
        this.fromStartTime = builder.fromStartTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.toStartTime = builder.toStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsStatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archiveStatus
     */
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    /**
     * @return fromStartTime
     */
    public String getFromStartTime() {
        return this.fromStartTime;
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return toStartTime
     */
    public String getToStartTime() {
        return this.toStartTime;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryEventsStatRequest, Builder> {
        private String archiveStatus; 
        private String fromStartTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String toStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryEventsStatRequest request) {
            super(request);
            this.archiveStatus = request.archiveStatus;
            this.fromStartTime = request.fromStartTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * ArchiveStatus.
         */
        public Builder archiveStatus(String archiveStatus) {
            this.putQueryParameter("ArchiveStatus", archiveStatus);
            this.archiveStatus = archiveStatus;
            return this;
        }

        /**
         * FromStartTime.
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
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
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ToStartTime.
         */
        public Builder toStartTime(String toStartTime) {
            this.putQueryParameter("ToStartTime", toStartTime);
            this.toStartTime = toStartTime;
            return this;
        }

        @Override
        public DescribeHistoryEventsStatRequest build() {
            return new DescribeHistoryEventsStatRequest(this);
        } 

    } 

}
