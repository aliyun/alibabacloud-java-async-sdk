// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link GetUserPhoneRequest} extends {@link RequestModel}
 *
 * <p>GetUserPhoneRequest</p>
 */
public class GetUserPhoneRequest extends Request {
    private GetUserPhoneRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPhoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUserPhoneRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUserPhoneRequest request) {
            super(request);
        } 

        @Override
        public GetUserPhoneRequest build() {
            return new GetUserPhoneRequest(this);
        } 

    } 

}
