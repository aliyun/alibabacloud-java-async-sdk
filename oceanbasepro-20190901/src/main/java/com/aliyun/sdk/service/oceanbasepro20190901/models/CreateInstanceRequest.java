// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
    @com.aliyun.core.annotation.Validation(maxLength = 64)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic renewal.<br>This parameter is valid only when the ChargeType parameter is set to PrePaid. Valid values: </p>
         * <ul>
         * <li>true: enables automatic renewal for the instance.   </li>
         * <li>false: disables automatic renewal for the instance. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The automatic renewal period of the instance. This parameter is required when the AutoRenew parameter is set to true. Valid values:  </p>
         * <ul>
         * <li>If the PeriodUnit parameter is set to Year: &quot;1&quot;, &quot;2&quot;, and &quot;3&quot;.   </li>
         * <li>If the PeriodUnit parameter is set to Month: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, and &quot;12&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:  </p>
         * <ul>
         * <li>PrePay: the subscription billing method. You must ensure that the remaining balance or credit balance of your account can cover the cost of the subscription. Otherwise, you will receive an InvalidPayMethod error. </li>
         * <li>PostPay: the pay-as-you-go billing method. This is the default value. By default, fees are charged on an hourly basis.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePay</p>
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
         * <p>The size of the storage space,in GB.<br>The limits on the storage space vary with the cluster specifications:   </p>
         * <ul>
         * <li>8C32GB: 100 GB to 10000 GB   </li>
         * <li>14C70GB: 200 GB to 10000 GB   </li>
         * <li>30C180GB: 400 GB to 10000 GB   </li>
         * <li>62C400GB: 800 GB to 10000 GB<br>The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder diskSize(Long diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The type of the storage disk where the cluster is deployed. This parameter takes effect only for Standard Cluster Edition (Cloud Disk).
         * Valid values:</p>
         * <ul>
         * <li>cloud_essd_pl1: ESSD PL1.</li>
         * <li>cloud_essd_pl0: ESSD PL0. Default value: cloud_essd_pl1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd_pl1</p>
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Only a dry-run request is sent and the instance is not created. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</li>
         * <li>false: The actual request is sent and no dry run is performed. The instance is created if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The specifications of the cluster.<br>You can specify one of the following four plans:   </p>
         * <ul>
         * <li>8C32GB: indicates 8 CPU cores and 32 GB of memory.    </li>
         * <li>14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.</li>
         * <li>30C180GB: indicates 30 CPU cores and 180 GB of memory.     </li>
         * <li>62C400GB: indicates 62 CPU cores and 400 GB of memory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14C70GB</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putBodyParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The name of the OceanBase cluster.<br>It must be 1 to 20 characters in length.<br>If this parameter is not specified, the value is the instance ID of the cluster by default.</p>
         * 
         * <strong>example:</strong>
         * <p>amap_aos_tx_ob</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the control group feature.
         * Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isolationOptimization(String isolationOptimization) {
            this.putBodyParameter("IsolationOptimization", isolationOptimization);
            this.isolationOptimization = isolationOptimization;
            return this;
        }

        /**
         * <p>OceanBase Server version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.77</p>
         */
        public Builder obVersion(String obVersion) {
            this.putBodyParameter("ObVersion", obVersion);
            this.obVersion = obVersion;
            return this;
        }

        /**
         * <p>The valid duration of the purchased resources. The unit is specified by the PeriodUnit parameter.<br>This parameter is valid and required only when the InstanceChargeType parameter is set to PrePaid.<br>Valid values:     </p>
         * <ul>
         * <li>When the PeriodUnit parameter is set to Month: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;. </li>
         * <li>When the PeriodUnit parameter is set to Year: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the valid duration of the purchased resources.<br>Valid value for subscription: Month or Year.
         * Default value: Month for subscription, and Hour for pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>Primary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ob3h8ytroxxxxx</p>
         */
        public Builder primaryInstance(String primaryInstance) {
            this.putBodyParameter("PrimaryInstance", primaryInstance);
            this.primaryInstance = primaryInstance;
            return this;
        }

        /**
         * <p>Primary instance region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder primaryRegion(String primaryRegion) {
            this.putBodyParameter("PrimaryRegion", primaryRegion);
            this.primaryRegion = primaryRegion;
            return this;
        }

        /**
         * <p>The number of full-featured replicas.</p>
         * <ul>
         * <li>3F: three full-featured replicas.</li>
         * <li>2F1L: two full-featured replicas and one log replica.</li>
         * <li>2F1A: two full-featured replicas and one arbitration service.</li>
         * <li>ApsaraDB for OceanBase earlier than V4.1 supports 3F and 2F1L.</li>
         * <li>ApsaraDB for OceanBase V4.1 or later supports 3F and 2F1A.</li>
         * <li>An ApsaraDB for OceanBase instance deployed across three zones supports only 3F.</li>
         * <li>An ApsaraDB for OceanBase instance deployed across two zones supports 2F1A or 2F1L, depending on the version.</li>
         * <li>An ApsaraDB for OceanBase instance deployed in a single zone supports 3F, 2F1A, or 2F1L, depending on the version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3F</p>
         */
        public Builder replicaMode(String replicaMode) {
            this.putBodyParameter("ReplicaMode", replicaMode);
            this.replicaMode = replicaMode;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The series of the OceanBase cluster. Valid values:    </p>
         * <ul>
         * <li>normal: Standard Cluster Edition (Cloud Disk). This is the default value.</li>
         * <li>normal_ssd: Standard Cluster Edition (Local Disk).</li>
         * <li>history: History Database Cluster Edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>The ID of the zone to which the instance belongs.<br>For more information about how to obtain the list of zones, see <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h,cn-hangzhou-i,cn-hangzhou-j</p>
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
