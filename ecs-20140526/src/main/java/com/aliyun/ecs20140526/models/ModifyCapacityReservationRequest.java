// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>ModifyCapacityReservationRequest</p>
 */
public class ModifyCapacityReservationRequest extends Request {
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTimeType")
    private String endTimeType;

    private ModifyCapacityReservationRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.platform = builder.platform;
        this.instanceAmount = builder.instanceAmount;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.endTimeType = builder.endTimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCapacityReservationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTimeType
     */
    public String getEndTimeType() {
        return this.endTimeType;
    }

    public static final class Builder extends Request.Builder<ModifyCapacityReservationRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String description; 
        private String regionId; 
        private String platform; 
        private Integer instanceAmount; 
        private String endTime; 
        private String startTime; 
        private String endTimeType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCapacityReservationRequest response) {
            super(response);
            this.privatePoolOptions = response.privatePoolOptions;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.description = response.description;
            this.regionId = response.regionId;
            this.platform = response.platform;
            this.instanceAmount = response.instanceAmount;
            this.endTime = response.endTime;
            this.startTime = response.startTime;
            this.endTimeType = response.endTimeType;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The description of the capacity reservation service. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the region to which the capacity reservation service belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The operating system type of the image used by the instance. Valid values:
         * <p>
         * 
         * -Windows:Windows Server-type operating system.
         * -Linux:Linux and Unix-like operating systems.
         * 
         * > This parameter is not available.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * Capacity reservation service need Reserved Instance total quantity. Value range: using number of instances of the ~ 1000
         * <p>
         * 
         * > expansion Instance total number when May inventory insufficient expansion failed.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * Capacity reservation service failure time, only "endtimetype = limited" when the parameter entered into force. Time format with ISO8601 for standard, and need to use UTC +0 time in the format "yyyy-MM-ddTHH:mm: ssz ". For more information, see [ISO8601](~~ 25696 ~~).
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Capacity reservation service entry into force of the way. Currently supports only set to take effect immediately, and the parameter without value.
         * <p>
         * 
         * > the parameter does not value indicates that is set to take effect immediately.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Capacity reservation service failure. Valid values:
         * <p>
         * 
         * -Limited: specify time release. Must also be specified "endtime" parameters.
         * -Unlimited: manual release. No time limit.
         */
        public Builder endTimeType(String endTimeType) {
            this.putQueryParameter("EndTimeType", endTimeType);
            this.endTimeType = endTimeType;
            return this;
        }

        @Override
        public ModifyCapacityReservationRequest build() {
            return new ModifyCapacityReservationRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * The ID of the subscription service.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Capacity scheduled the name of the service. The description must be 2 to 128 characters in length. Must be in capital lowercase letters or Chinese beginning, can"t to http:// and https:// beginning. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
}
