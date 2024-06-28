// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeResourcePackageRequest</p>
 */
public class UpgradeResourcePackageRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Specification")
    private String specification;

    private UpgradeResourcePackageRequest(Builder builder) {
        super(builder);
        this.effectiveDate = builder.effectiveDate;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.specification = builder.specification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeResourcePackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    public static final class Builder extends Request.Builder<UpgradeResourcePackageRequest, Builder> {
        private String effectiveDate; 
        private String instanceId; 
        private Long ownerId; 
        private String specification; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeResourcePackageRequest request) {
            super(request);
            this.effectiveDate = request.effectiveDate;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.specification = request.specification;
        } 

        /**
         * The time when the resource plan takes effect. If you leave this parameter empty, the resource plan immediately takes effect by default.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * The ID of the resource plan.
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
         * The specifications to which you want to upgrade the resource plan.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        @Override
        public UpgradeResourcePackageRequest build() {
            return new UpgradeResourcePackageRequest(this);
        } 

    } 

}
