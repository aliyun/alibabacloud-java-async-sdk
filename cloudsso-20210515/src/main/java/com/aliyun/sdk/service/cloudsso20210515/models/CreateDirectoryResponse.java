// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDirectoryResponse} extends {@link TeaModel}
 *
 * <p>CreateDirectoryResponse</p>
 */
public class CreateDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDirectoryResponseBody body;

    private CreateDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDirectoryResponse create() {
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
    public CreateDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDirectoryResponseBody body);

        @Override
        CreateDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDirectoryResponse response) {
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
        public Builder body(CreateDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDirectoryResponse build() {
            return new CreateDirectoryResponse(this);
        } 

    } 

}
