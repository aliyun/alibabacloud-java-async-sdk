// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeNodeCountResponse} extends {@link TeaModel}
 *
 * <p>ResizeNodeCountResponse</p>
 */
public class ResizeNodeCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeNodeCountResponseBody body;

    private ResizeNodeCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeNodeCountResponse create() {
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
    public ResizeNodeCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeNodeCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeNodeCountResponseBody body);

        @Override
        ResizeNodeCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeNodeCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeNodeCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeNodeCountResponse response) {
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
        public Builder body(ResizeNodeCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeNodeCountResponse build() {
            return new ResizeNodeCountResponse(this);
        } 

    } 

}
