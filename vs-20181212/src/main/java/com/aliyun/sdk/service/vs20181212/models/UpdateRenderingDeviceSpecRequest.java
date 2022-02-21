// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRenderingDeviceSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateRenderingDeviceSpecRequest</p>
 */
public class UpdateRenderingDeviceSpecRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Long autoRenewPeriod;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EffectiveTime")
    private Boolean effectiveTime;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Specification")
    private String specification;

    private UpdateRenderingDeviceSpecRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.description = builder.description;
        this.effectiveTime = builder.effectiveTime;
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.specification = builder.specification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRenderingDeviceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectiveTime
     */
    public Boolean getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    public static final class Builder extends Request.Builder<UpdateRenderingDeviceSpecRequest, Builder> {
        private Boolean autoRenew; 
        private Long autoRenewPeriod; 
        private String description; 
        private Boolean effectiveTime; 
        private String instanceIds; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String specification; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRenderingDeviceSpecRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.description = response.description;
            this.effectiveTime = response.effectiveTime;
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.specification = response.specification;
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
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EffectiveTime.
         */
        public Builder effectiveTime(Boolean effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * Specification.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        @Override
        public UpdateRenderingDeviceSpecRequest build() {
            return new UpdateRenderingDeviceSpecRequest(this);
        } 

    } 

}
