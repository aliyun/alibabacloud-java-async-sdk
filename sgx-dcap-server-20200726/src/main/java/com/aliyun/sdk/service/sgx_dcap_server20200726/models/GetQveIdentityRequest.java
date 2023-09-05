// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQveIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetQveIdentityRequest</p>
 */
public class GetQveIdentityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetQveIdentityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQveIdentityRequest create() {
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

    public static final class Builder extends Request.Builder<GetQveIdentityRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetQveIdentityRequest request) {
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
        public GetQveIdentityRequest build() {
            return new GetQveIdentityRequest(this);
        } 

    } 

}
