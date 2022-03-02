// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionsRequest</p>
 */
public class DescribeRegionsRequest extends Request {
    @Query
    @NameInMap("regions")
    private String regions;

    private DescribeRegionsRequest(Builder builder) {
        super(builder);
        this.regions = builder.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    public static final class Builder extends Request.Builder<DescribeRegionsRequest, Builder> {
        private String regions; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionsRequest request) {
            super(request);
            this.regions = request.regions;
        } 

        /**
         * regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("regions", regions);
            this.regions = regions;
            return this;
        }

        @Override
        public DescribeRegionsRequest build() {
            return new DescribeRegionsRequest(this);
        } 

    } 

}
