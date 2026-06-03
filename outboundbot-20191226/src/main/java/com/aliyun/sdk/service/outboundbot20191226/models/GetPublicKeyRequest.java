// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>GetPublicKeyRequest</p>
 */
public class GetPublicKeyRequest extends Request {
    private GetPublicKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetPublicKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetPublicKeyRequest request) {
            super(request);
        } 

        @Override
        public GetPublicKeyRequest build() {
            return new GetPublicKeyRequest(this);
        } 

    } 

}
