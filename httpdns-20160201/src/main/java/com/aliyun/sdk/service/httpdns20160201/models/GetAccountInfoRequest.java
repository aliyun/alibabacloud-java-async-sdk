// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAccountInfoRequest</p>
 */
public class GetAccountInfoRequest extends Request {
    private GetAccountInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountInfoRequest request) {
            super(request);
        } 

        @Override
        public GetAccountInfoRequest build() {
            return new GetAccountInfoRequest(this);
        } 

    } 

}
