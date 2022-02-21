// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EmptySlsLogstoreResponse} extends {@link TeaModel}
 *
 * <p>EmptySlsLogstoreResponse</p>
 */
public class EmptySlsLogstoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EmptySlsLogstoreResponseBody body;

    private EmptySlsLogstoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EmptySlsLogstoreResponse create() {
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
    public EmptySlsLogstoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EmptySlsLogstoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EmptySlsLogstoreResponseBody body);

        @Override
        EmptySlsLogstoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EmptySlsLogstoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EmptySlsLogstoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EmptySlsLogstoreResponse response) {
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
        public Builder body(EmptySlsLogstoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EmptySlsLogstoreResponse build() {
            return new EmptySlsLogstoreResponse(this);
        } 

    } 

}
