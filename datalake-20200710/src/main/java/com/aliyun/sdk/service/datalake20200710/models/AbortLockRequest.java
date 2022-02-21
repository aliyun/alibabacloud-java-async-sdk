// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortLockRequest} extends {@link RequestModel}
 *
 * <p>AbortLockRequest</p>
 */
public class AbortLockRequest extends Request {
    @Query
    @NameInMap("LockId")
    private Long lockId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AbortLockRequest(Builder builder) {
        super(builder);
        this.lockId = builder.lockId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lockId
     */
    public Long getLockId() {
        return this.lockId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AbortLockRequest, Builder> {
        private Long lockId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AbortLockRequest response) {
            super(response);
            this.lockId = response.lockId;
            this.regionId = response.regionId;
        } 

        /**
         * LockId
         */
        public Builder lockId(Long lockId) {
            this.putQueryParameter("LockId", lockId);
            this.lockId = lockId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AbortLockRequest build() {
            return new AbortLockRequest(this);
        } 

    } 

}
