// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageStorageCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetPackageStorageCredentialRequest</p>
 */
public class GetPackageStorageCredentialRequest extends Request {
    private GetPackageStorageCredentialRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageStorageCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetPackageStorageCredentialRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetPackageStorageCredentialRequest request) {
            super(request);
        } 

        @Override
        public GetPackageStorageCredentialRequest build() {
            return new GetPackageStorageCredentialRequest(this);
        } 

    } 

}
