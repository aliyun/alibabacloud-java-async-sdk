// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterStatusSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterStatusSetRequest</p>
 */
public class DescribeClusterStatusSetRequest extends Request {
    private DescribeClusterStatusSetRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterStatusSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeClusterStatusSetRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterStatusSetRequest request) {
            super(request);
        } 

        @Override
        public DescribeClusterStatusSetRequest build() {
            return new DescribeClusterStatusSetRequest(this);
        } 

    } 

}
