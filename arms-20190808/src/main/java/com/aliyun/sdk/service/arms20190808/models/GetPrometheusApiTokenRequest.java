// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusApiTokenRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusApiTokenRequest</p>
 */
public class GetPrometheusApiTokenRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetPrometheusApiTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusApiTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetPrometheusApiTokenRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusApiTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public GetPrometheusApiTokenRequest build() {
            return new GetPrometheusApiTokenRequest(this);
        } 

    } 

}
