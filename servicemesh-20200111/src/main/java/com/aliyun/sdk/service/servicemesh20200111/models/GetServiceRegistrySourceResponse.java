// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceRegistrySourceResponse} extends {@link TeaModel}
 *
 * <p>GetServiceRegistrySourceResponse</p>
 */
public class GetServiceRegistrySourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceRegistrySourceResponseBody body;

    private GetServiceRegistrySourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceRegistrySourceResponse create() {
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
    public GetServiceRegistrySourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceRegistrySourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceRegistrySourceResponseBody body);

        @Override
        GetServiceRegistrySourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceRegistrySourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceRegistrySourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceRegistrySourceResponse response) {
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
        public Builder body(GetServiceRegistrySourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceRegistrySourceResponse build() {
            return new GetServiceRegistrySourceResponse(this);
        } 

    } 

}
