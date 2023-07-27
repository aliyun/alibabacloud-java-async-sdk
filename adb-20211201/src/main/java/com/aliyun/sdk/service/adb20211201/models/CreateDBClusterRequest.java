// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @Query
    @NameInMap("ComputeResource")
    @Validation(required = true)
    private String computeResource;

    @Query
    @NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @Query
    @NameInMap("DBClusterNetworkType")
    private String DBClusterNetworkType;

    @Query
    @NameInMap("DBClusterVersion")
    @Validation(required = true)
    private String DBClusterVersion;

    @Query
    @NameInMap("EnableDefaultResourcePool")
    private Boolean enableDefaultResourcePool;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StorageResource")
    @Validation(required = true)
    private String storageResource;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VPCId")
    @Validation(required = true)
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.computeResource = builder.computeResource;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.enableDefaultResourcePool = builder.enableDefaultResourcePool;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageResource = builder.storageResource;
        this.tag = builder.tag;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return enableDefaultResourcePool
     */
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterRequest, Builder> {
        private String computeResource; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private Boolean enableDefaultResourcePool; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String storageResource; 
        private java.util.List < Tag> tag; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest request) {
            super(request);
            this.computeResource = request.computeResource;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterNetworkType = request.DBClusterNetworkType;
            this.DBClusterVersion = request.DBClusterVersion;
            this.enableDefaultResourcePool = request.enableDefaultResourcePool;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageResource = request.storageResource;
            this.tag = request.tag;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The reserved computing resources. Unit: ACUs. Valid values: 0 to 4096. The value must be in increments of 16 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.
         * <p>
         * 
         * >  You must specify a value with the unit for this parameter.
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * The description of the cluster.
         * <p>
         * 
         * *   The description cannot start with `http://` or `https://`.
         * *   The description must be 2 to 256 characters in length.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * The network type of the cluster. Only **VPC** is supported.
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * The version of the cluster. Set the value to **5.0**.
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * Specifies whether to distribute all the reserved computing resources to the default resource group user_default. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: distributes all the reserved computing resources to the default resource group.
         * *   **false**: does not distribute all the reserved computing resources to the default resource group.
         */
        public Builder enableDefaultResourcePool(Boolean enableDefaultResourcePool) {
            this.putQueryParameter("EnableDefaultResourcePool", enableDefaultResourcePool);
            this.enableDefaultResourcePool = enableDefaultResourcePool;
            return this;
        }

        /**
         * The billing method of the cluster. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription type of the subscription cluster. Valid values:
         * <p>
         * 
         * *   **Year**: subscription on a yearly basis
         * *   **Month**: subscription on a monthly basis
         * 
         * >  This parameter is required when PayType is set to Prepaid.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the region in which to create the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~454314~~) operation to query the most recent region list.
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
         * The reserved storage resources. Unit: AnalyticDB Compute Units (ACUs). Valid values: 0 to 2064. The value must be in increments of 24 ACUs. Each ACU is equivalent to 1 core and 4 GB memory.
         * <p>
         * 
         * >  You must specify a value with the unit for this parameter.
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
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
         * The subscription duration of the subscription cluster. Valid values:
         * <p>
         * 
         * *   Valid values when **Period** is set to Year: 1 to 3 (integer)
         * *   Valid values when **Period** is set to Month: 1 to 9 (integer)
         * 
         * >  This parameter is required when PayType is set to **Prepaid**.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID of the cluster.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID of the cluster.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~454314~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBClusterRequest build() {
            return new CreateDBClusterRequest(this);
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
