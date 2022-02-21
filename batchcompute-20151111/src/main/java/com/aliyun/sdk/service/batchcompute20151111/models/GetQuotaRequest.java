// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
