// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenStatusRequest} extends {@link RequestModel}
 *
 * <p>GetOpenStatusRequest</p>
 */
public class GetOpenStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetOpenStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetOpenStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOpenStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetOpenStatusRequest build() {
            return new GetOpenStatusRequest(this);
        } 

    } 

}
