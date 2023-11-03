// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSaleRequest} extends {@link RequestModel}
 *
 * <p>GetCheckSaleRequest</p>
 */
public class GetCheckSaleRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetCheckSaleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSaleRequest create() {
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

    public static final class Builder extends Request.Builder<GetCheckSaleRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckSaleRequest request) {
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
        public GetCheckSaleRequest build() {
            return new GetCheckSaleRequest(this);
        } 

    } 

}
