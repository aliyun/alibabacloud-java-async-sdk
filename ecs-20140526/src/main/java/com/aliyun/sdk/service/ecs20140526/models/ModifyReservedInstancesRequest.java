// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReservedInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyReservedInstancesRequest</p>
 */
public class ModifyReservedInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List < Configuration> configuration;

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
    @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > reservedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyReservedInstancesRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.reservedInstanceId = builder.reservedInstanceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReservedInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public java.util.List < Configuration> getConfiguration() {
        return this.configuration;
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
     * @return reservedInstanceId
     */
    public java.util.List < String > getReservedInstanceId() {
        return this.reservedInstanceId;
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

    public static final class Builder extends Request.Builder<ModifyReservedInstancesRequest, Builder> {
        private java.util.List < Configuration> configuration; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < String > reservedInstanceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReservedInstancesRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.reservedInstanceId = request.reservedInstanceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The configurations of reserved instances.
         */
        public Builder configuration(java.util.List < Configuration> configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
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
         * The IDs of reserved instances. Valid values of N: 1 to 20.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of reserved instance N. Valid values of N: 1 to 20.
         */
        public Builder reservedInstanceId(java.util.List < String > reservedInstanceId) {
            this.putQueryParameter("ReservedInstanceId", reservedInstanceId);
            this.reservedInstanceId = reservedInstanceId;
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
        public ModifyReservedInstancesRequest build() {
            return new ModifyReservedInstancesRequest(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Configuration(Builder builder) {
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.reservedInstanceName = builder.reservedInstanceName;
            this.scope = builder.scope;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return reservedInstanceName
         */
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer instanceAmount; 
            private String instanceType; 
            private String reservedInstanceName; 
            private String scope; 
            private String zoneId; 

            /**
             * The number of pay-as-you-go instances of the same instance type that reserved instance N can match. The value of this parameter must be greater than or equal to 1. Valid values of N: 1 to 100.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * The instance type that reserved instance N can match. Valid values of N: 1 to 100.
             * <p>
             * 
             * >  The applicable instance types are continuously updated. For more information, see the "Attributes" section in [Overview of reserved instances](~~100370~~).
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The name of reserved instance N. Valid values of N: 1 to 100.
             * <p>
             * 
             * The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain digits, letters, colons (:), underscores (\_), and hyphens (-).
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * The scope of reserved instance N. Valid values:
             * <p>
             * 
             * *   Region: regional
             * *   Zone: zonal
             * 
             * Valid values of N: 1 to 100.
             * 
             * Default value: Region.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The zone ID of reserved instance N. Valid values of N: 1 to 100.
             * <p>
             * 
             * This parameter is required when `Scope` is set to `Zone`.
             * 
             * You can call the [DescribeZones](~~25609~~) operation to query the most recent zone list.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
