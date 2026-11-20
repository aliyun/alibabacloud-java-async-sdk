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
    @com.aliyun.core.annotation.NameInMap("storageType")
    private String storageType;

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
        this.storageType = builder.storageType;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
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
        private String storageType; 
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
            this.storageType = request.storageType;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
         * <ul>
         * <li>true: Automatic payment is enabled.</li>
         * <li>false: Only an order is generated, and no payment is made.<blockquote>
         * <p>Default value: true. If your payment method has insufficient balance, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the Expenses and Costs console to complete the payment.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable monthly auto-renewal. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid: Subscription.</li>
         * <li>PostPaid: Pay-as-you-go.<blockquote>
         * <p>This parameter is ignored for Shared instances. Shared is a defined specifications type, and its billing method defaults to PostPaid.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The low-frequency storage capacity of the instance. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is ignored for pay-as-you-go instances.</p>
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
         * <li>32 cores, 128 GB (Number of compute nodes: 2)</li>
         * <li>64 cores, 256 GB (Number of compute nodes: 4)</li>
         * <li>96 cores, 384 GB (Number of compute nodes: 6)</li>
         * <li>128 cores, 512 GB (Number of compute nodes: 8)</li>
         * <li>Other specifications</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Specify the number of cores.</li>
         * <li>To purchase an instance with more than 1,024 cores, submit a ticket.</li>
         * <li>You do not need to specify the specifications for a Shared instance.</li>
         * </ul>
         * </blockquote>
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
         * <p>The subscription duration. For example, set this parameter to 2 for a two-month subscription.</p>
         * <blockquote>
         * <p>This parameter is not required if the billing method is PostPaid.</p>
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
         * <p>Specifies whether to enable Serverless Computing.</p>
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
         * <p>This parameter is required only for Warehouse instances.</p>
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
         * <p>The initial databases.</p>
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
         * <p>The name of the instance. The name must be 2 to 64 characters in length. Each Chinese character or letter counts as one character.</p>
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
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>Standard: General-purpose.</li>
         * <li>Follower: Read-only secondary instance.</li>
         * <li>Warehouse: Compute group.</li>
         * <li>Shared: Shared.</li>
         * <li>Severless: Serverless.</li>
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
         * <p>The ID of the primary instance. This parameter is required for Follower instances.</p>
         * <blockquote>
         * <p>The primary and secondary instances must meet the following conditions:</p>
         * <ul>
         * <li>The primary instance is in the Running state.</li>
         * <li>The primary and secondary instances are in the same region.</li>
         * <li>The primary and secondary instances are in the same zone.</li>
         * <li>The primary instance is associated with fewer than 10 secondary instances.</li>
         * <li>The primary and secondary instances belong to the same Alibaba Cloud account.</li>
         * </ul>
         * </blockquote>
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
         * <li>Month: Monthly billing.</li>
         * <li>Hour: Hourly billing.<blockquote>
         * <ul>
         * <li>PrePaid supports only Month.</li>
         * <li>PostPaid supports only Hour.</li>
         * <li>For Shared instances, this parameter is automatically set to Hour and does not need to be specified.</li>
         * </ul>
         * </blockquote>
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
         * <p>The region ID. You can go to &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-endpoint">service registration endpoints</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/hologres/developer-reference/api-hologram-2022-06-01-endpoint">service registration endpoints</a> to view the supported regions.</p>
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
         * <p>The ID of the resource group. If this parameter is left empty, the default resource group of the account is used.</p>
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
         * <p>The standard storage capacity of the instance. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is ignored for pay-as-you-go instances.</p>
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
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>redundant</p>
         */
        public Builder storageType(String storageType) {
            this.putBodyParameter("storageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. The zone ID of the vSwitch must be the same as that of the instance.</p>
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
         * <p>The ID of the virtual private cloud (VPC). The region ID of the VPC must be the same as that of the instance.</p>
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
         * <p>The zone ID. Refer to the usage notes.</p>
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
