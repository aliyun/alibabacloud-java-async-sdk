// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckTransitRouterServiceResponse} extends {@link TeaModel}
 *
 * <p>CheckTransitRouterServiceResponse</p>
 */
public class CheckTransitRouterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckTransitRouterServiceResponseBody body;

    private CheckTransitRouterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckTransitRouterServiceResponse create() {
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
    public CheckTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckTransitRouterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckTransitRouterServiceResponseBody body);

        @Override
        CheckTransitRouterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckTransitRouterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckTransitRouterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckTransitRouterServiceResponse response) {
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
        public Builder body(CheckTransitRouterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckTransitRouterServiceResponse build() {
            return new CheckTransitRouterServiceResponse(this);
        } 

    } 

}
