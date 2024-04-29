// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageScanAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageScanAuthorizationRequest</p>
 */
public class DescribeImageScanAuthorizationRequest extends Request {
    private DescribeImageScanAuthorizationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageScanAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeImageScanAuthorizationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeImageScanAuthorizationRequest request) {
            super(request);
        } 

        @Override
        public DescribeImageScanAuthorizationRequest build() {
            return new DescribeImageScanAuthorizationRequest(this);
        } 

    } 

}
