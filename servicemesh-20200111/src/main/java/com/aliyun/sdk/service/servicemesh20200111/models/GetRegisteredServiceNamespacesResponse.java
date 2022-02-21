// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServiceNamespacesResponse} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceNamespacesResponse</p>
 */
public class GetRegisteredServiceNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegisteredServiceNamespacesResponseBody body;

    private GetRegisteredServiceNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegisteredServiceNamespacesResponse create() {
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
    public GetRegisteredServiceNamespacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegisteredServiceNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegisteredServiceNamespacesResponseBody body);

        @Override
        GetRegisteredServiceNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegisteredServiceNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegisteredServiceNamespacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegisteredServiceNamespacesResponse response) {
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
        public Builder body(GetRegisteredServiceNamespacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegisteredServiceNamespacesResponse build() {
            return new GetRegisteredServiceNamespacesResponse(this);
        } 

    } 

}
