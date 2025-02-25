// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyReservedInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyReservedInstancesRequest</p>
 */
public class ModifyReservedInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List<Configuration> configuration;

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
    private java.util.List<String> reservedInstanceId;

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
    public java.util.List<Configuration> getConfiguration() {
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
    public java.util.List<String> getReservedInstanceId() {
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
        private java.util.List<Configuration> configuration; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> reservedInstanceId; 
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
         * <p>The configurations of the new reserved instances. You can specify up to 100 new reserved instances.</p>
         */
        public Builder configuration(java.util.List<Configuration> configuration) {
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
         * <p>The region ID of the reserved instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of reserved instances that you want to modify. You can specify up to 20 reserved instance IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ReservedInstanceId.1=&quot;ecsri-bp1cx3****&quot;,ReservedInstanceId.2=&quot;ecsri-bp15xx2****&quot;......</p>
         */
        public Builder reservedInstanceId(java.util.List<String> reservedInstanceId) {
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

    /**
     * 
     * {@link ModifyReservedInstancesRequest} extends {@link TeaModel}
     *
     * <p>ModifyReservedInstancesRequest</p>
     */
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
             * <p>The number of pay-as-you-go instances of the specified instance type that the new reserved instance can match. The value of this parameter must be greater than or equal to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * <p>The instance types that the new reserved instance can match.</p>
             * <blockquote>
             * <p> The supported instance types are continuously updated. For information about the instance types supported by reserved instances, see <a href="~~100370#3c1b682051vt4~~">Overview of reserved instances</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.4xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The name of the new reserved instance.</p>
             * <p>The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>testReservedInstanceName</p>
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * <p>The scope level of the new reserved instance. Valid values:</p>
             * <ul>
             * <li>Region</li>
             * <li>Zone</li>
             * </ul>
             * <p>Default value: Region.</p>
             * 
             * <strong>example:</strong>
             * <p>Zone</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The zone ID of the new reserved instance.</p>
             * <p>This parameter is required when you set <code>Scope</code> to <code>Zone</code>.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeZones</a> operation to query the most recent zone list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
