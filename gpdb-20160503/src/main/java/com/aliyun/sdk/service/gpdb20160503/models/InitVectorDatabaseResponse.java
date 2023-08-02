// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitVectorDatabaseResponse} extends {@link TeaModel}
 *
 * <p>InitVectorDatabaseResponse</p>
 */
public class InitVectorDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitVectorDatabaseResponseBody body;

    private InitVectorDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitVectorDatabaseResponse create() {
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
    public InitVectorDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitVectorDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitVectorDatabaseResponseBody body);

        @Override
        InitVectorDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitVectorDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitVectorDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitVectorDatabaseResponse response) {
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
        public Builder body(InitVectorDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitVectorDatabaseResponse build() {
            return new InitVectorDatabaseResponse(this);
        } 

    } 

}
