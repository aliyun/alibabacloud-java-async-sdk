// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFilePermissionResponse} extends {@link TeaModel}
 *
 * <p>RemoveFilePermissionResponse</p>
 */
public class RemoveFilePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveFilePermissionResponseBody body;

    private RemoveFilePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveFilePermissionResponse create() {
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
    public RemoveFilePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveFilePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveFilePermissionResponseBody body);

        @Override
        RemoveFilePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveFilePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveFilePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveFilePermissionResponse response) {
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
        public Builder body(RemoveFilePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveFilePermissionResponse build() {
            return new RemoveFilePermissionResponse(this);
        } 

    } 

}
