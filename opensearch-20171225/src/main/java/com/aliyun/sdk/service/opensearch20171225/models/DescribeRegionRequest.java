// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionRequest</p>
 */
public class DescribeRegionRequest extends Request {
    private DescribeRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionRequest response) {
            super(response);
        } 

        @Override
        public DescribeRegionRequest build() {
            return new DescribeRegionRequest(this);
        } 

    } 

}
