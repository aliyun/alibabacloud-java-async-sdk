// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>RenewResourcePackageRequest</p>
 */
public class RenewResourcePackageRequest extends Request {
    @Query
    @NameInMap("Duration")
    @Validation(required = true)
    private Integer duration;

    @Query
    @NameInMap("EffectiveDate")
    private String effectiveDate;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    private RenewResourcePackageRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.effectiveDate = builder.effectiveDate;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewResourcePackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public static final class Builder extends Request.Builder<RenewResourcePackageRequest, Builder> {
        private Integer duration; 
        private String effectiveDate; 
        private String instanceId; 
        private Long ownerId; 
        private String pricingCycle; 

        private Builder() {
            super();
        } 

        private Builder(RenewResourcePackageRequest response) {
            super(response);
            this.duration = response.duration;
            this.effectiveDate = response.effectiveDate;
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.pricingCycle = response.pricingCycle;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * EffectiveDate.
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        @Override
        public RenewResourcePackageRequest build() {
            return new RenewResourcePackageRequest(this);
        } 

    } 

}
