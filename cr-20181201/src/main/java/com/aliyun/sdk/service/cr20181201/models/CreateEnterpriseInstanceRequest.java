// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnterpriseInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseInstanceRequest</p>
 */
public class CreateEnterpriseInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("DefaultBucket")
    @Validation(required = true)
    private String defaultBucket;

    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("InstanceStorageName")
    private String instanceStorageName;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    @Validation(required = true)
    private String periodUnit;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private CreateEnterpriseInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.defaultBucket = builder.defaultBucket;
        this.instanceName = builder.instanceName;
        this.instanceStorageName = builder.instanceStorageName;
        this.instanceType = builder.instanceType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseInstanceRequest create() {
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
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return defaultBucket
     */
    public String getDefaultBucket() {
        return this.defaultBucket;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceStorageName
     */
    public String getInstanceStorageName() {
        return this.instanceStorageName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateEnterpriseInstanceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private String defaultBucket; 
        private String instanceName; 
        private String instanceStorageName; 
        private String instanceType; 
        private Integer period; 
        private String periodUnit; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseInstanceRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.autoRenew = response.autoRenew;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.autoUseCoupon = response.autoUseCoupon;
            this.defaultBucket = response.defaultBucket;
            this.instanceName = response.instanceName;
            this.instanceStorageName = response.instanceStorageName;
            this.instanceType = response.instanceType;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.region = response.region;
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
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * DefaultBucket.
         */
        public Builder defaultBucket(String defaultBucket) {
            this.putQueryParameter("DefaultBucket", defaultBucket);
            this.defaultBucket = defaultBucket;
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
         * InstanceStorageName.
         */
        public Builder instanceStorageName(String instanceStorageName) {
            this.putQueryParameter("InstanceStorageName", instanceStorageName);
            this.instanceStorageName = instanceStorageName;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateEnterpriseInstanceRequest build() {
            return new CreateEnterpriseInstanceRequest(this);
        } 

    } 

}
