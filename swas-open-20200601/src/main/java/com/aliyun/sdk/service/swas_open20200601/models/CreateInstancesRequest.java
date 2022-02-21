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

        private Builder(CreateInstancesRequest response) {
            super(response);
            this.amount = response.amount;
            this.autoRenew = response.autoRenew;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.chargeType = response.chargeType;
            this.clientToken = response.clientToken;
            this.dataDiskSize = response.dataDiskSize;
            this.imageId = response.imageId;
            this.period = response.period;
            this.planId = response.planId;
            this.regionId = response.regionId;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
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
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
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
         * DataDiskSize.
         */
        public Builder dataDiskSize(Long dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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

        @Override
        public CreateInstancesRequest build() {
            return new CreateInstancesRequest(this);
        } 

    } 

}
