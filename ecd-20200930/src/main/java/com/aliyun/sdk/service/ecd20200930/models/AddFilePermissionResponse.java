// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFilePermissionResponse} extends {@link TeaModel}
 *
 * <p>AddFilePermissionResponse</p>
 */
public class AddFilePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFilePermissionResponseBody body;

    private AddFilePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFilePermissionResponse create() {
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
    public AddFilePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFilePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFilePermissionResponseBody body);

        @Override
        AddFilePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFilePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFilePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFilePermissionResponse response) {
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
        public Builder body(AddFilePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFilePermissionResponse build() {
            return new AddFilePermissionResponse(this);
        } 

    } 

}
