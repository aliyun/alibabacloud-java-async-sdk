// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReservedInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyReservedInstancesRequest</p>
 */
public class ModifyReservedInstancesRequest extends Request {
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
    @NameInMap("Configuration")
    private java.util.List < Configuration> configuration;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReservedInstanceId")
    private java.util.List < String > reservedInstanceId;

    private ModifyReservedInstancesRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.configuration = builder.configuration;
        this.regionId = builder.regionId;
        this.reservedInstanceId = builder.reservedInstanceId;
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
     * @return configuration
     */
    public java.util.List < Configuration> getConfiguration() {
        return this.configuration;
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

    public static final class Builder extends Request.Builder<ModifyReservedInstancesRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < Configuration> configuration; 
        private String regionId; 
        private java.util.List < String > reservedInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReservedInstancesRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.configuration = response.configuration;
            this.regionId = response.regionId;
            this.reservedInstanceId = response.reservedInstanceId;
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
         * Configuration.
         */
        public Builder configuration(java.util.List < Configuration> configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * The ID of the region to which the reserved instance belongs.
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the reserved instance. N value range: 1~20
         */
        public Builder reservedInstanceId(java.util.List < String > reservedInstanceId) {
            this.putQueryParameter("ReservedInstanceId", reservedInstanceId);
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }

        @Override
        public ModifyReservedInstancesRequest build() {
            return new ModifyReservedInstancesRequest(this);
        } 

    } 

    public static class Configuration extends TeaModel {
        @NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        private Configuration(Builder builder) {
            this.reservedInstanceName = builder.reservedInstanceName;
            this.zoneId = builder.zoneId;
            this.scope = builder.scope;
            this.instanceType = builder.instanceType;
            this.instanceAmount = builder.instanceAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return reservedInstanceName
         */
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public static final class Builder {
            private String reservedInstanceName; 
            private String zoneId; 
            private String scope; 
            private String instanceType; 
            private Integer instanceAmount; 

            /**
             * 预留实例券的名称。N的取值范围：1~100
             * <p>
             * 
             * 长度为2~128个英文或中文字符。必须以大小写字母或中文开头，不能以http://和https://开头。可以包含数字、半角冒号（:）、下划线（_）或者连字符（-）。
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * 预留实例券所属的可用区编号。N的取值范围：1~100
             * <p>
             * 
             * `Scope`参数值为`Zone`时，该参数为必填参数。
             * 
             * 您可以调用[DescribeZones](~~25609~~)获取可用区列表。 
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * 预留实例券的范围。取值范围： 
             * <p>
             * 
             * - Region：地域级别
             * - Zone：可用区级别
             * 
             * N的取值范围：1~100
             * 
             * 默认值：Region  
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 预留实例券可以同时匹配的实例规格。N的取值范围：1~100
             * <p>
             * 
             * - 可用区级别预留实例券能够匹配的实例规格族包括：c6、g6、r6、c5、g5、r5、hfc5、hfg5、ic5、se1ne、sn1ne、sn2ne、i2、t5、t6
             * 
             * - 地域级别预留实例券能够匹配的实例规格族包括：c6、g6、r6、c5、g5、r5、hfc5、hfg5、ic5、se1ne、sn1ne、sn2ne、i2
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 预留实例券可以同时匹配同规格按量付费实例的数量。取值范围：大于等于1。N的取值范围：1~100
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
