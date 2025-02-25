// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("coldStorageSize")
    private Long coldStorageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Long cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableServerlessComputing")
    private Boolean enableServerlessComputing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayCount")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 2)
    private Long gatewayCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initialDatabases")
    private String initialDatabases;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("leaderInstanceId")
    private String leaderInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to enable auto-payment. Default value: true. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> The default value is true. If the balance of your account is insufficient, you can set this parameter to false. In this case, an unpaid order is generated. You can log on to the Expenses and Costs console to pay for the order.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("autoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable monthly auto-renewal. The default value is false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is invalid for Hologres Shared Cluster instances. Hologres Shared Cluster instances have fixed specifications and are pay-as-you-go instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
         * <blockquote>
         * <p> This parameter is invalid for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder coldStorageSize(Long coldStorageSize) {
            this.putBodyParameter("coldStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>The instance specifications. Valid values:</p>
         * <ul>
         * <li>8-core 32GB (number of compute nodes: 1)</li>
         * <li>32-core 128GB (number of compute nodes: 2)</li>
         * <li>64-core 256GB (number of compute nodes: 4)</li>
         * <li>96-core 384GB (number of compute nodes: 6)</li>
         * <li>128-core 512GB (number of compute nodes: 8)</li>
         * <li>Others</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Set this parameter to the number of cores.</p>
         * </li>
         * <li><p>If you want to set this parameter to specifications with more than 1,024 GB, you must submit a ticket.</p>
         * </li>
         * <li><p>This parameter is invalid for Hologres Shared Cluster instances.</p>
         * </li>
         * <li><p>The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The validity period of the instance that you want to purchase. For example, you can specify a validity period of two months.</p>
         * <blockquote>
         * <p> You do not need to configure this parameter for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Serverless Computing feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableServerlessComputing(Boolean enableServerlessComputing) {
            this.putBodyParameter("enableServerlessComputing", enableServerlessComputing);
            this.enableServerlessComputing = enableServerlessComputing;
            return this;
        }

        /**
         * <p>The number of gateways. Valid values: 2 to 50.</p>
         * <blockquote>
         * <p> This parameter is required only for virtual warehouse instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder gatewayCount(Long gatewayCount) {
            this.putBodyParameter("gatewayCount", gatewayCount);
            this.gatewayCount = gatewayCount;
            return this;
        }

        /**
         * <p>The initial database.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot</p>
         */
        public Builder initialDatabases(String initialDatabases) {
            this.putBodyParameter("initialDatabases", initialDatabases);
            this.initialDatabases = initialDatabases;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_holo</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The category of the instance. Valid values:</p>
         * <ul>
         * <li>Standard: general-purpose instance</li>
         * <li>Follower: read-only secondary instance</li>
         * <li>Warehouse: virtual warehouse instance</li>
         * <li>Shared: Hologres Shared Cluster instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The ID of the primary instance. This parameter is required for read-only secondary instances.</p>
         * <blockquote>
         * <p> The primary and secondary instances must meet the following requirements:</p>
         * </blockquote>
         * <ul>
         * <li><p>The primary instance is in the Running state.</p>
         * </li>
         * <li><p>The primary instance and secondary instances are deployed in the same region.</p>
         * </li>
         * <li><p>The primary instance and secondary instances are deployed in the same zone.</p>
         * </li>
         * <li><p>Less than 10 secondary instances are associated with the primary instance.</p>
         * </li>
         * <li><p>The primary instance and secondary instances belong to the same Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-lbj3aworq112</p>
         */
        public Builder leaderInstanceId(String leaderInstanceId) {
            this.putBodyParameter("leaderInstanceId", leaderInstanceId);
            this.leaderInstanceId = leaderInstanceId;
            return this;
        }

        /**
         * <p>The billing cycle. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Hour</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter can only be set to Month for subscription instances.</p>
         * </li>
         * <li><p>This parameter can only be set to Hour for pay-as-you-go instances.</p>
         * </li>
         * <li><p>By default, this parameter is set to Hour for Hologres Shared Cluster instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("pricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The ID of the region. You can obtain region IDs in <a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/endpoints">Endpoints</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group. If you do not specify this parameter, the default resource group of the account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The standard storage space of the instance. Unit: GB.</p>
         * <blockquote>
         * <p> This parameter is invalid for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder storageSize(Long storageSize) {
            this.putBodyParameter("storageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. The zone in which the vSwitch resides must be the same as the zone in which the Hologres instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vccsiymtxxxxxx</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("vSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC). The region in which the VPC resides must be the same as the region in which the Hologres instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4netc3y5xxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the zone. For more information, see the &quot;Operation description&quot; section in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
