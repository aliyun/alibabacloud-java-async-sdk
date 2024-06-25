// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOSSInfoForCardTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetOSSInfoForCardTemplateRequest</p>
 */
public class GetOSSInfoForCardTemplateRequest extends Request {
    private GetOSSInfoForCardTemplateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSInfoForCardTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOSSInfoForCardTemplateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOSSInfoForCardTemplateRequest request) {
            super(request);
        } 

        @Override
        public GetOSSInfoForCardTemplateRequest build() {
            return new GetOSSInfoForCardTemplateRequest(this);
        } 

    } 

}
