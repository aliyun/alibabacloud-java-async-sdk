// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypeFamiliesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypeFamiliesRequest</p>
 */
public class DescribeInstanceTypeFamiliesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Generation")
    private String generation;

    private DescribeInstanceTypeFamiliesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.generation = builder.generation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeFamiliesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return generation
     */
    public String getGeneration() {
        return this.generation;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceTypeFamiliesRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String generation; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypeFamiliesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.generation = request.generation;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The logon name of the RAM user.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The series information of the instance type family. For more information, see [instance type family](~~ 25378 ~~). Valid values:
         * <p>
         * 
         * -ecs-1: the type of the series I instance. The instance is released earlier and cost-effective.
         * 
         * -ecs-2: The Second software and hardware upgrade of the instance type family of Series II improves the performance of the instance.
         * 
         * -ecs-3: the instance type family of Series III. The instance has excellent performance and can meet different business requirements.
         * 
         * -ecs-4: Series IV instance families, including common enterprise-level instance types (g5, c5, r5, etc.), ECS bare metal instance types (ebmc5s, ebmg5s, ebmr5s, etc.), Burstable instance types (t5), and so on. This family has strong scenario adaptability and can meet a large number of popular business requirements with lower latency.
         * 
         * -ecs-5: a series of V instance families, including common enterprise-level instance types (g6, c6, and r6), ECS bare metal instance types (ebmg6, ebmg6e, and ebmc6), and storage-enhanced instance types (g6e). These types provide faster response and better performance.
         * 
         * -ecs-6: the VI instance type family, including enterprise-level instance types (hfc7, hfg7, and hfr7) and ebmhfg7 instance types (ebmhfg7).
         */
        public Builder generation(String generation) {
            this.putQueryParameter("Generation", generation);
            this.generation = generation;
            return this;
        }

        @Override
        public DescribeInstanceTypeFamiliesRequest build() {
            return new DescribeInstanceTypeFamiliesRequest(this);
        } 

    } 

}
