// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionClusterInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRegionClusterInfoRequest</p>
 */
public class GetRegionClusterInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetRegionClusterInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionClusterInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetRegionClusterInfoRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegionClusterInfoRequest response) {
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
        public GetRegionClusterInfoRequest build() {
            return new GetRegionClusterInfoRequest(this);
        } 

    } 

}
