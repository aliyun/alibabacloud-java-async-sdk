// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenTransitRouterServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenTransitRouterServiceResponse</p>
 */
public class OpenTransitRouterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenTransitRouterServiceResponseBody body;

    private OpenTransitRouterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenTransitRouterServiceResponse create() {
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
    public OpenTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenTransitRouterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenTransitRouterServiceResponseBody body);

        @Override
        OpenTransitRouterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenTransitRouterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenTransitRouterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenTransitRouterServiceResponse response) {
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
        public Builder body(OpenTransitRouterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenTransitRouterServiceResponse build() {
            return new OpenTransitRouterServiceResponse(this);
        } 

    } 

}
