// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQeIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetQeIdentityRequest</p>
 */
public class GetQeIdentityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetQeIdentityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQeIdentityRequest create() {
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

    public static final class Builder extends Request.Builder<GetQeIdentityRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetQeIdentityRequest request) {
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
        public GetQeIdentityRequest build() {
            return new GetQeIdentityRequest(this);
        } 

    } 

}
