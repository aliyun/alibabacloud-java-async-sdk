// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateCapacityReservationRequest</p>
 */
public class CreateCapacityReservationRequest extends Request {
    @Query
    @NameInMap("CapacityReservationName")
    private String capacityReservationName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndDateType")
    @Validation(required = true)
    private String endDateType;

    @Query
    @NameInMap("InstanceCount")
    @Validation(required = true)
    private String instanceCount;

    @Query
    @NameInMap("InstanceMatchCriteria")
    @Validation(required = true)
    private String instanceMatchCriteria;

    @Query
    @NameInMap("InstancePlatform")
    @Validation(required = true)
    private String instancePlatform;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TimeSlot")
    private String timeSlot;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateCapacityReservationRequest(Builder builder) {
        super(builder);
        this.capacityReservationName = builder.capacityReservationName;
        this.description = builder.description;
        this.endDateType = builder.endDateType;
        this.instanceCount = builder.instanceCount;
        this.instanceMatchCriteria = builder.instanceMatchCriteria;
        this.instancePlatform = builder.instancePlatform;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.timeSlot = builder.timeSlot;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityReservationName
     */
    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDateType
     */
    public String getEndDateType() {
        return this.endDateType;
    }

    /**
     * @return instanceCount
     */
    public String getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceMatchCriteria
     */
    public String getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }

    /**
     * @return instancePlatform
     */
    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timeSlot
     */
    public String getTimeSlot() {
        return this.timeSlot;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateCapacityReservationRequest, Builder> {
        private String capacityReservationName; 
        private String description; 
        private String endDateType; 
        private String instanceCount; 
        private String instanceMatchCriteria; 
        private String instancePlatform; 
        private String instanceType; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String timeSlot; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCapacityReservationRequest response) {
            super(response);
            this.capacityReservationName = response.capacityReservationName;
            this.description = response.description;
            this.endDateType = response.endDateType;
            this.instanceCount = response.instanceCount;
            this.instanceMatchCriteria = response.instanceMatchCriteria;
            this.instancePlatform = response.instancePlatform;
            this.instanceType = response.instanceType;
            this.networkType = response.networkType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.timeSlot = response.timeSlot;
            this.zoneId = response.zoneId;
        } 

        /**
         * CapacityReservationName.
         */
        public Builder capacityReservationName(String capacityReservationName) {
            this.putQueryParameter("CapacityReservationName", capacityReservationName);
            this.capacityReservationName = capacityReservationName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndDateType.
         */
        public Builder endDateType(String endDateType) {
            this.putQueryParameter("EndDateType", endDateType);
            this.endDateType = endDateType;
            return this;
        }

        /**
         * InstanceCount.
         */
        public Builder instanceCount(String instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * InstanceMatchCriteria.
         */
        public Builder instanceMatchCriteria(String instanceMatchCriteria) {
            this.putQueryParameter("InstanceMatchCriteria", instanceMatchCriteria);
            this.instanceMatchCriteria = instanceMatchCriteria;
            return this;
        }

        /**
         * InstancePlatform.
         */
        public Builder instancePlatform(String instancePlatform) {
            this.putQueryParameter("InstancePlatform", instancePlatform);
            this.instancePlatform = instancePlatform;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TimeSlot.
         */
        public Builder timeSlot(String timeSlot) {
            this.putQueryParameter("TimeSlot", timeSlot);
            this.timeSlot = timeSlot;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateCapacityReservationRequest build() {
            return new CreateCapacityReservationRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
