// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticPlanRequest</p>
 */
public class DescribeElasticPlanRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticPlanEnable")
    private Boolean elasticPlanEnable;

    @Query
    @NameInMap("ElasticPlanName")
    private String elasticPlanName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourcePoolName")
    private String resourcePoolName;

    private DescribeElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanEnable = builder.elasticPlanEnable;
        this.elasticPlanName = builder.elasticPlanName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolName = builder.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return elasticPlanEnable
     */
    public Boolean getElasticPlanEnable() {
        return this.elasticPlanEnable;
    }

    /**
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
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

    /**
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public static final class Builder extends Request.Builder<DescribeElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private Boolean elasticPlanEnable; 
        private String elasticPlanName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanEnable = request.elasticPlanEnable;
            this.elasticPlanName = request.elasticPlanName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolName = request.resourcePoolName;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ElasticPlanEnable.
         */
        public Builder elasticPlanEnable(Boolean elasticPlanEnable) {
            this.putQueryParameter("ElasticPlanEnable", elasticPlanEnable);
            this.elasticPlanEnable = elasticPlanEnable;
            return this;
        }

        /**
         * ElasticPlanName.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
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

        /**
         * ResourcePoolName.
         */
        public Builder resourcePoolName(String resourcePoolName) {
            this.putQueryParameter("ResourcePoolName", resourcePoolName);
            this.resourcePoolName = resourcePoolName;
            return this;
        }

        @Override
        public DescribeElasticPlanRequest build() {
            return new DescribeElasticPlanRequest(this);
        } 

    } 

}
