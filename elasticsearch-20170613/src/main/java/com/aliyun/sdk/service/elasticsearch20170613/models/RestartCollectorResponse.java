// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartCollectorResponse} extends {@link TeaModel}
 *
 * <p>RestartCollectorResponse</p>
 */
public class RestartCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartCollectorResponseBody body;

    private RestartCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartCollectorResponse create() {
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
    public RestartCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartCollectorResponseBody body);

        @Override
        RestartCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartCollectorResponse response) {
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
        public Builder body(RestartCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartCollectorResponse build() {
            return new RestartCollectorResponse(this);
        } 

    } 

}
