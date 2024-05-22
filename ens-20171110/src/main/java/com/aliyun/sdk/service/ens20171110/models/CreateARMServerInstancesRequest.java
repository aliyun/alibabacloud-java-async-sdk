// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateARMServerInstancesRequest</p>
 */
public class CreateARMServerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private Integer frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpace")
    private String nameSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerName")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String serverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverType;

    private CreateARMServerInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.ensRegionId = builder.ensRegionId;
        this.frequency = builder.frequency;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.keyPairName = builder.keyPairName;
        this.nameSpace = builder.nameSpace;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.resolution = builder.resolution;
        this.serverName = builder.serverName;
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
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
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
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
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
        private Boolean autoUseCoupon; 
        private String ensRegionId; 
        private Integer frequency; 
        private String imageId; 
        private String instanceType; 
        private String keyPairName; 
        private String nameSpace; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String resolution; 
        private String serverName; 
        private String serverType; 

        private Builder() {
            super();
        } 

        private Builder(CreateARMServerInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.ensRegionId = request.ensRegionId;
            this.frequency = request.frequency;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.keyPairName = request.keyPairName;
            this.nameSpace = request.nameSpace;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.resolution = request.resolution;
            this.serverName = request.serverName;
            this.serverType = request.serverType;
        } 

        /**
         * The number of instances to create. Valid values: **1** to **100**.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the subscription. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Specifies whether to use coupons. Valid values: true and false Default value: true.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The ID of the Edge Node Service (ENS) node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The refresh rate. Unit: Hz. Valid values: 30 and 60.
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The specification of the Android in Container (AIC) instance. Valid values:
         * <p>
         * 
         * *   aic.cf53r.c1.np
         * *   aic.cf53r.c2.np
         * *   aic.cf53r.c3.np
         * *   aic.cf53r.c4.np
         * *   aic.cf53r.c5.np
         * *   aic.cf53r.c6.np
         * *   aic.cf53r.c7.np
         * *   aic.cf53r.c8.np
         * *   ens.a6c2
         * *   aic.cf52m1r.c1.np
         * *   aic.cf52m1r.c2.np
         * *   aic.cf52m1r.c3.np
         * *   aic.cf52m1r.c4.np
         * *   aic.cf52m1r.c5.np
         * *   aic.cf53r.c6
         * *   aic.cf52m1r.c6
         * *   aic.cf53r.c7
         * *   aic.cf52r.c1.np
         * *   aic.cf52r.c2.np
         * *   aic.cf52r.c3.np
         * *   aic.cf52r.c4.np
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The name of the key pair.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putQueryParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * The billing method. Set the value to **PrePaid**. PrePaid specifies the subscription billing method.
         * <p>
         * 
         * >  Only PrePaid is supported.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription duration of the instance.
         * <p>
         * 
         * *   If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.
         * *   If you set PeriodUnit to Day, you can set Period only to 3.
         * *   If you set PeriodUnit to Month, you can set Period to a value within the range of \[1,9], or set the value to 12.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration.
         * <p>
         * 
         * *   If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.
         * *   If you set PeriodUnit to Day, you can set Period only to 3.
         * *   If you set PeriodUnit to Month, you can set Period to a value within the range of \[1,9], or set the value to 12.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The resolution. Valid values:
         * <p>
         * 
         * *   1920\*1080
         * *   1080\*1920
         * *   1280\*720
         * *   720\*1280
         * *   2400\*1080
         * *   1920\*864
         * *   1080\*2400
         * *   864\*1920
         * 
         * <!---->
         * 
         * *   1920\*1080
         * *   1080\*1920
         * *   1280\*720
         * *   720\*1280
         * *   2400\*1080
         * *   1920\*864
         * *   1080\*2400
         * *   864\*1920
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        /**
         * The specification of the ARM server. Valid values:
         * <p>
         * 
         * *   cas.cf53r
         * *   cas.cf52r
         * *   cas.cf52m1r
         * *   cas.tg52g2
         * *   ens.afq-c2m3i.medium
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
