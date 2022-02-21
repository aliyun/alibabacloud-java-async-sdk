// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDtsInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDtsInstanceRequest</p>
 */
public class CreateDtsInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("ComputeUnit")
    @Validation(maximum = 999999, minimum = 1)
    private Integer computeUnit;

    @Query
    @NameInMap("DatabaseCount")
    @Validation(maximum = 10000, minimum = 1)
    private Integer databaseCount;

    @Query
    @NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @Query
    @NameInMap("DestinationRegion")
    private String destinationRegion;

    @Query
    @NameInMap("FeeType")
    private String feeType;

    @Query
    @NameInMap("InstanceClass")
    private String instanceClass;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Quantity")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer quantity;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @Query
    @NameInMap("SourceRegion")
    private String sourceRegion;

    @Query
    @NameInMap("SyncArchitecture")
    private String syncArchitecture;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UsedTime")
    @Validation(maximum = 10000, minimum = 1)
    private Integer usedTime;

    private CreateDtsInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoStart = builder.autoStart;
        this.computeUnit = builder.computeUnit;
        this.databaseCount = builder.databaseCount;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationRegion = builder.destinationRegion;
        this.feeType = builder.feeType;
        this.instanceClass = builder.instanceClass;
        this.jobId = builder.jobId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceRegion = builder.sourceRegion;
        this.syncArchitecture = builder.syncArchitecture;
        this.type = builder.type;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDtsInstanceRequest create() {
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
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return computeUnit
     */
    public Integer getComputeUnit() {
        return this.computeUnit;
    }

    /**
     * @return databaseCount
     */
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return feeType
     */
    public String getFeeType() {
        return this.feeType;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return syncArchitecture
     */
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateDtsInstanceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoStart; 
        private Integer computeUnit; 
        private Integer databaseCount; 
        private String destinationEndpointEngineName; 
        private String destinationRegion; 
        private String feeType; 
        private String instanceClass; 
        private String jobId; 
        private String payType; 
        private String period; 
        private Integer quantity; 
        private String regionId; 
        private String sourceEndpointEngineName; 
        private String sourceRegion; 
        private String syncArchitecture; 
        private String type; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDtsInstanceRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.autoStart = response.autoStart;
            this.computeUnit = response.computeUnit;
            this.databaseCount = response.databaseCount;
            this.destinationEndpointEngineName = response.destinationEndpointEngineName;
            this.destinationRegion = response.destinationRegion;
            this.feeType = response.feeType;
            this.instanceClass = response.instanceClass;
            this.jobId = response.jobId;
            this.payType = response.payType;
            this.period = response.period;
            this.quantity = response.quantity;
            this.regionId = response.regionId;
            this.sourceEndpointEngineName = response.sourceEndpointEngineName;
            this.sourceRegion = response.sourceRegion;
            this.syncArchitecture = response.syncArchitecture;
            this.type = response.type;
            this.usedTime = response.usedTime;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoStart.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * ComputeUnit.
         */
        public Builder computeUnit(Integer computeUnit) {
            this.putQueryParameter("ComputeUnit", computeUnit);
            this.computeUnit = computeUnit;
            return this;
        }

        /**
         * DatabaseCount.
         */
        public Builder databaseCount(Integer databaseCount) {
            this.putQueryParameter("DatabaseCount", databaseCount);
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * DestinationEndpointEngineName.
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * DestinationRegion.
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * FeeType.
         */
        public Builder feeType(String feeType) {
            this.putQueryParameter("FeeType", feeType);
            this.feeType = feeType;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceEndpointEngineName.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * SourceRegion.
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * SyncArchitecture.
         */
        public Builder syncArchitecture(String syncArchitecture) {
            this.putQueryParameter("SyncArchitecture", syncArchitecture);
            this.syncArchitecture = syncArchitecture;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateDtsInstanceRequest build() {
            return new CreateDtsInstanceRequest(this);
        } 

    } 

}
