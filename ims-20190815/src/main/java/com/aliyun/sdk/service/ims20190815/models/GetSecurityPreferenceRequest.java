// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecurityPreferenceRequest} extends {@link RequestModel}
 *
 * <p>GetSecurityPreferenceRequest</p>
 */
public class GetSecurityPreferenceRequest extends Request {
    private GetSecurityPreferenceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityPreferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSecurityPreferenceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSecurityPreferenceRequest request) {
            super(request);
        } 

        @Override
        public GetSecurityPreferenceRequest build() {
            return new GetSecurityPreferenceRequest(this);
        } 

    } 

}
