// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImpProductStatusRequest} extends {@link RequestModel}
 *
 * <p>GetImpProductStatusRequest</p>
 */
public class GetImpProductStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetImpProductStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImpProductStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetImpProductStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImpProductStatusRequest response) {
            super(response);
            this.regionId = response.regionId;
        } 

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetImpProductStatusRequest build() {
            return new GetImpProductStatusRequest(this);
        } 

    } 

}
