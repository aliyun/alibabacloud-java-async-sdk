// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCertificatePackageCountRequest} extends {@link RequestModel}
 *
 * <p>GetCertificatePackageCountRequest</p>
 */
public class GetCertificatePackageCountRequest extends Request {
    private GetCertificatePackageCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificatePackageCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCertificatePackageCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCertificatePackageCountRequest request) {
            super(request);
        } 

        @Override
        public GetCertificatePackageCountRequest build() {
            return new GetCertificatePackageCountRequest(this);
        } 

    } 

}
