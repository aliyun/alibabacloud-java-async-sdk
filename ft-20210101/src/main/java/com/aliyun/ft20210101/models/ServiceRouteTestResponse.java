// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceRouteTestResponse} extends {@link TeaModel}
 *
 * <p>ServiceRouteTestResponse</p>
 */
public class ServiceRouteTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ServiceRouteTestResponseBody body;

    private ServiceRouteTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ServiceRouteTestResponse create() {
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
    public ServiceRouteTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ServiceRouteTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ServiceRouteTestResponseBody body);

        @Override
        ServiceRouteTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ServiceRouteTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ServiceRouteTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ServiceRouteTestResponse response) {
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
        public Builder body(ServiceRouteTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ServiceRouteTestResponse build() {
            return new ServiceRouteTestResponse(this);
        } 

    } 

}
