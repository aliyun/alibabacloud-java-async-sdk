// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeKvstorePermissionResponse} extends {@link TeaModel}
 *
 * <p>InitializeKvstorePermissionResponse</p>
 */
public class InitializeKvstorePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeKvstorePermissionResponseBody body;

    private InitializeKvstorePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeKvstorePermissionResponse create() {
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
    public InitializeKvstorePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeKvstorePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeKvstorePermissionResponseBody body);

        @Override
        InitializeKvstorePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeKvstorePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeKvstorePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeKvstorePermissionResponse response) {
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
        public Builder body(InitializeKvstorePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeKvstorePermissionResponse build() {
            return new InitializeKvstorePermissionResponse(this);
        } 

    } 

}
