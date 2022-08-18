// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationProvisioningConfigResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningConfigResponse</p>
 */
public class GetApplicationProvisioningConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationProvisioningConfigResponseBody body;

    private GetApplicationProvisioningConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationProvisioningConfigResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetApplicationProvisioningConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationProvisioningConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationProvisioningConfigResponseBody body);

        @Override
        GetApplicationProvisioningConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationProvisioningConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationProvisioningConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationProvisioningConfigResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetApplicationProvisioningConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationProvisioningConfigResponse build() {
            return new GetApplicationProvisioningConfigResponse(this);
        } 

    } 

}
