// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRegionStatusRequest</p>
 */
public class GetRegionStatusRequest extends Request {
    @Host
    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetRegionStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetRegionStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegionStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRegionStatusRequest build() {
            return new GetRegionStatusRequest(this);
        } 

    } 

}
