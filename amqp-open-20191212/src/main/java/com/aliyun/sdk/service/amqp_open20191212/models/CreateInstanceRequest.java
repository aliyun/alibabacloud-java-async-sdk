// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

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
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.maxConnections = builder.maxConnections;
        this.maxEipTps = builder.maxEipTps;
        this.maxPrivateTps = builder.maxPrivateTps;
        this.paymentType = builder.paymentType;
        this.period = builder.period;
        this.periodCycle = builder.periodCycle;
        this.queueCapacity = builder.queueCapacity;
        this.renewStatus = builder.renewStatus;
        this.renewalDurationUnit = builder.renewalDurationUnit;
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
        private String instanceName; 
        private String instanceType; 
        private Integer maxConnections; 
        private Long maxEipTps; 
        private Long maxPrivateTps; 
        private String paymentType; 
        private Integer period; 
        private String periodCycle; 
        private Integer queueCapacity; 
        private String renewStatus; 
        private String renewalDurationUnit; 
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
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.maxConnections = request.maxConnections;
            this.maxEipTps = request.maxEipTps;
            this.maxPrivateTps = request.maxPrivateTps;
            this.paymentType = request.paymentType;
            this.period = request.period;
            this.periodCycle = request.periodCycle;
            this.queueCapacity = request.queueCapacity;
            this.renewStatus = request.renewStatus;
            this.renewalDurationUnit = request.renewalDurationUnit;
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
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * MaxConnections.
         */
        public Builder maxConnections(Integer maxConnections) {
            this.putQueryParameter("MaxConnections", maxConnections);
            this.maxConnections = maxConnections;
            return this;
        }

        /**
         * MaxEipTps.
         */
        public Builder maxEipTps(Long maxEipTps) {
            this.putQueryParameter("MaxEipTps", maxEipTps);
            this.maxEipTps = maxEipTps;
            return this;
        }

        /**
         * MaxPrivateTps.
         */
        public Builder maxPrivateTps(Long maxPrivateTps) {
            this.putQueryParameter("MaxPrivateTps", maxPrivateTps);
            this.maxPrivateTps = maxPrivateTps;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
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
         * PeriodCycle.
         */
        public Builder periodCycle(String periodCycle) {
            this.putQueryParameter("PeriodCycle", periodCycle);
            this.periodCycle = periodCycle;
            return this;
        }

        /**
         * QueueCapacity.
         */
        public Builder queueCapacity(Integer queueCapacity) {
            this.putQueryParameter("QueueCapacity", queueCapacity);
            this.queueCapacity = queueCapacity;
            return this;
        }

        /**
         * autoRenew和renewStatus都是续费方式，当两个同时填写时，以renewStatus为准
         */
        public Builder renewStatus(String renewStatus) {
            this.putQueryParameter("RenewStatus", renewStatus);
            this.renewStatus = renewStatus;
            return this;
        }

        /**
         * RenewalDurationUnit.
         */
        public Builder renewalDurationUnit(String renewalDurationUnit) {
            this.putQueryParameter("RenewalDurationUnit", renewalDurationUnit);
            this.renewalDurationUnit = renewalDurationUnit;
            return this;
        }

        /**
         * ServerlessChargeType.
         */
        public Builder serverlessChargeType(String serverlessChargeType) {
            this.putQueryParameter("ServerlessChargeType", serverlessChargeType);
            this.serverlessChargeType = serverlessChargeType;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Integer storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * SupportEip.
         */
        public Builder supportEip(Boolean supportEip) {
            this.putQueryParameter("SupportEip", supportEip);
            this.supportEip = supportEip;
            return this;
        }

        /**
         * SupportTracing.
         */
        public Builder supportTracing(Boolean supportTracing) {
            this.putQueryParameter("SupportTracing", supportTracing);
            this.supportTracing = supportTracing;
            return this;
        }

        /**
         * TracingStorageTime.
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
