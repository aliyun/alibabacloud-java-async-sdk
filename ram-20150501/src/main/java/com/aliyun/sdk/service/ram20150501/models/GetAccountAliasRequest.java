// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountAliasRequest} extends {@link RequestModel}
 *
 * <p>GetAccountAliasRequest</p>
 */
public class GetAccountAliasRequest extends Request {
    private GetAccountAliasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountAliasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountAliasRequest request) {
            super(request);
        } 

        @Override
        public GetAccountAliasRequest build() {
            return new GetAccountAliasRequest(this);
        } 

    } 

}
