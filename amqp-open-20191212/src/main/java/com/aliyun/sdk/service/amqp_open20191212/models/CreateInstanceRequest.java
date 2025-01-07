// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedInstance")
    private Boolean encryptedInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConnections")
    private Integer maxConnections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEipTps")
    private Long maxEipTps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPrivateTps")
    private Long maxPrivateTps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodCycle")
    private String periodCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueCapacity")
    private Integer queueCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewStatus")
    private String renewStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalDurationUnit")
    private String renewalDurationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessChargeType")
    private String serverlessChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Integer storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportEip")
    private Boolean supportEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportTracing")
    private Boolean supportTracing;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TracingStorageTime")
    private Integer tracingStorageTime;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.encryptedInstance = builder.encryptedInstance;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.kmsKeyId = builder.kmsKeyId;
        this.maxConnections = builder.maxConnections;
        this.maxEipTps = builder.maxEipTps;
        this.maxPrivateTps = builder.maxPrivateTps;
        this.paymentType = builder.paymentType;
        this.period = builder.period;
        this.periodCycle = builder.periodCycle;
        this.queueCapacity = builder.queueCapacity;
        this.renewStatus = builder.renewStatus;
        this.renewalDurationUnit = builder.renewalDurationUnit;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverlessChargeType = builder.serverlessChargeType;
        this.storageSize = builder.storageSize;
        this.supportEip = builder.supportEip;
        this.supportTracing = builder.supportTracing;
        this.tracingStorageTime = builder.tracingStorageTime;
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
     * @return encryptedInstance
     */
    public Boolean getEncryptedInstance() {
        return this.encryptedInstance;
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
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return maxConnections
     */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * @return maxEipTps
     */
    public Long getMaxEipTps() {
        return this.maxEipTps;
    }

    /**
     * @return maxPrivateTps
     */
    public Long getMaxPrivateTps() {
        return this.maxPrivateTps;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodCycle
     */
    public String getPeriodCycle() {
        return this.periodCycle;
    }

    /**
     * @return queueCapacity
     */
    public Integer getQueueCapacity() {
        return this.queueCapacity;
    }

    /**
     * @return renewStatus
     */
    public String getRenewStatus() {
        return this.renewStatus;
    }

    /**
     * @return renewalDurationUnit
     */
    public String getRenewalDurationUnit() {
        return this.renewalDurationUnit;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverlessChargeType
     */
    public String getServerlessChargeType() {
        return this.serverlessChargeType;
    }

    /**
     * @return storageSize
     */
    public Integer getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return supportEip
     */
    public Boolean getSupportEip() {
        return this.supportEip;
    }

    /**
     * @return supportTracing
     */
    public Boolean getSupportTracing() {
        return this.supportTracing;
    }

    /**
     * @return tracingStorageTime
     */
    public Integer getTracingStorageTime() {
        return this.tracingStorageTime;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private Boolean encryptedInstance; 
        private String instanceName; 
        private String instanceType; 
        private String kmsKeyId; 
        private Integer maxConnections; 
        private Long maxEipTps; 
        private Long maxPrivateTps; 
        private String paymentType; 
        private Integer period; 
        private String periodCycle; 
        private Integer queueCapacity; 
        private String renewStatus; 
        private String renewalDurationUnit; 
        private String resourceGroupId; 
        private String serverlessChargeType; 
        private Integer storageSize; 
        private Boolean supportEip; 
        private Boolean supportTracing; 
        private Integer tracingStorageTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.encryptedInstance = request.encryptedInstance;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.kmsKeyId = request.kmsKeyId;
            this.maxConnections = request.maxConnections;
            this.maxEipTps = request.maxEipTps;
            this.maxPrivateTps = request.maxPrivateTps;
            this.paymentType = request.paymentType;
            this.period = request.period;
            this.periodCycle = request.periodCycle;
            this.queueCapacity = request.queueCapacity;
            this.renewStatus = request.renewStatus;
            this.renewalDurationUnit = request.renewalDurationUnit;
            this.resourceGroupId = request.resourceGroupId;
            this.serverlessChargeType = request.serverlessChargeType;
            this.storageSize = request.storageSize;
            this.supportEip = request.supportEip;
            this.supportTracing = request.supportTracing;
            this.tracingStorageTime = request.tracingStorageTime;
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal. If you select this value, you must manually renew the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration. Unit: months.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set AutoRenew to true. Default value: 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c5d1274axxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EncryptedInstance.
         */
        public Builder encryptedInstance(Boolean encryptedInstance) {
            this.putQueryParameter("EncryptedInstance", encryptedInstance);
            this.encryptedInstance = encryptedInstance;
            return this;
        }

        /**
         * <p>The instance name. We recommend that you specify a name that does not exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-xxxxx</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li>professional: Professional Edition</li>
         * <li>enterprise: Enterprise Edition</li>
         * <li>vip: Enterprise Platinum Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * KmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The maximum number of connections that can be established to the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        public Builder maxConnections(Integer maxConnections) {
            this.putQueryParameter("MaxConnections", maxConnections);
            this.maxConnections = maxConnections;
            return this;
        }

        /**
         * <p>The maximum number of EIP-based TPS on the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder maxEipTps(Long maxEipTps) {
            this.putQueryParameter("MaxEipTps", maxEipTps);
            this.maxEipTps = maxEipTps;
            return this;
        }

        /**
         * <p>The maximum number of virtual private cloud (VPC)-based transactions per second (TPS) on the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxPrivateTps(Long maxPrivateTps) {
            this.putQueryParameter("MaxPrivateTps", maxPrivateTps);
            this.maxPrivateTps = maxPrivateTps;
            return this;
        }

        /**
         * <p>The billing method. Valid value:</p>
         * <ul>
         * <li>Subscription</li>
         * </ul>
         * <blockquote>
         * <p> API operations provided by ApsaraMQ for RabbitMQ are supported only by subscription instances. You can set this parameter only to Subscription.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The subscription period. The unit of the subscription period is specified by periodCycle.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set PaymentType to Subscription. Default value: 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set PaymentType to Subscription. Default value: Month.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodCycle(String periodCycle) {
            this.putQueryParameter("PeriodCycle", periodCycle);
            this.periodCycle = periodCycle;
            return this;
        }

        /**
         * <p>The number of queues. Valid values:</p>
         * <ul>
         * <li>Professional Edition: 50 to 1000. The number of queues must increase in increments of 5.</li>
         * <li>Enterprise Edition: 200 to 6000. The number of queues must increase in increments of 100.</li>
         * <li>Enterprise Platinum Edition: 10000 to 80000. The number of queues must increase in increments of 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder queueCapacity(Integer queueCapacity) {
            this.putQueryParameter("QueueCapacity", queueCapacity);
            this.queueCapacity = queueCapacity;
            return this;
        }

        /**
         * <p>The renewal status. This parameter is the same as AutoRenew. You can configure one of these parameters. Valid value:</p>
         * <ul>
         * <li>AutoRenewal</li>
         * </ul>
         * <blockquote>
         * <p>If you configure both this parameter and AutoRenew, the value of this parameter is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder renewStatus(String renewStatus) {
            this.putQueryParameter("RenewStatus", renewStatus);
            this.renewStatus = renewStatus;
            return this;
        }

        /**
         * <p>The unit of the auto-renewal period. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder renewalDurationUnit(String renewalDurationUnit) {
            this.putQueryParameter("RenewalDurationUnit", renewalDurationUnit);
            this.renewalDurationUnit = renewalDurationUnit;
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
         * <p>The billing method of the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>onDemand: You are charged based on your actual usage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onDemand</p>
         */
        public Builder serverlessChargeType(String serverlessChargeType) {
            this.putQueryParameter("ServerlessChargeType", serverlessChargeType);
            this.serverlessChargeType = serverlessChargeType;
            return this;
        }

        /**
         * <p>The storage capacity. Unit: GB. Valid values:</p>
         * <ul>
         * <li>Professional Edition and Enterprise Edition instances: Set this parameter to 0.</li>
         * </ul>
         * <blockquote>
         * <p> The value 0 specifies that storage space is available for Professional Edition and Enterprise Edition instances, but no storage fees are generated.</p>
         * </blockquote>
         * <ul>
         * <li>Platinum Edition instances: Set the value to m × 100, where m ranges from 7 to 28.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder storageSize(Integer storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>Specifies whether elastic IP addresses (EIPs) are supported. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportEip(Boolean supportEip) {
            this.putQueryParameter("SupportEip", supportEip);
            this.supportEip = supportEip;
            return this;
        }

        /**
         * <p>Specifies whether to enable the message trace feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Enterprise Platinum Edition instances allow you to retain message traces for 15 days free of charge. If you use an Enterprise Platinum Edition instance, you can set this parameter only to true and TracingStorageTime only to 15.</p>
         * </li>
         * <li><p>For instances of other editions, you can set this parameter to true or false.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportTracing(Boolean supportTracing) {
            this.putQueryParameter("SupportTracing", supportTracing);
            this.supportTracing = supportTracing;
            return this;
        }

        /**
         * <p>The retention period of messages. Unit: days. Valid values:</p>
         * <ul>
         * <li>3</li>
         * <li>7</li>
         * <li>15</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set SupportTracing to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder tracingStorageTime(Integer tracingStorageTime) {
            this.putQueryParameter("TracingStorageTime", tracingStorageTime);
            this.tracingStorageTime = tracingStorageTime;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
