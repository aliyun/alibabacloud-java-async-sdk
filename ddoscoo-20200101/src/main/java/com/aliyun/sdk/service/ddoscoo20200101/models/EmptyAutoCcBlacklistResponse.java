// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EmptyAutoCcBlacklistResponse} extends {@link TeaModel}
 *
 * <p>EmptyAutoCcBlacklistResponse</p>
 */
public class EmptyAutoCcBlacklistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EmptyAutoCcBlacklistResponseBody body;

    private EmptyAutoCcBlacklistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EmptyAutoCcBlacklistResponse create() {
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
    public EmptyAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EmptyAutoCcBlacklistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EmptyAutoCcBlacklistResponseBody body);

        @Override
        EmptyAutoCcBlacklistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EmptyAutoCcBlacklistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EmptyAutoCcBlacklistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EmptyAutoCcBlacklistResponse response) {
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
        public Builder body(EmptyAutoCcBlacklistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EmptyAutoCcBlacklistResponse build() {
            return new EmptyAutoCcBlacklistResponse(this);
        } 

    } 

}
