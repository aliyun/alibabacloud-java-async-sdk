// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserCertificateExpireCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserCertificateExpireCountRequest</p>
 */
public class DescribeDcdnUserCertificateExpireCountRequest extends Request {
    private DescribeDcdnUserCertificateExpireCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserCertificateExpireCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserCertificateExpireCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserCertificateExpireCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnUserCertificateExpireCountRequest build() {
            return new DescribeDcdnUserCertificateExpireCountRequest(this);
        } 

    } 

}
