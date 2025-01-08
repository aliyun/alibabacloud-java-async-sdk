// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetSlsServiceRequest} extends {@link RequestModel}
 *
 * <p>GetSlsServiceRequest</p>
 */
public class GetSlsServiceRequest extends Request {
    private GetSlsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSlsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSlsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSlsServiceRequest request) {
            super(request);
        } 

        @Override
        public GetSlsServiceRequest build() {
            return new GetSlsServiceRequest(this);
        } 

    } 

}
