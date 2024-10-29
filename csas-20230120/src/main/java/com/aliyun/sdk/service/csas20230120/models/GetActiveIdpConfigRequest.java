// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetActiveIdpConfigRequest} extends {@link RequestModel}
 *
 * <p>GetActiveIdpConfigRequest</p>
 */
public class GetActiveIdpConfigRequest extends Request {
    private GetActiveIdpConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActiveIdpConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetActiveIdpConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetActiveIdpConfigRequest request) {
            super(request);
        } 

        @Override
        public GetActiveIdpConfigRequest build() {
            return new GetActiveIdpConfigRequest(this);
        } 

    } 

}
