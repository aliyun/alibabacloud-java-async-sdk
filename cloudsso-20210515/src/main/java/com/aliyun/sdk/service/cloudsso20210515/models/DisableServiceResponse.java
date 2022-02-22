// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableServiceResponse} extends {@link TeaModel}
 *
 * <p>DisableServiceResponse</p>
 */
public class DisableServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableServiceResponseBody body;

    private DisableServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableServiceResponse create() {
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
    public DisableServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableServiceResponseBody body);

        @Override
        DisableServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableServiceResponse response) {
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
        public Builder body(DisableServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableServiceResponse build() {
            return new DisableServiceResponse(this);
        } 

    } 

}
