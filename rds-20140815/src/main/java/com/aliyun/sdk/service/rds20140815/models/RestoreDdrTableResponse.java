// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreDdrTableResponse} extends {@link TeaModel}
 *
 * <p>RestoreDdrTableResponse</p>
 */
public class RestoreDdrTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreDdrTableResponseBody body;

    private RestoreDdrTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreDdrTableResponse create() {
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
    public RestoreDdrTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreDdrTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreDdrTableResponseBody body);

        @Override
        RestoreDdrTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreDdrTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreDdrTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreDdrTableResponse response) {
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
        public Builder body(RestoreDdrTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreDdrTableResponse build() {
            return new RestoreDdrTableResponse(this);
        } 

    } 

}
