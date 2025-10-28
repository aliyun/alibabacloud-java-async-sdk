// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetServiceAccessRequest} extends {@link RequestModel}
 *
 * <p>GetServiceAccessRequest</p>
 */
public class GetServiceAccessRequest extends Request {
    private GetServiceAccessRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetServiceAccessRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetServiceAccessRequest request) {
            super(request);
        } 

        @Override
        public GetServiceAccessRequest build() {
            return new GetServiceAccessRequest(this);
        } 

    } 

}
