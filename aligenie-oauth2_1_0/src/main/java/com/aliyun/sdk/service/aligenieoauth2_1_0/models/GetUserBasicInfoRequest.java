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
 * {@link GetUserBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserBasicInfoRequest</p>
 */
public class GetUserBasicInfoRequest extends Request {
    private GetUserBasicInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserBasicInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUserBasicInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUserBasicInfoRequest request) {
            super(request);
        } 

        @Override
        public GetUserBasicInfoRequest build() {
            return new GetUserBasicInfoRequest(this);
        } 

    } 

}
