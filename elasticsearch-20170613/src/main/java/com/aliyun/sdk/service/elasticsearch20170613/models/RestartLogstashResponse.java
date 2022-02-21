// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartLogstashResponse} extends {@link TeaModel}
 *
 * <p>RestartLogstashResponse</p>
 */
public class RestartLogstashResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartLogstashResponseBody body;

    private RestartLogstashResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartLogstashResponse create() {
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
    public RestartLogstashResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartLogstashResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartLogstashResponseBody body);

        @Override
        RestartLogstashResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartLogstashResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartLogstashResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartLogstashResponse response) {
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
        public Builder body(RestartLogstashResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartLogstashResponse build() {
            return new RestartLogstashResponse(this);
        } 

    } 

}
