// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
    private String regionId;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("MaxConnections")
    private Integer maxConnections;

    @Query
    @NameInMap("MaxEipTps")
    private Long maxEipTps;

    @Query
    @NameInMap("MaxPrivateTps")
    @Validation(required = true)
    private Long maxPrivateTps;

    @Query
    @NameInMap("PaymentType")
    @Validation(required = true)
    private String paymentType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodCycle")
    private String periodCycle;

    @Query
    @NameInMap("QueueCapacity")
    @Validation(required = true)
    private Integer queueCapacity;

    @Query
    @NameInMap("StorageSize")
    private Integer storageSize;

    @Query
    @NameInMap("SupportEip")
    private Boolean supportEip;

    @Query
    @NameInMap("SupportTracing")
    private Boolean supportTracing;

    @Query
    @NameInMap("TracingStorageTime")
    private Integer tracingStorageTime;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.instanceType = builder.instanceType;
        this.maxConnections = builder.maxConnections;
        this.maxEipTps = builder.maxEipTps;
        this.maxPrivateTps = builder.maxPrivateTps;
        this.paymentType = builder.paymentType;
        this.period = builder.period;
        this.periodCycle = builder.periodCycle;
        this.queueCapacity = builder.queueCapacity;
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
        private String instanceType; 
        private Integer maxConnections; 
        private Long maxEipTps; 
        private Long maxPrivateTps; 
        private String paymentType; 
        private Integer period; 
        private String periodCycle; 
        private Integer queueCapacity; 
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
            this.instanceType = request.instanceType;
            this.maxConnections = request.maxConnections;
            this.maxEipTps = request.maxEipTps;
            this.maxPrivateTps = request.maxPrivateTps;
            this.paymentType = request.paymentType;
            this.period = request.period;
            this.periodCycle = request.periodCycle;
            this.queueCapacity = request.queueCapacity;
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
