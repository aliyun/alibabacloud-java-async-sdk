// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeKvAccountStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeKvAccountStatusRequest</p>
 */
public class DescribeKvAccountStatusRequest extends Request {
    private DescribeKvAccountStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKvAccountStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeKvAccountStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeKvAccountStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeKvAccountStatusRequest build() {
            return new DescribeKvAccountStatusRequest(this);
        } 

    } 

}
