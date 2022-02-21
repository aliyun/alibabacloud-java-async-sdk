// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticPlanRequest</p>
 */
public class CreateElasticPlanRequest extends Request {
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
    @NameInMap("ElasticPlanName")
    @Validation(required = true)
    private String elasticPlanName;

    @Query
    @NameInMap("ElasticPlanNodeNum")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer elasticPlanNodeNum;

    @Query
    @NameInMap("ElasticPlanStartDay")
    private String elasticPlanStartDay;

    @Query
    @NameInMap("ElasticPlanTimeEnd")
    @Validation(required = true)
    private String elasticPlanTimeEnd;

    @Query
    @NameInMap("ElasticPlanTimeStart")
    @Validation(required = true)
    private String elasticPlanTimeStart;

    @Query
    @NameInMap("ElasticPlanWeeklyRepeat")
    @Validation(required = true)
    private String elasticPlanWeeklyRepeat;

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
    @Validation(required = true)
    private String resourcePoolName;

    private CreateElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanEnable = builder.elasticPlanEnable;
        this.elasticPlanEndDay = builder.elasticPlanEndDay;
        this.elasticPlanName = builder.elasticPlanName;
        this.elasticPlanNodeNum = builder.elasticPlanNodeNum;
        this.elasticPlanStartDay = builder.elasticPlanStartDay;
        this.elasticPlanTimeEnd = builder.elasticPlanTimeEnd;
        this.elasticPlanTimeStart = builder.elasticPlanTimeStart;
        this.elasticPlanWeeklyRepeat = builder.elasticPlanWeeklyRepeat;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolName = builder.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticPlanRequest create() {
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
     * @return elasticPlanWeeklyRepeat
     */
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
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

    public static final class Builder extends Request.Builder<CreateElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private Boolean elasticPlanEnable; 
        private String elasticPlanEndDay; 
        private String elasticPlanName; 
        private Integer elasticPlanNodeNum; 
        private String elasticPlanStartDay; 
        private String elasticPlanTimeEnd; 
        private String elasticPlanTimeStart; 
        private String elasticPlanWeeklyRepeat; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticPlanRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.elasticPlanEnable = response.elasticPlanEnable;
            this.elasticPlanEndDay = response.elasticPlanEndDay;
            this.elasticPlanName = response.elasticPlanName;
            this.elasticPlanNodeNum = response.elasticPlanNodeNum;
            this.elasticPlanStartDay = response.elasticPlanStartDay;
            this.elasticPlanTimeEnd = response.elasticPlanTimeEnd;
            this.elasticPlanTimeStart = response.elasticPlanTimeStart;
            this.elasticPlanWeeklyRepeat = response.elasticPlanWeeklyRepeat;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourcePoolName = response.resourcePoolName;
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
         * ElasticPlanEndDay.
         */
        public Builder elasticPlanEndDay(String elasticPlanEndDay) {
            this.putQueryParameter("ElasticPlanEndDay", elasticPlanEndDay);
            this.elasticPlanEndDay = elasticPlanEndDay;
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
         * ElasticPlanNodeNum.
         */
        public Builder elasticPlanNodeNum(Integer elasticPlanNodeNum) {
            this.putQueryParameter("ElasticPlanNodeNum", elasticPlanNodeNum);
            this.elasticPlanNodeNum = elasticPlanNodeNum;
            return this;
        }

        /**
         * ElasticPlanStartDay.
         */
        public Builder elasticPlanStartDay(String elasticPlanStartDay) {
            this.putQueryParameter("ElasticPlanStartDay", elasticPlanStartDay);
            this.elasticPlanStartDay = elasticPlanStartDay;
            return this;
        }

        /**
         * ElasticPlanTimeEnd.
         */
        public Builder elasticPlanTimeEnd(String elasticPlanTimeEnd) {
            this.putQueryParameter("ElasticPlanTimeEnd", elasticPlanTimeEnd);
            this.elasticPlanTimeEnd = elasticPlanTimeEnd;
            return this;
        }

        /**
         * ElasticPlanTimeStart.
         */
        public Builder elasticPlanTimeStart(String elasticPlanTimeStart) {
            this.putQueryParameter("ElasticPlanTimeStart", elasticPlanTimeStart);
            this.elasticPlanTimeStart = elasticPlanTimeStart;
            return this;
        }

        /**
         * ElasticPlanWeeklyRepeat.
         */
        public Builder elasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
            this.putQueryParameter("ElasticPlanWeeklyRepeat", elasticPlanWeeklyRepeat);
            this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
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
        public CreateElasticPlanRequest build() {
            return new CreateElasticPlanRequest(this);
        } 

    } 

}
