// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcFetchResponse} extends {@link TeaModel}
 *
 * <p>UserGcFetchResponse</p>
 */
public class UserGcFetchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UserGcFetchResponseBody body;

    private UserGcFetchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UserGcFetchResponse create() {
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
    public UserGcFetchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UserGcFetchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UserGcFetchResponseBody body);

        @Override
        UserGcFetchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UserGcFetchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UserGcFetchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UserGcFetchResponse response) {
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
        public Builder body(UserGcFetchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UserGcFetchResponse build() {
            return new UserGcFetchResponse(this);
        } 

    } 

}
