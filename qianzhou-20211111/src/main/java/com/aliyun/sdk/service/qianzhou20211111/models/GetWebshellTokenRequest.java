// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWebshellTokenRequest} extends {@link RequestModel}
 *
 * <p>GetWebshellTokenRequest</p>
 */
public class GetWebshellTokenRequest extends Request {
    private GetWebshellTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebshellTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetWebshellTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetWebshellTokenRequest request) {
            super(request);
        } 

        @Override
        public GetWebshellTokenRequest build() {
            return new GetWebshellTokenRequest(this);
        } 

    } 

}
