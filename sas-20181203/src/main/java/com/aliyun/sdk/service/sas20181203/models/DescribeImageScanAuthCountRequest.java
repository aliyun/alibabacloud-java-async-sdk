// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageScanAuthCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageScanAuthCountRequest</p>
 */
public class DescribeImageScanAuthCountRequest extends Request {
    private DescribeImageScanAuthCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageScanAuthCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeImageScanAuthCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeImageScanAuthCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeImageScanAuthCountRequest build() {
            return new DescribeImageScanAuthCountRequest(this);
        } 

    } 

}
