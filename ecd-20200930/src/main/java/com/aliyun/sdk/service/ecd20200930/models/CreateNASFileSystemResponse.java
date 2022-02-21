// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNASFileSystemResponse} extends {@link TeaModel}
 *
 * <p>CreateNASFileSystemResponse</p>
 */
public class CreateNASFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNASFileSystemResponseBody body;

    private CreateNASFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNASFileSystemResponse create() {
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
    public CreateNASFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNASFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNASFileSystemResponseBody body);

        @Override
        CreateNASFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNASFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNASFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNASFileSystemResponse response) {
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
        public Builder body(CreateNASFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNASFileSystemResponse build() {
            return new CreateNASFileSystemResponse(this);
        } 

    } 

}
