// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartServiceResponse} extends {@link TeaModel}
 *
 * <p>RestartServiceResponse</p>
 */
public class RestartServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartServiceResponseBody body;

    private RestartServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartServiceResponse create() {
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
    public RestartServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartServiceResponseBody body);

        @Override
        RestartServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartServiceResponse response) {
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
        public Builder body(RestartServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartServiceResponse build() {
            return new RestartServiceResponse(this);
        } 

    } 

}
