// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateInstancesRequest</p>
 */
public class CreateInstancesRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(maximum = 200, minimum = 1)
    private Integer amount;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    @Validation(maximum = 36, minimum = 1)
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataDiskSize")
    @Validation(maximum = 16380)
    private Long dataDiskSize;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Period")
    @Validation(required = true, maximum = 36, minimum = 1)
    private Integer period;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.dataDiskSize = builder.dataDiskSize;
        this.imageId = builder.imageId;
        this.period = builder.period;
        this.planId = builder.planId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataDiskSize
     */
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateInstancesRequest, Builder> {
        private Integer amount; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String chargeType; 
        private String clientToken; 
        private Long dataDiskSize; 
        private String imageId; 
        private Integer period; 
        private String planId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.dataDiskSize = request.dataDiskSize;
            this.imageId = request.imageId;
            this.period = request.period;
            this.planId = request.planId;
            this.regionId = request.regionId;
        } 

        /**
         * The number of simple application servers that you want to create. Valid values: 1 to 20.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal. Valid values:
         * <p>
         * 
         * *   true: enables auto-renewal.
         * *   false: does not enable auto-renewal.
         * 
         * Default value: false.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period. This parameter is required only when you set `AutoRenew` to true. Unit: months Valid values: 1, 3, 6, 12, 24, and 36.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The billing method of the simple application server. Set the value to PrePaid, which indicates the subscription billing method. Only the subscription billing method is supported.
         * <p>
         * 
         * Default value: PrePaid.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.**** For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The size of the data disk. Unit: GB. Valid values: 0 to 16380. The value must be an integral multiple of 20.
         * <p>
         * 
         * *   A value of 0 indicates that no data disk is attached.
         * *   If the disk included in the specified plan is a standard SSD, the data disk must be 20 GB or larger in size.
         * 
         * Default value: 0.
         */
        public Builder dataDiskSize(Long dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * The ID of the image. You can call the [ListImages](~~189313~~) operation to query the available images in the specified region.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The subscription period. Unit: months Valid values: 1, 3, 6, 12, 24, and 36.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the plan. You can call the [ListPlans](~~189314~~) operation to query all the plans provided by Simple Application Server in the specified region.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * The region ID of the simple application servers. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateInstancesRequest build() {
            return new CreateInstancesRequest(this);
        } 

    } 

}
