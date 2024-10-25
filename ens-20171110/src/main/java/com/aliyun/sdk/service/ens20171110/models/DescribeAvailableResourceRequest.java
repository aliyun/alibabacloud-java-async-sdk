// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceRequest</p>
 */
public class DescribeAvailableResourceRequest extends Request {
    private DescribeAvailableResourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceRequest request) {
            super(request);
        } 

        @Override
        public DescribeAvailableResourceRequest build() {
            return new DescribeAvailableResourceRequest(this);
        } 

    } 

}
