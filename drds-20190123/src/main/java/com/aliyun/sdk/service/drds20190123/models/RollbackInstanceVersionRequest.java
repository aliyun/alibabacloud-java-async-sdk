// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackInstanceVersionRequest} extends {@link RequestModel}
 *
 * <p>RollbackInstanceVersionRequest</p>
 */
public class RollbackInstanceVersionRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private RollbackInstanceVersionRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackInstanceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RollbackInstanceVersionRequest, Builder> {
        private String drdsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackInstanceVersionRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The instance ID.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RollbackInstanceVersionRequest build() {
            return new RollbackInstanceVersionRequest(this);
        } 

    } 

}
