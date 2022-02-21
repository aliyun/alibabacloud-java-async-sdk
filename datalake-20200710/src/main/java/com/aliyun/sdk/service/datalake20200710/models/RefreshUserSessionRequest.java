// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshUserSessionRequest} extends {@link RequestModel}
 *
 * <p>RefreshUserSessionRequest</p>
 */
public class RefreshUserSessionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RefreshUserSessionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshUserSessionRequest create() {
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

    public static final class Builder extends Request.Builder<RefreshUserSessionRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshUserSessionRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public RefreshUserSessionRequest build() {
            return new RefreshUserSessionRequest(this);
        } 

    } 

}
