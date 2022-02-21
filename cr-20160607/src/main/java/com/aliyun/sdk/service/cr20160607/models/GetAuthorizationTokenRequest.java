// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAuthorizationTokenRequest</p>
 */
public class GetAuthorizationTokenRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetAuthorizationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetAuthorizationTokenRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthorizationTokenRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public GetAuthorizationTokenRequest build() {
            return new GetAuthorizationTokenRequest(this);
        } 

    } 

}
