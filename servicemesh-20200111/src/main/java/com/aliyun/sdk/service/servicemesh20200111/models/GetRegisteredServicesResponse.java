// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServicesResponse} extends {@link TeaModel}
 *
 * <p>GetRegisteredServicesResponse</p>
 */
public class GetRegisteredServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegisteredServicesResponseBody body;

    private GetRegisteredServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegisteredServicesResponse create() {
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
    public GetRegisteredServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegisteredServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegisteredServicesResponseBody body);

        @Override
        GetRegisteredServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegisteredServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegisteredServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegisteredServicesResponse response) {
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
        public Builder body(GetRegisteredServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegisteredServicesResponse build() {
            return new GetRegisteredServicesResponse(this);
        } 

    } 

}
