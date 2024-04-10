// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
    @Body
    @NameInMap("autoPay")
    private Boolean autoPay;

    @Body
    @NameInMap("autoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("chargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("coldStorageSize")
    private Long coldStorageSize;

    @Body
    @NameInMap("cpu")
    private Long cpu;

    @Body
    @NameInMap("duration")
    private Long duration;

    @Body
    @NameInMap("enableServerlessComputing")
    private Boolean enableServerlessComputing;

    @Body
    @NameInMap("gatewayCount")
    @Validation(maximum = 50, minimum = 2)
    private Long gatewayCount;

    @Body
    @NameInMap("initialDatabases")
    private String initialDatabases;

    @Body
    @NameInMap("instanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("instanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("leaderInstanceId")
    private String leaderInstanceId;

    @Body
    @NameInMap("pricingCycle")
    private String pricingCycle;

    @Body
    @NameInMap("regionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("storageSize")
    private Long storageSize;

    @Body
    @NameInMap("vSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Body
    @NameInMap("vpcId")
    @Validation(required = true)
    private String vpcId;

    @Body
    @NameInMap("zoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.coldStorageSize = builder.coldStorageSize;
        this.cpu = builder.cpu;
        this.duration = builder.duration;
        this.enableServerlessComputing = builder.enableServerlessComputing;
        this.gatewayCount = builder.gatewayCount;
        this.initialDatabases = builder.initialDatabases;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.leaderInstanceId = builder.leaderInstanceId;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageSize = builder.storageSize;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return coldStorageSize
     */
    public Long getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return enableServerlessComputing
     */
    public Boolean getEnableServerlessComputing() {
        return this.enableServerlessComputing;
    }

    /**
     * @return gatewayCount
     */
    public Long getGatewayCount() {
        return this.gatewayCount;
    }

    /**
     * @return initialDatabases
     */
    public String getInitialDatabases() {
        return this.initialDatabases;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return leaderInstanceId
     */
    public String getLeaderInstanceId() {
        return this.leaderInstanceId;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
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
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String chargeType; 
        private Long coldStorageSize; 
        private Long cpu; 
        private Long duration; 
        private Boolean enableServerlessComputing; 
        private Long gatewayCount; 
        private String initialDatabases; 
        private String instanceName; 
        private String instanceType; 
        private String leaderInstanceId; 
        private String pricingCycle; 
        private String regionId; 
        private String resourceGroupId; 
        private Long storageSize; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.coldStorageSize = request.coldStorageSize;
            this.cpu = request.cpu;
            this.duration = request.duration;
            this.enableServerlessComputing = request.enableServerlessComputing;
            this.gatewayCount = request.gatewayCount;
            this.initialDatabases = request.initialDatabases;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.leaderInstanceId = request.leaderInstanceId;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageSize = request.storageSize;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to enable auto-payment. Default value: true. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * > The default value is true. If the balance of your account is insufficient, you can set this parameter to false. In this case, an unpaid order is generated. You can log on to the User Center to pay for the order.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("autoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable monthly auto-renewal. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription
         * *   PostPaid: pay-as-you-go
         * 
         * > This parameter is invalid for shared instances. Shared instances have fixed specifications and are pay-as-you-go instances.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The infrequent access (IA) storage space of the instance. Unit: GB.
         * <p>
         * 
         * > This parameter is invalid for pay-as-you-go instances.
         */
        public Builder coldStorageSize(Long coldStorageSize) {
            this.putBodyParameter("coldStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * The instance specifications. Valid values:
         * <p>
         * 
         * *   8-core 32 GB (number of compute nodes: 1)
         * *   16-core 64 GB (number of compute nodes: 1)
         * *   32-core 128 GB (number of compute nodes: 2)
         * *   64-core 256 GB (number of compute nodes: 4)
         * *   96-core 384 GB (number of compute nodes: 6)
         * *   128-core 512 GB (number of compute nodes: 8)
         * *   Others
         * 
         * > 
         * 
         * *   Set this parameter to the number of cores.
         * 
         * *   If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.
         * 
         * *   If you want to purchase a shared instance, you do not need to configure this parameter.
         * 
         * *   The specifications of 8-core 32 GB (number of compute nodes: 1) are for trial use only and cannot be used for production.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The validity period of the instance that you want to purchase. For example, you can specify a validity period of two months.
         * <p>
         * 
         * > You do not need to configure this parameter for pay-as-you-go instances.
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * enableServerlessComputing.
         */
        public Builder enableServerlessComputing(Boolean enableServerlessComputing) {
            this.putBodyParameter("enableServerlessComputing", enableServerlessComputing);
            this.enableServerlessComputing = enableServerlessComputing;
            return this;
        }

        /**
         * The number of gateways. Valid values: 2 to 50.
         * <p>
         * 
         * > This parameter is required only for virtual warehouse instances.
         */
        public Builder gatewayCount(Long gatewayCount) {
            this.putBodyParameter("gatewayCount", gatewayCount);
            this.gatewayCount = gatewayCount;
            return this;
        }

        /**
         * initialDatabases.
         */
        public Builder initialDatabases(String initialDatabases) {
            this.putBodyParameter("initialDatabases", initialDatabases);
            this.initialDatabases = initialDatabases;
            return this;
        }

        /**
         * The name of the Hologres instance that you want to purchase. The name must be 2 to 64 characters in length.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The type of the instance. Valid values:
         * <p>
         * 
         * *   Standard: general-purpose instance
         * *   Follower: read-only secondary instance
         * *   Warehouse: virtual warehouse instance
         * *   Shared: shared instance
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the primary instance. This parameter is required for read-only secondary instances.
         * <p>
         * 
         * > The primary instance and secondary instances must meet the following requirements:
         * 
         * *   The primary instance is in the Running state.
         * 
         * *   The primary instance and secondary instances are deployed in the same region.
         * 
         * *   The primary instance and secondary instances are deployed in the same zone.
         * 
         * *   Less than 10 secondary instances are associated with the primary instance.
         * 
         * *   The primary and secondary instances belong to the same Alibaba Cloud account.
         */
        public Builder leaderInstanceId(String leaderInstanceId) {
            this.putBodyParameter("leaderInstanceId", leaderInstanceId);
            this.leaderInstanceId = leaderInstanceId;
            return this;
        }

        /**
         * The billing cycle. Valid values:
         * <p>
         * 
         * *   Month
         * *   Hour
         * 
         * > 
         * 
         * *   This parameter can only be set to Month for subscription instances.
         * 
         * *   This parameter can only be set to Hour for pay-as-you-go instances.
         * 
         * *   By default, this parameter is set to Hour for shared instances.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("pricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The ID of the region. You can go to the [OpenAPI Explorer](https://api.aliyun.com/product/Hologram) or the Usage notes section to view the ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group. If you do not specify this parameter, the default resource group of the account is used.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The standard storage space of the instance. Unit: GB.
         * <p>
         * 
         * > This parameter is invalid for pay-as-you-go instances.
         */
        public Builder storageSize(Long storageSize) {
            this.putBodyParameter("storageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * The ID of the vSwitch. The zone in which the vSwitch resides must be the same as the zone in which the instance resides.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("vSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC). The region in which the VPC resides must be the same as the region in which the Hologres instance resides.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the zone. For more information about how to obtain the ID of the zone, see the Usage notes section.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
