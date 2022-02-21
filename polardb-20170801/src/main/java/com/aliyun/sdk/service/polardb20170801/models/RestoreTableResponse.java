// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreTableResponse} extends {@link TeaModel}
 *
 * <p>RestoreTableResponse</p>
 */
public class RestoreTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreTableResponseBody body;

    private RestoreTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreTableResponse create() {
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
    public RestoreTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreTableResponseBody body);

        @Override
        RestoreTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreTableResponse response) {
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
        public Builder body(RestoreTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreTableResponse build() {
            return new RestoreTableResponse(this);
        } 

    } 

}
