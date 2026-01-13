// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link GetAccountConfigInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAccountConfigInfoRequest</p>
 */
public class GetAccountConfigInfoRequest extends Request {
    private GetAccountConfigInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountConfigInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountConfigInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountConfigInfoRequest request) {
            super(request);
        } 

        @Override
        public GetAccountConfigInfoRequest build() {
            return new GetAccountConfigInfoRequest(this);
        } 

    } 

}
