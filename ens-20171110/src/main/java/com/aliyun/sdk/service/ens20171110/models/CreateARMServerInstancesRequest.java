// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateARMServerInstancesRequest</p>
 */
public class CreateARMServerInstancesRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer amount;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("Frequency")
    private Integer frequency;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    @Validation(required = true)
    private String periodUnit;

    @Query
    @NameInMap("Resolution")
    private String resolution;

    @Query
    @NameInMap("ServerType")
    @Validation(required = true)
    private String serverType;

    private CreateARMServerInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.ensRegionId = builder.ensRegionId;
        this.frequency = builder.frequency;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.keyPairName = builder.keyPairName;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.resolution = builder.resolution;
        this.serverType = builder.serverType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateARMServerInstancesRequest create() {
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
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return frequency
     */
    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
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
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    public static final class Builder extends Request.Builder<CreateARMServerInstancesRequest, Builder> {
        private Integer amount; 
        private Boolean autoRenew; 
        private String ensRegionId; 
        private Integer frequency; 
        private String imageId; 
        private String instanceType; 
        private String keyPairName; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String resolution; 
        private String serverType; 

        private Builder() {
            super();
        } 

        private Builder(CreateARMServerInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoRenew = request.autoRenew;
            this.ensRegionId = request.ensRegionId;
            this.frequency = request.frequency;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.keyPairName = request.keyPairName;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.resolution = request.resolution;
            this.serverType = request.serverType;
        } 

        /**
         * ?????????????????????10
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * ??????????????????????????????false???
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ENS??????ID???
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * AIC?????????????????????
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * keypair??????
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * ???????????????PrePaid??????????????????????????????????????????
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Month?????????????????????????????????????????????
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * ????????????????????????
         * <p>
         * 1920*1080
         * 1280*720
         * 1080*1920
         * 720*1280
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        @Override
        public CreateARMServerInstancesRequest build() {
            return new CreateARMServerInstancesRequest(this);
        } 

    } 

}
