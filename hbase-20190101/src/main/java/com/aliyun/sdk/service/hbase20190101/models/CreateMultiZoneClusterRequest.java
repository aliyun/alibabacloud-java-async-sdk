// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMultiZoneClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateMultiZoneClusterRequest</p>
 */
public class CreateMultiZoneClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterVSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arbiterVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arbiterZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String archVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer coreDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreNodeCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer coreNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDiskSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer logDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogNodeCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer logNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String masterInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZoneCombination")
    @com.aliyun.core.annotation.Validation(required = true)
    private String multiZoneCombination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String standbyZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateMultiZoneClusterRequest(Builder builder) {
        super(builder);
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.archVersion = builder.archVersion;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clusterName = builder.clusterName;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceType = builder.coreInstanceType;
        this.coreNodeCount = builder.coreNodeCount;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.logDiskSize = builder.logDiskSize;
        this.logDiskType = builder.logDiskType;
        this.logInstanceType = builder.logInstanceType;
        this.logNodeCount = builder.logNodeCount;
        this.masterInstanceType = builder.masterInstanceType;
        this.multiZoneCombination = builder.multiZoneCombination;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiZoneClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arbiterVSwitchId
     */
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    /**
     * @return arbiterZoneId
     */
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    /**
     * @return archVersion
     */
    public String getArchVersion() {
        return this.archVersion;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return coreDiskSize
     */
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return coreNodeCount
     */
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return logDiskSize
     */
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    /**
     * @return logDiskType
     */
    public String getLogDiskType() {
        return this.logDiskType;
    }

    /**
     * @return logInstanceType
     */
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    /**
     * @return logNodeCount
     */
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return multiZoneCombination
     */
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
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
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateMultiZoneClusterRequest, Builder> {
        private String arbiterVSwitchId; 
        private String arbiterZoneId; 
        private String archVersion; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clusterName; 
        private Integer coreDiskSize; 
        private String coreDiskType; 
        private String coreInstanceType; 
        private Integer coreNodeCount; 
        private String engine; 
        private String engineVersion; 
        private Integer logDiskSize; 
        private String logDiskType; 
        private String logInstanceType; 
        private Integer logNodeCount; 
        private String masterInstanceType; 
        private String multiZoneCombination; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String primaryVSwitchId; 
        private String primaryZoneId; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiZoneClusterRequest request) {
            super(request);
            this.arbiterVSwitchId = request.arbiterVSwitchId;
            this.arbiterZoneId = request.arbiterZoneId;
            this.archVersion = request.archVersion;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.clusterName = request.clusterName;
            this.coreDiskSize = request.coreDiskSize;
            this.coreDiskType = request.coreDiskType;
            this.coreInstanceType = request.coreInstanceType;
            this.coreNodeCount = request.coreNodeCount;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.logDiskSize = request.logDiskSize;
            this.logDiskType = request.logDiskType;
            this.logInstanceType = request.logInstanceType;
            this.logNodeCount = request.logNodeCount;
            this.masterInstanceType = request.masterInstanceType;
            this.multiZoneCombination = request.multiZoneCombination;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.primaryVSwitchId = request.primaryVSwitchId;
            this.primaryZoneId = request.primaryZoneId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityIPList = request.securityIPList;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyZoneId = request.standbyZoneId;
            this.vpcId = request.vpcId;
        } 

        /**
         * ArbiterVSwitchId.
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * ArbiterZoneId.
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.putQueryParameter("ArbiterZoneId", arbiterZoneId);
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * ArchVersion.
         */
        public Builder archVersion(String archVersion) {
            this.putQueryParameter("ArchVersion", archVersion);
            this.archVersion = archVersion;
            return this;
        }

        /**
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
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
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CoreDiskSize.
         */
        public Builder coreDiskSize(Integer coreDiskSize) {
            this.putQueryParameter("CoreDiskSize", coreDiskSize);
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * CoreDiskType.
         */
        public Builder coreDiskType(String coreDiskType) {
            this.putQueryParameter("CoreDiskType", coreDiskType);
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * CoreNodeCount.
         */
        public Builder coreNodeCount(Integer coreNodeCount) {
            this.putQueryParameter("CoreNodeCount", coreNodeCount);
            this.coreNodeCount = coreNodeCount;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
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
         * LogDiskSize.
         */
        public Builder logDiskSize(Integer logDiskSize) {
            this.putQueryParameter("LogDiskSize", logDiskSize);
            this.logDiskSize = logDiskSize;
            return this;
        }

        /**
         * LogDiskType.
         */
        public Builder logDiskType(String logDiskType) {
            this.putQueryParameter("LogDiskType", logDiskType);
            this.logDiskType = logDiskType;
            return this;
        }

        /**
         * LogInstanceType.
         */
        public Builder logInstanceType(String logInstanceType) {
            this.putQueryParameter("LogInstanceType", logInstanceType);
            this.logInstanceType = logInstanceType;
            return this;
        }

        /**
         * LogNodeCount.
         */
        public Builder logNodeCount(Integer logNodeCount) {
            this.putQueryParameter("LogNodeCount", logNodeCount);
            this.logNodeCount = logNodeCount;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * MultiZoneCombination.
         */
        public Builder multiZoneCombination(String multiZoneCombination) {
            this.putQueryParameter("MultiZoneCombination", multiZoneCombination);
            this.multiZoneCombination = multiZoneCombination;
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
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryZoneId.
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.putQueryParameter("PrimaryZoneId", primaryZoneId);
            this.primaryZoneId = primaryZoneId;
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
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyZoneId.
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateMultiZoneClusterRequest build() {
            return new CreateMultiZoneClusterRequest(this);
        } 

    } 

}
