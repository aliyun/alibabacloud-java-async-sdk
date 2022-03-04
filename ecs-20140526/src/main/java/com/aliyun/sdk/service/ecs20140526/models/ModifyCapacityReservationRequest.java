// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EndTimeType")
    private String endTimeType;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    private ModifyCapacityReservationRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.endTimeType = builder.endTimeType;
        this.platform = builder.platform;
        this.instanceAmount = builder.instanceAmount;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeType
     */
    public String getEndTimeType() {
        return this.endTimeType;
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

    public static final class Builder extends Request.Builder<ModifyCapacityReservationRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String description; 
        private String startTime; 
        private String endTime; 
        private String endTimeType; 
        private String platform; 
        private Integer instanceAmount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCapacityReservationRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.description = request.description;
            this.startTime = request.startTime;
            this.endTime = request.endTime;
            this.endTimeType = request.endTimeType;
            this.platform = request.platform;
            this.instanceAmount = request.instanceAmount;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
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
         * The ID of the region to which the capacity reservation service belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The effective method of the capacity reservation service. You can only set this parameter to take effect immediately.
         * <p>
         * 
         * > If this parameter is not set, it takes effect immediately.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The expiration time of the subscription service. This parameter takes effect only when "EndTimeType = Limited. The time format is ISO 8601 and UTC +0 is required. The format is yyyy-MM-ddTHH:mm:ssZ ". For more information, see [ISO8601](~~ 25696 ~~).
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The expiration method of the capacity reservation service. Valid values:
         * <p>
         * 
         * -Limited: release at the specified time. You must specify the "EndTime" parameter at the same time.
         * -Unlimited: manually released. No time limit.
         */
        public Builder endTimeType(String endTimeType) {
            this.putQueryParameter("EndTimeType", endTimeType);
            this.endTimeType = endTimeType;
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
         * The total number of instances to be reserved for the capacity reservation service. Valid values: number of used instances to 1000
         * <p>
         * 
         * > When the total number of instances is expanded, the expansion may fail due to insufficient inventory.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        @Override
        public ModifyCapacityReservationRequest build() {
            return new ModifyCapacityReservationRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        private PrivatePoolOptions(Builder builder) {
            this.name = builder.name;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String name; 
            private String id; 

            /**
             * The name of the capacity reservation service. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the subscription service.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
}
