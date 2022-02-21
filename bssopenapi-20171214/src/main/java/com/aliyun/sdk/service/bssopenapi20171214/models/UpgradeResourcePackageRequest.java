// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeResourcePackageRequest</p>
 */
public class UpgradeResourcePackageRequest extends Request {
    @Query
    @NameInMap("EffectiveDate")
    private String effectiveDate;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Specification")
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

        private Builder(UpgradeResourcePackageRequest response) {
            super(response);
            this.effectiveDate = response.effectiveDate;
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.specification = response.specification;
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
         * Specification.
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
