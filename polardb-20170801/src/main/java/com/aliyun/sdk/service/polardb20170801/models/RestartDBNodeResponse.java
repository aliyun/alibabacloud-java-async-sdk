// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDBNodeResponse} extends {@link TeaModel}
 *
 * <p>RestartDBNodeResponse</p>
 */
public class RestartDBNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDBNodeResponseBody body;

    private RestartDBNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDBNodeResponse create() {
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
    public RestartDBNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDBNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDBNodeResponseBody body);

        @Override
        RestartDBNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDBNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDBNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDBNodeResponse response) {
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
        public Builder body(RestartDBNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDBNodeResponse build() {
            return new RestartDBNodeResponse(this);
        } 

    } 

}
