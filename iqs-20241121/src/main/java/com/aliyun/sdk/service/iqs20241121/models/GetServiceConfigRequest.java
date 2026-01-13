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
 * {@link GetServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetServiceConfigRequest</p>
 */
public class GetServiceConfigRequest extends Request {
    private GetServiceConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetServiceConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetServiceConfigRequest request) {
            super(request);
        } 

        @Override
        public GetServiceConfigRequest build() {
            return new GetServiceConfigRequest(this);
        } 

    } 

}
