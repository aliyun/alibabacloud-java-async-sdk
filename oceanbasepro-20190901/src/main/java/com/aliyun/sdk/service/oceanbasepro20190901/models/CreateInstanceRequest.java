// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("AutoRenewPeriod")
    private Long autoRenewPeriod;

    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("DiskSize")
    private Long diskSize;

    @Body
    @NameInMap("DiskType")
    private String diskType;

    @Body
    @NameInMap("InstanceClass")
    @Validation(required = true)
    private String instanceClass;

    @Body
    @NameInMap("InstanceName")
    @Validation(maxLength = 20)
    private String instanceName;

    @Body
    @NameInMap("ObVersion")
    private String obVersion;

    @Body
    @NameInMap("Period")
    private Long period;

    @Body
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("Series")
    @Validation(required = true)
    private String series;

    @Body
    @NameInMap("Zones")
    @Validation(required = true)
    private String zones;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.instanceClass = builder.instanceClass;
        this.instanceName = builder.instanceName;
        this.obVersion = builder.obVersion;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
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
        private Long diskSize; 
        private String diskType; 
        private String instanceClass; 
        private String instanceName; 
        private String obVersion; 
        private Long period; 
        private String periodUnit; 
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
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.instanceClass = request.instanceClass;
            this.instanceName = request.instanceName;
            this.obVersion = request.obVersion;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
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
         * The return result of the request.
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
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
