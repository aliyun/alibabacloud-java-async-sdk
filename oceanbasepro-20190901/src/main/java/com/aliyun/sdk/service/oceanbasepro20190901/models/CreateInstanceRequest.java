// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Long autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpuArch")
    private String cpuArch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Long diskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceClass;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(maxLength = 20)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsolationOptimization")
    private String isolationOptimization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObVersion")
    private String obVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrimaryInstance")
    private String primaryInstance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrimaryRegion")
    private String primaryRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReplicaMode")
    private String replicaMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Series")
    @com.aliyun.core.annotation.Validation(required = true)
    private String series;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Zones")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zones;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.cpuArch = builder.cpuArch;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.dryRun = builder.dryRun;
        this.instanceClass = builder.instanceClass;
        this.instanceName = builder.instanceName;
        this.isolationOptimization = builder.isolationOptimization;
        this.obVersion = builder.obVersion;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.primaryInstance = builder.primaryInstance;
        this.primaryRegion = builder.primaryRegion;
        this.replicaMode = builder.replicaMode;
        this.resourceGroupId = builder.resourceGroupId;
        this.series = builder.series;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return cpuArch
     */
    public String getCpuArch() {
        return this.cpuArch;
    }

    /**
     * @return diskSize
     */
    public Long getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isolationOptimization
     */
    public String getIsolationOptimization() {
        return this.isolationOptimization;
    }

    /**
     * @return obVersion
     */
    public String getObVersion() {
        return this.obVersion;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return primaryInstance
     */
    public String getPrimaryInstance() {
        return this.primaryInstance;
    }

    /**
     * @return primaryRegion
     */
    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * @return replicaMode
     */
    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return zones
     */
    public String getZones() {
        return this.zones;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private Boolean autoRenew; 
        private Long autoRenewPeriod; 
        private String chargeType; 
        private String cpuArch; 
        private Long diskSize; 
        private String diskType; 
        private Boolean dryRun; 
        private String instanceClass; 
        private String instanceName; 
        private String isolationOptimization; 
        private String obVersion; 
        private Long period; 
        private String periodUnit; 
        private String primaryInstance; 
        private String primaryRegion; 
        private String replicaMode; 
        private String resourceGroupId; 
        private String series; 
        private String zones; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.cpuArch = request.cpuArch;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.dryRun = request.dryRun;
            this.instanceClass = request.instanceClass;
            this.instanceName = request.instanceName;
            this.isolationOptimization = request.isolationOptimization;
            this.obVersion = request.obVersion;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.primaryInstance = request.primaryInstance;
            this.primaryRegion = request.primaryRegion;
            this.replicaMode = request.replicaMode;
            this.resourceGroupId = request.resourceGroupId;
            this.series = request.series;
            this.zones = request.zones;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal.   
         * <p>
         * This parameter is valid only when the ChargeType parameter is set to PrePaid. Valid values: 
         * - true: enables automatic renewal for the instance.   
         * - false: disables automatic renewal for the instance. This is the default value.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The automatic renewal period of the instance. This parameter is required when the AutoRenew parameter is set to true. Valid values:  
         * <p>
         * - If the PeriodUnit parameter is set to Year: "1", "2", and "3".   
         * - If the PeriodUnit parameter is set to Month: "1", "2", "3", "6", and "12".
         */
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:  
         * <p>
         * - PrePay: the subscription billing method. You must ensure that the remaining balance or credit balance of your account can cover the cost of the subscription. Otherwise, you will receive an InvalidPayMethod error. 
         * - PostPay: the pay-as-you-go billing method. This is the default value. By default, fees are charged on an hourly basis.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CpuArch.
         */
        public Builder cpuArch(String cpuArch) {
            this.putBodyParameter("CpuArch", cpuArch);
            this.cpuArch = cpuArch;
            return this;
        }

        /**
         * The size of the storage space,in GB.    
         * <p>
         * The limits on the storage space vary with the cluster specifications:   
         * - 8C32GB: 100 GB to 10000 GB   
         * - 14C70GB: 200 GB to 10000 GB   
         * - 30C180GB: 400 GB to 10000 GB   
         * - 62C400GB: 800 GB to 10000 GB    
         * The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.
         */
        public Builder diskSize(Long diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * The type of the storage disk where the cluster is deployed. This parameter takes effect only for Standard Cluster Edition (Cloud Disk).
         * <p>
         * Valid values:
         * - cloud_essd_pl1: ESSD PL1.
         * - cloud_essd_pl0: ESSD PL0. Default value: cloud_essd_pl1.
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run for the request. Default value: false. Valid values:
         * <p>
         * - true: Only a dry-run request is sent and the instance is not created. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.
         * - false: The actual request is sent and no dry run is performed. The instance is created if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The specifications of the cluster.     
         * <p>
         * You can specify one of the following four plans:   
         *  - 8C32GB: indicates 8 CPU cores and 32 GB of memory.    
         *  - 14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.
         * - 30C180GB: indicates 30 CPU cores and 180 GB of memory.     
         * - 62C400GB: indicates 62 CPU cores and 400 GB of memory.
         */
        public Builder instanceClass(String instanceClass) {
            this.putBodyParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The name of the OceanBase cluster.    
         * <p>
         * It must be 1 to 20 characters in length.   
         * If this parameter is not specified, the value is the instance ID of the cluster by default.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Specifies whether to enable the control group feature.
         * <p>
         * Valid values:
         * - true
         * - false
         */
        public Builder isolationOptimization(String isolationOptimization) {
            this.putBodyParameter("IsolationOptimization", isolationOptimization);
            this.isolationOptimization = isolationOptimization;
            return this;
        }

        /**
         * OceanBase Server version number.
         */
        public Builder obVersion(String obVersion) {
            this.putBodyParameter("ObVersion", obVersion);
            this.obVersion = obVersion;
            return this;
        }

        /**
         * The valid duration of the purchased resources. The unit is specified by the PeriodUnit parameter.   
         * <p>
         * This parameter is valid and required only when the InstanceChargeType parameter is set to PrePaid.      
         * Valid values:     
         * - When the PeriodUnit parameter is set to Month: "1", "2", "3", "4", "5", "6", "7", "8", "9". 
         * - When the PeriodUnit parameter is set to Year: "1", "2", "3".
         */
        public Builder period(Long period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the valid duration of the purchased resources.     
         * <p>
         * Valid value for subscription: Month or Year.
         * Default value: Month for subscription, and Hour for pay-as-you-go.
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Primary instance ID.
         */
        public Builder primaryInstance(String primaryInstance) {
            this.putBodyParameter("PrimaryInstance", primaryInstance);
            this.primaryInstance = primaryInstance;
            return this;
        }

        /**
         * Primary instance region.
         */
        public Builder primaryRegion(String primaryRegion) {
            this.putBodyParameter("PrimaryRegion", primaryRegion);
            this.primaryRegion = primaryRegion;
            return this;
        }

        /**
         * The number of full-featured replicas.
         * <p>
         * - 3F: three full-featured replicas.
         * - 2F1L: two full-featured replicas and one log replica.
         * - 2F1A: two full-featured replicas and one arbitration service.
         * - ApsaraDB for OceanBase earlier than V4.1 supports 3F and 2F1L.
         * - ApsaraDB for OceanBase V4.1 or later supports 3F and 2F1A.
         * - An ApsaraDB for OceanBase instance deployed across three zones supports only 3F.
         * - An ApsaraDB for OceanBase instance deployed across two zones supports 2F1A or 2F1L, depending on the version.
         * - An ApsaraDB for OceanBase instance deployed in a single zone supports 3F, 2F1A, or 2F1L, depending on the version.
         */
        public Builder replicaMode(String replicaMode) {
            this.putBodyParameter("ReplicaMode", replicaMode);
            this.replicaMode = replicaMode;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The series of the OceanBase cluster. Valid values:    
         * <p>
         * - normal: Standard Cluster Edition (Cloud Disk). This is the default value.
         * - normal_ssd: Standard Cluster Edition (Local Disk).
         * - history: History Database Cluster Edition.
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * The ID of the zone to which the instance belongs.   
         * <p>
         * For more information about how to obtain the list of zones, see [DescribeZones](~~25610~~).
         */
        public Builder zones(String zones) {
            this.putBodyParameter("Zones", zones);
            this.zones = zones;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
