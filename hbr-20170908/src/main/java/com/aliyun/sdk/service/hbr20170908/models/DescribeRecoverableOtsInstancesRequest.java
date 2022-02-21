// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecoverableOtsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecoverableOtsInstancesRequest</p>
 */
public class DescribeRecoverableOtsInstancesRequest extends Request {
    private DescribeRecoverableOtsInstancesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecoverableOtsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeRecoverableOtsInstancesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeRecoverableOtsInstancesRequest response) {
            super(response);
        } 

        @Override
        public DescribeRecoverableOtsInstancesRequest build() {
            return new DescribeRecoverableOtsInstancesRequest(this);
        } 

    } 

}
