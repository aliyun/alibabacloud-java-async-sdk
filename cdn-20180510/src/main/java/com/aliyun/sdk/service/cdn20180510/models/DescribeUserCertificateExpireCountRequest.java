// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateExpireCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserCertificateExpireCountRequest</p>
 */
public class DescribeUserCertificateExpireCountRequest extends Request {
    private DescribeUserCertificateExpireCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateExpireCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUserCertificateExpireCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUserCertificateExpireCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeUserCertificateExpireCountRequest build() {
            return new DescribeUserCertificateExpireCountRequest(this);
        } 

    } 

}
