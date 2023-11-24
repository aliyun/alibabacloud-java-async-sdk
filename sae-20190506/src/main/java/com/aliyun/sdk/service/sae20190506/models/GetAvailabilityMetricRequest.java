// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailabilityMetricRequest} extends {@link RequestModel}
 *
 * <p>GetAvailabilityMetricRequest</p>
 */
public class GetAvailabilityMetricRequest extends Request {
    @Query
    @NameInMap("Limit")
    @Validation(required = true)
    private Long limit;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetAvailabilityMetricRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailabilityMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAvailabilityMetricRequest, Builder> {
        private Long limit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAvailabilityMetricRequest request) {
            super(request);
            this.limit = request.limit;
            this.regionId = request.regionId;
        } 

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
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
        public GetAvailabilityMetricRequest build() {
            return new GetAvailabilityMetricRequest(this);
        } 

    } 

}
