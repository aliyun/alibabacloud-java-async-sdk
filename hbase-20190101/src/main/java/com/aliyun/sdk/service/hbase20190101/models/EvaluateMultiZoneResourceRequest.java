// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateMultiZoneResourceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateMultiZoneResourceRequest</p>
 */
public class EvaluateMultiZoneResourceRequest extends Request {
    @Query
    @NameInMap("ArbiterVSwitchId")
    @Validation(required = true)
    private String arbiterVSwitchId;

    @Query
    @NameInMap("ArbiterZoneId")
    @Validation(required = true)
    private String arbiterZoneId;

    @Query
    @NameInMap("ArchVersion")
    @Validation(required = true)
    private String archVersion;

    @Query
    @NameInMap("AutoRenewPeriod")
    @Validation(maximum = 60, minimum = 1)
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("CoreDiskSize")
    @Validation(required = true, maximum = 64000, minimum = 400)
    private Integer coreDiskSize;

    @Query
    @NameInMap("CoreDiskType")
    @Validation(required = true)
    private String coreDiskType;

    @Query
    @NameInMap("CoreInstanceType")
    @Validation(required = true)
    private String coreInstanceType;

    @Query
    @NameInMap("CoreNodeCount")
    @Validation(required = true, maximum = 2000, minimum = 4)
    private Integer coreNodeCount;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("LogDiskSize")
    @Validation(maximum = 64000, minimum = 400)
    private Integer logDiskSize;

    @Query
    @NameInMap("LogDiskType")
    private String logDiskType;

    @Query
    @NameInMap("LogInstanceType")
    private String logInstanceType;

    @Query
    @NameInMap("LogNodeCount")
    @Validation(maximum = 200, minimum = 4)
    private Integer logNodeCount;

    @Query
    @NameInMap("MasterInstanceType")
    @Validation(required = true)
    private String masterInstanceType;

    @Query
    @NameInMap("MultiZoneCombination")
    @Validation(required = true)
    private String multiZoneCombination;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    @Validation(maximum = 60, minimum = 1)
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PrimaryVSwitchId")
    @Validation(required = true)
    private String primaryVSwitchId;

    @Query
    @NameInMap("PrimaryZoneId")
    @Validation(required = true)
    private String primaryZoneId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("StandbyVSwitchId")
    @Validation(required = true)
    private String standbyVSwitchId;

    @Query
    @NameInMap("StandbyZoneId")
    @Validation(required = true)
    private String standbyZoneId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private EvaluateMultiZoneResourceRequest(Builder builder) {
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
        this.securityIPList = builder.securityIPList;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateMultiZoneResourceRequest create() {
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

    public static final class Builder extends Request.Builder<EvaluateMultiZoneResourceRequest, Builder> {
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
        private String securityIPList; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateMultiZoneResourceRequest response) {
            super(response);
            this.arbiterVSwitchId = response.arbiterVSwitchId;
            this.arbiterZoneId = response.arbiterZoneId;
            this.archVersion = response.archVersion;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.clientToken = response.clientToken;
            this.clusterName = response.clusterName;
            this.coreDiskSize = response.coreDiskSize;
            this.coreDiskType = response.coreDiskType;
            this.coreInstanceType = response.coreInstanceType;
            this.coreNodeCount = response.coreNodeCount;
            this.engine = response.engine;
            this.engineVersion = response.engineVersion;
            this.logDiskSize = response.logDiskSize;
            this.logDiskType = response.logDiskType;
            this.logInstanceType = response.logInstanceType;
            this.logNodeCount = response.logNodeCount;
            this.masterInstanceType = response.masterInstanceType;
            this.multiZoneCombination = response.multiZoneCombination;
            this.payType = response.payType;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.primaryVSwitchId = response.primaryVSwitchId;
            this.primaryZoneId = response.primaryZoneId;
            this.regionId = response.regionId;
            this.securityIPList = response.securityIPList;
            this.standbyVSwitchId = response.standbyVSwitchId;
            this.standbyZoneId = response.standbyZoneId;
            this.vpcId = response.vpcId;
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
        public EvaluateMultiZoneResourceRequest build() {
            return new EvaluateMultiZoneResourceRequest(this);
        } 

    } 

}
