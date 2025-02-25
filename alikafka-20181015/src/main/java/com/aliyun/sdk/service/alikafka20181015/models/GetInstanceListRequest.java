// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceListRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceListRequest</p>
 */
public class GetInstanceListRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetInstanceListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceListRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceListRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceListRequest request) {
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
        public GetInstanceListRequest build() {
            return new GetInstanceListRequest(this);
        } 

    } 

}
