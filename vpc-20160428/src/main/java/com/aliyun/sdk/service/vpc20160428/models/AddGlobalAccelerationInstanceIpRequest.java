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
 * {@link AddGlobalAccelerationInstanceIpRequest} extends {@link RequestModel}
 *
 * <p>AddGlobalAccelerationInstanceIpRequest</p>
 */
public class AddGlobalAccelerationInstanceIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalAccelerationInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipInstanceId;

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

    private AddGlobalAccelerationInstanceIpRequest(Builder builder) {
        super(builder);
        this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
        this.ipInstanceId = builder.ipInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGlobalAccelerationInstanceIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalAccelerationInstanceId
     */
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    /**
     * @return ipInstanceId
     */
    public String getIpInstanceId() {
        return this.ipInstanceId;
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

    public static final class Builder extends Request.Builder<AddGlobalAccelerationInstanceIpRequest, Builder> {
        private String globalAccelerationInstanceId; 
        private String ipInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddGlobalAccelerationInstanceIpRequest request) {
            super(request);
            this.globalAccelerationInstanceId = request.globalAccelerationInstanceId;
            this.ipInstanceId = request.ipInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the shared-bandwidth GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-Ldefrgbttnyyf****</p>
         */
        public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }

        /**
         * <p>The EIP ID. You can call the <a href="https://help.aliyun.com/document_detail/36018.html">DescribeEipAddresses</a> operation to query EIP IDs.</p>
         * <blockquote>
         * <p> Make sure that the billing method of the EIP is pay-as-you-go, and the EIP and the shared-bandwidth GA instance belong to the same region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-rw434rwfdeaf****</p>
         */
        public Builder ipInstanceId(String ipInstanceId) {
            this.putQueryParameter("IpInstanceId", ipInstanceId);
            this.ipInstanceId = ipInstanceId;
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
         * <p>The region of the shared-bandwidth GA instance.</p>
         * <p>You can call the <strong>DescribeRegions</strong> operation to query the most recent region list.</p>
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

        @Override
        public AddGlobalAccelerationInstanceIpRequest build() {
            return new AddGlobalAccelerationInstanceIpRequest(this);
        } 

    } 

}
