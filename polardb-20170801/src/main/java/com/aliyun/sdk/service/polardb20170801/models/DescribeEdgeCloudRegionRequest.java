// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEdgeCloudRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeCloudRegionRequest</p>
 */
public class DescribeEdgeCloudRegionRequest extends Request {
    private DescribeEdgeCloudRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeCloudRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEdgeCloudRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeCloudRegionRequest request) {
            super(request);
        } 

        @Override
        public DescribeEdgeCloudRegionRequest build() {
            return new DescribeEdgeCloudRegionRequest(this);
        } 

    } 

}
