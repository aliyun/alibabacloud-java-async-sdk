// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticDailyPlanRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticDailyPlanRequest</p>
 */
public class DescribeElasticDailyPlanRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticDailyPlanDay")
    private String elasticDailyPlanDay;

    @Query
    @NameInMap("ElasticDailyPlanStatusList")
    private String elasticDailyPlanStatusList;

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

    private DescribeElasticDailyPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticDailyPlanDay = builder.elasticDailyPlanDay;
        this.elasticDailyPlanStatusList = builder.elasticDailyPlanStatusList;
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

    public static DescribeElasticDailyPlanRequest create() {
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
     * @return elasticDailyPlanDay
     */
    public String getElasticDailyPlanDay() {
        return this.elasticDailyPlanDay;
    }

    /**
     * @return elasticDailyPlanStatusList
     */
    public String getElasticDailyPlanStatusList() {
        return this.elasticDailyPlanStatusList;
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

    public static final class Builder extends Request.Builder<DescribeElasticDailyPlanRequest, Builder> {
        private String DBClusterId; 
        private String elasticDailyPlanDay; 
        private String elasticDailyPlanStatusList; 
        private String elasticPlanName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticDailyPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticDailyPlanDay = request.elasticDailyPlanDay;
            this.elasticDailyPlanStatusList = request.elasticDailyPlanStatusList;
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
         * ElasticDailyPlanDay.
         */
        public Builder elasticDailyPlanDay(String elasticDailyPlanDay) {
            this.putQueryParameter("ElasticDailyPlanDay", elasticDailyPlanDay);
            this.elasticDailyPlanDay = elasticDailyPlanDay;
            return this;
        }

        /**
         * ElasticDailyPlanStatusList.
         */
        public Builder elasticDailyPlanStatusList(String elasticDailyPlanStatusList) {
            this.putQueryParameter("ElasticDailyPlanStatusList", elasticDailyPlanStatusList);
            this.elasticDailyPlanStatusList = elasticDailyPlanStatusList;
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
        public DescribeElasticDailyPlanRequest build() {
            return new DescribeElasticDailyPlanRequest(this);
        } 

    } 

}
