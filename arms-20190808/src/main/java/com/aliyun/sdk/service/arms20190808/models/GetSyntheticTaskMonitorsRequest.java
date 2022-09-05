// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskMonitorsRequest} extends {@link RequestModel}
 *
 * <p>GetSyntheticTaskMonitorsRequest</p>
 */
public class GetSyntheticTaskMonitorsRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetSyntheticTaskMonitorsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticTaskMonitorsRequest create() {
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

    public static final class Builder extends Request.Builder<GetSyntheticTaskMonitorsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSyntheticTaskMonitorsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetSyntheticTaskMonitorsRequest build() {
            return new GetSyntheticTaskMonitorsRequest(this);
        } 

    } 

}
