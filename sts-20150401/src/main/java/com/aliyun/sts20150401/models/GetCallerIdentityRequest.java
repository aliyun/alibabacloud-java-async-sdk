// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallerIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetCallerIdentityRequest</p>
 */
public class GetCallerIdentityRequest extends Request {
    private GetCallerIdentityRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallerIdentityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCallerIdentityRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCallerIdentityRequest response) {
            super(response);
        } 

        @Override
        public GetCallerIdentityRequest build() {
            return new GetCallerIdentityRequest(this);
        } 

    } 

}
