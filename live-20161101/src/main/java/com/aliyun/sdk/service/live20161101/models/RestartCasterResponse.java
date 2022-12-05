// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartCasterResponse} extends {@link TeaModel}
 *
 * <p>RestartCasterResponse</p>
 */
public class RestartCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartCasterResponseBody body;

    private RestartCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartCasterResponse create() {
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
    public RestartCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartCasterResponseBody body);

        @Override
        RestartCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartCasterResponse response) {
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
        public Builder body(RestartCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartCasterResponse build() {
            return new RestartCasterResponse(this);
        } 

    } 

}
