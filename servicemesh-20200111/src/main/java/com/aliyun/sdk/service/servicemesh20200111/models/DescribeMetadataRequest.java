// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetadataRequest</p>
 */
public class DescribeMetadataRequest extends Request {
    private DescribeMetadataRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMetadataRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMetadataRequest request) {
            super(request);
        } 

        @Override
        public DescribeMetadataRequest build() {
            return new DescribeMetadataRequest(this);
        } 

    } 

}
