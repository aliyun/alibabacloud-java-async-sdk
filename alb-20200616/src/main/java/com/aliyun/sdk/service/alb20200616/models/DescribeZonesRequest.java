// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeZonesRequest</p>
 */
public class DescribeZonesRequest extends Request {
    private DescribeZonesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeZonesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest response) {
            super(response);
        } 

        @Override
        public DescribeZonesRequest build() {
            return new DescribeZonesRequest(this);
        } 

    } 

}
