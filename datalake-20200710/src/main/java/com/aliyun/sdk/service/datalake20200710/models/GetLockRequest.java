// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLockRequest} extends {@link RequestModel}
 *
 * <p>GetLockRequest</p>
 */
public class GetLockRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockId")
    private Long lockId;

    private GetLockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lockId = builder.lockId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLockRequest create() {
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

    public static final class Builder extends Request.Builder<GetLockRequest, Builder> {
        private String regionId; 
        private Long lockId; 

        private Builder() {
            super();
        } 

        private Builder(GetLockRequest request) {
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
        public GetLockRequest build() {
            return new GetLockRequest(this);
        } 

    } 

}
