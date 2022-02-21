// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartInstanceResponse</p>
 */
public class RestartInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartInstanceResponseBody body;

    private RestartInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartInstanceResponse create() {
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
    public RestartInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartInstanceResponseBody body);

        @Override
        RestartInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartInstanceResponse response) {
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
        public Builder body(RestartInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartInstanceResponse build() {
            return new RestartInstanceResponse(this);
        } 

    } 

}
