// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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

        private Builder(DescribeInstanceTypeFamiliesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.generation = response.generation;
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
         * Instance dimension family series information. For more details, see [instance dimension family](~~ 25378 ~~). Valid values:
         * <p>
         * 
         * -ecs-1: Series I instance dimension, online time earlier, value for money.
         * 
         * -ecs-2: Series II instance dimension family, second hardware and software upgrades, instance performance enhancements.
         * 
         * -ecs-3: Series III instance dimension family, instance excellent performance, can carry different business needs.
         * 
         * -ecs-4: Series IV instance dimension family, contains common enterprise-class instance dimension (g5, c5, r5, etc.), elastic bare metal server instance dimension (ebmc5s, ebmg5s, ebmr5s, etc.), burst performance instance dimension (t5), etc., has powerful scene adaptability, can carry massive popular business needs, lower latency.
         * 
         * -ecs-5: Series V instance dimension family, contains common enterprise-class instance dimension (g6, c6, r6, etc.), elastic bare metal server instance dimension (ebmg6, ebmg6e, ebmc6, etc.), storage enhanced instance dimension (g6e), etc., response faster, performance more superior.
         * 
         * -ecs-6: Series VI instance dimension family, with enterprise-wide instance dimension (hfc7, hfg7, hfr7, etc.), elastic bare metal server instance dimension (ebmhfg7, etc.), the series instance dimension family is invited to test.
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
