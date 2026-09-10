// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetMetaOssTempKeyRequest} extends {@link RequestModel}
 *
 * <p>GetMetaOssTempKeyRequest</p>
 */
public class GetMetaOssTempKeyRequest extends Request {
    private GetMetaOssTempKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaOssTempKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMetaOssTempKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMetaOssTempKeyRequest request) {
            super(request);
        } 

        @Override
        public GetMetaOssTempKeyRequest build() {
            return new GetMetaOssTempKeyRequest(this);
        } 

    } 

}
