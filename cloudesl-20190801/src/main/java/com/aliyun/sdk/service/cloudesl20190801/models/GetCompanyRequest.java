// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompanyRequest} extends {@link RequestModel}
 *
 * <p>GetCompanyRequest</p>
 */
public class GetCompanyRequest extends Request {
    private GetCompanyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompanyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCompanyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCompanyRequest request) {
            super(request);
        } 

        @Override
        public GetCompanyRequest build() {
            return new GetCompanyRequest(this);
        } 

    } 

}
