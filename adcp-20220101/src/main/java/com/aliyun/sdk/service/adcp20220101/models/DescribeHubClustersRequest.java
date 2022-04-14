// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeHubClustersRequest</p>
 */
public class DescribeHubClustersRequest extends Request {
    private DescribeHubClustersRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeHubClustersRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeHubClustersRequest request) {
            super(request);
        } 

        @Override
        public DescribeHubClustersRequest build() {
            return new DescribeHubClustersRequest(this);
        } 

    } 

}
