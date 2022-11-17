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
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 是否要自动续费。当参数ChargeType取值PrePaid时生效。取值范围：  true：自动续费。 false（默认）：不自动续费。
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * 每次自动续费的时长，当参数AutoRenew取值True时，该参数为必填参数。  PeriodUnit为Week时，AutoRenewPeriod取值范围为{"1", "2", "3"}。  PeriodUnit为Month时，AutoRenewPeriod取值范围为{"1", "2", "3", "6", "12"}。
         */
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * 实例的付费方式。取值范围：  PrePay：包年包月。选择该类付费方式时，您必须确认自己的账号支持余额支付/信用支付，否则将返回 InvalidPayMethod的错误提示。 PostPay（默认）：按量付费。其默认按小时来计费
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 存储空间大小，单位GB。  存储空间的限制根据集群规格不同而不同，具体如下：  - 8C32GB：100GB~10000GB  - 14C70GB：200GB~10000GB  - 30C180GB：400GB~10000GB  - 62C400G：800GB-10000GB。  各套餐的存储空间默认值为其最小值。
         */
        public Builder diskSize(Long diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * 集群的存储类型。仅在标准集群版（云盘）下生效。当前支持两种类型：- cloud_essd_pl1：云盘ESSD PL1; -- cloud_essd_pl1：云盘ESSD PL1; - cloud_essd_pl0：云盘ESSD PL0。默认值为cloud_essd_pl1。
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * 集群规格信息。  当前支持四种套餐：  - 8C32GB：8核 32GB  - 14C70GB（默认）：14核 70GB  - 30C180GB：30核 180GB  - 62C400GB：62核 400GB
         */
        public Builder instanceClass(String instanceClass) {
            this.putBodyParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * 集群名称。
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Oceanbase Server的版本号。
         */
        public Builder obVersion(String obVersion) {
            this.putBodyParameter("ObVersion", obVersion);
            this.obVersion = obVersion;
            return this;
        }

        /**
         * 购买资源的时长，单位由PeriodUnit指定。当参数InstanceChargeType取值为PrePaid时才生效且为必选值。一旦指定了DedicatedHostId，则取值范围不能超过专有宿主机的订阅时长。取值范围：  PeriodUnit=Week时，Period取值：{“1”, “2”, “3”, “4”}。 PeriodUnit=Month时，Period取值：{“1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”, ”48”, ”60”}。
         */
        public Builder period(Long period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * 购买资源的时长。  包年包月取值范围： Month。 默认值：包年包月为Month，按量计费，默认周期为Hour。
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * 实例所在的企业资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 实例的系列  - normal（默认）：标准集群版（云盘）  - normal_ssd：标准集群版（本地盘） - history：历史库集群版。
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * 实例所属的可用区ID。更多详情，请参见DescribeZones获取可用区列表。
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
