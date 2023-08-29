// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnLockRequest} extends {@link RequestModel}
 *
 * <p>UnLockRequest</p>
 */
public class UnLockRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("LockId")
    private Long lockId;

    private UnLockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lockId = builder.lockId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return lockId
     */
    public Long getLockId() {
        return this.lockId;
    }

    public static final class Builder extends Request.Builder<UnLockRequest, Builder> {
        private String regionId; 
        private Long lockId; 

        private Builder() {
            super();
        } 

        private Builder(UnLockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lockId = request.lockId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * LockId
         */
        public Builder lockId(Long lockId) {
            this.putQueryParameter("LockId", lockId);
            this.lockId = lockId;
            return this;
        }

        @Override
        public UnLockRequest build() {
            return new UnLockRequest(this);
        } 

    } 

}
