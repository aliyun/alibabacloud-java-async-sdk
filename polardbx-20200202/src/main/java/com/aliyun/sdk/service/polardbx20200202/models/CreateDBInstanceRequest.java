// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBNodeClass")
    @Validation(required = true)
    private String DBNodeClass;

    @Query
    @NameInMap("DBNodeCount")
    @Validation(required = true)
    private Integer DBNodeCount;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("IsReadDBInstance")
    private Boolean isReadDBInstance;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PrimaryDBInstanceName")
    private String primaryDBInstanceName;

    @Query
    @NameInMap("PrimaryZone")
    private String primaryZone;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecondaryZone")
    private String secondaryZone;

    @Query
    @NameInMap("TertiaryZone")
    private String tertiaryZone;

    @Query
    @NameInMap("TopologyType")
    private String topologyType;

    @Query
    @NameInMap("UsedTime")
    private Integer usedTime;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeCount = builder.DBNodeCount;
        this.engineVersion = builder.engineVersion;
        this.isReadDBInstance = builder.isReadDBInstance;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.primaryDBInstanceName = builder.primaryDBInstanceName;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondaryZone = builder.secondaryZone;
        this.tertiaryZone = builder.tertiaryZone;
        this.topologyType = builder.topologyType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeCount
     */
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return isReadDBInstance
     */
    public Boolean getIsReadDBInstance() {
        return this.isReadDBInstance;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return primaryDBInstanceName
     */
    public String getPrimaryDBInstanceName() {
        return this.primaryDBInstanceName;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
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
     * @return secondaryZone
     */
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    /**
     * @return tertiaryZone
     */
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    /**
     * @return topologyType
     */
    public String getTopologyType() {
        return this.topologyType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
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

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private String clientToken; 
        private String DBNodeClass; 
        private Integer DBNodeCount; 
        private String engineVersion; 
        private Boolean isReadDBInstance; 
        private String networkType; 
        private String payType; 
        private String period; 
        private String primaryDBInstanceName; 
        private String primaryZone; 
        private String regionId; 
        private String resourceGroupId; 
        private String secondaryZone; 
        private String tertiaryZone; 
        private String topologyType; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.clientToken = response.clientToken;
            this.DBNodeClass = response.DBNodeClass;
            this.DBNodeCount = response.DBNodeCount;
            this.engineVersion = response.engineVersion;
            this.isReadDBInstance = response.isReadDBInstance;
            this.networkType = response.networkType;
            this.payType = response.payType;
            this.period = response.period;
            this.primaryDBInstanceName = response.primaryDBInstanceName;
            this.primaryZone = response.primaryZone;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.secondaryZone = response.secondaryZone;
            this.tertiaryZone = response.tertiaryZone;
            this.topologyType = response.topologyType;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBNodeClass.
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * DBNodeCount.
         */
        public Builder DBNodeCount(Integer DBNodeCount) {
            this.putQueryParameter("DBNodeCount", DBNodeCount);
            this.DBNodeCount = DBNodeCount;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * IsReadDBInstance.
         */
        public Builder isReadDBInstance(Boolean isReadDBInstance) {
            this.putQueryParameter("IsReadDBInstance", isReadDBInstance);
            this.isReadDBInstance = isReadDBInstance;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PrimaryDBInstanceName.
         */
        public Builder primaryDBInstanceName(String primaryDBInstanceName) {
            this.putQueryParameter("PrimaryDBInstanceName", primaryDBInstanceName);
            this.primaryDBInstanceName = primaryDBInstanceName;
            return this;
        }

        /**
         * PrimaryZone.
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
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
         * SecondaryZone.
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * TertiaryZone.
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * TopologyType.
         */
        public Builder topologyType(String topologyType) {
            this.putQueryParameter("TopologyType", topologyType);
            this.topologyType = topologyType;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
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
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

}
