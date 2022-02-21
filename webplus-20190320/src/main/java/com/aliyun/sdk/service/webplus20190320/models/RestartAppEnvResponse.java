// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartAppEnvResponse} extends {@link TeaModel}
 *
 * <p>RestartAppEnvResponse</p>
 */
public class RestartAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartAppEnvResponseBody body;

    private RestartAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartAppEnvResponse create() {
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
    public RestartAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartAppEnvResponseBody body);

        @Override
        RestartAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartAppEnvResponse response) {
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
        public Builder body(RestartAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartAppEnvResponse build() {
            return new RestartAppEnvResponse(this);
        } 

    } 

}
