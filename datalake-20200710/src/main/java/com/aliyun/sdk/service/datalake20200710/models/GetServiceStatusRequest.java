// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceStatusRequest</p>
 */
public class GetServiceStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetServiceStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetServiceStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceStatusRequest response) {
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
        public GetServiceStatusRequest build() {
            return new GetServiceStatusRequest(this);
        } 

    } 

}
