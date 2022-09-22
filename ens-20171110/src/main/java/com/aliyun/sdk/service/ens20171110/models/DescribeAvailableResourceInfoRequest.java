// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceInfoRequest</p>
 */
public class DescribeAvailableResourceInfoRequest extends Request {
    private DescribeAvailableResourceInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeAvailableResourceInfoRequest build() {
            return new DescribeAvailableResourceInfoRequest(this);
        } 

    } 

}
