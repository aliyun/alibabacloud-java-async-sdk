// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeEdasContainersRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdasContainersRequest</p>
 */
public class DescribeEdasContainersRequest extends Request {
    private DescribeEdasContainersRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdasContainersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeEdasContainersRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeEdasContainersRequest request) {
            super(request);
        } 

        @Override
        public DescribeEdasContainersRequest build() {
            return new DescribeEdasContainersRequest(this);
        } 

    } 

}
