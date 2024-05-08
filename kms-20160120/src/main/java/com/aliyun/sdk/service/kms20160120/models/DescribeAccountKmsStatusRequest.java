// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountKmsStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountKmsStatusRequest</p>
 */
public class DescribeAccountKmsStatusRequest extends Request {
    private DescribeAccountKmsStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountKmsStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAccountKmsStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountKmsStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeAccountKmsStatusRequest build() {
            return new DescribeAccountKmsStatusRequest(this);
        } 

    } 

}
