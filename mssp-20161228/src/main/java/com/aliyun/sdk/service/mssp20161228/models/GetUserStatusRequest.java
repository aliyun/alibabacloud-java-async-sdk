// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetUserStatusRequest} extends {@link RequestModel}
 *
 * <p>GetUserStatusRequest</p>
 */
public class GetUserStatusRequest extends Request {
    private GetUserStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUserStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUserStatusRequest request) {
            super(request);
        } 

        @Override
        public GetUserStatusRequest build() {
            return new GetUserStatusRequest(this);
        } 

    } 

}
