// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDiskAvailableResourceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDiskAvailableResourceInfoRequest</p>
 */
public class DescribeCloudDiskAvailableResourceInfoRequest extends Request {
    private DescribeCloudDiskAvailableResourceInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskAvailableResourceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCloudDiskAvailableResourceInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDiskAvailableResourceInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeCloudDiskAvailableResourceInfoRequest build() {
            return new DescribeCloudDiskAvailableResourceInfoRequest(this);
        } 

    } 

}
