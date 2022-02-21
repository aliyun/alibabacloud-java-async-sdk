// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshesRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshesRequest</p>
 */
public class DescribeServiceMeshesRequest extends Request {
    private DescribeServiceMeshesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshesRequest response) {
            super(response);
        } 

        @Override
        public DescribeServiceMeshesRequest build() {
            return new DescribeServiceMeshesRequest(this);
        } 

    } 

}
