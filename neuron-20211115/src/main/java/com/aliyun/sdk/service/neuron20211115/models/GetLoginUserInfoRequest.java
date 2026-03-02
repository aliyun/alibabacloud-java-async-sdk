// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetLoginUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLoginUserInfoRequest</p>
 */
public class GetLoginUserInfoRequest extends Request {
    private GetLoginUserInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetLoginUserInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetLoginUserInfoRequest request) {
            super(request);
        } 

        @Override
        public GetLoginUserInfoRequest build() {
            return new GetLoginUserInfoRequest(this);
        } 

    } 

}
