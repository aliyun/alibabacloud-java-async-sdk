// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudGtmSystemLinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudGtmSystemLinesRequest</p>
 */
public class DescribeCloudGtmSystemLinesRequest extends Request {
    private DescribeCloudGtmSystemLinesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmSystemLinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCloudGtmSystemLinesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudGtmSystemLinesRequest request) {
            super(request);
        } 

        @Override
        public DescribeCloudGtmSystemLinesRequest build() {
            return new DescribeCloudGtmSystemLinesRequest(this);
        } 

    } 

}
