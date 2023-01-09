// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountMFAInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAccountMFAInfoRequest</p>
 */
public class GetAccountMFAInfoRequest extends Request {
    private GetAccountMFAInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountMFAInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountMFAInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountMFAInfoRequest request) {
            super(request);
        } 

        @Override
        public GetAccountMFAInfoRequest build() {
            return new GetAccountMFAInfoRequest(this);
        } 

    } 

}
