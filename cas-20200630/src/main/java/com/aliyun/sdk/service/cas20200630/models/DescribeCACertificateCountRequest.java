// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeCACertificateCountRequest</p>
 */
public class DescribeCACertificateCountRequest extends Request {
    private DescribeCACertificateCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCACertificateCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCACertificateCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCACertificateCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeCACertificateCountRequest build() {
            return new DescribeCACertificateCountRequest(this);
        } 

    } 

}
