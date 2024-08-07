// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInvalidDomainCountRequest} extends {@link RequestModel}
 *
 * <p>GetInvalidDomainCountRequest</p>
 */
public class GetInvalidDomainCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetInvalidDomainCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInvalidDomainCountRequest create() {
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

    public static final class Builder extends Request.Builder<GetInvalidDomainCountRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInvalidDomainCountRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetInvalidDomainCountRequest build() {
            return new GetInvalidDomainCountRequest(this);
        } 

    } 

}
