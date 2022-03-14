// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEntityRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllEntityRequest</p>
 */
public class DescribeAllEntityRequest extends Request {
    private DescribeAllEntityRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeAllEntityRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeAllEntityRequest request) {
            super(request);
        } 

        @Override
        public DescribeAllEntityRequest build() {
            return new DescribeAllEntityRequest(this);
        } 

    } 

}
