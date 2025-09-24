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
 * {@link DescribeResourcePackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcePackagesRequest</p>
 */
public class DescribeResourcePackagesRequest extends Request {
    private DescribeResourcePackagesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeResourcePackagesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcePackagesRequest request) {
            super(request);
        } 

        @Override
        public DescribeResourcePackagesRequest build() {
            return new DescribeResourcePackagesRequest(this);
        } 

    } 

}
