// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RenewResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>RenewResourcePackageRequest</p>
 */
public class RenewResourcePackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveDate")
    private String effectiveDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(RenewResourcePackageRequest request) {
            super(request);
            this.duration = request.duration;
            this.effectiveDate = request.effectiveDate;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.pricingCycle = request.pricingCycle;
        } 

        /**
         * <p>The renewal period of the resource plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The time when the resource plan takes effect. If you leave this parameter empty, the resource plan immediately takes effect by default.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02T12:00:00Z</p>
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * <p>The ID of the resource plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lskd****sljhsdj</p>
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
         * <p>The unit of the validity period for the resource plan. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * <p>Default value: Month.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
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
