// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenApiGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenApiGatewayServiceRequest</p>
 */
public class OpenApiGatewayServiceRequest extends Request {
    private OpenApiGatewayServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiGatewayServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenApiGatewayServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenApiGatewayServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenApiGatewayServiceRequest build() {
            return new OpenApiGatewayServiceRequest(this);
        } 

    } 

}
