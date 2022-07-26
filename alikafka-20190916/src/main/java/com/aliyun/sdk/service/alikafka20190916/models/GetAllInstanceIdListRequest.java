// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllInstanceIdListRequest} extends {@link RequestModel}
 *
 * <p>GetAllInstanceIdListRequest</p>
 */
public class GetAllInstanceIdListRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetAllInstanceIdListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllInstanceIdListRequest create() {
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

    public static final class Builder extends Request.Builder<GetAllInstanceIdListRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAllInstanceIdListRequest request) {
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
        public GetAllInstanceIdListRequest build() {
            return new GetAllInstanceIdListRequest(this);
        } 

    } 

}
