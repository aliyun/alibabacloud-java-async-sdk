// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobDuLimitRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobDuLimitRequest</p>
 */
public class ModifyDtsJobDuLimitRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("DuLimit")
    @Validation(required = true)
    private Long duLimit;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDtsJobDuLimitRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.duLimit = builder.duLimit;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobDuLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return duLimit
     */
    public Long getDuLimit() {
        return this.duLimit;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobDuLimitRequest, Builder> {
        private String dtsJobId; 
        private Long duLimit; 
        private String ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobDuLimitRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.duLimit = request.duLimit;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The upper limit of DUs for the DTS task.
         * <p>
         * 
         * >  Minimum value: **1**.
         */
        public Builder duLimit(Long duLimit) {
            this.putQueryParameter("DuLimit", duLimit);
            this.duLimit = duLimit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDtsJobDuLimitRequest build() {
            return new ModifyDtsJobDuLimitRequest(this);
        } 

    } 

}
