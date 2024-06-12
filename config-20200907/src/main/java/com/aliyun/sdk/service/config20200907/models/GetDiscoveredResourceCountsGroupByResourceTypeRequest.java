// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceCountsGroupByResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceCountsGroupByResourceTypeRequest</p>
 */
public class GetDiscoveredResourceCountsGroupByResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private GetDiscoveredResourceCountsGroupByResourceTypeRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceCountsGroupByResourceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetDiscoveredResourceCountsGroupByResourceTypeRequest, Builder> {
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceCountsGroupByResourceTypeRequest request) {
            super(request);
            this.region = request.region;
        } 

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetDiscoveredResourceCountsGroupByResourceTypeRequest build() {
            return new GetDiscoveredResourceCountsGroupByResourceTypeRequest(this);
        } 

    } 

}
