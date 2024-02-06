// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticPlanRequest</p>
 */
public class ModifyElasticPlanRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ElasticPlanEnable")
    private Boolean elasticPlanEnable;

    @Query
    @NameInMap("ElasticPlanEndDay")
    private String elasticPlanEndDay;

    @Query
    @NameInMap("ElasticPlanMonthlyRepeat")
    private String elasticPlanMonthlyRepeat;

    @Query
    @NameInMap("ElasticPlanName")
    @Validation(required = true)
    private String elasticPlanName;

    @Query
    @NameInMap("ElasticPlanNodeNum")
    @Validation(maximum = 10000)
    private Integer elasticPlanNodeNum;

    @Query
    @NameInMap("ElasticPlanStartDay")
    private String elasticPlanStartDay;

    @Query
    @NameInMap("ElasticPlanTimeEnd")
    private String elasticPlanTimeEnd;

    @Query
    @NameInMap("ElasticPlanTimeStart")
    private String elasticPlanTimeStart;

    @Query
    @NameInMap("ElasticPlanType")
    private String elasticPlanType;

    @Query
    @NameInMap("ElasticPlanWeeklyRepeat")
    private String elasticPlanWeeklyRepeat;

    @Query
    @NameInMap("ElasticPlanWorkerSpec")
    private String elasticPlanWorkerSpec;

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

    private ModifyElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanEnable = builder.elasticPlanEnable;
        this.elasticPlanEndDay = builder.elasticPlanEndDay;
        this.elasticPlanMonthlyRepeat = builder.elasticPlanMonthlyRepeat;
        this.elasticPlanName = builder.elasticPlanName;
        this.elasticPlanNodeNum = builder.elasticPlanNodeNum;
        this.elasticPlanStartDay = builder.elasticPlanStartDay;
        this.elasticPlanTimeEnd = builder.elasticPlanTimeEnd;
        this.elasticPlanTimeStart = builder.elasticPlanTimeStart;
        this.elasticPlanType = builder.elasticPlanType;
        this.elasticPlanWeeklyRepeat = builder.elasticPlanWeeklyRepeat;
        this.elasticPlanWorkerSpec = builder.elasticPlanWorkerSpec;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolName = builder.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticPlanRequest create() {
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
     * @return elasticPlanEndDay
     */
    public String getElasticPlanEndDay() {
        return this.elasticPlanEndDay;
    }

    /**
     * @return elasticPlanMonthlyRepeat
     */
    public String getElasticPlanMonthlyRepeat() {
        return this.elasticPlanMonthlyRepeat;
    }

    /**
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    /**
     * @return elasticPlanNodeNum
     */
    public Integer getElasticPlanNodeNum() {
        return this.elasticPlanNodeNum;
    }

    /**
     * @return elasticPlanStartDay
     */
    public String getElasticPlanStartDay() {
        return this.elasticPlanStartDay;
    }

    /**
     * @return elasticPlanTimeEnd
     */
    public String getElasticPlanTimeEnd() {
        return this.elasticPlanTimeEnd;
    }

    /**
     * @return elasticPlanTimeStart
     */
    public String getElasticPlanTimeStart() {
        return this.elasticPlanTimeStart;
    }

    /**
     * @return elasticPlanType
     */
    public String getElasticPlanType() {
        return this.elasticPlanType;
    }

    /**
     * @return elasticPlanWeeklyRepeat
     */
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
    }

    /**
     * @return elasticPlanWorkerSpec
     */
    public String getElasticPlanWorkerSpec() {
        return this.elasticPlanWorkerSpec;
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

    public static final class Builder extends Request.Builder<ModifyElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private Boolean elasticPlanEnable; 
        private String elasticPlanEndDay; 
        private String elasticPlanMonthlyRepeat; 
        private String elasticPlanName; 
        private Integer elasticPlanNodeNum; 
        private String elasticPlanStartDay; 
        private String elasticPlanTimeEnd; 
        private String elasticPlanTimeStart; 
        private String elasticPlanType; 
        private String elasticPlanWeeklyRepeat; 
        private String elasticPlanWorkerSpec; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanEnable = request.elasticPlanEnable;
            this.elasticPlanEndDay = request.elasticPlanEndDay;
            this.elasticPlanMonthlyRepeat = request.elasticPlanMonthlyRepeat;
            this.elasticPlanName = request.elasticPlanName;
            this.elasticPlanNodeNum = request.elasticPlanNodeNum;
            this.elasticPlanStartDay = request.elasticPlanStartDay;
            this.elasticPlanTimeEnd = request.elasticPlanTimeEnd;
            this.elasticPlanTimeStart = request.elasticPlanTimeStart;
            this.elasticPlanType = request.elasticPlanType;
            this.elasticPlanWeeklyRepeat = request.elasticPlanWeeklyRepeat;
            this.elasticPlanWorkerSpec = request.elasticPlanWorkerSpec;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolName = request.resourcePoolName;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Specifies whether the scaling plan takes effect. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
         */
        public Builder elasticPlanEnable(Boolean elasticPlanEnable) {
            this.putQueryParameter("ElasticPlanEnable", elasticPlanEnable);
            this.elasticPlanEnable = elasticPlanEnable;
            return this;
        }

        /**
         * The end date of the scaling plan. Specify the date in the yyyy-MM-dd format.
         */
        public Builder elasticPlanEndDay(String elasticPlanEndDay) {
            this.putQueryParameter("ElasticPlanEndDay", elasticPlanEndDay);
            this.elasticPlanEndDay = elasticPlanEndDay;
            return this;
        }

        /**
         * ElasticPlanMonthlyRepeat.
         */
        public Builder elasticPlanMonthlyRepeat(String elasticPlanMonthlyRepeat) {
            this.putQueryParameter("ElasticPlanMonthlyRepeat", elasticPlanMonthlyRepeat);
            this.elasticPlanMonthlyRepeat = elasticPlanMonthlyRepeat;
            return this;
        }

        /**
         * The name of the scaling plan.
         * <p>
         * 
         * *   The name must be 2 to 30 characters in length.
         * *   The name can contain letters, digits, and underscores (\_).
         * 
         * > You can call the [DescribeElasticPlan](~~190596~~) operation to query the information about all scaling plans of a cluster, including the scaling plan names.
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        /**
         * The number of nodes that are involved in the scaling plan.
         * <p>
         * 
         * *   If ElasticPlanType is set to **worker**, you can set this parameter to 0 or leave this parameter empty.
         * *   If ElasticPlanType is set to **executorcombineworker** or **executor**, you must set this parameter to a value that is greater than 0.
         */
        public Builder elasticPlanNodeNum(Integer elasticPlanNodeNum) {
            this.putQueryParameter("ElasticPlanNodeNum", elasticPlanNodeNum);
            this.elasticPlanNodeNum = elasticPlanNodeNum;
            return this;
        }

        /**
         * The start date of the scaling plan. Specify the date in the yyyy-MM-dd format.
         */
        public Builder elasticPlanStartDay(String elasticPlanStartDay) {
            this.putQueryParameter("ElasticPlanStartDay", elasticPlanStartDay);
            this.elasticPlanStartDay = elasticPlanStartDay;
            return this;
        }

        /**
         * The restoration time of the scaling plan. Specify the time on the hour in the HH:mm:ss format. The interval between the scale-up time and the restoration time cannot be more than 24 hours.
         */
        public Builder elasticPlanTimeEnd(String elasticPlanTimeEnd) {
            this.putQueryParameter("ElasticPlanTimeEnd", elasticPlanTimeEnd);
            this.elasticPlanTimeEnd = elasticPlanTimeEnd;
            return this;
        }

        /**
         * The scale-up time of the scaling plan. Specify the time on the hour in the HH:mm:ss format.
         */
        public Builder elasticPlanTimeStart(String elasticPlanTimeStart) {
            this.putQueryParameter("ElasticPlanTimeStart", elasticPlanTimeStart);
            this.elasticPlanTimeStart = elasticPlanTimeStart;
            return this;
        }

        /**
         * The type of the scaling plan. Valid values:
         * <p>
         * 
         * *   **worker**: scales only elastic I/O resources.
         * *   **executor**: scales only computing resources.
         * *   **executorcombineworker** (default): scales both elastic I/O resources and computing resources by proportion.
         * 
         * > 
         * 
         * *   If you want to set this parameter to **executorcombineworker**, make sure that the cluster runs a minor version of 3.1.3.2 or later.
         * 
         * *   If you want to set this parameter to **worker** or **executor**, make sure that the cluster runs a minor version of 3.1.6.1 or later and a ticket is submitted. After your request is approved, you can set this parameter to **worker** or **executor**.
         */
        public Builder elasticPlanType(String elasticPlanType) {
            this.putQueryParameter("ElasticPlanType", elasticPlanType);
            this.elasticPlanType = elasticPlanType;
            return this;
        }

        /**
         * The days of the week when you want to execute the scaling plan. Valid values: 0 to 6, which indicate Sunday to Saturday. Separate multiple values with commas (,).
         */
        public Builder elasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
            this.putQueryParameter("ElasticPlanWeeklyRepeat", elasticPlanWeeklyRepeat);
            this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
            return this;
        }

        /**
         * The resource specifications that can be scaled up by the scaling plan. Valid values:
         * <p>
         * 
         * *   8 Core 64 GB (default)
         * *   16 Core 64 GB
         * *   32 Core 64 GB
         * *   64 Core 128 GB
         * *   12 Core 96 GB
         * *   24 Core 96 GB
         * *   52 Core 86 GB
         */
        public Builder elasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
            this.putQueryParameter("ElasticPlanWorkerSpec", elasticPlanWorkerSpec);
            this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
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
         * The name of the resource group.
         * <p>
         * 
         * > You can call the [DescribeDBResourceGroup](~~466685~~) operation to query the resource group name.
         */
        public Builder resourcePoolName(String resourcePoolName) {
            this.putQueryParameter("ResourcePoolName", resourcePoolName);
            this.resourcePoolName = resourcePoolName;
            return this;
        }

        @Override
        public ModifyElasticPlanRequest build() {
            return new ModifyElasticPlanRequest(this);
        } 

    } 

}
